package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.19O8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19O8 {
    public static final C21530919Nz LIZ = new C21530919Nz();

    public static boolean LIZ(C19OA c19oa) {
        boolean z;
        boolean z2;
        C19O3 horizontalDimensionBehaviour = c19oa.getHorizontalDimensionBehaviour();
        C19O3 verticalDimensionBehaviour = c19oa.getVerticalDimensionBehaviour();
        C19OA c19oa2 = c19oa.mParent;
        if (c19oa2 != null) {
            c19oa2.getHorizontalDimensionBehaviour();
            c19oa2.getVerticalDimensionBehaviour();
        }
        C19O3 c19o3 = C19O3.FIXED;
        if (horizontalDimensionBehaviour != c19o3 && horizontalDimensionBehaviour != C19O3.WRAP_CONTENT && ((horizontalDimensionBehaviour != C19O3.MATCH_CONSTRAINT || c19oa.mMatchConstraintDefaultWidth != 0 || c19oa.mDimensionRatio != 0.0f || !c19oa.hasDanglingDimension(0)) && !c19oa.isResolvedHorizontally())) {
            z = false;
        } else {
            z = true;
        }
        if (verticalDimensionBehaviour != c19o3 && verticalDimensionBehaviour != C19O3.WRAP_CONTENT && ((verticalDimensionBehaviour != C19O3.MATCH_CONSTRAINT || c19oa.mMatchConstraintDefaultHeight != 0 || c19oa.mDimensionRatio != 0.0f || !c19oa.hasDanglingDimension(1)) && !c19oa.isResolvedVertically())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (c19oa.mDimensionRatio > 0.0f) {
            if (!z && !z2) {
                return false;
            }
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void LJ(C19OA c19oa, C19O0 c19o0) {
        float f = c19oa.mVerticalBiasPercent;
        int iLIZLLL = c19oa.mTop.LJFF.LIZLLL();
        int iLIZLLL2 = c19oa.mBottom.LJFF.LIZLLL();
        int iLJ = c19oa.mTop.LJ() + iLIZLLL;
        int iLJ2 = iLIZLLL2 - c19oa.mBottom.LJ();
        if (iLIZLLL == iLIZLLL2) {
            f = 0.5f;
        } else {
            iLIZLLL = iLJ;
            iLIZLLL2 = iLJ2;
        }
        int height = c19oa.getHeight();
        int i = (iLIZLLL2 - iLIZLLL) - height;
        if (iLIZLLL > iLIZLLL2) {
            i = (iLIZLLL - iLIZLLL2) - height;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = iLIZLLL + i2;
        int i4 = i3 + height;
        if (iLIZLLL > iLIZLLL2) {
            i3 = iLIZLLL - i2;
            i4 = i3 - height;
        }
        c19oa.setFinalVertical(i3, i4);
        LJI(c19oa, c19o0);
    }

    public static void LJI(C19OA c19oa, C19O0 c19o0) {
        boolean z;
        C19OG c19og;
        C19OG c19og2;
        C19OG c19og3;
        C19OG c19og4;
        C19OG c19og5;
        C19OG c19og6;
        if (!(c19oa instanceof C19O9) && c19oa.isMeasureRequested() && LIZ(c19oa)) {
            C19O9.LJIIJJI(c19oa, c19o0, new C21530919Nz());
        }
        C19OG anchor = c19oa.getAnchor(C19OV.TOP);
        C19OG anchor2 = c19oa.getAnchor(C19OV.BOTTOM);
        int iLIZLLL = anchor.LIZLLL();
        int iLIZLLL2 = anchor2.LIZLLL();
        HashSet<C19OG> hashSet = anchor.LIZ;
        if (hashSet != null && anchor.LIZJ) {
            for (C19OG c19og7 : hashSet) {
                C19OA c19oa2 = c19og7.LIZLLL;
                boolean zLIZ = LIZ(c19oa2);
                if (c19oa2.isMeasureRequested() && zLIZ) {
                    C19O9.LJIIJJI(c19oa2, c19o0, new C21530919Nz());
                }
                C19O3 verticalDimensionBehaviour = c19oa2.getVerticalDimensionBehaviour();
                C19O3 c19o3 = C19O3.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour == c19o3 && !zLIZ) {
                    if (c19oa2.getVerticalDimensionBehaviour() == c19o3 && c19oa2.mMatchConstraintMaxHeight >= 0 && c19oa2.mMatchConstraintMinHeight >= 0 && (c19oa2.mVisibility == 8 || (c19oa2.mMatchConstraintDefaultHeight == 0 && c19oa2.mDimensionRatio == 0.0f))) {
                        if (!c19oa2.isInVerticalChain() && !c19oa2.mInVirtuaLayout && ((c19og7 == (c19og4 = c19oa2.mTop) && (c19og6 = c19oa2.mBottom.LJFF) != null && c19og6.LIZJ) || (c19og7 == c19oa2.mBottom && (c19og5 = c19og4.LJFF) != null && c19og5.LIZJ))) {
                            if (!c19oa2.isInVerticalChain()) {
                                LJFF(c19oa, c19o0, c19oa2);
                            }
                        }
                    }
                } else if (!c19oa2.isMeasureRequested()) {
                    C19OG c19og8 = c19oa2.mTop;
                    if (c19og7 == c19og8 && c19oa2.mBottom.LJFF == null) {
                        int iLJ = c19og8.LJ() + iLIZLLL;
                        c19oa2.setFinalVertical(iLJ, c19oa2.getHeight() + iLJ);
                        LJI(c19oa2, c19o0);
                    } else {
                        C19OG c19og9 = c19oa2.mBottom;
                        if (c19og7 == c19og9 && c19og9.LJFF == null) {
                            int iLJ2 = iLIZLLL - c19og9.LJ();
                            c19oa2.setFinalVertical(iLJ2 - c19oa2.getHeight(), iLJ2);
                            LJI(c19oa2, c19o0);
                        } else if (c19og7 == c19og8 && (c19og3 = c19og9.LJFF) != null && c19og3.LIZJ) {
                            LJ(c19oa2, c19o0);
                        }
                    }
                }
            }
        }
        if (c19oa instanceof C19OI) {
            return;
        }
        HashSet<C19OG> hashSet2 = anchor2.LIZ;
        if (hashSet2 != null && anchor2.LIZJ) {
            for (C19OG c19og10 : hashSet2) {
                C19OA c19oa3 = c19og10.LIZLLL;
                boolean zLIZ2 = LIZ(c19oa3);
                if (c19oa3.isMeasureRequested() && zLIZ2) {
                    C19O9.LJIIJJI(c19oa3, c19o0, new C21530919Nz());
                }
                C19OG c19og11 = c19oa3.mTop;
                if ((c19og10 == c19og11 && (c19og2 = c19oa3.mBottom.LJFF) != null && c19og2.LIZJ) || (c19og10 == c19oa3.mBottom && (c19og = c19og11.LJFF) != null && c19og.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                C19O3 verticalDimensionBehaviour2 = c19oa3.getVerticalDimensionBehaviour();
                C19O3 c19o32 = C19O3.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour2 == c19o32 && !zLIZ2) {
                    if (c19oa3.getVerticalDimensionBehaviour() == c19o32 && c19oa3.mMatchConstraintMaxHeight >= 0 && c19oa3.mMatchConstraintMinHeight >= 0 && (c19oa3.mVisibility == 8 || (c19oa3.mMatchConstraintDefaultHeight == 0 && c19oa3.mDimensionRatio == 0.0f))) {
                        if (!c19oa3.isInVerticalChain() && !c19oa3.mInVirtuaLayout && z && !c19oa3.isInVerticalChain()) {
                            LJFF(c19oa, c19o0, c19oa3);
                        }
                    }
                } else if (!c19oa3.isMeasureRequested()) {
                    C19OG c19og12 = c19oa3.mTop;
                    if (c19og10 == c19og12 && c19oa3.mBottom.LJFF == null) {
                        int iLJ3 = c19og12.LJ() + iLIZLLL2;
                        c19oa3.setFinalVertical(iLJ3, c19oa3.getHeight() + iLJ3);
                        LJI(c19oa3, c19o0);
                    } else {
                        C19OG c19og13 = c19oa3.mBottom;
                        if (c19og10 == c19og13 && c19og12.LJFF == null) {
                            int iLJ4 = iLIZLLL2 - c19og13.LJ();
                            c19oa3.setFinalVertical(iLJ4 - c19oa3.getHeight(), iLJ4);
                            LJI(c19oa3, c19o0);
                        } else if (z && !c19oa3.isInVerticalChain()) {
                            LJ(c19oa3, c19o0);
                        }
                    }
                }
            }
        }
        C19OG anchor3 = c19oa.getAnchor(C19OV.BASELINE);
        if (anchor3.LIZ != null && anchor3.LIZJ) {
            int iLIZLLL3 = anchor3.LIZLLL();
            for (C19OG c19og14 : anchor3.LIZ) {
                C19OA c19oa4 = c19og14.LIZLLL;
                boolean zLIZ3 = LIZ(c19oa4);
                if (c19oa4.isMeasureRequested() && zLIZ3) {
                    C19O9.LJIIJJI(c19oa4, c19o0, new C21530919Nz());
                }
                if (c19oa4.getVerticalDimensionBehaviour() != C19O3.MATCH_CONSTRAINT || zLIZ3) {
                    if (!c19oa4.isMeasureRequested() && c19og14 == c19oa4.mBaseline) {
                        c19oa4.setFinalBaseline(iLIZLLL3);
                        LJI(c19oa4, c19o0);
                    }
                }
            }
        }
    }

    public static void LIZIZ(C19OA c19oa, C19O0 c19o0, boolean z) {
        HashSet<C19OG> hashSet;
        boolean z2;
        C19OG c19og;
        C19OG c19og2;
        C19OG c19og3;
        C19OG c19og4;
        C19OG c19og5;
        C19OG c19og6;
        if (!(c19oa instanceof C19O9) && c19oa.isMeasureRequested() && LIZ(c19oa)) {
            C19O9.LJIIJJI(c19oa, c19o0, new C21530919Nz());
        }
        C19OG anchor = c19oa.getAnchor(C19OV.LEFT);
        C19OG anchor2 = c19oa.getAnchor(C19OV.RIGHT);
        int iLIZLLL = anchor.LIZLLL();
        int iLIZLLL2 = anchor2.LIZLLL();
        HashSet<C19OG> hashSet2 = anchor.LIZ;
        if (hashSet2 != null && anchor.LIZJ) {
            for (C19OG c19og7 : hashSet2) {
                C19OA c19oa2 = c19og7.LIZLLL;
                boolean zLIZ = LIZ(c19oa2);
                if (c19oa2.isMeasureRequested() && zLIZ) {
                    C19O9.LJIIJJI(c19oa2, c19o0, new C21530919Nz());
                }
                C19O3 horizontalDimensionBehaviour = c19oa2.getHorizontalDimensionBehaviour();
                C19O3 c19o3 = C19O3.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour == c19o3 && !zLIZ) {
                    if (c19oa2.getHorizontalDimensionBehaviour() == c19o3 && c19oa2.mMatchConstraintMaxWidth >= 0 && c19oa2.mMatchConstraintMinWidth >= 0 && (c19oa2.mVisibility == 8 || (c19oa2.mMatchConstraintDefaultWidth == 0 && c19oa2.mDimensionRatio == 0.0f))) {
                        if (!c19oa2.isInHorizontalChain() && !c19oa2.mInVirtuaLayout && ((c19og7 == (c19og4 = c19oa2.mLeft) && (c19og6 = c19oa2.mRight.LJFF) != null && c19og6.LIZJ) || (c19og7 == c19oa2.mRight && (c19og5 = c19og4.LJFF) != null && c19og5.LIZJ))) {
                            if (!c19oa2.isInHorizontalChain()) {
                                LIZLLL(c19oa, c19o0, c19oa2, z);
                            }
                        }
                    }
                } else if (!c19oa2.isMeasureRequested()) {
                    C19OG c19og8 = c19oa2.mLeft;
                    if (c19og7 == c19og8 && c19oa2.mRight.LJFF == null) {
                        int iLJ = c19og8.LJ() + iLIZLLL;
                        c19oa2.setFinalHorizontal(iLJ, c19oa2.getWidth() + iLJ);
                        LIZIZ(c19oa2, c19o0, z);
                    } else {
                        C19OG c19og9 = c19oa2.mRight;
                        if (c19og7 == c19og9 && c19og8.LJFF == null) {
                            int iLJ2 = iLIZLLL - c19og9.LJ();
                            c19oa2.setFinalHorizontal(iLJ2 - c19oa2.getWidth(), iLJ2);
                            LIZIZ(c19oa2, c19o0, z);
                        } else if (c19og7 == c19og8 && (c19og3 = c19og9.LJFF) != null && c19og3.LIZJ && !c19oa2.isInHorizontalChain()) {
                            LIZJ(c19oa2, c19o0, z);
                        }
                    }
                }
            }
        }
        if (!(c19oa instanceof C19OI) && (hashSet = anchor2.LIZ) != null && anchor2.LIZJ) {
            for (C19OG c19og10 : hashSet) {
                C19OA c19oa3 = c19og10.LIZLLL;
                boolean zLIZ2 = LIZ(c19oa3);
                if (c19oa3.isMeasureRequested() && zLIZ2) {
                    C19O9.LJIIJJI(c19oa3, c19o0, new C21530919Nz());
                }
                C19OG c19og11 = c19oa3.mLeft;
                if ((c19og10 == c19og11 && (c19og2 = c19oa3.mRight.LJFF) != null && c19og2.LIZJ) || (c19og10 == c19oa3.mRight && (c19og = c19og11.LJFF) != null && c19og.LIZJ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C19O3 horizontalDimensionBehaviour2 = c19oa3.getHorizontalDimensionBehaviour();
                C19O3 c19o32 = C19O3.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour2 == c19o32 && !zLIZ2) {
                    if (c19oa3.getHorizontalDimensionBehaviour() == c19o32 && c19oa3.mMatchConstraintMaxWidth >= 0 && c19oa3.mMatchConstraintMinWidth >= 0 && (c19oa3.mVisibility == 8 || (c19oa3.mMatchConstraintDefaultWidth == 0 && c19oa3.mDimensionRatio == 0.0f))) {
                        if (!c19oa3.isInHorizontalChain() && !c19oa3.mInVirtuaLayout && z2 && !c19oa3.isInHorizontalChain()) {
                            LIZLLL(c19oa, c19o0, c19oa3, z);
                        }
                    }
                } else if (!c19oa3.isMeasureRequested()) {
                    C19OG c19og12 = c19oa3.mLeft;
                    if (c19og10 == c19og12 && c19oa3.mRight.LJFF == null) {
                        int iLJ3 = c19og12.LJ() + iLIZLLL2;
                        c19oa3.setFinalHorizontal(iLJ3, c19oa3.getWidth() + iLJ3);
                        LIZIZ(c19oa3, c19o0, z);
                    } else {
                        C19OG c19og13 = c19oa3.mRight;
                        if (c19og10 == c19og13 && c19og12.LJFF == null) {
                            int iLJ4 = iLIZLLL2 - c19og13.LJ();
                            c19oa3.setFinalHorizontal(iLJ4 - c19oa3.getWidth(), iLJ4);
                            LIZIZ(c19oa3, c19o0, z);
                        } else if (z2 && !c19oa3.isInHorizontalChain()) {
                            LIZJ(c19oa3, c19o0, z);
                        }
                    }
                }
            }
        }
    }

    public static void LIZJ(C19OA c19oa, C19O0 c19o0, boolean z) {
        float f = c19oa.mHorizontalBiasPercent;
        int iLIZLLL = c19oa.mLeft.LJFF.LIZLLL();
        int iLIZLLL2 = c19oa.mRight.LJFF.LIZLLL();
        int iLJ = c19oa.mLeft.LJ() + iLIZLLL;
        int iLJ2 = iLIZLLL2 - c19oa.mRight.LJ();
        if (iLIZLLL == iLIZLLL2) {
            f = 0.5f;
        } else {
            iLIZLLL = iLJ;
            iLIZLLL2 = iLJ2;
        }
        int width = c19oa.getWidth();
        int i = (iLIZLLL2 - iLIZLLL) - width;
        if (iLIZLLL > iLIZLLL2) {
            i = (iLIZLLL - iLIZLLL2) - width;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + iLIZLLL;
        int i3 = i2 + width;
        if (iLIZLLL > iLIZLLL2) {
            i3 = i2 - width;
        }
        c19oa.setFinalHorizontal(i2, i3);
        LIZIZ(c19oa, c19o0, z);
    }

    public static void LJFF(C19OA c19oa, C19O0 c19o0, C19OA c19oa2) {
        int height;
        float f = c19oa2.mVerticalBiasPercent;
        int iLIZLLL = c19oa2.mTop.LJFF.LIZLLL() + c19oa2.mTop.LJ();
        int iLIZLLL2 = c19oa2.mBottom.LJFF.LIZLLL() - c19oa2.mBottom.LJ();
        if (iLIZLLL2 >= iLIZLLL) {
            int height2 = c19oa2.getHeight();
            if (c19oa2.mVisibility != 8) {
                int i = c19oa2.mMatchConstraintDefaultHeight;
                if (i == 2) {
                    if (c19oa instanceof C19O9) {
                        height = c19oa.getHeight();
                    } else {
                        height = c19oa.mParent.getHeight();
                    }
                    height2 = (int) (f * 0.5f * height);
                } else if (i == 0) {
                    height2 = iLIZLLL2 - iLIZLLL;
                }
                height2 = Math.max(c19oa2.mMatchConstraintMinHeight, height2);
                int i2 = c19oa2.mMatchConstraintMaxHeight;
                if (i2 > 0) {
                    height2 = Math.min(i2, height2);
                }
            }
            int i3 = iLIZLLL + ((int) ((f * ((iLIZLLL2 - iLIZLLL) - height2)) + 0.5f));
            c19oa2.setFinalVertical(i3, height2 + i3);
            LJI(c19oa2, c19o0);
        }
    }

    public static void LIZLLL(C19OA c19oa, C19O0 c19o0, C19OA c19oa2, boolean z) {
        int width;
        float f = c19oa2.mHorizontalBiasPercent;
        int iLIZLLL = c19oa2.mLeft.LJFF.LIZLLL() + c19oa2.mLeft.LJ();
        int iLIZLLL2 = c19oa2.mRight.LJFF.LIZLLL() - c19oa2.mRight.LJ();
        if (iLIZLLL2 >= iLIZLLL) {
            int width2 = c19oa2.getWidth();
            if (c19oa2.mVisibility != 8) {
                int i = c19oa2.mMatchConstraintDefaultWidth;
                if (i == 2) {
                    if (c19oa instanceof C19O9) {
                        width = c19oa.getWidth();
                    } else {
                        width = c19oa.mParent.getWidth();
                    }
                    width2 = (int) (c19oa2.mHorizontalBiasPercent * 0.5f * width);
                } else if (i == 0) {
                    width2 = iLIZLLL2 - iLIZLLL;
                }
                width2 = Math.max(c19oa2.mMatchConstraintMinWidth, width2);
                int i2 = c19oa2.mMatchConstraintMaxWidth;
                if (i2 > 0) {
                    width2 = Math.min(i2, width2);
                }
            }
            int i3 = iLIZLLL + ((int) ((f * ((iLIZLLL2 - iLIZLLL) - width2)) + 0.5f));
            c19oa2.setFinalHorizontal(i3, width2 + i3);
            LIZIZ(c19oa2, c19o0, z);
        }
    }
}
