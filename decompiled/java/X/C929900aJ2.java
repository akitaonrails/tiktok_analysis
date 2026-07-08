package X;

import com.bytedance.android.live.liveinteract.voicechat.main.link.guest.VoiceChatGuestUserInfoDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aJ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C929900aJ2 extends C2217421BqW implements Function1<EnumC929870aIz, Unit> {
    public C929900aJ2(Object obj) {
        super(1, obj, VoiceChatGuestUserInfoDialog.class, "switchPage", "switchPage(Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiLiveDialogPage;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC929870aIz enumC929870aIz) {
        ((VoiceChatGuestUserInfoDialog) this.receiver).NR(enumC929870aIz);
        return Unit.LIZ;
    }
}
