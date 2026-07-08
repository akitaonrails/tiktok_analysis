package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0Kv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$downLoadResourceBatch$2$3$1$path$1", f = "MaterialHandler.kt", l = {192}, m = "invokeSuspend")
public final class C532830Kv3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C532910KvB LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;
    public final /* synthetic */ MaterialResource LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532830Kv3(C532910KvB c532910KvB, EffectManager effectManager, MaterialResource materialResource, InterfaceC1364105Vn<? super C532830Kv3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c532910KvB;
        this.LLILLL = effectManager;
        this.LLILZ = materialResource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532830Kv3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialHandler@ef69.downLoadResourceBatch$2$3$1$path$1");
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
            C532910KvB c532910KvB = this.LLILLJJLI;
            EffectManager effectManager = this.LLILLL;
            MaterialResource materialResource = this.LLILZ;
            c532910KvB.getClass();
            b bVarLJ = C09IC.LJ(new C532960KvG(effectManager, materialResource, null));
            this.LL = 1;
            obj = C09IC.LJIIZILJ(bVarLJ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MaterialHandler@ef69.downLoadResourceBatch$2$3$1$path$1");
                return objLJFF;
            }
        }
        String strLJIIJ = this.LLILLJJLI.LJIIJ((String) obj);
        C1C7U.LIZIZ("MaterialHandler@ef69.downLoadResourceBatch$2$3$1$path$1");
        return strLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
