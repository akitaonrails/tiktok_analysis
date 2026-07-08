package X;

import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;

/* JADX INFO: renamed from: X.0FSU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo", f = "AddYoursStickerTopicRepo.kt", l = {237}, m = "requestRecommendTopics-0E7RQCE")
public final class C0FSU extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AddYoursStickerTopicRepo LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FSU(AddYoursStickerTopicRepo addYoursStickerTopicRepo, InterfaceC1364105Vn<? super C0FSU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = addYoursStickerTopicRepo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopics$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(0, null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopics$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("AddYoursStickerTopicRepo@822c.requestRecommendTopics$1");
        return c189200o6M1boximpl;
    }
}
