package X;

import com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0HB8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.aireply.LiveAIReplySettingFragment", f = "LiveAIReplySettingFragment.kt", l = {187}, m = "tryRefreshCommentReplies")
public final class C0HB8 extends AbstractC23140094w {
    public DataChannel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveAIReplySettingFragment LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HB8(LiveAIReplySettingFragment liveAIReplySettingFragment, InterfaceC1364105Vn<? super C0HB8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = liveAIReplySettingFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveAIReplySettingFragment@e534.tryRefreshCommentReplies$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objZS = this.LLILLL.zS(this);
        C1C7U.LIZIZ("LiveAIReplySettingFragment@e534.tryRefreshCommentReplies$1");
        return objZS;
    }
}
