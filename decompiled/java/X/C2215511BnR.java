package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.tts.oecverify.BdTuring;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1BnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215511BnR {
    public static final Map<EnumC2215611Bnb, InterfaceC909670ZmP> LIZ = new ConcurrentHashMap();

    public static InterfaceC909670ZmP LIZ(String str) {
        InterfaceC909670ZmP interfaceC909670ZmP;
        EnumC2215611Bnb.Companion.getClass();
        EnumC2215611Bnb enumC2215611Bnb = EnumC2215611Bnb.keyToTypeMap.get(str);
        if (enumC2215611Bnb == null) {
            enumC2215611Bnb = EnumC2215611Bnb.TYPE_NO_SUPPORT;
        }
        switch (C2215621Bnc.LIZ[enumC2215611Bnb.ordinal()]) {
            case 1:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1Aqs
                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZJ(Object obj, String str2, String str3) {
                        if (obj == null) {
                            return false;
                        }
                        String string = obj.toString();
                        int iHashCode = str3.hashCode();
                        if (iHashCode != -567445985) {
                            if (iHashCode != 61) {
                                if (iHashCode == 1084 && str3.equals("!=")) {
                                    return !Intrinsics.LJFF(string, str2);
                                }
                            } else if (str3.equals("=")) {
                                return Intrinsics.LJFF(string, str2);
                            }
                        } else if (str3.equals("contains")) {
                            return a0.LJJIIZI(string, str2, false);
                        }
                        return false;
                    }
                };
                break;
            case 2:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1BnO
                    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(214));

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return true;
                    }

                    public static InterfaceC2215491BnP LIZLLL() {
                        return (InterfaceC2215491BnP) LIZIZ.getValue();
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                        if (LIZLLL().hasCache(str2)) {
                            return;
                        }
                        try {
                            double[] dArr = (double[]) C051M.LIZIZ(double[].class, str2);
                            if (dArr != null) {
                                LIZLLL().LIZIZ(dArr, str2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZJ(Object obj, String str2, String str3) {
                        Double dLJII;
                        Double dLJII2;
                        Double dLJII3;
                        Double dLJII4;
                        Double dLJII5;
                        Double dLJII6;
                        Double dLJII7;
                        boolean z = false;
                        if (obj == null || (dLJII = C2327809Ae.LJII(obj.toString())) == null) {
                            return false;
                        }
                        double dDoubleValue = dLJII.doubleValue();
                        int iHashCode = str3.hashCode();
                        if (iHashCode != -1799013732) {
                            if (iHashCode != -216634360) {
                                if (iHashCode != 1084) {
                                    if (iHashCode != 1921) {
                                        if (iHashCode != 1983) {
                                            switch (iHashCode) {
                                                case 60:
                                                    if (!str3.equals("<") || (dLJII7 = C2327809Ae.LJII(str2)) == null || dDoubleValue >= dLJII7.doubleValue()) {
                                                        return false;
                                                    }
                                                    return true;
                                                case 61:
                                                    if (!str3.equals("=") || (dLJII6 = C2327809Ae.LJII(str2)) == null || dDoubleValue != dLJII6.doubleValue()) {
                                                        return false;
                                                    }
                                                    return true;
                                                case BaseNotice.CREATOR /* 62 */:
                                                    if (!str3.equals(">") || (dLJII5 = C2327809Ae.LJII(str2)) == null || dDoubleValue <= dLJII5.doubleValue()) {
                                                        return false;
                                                    }
                                                    return true;
                                            }
                                        }
                                        if (!str3.equals(">=") || (dLJII4 = C2327809Ae.LJII(str2)) == null || dDoubleValue < dLJII4.doubleValue()) {
                                            return false;
                                        }
                                        return true;
                                    }
                                    if (!str3.equals("<=") || (dLJII3 = C2327809Ae.LJII(str2)) == null || dDoubleValue > dLJII3.doubleValue()) {
                                        return false;
                                    }
                                    return true;
                                }
                                if (!str3.equals("!=") || (dLJII2 = C2327809Ae.LJII(str2)) == null) {
                                    return false;
                                }
                                if (dDoubleValue == dLJII2.doubleValue()) {
                                    z = true;
                                }
                                return !z;
                            }
                            if (str3.equals("between")) {
                                double[] dArr = (double[]) LIZLLL().LIZ(str2);
                                if (dArr == null) {
                                    try {
                                        dArr = (double[]) C051M.LIZIZ(double[].class, str2);
                                        if (dArr == null) {
                                            return false;
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        return false;
                                    }
                                }
                                LIZLLL().LIZJ(dArr, str2);
                                if (dArr.length != 2 || dDoubleValue < dArr[0] || dDoubleValue > dArr[1]) {
                                    return false;
                                }
                                return true;
                            }
                        } else if (str3.equals("not_between")) {
                            double[] dArr2 = (double[]) LIZLLL().LIZ(str2);
                            if (dArr2 == null) {
                                try {
                                    dArr2 = (double[]) C051M.LIZIZ(double[].class, str2);
                                    if (dArr2 == null) {
                                        return false;
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    return false;
                                }
                            }
                            LIZLLL().LIZJ(dArr2, str2);
                            if (dArr2.length != 2) {
                                return false;
                            }
                            if (dDoubleValue >= dArr2[0] && dDoubleValue <= dArr2[1]) {
                                return false;
                            }
                            return true;
                        }
                        return false;
                    }
                };
                break;
            case 3:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1Aqt
                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZJ(Object obj, String str2, String str3) {
                        if (obj == null) {
                            return false;
                        }
                        String string = obj.toString();
                        if (!Intrinsics.LJFF(str3, "=")) {
                            return false;
                        }
                        return Intrinsics.LJFF(string, str2);
                    }
                };
                break;
            case 4:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1BKq
                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZJ(Object obj, String str2, String str3) {
                        return Boolean.parseBoolean(str2);
                    }
                };
                break;
            case 5:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1BnS
                    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(215));

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return true;
                    }

                    public static final InterfaceC2215491BnP<List<String>> LIZLLL() {
                        return (InterfaceC2215491BnP) LIZIZ.getValue();
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                        if (LIZLLL().hasCache(str2)) {
                            return;
                        }
                        try {
                            List list = (List) C051M.LIZJ(str2, new TypeToken<List<? extends String>>() { // from class: X.1BnZ
                            }.getType());
                            if (list != null) {
                                LIZLLL().LIZIZ(list, str2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZJ(Object obj, String str2, String str3) {
                        boolean z = false;
                        if (obj == null) {
                            return false;
                        }
                        if (obj instanceof List) {
                            List list = (List) obj;
                            List<String> listLIZ = LIZLLL().LIZ(str2);
                            if (listLIZ == null) {
                                try {
                                    listLIZ = (List) C051M.LIZJ(str2, new TypeToken<List<? extends String>>() { // from class: X.04Xx
                                    }.getType());
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return false;
                                }
                            }
                            if (listLIZ == null) {
                                return false;
                            }
                            LIZLLL().LIZJ(listLIZ, str2);
                            int iHashCode = str3.hashCode();
                            if (iHashCode != -2140932223) {
                                if (iHashCode != -2140918714) {
                                    if (iHashCode != 1918401035 || !str3.equals("not_contains")) {
                                        return false;
                                    }
                                    if (!list.isEmpty()) {
                                        Iterator it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            if (C13LP.LJJJJ(it2.next(), listLIZ)) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    if (!str3.equals("contains_one") || list.isEmpty()) {
                                        return false;
                                    }
                                    Iterator it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        if (C13LP.LJJJJ(it3.next(), listLIZ)) {
                                            return true;
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                if (!str3.equals("contains_all")) {
                                    return false;
                                }
                                if (!listLIZ.isEmpty()) {
                                    Iterator<String> it4 = listLIZ.iterator();
                                    while (it4.hasNext()) {
                                        if (!list.contains(it4.next())) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            }
                            return !z;
                        }
                        String string = obj.toString();
                        List<String> listLIZ2 = LIZLLL().LIZ(str2);
                        if (listLIZ2 == null) {
                            try {
                                listLIZ2 = (List) C051M.LIZJ(str2, new TypeToken<List<? extends String>>() { // from class: X.1BnY
                                }.getType());
                                if (listLIZ2 != null) {
                                    LIZLLL().LIZJ(listLIZ2, str2);
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                listLIZ2 = null;
                            }
                        } else {
                            LIZLLL().LIZJ(listLIZ2, str2);
                        }
                        int iHashCode2 = str3.hashCode();
                        if (iHashCode2 != -2140918714) {
                            if (iHashCode2 != -877104304) {
                                if (iHashCode2 != 1918401035 || !str3.equals("not_contains") || listLIZ2 == null || listLIZ2.contains(string)) {
                                    return false;
                                }
                                return true;
                            }
                            if (!str3.equals("fuzzy_match") || listLIZ2 == null) {
                                return false;
                            }
                            for (String str4 : listLIZ2) {
                                if (a0.LJJIIZI(string, str4, false)) {
                                    if (str4 == null) {
                                        return false;
                                    }
                                    return true;
                                }
                            }
                            return false;
                        }
                        if (!str3.equals("contains_one") || listLIZ2 == null || !listLIZ2.contains(string)) {
                            return false;
                        }
                        return true;
                        return false;
                    }
                };
                break;
            case 6:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1BnT
                    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(213));

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return true;
                    }

                    public static InterfaceC2215491BnP LIZLLL() {
                        return (InterfaceC2215491BnP) LIZIZ.getValue();
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                        if (LIZLLL().hasCache(str2)) {
                            return;
                        }
                        try {
                            Set set = (Set) C051M.LIZJ(str2, new TypeToken<Set<? extends Double>>() { // from class: X.1BnX
                            }.getType());
                            if (set != null) {
                                LIZLLL().LIZIZ(set, str2);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3 A[PHI: r2
                      0x00a3: PHI (r2v7 java.util.Set) = (r2v1 java.util.Set), (r2v3 java.util.Set) binds: [B:39:0x0089, B:43:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC909670ZmP
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZJ(java.lang.Object r8, java.lang.String r9, java.lang.String r10) {
                        /*
                            Method dump skipped, instruction units count: 210
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2215531BnT.LIZJ(java.lang.Object, java.lang.String, java.lang.String):boolean");
                    }
                };
                break;
            case 7:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1BnQ
                    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(212));
                    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(211));

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return true;
                    }

                    public static InterfaceC2215491BnP LJ() {
                        return (InterfaceC2215491BnP) LIZJ.getValue();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Date] */
                    /* JADX WARN: Type inference failed for: r1v5 */
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.text.DateFormat, java.text.SimpleDateFormat] */
                    public static Long LIZLLL(String str2) {
                        ?? r1;
                        Locale locale = Locale.ROOT;
                        Long lValueOf = null;
                        try {
                            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).parse(str2);
                            if (date == null) {
                                return null;
                            }
                            ?? simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
                            simpleDateFormat.setTimeZone(TimeZone.getDefault());
                            simpleDateFormat.setLenient(false);
                            try {
                                Date date2 = simpleDateFormat.parse(str2);
                                if (date2 != null) {
                                    lValueOf = Long.valueOf(date2.getTime());
                                    return lValueOf;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                try {
                                    Object objClone = date.clone();
                                    if (objClone instanceof Date) {
                                        r1 = (Date) objClone;
                                    } else {
                                        r1 = lValueOf;
                                    }
                                    if (r1 == 0) {
                                        return lValueOf;
                                    }
                                    r1.setHours(date.getHours());
                                    r1.setMinutes(0);
                                    Date date3 = simpleDateFormat.parse(simpleDateFormat.format(r1));
                                    if (date3 != null) {
                                        lValueOf = Long.valueOf(date3.getTime());
                                        return lValueOf;
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                }
                            }
                            return lValueOf;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            return null;
                        }
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                        C01GW c01gw = LIZIZ;
                        if (((InterfaceC2215491BnP) c01gw.getValue()).hasCache(str2)) {
                            return;
                        }
                        System.currentTimeMillis();
                        List list = (List) ((InterfaceC2215491BnP) c01gw.getValue()).LIZ(str2);
                        if (list == null) {
                            try {
                                list = (List) C051M.LIZJ(str2, new TypeToken<List<? extends String>>() { // from class: X.1BnV
                                }.getType());
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                list = C13BV.INSTANCE;
                            }
                            if (list == null) {
                                return;
                            }
                        }
                        ((InterfaceC2215491BnP) LIZIZ.getValue()).LIZIZ(list, str2);
                        if (list != null && list.size() == 2) {
                            String str3 = (String) ListProtector.get(list, 0);
                            String str4 = (String) ListProtector.get(list, 1);
                            if (!LJ().hasCache(str3)) {
                                InterfaceC2215491BnP interfaceC2215491BnPLJ = LJ();
                                Long lLIZLLL = LIZLLL(str3);
                                if (lLIZLLL != null) {
                                    interfaceC2215491BnPLJ.LIZIZ(Long.valueOf(lLIZLLL.longValue()), str3);
                                } else {
                                    return;
                                }
                            }
                            if (!LJ().hasCache(str4)) {
                                InterfaceC2215491BnP interfaceC2215491BnPLJ2 = LJ();
                                Long lLIZLLL2 = LIZLLL(str4);
                                if (lLIZLLL2 != null) {
                                    interfaceC2215491BnPLJ2.LIZIZ(Long.valueOf(lLIZLLL2.longValue()), str4);
                                }
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0042 A[PHI: r5
                      0x0042: PHI (r5v6 java.util.List) = (r5v1 java.util.List), (r5v3 java.util.List) binds: [B:10:0x0028, B:14:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC909670ZmP
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZJ(java.lang.Object r11, java.lang.String r12, java.lang.String r13) {
                        /*
                            r10 = this;
                            r4 = 0
                            if (r11 != 0) goto L4
                            return r4
                        L4:
                            java.lang.String r0 = r11.toString()
                            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
                            if (r0 == 0) goto Lb3
                            long r8 = r0.longValue()
                            java.lang.String r0 = "between"
                            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r0)
                            if (r0 == 0) goto Lb3
                            X.01GW r0 = X.C2215501BnQ.LIZIZ
                            java.lang.Object r0 = r0.getValue()
                            X.1BnP r0 = (X.InterfaceC2215491BnP) r0
                            java.lang.Object r5 = r0.LIZ(r12)
                            java.util.List r5 = (java.util.List) r5
                            if (r5 != 0) goto L42
                            X.1BnU r0 = new X.1BnU     // Catch: java.lang.Exception -> L3a
                            r0.<init>()     // Catch: java.lang.Exception -> L3a
                            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> L3a
                            java.lang.Object r5 = X.C051M.LIZJ(r12, r0)     // Catch: java.lang.Exception -> L3a
                            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Exception -> L3a
                            goto L40
                        L3a:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                            X.13BV r5 = X.C13BV.INSTANCE
                        L40:
                            if (r5 == 0) goto Lb4
                        L42:
                            X.01GW r0 = X.C2215501BnQ.LIZIZ
                            java.lang.Object r0 = r0.getValue()
                            X.1BnP r0 = (X.InterfaceC2215491BnP) r0
                            r0.LIZJ(r5, r12)
                            r3 = 1
                            if (r5 == 0) goto Lb4
                            int r1 = r5.size()
                            r0 = 2
                            if (r1 != r0) goto Lb4
                            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r4)
                            java.lang.String r2 = (java.lang.String) r2
                            java.lang.Object r7 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r3)
                            java.lang.String r7 = (java.lang.String) r7
                            X.1BnP r0 = LJ()
                            java.lang.Object r0 = r0.LIZ(r2)
                            java.lang.Long r0 = (java.lang.Long) r0
                            if (r0 != 0) goto L75
                            java.lang.Long r0 = LIZLLL(r2)
                            if (r0 == 0) goto Lb3
                        L75:
                            long r5 = r0.longValue()
                            X.1BnP r1 = LJ()
                            java.lang.Long r0 = java.lang.Long.valueOf(r5)
                            r1.LIZJ(r0, r2)
                            X.1BnP r0 = LJ()
                            java.lang.Object r0 = r0.LIZ(r7)
                            java.lang.Long r0 = (java.lang.Long) r0
                            if (r0 != 0) goto L96
                            java.lang.Long r0 = LIZLLL(r7)
                            if (r0 == 0) goto Lb3
                        L96:
                            long r2 = r0.longValue()
                            X.1BnP r1 = LJ()
                            java.lang.Long r0 = java.lang.Long.valueOf(r2)
                            r1.LIZJ(r0, r7)
                            r0 = 1000(0x3e8, float:1.401E-42)
                            long r0 = (long) r0
                            long r5 = r5 / r0
                            long r2 = r2 / r0
                            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                            if (r0 > 0) goto Lb3
                            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                            if (r0 > 0) goto Lb3
                            r4 = 1
                        Lb3:
                            return r4
                        Lb4:
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C2215501BnQ.LIZJ(java.lang.Object, java.lang.String, java.lang.String):boolean");
                    }
                };
                break;
            case 8:
                interfaceC909670ZmP = (InterfaceC909670ZmP) ((ConcurrentHashMap) LIZ).get(enumC2215611Bnb);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                interfaceC909670ZmP = new InterfaceC909670ZmP() { // from class: X.1Bnd
                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final void LIZIZ(String str2) {
                    }

                    @Override // X.InterfaceC909670ZmP
                    public final boolean LIZJ(Object obj, String str2, String str3) {
                        return false;
                    }
                };
                break;
            default:
                throw new C1954807lC();
        }
        if (interfaceC909670ZmP == null) {
            return new InterfaceC909670ZmP() { // from class: X.1Bnd
                @Override // X.InterfaceC909670ZmP
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.InterfaceC909670ZmP
                public final void LIZIZ(String str2) {
                }

                @Override // X.InterfaceC909670ZmP
                public final boolean LIZJ(Object obj, String str2, String str3) {
                    return false;
                }
            };
        }
        return interfaceC909670ZmP;
    }
}
