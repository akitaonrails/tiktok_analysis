package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0xAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.data.MultipleTypingIndicatorBuffer", f = "MultipleTypingIndicatorBuffer.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "insertTypingIndicator")
public final class C1808560xAE extends AbstractC23140094w {
    public C1504405uk LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1808570xAF LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808560xAE(C1808570xAF c1808570xAF, InterfaceC1364105Vn<? super C1808560xAE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1808570xAF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultipleTypingIndicatorBuffer@9335.insertTypingIndicator$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("MultipleTypingIndicatorBuffer@9335.insertTypingIndicator$1");
        return objLJ;
    }
}
