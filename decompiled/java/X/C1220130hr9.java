package X;

import com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM;

/* JADX INFO: renamed from: X.0hr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM", f = "MentionPostedAndLikeVideoVM.kt", l = {114, 117, 119, 122}, m = "getPostedOrLikeVideos")
public final class C1220130hr9 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MentionPostedAndLikeVideoVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220130hr9(MentionPostedAndLikeVideoVM mentionPostedAndLikeVideoVM, InterfaceC1364105Vn<? super C1220130hr9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mentionPostedAndLikeVideoVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionPostedAndLikeVideoVM@1150.getPostedOrLikeVideos$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILLL.AQ2(0, 0L, null, this);
        C1C7U.LIZIZ("MentionPostedAndLikeVideoVM@1150.getPostedOrLikeVideos$1");
        return objAQ2;
    }
}
