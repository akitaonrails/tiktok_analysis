package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.ss.android.ugc.aweme.tools.sticker.core.text.util.NewTextTemplateRichText;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0F8M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F8M {
    public static final C0F8O LJJIJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJIJIIJI;
    public final JSONObject LIZ;
    public final C0F8R LIZIZ;
    public final C0F8R LIZJ;
    public final C0F8T LIZLLL;
    public final C0F8T LJ;
    public final C0F8S LJFF;
    public final C0F8R LJI;
    public final C0F8R LJII;
    public final C0F8R LJIIIIZZ;
    public final C0F8Q LJIIIZ;
    public final C0F8P LJIIJ;
    public final C0F8P LJIIJJI;
    public final C0F8S LJIIL;
    public final C0F8R LJIILIIL;
    public final C0F8R LJIILJJIL;
    public final C0F8Q LJIILL;
    public final C0F8R LJIILLIIL;
    public final C0F8T LJIIZILJ;
    public final C0F8Q LJIJ;
    public final C0F8S LJIJI;
    public final C0F8Q LJIJJ;
    public final C0F8Q LJIJJLI;
    public final C0F8Q LJIL;
    public final C0F8S LJJ;
    public final C0F8R LJJI;
    public final C0F8R LJJIFFI;
    public final C0F8R LJJII;
    public final C0F8R LJJIII;
    public final C0F8S LJJIIJ;
    public final C0F8S LJJIIJZLJL;
    public final C0F8S LJJIIZ;
    public final NewTextTemplateRichText LJJIIZI;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C0F8M.class, "isChineseLineBreakOptimizationEnabled", "isChineseLineBreakOptimizationEnabled()Ljava/lang/Boolean;", 0);
        C13LE.LIZ.getClass();
        LJJIJIIJI = new InterfaceC2217461Bqa[]{c2217371BqR, new C2217371BqR(C0F8M.class, "isSpacesOptimizationEnabled", "isSpacesOptimizationEnabled()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "text_emphasis_params", "getText_emphasis_params()Lorg/json/JSONArray;", 0), new C2217371BqR(C0F8M.class, "canvas", "getCanvas()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "canvasCustomized", "getCanvasCustomized()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "canvasWHFixed", "getCanvasWHFixed()Lorg/json/JSONArray;", 0), new C2217371BqR(C0F8M.class, "typeSettingAlign", "getTypeSettingAlign()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "autoAdaptCanvasEnabled", "getAutoAdaptCanvasEnabled()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "autoWrapByWord", "getAutoWrapByWord()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "fixFontSize", "getFixFontSize()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "autoFontSizeMax", "getAutoFontSizeMax()Ljava/lang/Float;", 0), new C2217371BqR(C0F8M.class, "richText", "getRichText()Ljava/lang/String;", 0), new C2217371BqR(C0F8M.class, "version", "getVersion()Ljava/lang/String;", 0), new C2217371BqR(C0F8M.class, "typeSettingKind", "getTypeSettingKind()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "enableMergeLines", "getEnableMergeLines()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "canvasRoundCorner", "getCanvasRoundCorner()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "canvasRoundRadiusScale", "getCanvasRoundRadiusScale()Ljava/lang/Float;", 0), new C2217371BqR(C0F8M.class, "canvasWrapped", "getCanvasWrapped()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "fallbackFontPathList", "getFallbackFontPathList()Lorg/json/JSONArray;", 0), new C2217371BqR(C0F8M.class, "boldValue", "getBoldValue()Ljava/lang/Float;", 0), new C2217371BqR(C0F8M.class, "italicDegree", "getItalicDegree()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "canvasColor", "getCanvasColor()Lorg/json/JSONArray;", 0), new C2217371BqR(C0F8M.class, "lineSpacing", "getLineSpacing()Ljava/lang/Float;", 0), new C2217371BqR(C0F8M.class, "decorationWidth", "getDecorationWidth()Ljava/lang/Float;", 0), new C2217371BqR(C0F8M.class, "decorationOffset", "getDecorationOffset()Ljava/lang/Float;", 0), new C2217371BqR(C0F8M.class, "innerPadding", "getInnerPadding()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "innerPaddingHV", "getInnerPaddingHV()Lorg/json/JSONArray;", 0), new C2217371BqR(C0F8M.class, "lineMaxWidth", "getLineMaxWidth()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "oneLineCutOff", "getOneLineCutOff()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "shapeFlipX", "getShapeFlipX()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "shapeFlipY", "getShapeFlipY()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "autoAdaptDpiEnabled", "getAutoAdaptDpiEnabled()Ljava/lang/Boolean;", 0), new C2217371BqR(C0F8M.class, "globalAlpha", "getGlobalAlpha()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "sdfTextAlpha", "getSdfTextAlpha()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "sd", "getSd()Ljava/lang/Integer;", 0), new C2217371BqR(C0F8M.class, "textLocale", "getTextLocale()Ljava/lang/Integer;", 0)};
        LJJIJ = new C0F8O();
    }

    public final String LJFF() {
        NewTextTemplateRichText newTextTemplateRichText = this.LJJIIZI;
        if (newTextTemplateRichText != null) {
            C1227904rF.LIZ.getClass();
            setValue(this, LJJIJIIJI[11], C1227904rF.LJI(newTextTemplateRichText));
        }
        return C786410Ut5.J3(this.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0F8Q] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0F8Q] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0F8Q] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0F8Q] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0F8Q] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0F8Q] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0F8P] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0F8P, X.0MdN] */
    public C0F8M(final JSONObject jSONObject) {
        Object c098200Yq;
        this.LIZ = jSONObject;
        this.LIZIZ = new C0F8R(null, jSONObject);
        this.LIZJ = new C0F8R(null, jSONObject);
        this.LIZLLL = new C0F8T(null, jSONObject);
        LIZ(this, jSONObject);
        LIZ(this, jSONObject);
        this.LJ = new C0F8T(null, jSONObject);
        this.LJFF = new C0F8S(jSONObject, null);
        this.LJI = new C0F8R(null, jSONObject);
        this.LJII = new C0F8R(null, jSONObject);
        this.LJIIIIZZ = new C0F8R(null, jSONObject);
        final Object[] objArr = 0 == true ? 1 : 0;
        this.LJIIIZ = new AbstractC572830MdN<Float>() { // from class: X.0F8Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final Float LIZ(String str) {
                Float f;
                try {
                    Float fValueOf = Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                    C189200o6.m2constructorimpl(fValueOf);
                    f = fValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    f = c098200Yq2;
                }
                Float f2 = objArr;
                if (C189200o6.m7isFailureimpl(f)) {
                    return f2;
                }
                return f;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (((Float) obj) == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, r4.floatValue());
                }
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        ?? r4 = new AbstractC572830MdN<String>() { // from class: X.0F8P
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final String LIZ(String str) {
                String str2;
                try {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, str);
                    C189200o6.m2constructorimpl(string);
                    str2 = string;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    str2 = c098200Yq2;
                }
                String str3 = objArr2;
                if (C189200o6.m7isFailureimpl(str2)) {
                    return str3;
                }
                return str2;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (obj == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, obj);
                }
            }
        };
        this.LJIIJ = r4;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.LJIIJJI = new AbstractC572830MdN<String>() { // from class: X.0F8P
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final String LIZ(String str) {
                String str2;
                try {
                    String string = JSONObjectProtectorUtils.getString(jSONObject, str);
                    C189200o6.m2constructorimpl(string);
                    str2 = string;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    str2 = c098200Yq2;
                }
                String str3 = objArr3;
                if (C189200o6.m7isFailureimpl(str2)) {
                    return str3;
                }
                return str2;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (obj == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, obj);
                }
            }
        };
        this.LJIIL = new C0F8S(jSONObject, null);
        this.LJIILIIL = new C0F8R(null, jSONObject);
        this.LJIILJJIL = new C0F8R(null, jSONObject);
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.LJIILL = new AbstractC572830MdN<Float>() { // from class: X.0F8Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final Float LIZ(String str) {
                Float f;
                try {
                    Float fValueOf = Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                    C189200o6.m2constructorimpl(fValueOf);
                    f = fValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    f = c098200Yq2;
                }
                Float f2 = objArr4;
                if (C189200o6.m7isFailureimpl(f)) {
                    return f2;
                }
                return f;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (((Float) obj) == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, r4.floatValue());
                }
            }
        };
        this.LJIILLIIL = new C0F8R(null, jSONObject);
        this.LJIIZILJ = new C0F8T(null, jSONObject);
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.LJIJ = new AbstractC572830MdN<Float>() { // from class: X.0F8Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final Float LIZ(String str) {
                Float f;
                try {
                    Float fValueOf = Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                    C189200o6.m2constructorimpl(fValueOf);
                    f = fValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    f = c098200Yq2;
                }
                Float f2 = objArr5;
                if (C189200o6.m7isFailureimpl(f)) {
                    return f2;
                }
                return f;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (((Float) obj) == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, r4.floatValue());
                }
            }
        };
        this.LJIJI = new C0F8S(jSONObject, null);
        LIZJ(this, jSONObject);
        final Object[] objArr6 = 0 == true ? 1 : 0;
        this.LJIJJ = new AbstractC572830MdN<Float>() { // from class: X.0F8Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final Float LIZ(String str) {
                Float f;
                try {
                    Float fValueOf = Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                    C189200o6.m2constructorimpl(fValueOf);
                    f = fValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    f = c098200Yq2;
                }
                Float f2 = objArr6;
                if (C189200o6.m7isFailureimpl(f)) {
                    return f2;
                }
                return f;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (((Float) obj) == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, r4.floatValue());
                }
            }
        };
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.LJIJJLI = new AbstractC572830MdN<Float>() { // from class: X.0F8Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final Float LIZ(String str) {
                Float f;
                try {
                    Float fValueOf = Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                    C189200o6.m2constructorimpl(fValueOf);
                    f = fValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    f = c098200Yq2;
                }
                Float f2 = objArr7;
                if (C189200o6.m7isFailureimpl(f)) {
                    return f2;
                }
                return f;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (((Float) obj) == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, r4.floatValue());
                }
            }
        };
        final Object[] objArr8 = 0 == true ? 1 : 0;
        this.LJIL = new AbstractC572830MdN<Float>() { // from class: X.0F8Q
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC572830MdN
            public final Float LIZ(String str) {
                Float f;
                try {
                    Float fValueOf = Float.valueOf((float) JSONObjectProtectorUtils.getDouble(jSONObject, str));
                    C189200o6.m2constructorimpl(fValueOf);
                    f = fValueOf;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                    f = c098200Yq2;
                }
                Float f2 = objArr8;
                if (C189200o6.m7isFailureimpl(f)) {
                    return f2;
                }
                return f;
            }

            @Override // X.AbstractC572830MdN
            public final void LIZIZ(Object obj, String str) throws JSONException {
                if (((Float) obj) == null) {
                    jSONObject.remove(str);
                } else {
                    jSONObject.put(str, r4.floatValue());
                }
            }
        };
        LIZIZ(this, jSONObject);
        LIZJ(this, jSONObject);
        this.LJJ = new C0F8S(jSONObject, null);
        this.LJJI = new C0F8R(null, jSONObject);
        this.LJJIFFI = new C0F8R(null, jSONObject);
        this.LJJII = new C0F8R(null, jSONObject);
        this.LJJIII = new C0F8R(null, jSONObject);
        this.LJJIIJ = new C0F8S(jSONObject, null);
        this.LJJIIJZLJL = new C0F8S(jSONObject, null);
        LIZIZ(this, jSONObject);
        this.LJJIIZ = new C0F8S(jSONObject, null);
        try {
            e eVar = new e();
            eVar.LJIIL = false;
            c098200Yq = (NewTextTemplateRichText) eVar.LIZ().LJII((String) r4.getValue(this, LJJIJIIJI[11]), NewTextTemplateRichText.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LJJIIZI = (NewTextTemplateRichText) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    public final void LIZLLL(Integer num) {
        this.LJFF.setValue(this, LJJIJIIJI[6], num);
    }

    public final void LJ(Integer num) {
        this.LJIIL.setValue(this, LJJIJIIJI[13], num);
    }

    public static C0F8R LIZ(C0F8M c0f8m, JSONObject jSONObject) {
        c0f8m.getClass();
        return new C0F8R(null, jSONObject);
    }

    public static C0F8S LIZIZ(C0F8M c0f8m, JSONObject jSONObject) {
        c0f8m.getClass();
        return new C0F8S(jSONObject, null);
    }

    public static C0F8T LIZJ(C0F8M c0f8m, JSONObject jSONObject) {
        c0f8m.getClass();
        return new C0F8T(null, jSONObject);
    }
}
