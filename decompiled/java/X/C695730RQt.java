package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.ab.UnifyComponentsMarginConfig;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0RQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695730RQt {
    public static final C01GW LIZ;
    public static final UnifyComponentsMarginConfig LIZIZ;

    static {
        UnifyComponentsMarginConfig unifyComponentsMarginConfig = new UnifyComponentsMarginConfig(false, null, null, null, Boolean.TRUE, null);
        LIZ = C452501pT.LIZIZ(new C695750RQv());
        LIZIZ = (UnifyComponentsMarginConfig) C0C64.LJIILLIIL().LJJIIJ(true, "unify_feed_components_margins", 31744, UnifyComponentsMarginConfig.class, unifyComponentsMarginConfig, 2);
    }

    public static boolean LIZ() {
        return (LIZIZ == null || (C0HCN.LIZJ() || LowScreenOptimizeAB.LIZ())) ? false : true;
    }

    public static ComponentMarginConfig LIZJ(View view, boolean z) {
        ComponentMarginConfig componentMarginConfig;
        UnifyComponentsMarginConfig unifyComponentsMarginConfig = LIZIZ;
        if (unifyComponentsMarginConfig != null) {
            componentMarginConfig = unifyComponentsMarginConfig.lastComponentConfig;
        } else {
            componentMarginConfig = null;
        }
        if (!z) {
            int id = view.getId();
            String str = C0RPZ.LJIIJJI;
            if (id == R.id.elv) {
                if (componentMarginConfig == null) {
                    return null;
                }
                return componentMarginConfig.copy(componentMarginConfig.bottomGap - 4, componentMarginConfig.topGap);
            }
        }
        int id2 = view.getId();
        String str2 = C0RPZ.LJIIJJI;
        if (id2 == R.id.elm) {
            if (componentMarginConfig == null) {
                return null;
            }
            return componentMarginConfig.copy(componentMarginConfig.bottomGap - ConstraintSizeVM.LLILZLL, componentMarginConfig.topGap);
        }
        return componentMarginConfig;
    }

    public static boolean LIZIZ(Context context, Aweme aweme, String str) {
        boolean z;
        String genreType;
        List<String> list;
        List<String> list2;
        UnifyComponentsMarginConfig unifyComponentsMarginConfig = LIZIZ;
        if (unifyComponentsMarginConfig == null || !unifyComponentsMarginConfig.enable || C0HCN.LIZJ() || LowScreenOptimizeAB.LIZ() || aweme == null || C0SXF.LJIL(context)) {
            return false;
        }
        List<String> list3 = unifyComponentsMarginConfig.supportScenes;
        if (list3 != null && C13LP.LJJJJ(str, list3)) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((list2 = unifyComponentsMarginConfig.supportScenes) == null || !list2.contains("all"))) {
            return false;
        }
        if (C2105908Mv.LIZ(AwemeExtKt.getGenreType(aweme))) {
            genreType = "video";
        } else {
            genreType = AwemeExtKt.getGenreType(aweme);
        }
        List<String> list4 = unifyComponentsMarginConfig.supportGenres;
        if (((list4 == null || !list4.contains(genreType)) && ((list = unifyComponentsMarginConfig.supportGenres) == null || !list.contains("all"))) || ((InterfaceC1616630sAf) LIZ.getValue()).LJIIJ().isPad() == 1) {
            return false;
        }
        return true;
    }
}
