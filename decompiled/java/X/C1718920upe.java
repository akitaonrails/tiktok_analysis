package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.bnpl.IBNPLService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS313S0000000_26;

/* JADX INFO: renamed from: X.0upe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1718920upe extends AbstractC1538690q8x {
    public static final List<String> LIZIZ = new ArrayList();
    public static final AFwS313S0000000_26 LIZJ = AFwS313S0000000_26.get$arr$(41);

    @Override // X.AbstractC1538690q8x
    public final String LJI() {
        return "pipo_bnpl";
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        sparkContext.LJJLIIIJILLIZJL(((IBNPLService) ServiceManager.get().getService(IBNPLService.class)).LIZIZ().LIZIZ());
        sparkContext.LJJLIIIJJI(new C1718930upf());
        super.LJ(sparkContext, str);
    }

    @Override // X.AbstractC1538690q8x
    public final void LJFF(SparkContext sparkContext, String str) {
        super.LJFF(sparkContext, str);
        sparkContext.LJJLIIIJJI(new C1718930upf());
    }
}
