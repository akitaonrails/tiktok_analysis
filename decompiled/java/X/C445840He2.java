package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0He2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.GameDropsShortCardAgent$loadGameDropsShortCardWithLottie$2$3$1", f = "GameDropsShortCardAgent.kt", l = {321}, m = "invokeSuspend")
public final class C445840He2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1105940esy LLILLJJLI;
    public final /* synthetic */ C1295960jpS LLILLL;
    public final /* synthetic */ C259800zU<Bitmap> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445840He2(C1105940esy c1105940esy, C1295960jpS c1295960jpS, C259800zU<Bitmap> c259800zU, InterfaceC1364105Vn<? super C445840He2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1105940esy;
        this.LLILLL = c1295960jpS;
        this.LLILZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C445840He2(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameDropsShortCardAgent@8f3c.loadGameDropsShortCardWithLottie$2$3$1");
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
            C1105940esy c1105940esy = this.LLILLJJLI;
            C1295960jpS c1295960jpS = this.LLILLL;
            final Bitmap bitmap = this.LLILZ.element;
            this.LL = 1;
            c1105940esy.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1143680frq.LJIILL(c1295960jpS, "tiktok_live_game_demand_2", "ttlive_game_drops_appearance.zip", false, new InterfaceC1143790fs1() { // from class: X.01lV
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lottie success, previewBitmap =");
                    sbLIZ.append(bitmap);
                    C20441214yg.LIZIZ("GameDropsShortCardAgent", C2188811AlT.LIZIZ(sbLIZ));
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.TRUE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GameDropsShortCardAgent@8f3c.loadGameDropsShortCardWithLottie$2$3$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GameDropsShortCardAgent@8f3c.loadGameDropsShortCardWithLottie$2$3$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
