package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v51, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.UseLiveEffectHelper$setEffect$2", f = "UseLiveEffectHelper.kt", l = {103}, m = "invokeSuspend")
public final class C1728450v51 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1728720v5S LLILLJJLI;
    public final /* synthetic */ InterfaceC1728700v5Q LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;
    public final /* synthetic */ RootData LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728450v51(C1728720v5S c1728720v5S, InterfaceC1728700v5Q interfaceC1728700v5Q, LiveEffect liveEffect, RootData rootData, String str, String str2, InterfaceC1364105Vn<? super C1728450v51> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1728720v5S;
        this.LLILLL = interfaceC1728700v5Q;
        this.LLILZ = liveEffect;
        this.LLILZIL = rootData;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728450v51(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UseLiveEffectHelper@a681.setEffect$2");
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
            C1728720v5S c1728720v5S = this.LLILLJJLI;
            InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLL;
            final LiveEffect liveEffect = this.LLILZ;
            final RootData rootData = this.LLILZIL;
            final String str = this.LLILZLL;
            final String str2 = this.LLIZ;
            this.LL = 1;
            c1728720v5S.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1728460v52.LIZJ(rootData, str, liveEffect.getResourceId(), str2, "download_effect_resource");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC1728700v5Q.LJIIIIZZ(liveEffect, new C0UBT() { // from class: X.0v50
                @Override // X.C0UBT
                public final void LIZ() {
                }

                @Override // X.C0UBT
                public final void onStart() {
                }

                @Override // X.C0UBT
                public final void onFail() {
                    C1728460v52.LIZ(rootData, str, liveEffect.getResourceId(), str2, "download_effect_resource_fail", "download_effect_resource", false, null, null, null);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }

                @Override // X.C0UBT
                public final void onSuccess() {
                    C1728460v52.LIZ(rootData, str, liveEffect.getResourceId(), str2, "download_effect_resource_success", "download_effect_resource", true, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), null, null);
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
                C1C7U.LIZIZ("UseLiveEffectHelper@a681.setEffect$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UseLiveEffectHelper@a681.setEffect$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
