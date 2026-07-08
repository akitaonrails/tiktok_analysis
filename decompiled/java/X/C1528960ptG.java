package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ptG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hybridkit.ssc.utils.HybridNxETUtils$sparkFragmentSetPageId$1", f = "HybridNxETUtils.kt", l = {66}, m = "invokeSuspend")
public final class C1528960ptG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SparkContext LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528960ptG(SparkContext sparkContext, View view, InterfaceC1364105Vn<? super C1528960ptG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sparkContext;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1528960ptG c1528960ptG = new C1528960ptG(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1528960ptG.LLILLJJLI = obj;
        return c1528960ptG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v16, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T tLLJJI;
        C1C7U.LIZ("HybridNxETUtils@3322.sparkFragmentSetPageId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String strLJIJI = this.LLILLL.LJIJI();
                C1528970ptH c1528970ptH = C1528970ptH.LIZIZ;
                c1528970ptH.getClass();
                String strLIZ = C1528970ptH.LIZ(strLJIJI);
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi != null) {
                    iSparkHostApi.LJJIIJ();
                }
                SparkContext sparkContext = this.LLILLL;
                View view = this.LLILZ;
                C259800zU c259800zU = new C259800zU();
                ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi2 != null) {
                    tLLJJI = iSparkHostApi2.LLJJI(strLJIJI);
                } else {
                    tLLJJI = 0;
                }
                c259800zU.element = tLLJJI;
                C08N7 c08n7LIZIZ = C1528940ptE.LIZIZ(strLIZ);
                C013C c013c = new C013C();
                if (c259800zU.element == 0 && c08n7LIZIZ != null) {
                    c259800zU.element = c08n7LIZIZ.LIZ();
                    c013c.element = true;
                }
                if (C123100dR.LIZ((String) c259800zU.element) && C123100dR.LIZ(strLIZ) && c08n7LIZIZ != null) {
                    C09U0 c09u0 = c1528970ptH.LIZ;
                    if (c09u0 == null) {
                        synchronized (c1528970ptH) {
                            c09u0 = c1528970ptH.LIZ;
                            if (c09u0 == null) {
                                c09u0 = (C09U0) C1807670x8n.p();
                                c1528970ptH.LIZ = c09u0;
                            }
                        }
                    }
                    AbstractC2252651DEx abstractC2252651DEx = c09u0.LIZJ;
                    C1528990ptJ c1528990ptJ = new C1528990ptJ(c259800zU, c08n7LIZIZ, sparkContext, c013c, view, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2252651DEx, c1528990ptJ) == objLJFF) {
                        C1C7U.LIZIZ("HybridNxETUtils@3322.sparkFragmentSetPageId$1");
                        return objLJFF;
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridNxETUtils@3322.sparkFragmentSetPageId$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
