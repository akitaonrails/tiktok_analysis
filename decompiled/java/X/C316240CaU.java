package X;

import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;

/* JADX INFO: renamed from: X.0CaU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.ui.chunks.VideoCaptionMentionRemoteSearchChunk", f = "VideoCaptionMentionRemoteSearchChunk.kt", l = {177, 198}, m = "fetchSearchData")
public final class C316240CaU extends AbstractC23140094w {
    public SearchUserSugResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C316990Cbh LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316240CaU(C316990Cbh c316990Cbh, InterfaceC1364105Vn<? super C316240CaU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c316990Cbh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoCaptionMentionRemoteSearchChunk@558a.fetchSearchData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJI = this.LLILLL.LJJI(false, null, this);
        C1C7U.LIZIZ("VideoCaptionMentionRemoteSearchChunk@558a.fetchSearchData$1");
        return objLJJI;
    }
}
