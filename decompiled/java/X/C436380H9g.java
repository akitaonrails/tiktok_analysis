package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectGuideScene$play$1", f = "RecommendEffectGuide.kt", l = {254}, m = "invokeSuspend")
public final class C436380H9g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C436390H9h LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436380H9g(long j, C436390H9h c436390H9h, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c436390H9h;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436380H9g(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendEffectGuideScene@e839.play$1");
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
            C436390H9h c436390H9h = this.LLILLJJLI;
            c436390H9h.LLJJJJJIL = false;
            if (!c436390H9h.LLLLLJIL().isAnimating()) {
                C436390H9h c436390H9h2 = this.LLILLJJLI;
                c436390H9h2.LLJJJIL.creativeModel.effectEntrancePosition = "edit_page";
                c436390H9h2.LLLLLJIL().playAnimation();
                Keva.getRepo("recommend_effect_guide_keva").storeBoolean("recommend_effect_guide_count", true);
                C1413450msx c1413450msx = C1413450msx.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI.LLJJJIL;
                c1413450msx.getClass();
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2341909Fp.LIZ("swipe_for_more_effects_popup", C1413450msx.LJI(videoPublishEditModel).LIZ);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C436360H9e c436360H9e = new C436360H9e(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfh, c436360H9e) == objLJFF) {
                C1C7U.LIZIZ("RecommendEffectGuideScene@e839.play$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecommendEffectGuideScene@e839.play$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
