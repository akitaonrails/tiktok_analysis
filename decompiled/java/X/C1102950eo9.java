package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102950eo9 {
    public static final EnumC1102990eoD LIZ(DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel) || (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.FALSE))) {
            return EnumC1102990eoD.DEFAULT;
        }
        LiveToolbarIconStyleSetting liveToolbarIconStyleSetting = LiveToolbarIconStyleSetting.INSTANCE;
        if (liveToolbarIconStyleSetting.isGrayStyle()) {
            return EnumC1102990eoD.GRAY;
        }
        if (liveToolbarIconStyleSetting.isColorfulStyle()) {
            return EnumC1102990eoD.COLORFUL;
        }
        if (liveToolbarIconStyleSetting.isHighlightStyle()) {
            return EnumC1102990eoD.HIGHLIGHT;
        }
        return EnumC1102990eoD.DEFAULT;
    }

    public static final EnumC1102980eoC LIZIZ(DataChannel dataChannel) {
        if (C500260Jjc.LJIIZILJ(dataChannel) || (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.FALSE))) {
            return EnumC1102980eoC.DEFAULT;
        }
        LiveToolbarIconStyleSetting liveToolbarIconStyleSetting = LiveToolbarIconStyleSetting.INSTANCE;
        if (liveToolbarIconStyleSetting.isGrayStyle()) {
            return EnumC1102980eoC.GRAY;
        }
        if (liveToolbarIconStyleSetting.isColorfulStyle()) {
            return EnumC1102980eoC.COLORFUL;
        }
        if (liveToolbarIconStyleSetting.isHighlightStyle()) {
            return EnumC1102980eoC.HIGHLIGHT;
        }
        return EnumC1102980eoC.DEFAULT;
    }
}
