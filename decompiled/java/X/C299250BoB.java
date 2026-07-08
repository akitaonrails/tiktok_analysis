package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.SparkEcomPromotionCaravelOptPageListBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0BoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C299250BoB {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1603));

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZIZ(String str) {
        List list;
        SparkEcomPromotionCaravelOptPageListBean sparkEcomPromotionCaravelOptPageListBean = (SparkEcomPromotionCaravelOptPageListBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_ecom_promotion_caravel_opt_page_list", SparkEcomPromotionCaravelOptPageListBean.class, C299260BoC.LIZ);
        if (sparkEcomPromotionCaravelOptPageListBean == null || (list = sparkEcomPromotionCaravelOptPageListBean.allowList) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (a0.LJJIIZI(str, (String) it2.next(), false)) {
                z = true;
            }
        }
        return z;
    }
}
