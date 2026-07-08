package X;

import com.bytedance.android.livesdk.dataChannel.CommentOrMessageData;
import com.bytedance.android.livesdk.livesetting.game.TtliveGameLandscapeChatDefaultSwitcherSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0eEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1080800eEQ {
    public static boolean LIZ() {
        if (C1080810eER.LIZ) {
            return C1080810eER.LIZIZ;
        }
        if (TtliveGameLandscapeChatDefaultSwitcherSetting.isEnabled()) {
            return true;
        }
        return InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue();
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        Boolean bool;
        Boolean bool2;
        if (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0U4T.class)) == null || !bool.booleanValue() || (bool2 = (Boolean) dataChannel.gg0(CommentOrMessageData.class)) == null || !bool2.booleanValue()) {
            return false;
        }
        return true;
    }
}
