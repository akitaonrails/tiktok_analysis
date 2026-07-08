package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.chain.DecorationSmbReviewDisclaimerCheckHandler$launchNextHandler$1", f = "DecorationSmbReviewDisclaimerCheckHandler.kt", l = {171}, m = "invokeSuspend")
public final class C1816420xMu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1816400xMs LLILLJJLI;
    public final /* synthetic */ C1816270xMf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816420xMu(C1816400xMs c1816400xMs, C1816270xMf c1816270xMf, InterfaceC1364105Vn<? super C1816420xMu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1816400xMs;
        this.LLILLL = c1816270xMf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1816420xMu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DecorationSmbReviewDisclaimerCheckHandler@8829.launchNextHandler$1");
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
            AbstractC233200vC abstractC233200vC = this.LLILLJJLI.LIZ;
            if (abstractC233200vC != null) {
                C1816270xMf c1816270xMf = this.LLILLL;
                this.LL = 1;
                if (abstractC233200vC.LIZ(c1816270xMf, this) == objLJFF) {
                    C1C7U.LIZIZ("DecorationSmbReviewDisclaimerCheckHandler@8829.launchNextHandler$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DecorationSmbReviewDisclaimerCheckHandler@8829.launchNextHandler$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
