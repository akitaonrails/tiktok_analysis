package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy;

import X.C09CT;
import X.C1697810uHb;
import X.C385080F7y;
import X.C385090F7z;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class NLETextRichContent implements Serializable {

    @C09CT("autoAdaptDpiEnabled")
    public boolean autoAdaptDpiEnabled;

    @C09CT("boldValue")
    public float boldValue;

    @C09CT("canvas")
    public boolean canvas;

    @C09CT("canvasColor")
    public List<Float> canvasColor;

    @C09CT("canvasCustomized")
    public boolean canvasCustomized;

    @C09CT("canvasOffsetCustomized")
    public List<Float> canvasOffsetCustomized;

    @C09CT("canvasRoundCorner")
    public boolean canvasRoundCorner;

    @C09CT("canvasRoundRadius")
    public float canvasRoundRadius;

    @C09CT("canvasWHCustomized")
    public List<Float> canvasWHCustomized;

    @C09CT("canvasWHFixed")
    public List<Float> canvasWHFixed;

    @C09CT("canvasWrapped")
    public boolean canvasWrapped;

    @C09CT("cutOffPostfix")
    public String cutOffPostfix;

    @C09CT("decorationOffset")
    public float decorationOffset;

    @C09CT("decorationWidth")
    public float decorationWidth;

    @C09CT("directionLevel")
    public int directionLevel;

    @C09CT("fallbackFontPathList")
    public List<String> fallbackFontPathList;

    @C09CT("fixFontSize")
    public final boolean fixFontSize;

    @C09CT("globalAlpha")
    public float globalAlpha;

    @C09CT("innerPadding")
    public float innerPadding;

    @C09CT("italicDegree")
    public int italicDegree;

    @C09CT("ktvColor")
    public List<Float> ktvColor;

    @C09CT("ktvOutlineColor")
    public List<Float> ktvOutlineColor;

    @C09CT("ktvShadowColor")
    public List<Float> ktvShadowColor;

    @C09CT("letterSpacing")
    public float letterSpacing;

    @C09CT("lineMaxWidth")
    public float lineMaxWidth;

    @C09CT("lineSpacing")
    public float lineSpacing;

    @C09CT("oneLineCutOff")
    public boolean oneLineCutOff;

    @C09CT("richText")
    public String richText;
    public transient C385080F7y richTextData;

    @C09CT("selectedColor")
    public List<Float> selectedColor;

    @C09CT("shapeFlipX")
    public boolean shapeFlipX;

    @C09CT("shapeFlipY")
    public boolean shapeFlipY;

    @C09CT("shapePath")
    public String shapePath;

    @C09CT("textLocale")
    public int textLocale;

    @C09CT("typeSettingAlign")
    public int typeSettingAlign;

    @C09CT("typeSettingKind")
    public int typeSettingKind;

    @C09CT("version")
    public int version;
    public static final C385090F7z Companion = new C385090F7z();
    public static final int $stable = 8;

    public NLETextRichContent() {
        this(2, "", new C385080F7y("", null, null, 48.0f, false, 0.0f, null, null, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.2f), 0, 0, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, 0.0f, true, false, C1697810uHb.LJ(Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.0f, 0.0f, 0.0f, -1.0f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), 0, 254, C1697810uHb.LJ("", "", ""), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true);
    }

    public final String toJsonStr() {
        e eVar = new e();
        eVar.LJIIL = false;
        return GsonProtectorUtils.toJson(eVar.LIZ(), this);
    }

    public final void setAutoAdaptDpiEnabled(boolean z) {
        this.autoAdaptDpiEnabled = z;
    }

    public final void setBoldValue(float f) {
        this.boldValue = f;
    }

    public final void setCanvas(boolean z) {
        this.canvas = z;
    }

    public final void setCanvasColor(List<Float> list) {
        this.canvasColor = list;
    }

    public final void setCanvasCustomized(boolean z) {
        this.canvasCustomized = z;
    }

    public final void setCanvasOffsetCustomized(List<Float> list) {
        this.canvasOffsetCustomized = list;
    }

    public final void setCanvasRoundCorner(boolean z) {
        this.canvasRoundCorner = z;
    }

    public final void setCanvasRoundRadius(float f) {
        this.canvasRoundRadius = f;
    }

    public final void setCanvasWHCustomized(List<Float> list) {
        this.canvasWHCustomized = list;
    }

    public final void setCanvasWHFixed(List<Float> list) {
        this.canvasWHFixed = list;
    }

    public final void setCanvasWrapped(boolean z) {
        this.canvasWrapped = z;
    }

    public final void setCutOffPostfix(String str) {
        this.cutOffPostfix = str;
    }

    public final void setDecorationOffset(float f) {
        this.decorationOffset = f;
    }

    public final void setDecorationWidth(float f) {
        this.decorationWidth = f;
    }

    public final void setDirectionLevel(int i) {
        this.directionLevel = i;
    }

    public final void setFallbackFontPathList(List<String> list) {
        this.fallbackFontPathList = list;
    }

    public final void setGlobalAlpha(float f) {
        this.globalAlpha = f;
    }

    public final void setInnerPadding(float f) {
        this.innerPadding = f;
    }

    public final void setItalicDegree(int i) {
        this.italicDegree = i;
    }

    public final void setKtvColor(List<Float> list) {
        this.ktvColor = list;
    }

    public final void setKtvOutlineColor(List<Float> list) {
        this.ktvOutlineColor = list;
    }

    public final void setKtvShadowColor(List<Float> list) {
        this.ktvShadowColor = list;
    }

    public final void setLetterSpacing(float f) {
        this.letterSpacing = f;
    }

    public final void setLineMaxWidth(float f) {
        this.lineMaxWidth = f;
    }

    public final void setLineSpacing(float f) {
        this.lineSpacing = f;
    }

    public final void setOneLineCutOff(boolean z) {
        this.oneLineCutOff = z;
    }

    public final void setRichText(String str) {
        this.richText = str;
    }

    public final void setRichTextData(C385080F7y c385080F7y) {
        this.richTextData = c385080F7y;
    }

    public final void setSelectedColor(List<Float> list) {
        this.selectedColor = list;
    }

    public final void setShapeFlipX(boolean z) {
        this.shapeFlipX = z;
    }

    public final void setShapeFlipY(boolean z) {
        this.shapeFlipY = z;
    }

    public final void setShapePath(String str) {
        this.shapePath = str;
    }

    public final void setTextLocale(int i) {
        this.textLocale = i;
    }

    public final void setTypeSettingAlign(int i) {
        this.typeSettingAlign = i;
    }

    public final void setTypeSettingKind(int i) {
        this.typeSettingKind = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public NLETextRichContent(int i, String str, C385080F7y c385080F7y, int i2, int i3, boolean z, List<Float> list, boolean z2, float f, boolean z3, boolean z4, List<Float> list2, List<Float> list3, float f2, int i4, float f3, float f4, float f5, float f6, float f7, float f8, List<Float> list4, int i5, int i6, List<String> list5, boolean z5, String str2, String str3, boolean z6, boolean z7, List<Float> list6, List<Float> list7, List<Float> list8, boolean z8, float f9, List<Float> list9, boolean z9) {
        this.version = i;
        this.richText = str;
        this.richTextData = c385080F7y;
        this.typeSettingKind = i2;
        this.typeSettingAlign = i3;
        this.canvas = z;
        this.canvasColor = list;
        this.canvasRoundCorner = z2;
        this.canvasRoundRadius = f;
        this.canvasWrapped = z3;
        this.canvasCustomized = z4;
        this.canvasWHCustomized = list2;
        this.canvasOffsetCustomized = list3;
        this.boldValue = f2;
        this.italicDegree = i4;
        this.decorationWidth = f3;
        this.decorationOffset = f4;
        this.lineSpacing = f5;
        this.letterSpacing = f6;
        this.innerPadding = f7;
        this.lineMaxWidth = f8;
        this.canvasWHFixed = list4;
        this.textLocale = i5;
        this.directionLevel = i6;
        this.fallbackFontPathList = list5;
        this.oneLineCutOff = z5;
        this.cutOffPostfix = str2;
        this.shapePath = str3;
        this.shapeFlipX = z6;
        this.shapeFlipY = z7;
        this.ktvColor = list6;
        this.ktvOutlineColor = list7;
        this.ktvShadowColor = list8;
        this.autoAdaptDpiEnabled = z8;
        this.globalAlpha = f9;
        this.selectedColor = list9;
        this.fixFontSize = z9;
    }
}
