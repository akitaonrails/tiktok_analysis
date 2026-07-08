package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546100qKu implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        Fragment fragment;
        C1058140dds statusBarBgColor;
        C1546120qKw c1546120qKwLJFF;
        Object obj = this.LIZIZ;
        Context context = obj instanceof SparkActivity ? (Context) obj : ((obj instanceof Fragment) && (obj instanceof Fragment) && (fragment = (Fragment) obj) != null) ? fragment.getContext() : null;
        InterfaceC1542060qEO interfaceC1542060qEO = C1546010qKl.LIZ;
        Integer numValueOf = (interfaceC1542060qEO == null || (c1546120qKwLJFF = interfaceC1542060qEO.LJFF()) == null) ? null : Integer.valueOf(c1546120qKwLJFF.LIZ);
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam != null && (statusBarBgColor = sparkPageSchemaParam.getStatusBarBgColor()) != null) {
            SparkContext sparkContextLLIILZL = this.LIZIZ.LLIILZL();
            numValueOf = Integer.valueOf(statusBarBgColor.getColor(context, sparkContextLLIILZL != null ? sparkContextLLIILZL.LJJJIL() : null));
        }
        this.LIZIZ.tH(numValueOf);
    }

    public C1546100qKu(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
    }
}
