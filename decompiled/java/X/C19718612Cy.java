package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12Cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicToolbarComponent$strippingLoadingProgress$1", f = "ReplaceMusicToolbarComponent.kt", l = {261}, m = "invokeSuspend")
public final class C19718612Cy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public long LLILLJJLI;
    public C12DN LLILLL;
    public int LLILZ;
    public final /* synthetic */ C19718412Cw LLILZIL;
    public final /* synthetic */ Function1<Float, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19718612Cy(C19718412Cw c19718412Cw, Function1<? super Float, Unit> function1, InterfaceC1364105Vn<? super C19718612Cy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c19718412Cw;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19718612Cy(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        long jCurrentTimeMillis;
        C12DN c12dn;
        C1C7U.LIZ("ReplaceMusicToolbarComponent@6d22.strippingLoadingProgress$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        if (i2 != 0) {
            if (i2 == 1) {
                jCurrentTimeMillis = this.LLILLJJLI;
                i = this.LL;
                c12dn = this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILZIL.P4().getVideoLength() < 60000) {
                i = 15000;
            } else if (this.LLILZIL.P4().getVideoLength() < 180000) {
                i = 20000;
            } else {
                i = 25000;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            c12dn = new C12DN();
        }
        do {
            float fLIZLLL = C13LZ.LIZLLL((System.currentTimeMillis() - jCurrentTimeMillis) / i, 0.0f, 1.0f);
            this.LLILZLL.invoke(C2286608xc.LIZLLL((c12dn.getInterpolation(fLIZLLL) * 79.0f) + 20.0f));
            if (fLIZLLL < 1.0f) {
                this.LLILLL = c12dn;
                this.LL = i;
                this.LLILLJJLI = jCurrentTimeMillis;
                this.LLILZ = 1;
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("ReplaceMusicToolbarComponent@6d22.strippingLoadingProgress$1");
                return unit;
            }
        } while (AnonymousClass0958.LIZIZ(16L, this) != objLJFF);
        C1C7U.LIZIZ("ReplaceMusicToolbarComponent@6d22.strippingLoadingProgress$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
