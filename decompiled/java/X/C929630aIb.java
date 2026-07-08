package X;

import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatUserInfoFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicGuestPanelUiOptSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C929630aIb extends C2217421BqW implements Function0<Unit> {
    public C929630aIb(Object obj) {
        super(0, obj, VoiceChatUserInfoFragment.class, "onCancelOutRoomApplyClick", "onCancelOutRoomApplyClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        VoiceChatUserInfoFragment voiceChatUserInfoFragment = (VoiceChatUserInfoFragment) this.receiver;
        C16FS c16fs = voiceChatUserInfoFragment.LLILZLL;
        if (c16fs != null) {
            c16fs.setEnabled(true);
        }
        C16F5 c16f5 = voiceChatUserInfoFragment.LLJLIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 8);
        }
        if (LinkMicGuestPanelUiOptSetting.isEnabled()) {
            voiceChatUserInfoFragment.gS();
        }
        return Unit.LIZ;
    }
}
