package X;

import com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM;

/* JADX INFO: renamed from: X.0hs1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM", f = "MentionFavoriteVideoVM.kt", l = {98, 101}, m = "getFavoriteVideos")
public final class C1220670hs1 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MentionFavoriteVideoVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220670hs1(MentionFavoriteVideoVM mentionFavoriteVideoVM, InterfaceC1364105Vn<? super C1220670hs1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mentionFavoriteVideoVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionFavoriteVideoVM@5b84.getFavoriteVideos$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLL.AQ2(0L, this);
        C1C7U.LIZIZ("MentionFavoriteVideoVM@5b84.getFavoriteVideos$1");
        return objAQ2;
    }
}
