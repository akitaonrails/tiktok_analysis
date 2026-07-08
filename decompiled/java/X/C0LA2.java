package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0LA2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.AutoCutButton$initView$2", f = "AutoCutButton.kt", l = {96}, m = "invokeSuspend")
public final class C0LA2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C538480L9y LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LA2(C538480L9y c538480L9y, InterfaceC1364105Vn<? super C0LA2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c538480L9y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LA2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1294720jnS c1294720jnS;
        C1295960jpS c1295960jpS;
        C1C7U.LIZ("AutoCutButton@cde0.initView$2");
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
            C0LA3 c0la3 = new C0LA3(null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c0la3);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoCutButton@cde0.initView$2");
                return objLJFF;
            }
        }
        C1292000jj4 c1292000jj4 = (C1292000jj4) obj;
        if (c1292000jj4 != null && (c1294720jnS = (C1294720jnS) c1292000jj4.LIZ) != null) {
            C538480L9y c538480L9y = this.LLILLJJLI;
            C1295960jpS c1295960jpS2 = c538480L9y.LLILZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setComposition(c1294720jnS);
            }
            if (Intrinsics.LJFF(c538480L9y.getLottieAnimationType(), C0MW9.LIZ) && (c1295960jpS = c538480L9y.LLILZ) != null) {
                c1295960jpS.setProgress(1.0f);
            }
        } else {
            C538480L9y c538480L9y2 = this.LLILLJJLI;
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lottie load error: ");
            sbLIZ.append(c1292000jj4);
            sbLIZ.append(".exception");
            C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
            C1295960jpS c1295960jpS3 = c538480L9y2.LLILZ;
            if (c1295960jpS3 != null) {
                c1295960jpS3.setAnimation("creation_autocut_icon_o1_tux_lottie.json");
            }
            c538480L9y2.LLJILJIL = C0MWC.LIZ;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutButton@cde0.initView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
