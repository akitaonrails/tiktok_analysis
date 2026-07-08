package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$materialInfoFlow$1", f = "MaterialHandler.kt", l = {348}, m = "invokeSuspend")
public final class C532940KvE extends C09AX implements Function2<C094D<? super MaterialResource>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C532910KvB LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532940KvE(EffectManager effectManager, String str, C532910KvB c532910KvB, InterfaceC1364105Vn<? super C532940KvE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectManager;
        this.LLILZ = str;
        this.LLILZIL = c532910KvB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532940KvE c532940KvE = new C532940KvE(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c532940KvE.LLILLJJLI = obj;
        return c532940KvE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialHandler@ef69.materialInfoFlow$1");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            EffectManager effectManager = this.LLILLL;
            List listSingletonList = Collections.singletonList(this.LLILZ);
            final C532910KvB c532910KvB = this.LLILZIL;
            final String str = this.LLILZ;
            effectManager.fetchMaterialResourceInfo(listSingletonList, null, new C13MA<List<? extends MaterialResource>>() { // from class: X.0KvF
                @Override // X.C13MA
                public final void onSuccess(List<? extends MaterialResource> list) {
                    Object objLJJJLL = C13LP.LJJJLL(list);
                    if (objLJJJLL != null) {
                        c094d.LJIIIIZZ((MaterialResource) objLJJJLL);
                        c094d.LJIIJJI(null);
                    } else {
                        c094d.LJIIJJI(new IllegalStateException("material not found for resourceKey"));
                    }
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(List<? extends MaterialResource> list) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.C13MA
                public final void onFail(List<? extends MaterialResource> list, C1662010tLr c1662010tLr) {
                    c532910KvB.LJI(c532910KvB.LJIIL("materialInfoFlow", c1662010tLr, Collections.singletonList(str), list));
                    C094D<MaterialResource> c094d2 = c094d;
                    String str2 = c1662010tLr.LIZIZ;
                    if (str2 == null) {
                        str2 = "fetchMaterialResourceInfo failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(str2, c1662010tLr.LIZLLL));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(428);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("MaterialHandler@ef69.materialInfoFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialHandler@ef69.materialInfoFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super MaterialResource> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
