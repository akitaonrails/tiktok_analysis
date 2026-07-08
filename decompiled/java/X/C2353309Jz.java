package X;

import Y.AgS284S0100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Jz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.image.ImageHeaderModule$observeAiCoverInfo$1", f = "ImageHeaderModule.kt", l = {1613}, m = "invokeSuspend")
public final class C2353309Jz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C12G3 LLILLJJLI;
    public final /* synthetic */ C214848196g LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2353309Jz(C12G3 c12g3, C214848196g c214848196g, InterfaceC1364105Vn<? super C2353309Jz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c12g3;
        this.LLILLL = c214848196g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2353309Jz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageHeaderModule@1844.observeAiCoverInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951LIZJ = this.LLILLJJLI.LIZJ();
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLL, 13);
            this.LL = 1;
            if (anonymousClass0951LIZJ.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("ImageHeaderModule@1844.observeAiCoverInfo$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
