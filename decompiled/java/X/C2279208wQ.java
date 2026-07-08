package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08wQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.core.ChangeAvatarCreateInfoStickerUtils$fetchAvatarInfoSticker$2$1$onSuccess$1$1$1$1", f = "ChangeAvatarCreateInfoStickerUtils.kt", l = {45}, m = "invokeSuspend")
public final class C2279208wQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C348460DlM, ? extends Effect>>, Object> {
    public int LL;
    public final /* synthetic */ EffectCategoryResponse LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2279208wQ(EffectCategoryResponse effectCategoryResponse, Effect effect, InterfaceC1364105Vn<? super C2279208wQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectCategoryResponse;
        this.LLILLL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2279208wQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeAvatarCreateInfoStickerUtils@2cef.fetchAvatarInfoSticker$2$1$onSuccess$1$1$1$1");
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
            final String key = this.LLILLJJLI.getKey();
            final Effect effect = this.LLILLL;
            this.LL = 1;
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1634250sd5.LIZ().LJIIL(effect, new IFetchEffectListener() { // from class: X.0FPO
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect2) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect2) {
                    if (effect2 != null) {
                        C348460DlM c348460DlM = new C348460DlM(0);
                        c348460DlM.LJIIL = effect.getUnzipPath();
                        c348460DlM.LJIILL = effect.getEffectId();
                        if (Intrinsics.LJFF(key, "left")) {
                            Pair<Float, Float> pair = C2279408wS.LIZ;
                            c348460DlM.LJFF = pair.getFirst().floatValue();
                            c348460DlM.LJI = pair.getSecond().floatValue();
                        } else {
                            Pair<Float, Float> pair2 = C2279408wS.LIZIZ;
                            c348460DlM.LJFF = pair2.getFirst().floatValue();
                            c348460DlM.LJI = pair2.getSecond().floatValue();
                        }
                        C577660MlA.LIZ.getClass();
                        c348460DlM.LJ = C577660MlA.LIZ().maxDuration;
                        InterfaceC1364105Vn<Pair<C348460DlM, ? extends Effect>> interfaceC1364105Vn = c23260099m;
                        Pair pair3 = new Pair(c348460DlM, effect2);
                        C189200o6.m2constructorimpl(pair3);
                        interfaceC1364105Vn.resumeWith(pair3);
                        return;
                    }
                    InterfaceC1364105Vn<Pair<C348460DlM, ? extends Effect>> interfaceC1364105Vn2 = c23260099m;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn2.resumeWith(null);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                    String effectId;
                    InterfaceC1364105Vn<Pair<C348460DlM, ? extends Effect>> interfaceC1364105Vn = c23260099m;
                    Unit unit = null;
                    C189200o6.m2constructorimpl(null);
                    interfaceC1364105Vn.resumeWith(null);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("downloadEffect effect:");
                    if (effect2 != null) {
                        effectId = effect2.getEffectId();
                    } else {
                        effectId = null;
                    }
                    sbLIZ.append(effectId);
                    sbLIZ.append(' ');
                    if (exceptionResult.getException() != null) {
                        unit = Unit.LIZ;
                    }
                    sbLIZ.append(unit);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            });
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChangeAvatarCreateInfoStickerUtils@2cef.fetchAvatarInfoSticker$2$1$onSuccess$1$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChangeAvatarCreateInfoStickerUtils@2cef.fetchAvatarInfoSticker$2$1$onSuccess$1$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C348460DlM, ? extends Effect>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
