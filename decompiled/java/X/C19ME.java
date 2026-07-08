package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.19ME, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19ME extends ViewGroup.MarginLayoutParams {
    public int baselineToBaseline;
    public int bottomToBottom;
    public int bottomToTop;
    public float circleAngle;
    public int circleConstraint;
    public int circleRadius;
    public boolean constrainedHeight;
    public boolean constrainedWidth;
    public String constraintTag;
    public String dimensionRatio;
    public int dimensionRatioSide;
    public float dimensionRatioValue;
    public int editorAbsoluteX;
    public int editorAbsoluteY;
    public int endToEnd;
    public int endToStart;
    public int goneBottomMargin;
    public int goneEndMargin;
    public int goneLeftMargin;
    public int goneRightMargin;
    public int goneStartMargin;
    public int goneTopMargin;
    public int guideBegin;
    public int guideEnd;
    public float guidePercent;
    public boolean helped;
    public float horizontalBias;
    public int horizontalChainStyle;
    public boolean horizontalDimensionFixed;
    public float horizontalWeight;
    public boolean isGuideline;
    public boolean isHelper;
    public boolean isInPlaceholder;
    public boolean isVirtualGroup;
    public int leftToLeft;
    public int leftToRight;
    public int matchConstraintDefaultHeight;
    public int matchConstraintDefaultWidth;
    public int matchConstraintMaxHeight;
    public int matchConstraintMaxWidth;
    public int matchConstraintMinHeight;
    public int matchConstraintMinWidth;
    public float matchConstraintPercentHeight;
    public float matchConstraintPercentWidth;
    public boolean needsBaseline;
    public int orientation;
    public int resolveGoneLeftMargin;
    public int resolveGoneRightMargin;
    public int resolvedGuideBegin;
    public int resolvedGuideEnd;
    public float resolvedGuidePercent;
    public float resolvedHorizontalBias;
    public int resolvedLeftToLeft;
    public int resolvedLeftToRight;
    public int resolvedRightToLeft;
    public int resolvedRightToRight;
    public int rightToLeft;
    public int rightToRight;
    public int startToEnd;
    public int startToStart;
    public int topToBottom;
    public int topToTop;
    public float verticalBias;
    public int verticalChainStyle;
    public boolean verticalDimensionFixed;
    public float verticalWeight;
    public C19OA widget;

    public void validate() {
        this.isGuideline = false;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.constrainedWidth) {
            this.horizontalDimensionFixed = false;
            if (this.matchConstraintDefaultWidth == 0) {
                this.matchConstraintDefaultWidth = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.constrainedHeight) {
            this.verticalDimensionFixed = false;
            if (this.matchConstraintDefaultHeight == 0) {
                this.matchConstraintDefaultHeight = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.horizontalDimensionFixed = false;
            if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.constrainedWidth = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.verticalDimensionFixed = false;
            if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.constrainedHeight = true;
            }
        }
        if (this.guidePercent == -1.0f && this.guideBegin == -1 && this.guideEnd == -1) {
            return;
        }
        this.isGuideline = true;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        if (!(this.widget instanceof C19OI)) {
            this.widget = new C19OI();
        }
        ((C19OI) this.widget).LJ(this.orientation);
    }

    public void reset() {
        C19OA c19oa = this.widget;
        if (c19oa != null) {
            c19oa.reset();
        }
    }

    public String getConstraintTag() {
        return this.constraintTag;
    }

    public C19OA getConstraintWidget() {
        return this.widget;
    }

    public C19ME(C19ME c19me) {
        super((ViewGroup.MarginLayoutParams) c19me);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C19OA();
        this.helped = false;
        this.guideBegin = c19me.guideBegin;
        this.guideEnd = c19me.guideEnd;
        this.guidePercent = c19me.guidePercent;
        this.leftToLeft = c19me.leftToLeft;
        this.leftToRight = c19me.leftToRight;
        this.rightToLeft = c19me.rightToLeft;
        this.rightToRight = c19me.rightToRight;
        this.topToTop = c19me.topToTop;
        this.topToBottom = c19me.topToBottom;
        this.bottomToTop = c19me.bottomToTop;
        this.bottomToBottom = c19me.bottomToBottom;
        this.baselineToBaseline = c19me.baselineToBaseline;
        this.circleConstraint = c19me.circleConstraint;
        this.circleRadius = c19me.circleRadius;
        this.circleAngle = c19me.circleAngle;
        this.startToEnd = c19me.startToEnd;
        this.startToStart = c19me.startToStart;
        this.endToStart = c19me.endToStart;
        this.endToEnd = c19me.endToEnd;
        this.goneLeftMargin = c19me.goneLeftMargin;
        this.goneTopMargin = c19me.goneTopMargin;
        this.goneRightMargin = c19me.goneRightMargin;
        this.goneBottomMargin = c19me.goneBottomMargin;
        this.goneStartMargin = c19me.goneStartMargin;
        this.goneEndMargin = c19me.goneEndMargin;
        this.horizontalBias = c19me.horizontalBias;
        this.verticalBias = c19me.verticalBias;
        this.dimensionRatio = c19me.dimensionRatio;
        this.dimensionRatioValue = c19me.dimensionRatioValue;
        this.dimensionRatioSide = c19me.dimensionRatioSide;
        this.horizontalWeight = c19me.horizontalWeight;
        this.verticalWeight = c19me.verticalWeight;
        this.horizontalChainStyle = c19me.horizontalChainStyle;
        this.verticalChainStyle = c19me.verticalChainStyle;
        this.constrainedWidth = c19me.constrainedWidth;
        this.constrainedHeight = c19me.constrainedHeight;
        this.matchConstraintDefaultWidth = c19me.matchConstraintDefaultWidth;
        this.matchConstraintDefaultHeight = c19me.matchConstraintDefaultHeight;
        this.matchConstraintMinWidth = c19me.matchConstraintMinWidth;
        this.matchConstraintMaxWidth = c19me.matchConstraintMaxWidth;
        this.matchConstraintMinHeight = c19me.matchConstraintMinHeight;
        this.matchConstraintMaxHeight = c19me.matchConstraintMaxHeight;
        this.matchConstraintPercentWidth = c19me.matchConstraintPercentWidth;
        this.matchConstraintPercentHeight = c19me.matchConstraintPercentHeight;
        this.editorAbsoluteX = c19me.editorAbsoluteX;
        this.editorAbsoluteY = c19me.editorAbsoluteY;
        this.orientation = c19me.orientation;
        this.horizontalDimensionFixed = c19me.horizontalDimensionFixed;
        this.verticalDimensionFixed = c19me.verticalDimensionFixed;
        this.needsBaseline = c19me.needsBaseline;
        this.isGuideline = c19me.isGuideline;
        this.resolvedLeftToLeft = c19me.resolvedLeftToLeft;
        this.resolvedLeftToRight = c19me.resolvedLeftToRight;
        this.resolvedRightToLeft = c19me.resolvedRightToLeft;
        this.resolvedRightToRight = c19me.resolvedRightToRight;
        this.resolveGoneLeftMargin = c19me.resolveGoneLeftMargin;
        this.resolveGoneRightMargin = c19me.resolveGoneRightMargin;
        this.resolvedHorizontalBias = c19me.resolvedHorizontalBias;
        this.constraintTag = c19me.constraintTag;
        this.widget = c19me.widget;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void resolveLayoutDirection(int r12) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19ME.resolveLayoutDirection(int):void");
    }

    public void setWidgetDebugName(String str) {
        this.widget.mDebugName = str;
    }

    public C19ME(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C19OA();
        this.helped = false;
    }

    public C19ME(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C19OA();
        this.helped = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            int i3 = C21525419Lw.LIZ.get(index);
            switch (i3) {
                case 1:
                    this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.circleConstraint);
                    this.circleConstraint = resourceId;
                    if (resourceId == -1) {
                        this.circleConstraint = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                    this.circleAngle = f;
                    if (f < 0.0f) {
                        this.circleAngle = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                    break;
                case 6:
                    this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                    break;
                case 7:
                    this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToLeft);
                    this.leftToLeft = resourceId2;
                    if (resourceId2 == -1) {
                        this.leftToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.leftToRight);
                    this.leftToRight = resourceId3;
                    if (resourceId3 == -1) {
                        this.leftToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToLeft);
                    this.rightToLeft = resourceId4;
                    if (resourceId4 == -1) {
                        this.rightToLeft = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.rightToRight);
                    this.rightToRight = resourceId5;
                    if (resourceId5 == -1) {
                        this.rightToRight = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToTop);
                    this.topToTop = resourceId6;
                    if (resourceId6 == -1) {
                        this.topToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.topToBottom);
                    this.topToBottom = resourceId7;
                    if (resourceId7 == -1) {
                        this.topToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToTop);
                    this.bottomToTop = resourceId8;
                    if (resourceId8 == -1) {
                        this.bottomToTop = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                    this.bottomToBottom = resourceId9;
                    if (resourceId9 == -1) {
                        this.bottomToBottom = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                    this.baselineToBaseline = resourceId10;
                    if (resourceId10 == -1) {
                        this.baselineToBaseline = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToEnd);
                    this.startToEnd = resourceId11;
                    if (resourceId11 == -1) {
                        this.startToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.startToStart);
                    this.startToStart = resourceId12;
                    if (resourceId12 == -1) {
                        this.startToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToStart);
                    this.endToStart = resourceId13;
                    if (resourceId13 == -1) {
                        this.endToStart = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.endToEnd);
                    this.endToEnd = resourceId14;
                    if (resourceId14 == -1) {
                        this.endToEnd = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                    break;
                case 22:
                    this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                    break;
                case 23:
                    this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                    break;
                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                    break;
                case 25:
                    this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                    break;
                case 26:
                    this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                    break;
                case 27:
                    this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                    break;
                case 28:
                    this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                    break;
                case 29:
                    this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                    break;
                case 30:
                    this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                    break;
                case 31:
                    this.matchConstraintDefaultWidth = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    this.matchConstraintDefaultHeight = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                    try {
                        this.matchConstraintMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) == -2) {
                            this.matchConstraintMinWidth = -2;
                        }
                    }
                    break;
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                    try {
                        this.matchConstraintMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) == -2) {
                            this.matchConstraintMaxWidth = -2;
                        }
                    }
                    break;
                case 35:
                    this.matchConstraintPercentWidth = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                    this.matchConstraintDefaultWidth = 2;
                    break;
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                    try {
                        this.matchConstraintMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) == -2) {
                            this.matchConstraintMinHeight = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.matchConstraintMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        if (typedArrayObtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) == -2) {
                            this.matchConstraintMaxHeight = -2;
                        }
                    }
                    break;
                case 38:
                    this.matchConstraintPercentHeight = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                    this.matchConstraintDefaultHeight = 2;
                    break;
                default:
                    switch (i3) {
                        case 44:
                            String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                            this.dimensionRatio = strXd;
                            this.dimensionRatioValue = Float.NaN;
                            this.dimensionRatioSide = -1;
                            if (strXd != null) {
                                int length = strXd.length();
                                int iIndexOf = this.dimensionRatio.indexOf(44);
                                if (iIndexOf > 0 && iIndexOf < length - 1) {
                                    String strSubstring = this.dimensionRatio.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        this.dimensionRatioSide = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        this.dimensionRatioSide = 1;
                                    }
                                    i = iIndexOf + 1;
                                } else {
                                    i = 0;
                                }
                                int iIndexOf2 = this.dimensionRatio.indexOf(58);
                                if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                    String strSubstring2 = this.dimensionRatio.substring(i, iIndexOf2);
                                    String strSubstring3 = this.dimensionRatio.substring(iIndexOf2 + 1);
                                    if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                        try {
                                            float f2 = CastFloatProtector.parseFloat(strSubstring2);
                                            float f3 = CastFloatProtector.parseFloat(strSubstring3);
                                            if (f2 > 0.0f && f3 > 0.0f) {
                                                if (this.dimensionRatioSide == 1) {
                                                    this.dimensionRatioValue = Math.abs(f3 / f2);
                                                } else {
                                                    this.dimensionRatioValue = Math.abs(f2 / f3);
                                                }
                                            }
                                        } catch (NumberFormatException e5) {
                                            TryCatchGuardChecker.doCheck(e5);
                                        }
                                    }
                                } else {
                                    String strSubstring4 = this.dimensionRatio.substring(i);
                                    if (strSubstring4.length() > 0) {
                                        try {
                                            this.dimensionRatioValue = CastFloatProtector.parseFloat(strSubstring4);
                                        } catch (NumberFormatException e6) {
                                            TryCatchGuardChecker.doCheck(e6);
                                        }
                                    }
                                }
                            }
                            break;
                        case 45:
                            this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                            break;
                        case 46:
                            this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                            break;
                        case 47:
                            this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                            break;
                        case 51:
                            this.constraintTag = C786410Ut5.Xd(typedArrayObtainStyledAttributes, index);
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        validate();
    }

    public C19ME(int i, int i2) {
        super(i, i2);
        this.guideBegin = -1;
        this.guideEnd = -1;
        this.guidePercent = -1.0f;
        this.leftToLeft = -1;
        this.leftToRight = -1;
        this.rightToLeft = -1;
        this.rightToRight = -1;
        this.topToTop = -1;
        this.topToBottom = -1;
        this.bottomToTop = -1;
        this.bottomToBottom = -1;
        this.baselineToBaseline = -1;
        this.circleConstraint = -1;
        this.startToEnd = -1;
        this.startToStart = -1;
        this.endToStart = -1;
        this.endToEnd = -1;
        this.goneLeftMargin = -1;
        this.goneTopMargin = -1;
        this.goneRightMargin = -1;
        this.goneBottomMargin = -1;
        this.goneStartMargin = -1;
        this.goneEndMargin = -1;
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
        this.dimensionRatioSide = 1;
        this.horizontalWeight = -1.0f;
        this.verticalWeight = -1.0f;
        this.matchConstraintPercentWidth = 1.0f;
        this.matchConstraintPercentHeight = 1.0f;
        this.editorAbsoluteX = -1;
        this.editorAbsoluteY = -1;
        this.orientation = -1;
        this.horizontalDimensionFixed = true;
        this.verticalDimensionFixed = true;
        this.resolvedLeftToLeft = -1;
        this.resolvedLeftToRight = -1;
        this.resolvedRightToLeft = -1;
        this.resolvedRightToRight = -1;
        this.resolveGoneLeftMargin = -1;
        this.resolveGoneRightMargin = -1;
        this.resolvedHorizontalBias = 0.5f;
        this.widget = new C19OA();
        this.helped = false;
    }
}
