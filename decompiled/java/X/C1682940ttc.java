package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ttc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autopick.compose.DotMatrixViewKt$DotMatrixView$1$1", f = "DotMatrixView.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1682940ttc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C238400w2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ C05ZL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1682940ttc(float f, float f2, C05ZL c05zl, InterfaceC1364105Vn<? super C1682940ttc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = f;
        this.LLILZ = f2;
        this.LLILZIL = c05zl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1682940ttc(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C238400w2 c238400w2;
        C1682960tte c1682960tte;
        C1C7U.LIZ("DotMatrixViewKt@eccf.DotMatrixView$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c238400w2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c238400w2 = new C238400w2();
        }
        do {
            c1682960tte = new C1682960tte(c238400w2, this.LLILLL, this.LLILZ, this.LLILZIL);
            this.LL = c238400w2;
            this.LLILLJJLI = 1;
        } while (C1838620xwi.LIZIZ(this, c1682960tte) != objLJFF);
        C1C7U.LIZIZ("DotMatrixViewKt@eccf.DotMatrixView$1$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
