package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.119I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119I extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ExtensionMisc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119I(String str, ExtensionMisc extensionMisc) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = extensionMisc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        sparkContext2.LJJJZ("show_type", this.LL);
        C1206830hVh c1206830hVh = C1206830hVh.LIZ;
        ExtensionMisc extensionMisc = this.LLILLJJLI;
        c1206830hVh.getClass();
        for (Map.Entry entry : ((LinkedHashMap) C1206830hVh.LIZ(extensionMisc)).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                str2 = "";
            }
            sparkContext2.LJJJZ(str, str2);
        }
        return Unit.LIZ;
    }
}
