package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542780qFY implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        Fragment fragment;
        InterfaceC1542060qEO interfaceC1542060qEO;
        InterfaceC1545600qK6 interfaceC1545600qK6LIZLLL;
        Integer numLIZIZ;
        if (C1540320qBa.LIZ) {
            SparkContext sparkContextLLIILZL = this.LIZIZ.LLIILZL();
            if ((sparkContextLLIILZL != null ? sparkContextLLIILZL.LJIIZILJ(null) : null) == EnumC1540340qBc.DARK) {
                Object obj = this.LIZIZ;
                Context context = obj instanceof SparkActivity ? (Context) obj : ((obj instanceof Fragment) && (obj instanceof Fragment) && (fragment = (Fragment) obj) != null) ? fragment.getContext() : null;
                SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
                if (sparkPageSchemaParam != null) {
                    C1058140dds navigationBarBgColor = sparkPageSchemaParam.getNavigationBarBgColor();
                    if (navigationBarBgColor == null) {
                        navigationBarBgColor = new C1058140dds((context == null || (interfaceC1542060qEO = C1546010qKl.LIZ) == null || (interfaceC1545600qK6LIZLLL = interfaceC1542060qEO.LIZLLL()) == null || (numLIZIZ = interfaceC1545600qK6LIZLLL.LIZIZ(context)) == null) ? C1542150qEX.LIZ() : numLIZIZ.intValue());
                    }
                    sparkPageSchemaParam.setNavigationBarBgColor(navigationBarBgColor);
                }
            }
        }
    }

    public C1542780qFY(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
    }
}
