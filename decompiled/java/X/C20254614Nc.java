package X;

import com.ss.android.ugc.aweme.nimblecard.tako.model.NimbleViewProps;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Nc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20254614Nc {
    public static final int LIZ(C14NU c14nu) {
        String strLJIJJ;
        TemplateData templateData;
        NimbleViewProps nimbleViewProps;
        String str;
        if (c14nu != null && (templateData = c14nu.LJIIIZ) != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.direction) != null) {
            strLJIJJ = c14nu.LJIJJ(str);
        } else {
            strLJIJJ = null;
        }
        if (Intrinsics.LJFF(strLJIJJ, "vertical") || !Intrinsics.LJFF(strLJIJJ, "horizontal")) {
            return 1;
        }
        return 0;
    }

    public static final int LIZIZ(C14NU c14nu) {
        Object objLJIIZILJ;
        TemplateData templateData;
        NimbleViewProps nimbleViewProps;
        String str;
        if (c14nu != null && (templateData = c14nu.LJIIIZ) != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.endSpacing) != null) {
            objLJIIZILJ = c14nu.LJIIZILJ(str);
        } else {
            objLJIIZILJ = null;
        }
        Float fLIZIZ = C20252814Mk.LIZIZ(objLJIIZILJ);
        if (fLIZIZ != null) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLIZIZ));
        }
        return 0;
    }

    public static final int LIZJ(C14NU c14nu) {
        Object objLJIIZILJ;
        TemplateData templateData;
        NimbleViewProps nimbleViewProps;
        String str;
        if (c14nu != null && (templateData = c14nu.LJIIIZ) != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.startSpacing) != null) {
            objLJIIZILJ = c14nu.LJIIZILJ(str);
        } else {
            objLJIIZILJ = null;
        }
        Float fLIZIZ = C20252814Mk.LIZIZ(objLJIIZILJ);
        if (fLIZIZ != null) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fLIZIZ));
        }
        return 0;
    }

    public static final int LIZLLL(C14NU c14nu) {
        Object objLJIIZILJ;
        TemplateData templateData;
        NimbleViewProps nimbleViewProps;
        String str;
        if (c14nu != null && (templateData = c14nu.LJIIIZ) != null && (nimbleViewProps = templateData.props) != null && (str = nimbleViewProps.spanCount) != null) {
            objLJIIZILJ = c14nu.LJIIZILJ(str);
        } else {
            objLJIIZILJ = null;
        }
        Integer numLIZJ = C20252814Mk.LIZJ(objLJIIZILJ);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }
}
