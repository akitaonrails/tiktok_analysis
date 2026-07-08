package X;

import android.os.Bundle;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718590SGr extends AbstractC2238911Ck5<AbsFcpDataPreloadTask<?, ?>, C718350SFt> {
    public static void LIZIZ(List list, C718600SGs c718600SGs) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("standardized_bottom_button", "bottom_button"), new Pair("high_tag_standardized_container", "high_tag"), new Pair("meta_tag_standardized_container", "meta_tag"), new Pair("anchor_template", "anchor"), new Pair("anchor_ucg_template", "anchor"), new Pair("anchor_auto_cut", "anchor"), new Pair("anchor_pugc_template", "anchor"), new Pair("anchor_tt_capcut_template", "anchor"), new Pair("anchor_aigt_template", "anchor"), new Pair("anchor_sgt_template", "anchor"));
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("enter_from", c718600SGs.LIZJ);
        pairArr[1] = new Pair("group_id", c718600SGs.LIZLLL);
        pairArr[2] = new Pair("author_id", c718600SGs.LJ);
        pairArr[3] = new Pair("aweme_type", String.valueOf(c718600SGs.LJFF));
        pairArr[4] = new Pair("aweme_genres", c718600SGs.LJI);
        pairArr[5] = new Pair("component_key", c718600SGs.LIZ);
        Object obj = mapLJIIIIZZ.get(c718600SGs.LIZIZ);
        if (obj == null) {
            obj = c718600SGs.LIZIZ;
        }
        pairArr[6] = new Pair("component_type", obj);
        pairArr[7] = new Pair("url_list", C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        C20684815ws.LJIILLIIL("core_fdmt_component_preload", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // X.AbstractC2238911Ck5
    public final void LIZ(C2238881Ck2<AbsFcpDataPreloadTask<?, ?>> c2238881Ck2, C718350SFt c718350SFt, C1576580r84 c1576580r84) throws IllegalAccessException, InstantiationException {
        List list;
        Bundle bundleLIZ;
        C718600SGs c718600SGs;
        C718600SGs c718600SGs2;
        InterfaceC718610SGt interfaceC718610SGt;
        C718350SFt c718350SFt2 = c718350SFt;
        Class<AbsFcpDataPreloadTask<?, ?>> cls = c2238881Ck2.LIZ;
        Object objInvoke = null;
        if ((cls instanceof Class) && cls != null) {
            AbsFcpDataPreloadTask<?, ?> absFcpDataPreloadTaskNewInstance = cls.newInstance();
            if (c718350SFt2 == null || (list = c718350SFt2.LIZ) == null) {
                list = C13BV.INSTANCE;
            }
            if (list.contains(absFcpDataPreloadTaskNewInstance.componentKey()) && c718350SFt2 != null) {
                Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> map = c718350SFt2.LIZIZ;
                if (map != null && (interfaceC718610SGt = map.get(cls)) != null) {
                    bundleLIZ = interfaceC718610SGt.LIZ();
                } else {
                    bundleLIZ = null;
                    if (c718350SFt2 != null) {
                    }
                    if (bundleLIZ != null || !absFcpDataPreloadTaskNewInstance.enable(bundleLIZ)) {
                    }
                    Map<String, C718600SGs> map2 = c718350SFt2.LIZLLL;
                    if (map2 != null && (c718600SGs = map2.get(absFcpDataPreloadTaskNewInstance.componentKey())) != null) {
                        LIZIZ(absFcpDataPreloadTaskNewInstance.urlList(), c718600SGs);
                    }
                    C1524605y0.LIZ().LIZJ(bundleLIZ, absFcpDataPreloadTaskNewInstance, null, Boolean.FALSE);
                    return;
                }
                Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> map3 = c718350SFt2.LIZJ;
                if (map3 != null && map3.get(cls) != null) {
                    if (absFcpDataPreloadTaskNewInstance.enable(bundleLIZ)) {
                        Function0<Object> function0 = c718350SFt2.LIZJ.get(cls);
                        if (function0 != null) {
                            objInvoke = function0.invoke();
                        }
                        Map<String, C718600SGs> map4 = c718350SFt2.LIZLLL;
                        if (map4 != null && (c718600SGs2 = map4.get(absFcpDataPreloadTaskNewInstance.componentKey())) != null) {
                            LIZIZ(absFcpDataPreloadTaskNewInstance.urlList(), c718600SGs2);
                        }
                        if (objInvoke != null) {
                            c2238881Ck2.LIZLLL = objInvoke;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (bundleLIZ != null) {
                }
            }
        }
    }
}
