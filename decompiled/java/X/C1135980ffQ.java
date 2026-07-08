package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfig;
import com.bytedance.android.livesdk.livesetting.gift.GiftConfigParams;
import com.bytedance.android.livesdk.livesetting.gift.MsgStair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ffQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135980ffQ {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(5));
    public static final AFwS254S0000000_17 LIZIZ = AFwS254S0000000_17.get$arr$(24);

    public static GiftConfigParams LIZLLL() {
        return (GiftConfigParams) LIZ.getValue();
    }

    public static boolean LJIIJ() {
        return LIZLLL()._enableConfig;
    }

    public static String LIZIZ(EnumC1136630fgT enumC1136630fgT) {
        int i = C1136710fgb.LIZ[enumC1136630fgT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL()._otherSide._trayComboConfig._comboType;
                }
                throw new C1954807lC();
            }
            return LIZLLL()._anchorSide._trayComboConfig._comboType;
        }
        return LIZLLL()._selfSide._trayComboConfig._comboType;
    }

    public static List LJ(EnumC1136630fgT enumC1136630fgT) {
        int i = C1136710fgb.LIZ[enumC1136630fgT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL()._otherSide._trayComboConfig._jumpInterval;
                }
                throw new C1954807lC();
            }
            return LIZLLL()._anchorSide._trayComboConfig._jumpInterval;
        }
        return LIZLLL()._selfSide._trayComboConfig._jumpInterval;
    }

    public static int LIZ(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            MsgStair msgStair = (MsgStair) ListProtector.get(list, i3);
            int i4 = msgStair._minMsgCount;
            if (i >= i4 && i <= msgStair._maxMsgCount) {
                return i3;
            }
            if (i < i4) {
                size = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return i2 - 1;
    }

    public static GiftConfig LIZJ(boolean z, boolean z2) {
        EnumC1136630fgT enumC1136630fgT;
        if (z) {
            enumC1136630fgT = EnumC1136630fgT.SELF;
        } else if (z2) {
            enumC1136630fgT = EnumC1136630fgT.ANCHOR;
        } else {
            enumC1136630fgT = EnumC1136630fgT.OTHER;
        }
        int i = C1136710fgb.LIZ[enumC1136630fgT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return LIZLLL()._otherSide;
                }
                throw new C1954807lC();
            }
            return LIZLLL()._anchorSide;
        }
        return LIZLLL()._selfSide;
    }

    public static long LJFF(boolean z, boolean z2) {
        if (LJIIJ()) {
            return LIZJ(z, z2)._receiveMsgConfig.delayEnqueueSec;
        }
        return 0L;
    }

    public static EnumC994350byz LJI(boolean z, boolean z2) {
        EnumC1136630fgT enumC1136630fgT;
        if (LJIIJ()) {
            if (u.LJIJI(LIZJ(z, z2)._msgEnqueueConfig.sortType, "time", true)) {
                return EnumC994350byz.TIME;
            }
            return EnumC994350byz.VALUE;
        }
        if (z) {
            enumC1136630fgT = EnumC1136630fgT.SELF;
        } else if (z2) {
            enumC1136630fgT = EnumC1136630fgT.ANCHOR;
        } else {
            enumC1136630fgT = EnumC1136630fgT.OTHER;
        }
        int i = C1136710fgb.LIZ[enumC1136630fgT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC994350byz.VALUE;
                }
                throw new C1954807lC();
            }
            return EnumC994350byz.VALUE;
        }
        return EnumC994350byz.TIME;
    }

    public static int LJII(int i, boolean z, boolean z2) {
        Object obj;
        int iIntValue = 400;
        if (!LJIIJ()) {
            return 400;
        }
        List<Integer> list = LIZJ(z, z2)._trayComboConfig._animationDuration;
        int iLIZ = LIZ(i, (List) LIZIZ.invoke(Boolean.valueOf(z)));
        if (iLIZ >= 0) {
            if (iLIZ < list.size()) {
                obj = ListProtector.get(list, iLIZ);
            } else {
                obj = 400;
            }
            iIntValue = ((Number) obj).intValue();
        }
        return C1147010fxD.LIZ(z, i, iIntValue, z2, false);
    }

    public static int LJIIIIZZ(int i, boolean z, boolean z2) {
        Object obj;
        int iIntValue = 400;
        if (!LJIIJ()) {
            return 400;
        }
        List<Integer> list = LIZJ(z, z2)._trayDismissConfig._animationDuration;
        int iLIZ = LIZ(i, (List) LIZIZ.invoke(Boolean.valueOf(z)));
        if (iLIZ >= 0) {
            if (iLIZ < list.size()) {
                obj = ListProtector.get(list, iLIZ);
            } else {
                obj = 400;
            }
            iIntValue = ((Number) obj).intValue();
        }
        return C1147010fxD.LIZ(z, i, iIntValue, z2, true);
    }

    public static int LJIIIZ(int i, boolean z, boolean z2) {
        Object objValueOf;
        boolean zLJIIJ = LJIIJ();
        int iIntValue = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        if (!zLJIIJ) {
            return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        List<Integer> list = LIZJ(z, z2)._trayShowConfig.animationDuration;
        int iLIZ = LIZ(i, (List) LIZIZ.invoke(Boolean.valueOf(z)));
        if (iLIZ >= 0) {
            if (iLIZ < list.size()) {
                objValueOf = ListProtector.get(list, iLIZ);
            } else {
                objValueOf = Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
            iIntValue = ((Number) objValueOf).intValue();
        }
        return C1147010fxD.LIZ(z, i, iIntValue, z2, false);
    }
}
