package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;

/* JADX INFO: renamed from: X.0H45, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem", f = "SearchVideoCommentAssem.kt", l = {341}, m = "setHotCommentMayAsync")
public final class C0H45 extends AbstractC23140094w {
    public TuxTextView LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ SearchVideoCommentAssem LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H45(SearchVideoCommentAssem searchVideoCommentAssem, InterfaceC1364105Vn<? super C0H45> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = searchVideoCommentAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchVideoCommentAssem@362c.setHotCommentMayAsync$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objDp = this.LLILZ.dp(null, null, this);
        C1C7U.LIZIZ("SearchVideoCommentAssem@362c.setHotCommentMayAsync$1");
        return objDp;
    }
}
