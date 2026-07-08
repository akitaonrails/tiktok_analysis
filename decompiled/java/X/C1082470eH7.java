package X;

import com.bytedance.android.live.setting.LiveMultiAndCoHostBarragePositionOptAnchorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082470eH7 {
    public static final float LIZ = C497740JfY.LIZIZ(125);

    public static boolean LIZ(DataChannel dataChannel) {
        C1082510eHB c1082510eHB = (C1082510eHB) dataChannel.gg0(C1082770eHb.class);
        if (c1082510eHB == null) {
            c1082510eHB = new C1082510eHB();
        }
        if (c1082510eHB.LIZJ <= LIZ) {
            return false;
        }
        int i = C1082550eHF.LIZ[c1082510eHB.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C500260Jjc.LJIIZILJ(dataChannel);
                if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() == 3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        C500260Jjc.LJIIZILJ(dataChannel);
        if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() == 3) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        C1082510eHB c1082510eHB = (C1082510eHB) dataChannel.gg0(C1082770eHb.class);
        if (c1082510eHB == null) {
            c1082510eHB = new C1082510eHB();
        }
        if (c1082510eHB.LIZJ <= LIZ) {
            return false;
        }
        int i = C1082550eHF.LIZ[c1082510eHB.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C500260Jjc.LJIIZILJ(dataChannel);
                if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        C500260Jjc.LJIIZILJ(dataChannel);
        if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(DataChannel dataChannel) {
        C1082510eHB c1082510eHB = (C1082510eHB) dataChannel.gg0(C1082770eHb.class);
        if (c1082510eHB == null) {
            c1082510eHB = new C1082510eHB();
        }
        if (c1082510eHB.LIZJ <= LIZ) {
            return false;
        }
        int i = C1082550eHF.LIZ[c1082510eHB.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C500260Jjc.LJIIZILJ(dataChannel);
                if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() == 1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        C500260Jjc.LJIIZILJ(dataChannel);
        if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(DataChannel dataChannel) {
        C1082510eHB c1082510eHB = (C1082510eHB) dataChannel.gg0(C1082770eHb.class);
        if (c1082510eHB == null) {
            c1082510eHB = new C1082510eHB();
        }
        if (c1082510eHB.LIZJ <= LIZ) {
            return false;
        }
        int i = C1082550eHF.LIZ[c1082510eHB.LIZIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C500260Jjc.LJIIZILJ(dataChannel);
                if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() > 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        C500260Jjc.LJIIZILJ(dataChannel);
        if (LiveMultiAndCoHostBarragePositionOptAnchorSetting.INSTANCE.getValue() > 0) {
            return true;
        }
        return false;
    }
}
