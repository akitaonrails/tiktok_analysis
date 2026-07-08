package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0J3C, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.incentive.crossplatform.PiaOptManager$warmup$1", f = "PiaOptManager.kt", l = {}, m = "invokeSuspend")
public final class C0J3C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J3C(String str, String str2, InterfaceC1364105Vn<? super C0J3C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0J3C(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        SparkContext sparkContext;
        C1893370zN1 c1893370zN1;
        C1C7U.LIZ("PiaOptManager@78fe.warmup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LLILLJJLI;
        try {
            C1538260q8G.LIZ.LJI();
            if (u.LJJIIJZLJL(str, "https", false)) {
                Uri.Builder builder = new Uri.Builder();
                builder.path("//webview/");
                builder.appendQueryParameter("url", str);
                String string = builder.build().toString();
                sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(string);
            } else {
                sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(str);
            }
            SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
            if (sparkSchemaParamLJJJI != null && (c1893370zN1 = (C1893370zN1) C1619720sFe.LIZ.LIZ(1003)) != null) {
                c098200Yq = c1893370zN1.LJIILLIIL(sparkSchemaParamLJJJI, sparkContext);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PiaOptManager@78fe.warmup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
