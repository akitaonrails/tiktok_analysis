package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ksN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336210ksN {
    public static final Keva LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static volatile boolean LJ;

    static {
        Keva repo = Keva.getRepo("storage_info");
        LIZ = repo;
        LIZIZ = C452501pT.LIZIZ(new C1336200ksM());
        LIZJ = C452501pT.LIZIZ(new C1336220ksO());
        LIZLLL = C452501pT.LIZIZ(new C1336230ksP());
        boolean z = false;
        if (C288570BSt.LIZ()) {
            z = repo.getBoolean("M2_STORAGE_CLEAN_EXECUTE", false);
        } else {
            repo.storeBoolean("M2_STORAGE_CLEAN_EXECUTE", false);
        }
        LJ = z;
    }

    public static final boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static EnumC1335310kqv LIZIZ() {
        C1335320kqw c1335320kqw = EnumC1335310kqv.Companion;
        Keva keva = LIZ;
        EnumC1335310kqv enumC1335310kqv = EnumC1335310kqv.COMMON;
        int i = keva.getInt("STORAGE_AVAILABLE_STATE", enumC1335310kqv.getValue());
        c1335320kqw.getClass();
        EnumC1335310kqv enumC1335310kqv2 = EnumC1335310kqv.MAP.get(Integer.valueOf(i));
        if (enumC1335310kqv2 == null) {
            enumC1335310kqv2 = enumC1335310kqv;
        }
        EnumC1335310kqv enumC1335310kqv3 = EnumC1335310kqv.EXTREME_LOW;
        if ((enumC1335310kqv2 == enumC1335310kqv3 && ((Boolean) C2250201D5m.LJ.getValue()).booleanValue()) || enumC1335310kqv2 == (enumC1335310kqv3 = EnumC1335310kqv.ULTRA_LOW)) {
            return enumC1335310kqv3;
        }
        EnumC1335310kqv enumC1335310kqv4 = EnumC1335310kqv.LOW;
        return enumC1335310kqv2 == enumC1335310kqv4 ? enumC1335310kqv4 : enumC1335310kqv;
    }

    public static final EnumC1335310kqv LIZLLL() {
        return (EnumC1335310kqv) LIZJ.getValue();
    }

    public static EnumC12948054w LIZJ() {
        C1505160pGs c1505160pGsLIZ = C1510700pPo.LIZ();
        EnumC12948054w enumC12948054w = EnumC12948054w.UNSENSITIVITY;
        int iLJFF = c1505160pGsLIZ.LJFF(enumC12948054w.getValue(), "storage_sensitivity_label_v1");
        EnumC12948054w.Companion.getClass();
        EnumC12948054w enumC12948054w2 = EnumC12948054w.MAP.get(Integer.valueOf(iLJFF));
        return enumC12948054w2 != null ? enumC12948054w2 : enumC12948054w;
    }

    public static void LJFF(EnumC1335310kqv enumC1335310kqv) {
        try {
            int i = C1335280kqs.LIZ[enumC1335310kqv.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Keva keva = LIZ;
                        if (System.currentTimeMillis() > keva.getLong("STORAGE_EXTREME_LOW_LAST_TIME", 0L) + (((long) ((Number) C2250201D5m.LJFF.getValue()).intValue()) * 86400000)) {
                            if (System.currentTimeMillis() > keva.getLong("STORAGE_ULTRA_LOW_LAST_TIME", 0L) + 1209600000) {
                                if (System.currentTimeMillis() > keva.getLong("STORAGE_LOW_LAST_TIME", 0L) + 1209600000) {
                                    keva.storeInt("STORAGE_AVAILABLE_STATE", enumC1335310kqv.getValue());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Keva keva2 = LIZ;
                    if (System.currentTimeMillis() > keva2.getLong("STORAGE_EXTREME_LOW_LAST_TIME", 0L) + (((long) ((Number) C2250201D5m.LJFF.getValue()).intValue()) * 86400000)) {
                        if (System.currentTimeMillis() > keva2.getLong("STORAGE_ULTRA_LOW_LAST_TIME", 0L) + 1209600000) {
                            keva2.storeInt("STORAGE_AVAILABLE_STATE", enumC1335310kqv.getValue());
                            keva2.storeLong("STORAGE_LOW_LAST_TIME", System.currentTimeMillis());
                            return;
                        }
                        return;
                    }
                    return;
                }
                Keva keva3 = LIZ;
                if (System.currentTimeMillis() > keva3.getLong("STORAGE_EXTREME_LOW_LAST_TIME", 0L) + (((long) ((Number) C2250201D5m.LJFF.getValue()).intValue()) * 86400000)) {
                    keva3.storeInt("STORAGE_AVAILABLE_STATE", enumC1335310kqv.getValue());
                    keva3.storeLong("STORAGE_ULTRA_LOW_LAST_TIME", System.currentTimeMillis());
                    return;
                }
                return;
            }
            Keva keva4 = LIZ;
            keva4.storeInt("STORAGE_AVAILABLE_STATE", enumC1335310kqv.getValue());
            keva4.storeLong("STORAGE_EXTREME_LOW_LAST_TIME", System.currentTimeMillis());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static final EnumC1335310kqv LJ(long j, EnumC2426409f4 enumC2426409f4) {
        if (j <= 419430400 || (LIZJ() == EnumC12948054w.SENSITIVITY_LAST_FOURTEEN_DAYS && enumC2426409f4 == EnumC2426409f4.ACTIVE_CLEAN_PAGE)) {
            C2250201D5m.LIZIZ();
            LJFF(EnumC1335310kqv.EXTREME_LOW);
        } else {
            if (LIZ()) {
                C2250201D5m.LIZIZ();
            }
            if (((Boolean) C1095304Qd.LIZ.getValue()).booleanValue() && j <= 1258291200) {
                LJFF(EnumC1335310kqv.ULTRA_LOW);
            } else if (j <= 2726297600L) {
                LJFF(EnumC1335310kqv.LOW);
            } else {
                LJFF(EnumC1335310kqv.COMMON);
            }
        }
        return LIZIZ();
    }
}
