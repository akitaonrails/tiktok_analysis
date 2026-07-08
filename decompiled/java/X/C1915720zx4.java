package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler;
import com.ss.android.ugc.aweme.pns.consent.core.network.ConsentEntityWithRecord;
import com.ss.android.ugc.aweme.pns.consent.core.network.FetchConsentResponse;
import com.ss.android.ugc.aweme.pns.consent.core.network.LightConsentRecord;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS111S1200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915720zx4 {
    public static volatile boolean LIZIZ;
    public static C1915700zx2 LIZJ;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C1915720zx4 LIZ = new C1915720zx4();
    public static final CopyOnWriteArrayList<IPNSConsentHandler> LIZLLL = new CopyOnWriteArrayList<>();
    public static final HashSet<InterfaceC1915870zxJ> LJ = new HashSet<>();
    public static final AtomicBoolean LJFF = new AtomicBoolean(true);
    public static ConcurrentHashMap<String, ConsentEntityWithRecord> LJI = new ConcurrentHashMap<>();

    static {
        new ConcurrentHashMap();
        LJII = C452501pT.LIZIZ(new C1915850zxH());
        LJIIIIZZ = C452501pT.LIZIZ(new C1915860zxI());
        LJIIIZ = C452501pT.LIZIZ(new C1915690zx1());
        LJIIJ = C452501pT.LIZIZ(new C1915770zx9());
    }

    public static ConcurrentHashMap LJFF() {
        List<ConsentEntityWithRecord> arrayList;
        if (LJFF.getAndSet(false)) {
            ConcurrentHashMap<String, ConsentEntityWithRecord> concurrentHashMap = new ConcurrentHashMap<>();
            String string = ((InterfaceC1519050pdH) ((C1916020zxY) LJIIIIZZ.getValue()).LIZ.getValue()).getString("CACHED_CONSENT_RECORDS_V2");
            if (string.length() == 0) {
                arrayList = new ArrayList();
            } else {
                try {
                    arrayList = ((FetchConsentResponse) new Gson().LJII(string, FetchConsentResponse.class)).entities;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList = new ArrayList();
                }
            }
            for (ConsentEntityWithRecord consentEntityWithRecord : arrayList) {
                concurrentHashMap.put(consentEntityWithRecord.key, consentEntityWithRecord);
            }
            LJI = concurrentHashMap;
        }
        return LJI;
    }

    public static C1915890zxL LJI() {
        return (C1915890zxL) LJII.getValue();
    }

    public static IPNSConsentHandler LJ(String str) {
        for (IPNSConsentHandler iPNSConsentHandler : LIZLLL) {
            if (iPNSConsentHandler.LIZIZ(str)) {
                return iPNSConsentHandler;
            }
        }
        return null;
    }

    public static void LJIIIZ(List list) {
        LightConsentRecord lightConsentRecord;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1876860ywO c1876860ywO = (C1876860ywO) it2.next();
            if (LJFF().containsKey(c1876860ywO.LIZ)) {
                ConsentEntityWithRecord consentEntityWithRecord = (ConsentEntityWithRecord) LJFF().get(c1876860ywO.LIZ);
                if (consentEntityWithRecord != null && (lightConsentRecord = consentEntityWithRecord.record) != null) {
                    lightConsentRecord.status = c1876860ywO.LIZIZ.toString();
                    lightConsentRecord.flow = c1876860ywO.LIZJ;
                    lightConsentRecord.collectionPointId = c1876860ywO.LIZLLL;
                }
            } else {
                ConcurrentHashMap concurrentHashMapLJFF = LJFF();
                String str = c1876860ywO.LIZ;
                concurrentHashMapLJFF.put(str, new ConsentEntityWithRecord(0, "", str, new LightConsentRecord(c1876860ywO.LIZJ, "ANDROID", System.currentTimeMillis(), c1876860ywO.LIZIZ.toString(), c1876860ywO.LIZLLL, ""), Boolean.TRUE));
            }
        }
        LJII(C13LP.LLIIII(LJFF().values()), list, false);
    }

    public final void LIZJ(List<ConsentEntityWithRecord> list) {
        if (list.isEmpty()) {
            return;
        }
        C1915700zx2 c1915700zx2 = LIZJ;
        if (c1915700zx2 == null) {
            c1915700zx2 = null;
        }
        if (!c1915700zx2.LIZJ) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (ConsentEntityWithRecord consentEntityWithRecord : list) {
            String str = consentEntityWithRecord.key;
            IPNSConsentHandler iPNSConsentHandlerLJ = LJ(str);
            if (iPNSConsentHandlerLJ != null) {
                C1876770ywF c1876770ywF = EnumC1876780ywG.Companion;
                String str2 = consentEntityWithRecord.record.status;
                c1876770ywF.getClass();
                EnumC1876780ywG enumC1876780ywGLIZ = C1876770ywF.LIZ(str2);
                EnumC1876780ywG enumC1876780ywGLIZ2 = LIZ(str, null);
                if (iPNSConsentHandlerLJ.LIZJ(enumC1876780ywGLIZ2, enumC1876780ywGLIZ)) {
                    arrayList.add(new C1876860ywO(str, enumC1876780ywGLIZ2, LIZLLL(this, str), null, null, null, 120));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            C100C.LIZ.LIZIZ().LIZ(new AwS111S1200000_28(new InterfaceC1915880zxK() { // from class: X.0zxF
                @Override // X.InterfaceC1915880zxK
                public final void onFailure(int i, String str3) {
                }

                @Override // X.InterfaceC1915880zxK
                public final void LIZ(int i, String str3) {
                    C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
                    ArrayList<C1876860ywO> arrayList2 = arrayList;
                    c1915720zx4.getClass();
                    C1915720zx4.LJIIIZ(arrayList2);
                }
            }, "migrate_status", arrayList, 12));
            ((C1915660zwy) LJIIIZ.getValue()).LIZLLL("migrate_status", arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC1876780ywG LIZ(java.lang.String r2, java.util.Map r3) {
        /*
            java.util.concurrent.ConcurrentHashMap r0 = LJFF()
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.pns.consent.core.network.ConsentEntityWithRecord r0 = (com.ss.android.ugc.aweme.pns.consent.core.network.ConsentEntityWithRecord) r0
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.pns.consent.core.network.LightConsentRecord r0 = r0.record
            if (r0 == 0) goto L23
            java.lang.String r1 = r0.status
            if (r1 == 0) goto L23
            X.0ywF r0 = X.EnumC1876780ywG.Companion
            r0.getClass()
            X.0ywG r1 = X.C1876770ywF.LIZ(r1)
            if (r1 != 0) goto L25
            X.0ywG r1 = X.EnumC1876780ywG.UNSUPPORTED
            if (r1 != 0) goto L25
        L23:
            X.0ywG r1 = X.EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE
        L25:
            com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler r0 = LJ(r2)
            if (r0 != 0) goto L2c
            return r1
        L2c:
            X.0ywG r0 = r0.LIZ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1915720zx4.LIZ(java.lang.String, java.util.Map):X.0ywG");
    }

    public static String LIZLLL(C1915720zx4 c1915720zx4, String str) {
        String str2;
        LightConsentRecord lightConsentRecord;
        c1915720zx4.getClass();
        ConsentEntityWithRecord consentEntityWithRecord = (ConsentEntityWithRecord) LJFF().get(str);
        if (consentEntityWithRecord == null || (lightConsentRecord = consentEntityWithRecord.record) == null || (str2 = lightConsentRecord.flow) == null) {
            str2 = "";
        }
        IPNSConsentHandler iPNSConsentHandlerLJ = LJ(str);
        if (iPNSConsentHandlerLJ != null) {
            return iPNSConsentHandlerLJ.LJ(str2);
        }
        return str2;
    }

    public static void LJII(List list, final List list2, boolean z) {
        C1916020zxY c1916020zxY = (C1916020zxY) LJIIIIZZ.getValue();
        ((InterfaceC1519050pdH) c1916020zxY.LIZ.getValue()).putString("CACHED_CONSENT_RECORDS_V2", GsonProtectorUtils.toJson(new Gson(), new FetchConsentResponse(0, "", list)));
        if (z) {
            LJFF.set(true);
        }
        C15O7.LIZJ(new Callable() { // from class: X.0zx5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("PNSConsentClient@ddc1.notifyConsentRecordsUpdate$1");
                List<C1876860ywO> list3 = list2;
                synchronized (C1915720zx4.class) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (InterfaceC1915870zxJ interfaceC1915870zxJ : C1915720zx4.LJ) {
                            String strLIZIZ = interfaceC1915870zxJ.LIZIZ();
                            if (strLIZIZ != null) {
                                C1915700zx2 c1915700zx2 = C1915720zx4.LIZJ;
                                if ((c1915700zx2 != null ? c1915700zx2 : null).LJ && list3 != null) {
                                    if (!list3.isEmpty()) {
                                        Iterator<C1876860ywO> it2 = list3.iterator();
                                        while (it2.hasNext()) {
                                            if (Intrinsics.LJFF(it2.next().LIZ, strLIZIZ)) {
                                            }
                                        }
                                    }
                                }
                                C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
                                c1915720zx4.getClass();
                                EnumC1876780ywG enumC1876780ywGLIZ = C1915720zx4.LIZ(strLIZIZ, null);
                                String strLIZLLL = C1915720zx4.LIZLLL(c1915720zx4, strLIZIZ);
                                interfaceC1915870zxJ.LIZ(enumC1876780ywGLIZ);
                                arrayList.add(new C1876860ywO(strLIZIZ, enumC1876780ywGLIZ, strLIZLLL, null, null, null, 120));
                                break;
                            }
                            interfaceC1915870zxJ.LIZ(null);
                        }
                        if (!arrayList.isEmpty()) {
                            C1915720zx4.LIZ.getClass();
                            C1915890zxL c1915890zxLLJI = C1915720zx4.LJI();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("notify_consent_listener: ");
                            sbLIZ.append(arrayList);
                            C2188811AlT.LIZIZ(sbLIZ);
                            c1915890zxLLJI.getClass();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PNSConsentClient@ddc1.notifyConsentRecordsUpdate$1");
                return unit;
            }
        });
    }

    public static void LJIIIIZZ(InterfaceC1915880zxK interfaceC1915880zxK, String str, List list) {
        LightConsentRecord lightConsentRecord;
        Boolean boolValueOf;
        String lowerCase;
        String str2;
        if (!LIZIZ) {
            LJI().getClass();
            return;
        }
        if (list.isEmpty()) {
            if (interfaceC1915880zxK != null) {
                interfaceC1915880zxK.onFailure(-2, "records list is empty");
            }
            LJI().getClass();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C1876860ywO c1876860ywO = (C1876860ywO) obj;
            LIZ.getClass();
            ConsentEntityWithRecord consentEntityWithRecord = (ConsentEntityWithRecord) LJFF().get(c1876860ywO.LIZ);
            String lowerCase2 = null;
            if (consentEntityWithRecord != null) {
                lightConsentRecord = consentEntityWithRecord.record;
            } else {
                lightConsentRecord = null;
            }
            Function1<LightConsentRecord, Boolean> function1 = c1876860ywO.LJFF;
            if (function1 != null) {
                boolValueOf = Boolean.valueOf(function1.invoke(lightConsentRecord).booleanValue());
            } else {
                boolValueOf = null;
            }
            IPNSConsentHandler iPNSConsentHandlerLJ = LJ(c1876860ywO.LIZ);
            if (iPNSConsentHandlerLJ != null) {
                iPNSConsentHandlerLJ.LIZLLL();
            }
            if (boolValueOf != null) {
                if (boolValueOf.booleanValue()) {
                    arrayList.add(obj);
                }
            } else {
                String string = c1876860ywO.LIZIZ.toString();
                Locale locale = Locale.ROOT;
                String lowerCase3 = string.toLowerCase(locale);
                if (lightConsentRecord != null && (str2 = lightConsentRecord.status) != null) {
                    lowerCase = str2.toLowerCase(locale);
                } else {
                    lowerCase = null;
                }
                if (Intrinsics.LJFF(lowerCase3, lowerCase) && Intrinsics.LJFF(c1876860ywO.LIZJ.toLowerCase(locale), lightConsentRecord.flow.toLowerCase(locale))) {
                    String lowerCase4 = c1876860ywO.LIZLLL.toLowerCase(locale);
                    String str3 = lightConsentRecord.collectionPointId;
                    if (str3 != null) {
                        lowerCase2 = str3.toLowerCase(locale);
                    }
                    if (!Intrinsics.LJFF(lowerCase4, lowerCase2)) {
                    }
                }
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            if (interfaceC1915880zxK != null) {
                interfaceC1915880zxK.LIZ(0, "status already exists");
            }
            LJI().getClass();
        } else {
            LJIIIZ(arrayList);
            C100C.LIZ.LIZIZ().LIZ(new AwS111S1200000_28(interfaceC1915880zxK, str, arrayList, 12));
            ((C1915660zwy) LJIIIZ.getValue()).LIZLLL("update_status", list);
        }
    }

    public static void LJIIJ(final InterfaceC1915880zxK interfaceC1915880zxK, String str, List list) {
        LightConsentRecord lightConsentRecord;
        Boolean boolValueOf;
        String lowerCase;
        String str2;
        if (LIZIZ && LIZJ != null) {
            if (list.isEmpty()) {
                interfaceC1915880zxK.onFailure(-2, "records list is empty");
                LJI().getClass();
                return;
            }
            final ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C1876860ywO c1876860ywO = (C1876860ywO) obj;
                LIZ.getClass();
                ConsentEntityWithRecord consentEntityWithRecord = (ConsentEntityWithRecord) LJFF().get(c1876860ywO.LIZ);
                String lowerCase2 = null;
                if (consentEntityWithRecord != null) {
                    lightConsentRecord = consentEntityWithRecord.record;
                } else {
                    lightConsentRecord = null;
                }
                Function1<LightConsentRecord, Boolean> function1 = c1876860ywO.LJFF;
                if (function1 != null) {
                    boolValueOf = Boolean.valueOf(function1.invoke(lightConsentRecord).booleanValue());
                } else {
                    boolValueOf = null;
                }
                IPNSConsentHandler iPNSConsentHandlerLJ = LJ(c1876860ywO.LIZ);
                if (iPNSConsentHandlerLJ != null) {
                    iPNSConsentHandlerLJ.LIZLLL();
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        arrayList.add(obj);
                    }
                } else {
                    String string = c1876860ywO.LIZIZ.toString();
                    Locale locale = Locale.ROOT;
                    String lowerCase3 = string.toLowerCase(locale);
                    if (lightConsentRecord != null && (str2 = lightConsentRecord.status) != null) {
                        lowerCase = str2.toLowerCase(locale);
                    } else {
                        lowerCase = null;
                    }
                    if (Intrinsics.LJFF(lowerCase3, lowerCase) && Intrinsics.LJFF(c1876860ywO.LIZJ.toLowerCase(locale), lightConsentRecord.flow.toLowerCase(locale))) {
                        String lowerCase4 = c1876860ywO.LIZLLL.toLowerCase(locale);
                        String str3 = lightConsentRecord.collectionPointId;
                        if (str3 != null) {
                            lowerCase2 = str3.toLowerCase(locale);
                        }
                        if (!Intrinsics.LJFF(lowerCase4, lowerCase2)) {
                        }
                    }
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                interfaceC1915880zxK.LIZ(0, "status already exists");
                LJI().getClass();
                return;
            } else {
                C100C.LIZ.LIZIZ().LIZ(new AwS111S1200000_28(new InterfaceC1915880zxK() { // from class: X.0zxD
                    @Override // X.InterfaceC1915880zxK
                    public final void LIZ(int i, String str4) {
                        C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
                        List<C1876860ywO> list2 = arrayList;
                        c1915720zx4.getClass();
                        C1915720zx4.LJIIIZ(list2);
                        InterfaceC1915880zxK interfaceC1915880zxK2 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK2 != null) {
                            interfaceC1915880zxK2.LIZ(i, str4);
                        }
                    }

                    @Override // X.InterfaceC1915880zxK
                    public final void onFailure(int i, String str4) {
                        InterfaceC1915880zxK interfaceC1915880zxK2 = interfaceC1915880zxK;
                        if (interfaceC1915880zxK2 != null) {
                            interfaceC1915880zxK2.onFailure(i, str4);
                        }
                    }
                }, str, arrayList, 12));
                ((C1915660zwy) LJIIIZ.getValue()).LIZLLL("upload_then_update_status", list);
                return;
            }
        }
        LJI().getClass();
    }
}
