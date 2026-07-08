package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.spark.schema.model.SparkPageSchemaParam;

/* JADX INFO: renamed from: X.0qLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546630qLl implements InterfaceC1554280qY6 {
    public final SparkPageSchemaParam LIZ;
    public final InterfaceC1546650qLn LIZIZ;
    public final InterfaceC1892990zMP LIZJ;

    @Override // X.InterfaceC1554280qY6
    public final void invoke() {
        Fragment fragment;
        C1058140dds navBarColor;
        Object obj = this.LIZIZ;
        Context context = obj instanceof SparkActivity ? (Context) obj : ((obj instanceof Fragment) && (obj instanceof Fragment) && (fragment = (Fragment) obj) != null) ? fragment.getContext() : null;
        SparkPageSchemaParam sparkPageSchemaParam = this.LIZ;
        if (sparkPageSchemaParam == null || (navBarColor = sparkPageSchemaParam.getNavBarColor()) == null) {
            return;
        }
        SparkContext sparkContextLLIILZL = this.LIZIZ.LLIILZL();
        Integer numValueOf = Integer.valueOf(navBarColor.getColor(context, sparkContextLLIILZL != null ? sparkContextLLIILZL.LJJJIL() : null));
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            InterfaceC1892990zMP interfaceC1892990zMP = this.LIZJ;
            if (interfaceC1892990zMP != null) {
                interfaceC1892990zMP.LJJJI(iIntValue);
            }
        }
    }

    public C1546630qLl(SparkPageSchemaParam sparkPageSchemaParam, InterfaceC1546650qLn interfaceC1546650qLn, InterfaceC1892990zMP interfaceC1892990zMP) {
        this.LIZ = sparkPageSchemaParam;
        this.LIZIZ = interfaceC1546650qLn;
        this.LIZJ = interfaceC1892990zMP;
    }
}
