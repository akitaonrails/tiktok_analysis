package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09OV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$addShortCutWithImage$1", f = "RedEnvelopeWidget.kt", l = {727}, m = "invokeSuspend")
public final class C09OV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RedEnvelopeWidget LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09OV(RedEnvelopeWidget redEnvelopeWidget, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, InterfaceC1364105Vn<? super C09OV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = redEnvelopeWidget;
        this.LLILLL = str;
        this.LLILZ = redEnvelopeInfoModel4FE;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09OV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RedEnvelopeWidget@65b2.addShortCutWithImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C09OW c09ow = new C09OW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c09ow) == objLJFF) {
                C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithImage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedEnvelopeWidget@65b2.addShortCutWithImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
