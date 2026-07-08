package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonAssem;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zKO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.EcProductAddButtonAssem$registerPreloadInfo$2", f = "EcProductAddButtonAssem.kt", l = {318}, m = "invokeSuspend")
public final class C1891740zKO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ EcProductAddButtonAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891740zKO(long j, List<String> list, EcProductAddButtonAssem ecProductAddButtonAssem, InterfaceC1364105Vn<? super C1891740zKO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = list;
        this.LLILZ = ecProductAddButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891740zKO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        C1C7U.LIZ("EcProductAddButtonAssem@e70d.registerPreloadInfo$2");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcProductAddButtonAssem@e70d.registerPreloadInfo$2");
                return objLJFF;
            }
        }
        List<String> list = this.LLILLL;
        EcProductAddButtonAssem ecProductAddButtonAssem = this.LLILZ;
        for (String str : list) {
            C1892160zL4 c1892160zL4 = C1892160zL4.LIZ;
            List<Long> list2 = ecProductAddButtonAssem.Ep().LLILZLL;
            if (list2 != null) {
                l = (Long) C13LP.LJJJLL(list2);
            } else {
                l = null;
            }
            String str2 = ecProductAddButtonAssem.Ep().LLILZIL;
            Map<String, Object> map = ecProductAddButtonAssem.Ep().LLJ;
            c1892160zL4.getClass();
            String string = UriProtector.parse(C1892160zL4.LIZIZ(str, l, str2, map)).buildUpon().appendQueryParameter("spark_perf_biz", "content_ecommerce").build().toString();
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(string);
            C1537060q6K.LJIIJJI(c1537060q6K, string, "content_ecommerce", sparkContext, null, true, null, 32);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcProductAddButtonAssem@e70d.registerPreloadInfo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
