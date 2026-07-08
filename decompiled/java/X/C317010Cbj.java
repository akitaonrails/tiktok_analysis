package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;

/* JADX INFO: renamed from: X.0Cbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel", f = "VideoCaptionMentionSearchViewModel.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 73}, m = "onRefresh")
public final class C317010Cbj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VideoCaptionMentionSearchViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317010Cbj(VideoCaptionMentionSearchViewModel videoCaptionMentionSearchViewModel, InterfaceC1364105Vn<? super C317010Cbj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = videoCaptionMentionSearchViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoCaptionMentionSearchViewModel@1e86.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("VideoCaptionMentionSearchViewModel@1e86.onRefresh$1");
        return objOnRefresh;
    }
}
