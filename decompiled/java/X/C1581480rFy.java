package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.EffectLoader$awaitResult$2", f = "EffectLoader.kt", l = {100}, m = "invokeSuspend")
public final class C1581480rFy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1599950rjl LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1599950rjl LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1581480rFy(C1599950rjl c1599950rjl, Context context, InterfaceC1364105Vn<? super C1581480rFy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1599950rjl;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1581480rFy(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C1599950rjl c1599950rjl;
        C1C7U.LIZ("EffectLoader@fcd0.awaitResult$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c1599950rjl = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c1599950rjl = this.LLILLL;
            Context context = this.LLILZ;
            c1599950rjl.getClass();
            DialogC1390150mHN dialogC1390150mHN = new DialogC1390150mHN(context);
            dialogC1390150mHN.LJJLJ(false);
            dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0rFz
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    c1599950rjl.getClass();
                }
            };
            dialogC1390150mHN.LJJLL(0.0f, false);
            C1599950rjl c1599950rjl2 = this.LLILLL;
            Context context2 = this.LLILZ;
            c1599950rjl2.getClass();
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context2);
            if (c19egLIZIZ != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed() && dialogC1390150mHN.isShowing()) {
                C786410Ut5.K4(dialogC1390150mHN);
                this.LL = c1599950rjl;
                this.LLILLJJLI = 1;
                if (c1599950rjl2.LJ(dialogC1390150mHN, this) == objLJFF) {
                    C1C7U.LIZIZ("EffectLoader@fcd0.awaitResult$2");
                    return objLJFF;
                }
            }
        }
        c1599950rjl.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectLoader@fcd0.awaitResult$2");
        return unit;
    }
}
