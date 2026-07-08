package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bach.BachTask$getAlgoConfig$result$1$data$1", f = "BachTask.kt", l = {145}, m = "invokeSuspend")
public final class C2292708yb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC2293808ym<R> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2292708yb(AbstractC2293808ym<R> abstractC2293808ym, InterfaceC1364105Vn<? super C2292708yb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC2293808ym;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2292708yb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strLJIILJJIL;
        C1C7U.LIZ("BachTask@4cb1.getAlgoConfig$result$1$data$1");
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
            final AbstractC2293808ym<R> abstractC2293808ym = this.LLILLJJLI;
            this.LL = 1;
            abstractC2293808ym.getClass();
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1634250sd5.LIZ().LJJJJI("feature_extraction_algo", false, false, new IFetchEffectChannelListener() { // from class: X.08yc
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    AbstractC2293808ym<Object> abstractC2293808ym2 = abstractC2293808ym;
                    InterfaceC20236714Gf<Effect> interfaceC20236714Gf = c2252611DEt;
                    abstractC2293808ym2.getClass();
                    AbstractC2293808ym.LJI(null, interfaceC20236714Gf);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    Effect next;
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 == null) {
                        AbstractC2293808ym<Object> abstractC2293808ym2 = abstractC2293808ym;
                        InterfaceC20236714Gf<Effect> interfaceC20236714Gf = c2252611DEt;
                        abstractC2293808ym2.getClass();
                        AbstractC2293808ym.LJI(null, interfaceC20236714Gf);
                        return;
                    }
                    List<Effect> allCategoryEffects = effectChannelResponse2.getAllCategoryEffects();
                    AbstractC2293808ym<Object> abstractC2293808ym3 = abstractC2293808ym;
                    Iterator<Effect> it2 = allCategoryEffects.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(next.getName(), ((C2292908yd) abstractC2293808ym3).LIZLLL)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Effect effect = next;
                    if (effect == null) {
                        AbstractC2293808ym<Object> abstractC2293808ym4 = abstractC2293808ym;
                        InterfaceC20236714Gf<Effect> interfaceC20236714Gf2 = c2252611DEt;
                        abstractC2293808ym4.getClass();
                        AbstractC2293808ym.LJI(null, interfaceC20236714Gf2);
                        return;
                    }
                    C1634250sd5.LIZ().LJIIL(effect, new C2500109qx(abstractC2293808ym, c2252611DEt, 1));
                }
            });
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BachTask@4cb1.getAlgoConfig$result$1$data$1");
                return objLJFF;
            }
        }
        Effect effect = (Effect) obj;
        if (effect == null) {
            strLJIILJJIL = null;
        } else {
            strLJIILJJIL = C2286708xd.LJIILJJIL(new C0VSP(new C0VSJ(effect.getUnzipPath(), ((C2292908yd) this.LLILLJJLI).LJ)));
        }
        C1C7U.LIZIZ("BachTask@4cb1.getAlgoConfig$result$1$data$1");
        return strLJIILJJIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
