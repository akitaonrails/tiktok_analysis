package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem$RenderUi$3$5$2$1$1", f = "TakoContentPreviewAssem.kt", l = {403, 404}, m = "invokeSuspend")
public final class C1360705Uf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoContentPreviewItem LLILLJJLI;
    public final /* synthetic */ TakoContentPreviewAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360705Uf(TakoContentPreviewItem takoContentPreviewItem, TakoContentPreviewAssem takoContentPreviewAssem, InterfaceC1364105Vn<? super C1360705Uf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoContentPreviewItem;
        this.LLILLL = takoContentPreviewAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360705Uf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TakoContentPreviewItem takoContentPreviewItem = this.LLILLJJLI;
            if (takoContentPreviewItem instanceof TakoContentPreviewItem.Image) {
                InterfaceC1360805Ug interfaceC1360805UgLo = this.LLILLL.Lo();
                TakoContentPreviewItem.Image image = (TakoContentPreviewItem.Image) this.LLILLJJLI;
                this.LL = 1;
                if (interfaceC1360805UgLo.qf(image, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1$1");
                    return objLJFF;
                }
            } else if (takoContentPreviewItem instanceof TakoContentPreviewItem.Video) {
                InterfaceC1360805Ug interfaceC1360805UgLo2 = this.LLILLL.Lo();
                C1845270y7R c1845270y7R = ((TakoContentPreviewItem.Video) this.LLILLJJLI).video;
                this.LL = 2;
                if (interfaceC1360805UgLo2.zq(c1845270y7R) == objLJFF) {
                    C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1$1");
                    return objLJFF;
                }
            } else {
                throw new C1954807lC();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssem@36ab.RenderUi$3$5$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
