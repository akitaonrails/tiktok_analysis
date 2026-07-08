package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.SparkEcomOptimizeExperiment;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsBean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt1Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt2Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt3Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt4Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt5Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt6Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt7Bean;
import com.ss.android.ugc.aweme.settings.SparkSwitchSettingsExt8Bean;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1D4O, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D4O {
    public static final C1D4O LIZ = new C1D4O();

    public static final Uri LIZ(String str) {
        Object c098200Yq;
        if (str == null) {
            str = "";
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = Uri.EMPTY;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = uri;
        }
        return (Uri) c098200Yq;
    }

    public static final boolean LIZIZ(String str) {
        Collection collection;
        Iterable iterable;
        Iterable iterable2;
        Iterable iterable3;
        Iterable iterable4;
        Iterable iterable5;
        Iterable iterable6;
        Iterable iterable7;
        Iterable iterable8;
        Iterable iterable9;
        Iterable iterable10;
        Iterable iterable11;
        Iterable iterable12;
        Iterable iterable13;
        Iterable iterable14;
        Iterable iterable15;
        Iterable iterable16;
        Collection collection2;
        Iterable iterable17;
        Iterable iterable18;
        Iterable iterable19;
        Iterable iterable20;
        Iterable iterable21;
        Iterable iterable22;
        Iterable iterable23;
        Iterable iterable24;
        Iterable iterable25;
        Iterable iterable26;
        Iterable iterable27;
        Iterable iterable28;
        Iterable iterable29;
        Iterable iterable30;
        Iterable iterable31;
        Iterable iterable32;
        if ((((SparkWebViewOptimizeExperiment.WebViewOptimizeModel) SparkWebViewOptimizeExperiment.LIZIZ.getValue()).enableCommonOpt || ((SparkEcomOptimizeExperiment.EcomOptimizeModel) SparkEcomOptimizeExperiment.LIZIZ.getValue()).enableSparkUseSparkOpt || C299250BoB.LIZ() == 1 || C299250BoB.LIZ() == 4) && a0.LJJIIZI(str, "use_spark=1", false)) {
            return true;
        }
        SparkSwitchSettingsBean sparkSwitchSettingsBean = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list", SparkSwitchSettingsBean.class, C2249831D4b.LIZ);
        if (sparkSwitchSettingsBean == null || (collection = sparkSwitchSettingsBean.denyList) == null) {
            collection = C13BV.INSTANCE;
        }
        SparkSwitchSettingsExt1Bean sparkSwitchSettingsExt1Bean = (SparkSwitchSettingsExt1Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext1", SparkSwitchSettingsExt1Bean.class, C1D4K.LIZ);
        if (sparkSwitchSettingsExt1Bean == null || (iterable = sparkSwitchSettingsExt1Bean.denyList) == null) {
            iterable = C13BV.INSTANCE;
        }
        List listLJLIL = C13LP.LJLIL(iterable, collection);
        SparkSwitchSettingsExt2Bean sparkSwitchSettingsExt2Bean = (SparkSwitchSettingsExt2Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext2", SparkSwitchSettingsExt2Bean.class, C1D4L.LIZ);
        if (sparkSwitchSettingsExt2Bean == null || (iterable2 = sparkSwitchSettingsExt2Bean.denyList) == null) {
            iterable2 = C13BV.INSTANCE;
        }
        List listLJLIL2 = C13LP.LJLIL(iterable2, listLJLIL);
        SparkSwitchSettingsExt3Bean sparkSwitchSettingsExt3Bean = (SparkSwitchSettingsExt3Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext3", SparkSwitchSettingsExt3Bean.class, C1D4M.LIZ);
        if (sparkSwitchSettingsExt3Bean == null || (iterable3 = sparkSwitchSettingsExt3Bean.denyList) == null) {
            iterable3 = C13BV.INSTANCE;
        }
        List listLJLIL3 = C13LP.LJLIL(iterable3, listLJLIL2);
        SparkSwitchSettingsExt4Bean sparkSwitchSettingsExt4Bean = (SparkSwitchSettingsExt4Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext4", SparkSwitchSettingsExt4Bean.class, C1D4N.LIZ);
        if (sparkSwitchSettingsExt4Bean == null || (iterable4 = sparkSwitchSettingsExt4Bean.denyList) == null) {
            iterable4 = C13BV.INSTANCE;
        }
        List listLJLIL4 = C13LP.LJLIL(iterable4, listLJLIL3);
        SparkSwitchSettingsExt5Bean sparkSwitchSettingsExt5Bean = (SparkSwitchSettingsExt5Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext5", SparkSwitchSettingsExt5Bean.class, C1D4P.LIZ);
        if (sparkSwitchSettingsExt5Bean == null || (iterable5 = sparkSwitchSettingsExt5Bean.denyList) == null) {
            iterable5 = C13BV.INSTANCE;
        }
        List listLJLIL5 = C13LP.LJLIL(iterable5, listLJLIL4);
        SparkSwitchSettingsExt6Bean sparkSwitchSettingsExt6Bean = (SparkSwitchSettingsExt6Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext6", SparkSwitchSettingsExt6Bean.class, C1D4Q.LIZ);
        if (sparkSwitchSettingsExt6Bean == null || (iterable6 = sparkSwitchSettingsExt6Bean.denyList) == null) {
            iterable6 = C13BV.INSTANCE;
        }
        List listLJLIL6 = C13LP.LJLIL(iterable6, listLJLIL5);
        SparkSwitchSettingsExt7Bean sparkSwitchSettingsExt7Bean = (SparkSwitchSettingsExt7Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext7", SparkSwitchSettingsExt7Bean.class, C1D4R.LIZ);
        if (sparkSwitchSettingsExt7Bean == null || (iterable7 = sparkSwitchSettingsExt7Bean.denyList) == null) {
            iterable7 = C13BV.INSTANCE;
        }
        List listLJLIL7 = C13LP.LJLIL(iterable7, listLJLIL6);
        SparkSwitchSettingsExt8Bean sparkSwitchSettingsExt8Bean = (SparkSwitchSettingsExt8Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext8", SparkSwitchSettingsExt8Bean.class, C1D4S.LIZ);
        if (sparkSwitchSettingsExt8Bean == null || (iterable8 = sparkSwitchSettingsExt8Bean.denyList) == null) {
            iterable8 = C13BV.INSTANCE;
        }
        List listLJLIL8 = C13LP.LJLIL(iterable8, listLJLIL7);
        SparkSwitchSettingsBean sparkSwitchSettingsBean2 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext1", SparkSwitchSettingsBean.class, C1D4T.LIZ);
        if (sparkSwitchSettingsBean2 == null || (iterable9 = sparkSwitchSettingsBean2.denyList) == null) {
            iterable9 = C13BV.INSTANCE;
        }
        List listLJLIL9 = C13LP.LJLIL(iterable9, listLJLIL8);
        SparkSwitchSettingsBean sparkSwitchSettingsBean3 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext2", SparkSwitchSettingsBean.class, C1D4U.LIZ);
        if (sparkSwitchSettingsBean3 == null || (iterable10 = sparkSwitchSettingsBean3.denyList) == null) {
            iterable10 = C13BV.INSTANCE;
        }
        List listLJLIL10 = C13LP.LJLIL(iterable10, listLJLIL9);
        SparkSwitchSettingsBean sparkSwitchSettingsBean4 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext3", SparkSwitchSettingsBean.class, C1D4V.LIZ);
        if (sparkSwitchSettingsBean4 == null || (iterable11 = sparkSwitchSettingsBean4.denyList) == null) {
            iterable11 = C13BV.INSTANCE;
        }
        List listLJLIL11 = C13LP.LJLIL(iterable11, listLJLIL10);
        SparkSwitchSettingsBean sparkSwitchSettingsBean5 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext4", SparkSwitchSettingsBean.class, C1D4W.LIZ);
        if (sparkSwitchSettingsBean5 == null || (iterable12 = sparkSwitchSettingsBean5.denyList) == null) {
            iterable12 = C13BV.INSTANCE;
        }
        List listLJLIL12 = C13LP.LJLIL(iterable12, listLJLIL11);
        SparkSwitchSettingsBean sparkSwitchSettingsBean6 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext5", SparkSwitchSettingsBean.class, C1D4X.LIZ);
        if (sparkSwitchSettingsBean6 == null || (iterable13 = sparkSwitchSettingsBean6.denyList) == null) {
            iterable13 = C13BV.INSTANCE;
        }
        List listLJLIL13 = C13LP.LJLIL(iterable13, listLJLIL12);
        SparkSwitchSettingsBean sparkSwitchSettingsBean7 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext6", SparkSwitchSettingsBean.class, C1D4Y.LIZ);
        if (sparkSwitchSettingsBean7 == null || (iterable14 = sparkSwitchSettingsBean7.denyList) == null) {
            iterable14 = C13BV.INSTANCE;
        }
        List listLJLIL14 = C13LP.LJLIL(iterable14, listLJLIL13);
        SparkSwitchSettingsBean sparkSwitchSettingsBean8 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext7", SparkSwitchSettingsBean.class, C1D4Z.LIZ);
        if (sparkSwitchSettingsBean8 == null || (iterable15 = sparkSwitchSettingsBean8.denyList) == null) {
            iterable15 = C13BV.INSTANCE;
        }
        List listLJLIL15 = C13LP.LJLIL(iterable15, listLJLIL14);
        SparkSwitchSettingsBean sparkSwitchSettingsBean9 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext8", SparkSwitchSettingsBean.class, C2249821D4a.LIZ);
        if (sparkSwitchSettingsBean9 == null || (iterable16 = sparkSwitchSettingsBean9.denyList) == null) {
            iterable16 = C13BV.INSTANCE;
        }
        List listLJLIL16 = C13LP.LJLIL(iterable16, listLJLIL15);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : (ArrayList) listLJLIL16) {
            if (!Intrinsics.LJFF(obj, "")) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            for (String str2 : arrayList) {
                if (Intrinsics.LJFF("*", str2) || a0.LJJIIZI(str, str2, false)) {
                    return false;
                }
            }
        }
        SparkSwitchSettingsBean sparkSwitchSettingsBean10 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list", SparkSwitchSettingsBean.class, C2249831D4b.LIZ);
        if (sparkSwitchSettingsBean10 == null || (collection2 = sparkSwitchSettingsBean10.allowList) == null) {
            collection2 = C13BV.INSTANCE;
        }
        SparkSwitchSettingsExt1Bean sparkSwitchSettingsExt1Bean2 = (SparkSwitchSettingsExt1Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext1", SparkSwitchSettingsExt1Bean.class, C1D4K.LIZ);
        if (sparkSwitchSettingsExt1Bean2 == null || (iterable17 = sparkSwitchSettingsExt1Bean2.allowList) == null) {
            iterable17 = C13BV.INSTANCE;
        }
        List listLJLIL17 = C13LP.LJLIL(iterable17, collection2);
        SparkSwitchSettingsExt2Bean sparkSwitchSettingsExt2Bean2 = (SparkSwitchSettingsExt2Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext2", SparkSwitchSettingsExt2Bean.class, C1D4L.LIZ);
        if (sparkSwitchSettingsExt2Bean2 == null || (iterable18 = sparkSwitchSettingsExt2Bean2.allowList) == null) {
            iterable18 = C13BV.INSTANCE;
        }
        List listLJLIL18 = C13LP.LJLIL(iterable18, listLJLIL17);
        SparkSwitchSettingsExt3Bean sparkSwitchSettingsExt3Bean2 = (SparkSwitchSettingsExt3Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext3", SparkSwitchSettingsExt3Bean.class, C1D4M.LIZ);
        if (sparkSwitchSettingsExt3Bean2 == null || (iterable19 = sparkSwitchSettingsExt3Bean2.allowList) == null) {
            iterable19 = C13BV.INSTANCE;
        }
        List listLJLIL19 = C13LP.LJLIL(iterable19, listLJLIL18);
        SparkSwitchSettingsExt4Bean sparkSwitchSettingsExt4Bean2 = (SparkSwitchSettingsExt4Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext4", SparkSwitchSettingsExt4Bean.class, C1D4N.LIZ);
        if (sparkSwitchSettingsExt4Bean2 == null || (iterable20 = sparkSwitchSettingsExt4Bean2.allowList) == null) {
            iterable20 = C13BV.INSTANCE;
        }
        List listLJLIL20 = C13LP.LJLIL(iterable20, listLJLIL19);
        SparkSwitchSettingsExt5Bean sparkSwitchSettingsExt5Bean2 = (SparkSwitchSettingsExt5Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext5", SparkSwitchSettingsExt5Bean.class, C1D4P.LIZ);
        if (sparkSwitchSettingsExt5Bean2 == null || (iterable21 = sparkSwitchSettingsExt5Bean2.allowList) == null) {
            iterable21 = C13BV.INSTANCE;
        }
        List listLJLIL21 = C13LP.LJLIL(iterable21, listLJLIL20);
        SparkSwitchSettingsExt6Bean sparkSwitchSettingsExt6Bean2 = (SparkSwitchSettingsExt6Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext6", SparkSwitchSettingsExt6Bean.class, C1D4Q.LIZ);
        if (sparkSwitchSettingsExt6Bean2 == null || (iterable22 = sparkSwitchSettingsExt6Bean2.allowList) == null) {
            iterable22 = C13BV.INSTANCE;
        }
        List listLJLIL22 = C13LP.LJLIL(iterable22, listLJLIL21);
        SparkSwitchSettingsExt7Bean sparkSwitchSettingsExt7Bean2 = (SparkSwitchSettingsExt7Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext7", SparkSwitchSettingsExt7Bean.class, C1D4R.LIZ);
        if (sparkSwitchSettingsExt7Bean2 == null || (iterable23 = sparkSwitchSettingsExt7Bean2.allowList) == null) {
            iterable23 = C13BV.INSTANCE;
        }
        List listLJLIL23 = C13LP.LJLIL(iterable23, listLJLIL22);
        SparkSwitchSettingsExt8Bean sparkSwitchSettingsExt8Bean2 = (SparkSwitchSettingsExt8Bean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_ext8", SparkSwitchSettingsExt8Bean.class, C1D4S.LIZ);
        if (sparkSwitchSettingsExt8Bean2 == null || (iterable24 = sparkSwitchSettingsExt8Bean2.allowList) == null) {
            iterable24 = C13BV.INSTANCE;
        }
        List listLJLIL24 = C13LP.LJLIL(iterable24, listLJLIL23);
        SparkSwitchSettingsBean sparkSwitchSettingsBean11 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext1", SparkSwitchSettingsBean.class, C1D4T.LIZ);
        if (sparkSwitchSettingsBean11 == null || (iterable25 = sparkSwitchSettingsBean11.allowList) == null) {
            iterable25 = C13BV.INSTANCE;
        }
        List listLJLIL25 = C13LP.LJLIL(iterable25, listLJLIL24);
        SparkSwitchSettingsBean sparkSwitchSettingsBean12 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext2", SparkSwitchSettingsBean.class, C1D4U.LIZ);
        if (sparkSwitchSettingsBean12 == null || (iterable26 = sparkSwitchSettingsBean12.allowList) == null) {
            iterable26 = C13BV.INSTANCE;
        }
        List listLJLIL26 = C13LP.LJLIL(iterable26, listLJLIL25);
        SparkSwitchSettingsBean sparkSwitchSettingsBean13 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext3", SparkSwitchSettingsBean.class, C1D4V.LIZ);
        if (sparkSwitchSettingsBean13 == null || (iterable27 = sparkSwitchSettingsBean13.allowList) == null) {
            iterable27 = C13BV.INSTANCE;
        }
        List listLJLIL27 = C13LP.LJLIL(iterable27, listLJLIL26);
        SparkSwitchSettingsBean sparkSwitchSettingsBean14 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext4", SparkSwitchSettingsBean.class, C1D4W.LIZ);
        if (sparkSwitchSettingsBean14 == null || (iterable28 = sparkSwitchSettingsBean14.allowList) == null) {
            iterable28 = C13BV.INSTANCE;
        }
        List listLJLIL28 = C13LP.LJLIL(iterable28, listLJLIL27);
        SparkSwitchSettingsBean sparkSwitchSettingsBean15 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext5", SparkSwitchSettingsBean.class, C1D4X.LIZ);
        if (sparkSwitchSettingsBean15 == null || (iterable29 = sparkSwitchSettingsBean15.allowList) == null) {
            iterable29 = C13BV.INSTANCE;
        }
        List listLJLIL29 = C13LP.LJLIL(iterable29, listLJLIL28);
        SparkSwitchSettingsBean sparkSwitchSettingsBean16 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext6", SparkSwitchSettingsBean.class, C1D4Y.LIZ);
        if (sparkSwitchSettingsBean16 == null || (iterable30 = sparkSwitchSettingsBean16.allowList) == null) {
            iterable30 = C13BV.INSTANCE;
        }
        List listLJLIL30 = C13LP.LJLIL(iterable30, listLJLIL29);
        SparkSwitchSettingsBean sparkSwitchSettingsBean17 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext7", SparkSwitchSettingsBean.class, C1D4Z.LIZ);
        if (sparkSwitchSettingsBean17 == null || (iterable31 = sparkSwitchSettingsBean17.allowList) == null) {
            iterable31 = C13BV.INSTANCE;
        }
        List listLJLIL31 = C13LP.LJLIL(iterable31, listLJLIL30);
        SparkSwitchSettingsBean sparkSwitchSettingsBean18 = (SparkSwitchSettingsBean) SettingsManager.LIZLLL().LJIIIIZZ("spark_router_switch_list_web_ext8", SparkSwitchSettingsBean.class, C2249821D4a.LIZ);
        if (sparkSwitchSettingsBean18 == null || (iterable32 = sparkSwitchSettingsBean18.allowList) == null) {
            iterable32 = C13BV.INSTANCE;
        }
        List listLJLIL32 = C13LP.LJLIL(iterable32, listLJLIL31);
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj2 : (ArrayList) listLJLIL32) {
            if (!Intrinsics.LJFF(obj2, "")) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str3 : arrayList2) {
                if (Intrinsics.LJFF("*", str3) || a0.LJJIIZI(str, str3, false)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
