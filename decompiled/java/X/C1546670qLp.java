package X;

import android.view.ViewGroup;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546670qLp implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;
    public final ViewGroup LIZJ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        boolean transStatusBar = sparkPageSchemaParam != null ? sparkPageSchemaParam.getTransStatusBar() : false;
        SparkPageSchemaParam sparkPageSchemaParam2 = this.LIZ;
        boolean showNavBarInTransStatusBar = sparkPageSchemaParam2 != null ? sparkPageSchemaParam2.getShowNavBarInTransStatusBar() : false;
        this.LIZIZ.h9(transStatusBar);
        if (!this.LIZIZ.k9() || showNavBarInTransStatusBar) {
            return;
        }
        C786410Ut5.LJLZ(8, this.LIZJ);
    }

    public C1546670qLp(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn, ViewGroup viewGroup) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
        this.LIZJ = viewGroup;
    }
}
