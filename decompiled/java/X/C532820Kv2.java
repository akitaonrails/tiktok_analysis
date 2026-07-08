package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kv2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.MaterialHandler$downLoadResourceBatch$2$3", f = "MaterialHandler.kt", l = {191}, m = "invokeSuspend")
public final class C532820Kv2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C532910KvB LLILLJJLI;
    public InterfaceC531800KtO LLILLL;
    public int LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ C532910KvB LLILZLL;
    public final /* synthetic */ InterfaceC531800KtO LLIZ;
    public final /* synthetic */ EffectManager LLIZLLLIL;
    public final /* synthetic */ MaterialResource LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532820Kv2(List<String> list, C532910KvB c532910KvB, InterfaceC531800KtO interfaceC531800KtO, EffectManager effectManager, MaterialResource materialResource, String str, InterfaceC1364105Vn<? super C532820Kv2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = list;
        this.LLILZLL = c532910KvB;
        this.LLIZ = interfaceC531800KtO;
        this.LLIZLLLIL = effectManager;
        this.LLJ = materialResource;
        this.LLJI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532820Kv2(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        List<String> list;
        C532910KvB c532910KvB;
        InterfaceC531800KtO interfaceC531800KtO;
        C1C7U.LIZ("MaterialHandler@ef69.downLoadResourceBatch$2$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC531800KtO = this.LLILLL;
                    c532910KvB = this.LLILLJJLI;
                    list = (List) this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                list = this.LLILZIL;
                c532910KvB = this.LLILZLL;
                interfaceC531800KtO = this.LLIZ;
                EffectManager effectManager = this.LLIZLLLIL;
                MaterialResource materialResource = this.LLJ;
                C1DFB c1dfb = C0PEM.LIZJ;
                C532830Kv3 c532830Kv3 = new C532830Kv3(c532910KvB, effectManager, materialResource, null);
                this.LL = list;
                this.LLILLJJLI = c532910KvB;
                this.LLILLL = interfaceC531800KtO;
                this.LLILZ = 1;
                obj = C23250099c.LJI(this, c1dfb, c532830Kv3);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MaterialHandler@ef69.downLoadResourceBatch$2$3");
                    return objLJFF;
                }
            }
            String str = (String) obj;
            for (String str2 : list) {
                c532910KvB.LIZLLL(str2, str);
                interfaceC531800KtO.LJJI(str2, str);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C532910KvB c532910KvB2 = this.LLILZLL;
        String str3 = this.LLJI;
        List<String> list2 = this.LLILZIL;
        InterfaceC531800KtO interfaceC531800KtO2 = this.LLIZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadMaterialResource failed for resource_key=");
            sbLIZ.append(str3);
            sbLIZ.append(": ");
            sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
            c532910KvB2.LJI(C2188811AlT.LIZIZ(sbLIZ));
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = thM5exceptionOrNullimpl.toString();
            }
            Iterator<String> it2 = list2.iterator();
            while (it2.hasNext()) {
                interfaceC531800KtO2.onError(it2.next(), -4002, message);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialHandler@ef69.downLoadResourceBatch$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
