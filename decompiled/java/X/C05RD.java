package X;

import Y.AgS193S0200000_2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.05RD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$3$1$4$2", f = "TakoContentPreviewAssem.kt", l = {351, 360}, m = "emit")
public final class C05RD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS193S0200000_2<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05RD(AgS193S0200000_2<? super T> agS193S0200000_2, InterfaceC1364105Vn<? super C05RD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS193S0200000_2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$4$2$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$1 = this.LLILLJJLI.LIZ$1(false, this);
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$3$1$4$2$emit$1");
        return objLIZ$1;
    }
}
