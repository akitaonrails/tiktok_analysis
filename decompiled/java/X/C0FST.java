package X;

import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;

/* JADX INFO: renamed from: X.0FST, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo", f = "AddYoursStickerTopicRepo.kt", l = {269}, m = "requestRecommendTopicsByContent-gIAlu-s")
public final class C0FST extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AddYoursStickerTopicRepo LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FST(AddYoursStickerTopicRepo addYoursStickerTopicRepo, InterfaceC1364105Vn<? super C0FST> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = addYoursStickerTopicRepo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopicsByContent$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        if (objLJ == C099R.LJFF()) {
            C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopicsByContent$1");
            return objLJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJ);
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopicsByContent$1");
        return c189200o6M1boximpl;
    }
}
