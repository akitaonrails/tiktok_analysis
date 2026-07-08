package X;

/* JADX INFO: renamed from: X.19OP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OP {
    public static final boolean[] LIZ = new boolean[3];

    public static final boolean LIZIZ(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void LIZ(C19O9 c19o9, C21531219Oc c21531219Oc, C19OA c19oa) {
        c19oa.mHorizontalResolution = -1;
        c19oa.mVerticalResolution = -1;
        C19O3 c19o3 = c19o9.mListDimensionBehaviors[0];
        C19O3 c19o32 = C19O3.WRAP_CONTENT;
        if (c19o3 != c19o32 && c19oa.mListDimensionBehaviors[0] == C19O3.MATCH_PARENT) {
            int i = c19oa.mLeft.LJI;
            int width = c19o9.getWidth() - c19oa.mRight.LJI;
            C19OG c19og = c19oa.mLeft;
            c19og.LJIIIIZZ = c21531219Oc.LJIIJ(c19og);
            C19OG c19og2 = c19oa.mRight;
            c19og2.LJIIIIZZ = c21531219Oc.LJIIJ(c19og2);
            c21531219Oc.LIZLLL(c19oa.mLeft.LJIIIIZZ, i);
            c21531219Oc.LIZLLL(c19oa.mRight.LJIIIIZZ, width);
            c19oa.mHorizontalResolution = 2;
            c19oa.setHorizontalDimension(i, width);
        }
        if (c19o9.mListDimensionBehaviors[1] != c19o32 && c19oa.mListDimensionBehaviors[1] == C19O3.MATCH_PARENT) {
            int i2 = c19oa.mTop.LJI;
            int height = c19o9.getHeight() - c19oa.mBottom.LJI;
            C19OG c19og3 = c19oa.mTop;
            c19og3.LJIIIIZZ = c21531219Oc.LJIIJ(c19og3);
            C19OG c19og4 = c19oa.mBottom;
            c19og4.LJIIIIZZ = c21531219Oc.LJIIJ(c19og4);
            c21531219Oc.LIZLLL(c19oa.mTop.LJIIIIZZ, i2);
            c21531219Oc.LIZLLL(c19oa.mBottom.LJIIIIZZ, height);
            if (c19oa.mBaselineDistance > 0 || c19oa.mVisibility == 8) {
                C19OG c19og5 = c19oa.mBaseline;
                c19og5.LJIIIIZZ = c21531219Oc.LJIIJ(c19og5);
                c21531219Oc.LIZLLL(c19oa.mBaseline.LJIIIIZZ, c19oa.mBaselineDistance + i2);
            }
            c19oa.mVerticalResolution = 2;
            c19oa.setVerticalDimension(i2, height);
        }
    }
}
