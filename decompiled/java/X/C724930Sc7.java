package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724930Sc7 extends C09AY implements Function0<C07XA> {
    public final /* synthetic */ AbstractC724890Sc3 LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C724930Sc7(AbstractC724890Sc3 abstractC724890Sc3, float f) {
        super(0);
        this.LL = abstractC724890Sc3;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C07XA invoke() {
        return new C07XA(this.LL.LLILLJJLI, this.LLILLJJLI);
    }
}
