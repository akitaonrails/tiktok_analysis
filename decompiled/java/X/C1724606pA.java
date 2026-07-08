package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserSettings;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.UserSettingsUpdateBody;
import com.ss.android.ugc.aweme.im.contacts.impl.bytesync.IMContactInitTask;
import com.ss.android.ugc.aweme.im.contacts.impl.data.api.IMContactNetworkApi;
import com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactRelatedRequest;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMNetworkSaasApi;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1724606pA implements InterfaceC1725106pF {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1724606pA.class, "dispatchers", "getDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1725106pF
    public final void LIZ() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C808270VnF(null), 3);
    }

    @Override // X.InterfaceC1725106pF
    public final void LIZIZ() {
        boolean z;
        C1BG1.LIZ.getClass();
        C1BG1.LJJI();
        C0I0B c0i0b = C0I0B.LJFF;
        if (!((C1400340mXo) c0i0b.LIZ()).isLogin()) {
            LIZ();
            return;
        }
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (C21287318Sh.LIZ().contains("key_login_uid") && Intrinsics.LJFF(curUserId, C21287318Sh.LIZ().getString("key_login_uid", ""))) {
            z = false;
        } else {
            C21287318Sh.LIZ().storeString("key_login_uid", curUserId);
            z = true;
        }
        if (!z) {
            C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317205Dm(false, null), 3);
            return;
        }
        C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317405Do(0L, null), 3);
        C05LH.LIZ = -1L;
        C05LH.LIZIZ = -1L;
    }

    @Override // X.InterfaceC1725106pF
    public final void LIZJ() {
        C1BG1.LIZ.getClass();
        try {
            String string = C12925053z.LIZ().getString("key_feature_capability", null);
            if (string != null && string.length() != 0) {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{":"}, 0, 6);
                    Pair pair = new Pair(listLJJLIIIJILLIZJL2.get(0), Integer.valueOf(CastIntegerProtector.parseInt((String) listLJJLIIIJILLIZJL2.get(1))));
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                C1594306Mb.LIZ = linkedHashMap;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preload: loaded ");
                sbLIZ.append(linkedHashMap.size());
                sbLIZ.append(" entries from cache");
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getFeatureCapabilityMap error: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        C191862104e c191862104eLJ = C191871104n.LJ();
        C1725006pE c1725006pE = C1BG1.LJIJI;
        c191862104eLJ.getClass();
        C191862104e.LIZJ(c1725006pE);
        C11JF c11jf = C1BG1.LJIIZILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1BG1.LJIIZILJ = C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.05O1
            /* JADX WARN: Type inference failed for: r7v1, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                C1C7U.LIZ("IMContactManager@fb8a.init$1");
                boolean z2 = ((C606810Nr5) obj).LIZIZ;
                IMNetworkSaasApi.LIZ.getClass();
                IMNetworkSaasApi iMNetworkSaasApiLIZ = C05O2.LIZ();
                boolean z3 = false;
                if (iMNetworkSaasApiLIZ != null && iMNetworkSaasApiLIZ.isNetworkAvailable() && z2) {
                    z = true;
                } else {
                    z = false;
                }
                if (System.currentTimeMillis() - C1BG1.LJIILLIIL >= TimeUnit.DAYS.toMillis(1L) && z2) {
                    z3 = true;
                }
                C1BG1.LIZ.getClass();
                C259800zU c259800zU = new C259800zU();
                if (z) {
                    ConcurrentHashMap concurrentHashMapLJIILIIL = C1BG1.LJIILIIL();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMapLJIILIIL.entrySet()) {
                        if (!((Collection) entry.getValue()).isEmpty()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ?? r7 = (T) new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap2.size()));
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        r7.put(entry2.getKey(), new CopyOnWriteArraySet((CopyOnWriteArraySet) entry2.getValue()));
                    }
                    c259800zU.element = r7;
                    Iterator it3 = C1BG1.LJIILIIL().entrySet().iterator();
                    while (it3.hasNext()) {
                        ((CopyOnWriteArraySet) ((Map.Entry) it3.next()).getValue()).clear();
                    }
                }
                C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317505Dp(z, c259800zU, z3, null), 3);
                C1C7U.LIZIZ("IMContactManager@fb8a.init$1");
            }
        });
    }

    @Override // X.InterfaceC1725106pF
    public final EnumC899370ZPz LJI() {
        Integer num;
        Map<String, Integer> map = C1594306Mb.LIZ;
        int iIntValue = (map == null || (num = map.get("dm_message_interaction_status")) == null) ? 0 : num.intValue();
        EnumC899370ZPz.Companion.getClass();
        return C0ZQ0.LIZ(iIntValue);
    }

    @Override // X.InterfaceC1725106pF
    public final IMContactInitTask LJIIIZ() {
        return new IMContactInitTask();
    }

    @Override // X.InterfaceC1725106pF
    public final IMContactRelatedRequest LJIIJ() {
        return new IMContactRelatedRequest();
    }

    @Override // X.InterfaceC1725106pF
    public final List<IMUser> LJIJJ() {
        C1BG1.LIZ.getClass();
        return C808290VnH.LIZ().LJI();
    }

    @Override // X.InterfaceC1725106pF
    public final List<IMUser> LJIJJLI() {
        C1BG1.LIZ.getClass();
        return ((C2202371BHn) C808290VnH.LIZ()).LJFF(-1);
    }

    @Override // X.InterfaceC1725106pF
    public final List LJJI() {
        C1BG1.LIZ.getClass();
        return ((C2202371BHn) C808290VnH.LIZ()).LJFF(LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // X.InterfaceC1725106pF
    public final AnonymousClass0951 LJJII() {
        C1BG1.LIZ.getClass();
        return C1BG1.LJIIL;
    }

    @Override // X.InterfaceC1725106pF
    public final EnumC899370ZPz LJJIII() {
        Integer num;
        Map<String, Integer> map = C1594306Mb.LIZ;
        int iIntValue = (map == null || (num = map.get("message_request_banner_status")) == null) ? 0 : num.intValue();
        EnumC899370ZPz.Companion.getClass();
        return C0ZQ0.LIZ(iIntValue);
    }

    @Override // X.InterfaceC1725106pF
    public final int LIZLLL() {
        return C808290VnH.LIZ().LIZLLL();
    }

    @Override // X.InterfaceC1725106pF
    public final List<IMUser> LJ(String str) {
        C1BG1.LIZ.getClass();
        return C805480Vik.LIZIZ().LJ(str);
    }

    @Override // X.InterfaceC1725106pF
    public final void LJIIL(String str) {
        C1BG1.LIZ.getClass();
        C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1317705Dr(str, null), 3);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJIJ(InterfaceC1364105Vn<? super List<IMUserBaseInfo>> interfaceC1364105Vn) {
        C1BG1.LIZ.getClass();
        return C805480Vik.LIZIZ().LJIIIZ(interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1725106pF
    public final void LJIJI(IMUser iMUser) {
        if (iMUser != null) {
            C1BG1.LIZ.getClass();
            C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C2201801BFi(iMUser, null), 3);
        }
    }

    @Override // X.InterfaceC1725106pF
    public final String LJIL(IMUser iMUser) {
        int followStatus = iMUser.getFollowStatus();
        if (followStatus != 1 && followStatus != 2 && followStatus != 4) {
            if (iMUser.getFollowerStatus() == 1) {
                return "3";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return String.valueOf(iMUser.getFollowStatus());
    }

    @Override // X.InterfaceC1725106pF
    public final MAFIMUser LJJ(String str) {
        Long lLJIILIIL;
        if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
            return null;
        }
        long jLongValue = lLJIILIIL.longValue();
        C1BG1 c1bg1 = C1BG1.LIZ;
        Long lValueOf = Long.valueOf(jLongValue);
        c1bg1.getClass();
        if (lValueOf == null) {
            return null;
        }
        return C808290VnH.LIZ().LJ(lValueOf.longValue());
    }

    @Override // X.InterfaceC1725106pF
    public final MAFIMUser LJJIIJZLJL(String str) {
        Long lLJIILIIL;
        if (str == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) {
            return null;
        }
        long jLongValue = lLJIILIIL.longValue();
        C1BG1 c1bg1 = C1BG1.LIZ;
        Long lValueOf = Long.valueOf(jLongValue);
        c1bg1.getClass();
        if (lValueOf == null) {
            return null;
        }
        return C805480Vik.LIZIZ().LIZJ(lValueOf.longValue());
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJJIIZI(List list) {
        ArrayList arrayList;
        long jLongValue;
        C1BG1 c1bg1 = C1BG1.LIZ;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Long lLJIILIIL = C2095008Iq.LJIILIIL((String) it2.next());
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = 0;
                }
                arrayList.add(C2286608xc.LJFF(jLongValue));
            }
        } else {
            arrayList = null;
        }
        c1bg1.getClass();
        return C1BG1.LJIILL(arrayList);
    }

    @Override // X.InterfaceC1725106pF
    public final List<IMUser> LJFF(String str, boolean z) {
        C1BG1.LIZ.getClass();
        return C805480Vik.LIZIZ().LJFF(str, z);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJIIJJI(List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C1BG1.LJIIJ(C1BG1.LIZ, list, "live_anchor_share", false, false, false, false, null, interfaceC1364105Vn, 120);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJIILIIL(Long l, InterfaceC1364105Vn<? super IMUserBizInfo> interfaceC1364105Vn) {
        C1BG1.LIZ.getClass();
        return C1BG1.LJIILJJIL(l, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJIILJJIL(IMUserSettings iMUserSettings, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        IMContactNetworkApi.LIZ.getClass();
        return C1724906pD.LIZ().updateUserSettings(new UserSettingsUpdateBody(iMUserSettings), interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1725106pF
    public final void LJIILLIIL(Long l, boolean z) {
        C1BG1.LIZ.getClass();
        C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1724706pB(l, z, null), 3);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJIIZILJ(Long l, C1364600lcA c1364600lcA) {
        return C1BG1.LIZ.LJIILLIIL(l, c1364600lcA);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJJIFFI(List list, AbstractC23140094w abstractC23140094w) {
        C1BG1.LIZ.getClass();
        return ((C2202141BGq) C808280VnG.LIZ()).LJI(list, abstractC23140094w);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    @Override // X.InterfaceC1725106pF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIIJ(int r7, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.Double>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C06AE
            if (r0 == 0) goto L74
            r4 = r8
            X.06AE r4 = (X.C06AE) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L66
            if (r0 != r1) goto L7b
            X.C155000ia.LIZIZ(r3)
        L22:
            java.util.List r3 = (java.util.List) r3
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r3, r0)
            int r1 = X.C2097908Jt.LIZIZ(r0)
            r0 = 16
            if (r1 >= r0) goto L34
            r1 = 16
        L34:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r4 = r3.iterator()
        L3d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r3 = r4.next()
            X.06pC r3 = (X.C1724806pC) r3
            long r0 = r3.LIZ
            java.lang.String r2 = java.lang.String.valueOf(r0)
            double r0 = r3.LIZIZ
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r2, r1)
            java.lang.Object r1 = r0.getFirst()
            java.lang.Object r0 = r0.getSecond()
            r5.put(r1, r0)
            goto L3d
        L66:
            X.C155000ia.LIZIZ(r3)
            X.1BG1 r0 = X.C1BG1.LIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LJIIZILJ(r7, r4)
            if (r3 != r2) goto L22
            return r2
        L74:
            X.06AE r4 = new X.06AE
            r4.<init>(r6, r8)
            goto L12
        L7a:
            return r5
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1724606pA.LJJIIJ(int, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJJIIZ(long j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZJ = C1BG1.LIZ.LIZJ(j, interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1725106pF
    public final IMUser LJIILL(String str, String str2, boolean z) {
        Long lLJIILIIL;
        IMUser iMUserLJIIJ;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            C1BG1 c1bg1 = C1BG1.LIZ;
            Long lValueOf = Long.valueOf(jLongValue);
            Boolean boolValueOf = Boolean.valueOf(z);
            c1bg1.getClass();
            if (lValueOf != null) {
                lValueOf.longValue();
                if (lValueOf.longValue() > 0) {
                    iMUserLJIIJ = ((C2202371BHn) C808290VnH.LIZ()).LJIIJ(Long.valueOf(lValueOf.longValue()));
                    if (iMUserLJIIJ == null) {
                    }
                    return iMUserLJIIJ;
                }
                iMUserLJIIJ = null;
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    C23250099c.LIZLLL(C1BG1.LJFF, null, null, new C1583606Hy(lValueOf, str2, null), 3);
                }
                return iMUserLJIIJ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJIIIIZZ(int i, int i2, String str, List list, AbstractC23140094w abstractC23140094w) {
        C1BG1.LIZ.getClass();
        return C805480Vik.LIZIZ().LJIILJJIL(i, i2, str, list, abstractC23140094w);
    }

    @Override // X.InterfaceC1725106pF
    public final Object LJII(String str, List list, InterfaceC1364105Vn interfaceC1364105Vn, boolean z, boolean z2, boolean z3) {
        boolean zLJI = MethodIDManager.LJI(137207);
        Object objLJIIJ = C1BG1.LJIIJ(C1BG1.LIZ, list, str, true, z, z2, z3, null, interfaceC1364105Vn, 64);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLJIIJ;
    }
}
