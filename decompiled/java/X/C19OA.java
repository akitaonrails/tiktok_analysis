package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.19OA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19OA {
    public static float DEFAULT_BIAS = 0.5f;
    public boolean OPTIMIZE_WRAP;
    public boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public boolean hasBaseline;
    public C19OC horizontalChainRun;
    public int horizontalGroup;
    public C19OD horizontalRun;
    public boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    public ArrayList<C19OG> mAnchors;
    public C19OG mBaseline;
    public int mBaselineDistance;
    public C19OG mBottom;
    public boolean mBottomHasCentered;
    public C19OG mCenter;
    public C19OG mCenterX;
    public C19OG mCenterY;
    public float mCircleConstraintAngle;
    public Object mCompanionWidget;
    public int mContainerItemSkip;
    public String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mDistToBottom;
    public int mDistToLeft;
    public int mDistToRight;
    public int mDistToTop;
    public boolean mGroupsToSolver;
    public int mHeight;
    public float mHorizontalBiasPercent;
    public boolean mHorizontalChainFixedPosition;
    public int mHorizontalChainStyle;
    public C19OA mHorizontalNextWidget;
    public int mHorizontalResolution;
    public boolean mHorizontalWrapVisited;
    public boolean mInVirtuaLayout;
    public boolean mIsHeightWrapContent;
    public boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    public int mLastHorizontalMeasureSpec;
    public int mLastVerticalMeasureSpec;
    public C19OG mLeft;
    public boolean mLeftHasCentered;
    public C19OG[] mListAnchors;
    public C19O3[] mListDimensionBehaviors;
    public C19OA[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    public int[] mMaxDimension;
    public boolean mMeasureRequested;
    public int mMinHeight;
    public int mMinWidth;
    public C19OA[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public C19OA mParent;
    public int mRelX;
    public int mRelY;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public boolean mResolvedHasRatio;
    public int[] mResolvedMatchConstraintDefault;
    public C19OG mRight;
    public boolean mRightHasCentered;
    public C19OG mTop;
    public boolean mTopHasCentered;
    public String mType;
    public float mVerticalBiasPercent;
    public boolean mVerticalChainFixedPosition;
    public int mVerticalChainStyle;
    public C19OA mVerticalNextWidget;
    public int mVerticalResolution;
    public boolean mVerticalWrapVisited;
    public int mVisibility;
    public float[] mWeight;
    public int mWidth;
    public int mX;
    public int mY;
    public boolean measured;
    public boolean resolvedHorizontal;
    public boolean resolvedVertical;
    public C19OF[] run;
    public C19OC verticalChainRun;
    public int verticalGroup;
    public C19OE verticalRun;

    public void ensureMeasureRequested() {
        this.mMeasureRequested = true;
    }

    public void resetFinalResolution() {
        this.resolvedHorizontal = false;
        this.resolvedVertical = false;
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            C19OG c19og = (C19OG) ListProtector.get(this.mAnchors, i);
            c19og.LIZJ = false;
            c19og.LIZIZ = 0;
        }
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public boolean addFirst() {
        return (this instanceof C21530419Nu) || (this instanceof C19OI);
    }

    public boolean allowedInBarrier() {
        return this.mVisibility != 8;
    }

    public void ensureWidgetRuns() {
        if (this.horizontalRun == null) {
            this.horizontalRun = new C19OD(this);
        }
        if (this.verticalRun == null) {
            this.verticalRun = new C19OE(this);
        }
    }

    public int getHeight() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mHeight;
    }

    public C19O3 getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getHorizontalMargin() {
        C19OG c19og = this.mLeft;
        int i = c19og != null ? 0 + c19og.LJI : 0;
        C19OG c19og2 = this.mRight;
        return c19og2 != null ? i + c19og2.LJI : i;
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getOptimizerWrapHeight() {
        int iMax = this.mHeight;
        if (this.mListDimensionBehaviors[1] == C19O3.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultHeight == 1) {
                iMax = Math.max(this.mMatchConstraintMinHeight, iMax);
            } else {
                iMax = this.mMatchConstraintMinHeight;
                if (iMax > 0) {
                    this.mHeight = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.mMatchConstraintMaxHeight;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public int getOptimizerWrapWidth() {
        int iMax = this.mWidth;
        if (this.mListDimensionBehaviors[0] == C19O3.MATCH_CONSTRAINT) {
            if (this.mMatchConstraintDefaultWidth == 1) {
                iMax = Math.max(this.mMatchConstraintMinWidth, iMax);
            } else {
                iMax = this.mMatchConstraintMinWidth;
                if (iMax > 0) {
                    this.mWidth = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i = this.mMatchConstraintMaxWidth;
            if (i > 0 && i < iMax) {
                return i;
            }
        }
        return iMax;
    }

    public int getRootX() {
        return this.mX + this.mOffsetX;
    }

    public int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public C19O3 getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVerticalMargin() {
        int i = this.mLeft != null ? 0 + this.mTop.LJI : 0;
        return this.mRight != null ? i + this.mBottom.LJI : i;
    }

    public int getWidth() {
        if (this.mVisibility == 8) {
            return 0;
        }
        return this.mWidth;
    }

    public int getX() {
        C19OA c19oa = this.mParent;
        return (c19oa == null || !(c19oa instanceof C19O9)) ? this.mX : ((C19O9) c19oa).LJI + this.mX;
    }

    public int getY() {
        C19OA c19oa = this.mParent;
        return (c19oa == null || !(c19oa instanceof C19O9)) ? this.mY : ((C19O9) c19oa).LJII + this.mY;
    }

    public boolean hasDependencies() {
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            HashSet<C19OG> hashSet = ((C19OG) ListProtector.get(this.mAnchors, i)).LIZ;
            if (hashSet != null && hashSet.size() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isInHorizontalChain() {
        C19OG c19og = this.mLeft;
        C19OG c19og2 = c19og.LJFF;
        if (c19og2 != null && c19og2.LJFF == c19og) {
            return true;
        }
        C19OG c19og3 = this.mRight;
        C19OG c19og4 = c19og3.LJFF;
        return c19og4 != null && c19og4.LJFF == c19og3;
    }

    public boolean isInVerticalChain() {
        C19OG c19og = this.mTop;
        C19OG c19og2 = c19og.LJFF;
        if (c19og2 != null && c19og2.LJFF == c19og) {
            return true;
        }
        C19OG c19og3 = this.mBottom;
        C19OG c19og4 = c19og3.LJFF;
        return c19og4 != null && c19og4.LJFF == c19og3;
    }

    public boolean isMeasureRequested() {
        return this.mMeasureRequested && this.mVisibility != 8;
    }

    public boolean isResolvedHorizontally() {
        if (this.resolvedHorizontal) {
            return true;
        }
        return this.mLeft.LIZJ && this.mRight.LIZJ;
    }

    public boolean isResolvedVertically() {
        if (this.resolvedVertical) {
            return true;
        }
        return this.mTop.LIZJ && this.mBottom.LIZJ;
    }

    public boolean isRoot() {
        return this.mParent == null;
    }

    public boolean isSpreadHeight() {
        return this.mMatchConstraintDefaultHeight == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinHeight == 0 && this.mMatchConstraintMaxHeight == 0 && this.mListDimensionBehaviors[1] == C19O3.MATCH_CONSTRAINT;
    }

    public boolean isSpreadWidth() {
        return this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0.0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == C19O3.MATCH_CONSTRAINT;
    }

    public boolean oppositeDimensionsTied() {
        C19O3[] c19o3Arr = this.mListDimensionBehaviors;
        C19O3 c19o3 = c19o3Arr[0];
        C19O3 c19o32 = C19O3.MATCH_CONSTRAINT;
        return c19o3 == c19o32 && c19o3Arr[1] == c19o32;
    }

    public void reset() {
        this.mLeft.LJIIIZ();
        this.mTop.LJIIIZ();
        this.mRight.LJIIIZ();
        this.mBottom.LJIIIZ();
        this.mBaseline.LJIIIZ();
        this.mCenterX.LJIIIZ();
        this.mCenterY.LJIIIZ();
        this.mCenter.LJIIIZ();
        this.mParent = null;
        this.mCircleConstraintAngle = 0.0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        C19O3[] c19o3Arr = this.mListDimensionBehaviors;
        C19O3 c19o3 = C19O3.FIXED;
        c19o3Arr[0] = c19o3;
        c19o3Arr[1] = c19o3;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mMatchConstraintMaxWidth = Integer.MAX_VALUE;
        this.mMatchConstraintMaxHeight = Integer.MAX_VALUE;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedHasRatio = false;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mGroupsToSolver = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.mInVirtuaLayout = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.mMeasureRequested = true;
    }

    public void resetAnchors() {
        C19OA c19oa = this.mParent;
        if (c19oa != null && (c19oa instanceof C19O9)) {
            c19oa.getClass();
        }
        int size = this.mAnchors.size();
        for (int i = 0; i < size; i++) {
            ((C19OG) ListProtector.get(this.mAnchors, i)).LJIIIZ();
        }
    }

    public C19OA() {
        this.run = new C19OF[2];
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        C19OG c19og = new C19OG(this, C19OV.LEFT);
        this.mLeft = c19og;
        C19OG c19og2 = new C19OG(this, C19OV.TOP);
        this.mTop = c19og2;
        C19OG c19og3 = new C19OG(this, C19OV.RIGHT);
        this.mRight = c19og3;
        C19OG c19og4 = new C19OG(this, C19OV.BOTTOM);
        this.mBottom = c19og4;
        C19OG c19og5 = new C19OG(this, C19OV.BASELINE);
        this.mBaseline = c19og5;
        this.mCenterX = new C19OG(this, C19OV.CENTER_X);
        this.mCenterY = new C19OG(this, C19OV.CENTER_Y);
        C19OG c19og6 = new C19OG(this, C19OV.CENTER);
        this.mCenter = c19og6;
        this.mListAnchors = new C19OG[]{c19og, c19og3, c19og2, c19og4, c19og5, c19og6};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        C19O3 c19o3 = C19O3.FIXED;
        this.mListDimensionBehaviors = new C19O3[]{c19o3, c19o3};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new C19OA[]{null, null};
        this.mNextChainWidget = new C19OA[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
    }

    public int getBottom() {
        return getY() + this.mHeight;
    }

    public C19OA getHorizontalChainControlWidget() {
        C19OA c19oa;
        C19OG c19og;
        if (isInHorizontalChain()) {
            C19OA c19oa2 = this;
            do {
                C19OG anchor = c19oa2.getAnchor(C19OV.LEFT);
                c19oa = (anchor == null || (c19og = anchor.LJFF) == null) ? null : c19og.LIZLLL;
                if (c19oa == this.mParent) {
                    return c19oa2;
                }
                if (c19oa == null) {
                    break;
                }
                C19OG c19og2 = c19oa.getAnchor(C19OV.RIGHT).LJFF;
                if (c19og2 != null && c19og2.LIZLLL != c19oa2) {
                    return c19oa2;
                }
                c19oa2 = c19oa;
            } while (c19oa != null);
        }
        return null;
    }

    public int getLeft() {
        return getX();
    }

    public int getRight() {
        return getX() + this.mWidth;
    }

    public int getTop() {
        return getY();
    }

    public C19OA getVerticalChainControlWidget() {
        C19OA c19oa;
        C19OG c19og;
        if (isInVerticalChain()) {
            C19OA c19oa2 = this;
            do {
                C19OG anchor = c19oa2.getAnchor(C19OV.TOP);
                c19oa = (anchor == null || (c19og = anchor.LJFF) == null) ? null : c19og.LIZLLL;
                if (c19oa == this.mParent) {
                    return c19oa2;
                }
                if (c19oa == null) {
                    break;
                }
                C19OG c19og2 = c19oa.getAnchor(C19OV.BOTTOM).LJFF;
                if (c19og2 != null && c19og2.LIZLLL != c19oa2) {
                    return c19oa2;
                }
                c19oa2 = c19oa;
            } while (c19oa != null);
        }
        return null;
    }

    public void resetAllConstraints() {
        resetAnchors();
        float f = DEFAULT_BIAS;
        this.mVerticalBiasPercent = f;
        this.mHorizontalBiasPercent = f;
    }

    public String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZIZ2 = "";
        if (this.mType != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("type: ");
            sbLIZ2.append(this.mType);
            sbLIZ2.append(" ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        if (this.mDebugName != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("id: ");
            sbLIZ3.append(this.mDebugName);
            sbLIZ3.append(" ");
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        sbLIZ.append(strLIZIZ2);
        sbLIZ.append(e3.h);
        sbLIZ.append(this.mX);
        sbLIZ.append(", ");
        sbLIZ.append(this.mY);
        sbLIZ.append(") - (");
        sbLIZ.append(this.mWidth);
        sbLIZ.append(" x ");
        sbLIZ.append(this.mHeight);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ArrayList<C19OG> getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public boolean getHasBaseline() {
        return this.hasBaseline;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.mLastHorizontalMeasureSpec;
    }

    public int getLastVerticalMeasureSpec() {
        return this.mLastVerticalMeasureSpec;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public C19OA getParent() {
        return this.mParent;
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public boolean hasBaseline() {
        return this.hasBaseline;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInPlaceholder() {
        return this.inPlaceholder;
    }

    public boolean isInVirtualLayout() {
        return this.mInVirtuaLayout;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public C19OA(String str) {
        this.run = new C19OF[2];
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        C19OG c19og = new C19OG(this, C19OV.LEFT);
        this.mLeft = c19og;
        C19OG c19og2 = new C19OG(this, C19OV.TOP);
        this.mTop = c19og2;
        C19OG c19og3 = new C19OG(this, C19OV.RIGHT);
        this.mRight = c19og3;
        C19OG c19og4 = new C19OG(this, C19OV.BOTTOM);
        this.mBottom = c19og4;
        C19OG c19og5 = new C19OG(this, C19OV.BASELINE);
        this.mBaseline = c19og5;
        this.mCenterX = new C19OG(this, C19OV.CENTER_X);
        this.mCenterY = new C19OG(this, C19OV.CENTER_Y);
        C19OG c19og6 = new C19OG(this, C19OV.CENTER);
        this.mCenter = c19og6;
        this.mListAnchors = new C19OG[]{c19og, c19og3, c19og2, c19og4, c19og5, c19og6};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        C19O3 c19o3 = C19O3.FIXED;
        this.mListDimensionBehaviors = new C19O3[]{c19o3, c19o3};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new C19OA[]{null, null};
        this.mNextChainWidget = new C19OA[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        addAnchors();
        this.mDebugName = str;
    }

    private boolean isChainHead(int i) {
        C19OG c19og;
        C19OG c19og2;
        int i2 = i * 2;
        C19OG[] c19ogArr = this.mListAnchors;
        C19OG c19og3 = c19ogArr[i2];
        C19OG c19og4 = c19og3.LJFF;
        if (c19og4 != null && c19og4.LJFF != c19og3 && (c19og2 = (c19og = c19ogArr[i2 + 1]).LJFF) != null && c19og2.LJFF == c19og) {
            return true;
        }
        return false;
    }

    public void createObjectVariables(C21531219Oc c21531219Oc) {
        c21531219Oc.LJIIJ(this.mLeft);
        c21531219Oc.LJIIJ(this.mTop);
        c21531219Oc.LJIIJ(this.mRight);
        c21531219Oc.LJIIJ(this.mBottom);
        if (this.mBaselineDistance > 0) {
            c21531219Oc.LJIIJ(this.mBaseline);
        }
    }

    public C19OG getAnchor(C19OV c19ov) {
        switch (C19OQ.LIZ[c19ov.ordinal()]) {
            case 1:
                return this.mLeft;
            case 2:
                return this.mTop;
            case 3:
                return this.mRight;
            case 4:
                return this.mBottom;
            case 5:
                return this.mBaseline;
            case 6:
                return this.mCenter;
            case 7:
                return this.mCenterX;
            case 8:
                return this.mCenterY;
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
            default:
                throw new AssertionError(c19ov.name());
        }
    }

    public float getBiasPercent(int i) {
        if (i == 0) {
            return this.mHorizontalBiasPercent;
        }
        if (i == 1) {
            return this.mVerticalBiasPercent;
        }
        return -1.0f;
    }

    public C19O3 getDimensionBehaviour(int i) {
        if (i == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public int getLength(int i) {
        if (i == 0) {
            return getWidth();
        }
        if (i == 1) {
            return getHeight();
        }
        return 0;
    }

    public C19OA getNextChainMember(int i) {
        C19OG c19og;
        C19OG c19og2;
        if (i == 0) {
            C19OG c19og3 = this.mRight;
            C19OG c19og4 = c19og3.LJFF;
            if (c19og4 != null && c19og4.LJFF == c19og3) {
                return c19og4.LIZLLL;
            }
            return null;
        }
        if (i == 1 && (c19og2 = (c19og = this.mBottom).LJFF) != null && c19og2.LJFF == c19og) {
            return c19og2.LIZLLL;
        }
        return null;
    }

    public C19OA getPreviousChainMember(int i) {
        C19OG c19og;
        C19OG c19og2;
        if (i == 0) {
            C19OG c19og3 = this.mLeft;
            C19OG c19og4 = c19og3.LJFF;
            if (c19og4 != null && c19og4.LJFF == c19og3) {
                return c19og4.LIZLLL;
            }
            return null;
        }
        if (i == 1 && (c19og2 = (c19og = this.mTop).LJFF) != null && c19og2.LJFF == c19og) {
            return c19og2.LIZLLL;
        }
        return null;
    }

    public int getRelativePositioning(int i) {
        if (i == 0) {
            return this.mRelX;
        }
        if (i == 1) {
            return this.mRelY;
        }
        return 0;
    }

    public C19OF getRun(int i) {
        if (i == 0) {
            return this.horizontalRun;
        }
        if (i == 1) {
            return this.verticalRun;
        }
        return null;
    }

    public boolean hasDanglingDimension(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            if (this.mLeft.LJFF != null) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            if (this.mRight.LJFF != null) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i5 + i6 < 2) {
                return true;
            }
            return false;
        }
        if (this.mTop.LJFF != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (this.mBottom.LJFF != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i7 = i2 + i3;
        if (this.mBaseline.LJFF != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (i7 + i4 < 2) {
            return true;
        }
        return false;
    }

    public boolean oppositeDimensionDependsOn(int i) {
        char c;
        if (i == 0) {
            c = 1;
        } else {
            c = 0;
        }
        C19O3[] c19o3Arr = this.mListDimensionBehaviors;
        C19O3 c19o3 = c19o3Arr[i];
        C19O3 c19o32 = c19o3Arr[c];
        C19O3 c19o33 = C19O3.MATCH_CONSTRAINT;
        if (c19o3 == c19o33 && c19o32 == c19o33) {
            return true;
        }
        return false;
    }

    public void resetAnchor(C19OG c19og) {
        C19OA c19oa = this.mParent;
        if (c19oa != null && (c19oa instanceof C19O9)) {
            c19oa.getClass();
        }
        C19OG anchor = getAnchor(C19OV.LEFT);
        C19OG anchor2 = getAnchor(C19OV.RIGHT);
        C19OG anchor3 = getAnchor(C19OV.TOP);
        C19OG anchor4 = getAnchor(C19OV.BOTTOM);
        C19OG anchor5 = getAnchor(C19OV.CENTER);
        C19OG anchor6 = getAnchor(C19OV.CENTER_X);
        C19OG anchor7 = getAnchor(C19OV.CENTER_Y);
        if (c19og == anchor5) {
            if (anchor.LJII() && anchor2.LJII() && anchor.LJFF == anchor2.LJFF) {
                anchor.LJIIIZ();
                anchor2.LJIIIZ();
            }
            if (anchor3.LJII() && anchor4.LJII() && anchor3.LJFF == anchor4.LJFF) {
                anchor3.LJIIIZ();
                anchor4.LJIIIZ();
            }
            this.mHorizontalBiasPercent = 0.5f;
            this.mVerticalBiasPercent = 0.5f;
        } else if (c19og == anchor6) {
            if (anchor.LJII() && anchor2.LJII() && anchor.LJFF.LIZLLL == anchor2.LJFF.LIZLLL) {
                anchor.LJIIIZ();
                anchor2.LJIIIZ();
            }
            this.mHorizontalBiasPercent = 0.5f;
        } else if (c19og == anchor7) {
            if (anchor3.LJII() && anchor4.LJII() && anchor3.LJFF.LIZLLL == anchor4.LJFF.LIZLLL) {
                anchor3.LJIIIZ();
                anchor4.LJIIIZ();
            }
            this.mVerticalBiasPercent = 0.5f;
        } else if (c19og != anchor && c19og != anchor2) {
            if ((c19og == anchor3 || c19og == anchor4) && anchor3.LJII() && anchor3.LJFF == anchor4.LJFF) {
                anchor5.LJIIIZ();
            }
        } else if (anchor.LJII() && anchor.LJFF == anchor2.LJFF) {
            anchor5.LJIIIZ();
        }
        c19og.LJIIIZ();
    }

    public void resetSolverVariables(C21532019Ok c21532019Ok) {
        this.mLeft.LJIIJ();
        this.mTop.LJIIJ();
        this.mRight.LJIIJ();
        this.mBottom.LJIIJ();
        this.mBaseline.LJIIJ();
        this.mCenter.LJIIJ();
        this.mCenterX.LJIIJ();
        this.mCenterY.LJIIJ();
    }

    public void setBaselineDistance(int i) {
        boolean z;
        this.mBaselineDistance = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.hasBaseline = z;
    }

    public void setCompanionWidget(Object obj) {
        this.mCompanionWidget = obj;
    }

    public void setContainerItemSkip(int i) {
        if (i >= 0) {
            this.mContainerItemSkip = i;
        } else {
            this.mContainerItemSkip = 0;
        }
    }

    public void setDebugName(String str) {
        this.mDebugName = str;
    }

    public void setDimensionRatio(String str) {
        float fAbs;
        if (str != null && str.length() != 0) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    if (strSubstring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                String strSubstring2 = str.substring(i, iIndexOf2);
                String strSubstring3 = str.substring(iIndexOf2 + 1);
                if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                    try {
                        float f = CastFloatProtector.parseFloat(strSubstring2);
                        float f2 = CastFloatProtector.parseFloat(strSubstring3);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                fAbs = Math.abs(f2 / f);
                            } else {
                                fAbs = Math.abs(f / f2);
                            }
                        } else {
                            return;
                        }
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                String strSubstring4 = str.substring(i);
                if (strSubstring4.length() > 0) {
                    try {
                        fAbs = CastFloatProtector.parseFloat(strSubstring4);
                    } catch (NumberFormatException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                } else {
                    return;
                }
            }
            if (fAbs > 0.0f) {
                this.mDimensionRatio = fAbs;
                this.mDimensionRatioSide = i2;
                return;
            }
            return;
        }
        this.mDimensionRatio = 0.0f;
    }

    public void setFinalBaseline(int i) {
        if (!this.hasBaseline) {
            return;
        }
        int i2 = i - this.mBaselineDistance;
        int i3 = this.mHeight + i2;
        this.mY = i2;
        this.mTop.LJIIJJI(i2);
        this.mBottom.LJIIJJI(i3);
        this.mBaseline.LJIIJJI(i);
        this.resolvedVertical = true;
    }

    public void setFinalLeft(int i) {
        this.mLeft.LJIIJJI(i);
        this.mX = i;
    }

    public void setFinalTop(int i) {
        this.mTop.LJIIJJI(i);
        this.mY = i;
    }

    public void setHasBaseline(boolean z) {
        this.hasBaseline = z;
    }

    public void setHeight(int i) {
        this.mHeight = i;
        int i2 = this.mMinHeight;
        if (i < i2) {
            this.mHeight = i2;
        }
    }

    public void setHeightWrapContent(boolean z) {
        this.mIsHeightWrapContent = z;
    }

    public void setHorizontalBiasPercent(float f) {
        this.mHorizontalBiasPercent = f;
    }

    public void setHorizontalChainStyle(int i) {
        this.mHorizontalChainStyle = i;
    }

    public void setHorizontalDimensionBehaviour(C19O3 c19o3) {
        this.mListDimensionBehaviors[0] = c19o3;
    }

    public void setHorizontalWeight(float f) {
        this.mWeight[0] = f;
    }

    public void setInPlaceholder(boolean z) {
        this.inPlaceholder = z;
    }

    public void setInVirtualLayout(boolean z) {
        this.mInVirtuaLayout = z;
    }

    public void setMaxHeight(int i) {
        this.mMaxDimension[1] = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxDimension[0] = i;
    }

    public void setMeasureRequested(boolean z) {
        this.mMeasureRequested = z;
    }

    public void setMinHeight(int i) {
        if (i < 0) {
            this.mMinHeight = 0;
        } else {
            this.mMinHeight = i;
        }
    }

    public void setMinWidth(int i) {
        if (i < 0) {
            this.mMinWidth = 0;
        } else {
            this.mMinWidth = i;
        }
    }

    public void setParent(C19OA c19oa) {
        this.mParent = c19oa;
    }

    public void setType(String str) {
        this.mType = str;
    }

    public void setVerticalBiasPercent(float f) {
        this.mVerticalBiasPercent = f;
    }

    public void setVerticalChainStyle(int i) {
        this.mVerticalChainStyle = i;
    }

    public void setVerticalDimensionBehaviour(C19O3 c19o3) {
        this.mListDimensionBehaviors[1] = c19o3;
    }

    public void setVerticalWeight(float f) {
        this.mWeight[1] = f;
    }

    public void setVisibility(int i) {
        this.mVisibility = i;
    }

    public void setWidth(int i) {
        this.mWidth = i;
        int i2 = this.mMinWidth;
        if (i < i2) {
            this.mWidth = i2;
        }
    }

    public void setWidthWrapContent(boolean z) {
        this.mIsWidthWrapContent = z;
    }

    public void setX(int i) {
        this.mX = i;
    }

    public void setY(int i) {
        this.mY = i;
    }

    public C19OA(int i, int i2) {
        this(0, 0, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0251 A[PHI: r9 r39
      0x0251: PHI (r9v3 int) = (r9v19 int), (r9v20 int) binds: [B:261:0x056f, B:147:0x024f] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r39v0 boolean) = (r39v3 boolean), (r39v4 boolean) binds: [B:261:0x056f, B:147:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c9 A[PHI: r53 r54
      0x02c9: PHI (r53v4 boolean) = (r53v1 boolean), (r53v6 boolean) binds: [B:254:0x055a, B:176:0x02c5] A[DONT_GENERATE, DONT_INLINE]
      0x02c9: PHI (r54v4 boolean) = (r54v1 boolean), (r54v6 boolean) binds: [B:254:0x055a, B:176:0x02c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0313 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0573 A[PHI: r39
      0x0573: PHI (r39v2 boolean) = (r39v0 boolean), (r39v3 boolean) binds: [B:150:0x0255, B:261:0x056f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x05ad A[PHI: r16 r17 r18
      0x05ad: PHI (r16v1 int) = (r16v0 int), (r16v0 int), (r16v5 int) binds: [B:124:0x0216, B:126:0x021e, B:278:0x05ab] A[DONT_GENERATE, DONT_INLINE]
      0x05ad: PHI (r17v1 int) = (r17v0 int), (r17v0 int), (r17v4 int) binds: [B:124:0x0216, B:126:0x021e, B:278:0x05ab] A[DONT_GENERATE, DONT_INLINE]
      0x05ad: PHI (r18v2 int) = (r18v1 int), (r18v1 int), (r18v6 int) binds: [B:124:0x0216, B:126:0x021e, B:278:0x05ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addToSolver(X.C21531219Oc r79, boolean r80) {
        /*
            Method dump skipped, instruction units count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OA.addToSolver(X.19Oc, boolean):void");
    }

    public void copy(C19OA c19oa, HashMap<C19OA, C19OA> map) {
        C19OA c19oa2;
        C19OA c19oa3;
        this.mHorizontalResolution = c19oa.mHorizontalResolution;
        this.mVerticalResolution = c19oa.mVerticalResolution;
        this.mMatchConstraintDefaultWidth = c19oa.mMatchConstraintDefaultWidth;
        this.mMatchConstraintDefaultHeight = c19oa.mMatchConstraintDefaultHeight;
        int[] iArr = this.mResolvedMatchConstraintDefault;
        int[] iArr2 = c19oa.mResolvedMatchConstraintDefault;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.mMatchConstraintMinWidth = c19oa.mMatchConstraintMinWidth;
        this.mMatchConstraintMaxWidth = c19oa.mMatchConstraintMaxWidth;
        this.mMatchConstraintMinHeight = c19oa.mMatchConstraintMinHeight;
        this.mMatchConstraintMaxHeight = c19oa.mMatchConstraintMaxHeight;
        this.mMatchConstraintPercentHeight = c19oa.mMatchConstraintPercentHeight;
        this.mIsWidthWrapContent = c19oa.mIsWidthWrapContent;
        this.mIsHeightWrapContent = c19oa.mIsHeightWrapContent;
        this.mResolvedDimensionRatioSide = c19oa.mResolvedDimensionRatioSide;
        this.mResolvedDimensionRatio = c19oa.mResolvedDimensionRatio;
        int[] iArr3 = c19oa.mMaxDimension;
        this.mMaxDimension = Arrays.copyOf(iArr3, iArr3.length);
        this.mCircleConstraintAngle = c19oa.mCircleConstraintAngle;
        this.hasBaseline = c19oa.hasBaseline;
        this.inPlaceholder = c19oa.inPlaceholder;
        this.mLeft.LJIIIZ();
        this.mTop.LJIIIZ();
        this.mRight.LJIIIZ();
        this.mBottom.LJIIIZ();
        this.mBaseline.LJIIIZ();
        this.mCenterX.LJIIIZ();
        this.mCenterY.LJIIIZ();
        this.mCenter.LJIIIZ();
        this.mListDimensionBehaviors = (C19O3[]) Arrays.copyOf(this.mListDimensionBehaviors, 2);
        C19OA c19oa4 = null;
        if (this.mParent == null) {
            c19oa2 = null;
        } else {
            c19oa2 = map.get(c19oa.mParent);
        }
        this.mParent = c19oa2;
        this.mWidth = c19oa.mWidth;
        this.mHeight = c19oa.mHeight;
        this.mDimensionRatio = c19oa.mDimensionRatio;
        this.mDimensionRatioSide = c19oa.mDimensionRatioSide;
        this.mX = c19oa.mX;
        this.mY = c19oa.mY;
        this.mRelX = c19oa.mRelX;
        this.mRelY = c19oa.mRelY;
        this.mOffsetX = c19oa.mOffsetX;
        this.mOffsetY = c19oa.mOffsetY;
        this.mBaselineDistance = c19oa.mBaselineDistance;
        this.mMinWidth = c19oa.mMinWidth;
        this.mMinHeight = c19oa.mMinHeight;
        this.mHorizontalBiasPercent = c19oa.mHorizontalBiasPercent;
        this.mVerticalBiasPercent = c19oa.mVerticalBiasPercent;
        this.mCompanionWidget = c19oa.mCompanionWidget;
        this.mContainerItemSkip = c19oa.mContainerItemSkip;
        this.mVisibility = c19oa.mVisibility;
        this.mDebugName = c19oa.mDebugName;
        this.mType = c19oa.mType;
        this.mDistToTop = c19oa.mDistToTop;
        this.mDistToLeft = c19oa.mDistToLeft;
        this.mDistToRight = c19oa.mDistToRight;
        this.mDistToBottom = c19oa.mDistToBottom;
        this.mLeftHasCentered = c19oa.mLeftHasCentered;
        this.mRightHasCentered = c19oa.mRightHasCentered;
        this.mTopHasCentered = c19oa.mTopHasCentered;
        this.mBottomHasCentered = c19oa.mBottomHasCentered;
        this.mHorizontalWrapVisited = c19oa.mHorizontalWrapVisited;
        this.mVerticalWrapVisited = c19oa.mVerticalWrapVisited;
        this.mHorizontalChainStyle = c19oa.mHorizontalChainStyle;
        this.mVerticalChainStyle = c19oa.mVerticalChainStyle;
        this.mHorizontalChainFixedPosition = c19oa.mHorizontalChainFixedPosition;
        this.mVerticalChainFixedPosition = c19oa.mVerticalChainFixedPosition;
        float[] fArr = this.mWeight;
        float[] fArr2 = c19oa.mWeight;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        C19OA[] c19oaArr = this.mListNextMatchConstraintsWidget;
        C19OA[] c19oaArr2 = c19oa.mListNextMatchConstraintsWidget;
        c19oaArr[0] = c19oaArr2[0];
        c19oaArr[1] = c19oaArr2[1];
        C19OA[] c19oaArr3 = this.mNextChainWidget;
        C19OA[] c19oaArr4 = c19oa.mNextChainWidget;
        c19oaArr3[0] = c19oaArr4[0];
        c19oaArr3[1] = c19oaArr4[1];
        C19OA c19oa5 = c19oa.mHorizontalNextWidget;
        if (c19oa5 == null) {
            c19oa3 = null;
        } else {
            c19oa3 = map.get(c19oa5);
        }
        this.mHorizontalNextWidget = c19oa3;
        C19OA c19oa6 = c19oa.mVerticalNextWidget;
        if (c19oa6 != null) {
            c19oa4 = map.get(c19oa6);
        }
        this.mVerticalNextWidget = c19oa4;
    }

    public void setDebugSolverName(C21531219Oc c21531219Oc, String str) {
        this.mDebugName = str;
        C21531519Of c21531519OfLJIIJ = c21531219Oc.LJIIJ(this.mLeft);
        C21531519Of c21531519OfLJIIJ2 = c21531219Oc.LJIIJ(this.mTop);
        C21531519Of c21531519OfLJIIJ3 = c21531219Oc.LJIIJ(this.mRight);
        C21531519Of c21531519OfLJIIJ4 = c21531219Oc.LJIIJ(this.mBottom);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".left");
        c21531519OfLJIIJ.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".top");
        c21531519OfLJIIJ2.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(".right");
        c21531519OfLJIIJ3.LIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str);
        sbLIZ4.append(".bottom");
        c21531519OfLJIIJ4.LIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        C21531519Of c21531519OfLJIIJ5 = c21531219Oc.LJIIJ(this.mBaseline);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(str);
        sbLIZ5.append(".baseline");
        c21531519OfLJIIJ5.LIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
    }

    public void setDimension(int i, int i2) {
        this.mWidth = i;
        int i3 = this.mMinWidth;
        if (i < i3) {
            this.mWidth = i3;
        }
        this.mHeight = i2;
        int i4 = this.mMinHeight;
        if (i2 < i4) {
            this.mHeight = i4;
        }
    }

    public void setDimensionRatio(float f, int i) {
        this.mDimensionRatio = f;
        this.mDimensionRatioSide = i;
    }

    public void setFinalHorizontal(int i, int i2) {
        this.mLeft.LJIIJJI(i);
        this.mRight.LJIIJJI(i2);
        this.mX = i;
        this.mWidth = i2 - i;
        this.resolvedHorizontal = true;
    }

    public void setFinalVertical(int i, int i2) {
        this.mTop.LJIIJJI(i);
        this.mBottom.LJIIJJI(i2);
        this.mY = i;
        this.mHeight = i2 - i;
        if (this.hasBaseline) {
            this.mBaseline.LJIIJJI(i + this.mBaselineDistance);
        }
        this.resolvedVertical = true;
    }

    public void setGoneMargin(C19OV c19ov, int i) {
        int i2 = C19OQ.LIZ[c19ov.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        this.mBottom.LJII = i;
                        return;
                    }
                    return;
                }
                this.mRight.LJII = i;
                return;
            }
            this.mTop.LJII = i;
            return;
        }
        this.mLeft.LJII = i;
    }

    public void setHorizontalDimension(int i, int i2) {
        this.mX = i;
        int i3 = i2 - i;
        this.mWidth = i3;
        int i4 = this.mMinWidth;
        if (i3 < i4) {
            this.mWidth = i4;
        }
    }

    public void setInBarrier(int i, boolean z) {
        this.mIsInBarrier[i] = z;
    }

    public void setLastMeasureSpec(int i, int i2) {
        this.mLastHorizontalMeasureSpec = i;
        this.mLastVerticalMeasureSpec = i2;
        this.mMeasureRequested = false;
    }

    public void setLength(int i, int i2) {
        if (i2 == 0) {
            setWidth(i);
        } else {
            if (i2 != 1) {
                return;
            }
            setHeight(i);
        }
    }

    public void setOffset(int i, int i2) {
        this.mOffsetX = i;
        this.mOffsetY = i2;
    }

    public void setOrigin(int i, int i2) {
        this.mX = i;
        this.mY = i2;
    }

    public void setRelativePositioning(int i, int i2) {
        if (i2 == 0) {
            this.mRelX = i;
        } else {
            if (i2 != 1) {
                return;
            }
            this.mRelY = i;
        }
    }

    public void setVerticalDimension(int i, int i2) {
        this.mY = i;
        int i3 = i2 - i;
        this.mHeight = i3;
        int i4 = this.mMinHeight;
        if (i3 < i4) {
            this.mHeight = i4;
        }
    }

    public void updateFromRuns(boolean z, boolean z2) {
        int i;
        int i2;
        C19OD c19od = this.horizontalRun;
        boolean z3 = z & c19od.LJI;
        C19OE c19oe = this.verticalRun;
        boolean z4 = z2 & c19oe.LJI;
        int i3 = c19od.LJII.LJI;
        int i4 = c19oe.LJII.LJI;
        int i5 = c19od.LJIIIIZZ.LJI;
        int i6 = c19oe.LJIIIIZZ.LJI;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.mX = i3;
        }
        if (z4) {
            this.mY = i4;
        }
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        if (z3) {
            if (this.mListDimensionBehaviors[0] == C19O3.FIXED && i8 < (i2 = this.mWidth)) {
                i8 = i2;
            }
            this.mWidth = i8;
            int i10 = this.mMinWidth;
            if (i8 < i10) {
                this.mWidth = i10;
            }
        }
        if (z4) {
            if (this.mListDimensionBehaviors[1] == C19O3.FIXED && i9 < (i = this.mHeight)) {
                i9 = i;
            }
            this.mHeight = i9;
            int i11 = this.mMinHeight;
            if (i9 < i11) {
                this.mHeight = i11;
            }
        }
    }

    public void updateFromSolver(C21531219Oc c21531219Oc, boolean z) {
        C19OG c19og = this.mLeft;
        c21531219Oc.getClass();
        int iLJIILIIL = C21531219Oc.LJIILIIL(c19og);
        int iLJIILIIL2 = C21531219Oc.LJIILIIL(this.mTop);
        int iLJIILIIL3 = C21531219Oc.LJIILIIL(this.mRight);
        int iLJIILIIL4 = C21531219Oc.LJIILIIL(this.mBottom);
        if (z) {
            C19OD c19od = this.horizontalRun;
            if (c19od != null) {
                C19OL c19ol = c19od.LJII;
                if (c19ol.LJIIIZ) {
                    C19OL c19ol2 = c19od.LJIIIIZZ;
                    if (c19ol2.LJIIIZ) {
                        iLJIILIIL = c19ol.LJI;
                        iLJIILIIL3 = c19ol2.LJI;
                    }
                }
            }
            C19OE c19oe = this.verticalRun;
            if (c19oe != null) {
                C19OL c19ol3 = c19oe.LJII;
                if (c19ol3.LJIIIZ) {
                    C19OL c19ol4 = c19oe.LJIIIIZZ;
                    if (c19ol4.LJIIIZ) {
                        iLJIILIIL2 = c19ol3.LJI;
                        iLJIILIIL4 = c19ol4.LJI;
                    }
                }
            }
        }
        int i = iLJIILIIL4 - iLJIILIIL2;
        if (iLJIILIIL3 - iLJIILIIL < 0 || i < 0 || iLJIILIIL == Integer.MIN_VALUE || iLJIILIIL == Integer.MAX_VALUE || iLJIILIIL2 == Integer.MIN_VALUE || iLJIILIIL2 == Integer.MAX_VALUE || iLJIILIIL3 == Integer.MIN_VALUE || iLJIILIIL3 == Integer.MAX_VALUE || iLJIILIIL4 == Integer.MIN_VALUE || iLJIILIIL4 == Integer.MAX_VALUE) {
            iLJIILIIL = 0;
            iLJIILIIL2 = 0;
            iLJIILIIL3 = 0;
            iLJIILIIL4 = 0;
        }
        setFrame(iLJIILIIL, iLJIILIIL2, iLJIILIIL3, iLJIILIIL4);
    }

    public C19OA(String str, int i, int i2) {
        this(i, i2);
        this.mDebugName = str;
    }

    public void connect(C19OG c19og, C19OG c19og2, int i) {
        if (c19og.LIZLLL == this) {
            connect(c19og.LJ, c19og2.LIZLLL, c19og2.LJ, i);
        }
    }

    public void connectCircularConstraint(C19OA c19oa, float f, int i) {
        C19OV c19ov = C19OV.CENTER;
        immediateConnect(c19ov, c19oa, c19ov, i, 0);
        this.mCircleConstraintAngle = f;
    }

    public void setFrame(int i, int i2, int i3) {
        if (i3 == 0) {
            setHorizontalDimension(i, i2);
        } else {
            if (i3 != 1) {
                return;
            }
            setVerticalDimension(i, i2);
        }
    }

    public void connect(C19OV c19ov, C19OA c19oa, C19OV c19ov2) {
        connect(c19ov, c19oa, c19ov2, 0);
    }

    public C19OA(int i, int i2, int i3, int i4) {
        this.run = new C19OF[2];
        this.isTerminalWidget = new boolean[]{true, true};
        this.mMeasureRequested = true;
        this.OPTIMIZE_WRAP_ON_RESOLVED = true;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintPercentWidth = 1.0f;
        this.mMatchConstraintPercentHeight = 1.0f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1.0f;
        this.mMaxDimension = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        C19OG c19og = new C19OG(this, C19OV.LEFT);
        this.mLeft = c19og;
        C19OG c19og2 = new C19OG(this, C19OV.TOP);
        this.mTop = c19og2;
        C19OG c19og3 = new C19OG(this, C19OV.RIGHT);
        this.mRight = c19og3;
        C19OG c19og4 = new C19OG(this, C19OV.BOTTOM);
        this.mBottom = c19og4;
        C19OG c19og5 = new C19OG(this, C19OV.BASELINE);
        this.mBaseline = c19og5;
        this.mCenterX = new C19OG(this, C19OV.CENTER_X);
        this.mCenterY = new C19OG(this, C19OV.CENTER_Y);
        C19OG c19og6 = new C19OG(this, C19OV.CENTER);
        this.mCenter = c19og6;
        this.mListAnchors = new C19OG[]{c19og, c19og3, c19og2, c19og4, c19og5, c19og6};
        this.mAnchors = new ArrayList<>();
        this.mIsInBarrier = new boolean[2];
        C19O3 c19o3 = C19O3.FIXED;
        this.mListDimensionBehaviors = new C19O3[]{c19o3, c19o3};
        this.mParent = null;
        this.mDimensionRatio = 0.0f;
        this.mDimensionRatioSide = -1;
        this.mRelX = 0;
        this.mRelY = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        float f = DEFAULT_BIAS;
        this.mHorizontalBiasPercent = f;
        this.mVerticalBiasPercent = f;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mGroupsToSolver = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new C19OA[]{null, null};
        this.mNextChainWidget = new C19OA[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.horizontalGroup = -1;
        this.verticalGroup = -1;
        this.mX = i;
        this.mY = i2;
        this.mWidth = i3;
        this.mHeight = i4;
        addAnchors();
    }

    public void connect(C19OV c19ov, C19OA c19oa, C19OV c19ov2, int i) {
        C19OV c19ov3;
        C19OV c19ov4;
        boolean z;
        C19OV c19ov5 = C19OV.CENTER;
        if (c19ov == c19ov5) {
            if (c19ov2 == c19ov5) {
                C19OV c19ov6 = C19OV.LEFT;
                C19OG anchor = getAnchor(c19ov6);
                C19OV c19ov7 = C19OV.RIGHT;
                C19OG anchor2 = getAnchor(c19ov7);
                C19OV c19ov8 = C19OV.TOP;
                C19OG anchor3 = getAnchor(c19ov8);
                C19OV c19ov9 = C19OV.BOTTOM;
                C19OG anchor4 = getAnchor(c19ov9);
                boolean z2 = true;
                if ((anchor != null && anchor.LJII()) || (anchor2 != null && anchor2.LJII())) {
                    z = false;
                } else {
                    connect(c19ov6, c19oa, c19ov6, 0);
                    connect(c19ov7, c19oa, c19ov7, 0);
                    z = true;
                }
                if ((anchor3 != null && anchor3.LJII()) || (anchor4 != null && anchor4.LJII())) {
                    z2 = false;
                } else {
                    connect(c19ov8, c19oa, c19ov8, 0);
                    connect(c19ov9, c19oa, c19ov9, 0);
                }
                if (z) {
                    if (z2) {
                        getAnchor(c19ov5).LIZ(c19oa.getAnchor(c19ov5), 0);
                        return;
                    } else {
                        C19OV c19ov10 = C19OV.CENTER_X;
                        getAnchor(c19ov10).LIZ(c19oa.getAnchor(c19ov10), 0);
                        return;
                    }
                }
                if (!z2) {
                    return;
                }
                C19OV c19ov11 = C19OV.CENTER_Y;
                getAnchor(c19ov11).LIZ(c19oa.getAnchor(c19ov11), 0);
                return;
            }
            C19OV c19ov12 = C19OV.LEFT;
            if (c19ov2 != c19ov12 && c19ov2 != C19OV.RIGHT) {
                C19OV c19ov13 = C19OV.TOP;
                if (c19ov2 != c19ov13 && c19ov2 != C19OV.BOTTOM) {
                    return;
                }
                connect(c19ov13, c19oa, c19ov2, 0);
                connect(C19OV.BOTTOM, c19oa, c19ov2, 0);
                getAnchor(c19ov5).LIZ(c19oa.getAnchor(c19ov2), 0);
                return;
            }
            connect(c19ov12, c19oa, c19ov2, 0);
            connect(C19OV.RIGHT, c19oa, c19ov2, 0);
            getAnchor(c19ov5).LIZ(c19oa.getAnchor(c19ov2), 0);
            return;
        }
        C19OV c19ov14 = C19OV.CENTER_X;
        if (c19ov == c19ov14 && (c19ov2 == (c19ov4 = C19OV.LEFT) || c19ov2 == C19OV.RIGHT)) {
            C19OG anchor5 = getAnchor(c19ov4);
            C19OG anchor6 = c19oa.getAnchor(c19ov2);
            C19OG anchor7 = getAnchor(C19OV.RIGHT);
            anchor5.LIZ(anchor6, 0);
            anchor7.LIZ(anchor6, 0);
            getAnchor(c19ov14).LIZ(anchor6, 0);
            return;
        }
        C19OV c19ov15 = C19OV.CENTER_Y;
        if (c19ov == c19ov15 && (c19ov2 == (c19ov3 = C19OV.TOP) || c19ov2 == C19OV.BOTTOM)) {
            C19OG anchor8 = c19oa.getAnchor(c19ov2);
            getAnchor(c19ov3).LIZ(anchor8, 0);
            getAnchor(C19OV.BOTTOM).LIZ(anchor8, 0);
            getAnchor(c19ov15).LIZ(anchor8, 0);
            return;
        }
        if (c19ov == c19ov14 && c19ov2 == c19ov14) {
            C19OV c19ov16 = C19OV.LEFT;
            getAnchor(c19ov16).LIZ(c19oa.getAnchor(c19ov16), 0);
            C19OV c19ov17 = C19OV.RIGHT;
            getAnchor(c19ov17).LIZ(c19oa.getAnchor(c19ov17), 0);
            getAnchor(c19ov14).LIZ(c19oa.getAnchor(c19ov2), 0);
            return;
        }
        if (c19ov == c19ov15 && c19ov2 == c19ov15) {
            C19OV c19ov18 = C19OV.TOP;
            getAnchor(c19ov18).LIZ(c19oa.getAnchor(c19ov18), 0);
            C19OV c19ov19 = C19OV.BOTTOM;
            getAnchor(c19ov19).LIZ(c19oa.getAnchor(c19ov19), 0);
            getAnchor(c19ov15).LIZ(c19oa.getAnchor(c19ov2), 0);
            return;
        }
        C19OG anchor9 = getAnchor(c19ov);
        C19OG anchor10 = c19oa.getAnchor(c19ov2);
        if (!anchor9.LJIIIIZZ(anchor10)) {
            return;
        }
        C19OV c19ov20 = C19OV.BASELINE;
        if (c19ov == c19ov20) {
            C19OG anchor11 = getAnchor(C19OV.TOP);
            C19OG anchor12 = getAnchor(C19OV.BOTTOM);
            if (anchor11 != null) {
                anchor11.LJIIIZ();
            }
            if (anchor12 != null) {
                anchor12.LJIIIZ();
            }
            i = 0;
        } else if (c19ov != C19OV.TOP && c19ov != C19OV.BOTTOM) {
            if (c19ov == C19OV.LEFT || c19ov == C19OV.RIGHT) {
                C19OG anchor13 = getAnchor(c19ov5);
                if (anchor13.LJFF != anchor10) {
                    anchor13.LJIIIZ();
                }
                C19OG c19ogLJFF = getAnchor(c19ov).LJFF();
                C19OG anchor14 = getAnchor(c19ov14);
                if (anchor14.LJII()) {
                    c19ogLJFF.LJIIIZ();
                    anchor14.LJIIIZ();
                }
            }
        } else {
            C19OG anchor15 = getAnchor(c19ov20);
            if (anchor15 != null) {
                anchor15.LJIIIZ();
            }
            C19OG anchor16 = getAnchor(c19ov5);
            if (anchor16.LJFF != anchor10) {
                anchor16.LJIIIZ();
            }
            C19OG c19ogLJFF2 = getAnchor(c19ov).LJFF();
            C19OG anchor17 = getAnchor(c19ov15);
            if (anchor17.LJII()) {
                c19ogLJFF2.LJIIIZ();
                anchor17.LJIIIZ();
            }
        }
        anchor9.LIZ(anchor10, i);
    }

    public void setFrame(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.mX = i;
        this.mY = i2;
        if (this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }
        C19O3[] c19o3Arr = this.mListDimensionBehaviors;
        C19O3 c19o3 = c19o3Arr[0];
        C19O3 c19o32 = C19O3.FIXED;
        if (c19o3 == c19o32 && i7 < (i6 = this.mWidth)) {
            i7 = i6;
        }
        if (c19o3Arr[1] == c19o32 && i8 < (i5 = this.mHeight)) {
            i8 = i5;
        }
        this.mWidth = i7;
        this.mHeight = i8;
        int i9 = this.mMinHeight;
        if (i8 < i9) {
            this.mHeight = i9;
        }
        int i10 = this.mMinWidth;
        if (i7 < i10) {
            this.mWidth = i10;
        }
    }

    public void setHorizontalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultWidth = i;
        this.mMatchConstraintMinWidth = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxWidth = i3;
        this.mMatchConstraintPercentWidth = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setVerticalMatchStyle(int i, int i2, int i3, float f) {
        this.mMatchConstraintDefaultHeight = i;
        this.mMatchConstraintMinHeight = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.mMatchConstraintMaxHeight = i3;
        this.mMatchConstraintPercentHeight = f;
        if (f > 0.0f && f < 1.0f && i == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setupDimensionRatio(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.mResolvedDimensionRatioSide == -1) {
            if (z3) {
                if (!z4) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            } else if (z4) {
                this.mResolvedDimensionRatioSide = 1;
                if (this.mDimensionRatioSide == -1) {
                    this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                }
            }
        }
        if (this.mResolvedDimensionRatioSide == 0 && (!this.mTop.LJII() || !this.mBottom.LJII())) {
            this.mResolvedDimensionRatioSide = 1;
        } else if (this.mResolvedDimensionRatioSide == 1 && (!this.mLeft.LJII() || !this.mRight.LJII())) {
            this.mResolvedDimensionRatioSide = 0;
        }
        if (this.mResolvedDimensionRatioSide == -1 && (!this.mTop.LJII() || !this.mBottom.LJII() || !this.mLeft.LJII() || !this.mRight.LJII())) {
            if (this.mTop.LJII() && this.mBottom.LJII()) {
                this.mResolvedDimensionRatioSide = 0;
            } else if (this.mLeft.LJII() && this.mRight.LJII()) {
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
        if (this.mResolvedDimensionRatioSide == -1) {
            int i = this.mMatchConstraintMinWidth;
            if (i > 0) {
                if (this.mMatchConstraintMinHeight == 0) {
                    this.mResolvedDimensionRatioSide = 0;
                }
            } else {
                if (i != 0 || this.mMatchConstraintMinHeight <= 0) {
                    return;
                }
                this.mResolvedDimensionRatio = 1.0f / this.mResolvedDimensionRatio;
                this.mResolvedDimensionRatioSide = 1;
            }
        }
    }

    public C19OA(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        this.mDebugName = str;
    }

    public void addChildrenToSolverByDependency(C19O9 c19o9, C21531219Oc c21531219Oc, HashSet<C19OA> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            C19OP.LIZ(c19o9, c21531219Oc, this);
            hashSet.remove(this);
            addToSolver(c21531219Oc, c19o9.LJIIL(64));
        }
        if (i == 0) {
            HashSet<C19OG> hashSet2 = this.mLeft.LIZ;
            if (hashSet2 != null) {
                Iterator<C19OG> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL.addChildrenToSolverByDependency(c19o9, c21531219Oc, hashSet, 0, true);
                }
            }
            HashSet<C19OG> hashSet3 = this.mRight.LIZ;
            if (hashSet3 != null) {
                Iterator<C19OG> it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZLLL.addChildrenToSolverByDependency(c19o9, c21531219Oc, hashSet, 0, true);
                }
                return;
            }
            return;
        }
        HashSet<C19OG> hashSet4 = this.mTop.LIZ;
        if (hashSet4 != null) {
            Iterator<C19OG> it4 = hashSet4.iterator();
            while (it4.hasNext()) {
                it4.next().LIZLLL.addChildrenToSolverByDependency(c19o9, c21531219Oc, hashSet, i, true);
            }
        }
        HashSet<C19OG> hashSet5 = this.mBottom.LIZ;
        if (hashSet5 != null) {
            Iterator<C19OG> it5 = hashSet5.iterator();
            while (it5.hasNext()) {
                it5.next().LIZLLL.addChildrenToSolverByDependency(c19o9, c21531219Oc, hashSet, i, true);
            }
        }
        HashSet<C19OG> hashSet6 = this.mBaseline.LIZ;
        if (hashSet6 != null) {
            Iterator<C19OG> it6 = hashSet6.iterator();
            while (it6.hasNext()) {
                it6.next().LIZLLL.addChildrenToSolverByDependency(c19o9, c21531219Oc, hashSet, i, true);
            }
        }
    }

    public void immediateConnect(C19OV c19ov, C19OA c19oa, C19OV c19ov2, int i, int i2) {
        getAnchor(c19ov).LIZIZ(c19oa.getAnchor(c19ov2), i, i2, true);
    }

    public void setFinalFrame(int i, int i2, int i3, int i4, int i5, int i6) {
        setFrame(i, i2, i3, i4);
        setBaselineDistance(i5);
        if (i6 == 0) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = false;
        } else if (i6 == 1) {
            this.resolvedHorizontal = false;
            this.resolvedVertical = true;
        } else if (i6 == 2) {
            this.resolvedHorizontal = true;
            this.resolvedVertical = true;
        } else {
            this.resolvedHorizontal = false;
            this.resolvedVertical = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0357 A[PHI: r3 r4 r7 r12 r18 r36
      0x0357: PHI (r3v64 int) = (r3v65 int), (r3v69 int), (r3v78 int) binds: [B:233:0x0355, B:203:0x02f0, B:175:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x0357: PHI (r4v37 int) = (r4v38 int), (r4v41 int), (r4v47 int) binds: [B:233:0x0355, B:203:0x02f0, B:175:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x0357: PHI (r7v6 int) = (r7v7 int), (r7v8 int), (r7v9 int) binds: [B:233:0x0355, B:203:0x02f0, B:175:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x0357: PHI (r12v10 boolean) = (r12v11 boolean), (r12v14 boolean), (r12v18 boolean) binds: [B:233:0x0355, B:203:0x02f0, B:175:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x0357: PHI (r18v5 boolean) = (r18v6 boolean), (r18v8 boolean), (r18v13 boolean) binds: [B:233:0x0355, B:203:0x02f0, B:175:0x02a6] A[DONT_GENERATE, DONT_INLINE]
      0x0357: PHI (r36v4 int) = (r36v5 int), (r36v6 int), (r36v11 int) binds: [B:233:0x0355, B:203:0x02f0, B:175:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x035d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x046b A[PHI: r3 r4 r7 r12 r18 r36
      0x046b: PHI (r3v55 int) = (r3v64 int), (r3v64 int), (r3v65 int) binds: [B:235:0x035b, B:236:0x035d, B:233:0x0355] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r4v23 int) = (r4v37 int), (r4v37 int), (r4v38 int) binds: [B:235:0x035b, B:236:0x035d, B:233:0x0355] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r7v4 int) = (r7v6 int), (r7v6 int), (r7v7 int) binds: [B:235:0x035b, B:236:0x035d, B:233:0x0355] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r12v5 boolean) = (r12v10 boolean), (r12v10 boolean), (r12v11 boolean) binds: [B:235:0x035b, B:236:0x035d, B:233:0x0355] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r18v3 boolean) = (r18v5 boolean), (r18v5 boolean), (r18v6 boolean) binds: [B:235:0x035b, B:236:0x035d, B:233:0x0355] A[DONT_GENERATE, DONT_INLINE]
      0x046b: PHI (r36v0 int) = (r36v4 int), (r36v4 int), (r36v5 int) binds: [B:235:0x035b, B:236:0x035d, B:233:0x0355] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d3 A[PHI: r3
      0x00d3: PHI (r3v38 boolean) = (r3v39 boolean), (r3v42 boolean) binds: [B:51:0x00b5, B:49:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applyConstraints(X.C21531219Oc r40, boolean r41, boolean r42, boolean r43, boolean r44, X.C21531519Of r45, X.C21531519Of r46, X.C19O3 r47, boolean r48, X.C19OG r49, X.C19OG r50, int r51, int r52, int r53, int r54, float r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, int r61, int r62, int r63, int r64, float r65, boolean r66) {
        /*
            Method dump skipped, instruction units count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OA.applyConstraints(X.19Oc, boolean, boolean, boolean, boolean, X.19Of, X.19Of, X.19O3, boolean, X.19OG, X.19OG, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }
}
