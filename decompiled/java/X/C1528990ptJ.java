package X;

import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import njp.a;

/* JADX INFO: renamed from: X.0ptJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hybridkit.ssc.utils.HybridNxETUtils$sparkFragmentSetPageId$1$1$1", f = "HybridNxETUtils.kt", l = {}, m = "invokeSuspend")
public final class C1528990ptJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ C08N7 LLILLJJLI;
    public final /* synthetic */ SparkContext LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528990ptJ(C259800zU<String> c259800zU, C08N7 c08n7, SparkContext sparkContext, C013C c013c, View view, InterfaceC1364105Vn<? super C1528990ptJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c08n7;
        this.LLILLL = sparkContext;
        this.LLILZ = c013c;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1528990ptJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1067640dtC engineType;
        C1C7U.LIZ("HybridNxETUtils@3322.sparkFragmentSetPageId$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJJIIJ();
        }
        SparkContext sparkContext = this.LLILLL;
        C1529880puk c1529880puk = SparkContext.Companion;
        int i = -1;
        SparkSchemaParam sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        if (sparkSchemaParamLJJJI != null && (engineType = sparkSchemaParamLJJJI.getEngineType()) != null) {
            i = C1324320kZC.LIZ[engineType.ordinal()];
        }
        String str = "auto";
        if (i != 1) {
            if (i == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("page_h5_");
                if (!this.LLILZ.element) {
                    str = "btm";
                }
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(this.LL.element);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1529000ptK.LIZ.put(strLIZIZ, this.LLILLL.LJIJI());
                C1848530yCh.LIZLLL(this.LLILZIL, strLIZIZ, new AwS236S0300000_27(this.LLILZ, this.LLILLL, this.LLILLJJLI, 36));
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("page_lynx_");
            if (!this.LLILZ.element) {
                str = "btm";
            }
            sbLIZ2.append(str);
            sbLIZ2.append('_');
            sbLIZ2.append(this.LL.element);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C1529000ptK.LIZ.put(strLIZIZ2, this.LLILLL.LJIJI());
            C1848530yCh.LIZLLL(this.LLILZIL, strLIZIZ2, new AwS236S0300000_27(this.LLILZ, this.LLILLL, this.LLILLJJLI, 35));
        }
        ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi2 != null && iSparkHostApi2.LLJILJIL()) {
            C1848530yCh.LJ(AFwS269S0000000_27.get$arr$(451), this.LLILZIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HybridNxETUtils@3322.sparkFragmentSetPageId$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
