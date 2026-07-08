package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19pj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21659719pj implements Serializable {
    public static final C1770840wBO Companion = new Object() { // from class: X.0wBO
    };
    public static final C21659719pj DEFAULT;
    public final String componentType;
    public String content;
    public final Float customHeightRatio;
    public final Float customMaxHeightRatio;
    public final boolean enableFullPage;
    public final boolean enableShowMask;
    public final boolean enableVideoScale;
    public final String enterMethod;
    public final EnumC1995507rl grabberBackgroundMode;
    public final boolean hasOverLay;
    public final boolean needShowGrabber;
    public boolean transparentBackground;
    public final Integer useFlexPanel;
    public final EnumC21658519pX variant;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21659719pj)) {
            return false;
        }
        C21659719pj c21659719pj = (C21659719pj) obj;
        return this.variant == c21659719pj.variant && Intrinsics.LJFF(this.useFlexPanel, c21659719pj.useFlexPanel) && Intrinsics.LJFF(this.content, c21659719pj.content) && Intrinsics.LJFF(this.customHeightRatio, c21659719pj.customHeightRatio) && Intrinsics.LJFF(this.customMaxHeightRatio, c21659719pj.customMaxHeightRatio) && this.needShowGrabber == c21659719pj.needShowGrabber && this.enableFullPage == c21659719pj.enableFullPage && this.enableVideoScale == c21659719pj.enableVideoScale && this.enableShowMask == c21659719pj.enableShowMask && this.hasOverLay == c21659719pj.hasOverLay && this.grabberBackgroundMode == c21659719pj.grabberBackgroundMode && Intrinsics.LJFF(this.componentType, c21659719pj.componentType) && Intrinsics.LJFF(this.enterMethod, c21659719pj.enterMethod);
    }

    public String toString() {
        return "FlexibleSheetConfig(variant=" + this.variant + ", useFlexPanel=" + this.useFlexPanel + ", content=" + this.content + ", customHeightRatio=" + this.customHeightRatio + ", customMaxHeightRatio=" + this.customMaxHeightRatio + ", needShowGrabber=" + this.needShowGrabber + ", enableFullPage=" + this.enableFullPage + ", enableVideoScale=" + this.enableVideoScale + ", enableShowMask=" + this.enableShowMask + ", hasOverLay=" + this.hasOverLay + ", grabberBackgroundMode=" + this.grabberBackgroundMode + ", componentType=" + this.componentType + ", enterMethod=" + this.enterMethod + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wBO] */
    static {
        C21659619pi c21659619pi = new C21659619pi();
        c21659619pi.LJII = EnumC1396040mQs.SEVEN;
        DEFAULT = c21659619pi.LIZ();
    }

    public static final C21659619pi builder() {
        Companion.getClass();
        return new C21659619pi();
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setTransparentBackground(boolean z) {
        this.transparentBackground = z;
    }

    public C21659719pj(EnumC21658519pX enumC21658519pX, Integer num, String str, Float f, Float f2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, EnumC1995507rl enumC1995507rl, String str2, String str3) {
        this.variant = enumC21658519pX;
        this.useFlexPanel = num;
        this.content = str;
        this.customHeightRatio = f;
        this.customMaxHeightRatio = f2;
        this.needShowGrabber = z;
        this.enableFullPage = z2;
        this.enableVideoScale = z3;
        this.enableShowMask = z4;
        this.hasOverLay = z5;
        this.grabberBackgroundMode = enumC1995507rl;
        this.componentType = str2;
        this.enterMethod = str3;
    }
}
