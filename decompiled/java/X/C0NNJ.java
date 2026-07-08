package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;

/* JADX INFO: renamed from: X.0NNJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM", f = "AddYoursEntranceButtonVM.kt", l = {75}, m = "getRelatedAddYoursFromRcmdTopic")
public final class C0NNJ extends AbstractC23140094w {
    public C259800zU LL;
    public AddYoursRecommendation LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AddYoursEntranceButtonVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NNJ(AddYoursEntranceButtonVM addYoursEntranceButtonVM, InterfaceC1364105Vn<? super C0NNJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = addYoursEntranceButtonVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursEntranceButtonVM@3590.getRelatedAddYoursFromRcmdTopic$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZIL.vQ2(null, this);
        C1C7U.LIZIZ("AddYoursEntranceButtonVM@3590.getRelatedAddYoursFromRcmdTopic$1");
        return objVQ2;
    }
}
