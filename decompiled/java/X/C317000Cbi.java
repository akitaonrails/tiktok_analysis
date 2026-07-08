package X;

import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;

/* JADX INFO: renamed from: X.0Cbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel", f = "VideoCaptionMentionSearchViewModel.kt", l = {125, 146}, m = "fetchSearchData")
public final class C317000Cbi extends AbstractC23140094w {
    public SearchUserSugResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VideoCaptionMentionSearchViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317000Cbi(VideoCaptionMentionSearchViewModel videoCaptionMentionSearchViewModel, InterfaceC1364105Vn<? super C317000Cbi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = videoCaptionMentionSearchViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("VideoCaptionMentionSearchViewModel@1e86.fetchSearchData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(false, null, this);
        C1C7U.LIZIZ("VideoCaptionMentionSearchViewModel@1e86.fetchSearchData$1");
        return objWQ2;
    }
}
