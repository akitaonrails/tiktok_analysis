package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RCN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RCN {
    public static final Set<String> LIZ = C093Y.LJ("FeedBottomButtonContainer", "FcpMetaTagContainer", "low_tag", "high_tag");
    public static final Map<String, String> LIZIZ = C2097608Jq.LJIIJ(new Pair("interact_left_area", "interact_left_area"), new Pair("InteractBottomAreaComponent", "interact_bottom_area"), new Pair("InteractRightAreaComponent", "interact_right_area"), new Pair("InteractInfoAreaComponent", "interact_info_area"), new Pair("VideoBottomDescLabelContainer", "bottom_tag_container"), new Pair("InteractTitleContainer", "interact_title_container"), new Pair("VideoTagContainer", "multi_tag_container"));
    public static final Map<String, Function0<String>> LIZJ = new LinkedHashMap();

    public static final String LIZ(String str) {
        String str2;
        Function0 function0 = (Function0) ((LinkedHashMap) LIZJ).get(str);
        if (function0 == null || (str2 = (String) function0.invoke()) == null) {
            return "";
        }
        return str2;
    }

    public static final String LIZIZ(View view, boolean z, String str) {
        GlobalComponentData globalComponentDataLIZIZ;
        String componentKey;
        Map<String, String> map = LIZIZ;
        String str2 = (String) ((LinkedHashMap) map).get(str);
        if (str2 != null) {
            return str2;
        }
        if (view != null && (globalComponentDataLIZIZ = C695740RQu.LIZIZ(view)) != null && (componentKey = globalComponentDataLIZIZ.getComponentKey()) != null) {
            if (z) {
                map.put(str, componentKey);
            }
            return componentKey;
        }
        return "";
    }

    public static final void LIZJ(final View view, final String str, View view2, Function0<Unit> function0) {
        C0R70 c0r70;
        if (view != null && view.getTag(R.id.emi) == null) {
            view.setTag(R.id.emh, Boolean.TRUE);
            if (LIZ.contains(str)) {
                c0r70 = new C0R70(view, str) { // from class: X.0R71
                    @Override // X.C0R70
                    public final String LIZ() {
                        return C0RCN.LIZIZ(this.LIZIZ.get(), false, this.LIZ);
                    }

                    @Override // X.C0R70
                    public final C0R73 LIZIZ() {
                        View view3 = this.LIZIZ.get();
                        if (view3 != null) {
                            if (view3 instanceof ViewGroup) {
                                ViewGroup viewGroup = (ViewGroup) view3;
                                if (viewGroup.getVisibility() == 0 && viewGroup.getHeight() > 0 && viewGroup.getWidth() > 0 && viewGroup.getChildCount() > 0) {
                                    View childAt = viewGroup.getChildAt(0);
                                    if (childAt == null) {
                                        return null;
                                    }
                                    C0R73 c0r73 = this.LIZLLL;
                                    if (c0r73 != null && c0r73.LIZIZ(childAt)) {
                                        return this.LIZLLL;
                                    }
                                    C0R73 c0r73LIZ = C0R72.LIZ(childAt, this.LJFF);
                                    this.LIZLLL = c0r73LIZ;
                                    return c0r73LIZ;
                                }
                            }
                            this.LIZLLL = null;
                        }
                        return null;
                    }
                };
            } else {
                c0r70 = new C0R70(view, str);
            }
            view.setTag(R.id.emi, c0r70);
            C690560R6w.LIZ.getClass();
            C690560R6w.LIZ(c0r70, view, view2);
            LIZJ.put(c0r70.LJFF, new C0RCO(c0r70));
            if (function0 != null) {
                function0.invoke();
            }
        }
    }
}
