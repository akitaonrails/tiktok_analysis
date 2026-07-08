package X;

import android.net.Uri;
import com.bytedance.forest.Forest;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qlt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.bytedance.hybrid.spark.multiviews.SparkMultiViewsManager$Companion$predecodeTemplatesIfNeed$1$1", f = "SparkMultiViewsManager.kt", l = {183, 184}, m = "invokeSuspend")
public final class C680030Qlt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1536940q68 LLILLL;
    public final /* synthetic */ Forest LLILZ;
    public final /* synthetic */ CopyOnWriteArrayList<C1536920q66> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C680030Qlt(String str, C1536940q68 c1536940q68, Forest forest, CopyOnWriteArrayList<C1536920q66> copyOnWriteArrayList, InterfaceC1364105Vn<? super C680030Qlt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1536940q68;
        this.LLILZ = forest;
        this.LLILZIL = copyOnWriteArrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C680030Qlt(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C1C7U.LIZ("SparkMultiViewsManager$Companion@5f4e.predecodeTemplatesIfNeed$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZIL.add((C1536920q66) obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SparkMultiViewsManager$Companion@5f4e.predecodeTemplatesIfNeed$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String string = this.LLILLJJLI;
            Uri uriLJ = C1946007jm.LJ(string);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "spark_perf_biz");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() == 0 || (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "spark_perf_bid")) == null || strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() == 0) {
                string = uriLJ.buildUpon().appendQueryParameter("spark_perf_biz", this.LLILLL.LIZ).build().toString();
            }
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            Forest forest = this.LLILZ;
            this.LL = 1;
            obj = C1536900q64.LIZ(sparkContext, forest, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SparkMultiViewsManager$Companion@5f4e.predecodeTemplatesIfNeed$1$1");
                return objLJFF;
            }
        }
        this.LL = 2;
        obj = ((AnonymousClass0957) obj).LJLIIIL(this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("SparkMultiViewsManager$Companion@5f4e.predecodeTemplatesIfNeed$1$1");
            return objLJFF;
        }
        this.LLILZIL.add((C1536920q66) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SparkMultiViewsManager$Companion@5f4e.predecodeTemplatesIfNeed$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
