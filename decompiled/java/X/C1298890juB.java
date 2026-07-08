package X;

import Y.ARunnableS89S0200000_20;
import com.bytedance.xelement.markdown.MarkdownShadowNode;

/* JADX INFO: renamed from: X.0juB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298890juB {
    public static void LIZIZ(MarkdownShadowNode markdownShadowNode, String str) {
        if (markdownShadowNode != null && markdownShadowNode.LJJIIJZLJL(str)) {
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(markdownShadowNode, new C1289960jfm(markdownShadowNode.LIZIZ, str), 99));
        }
    }

    public static void LIZ(MarkdownShadowNode markdownShadowNode, int i, int i2, int i3) {
        if (markdownShadowNode != null && markdownShadowNode.LJJIIJZLJL("animationStep")) {
            C1289960jfm c1289960jfm = new C1289960jfm(markdownShadowNode.LIZIZ, "animationStep");
            c1289960jfm.LIZIZ(Integer.valueOf(i), "animationStep");
            c1289960jfm.LIZIZ(Integer.valueOf(i2), "maxAnimationStep");
            c1289960jfm.LIZIZ(Integer.valueOf(i3), "contentLength");
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(markdownShadowNode, c1289960jfm, 96));
        }
    }
}
