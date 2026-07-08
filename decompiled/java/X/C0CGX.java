package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.util.Set;

/* JADX INFO: renamed from: X.0CGX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGX {
    public static final Set<String> LIZ;
    public static final Set<String> LIZIZ;

    static {
        Set<String> setLJ = C093Y.LJ("annotation_container_paid_partnership_label", "annotation_container_label_featured", "annotation_container_bottom_label_aigc", "annotation_container_bottom_label_ad_aigc", "annotation_container_series_purchase_label");
        LIZ = setLJ;
        Set<String> set = (Set) SettingsManager.LIZLLL().LJIIIIZZ("fcp_annotation_bottom_label_priority_list", Set.class, setLJ);
        if (set != null) {
            setLJ = set;
        }
        LIZIZ = setLJ;
    }
}
