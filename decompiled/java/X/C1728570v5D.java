package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.BillboardImageEffectHelper$setEffect$2", f = "BillboardImageEffectHelper.kt", l = {93}, m = "invokeSuspend")
public final class C1728570v5D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C1728760v5W LLILLJJLI;
    public final /* synthetic */ InterfaceC1728700v5Q LLILLL;
    public final /* synthetic */ LiveEffect LLILZ;
    public final /* synthetic */ EffectRootData LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728570v5D(C1728760v5W c1728760v5W, InterfaceC1728700v5Q interfaceC1728700v5Q, LiveEffect liveEffect, EffectRootData effectRootData, String str, String str2, InterfaceC1364105Vn<? super C1728570v5D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1728760v5W;
        this.LLILLL = interfaceC1728700v5Q;
        this.LLILZ = liveEffect;
        this.LLILZIL = effectRootData;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728570v5D(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardImageEffectHelper@3558.setEffect$2");
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
            final C1728760v5W c1728760v5W = this.LLILLJJLI;
            InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLL;
            final LiveEffect liveEffect = this.LLILZ;
            final EffectRootData effectRootData = this.LLILZIL;
            this.LL = 1;
            c1728760v5W.getClass();
            final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resId: ");
            sbLIZ.append(liveEffect.getResourceId());
            C1728760v5W.LIZIZ("download_effect_resource", C2188811AlT.LIZIZ(sbLIZ), effectRootData);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC1728700v5Q.LJIIIIZZ(liveEffect, new C0UBT() { // from class: X.0v5C
                @Override // X.C0UBT
                public final void LIZ() {
                }

                @Override // X.C0UBT
                public final void onStart() {
                }

                @Override // X.C0UBT
                public final void onFail() {
                    C1728760v5W c1728760v5W2 = c1728760v5W;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resId: ");
                    sbLIZ2.append(liveEffect.getResourceId());
                    sbLIZ2.append(", duration:");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ2.append(';');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    EffectRootData effectRootData2 = effectRootData;
                    c1728760v5W2.getClass();
                    C1728760v5W.LIZIZ("download_effect_resource_fail", strLIZIZ, effectRootData2);
                    InterfaceC1364105Vn<Boolean> interfaceC1364105Vn = c23260099m;
                    Boolean bool = Boolean.FALSE;
                    C189200o6.m2constructorimpl(bool);
                    interfaceC1364105Vn.resumeWith(bool);
                }

                @Override // X.C0UBT
                public final void onSuccess() {
                    C1728760v5W c1728760v5W2 = c1728760v5W;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resId: ");
                    sbLIZ2.append(liveEffect.getResourceId());
                    sbLIZ2.append(", duration:");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ2.append(';');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    EffectRootData effectRootData2 = effectRootData;
                    c1728760v5W2.getClass();
                    C1728760v5W.LIZIZ("download_effect_resource_success", strLIZIZ, effectRootData2);
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
                C1C7U.LIZIZ("BillboardImageEffectHelper@3558.setEffect$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BillboardImageEffectHelper@3558.setEffect$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
