package X;

import com.ss.android.ugc.feed.platform.ab.AnnotationContainerConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rg1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701870Rg1 {
    public static final AnnotationContainerConfig LIZ = new AnnotationContainerConfig(false, null, false, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(316));

    public static boolean LIZ(String str) {
        String strLJJLIIIJ;
        AnnotationContainerConfig annotationContainerConfig;
        List<String> list;
        List<String> list2;
        AnnotationContainerConfig annotationContainerConfig2;
        C01GW c01gw = LIZIZ;
        AnnotationContainerConfig annotationContainerConfig3 = (AnnotationContainerConfig) c01gw.getValue();
        if (annotationContainerConfig3 != null && annotationContainerConfig3.enable && (annotationContainerConfig2 = (AnnotationContainerConfig) c01gw.getValue()) != null && annotationContainerConfig2.enableAllScenes) {
            return true;
        }
        String str2 = C700080Rd8.LIZIZ.get(str);
        if (str2 == null) {
            str2 = "other_scene";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("target Fcp key: ");
        sbLIZ.append(str2);
        sbLIZ.append("; support:");
        AnnotationContainerConfig annotationContainerConfig4 = (AnnotationContainerConfig) c01gw.getValue();
        if (annotationContainerConfig4 != null && (list2 = annotationContainerConfig4.supportScenes) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list2, null, null, null, 0, null, null, 63);
        } else {
            strLJJLIIIJ = null;
        }
        sbLIZ.append(strLJJLIIIJ);
        C2188811AlT.LIZIZ(sbLIZ);
        AnnotationContainerConfig annotationContainerConfig5 = (AnnotationContainerConfig) c01gw.getValue();
        if (annotationContainerConfig5 == null || !annotationContainerConfig5.enable || (annotationContainerConfig = (AnnotationContainerConfig) c01gw.getValue()) == null || (list = annotationContainerConfig.supportScenes) == null || !list.contains(str2)) {
            return false;
        }
        return true;
    }
}
