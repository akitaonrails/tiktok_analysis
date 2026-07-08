package X;

import android.os.Message;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0fjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138340fjE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C1136560fgM c1136560fgM, Message message) {
        if (c1136560fgM != null && message != null) {
            if (message.arg2 == 2) {
                LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM.LJJII;
                if (stickerSDKExtra != null && stickerSDKExtra.enableReplay) {
                    if (!c1136560fgM.LJJIJL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isReplayOnFirstFrameEnable");
                        sbLIZ.append(", return false, currentMsgTemp.enableReplay = false");
                        C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("isReplayOnFirstFrameEnable");
                        sbLIZ2.append(", return true, currentMsgTemp.enableReplay = true");
                        C20441214yg.LJIIIZ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ2));
                        return true;
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("isReplayOnFirstFrameEnable");
                    sbLIZ3.append(", return false, curStickerSdkExtra = ");
                    sbLIZ3.append(stickerSDKExtra);
                    C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("canHandleEffectReplayMsg");
            sbLIZ4.append(" error,  msg.arg2 = ");
            sbLIZ4.append(message.arg2);
            sbLIZ4.append(", msg.obj = ");
            sbLIZ4.append(HandlerHook.getMessageObj(message.obj));
            C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ4));
            return false;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("canHandleEffectReplayMsg");
        sbLIZ5.append(",  currentMessage = ");
        sbLIZ5.append(c1136560fgM);
        sbLIZ5.append(", msg = ");
        sbLIZ5.append(message);
        C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ5));
        return false;
    }

    public static boolean LIZIZ(C1136560fgM c1136560fgM, C1136560fgM c1136560fgM2) {
        boolean z;
        boolean z2;
        if (c1136560fgM != null && c1136560fgM2 != null) {
            if (!c1136560fgM.LJJIJL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isReplayBeforeStartPlayEnable");
                sbLIZ.append(", return false, currentMsgTemp.enableReplay = false");
                C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
            LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM2.LJJII;
            LiveEffect.StickerSDKExtra stickerSDKExtra2 = c1136560fgM.LJJII;
            if (stickerSDKExtra2 != null && stickerSDKExtra != null) {
                if (c1136560fgM.LJFF == c1136560fgM2.LJFF) {
                    z = true;
                } else {
                    z = false;
                }
                if (stickerSDKExtra2.enableReplay && stickerSDKExtra.enableReplay) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z && z2 && C1136390fg5.LIZIZ(c1136560fgM2, c1136560fgM)) {
                    return true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("isReplayBeforeStartPlayEnable");
                sbLIZ2.append(", return false, isEffectIdSame = ");
                sbLIZ2.append(z);
                sbLIZ2.append(", isEffectEnableReplay=");
                sbLIZ2.append(z2);
                C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ2));
                return false;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("isReplayBeforeStartPlayEnable");
            sbLIZ3.append(", return false, curStickerSdkExtra = ");
            sbLIZ3.append(stickerSDKExtra2);
            sbLIZ3.append(", preStickerSdkExtra = ");
            sbLIZ3.append(stickerSDKExtra);
            C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ3));
            return false;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("isReplayBeforeStartPlayEnable");
        sbLIZ4.append(", return false, currentMsgTemp = ");
        sbLIZ4.append(c1136560fgM);
        sbLIZ4.append(", previousMsgTemp =");
        sbLIZ4.append(c1136560fgM2);
        C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ4));
        return false;
    }

    public static boolean LIZJ(C1136560fgM c1136560fgM, C1136560fgM c1136560fgM2) {
        boolean z;
        if (c1136560fgM != null && c1136560fgM2 != null) {
            if (!c1136560fgM.LJJIJLIJ) {
                C20441214yg.LJ("StickerGiftReplayHelper", "handleEndMessage, error currentMessage isReceivedSecondFrame is false");
                return false;
            }
            LiveEffect.StickerSDKExtra stickerSDKExtra = c1136560fgM.LJJII;
            if (stickerSDKExtra == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isReplayOnEndPlayEnable");
                sbLIZ.append(", return false, curStickerSdkExtra = ");
                sbLIZ.append(stickerSDKExtra);
                C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
            long j = c1136560fgM.LJFF;
            long j2 = c1136560fgM2.LJFF;
            if (j == j2) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = stickerSDKExtra.enableReplay;
            if (z && z2 && C1136390fg5.LIZIZ(c1136560fgM, c1136560fgM2)) {
                return true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isReplayOnEndPlayEnable");
            sbLIZ2.append(", return false, isEffectIdSame = ");
            sbLIZ2.append(z);
            sbLIZ2.append(", curEffectId = ");
            sbLIZ2.append(j);
            sbLIZ2.append(", nextEffectId = ");
            sbLIZ2.append(j2);
            sbLIZ2.append(", isEffectEnableReplay=");
            sbLIZ2.append(z2);
            C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("isReplayOnEndPlayEnable");
        sbLIZ3.append(", return false, currentMsgTemp = ");
        sbLIZ3.append(c1136560fgM);
        sbLIZ3.append(", nextMsgTemp =");
        sbLIZ3.append(c1136560fgM2);
        C20441214yg.LJ("StickerGiftReplayHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }
}
