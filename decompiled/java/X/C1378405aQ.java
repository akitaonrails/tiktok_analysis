package X;

import Y.AgS283S0100000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS129S0201000_2;
import njp.a;

/* JADX INFO: renamed from: X.05aQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssemKt$TakoMultiImagePreviewImageContent$6$1$3$1$1", f = "TakoContentPreviewAssem.kt", l = {1237}, m = "invokeSuspend")
public final class C1378405aQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1378505aR LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C05UN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1378405aQ(C1378505aR c1378505aR, AbstractC1690640u62 abstractC1690640u62, int i, C05UN c05un, InterfaceC1364105Vn<? super C1378405aQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1378505aR;
        this.LLILLL = abstractC1690640u62;
        this.LLILZ = i;
        this.LLILZIL = c05un;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1378405aQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$6$1$3$1$1");
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS129S0201000_2(this.LLILLJJLI, this.LLILLL, this.LLILZ, 8));
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILZIL, 44);
            this.LL = 1;
            if (c095dLJIIIZ.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$6$1$3$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentPreviewAssemKt@2e97.TakoMultiImagePreviewImageContent$6$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
