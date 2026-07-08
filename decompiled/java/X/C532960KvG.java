package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0KvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$materialDownloadPathFlow$1", f = "MaterialHandler.kt", l = {368}, m = "invokeSuspend")
public final class C532960KvG extends C09AX implements Function2<C094D<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;
    public final /* synthetic */ MaterialResource LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532960KvG(EffectManager effectManager, MaterialResource materialResource, InterfaceC1364105Vn<? super C532960KvG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectManager;
        this.LLILZ = materialResource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532960KvG c532960KvG = new C532960KvG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c532960KvG.LLILLJJLI = obj;
        return c532960KvG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialHandler@ef69.materialDownloadPathFlow$1");
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
            this.LLILLL.downloadMaterialResource(this.LLILZ, new C13MA<String>() { // from class: X.0KvH
                @Override // X.C13MA
                public final void onSuccess(String str) {
                    c094d.LJIIIIZZ(str);
                    c094d.LJIIJJI(null);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(String str) {
                }

                @Override // X.C13MA
                public final void onFail(String str, C1662010tLr c1662010tLr) {
                    C094D<String> c094d2 = c094d;
                    String str2 = c1662010tLr.LIZIZ;
                    if (str2 == null) {
                        str2 = "downloadMaterialResource failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(str2));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(427);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("MaterialHandler@ef69.materialDownloadPathFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialHandler@ef69.materialDownloadPathFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super String> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
