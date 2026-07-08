package X;

import Y.ACallableS175S0300000_5;
import Y.ACallableS238S0200000_5;
import Y.ACallableS410S0100000_2;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0FI2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FI2 {
    public static final Map<String, C0FI2> LJIIIZ = new ConcurrentHashMap();
    public static final String[] LJIIJ = {"default", "Proxima-Nova-Semibold.otf"};
    public static final List<String> LJIIJJI = Arrays.asList("photomode_designer_textfont", "text_template_typeface");
    public final String LIZ;
    public C0FIB<List<TextFontStyleData>> LJIIIIZZ;
    public final Map<String, TextFontStyleData> LIZIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final Map<String, Typeface> LIZJ = new ConcurrentHashMap();
    public final ConcurrentHashSet LIZLLL = new ConcurrentHashSet();
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public String LJI = "default";
    public String LJII = "default";
    public String LJFF = C0CHQ.LIZ().getAppLanguage();

    public static synchronized C0FI2 LJIJJ() {
        if (!C0FJL.LIZ()) {
            return LJIJJLI("textfont");
        }
        C0FI2 c0fi2LJIJJLI = LJIJJLI("language_text_font");
        String appLanguage = C0CHQ.LIZ().getAppLanguage();
        String str = c0fi2LJIJJLI.LJFF;
        if (str != null && !str.equals(appLanguage)) {
            c0fi2LJIJJLI.LIZIZ.clear();
            ((ConcurrentHashMap) c0fi2LJIJJLI.LIZJ).clear();
            c0fi2LJIJJLI.LIZLLL.clear();
            c0fi2LJIJJLI.LJ.set(false);
        }
        c0fi2LJIJJLI.LJFF = appLanguage;
        return c0fi2LJIJJLI;
    }

    public final void LIZIZ() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        if (creativeToolsPluginService != null && !C289560BWo.LIZ()) {
            creativeToolsPluginService.LIZ();
        }
        C15O7.LIZJ(new ACallableS410S0100000_2(this, 4));
    }

    public final int LJII() {
        TextFontStyleData textFontStyleData = this.LIZIZ.get(this.LJI);
        if (textFontStyleData != null) {
            return textFontStyleData.fontSize;
        }
        return 0;
    }

    public final Typeface LJIIIIZZ() {
        if (this.LIZIZ.get(this.LJI) != null) {
            LJJIJIIJIL(this.LIZIZ.get(this.LJI));
        }
        if (((ConcurrentHashMap) this.LIZJ).get(this.LJI) == null) {
            return Typeface.DEFAULT_BOLD;
        }
        return (Typeface) ((ConcurrentHashMap) this.LIZJ).get(this.LJI);
    }

    public final List<TextFontStyleData> LJIJ() {
        if (this.LIZIZ.size() == 0) {
            return new ArrayList();
        }
        if (EffectPlatform.LJJJJLI(this.LIZ, false)) {
            for (TextFontStyleData textFontStyleData : this.LIZIZ.values()) {
                if (textFontStyleData != null) {
                    if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                        if (((ConcurrentHashMap) this.LIZJ).get(textFontStyleData.fileName) != null) {
                            textFontStyleData.LIZLLL = 1;
                        }
                    }
                    Typeface typefaceLJJIJIIJI = LJJIJIIJI(textFontStyleData.LIZ);
                    if (typefaceLJJIJIIJI != null) {
                        ((ConcurrentHashMap) this.LIZJ).put(textFontStyleData.fileName, typefaceLJJIJIIJI);
                        textFontStyleData.LIZLLL = 1;
                    } else {
                        textFontStyleData.LIZLLL = 2;
                    }
                }
            }
        }
        return new ArrayList(this.LIZIZ.values());
    }

    public static void LJJJI() {
        C196909122h.LIZ().LJJIJLIJ("textfont");
        C196909122h.LIZ().LJJIJLIJ("language_text_font");
        C196909122h.LIZ().LJJIJLIJ("editor_pro_font_panel");
        Iterator<String> it2 = LJIIJJI.iterator();
        while (it2.hasNext()) {
            C196909122h.LIZ().LJJIJLIJ(it2.next());
        }
    }

    public final String LJIILJJIL() {
        List<TextFontStyleData> listLJIJ = LJIJ();
        if (((ArrayList) listLJIJ).isEmpty() || !((TextFontStyleData) ListProtector.get(listLJIJ, 0)).LIZIZ()) {
            return null;
        }
        return ((TextFontStyleData) ListProtector.get(listLJIJ, 0)).fileName;
    }

    public C0FI2(String str) {
        this.LIZ = str;
    }

    public static Typeface LJIIL(int i) {
        C0FI2 c0fi2LJIJJLI = LJIJJLI("editor_pro_font_panel");
        if (c0fi2LJIJJLI.LJJIIJZLJL(c0fi2LJIJJLI.LJIIJJI(i))) {
            return c0fi2LJIJJLI.LJJ(c0fi2LJIJJLI.LJIIJJI(i));
        }
        Iterator<String> it2 = LJIIJJI.iterator();
        while (it2.hasNext()) {
            C0FI2 c0fi2LJIJJLI2 = LJIJJLI(it2.next());
            if (c0fi2LJIJJLI2.LJJIIJZLJL(c0fi2LJIJJLI2.LJIIJJI(i))) {
                return c0fi2LJIJJLI2.LJJ(c0fi2LJIJJLI2.LJIIJJI(i));
            }
        }
        if (C0FJL.LIZ()) {
            C0FI2 c0fi2LJIJJLI3 = LJIJJLI("language_text_font");
            if (c0fi2LJIJJLI3.LJJIIJZLJL(c0fi2LJIJJLI3.LJIIJJI(i))) {
                return c0fi2LJIJJLI3.LJJ(c0fi2LJIJJLI3.LJIIJJI(i));
            }
        }
        return LJIJJLI("textfont").LJIIIZ(i);
    }

    public static TextFontStyleData LJIILIIL(int i) {
        C0FI2 c0fi2LJIJJLI = LJIJJLI("editor_pro_font_panel");
        if (c0fi2LJIJJLI.LJJIIZ(c0fi2LJIJJLI.LJIIJJI(i))) {
            return c0fi2LJIJJLI.LJIILLIIL(c0fi2LJIJJLI.LJIIJJI(i));
        }
        Iterator<String> it2 = LJIIJJI.iterator();
        while (it2.hasNext()) {
            C0FI2 c0fi2LJIJJLI2 = LJIJJLI(it2.next());
            if (c0fi2LJIJJLI2.LJJIIZ(c0fi2LJIJJLI2.LJIIJJI(i))) {
                return c0fi2LJIJJLI2.LJIILLIIL(c0fi2LJIJJLI2.LJIIJJI(i));
            }
        }
        if (C0FJL.LIZ()) {
            C0FI2 c0fi2LJIJJLI3 = LJIJJLI("language_text_font");
            if (c0fi2LJIJJLI3.LJJIIJZLJL(c0fi2LJIJJLI3.LJIIJJI(i))) {
                return c0fi2LJIJJLI3.LJIILLIIL(c0fi2LJIJJLI3.LJIIJJI(i));
            }
        }
        return LJIJJLI("textfont").LJIIJ(i);
    }

    public static TextFontStyleData LJIILL(String str) {
        C0FI2 c0fi2LJIJJLI = LJIJJLI("editor_pro_font_panel");
        if (c0fi2LJIJJLI.LJJIIZ(str)) {
            return c0fi2LJIJJLI.LJIILLIIL(str);
        }
        Iterator<String> it2 = LJIIJJI.iterator();
        while (it2.hasNext()) {
            C0FI2 c0fi2LJIJJLI2 = LJIJJLI(it2.next());
            if (c0fi2LJIJJLI2.LJJIIZ(str)) {
                return c0fi2LJIJJLI2.LJIILLIIL(str);
            }
        }
        if (C0FJL.LIZ()) {
            C0FI2 c0fi2LJIJJLI3 = LJIJJLI("language_text_font");
            if (c0fi2LJIJJLI3.LJJIIZ(str)) {
                return c0fi2LJIJJLI3.LJIILLIIL(str);
            }
        }
        return LJIJJLI("textfont").LJIILLIIL(str);
    }

    public static String LJIJI(Typeface typeface) {
        C0FI2 c0fi2LJIJJLI = LJIJJLI("editor_pro_font_panel");
        if (c0fi2LJIJJLI.LJJIIZI(typeface).booleanValue()) {
            return c0fi2LJIJJLI.LJIL(typeface);
        }
        Iterator<String> it2 = LJIIJJI.iterator();
        while (it2.hasNext()) {
            C0FI2 c0fi2LJIJJLI2 = LJIJJLI(it2.next());
            if (c0fi2LJIJJLI2.LJJIIZI(typeface).booleanValue()) {
                return c0fi2LJIJJLI2.LJIL(typeface);
            }
        }
        if (C0FJL.LIZ()) {
            C0FI2 c0fi2LJIJJLI3 = LJIJJLI("language_text_font");
            if (c0fi2LJIJJLI3.LJJIIZI(typeface).booleanValue()) {
                return c0fi2LJIJJLI3.LJIL(typeface);
            }
        }
        return LJIJJLI("textfont").LJIL(typeface);
    }

    public static synchronized C0FI2 LJIJJLI(String str) {
        C0FI2 c0fi2;
        Map<String, C0FI2> map = LJIIIZ;
        if (((ConcurrentHashMap) map).get(str) == null) {
            synchronized (C0FI2.class) {
                try {
                    if (((ConcurrentHashMap) map).get(str) == null) {
                        ((ConcurrentHashMap) map).put(str, new C0FI2(str));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        c0fi2 = (C0FI2) ((ConcurrentHashMap) map).get(str);
        Objects.requireNonNull(c0fi2);
        return c0fi2;
    }

    public static Typeface LJJI(String str) {
        C0FI2 c0fi2LJIJJLI = LJIJJLI("editor_pro_font_panel");
        if (c0fi2LJIJJLI.LJJIIJZLJL(str)) {
            return c0fi2LJIJJLI.LJJ(str);
        }
        Iterator<String> it2 = LJIIJJI.iterator();
        while (it2.hasNext()) {
            C0FI2 c0fi2LJIJJLI2 = LJIJJLI(it2.next());
            if (c0fi2LJIJJLI2.LJJIIJZLJL(str)) {
                return c0fi2LJIJJLI2.LJJ(str);
            }
        }
        if (C0FJL.LIZ()) {
            C0FI2 c0fi2LJIJJLI3 = LJIJJLI("language_text_font");
            if (c0fi2LJIJJLI3.LJJIIJZLJL(str)) {
                return c0fi2LJIJJLI3.LJJ(str);
            }
        }
        return LJIJJLI("textfont").LJJ(str);
    }

    public static Typeface LJJIFFI(String str) {
        LJIJJLI("editor_pro_font_panel");
        Typeface typefaceLJJIJIIJI = LJJIJIIJI(str);
        if (typefaceLJJIJIIJI != null) {
            return typefaceLJJIJIIJI;
        }
        if (C0FJL.LIZ()) {
            LJIJJLI("language_text_font");
            Typeface typefaceLJJIJIIJI2 = LJJIJIIJI(str);
            if (typefaceLJJIJIIJI2 != null) {
                return typefaceLJJIJIIJI2;
            }
        }
        LJIJJLI("textfont");
        return LJJIJIIJI(str);
    }

    public static Typeface LJJIII(String str) {
        if (C0FJL.LIZ()) {
            C0FI2 c0fi2LJIJJLI = LJIJJLI("language_text_font");
            if (c0fi2LJIJJLI.LJJIIJZLJL(str)) {
                return c0fi2LJIJJLI.LJJII(str);
            }
        }
        return LJIJJLI("textfont").LJJII(str);
    }

    public static boolean LJJIJ(int i) {
        for (String str : LJIIJ) {
            if (str.equals(LJIJJ().LJIIJJI(i))) {
                return true;
            }
        }
        return false;
    }

    public static Typeface LJJIJIIJI(String str) {
        if (TextUtils.isEmpty(str) || !new C0VSJ(str).exists()) {
            return null;
        }
        try {
            return C786410Ut5.x4(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadType error path: ");
            sbLIZ.append(str);
            C201955140j.LJIIJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public final Typeface LJIIIZ(int i) {
        if (i == 1) {
            if (this.LIZIZ.get(this.LJII) != null) {
                LJJIJIIJIL(this.LIZIZ.get(this.LJII));
            }
            if (((ConcurrentHashMap) this.LIZJ).get(this.LJII) != null) {
                return (Typeface) ((ConcurrentHashMap) this.LIZJ).get(this.LJII);
            }
            return Typeface.DEFAULT_BOLD;
        }
        return LJIIIIZZ();
    }

    public final TextFontStyleData LJIIJ(int i) {
        return this.LIZIZ.get(LJIIJJI(i));
    }

    public final String LJIIJJI(int i) {
        if (i == 1) {
            return this.LJII;
        }
        return this.LJI;
    }

    public final TextFontStyleData LJIILLIIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.LIZIZ.get(str);
    }

    public final TextFontStyleData LJIIZILJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.LIZIZ.containsKey(str)) {
            return this.LIZIZ.get(str);
        }
        if (this.LIZIZ.size() <= 0) {
            return null;
        }
        return (TextFontStyleData) ListProtector.get(LJIJ(), 0);
    }

    public final String LJIL(Typeface typeface) {
        for (String str : ((ConcurrentHashMap) this.LIZJ).keySet()) {
            if (typeface != null && typeface.equals(((ConcurrentHashMap) this.LIZJ).get(str))) {
                return str;
            }
        }
        return "default";
    }

    public final Typeface LJJ(String str) {
        if (TextUtils.isEmpty(str) || ((ConcurrentHashMap) this.LIZJ).size() == 0) {
            return null;
        }
        Typeface typeface = (Typeface) ((ConcurrentHashMap) this.LIZJ).get(str);
        if (typeface == null && this.LIZIZ.get(str) != null) {
            return LJJIJIIJIL(this.LIZIZ.get(str));
        }
        return typeface;
    }

    public final Typeface LJJII(String str) {
        if (TextUtils.isEmpty(str) || this.LIZIZ.size() == 0) {
            return null;
        }
        for (TextFontStyleData textFontStyleData : this.LIZIZ.values()) {
            if (str.equals(textFontStyleData.fontName)) {
                return LJJ(textFontStyleData.fileName);
            }
        }
        return null;
    }

    public final boolean LJJIIJZLJL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (((ConcurrentHashMap) this.LIZJ).get(str) == null) {
            if (this.LIZIZ.get(str) == null || LJJIJIIJIL(this.LIZIZ.get(str)) == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean LJJIIZ(String str) {
        if (TextUtils.isEmpty(str) || this.LIZIZ.get(str) == null) {
            return false;
        }
        return true;
    }

    public final Boolean LJJIIZI(Typeface typeface) {
        for (Object obj : ((ConcurrentHashMap) this.LIZJ).keySet()) {
            if (typeface != null && obj != null && typeface.equals(((ConcurrentHashMap) this.LIZJ).get(obj))) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public final Typeface LJJIJIIJIL(TextFontStyleData textFontStyleData) {
        Typeface typefaceLJJIJIIJI;
        Effect effect = textFontStyleData.LJ;
        if (((ConcurrentHashMap) this.LIZJ).get(textFontStyleData.fileName) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C2286708xd.LIZJ(effect.getUnzipPath())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(effect.getUnzipPath());
            String str = File.separator;
            sbLIZ.append(str);
            sbLIZ.append(textFontStyleData.fileName);
            Typeface typefaceLJJIJIIJI2 = LJJIJIIJI(C2188811AlT.LIZIZ(sbLIZ));
            if (typefaceLJJIJIIJI2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(effect.getUnzipPath());
                sbLIZ2.append(str);
                sbLIZ2.append(textFontStyleData.fileName);
                textFontStyleData.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
                textFontStyleData.LIZLLL = 1;
                ((ConcurrentHashMap) this.LIZJ).put(textFontStyleData.fileName, typefaceLJJIJIIJI2);
                return typefaceLJJIJIIJI2;
            }
            String[] strArr = {"ttf", "otf", "woff", "woff2", "eot", "fon", "fnt", "pfb", "pfm", "svg"};
            for (File file : new C0VSJ(effect.getUnzipPath()).listFiles()) {
                if (file.isFile() && Arrays.asList(strArr).contains(C08QA.LJIJ(file).toLowerCase()) && (typefaceLJJIJIIJI = LJJIJIIJI(file.getAbsolutePath())) != null) {
                    textFontStyleData.LIZ = file.getAbsolutePath();
                    textFontStyleData.LIZLLL = 1;
                    ((ConcurrentHashMap) this.LIZJ).put(textFontStyleData.fileName, typefaceLJJIJIIJI);
                    return typefaceLJJIJIIJI;
                }
            }
            return null;
        }
        return null;
    }

    public final void LJJIJIL(Effect effect) {
        TextFontStyleData textFontStyleDataLIZ;
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) GsonProtectorUtils.fromJson(C123O.LIZ(), effect.getExtra(), TextFontStyleData.class);
            if (textFontStyleData != null && !TextUtils.isEmpty(textFontStyleData.fileName)) {
                if (((ConcurrentHashMap) this.LIZJ).get(textFontStyleData.fileName) == null && !TextUtils.isEmpty(effect.getUnzipPath())) {
                    if (C288760BTm.LIZ() && !this.LIZLLL.isEmpty() && !this.LIZLLL.contains(effect.getResourceId())) {
                        textFontStyleDataLIZ = this.LIZIZ.get(textFontStyleData.fileName);
                        if (textFontStyleDataLIZ == null) {
                            textFontStyleDataLIZ = LIZ(textFontStyleData, effect);
                            textFontStyleDataLIZ.LJFF = true;
                        }
                    } else {
                        textFontStyleDataLIZ = LIZ(textFontStyleData, effect);
                    }
                    LJJIJIIJIL(textFontStyleDataLIZ);
                }
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseTextFontStyleData err: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public final TextFontStyleData LJJIJL(Effect effect) {
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) C123O.LIZ().LJII(effect.getExtra(), TextFontStyleData.class);
            if (textFontStyleData != null && !TextUtils.isEmpty(textFontStyleData.fileName)) {
                TextFontStyleData textFontStyleDataLIZ = LIZ(textFontStyleData, effect);
                if (EffectPlatform.LJJJJLI(this.LIZ, true)) {
                    LJJIJIIJIL(textFontStyleDataLIZ);
                } else if (!TextUtils.isEmpty(effect.getUnzipPath()) && C2286708xd.LIZJ(effect.getUnzipPath())) {
                    textFontStyleDataLIZ.LIZLLL = 1;
                }
                C0FIE c0fie = C196909122h.LIZLLL;
                if (c0fie != null) {
                    c0fie.LIZ(textFontStyleDataLIZ, true, null);
                    return textFontStyleData;
                }
            }
            return textFontStyleData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseTextFontStyleData err: ");
            sbLIZ.append(e.getMessage());
            C201955140j.LJIIJ(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public final void LJJIZ(Context context) {
        if (C580130Mp9.LIZ(LJIJ())) {
            LJJIL(context, Boolean.valueOf(!C298130BmN.LIZ()));
        }
    }

    public final void LJJJJ(int i) {
        List<TextFontStyleData> listLJIJ = LJIJ();
        if (!((ArrayList) listLJIJ).isEmpty() && ((TextFontStyleData) ListProtector.get(listLJIJ, 0)).LIZIZ()) {
            LJJJIL(i, ((TextFontStyleData) ListProtector.get(listLJIJ, 0)).fileName);
        }
    }

    public static void LJJIIJ(TextFontStyleData textFontStyleData, C0FIA c0fia) {
        if (textFontStyleData == null) {
            C201955140j.LJIJI(C1465490oEt.LIZIZ, "font data is null");
            return;
        }
        if (TextUtils.isEmpty(textFontStyleData.textAnimResourceId)) {
            C201955140j.LJIJI(C1465490oEt.LIZIZ, "textAnimResourceId is null");
            textFontStyleData.LIZJ.LIZIZ = 5;
            return;
        }
        if (textFontStyleData.LIZJ.LIZ()) {
            TextMotionData textMotionData = textFontStyleData.LIZJ;
            if (textMotionData.LIZJ == null || TextUtils.isEmpty(textMotionData.LIZ)) {
                textFontStyleData.LIZJ.LIZIZ = 4;
            }
        }
        if (c0fia != null) {
            TextMotionData textMotionData2 = textFontStyleData.LIZJ;
            int i = textMotionData2.LIZIZ;
            if (i != 1) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            c0fia.LJ();
                            return;
                        }
                        return;
                    }
                    c0fia.onFail();
                    return;
                }
                c0fia.LIZIZ();
                return;
            }
            c0fia.LIZ(textMotionData2);
        }
    }

    public static void LJJIJLIJ(TextFontStyleData textFontStyleData, Effect effect) {
        if (effect != null) {
            try {
                TextMotionData textMotionData = (TextMotionData) C123O.LIZ().LJII(effect.getExtra(), TextMotionData.class);
                TextMotionData textMotionData2 = textFontStyleData.LIZJ;
                textMotionData2.motionType = textMotionData.motionType;
                textMotionData2.motionDuration = textMotionData.motionDuration * 1000000.0f;
                textMotionData2.autoWrapLine = textMotionData.autoWrapLine;
                textMotionData2.LIZJ = effect;
                if (!TextUtils.isEmpty(effect.getUnzipPath()) && C2286708xd.LIZJ(effect.getUnzipPath())) {
                    textFontStyleData.LIZJ.LIZ = effect.getUnzipPath();
                    textFontStyleData.LIZJ.LIZIZ = 1;
                    return;
                } else {
                    C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(textFontStyleData.fontName);
                    sbLIZ.append(" parseTextMotionPath err");
                    C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1465490oEt c1465490oEt2 = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(textFontStyleData.fontName);
                sbLIZ2.append("parseTextMotionData err: ");
                sbLIZ2.append(e.getMessage());
                C201955140j.LJIIJ(c1465490oEt2, C2188811AlT.LIZIZ(sbLIZ2), e);
            }
        }
        textFontStyleData.LIZJ.LIZIZ = 4;
    }

    public final TextFontStyleData LIZ(TextFontStyleData textFontStyleData, Effect effect) {
        TextFontStyleData textFontStyleData2 = this.LIZIZ.get(textFontStyleData.fileName);
        if (textFontStyleData2 == null) {
            this.LIZIZ.put(textFontStyleData.fileName, textFontStyleData);
        } else {
            textFontStyleData2.fileName = textFontStyleData.fileName;
            textFontStyleData2.fontName = textFontStyleData.fontName;
            textFontStyleData2.fontSize = textFontStyleData.fontSize;
            textFontStyleData2.title = textFontStyleData.title;
            textFontStyleData2.enableBgColor = textFontStyleData.enableBgColor;
            textFontStyleData2.enableMaskBlurLightColor = textFontStyleData.enableMaskBlurLightColor;
            textFontStyleData2.textAnimResourceId = textFontStyleData.textAnimResourceId;
            textFontStyleData2.LIZIZ = textFontStyleData.LIZIZ;
            textFontStyleData = textFontStyleData2;
        }
        textFontStyleData.LJ = effect;
        return textFontStyleData;
    }

    public final void LJ(Boolean bool, List<TextFontStyleData> list) {
        if (!bool.booleanValue()) {
            C01GW c01gw = C0ATC.LIZ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CancelTextMotionPreDownloadExp.isEnable() = ");
                sbLIZ.append(((Boolean) c01gw.getValue()).booleanValue());
                sbLIZ.append(", skip download text motions.");
                C201955140j.LIZLLL(c1465490oEt, "EditStickerFontStyleManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        if (!C0CA5.LIZ()) {
            LJFF(list, null, 0);
        }
    }

    public final void LJJIL(Context context, Boolean bool) {
        LJI(context, Boolean.FALSE, bool, null);
    }

    public final void LJJJ(EffectChannelResponse effectChannelResponse, Boolean bool) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (Effect effect : C0FJK.LIZIZ(effectChannelResponse, this.LIZ)) {
            arrayList.add(LJJIJL(effect));
            if (C288760BTm.LIZ()) {
                this.LIZLLL.add(effect.getResourceId());
            }
        }
        String str = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefetchOnSuccess, typeDataMaps.size = ");
        sbLIZ.append(this.LIZIZ.size());
        sbLIZ.append(";");
        C1439005kC.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        this.LJ.set(true);
        if (this.LJIIIIZZ != null && !this.LIZIZ.isEmpty()) {
            this.LJIIIIZZ.accept(new ArrayList(this.LIZIZ.values()));
            this.LJIIIIZZ = null;
        }
        C2281251EQx.LIZ.LJII("text", "", "", !r6.isEmpty());
        if (C0FIC.LIZ() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            C201955140j.LIZLLL(c1465490oEt, "EditStickerFontStyleManager", "downloadTextFontForFirstItem is supported, download the first text font.");
            List<TextFontStyleData> listLJIJ = LJIJ();
            if (!((ArrayList) listLJIJ).isEmpty() && !((TextFontStyleData) ListProtector.get(listLJIJ, 0)).LIZIZ()) {
                C15O7.LIZJ(new ACallableS238S0200000_5(this, (TextFontStyleData) ListProtector.get(listLJIJ, 0), 2));
            } else {
                C201955140j.LIZLLL(c1465490oEt, "EditStickerFontStyleManager", "downloadTextFontForFirstItem is supported, the first text font already downloaded.");
            }
        }
        LJ(bool, arrayList);
        if (C0FIC.LIZ() != 4 && !C0BNE.LIZ()) {
            Iterator<TextFontStyleData> it2 = this.LIZIZ.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TextFontStyleData next = it2.next();
                if (next.LIZLLL != 1) {
                    C1465490oEt c1465490oEt2 = C1465490oEt.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("text font ");
                    sbLIZ2.append(next.fontName);
                    sbLIZ2.append(" is not available, triggering download.");
                    C201955140j.LJIILJJIL(c1465490oEt2, C2188811AlT.LIZIZ(sbLIZ2));
                    C15O7.LIZJ(new ACallableS175S0300000_5(this, new ArrayList(), bool, 2));
                    break;
                }
            }
        } else {
            C201955140j.LIZLLL(C1465490oEt.LIZIZ, "EditStickerFontStyleManager", "CancelTextFontPreDownloadExp is disable, skip download text font.");
        }
        LIZIZ();
    }

    public final void LJJJIL(int i, String str) {
        if (i == 1) {
            this.LJII = str;
        } else {
            this.LJI = str;
        }
    }

    public final void LIZJ(final TextFontStyleData textFontStyleData, final C0FIA c0fia, final int i) {
        if (textFontStyleData == null) {
            C201955140j.LJIILJJIL(C1465490oEt.LIZIZ, "text data is null");
            return;
        }
        if (TextUtils.isEmpty(textFontStyleData.textAnimResourceId)) {
            textFontStyleData.LIZJ.LIZIZ = 5;
            return;
        }
        if (textFontStyleData.LIZJ.LIZ()) {
            LJJIIJ(textFontStyleData, c0fia);
            return;
        }
        if (TextUtils.isEmpty(textFontStyleData.textAnimResourceId)) {
            C201955140j.LJIILJJIL(C1465490oEt.LIZIZ, "textAnimResourceId is null");
            textFontStyleData.LIZJ.LIZIZ = 5;
            return;
        }
        final HashMap map = new HashMap();
        map.put("panel", "text_motion");
        final ArrayList arrayList = new ArrayList();
        arrayList.add(textFontStyleData.textAnimResourceId);
        textFontStyleData.LIZJ.LIZIZ = 3;
        if (c0fia != null) {
            c0fia.LIZIZ();
        }
        C15O7.LIZJ(new Callable() { // from class: X.0FI1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final C0FI2 c0fi2 = this.LL;
                List list = arrayList;
                Map map2 = map;
                final TextFontStyleData textFontStyleData2 = textFontStyleData;
                final C0FIA c0fia2 = c0fia;
                final int i2 = i;
                c0fi2.getClass();
                C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadSingleTextMotion$1L");
                C196909122h.LIZ().LJJIJIIJI(list, true, map2, new IFetchEffectListListener() { // from class: X.0FI0
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                    public final void onFail(ExceptionResult exceptionResult) {
                        int i3 = i2;
                        if (i3 < 1) {
                            c0fi2.LIZJ(textFontStyleData2, c0fia2, i3 + 1);
                        } else {
                            C0FIA c0fia3 = c0fia2;
                            if (c0fia3 != null) {
                                c0fia3.onFail();
                            }
                        }
                        C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("textFontDownload err: ");
                        sbLIZ.append(exceptionResult.getMsg());
                        C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                        textFontStyleData2.LIZJ.LIZIZ = 4;
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(List<Effect> list2) {
                        for (Effect effect : list2) {
                            C0FI2 c0fi22 = c0fi2;
                            TextFontStyleData textFontStyleData3 = textFontStyleData2;
                            c0fi22.getClass();
                            C0FI2.LJJIJLIJ(textFontStyleData3, effect);
                            C0FI2 c0fi23 = c0fi2;
                            TextFontStyleData textFontStyleData4 = textFontStyleData2;
                            C0FIA c0fia3 = c0fia2;
                            c0fi23.getClass();
                            C0FI2.LJJIIJ(textFontStyleData4, c0fia3);
                        }
                    }
                });
                C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadSingleTextMotion$1L");
                return null;
            }
        });
    }

    public final void LIZLLL(final String str, final C0FI9 c0fi9, final Boolean bool) {
        if (((ConcurrentHashMap) this.LIZJ).get(str) == null) {
            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("text font ");
            sbLIZ.append(str);
            sbLIZ.append(" is null");
            C201955140j.LJIJI(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
            final ArrayList arrayList = new ArrayList();
            C15O7.LIZJ(new Callable() { // from class: X.0FI8
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C0FI2 c0fi2 = this.LL;
                    final ArrayList arrayList2 = arrayList;
                    final String str2 = str;
                    final C0FI9 c0fi92 = c0fi9;
                    final Boolean bool2 = bool;
                    c0fi2.getClass();
                    C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadTextFontIfNeeded$1L");
                    C196909122h.LIZ().LJI(c0fi2.LIZ, true, new IFetchEffectChannelListener() { // from class: X.0FI5
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            c0fi92.LIZ(Boolean.FALSE);
                            C1465490oEt c1465490oEt2 = C1465490oEt.LIZIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("textFontDownload err: ");
                            sbLIZ2.append(exceptionResult.getMsg());
                            C201955140j.LJII(c1465490oEt2, C2188811AlT.LIZIZ(sbLIZ2));
                            c0fi92.onFail();
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                            Iterator it2 = C0FJK.LIZIZ(effectChannelResponse, c0fi2.LIZ).iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                TextFontStyleData textFontStyleDataLJJIJL = c0fi2.LJJIJL((Effect) it2.next());
                                arrayList2.add(textFontStyleDataLJJIJL);
                                if (textFontStyleDataLJJIJL != null && (TextUtils.equals(textFontStyleDataLJJIJL.fontName, str2) || TextUtils.equals(textFontStyleDataLJJIJL.fileName, str2))) {
                                    z = true;
                                }
                                c0fi92.onSuccess();
                            }
                            c0fi2.LJ(bool2, arrayList2);
                            c0fi92.LIZ(Boolean.valueOf(z));
                        }
                    });
                    C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadTextFontIfNeeded$1L");
                    return null;
                }
            });
            return;
        }
        TextFontStyleData textFontStyleData = this.LIZIZ.get(str);
        if (bool.booleanValue()) {
            LIZJ(textFontStyleData, null, 0);
        }
        c0fi9.onSuccess();
        c0fi9.LIZ(Boolean.TRUE);
    }

    public final void LJFF(final List<TextFontStyleData> list, final C0FIA c0fia, final int i) {
        if (list != null && !list.isEmpty()) {
            final HashSet hashSet = new HashSet();
            final ArrayList arrayList = new ArrayList();
            for (TextFontStyleData textFontStyleData : list) {
                if (textFontStyleData != null) {
                    if (TextUtils.isEmpty(textFontStyleData.textAnimResourceId)) {
                        textFontStyleData.LIZJ.LIZIZ = 5;
                    } else if (textFontStyleData.LIZJ.LIZ()) {
                        LJJIIJ(textFontStyleData, c0fia);
                    } else {
                        arrayList.add(textFontStyleData);
                        hashSet.add(textFontStyleData.textAnimResourceId);
                    }
                }
            }
            if (hashSet.isEmpty()) {
                C201955140j.LJIJI(C1465490oEt.LIZIZ, "No valid textAnimResourceIds found");
                return;
            }
            final HashMap map = new HashMap();
            map.put("panel", "text_motion");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((TextFontStyleData) it2.next()).LIZJ.LIZIZ = 3;
            }
            if (c0fia != null) {
                c0fia.LIZIZ();
            }
            C15O7.LIZJ(new Callable() { // from class: X.0FHz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C0FI2 c0fi2 = this.LL;
                    Set set = hashSet;
                    Map map2 = map;
                    final List list2 = arrayList;
                    final C0FIA c0fia2 = c0fia;
                    final int i2 = i;
                    final List list3 = list;
                    c0fi2.getClass();
                    C1C7U.LIZ("EditStickerFontStyleManager@4190.downloadTextMotions$1L");
                    C196909122h.LIZ().LJJIJIIJI(new ArrayList(set), true, map2, new IFetchEffectListListener() { // from class: X.0FHy
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            C1465490oEt c1465490oEt = C1465490oEt.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("text Motion Download err: ");
                            sbLIZ.append(exceptionResult.getMsg());
                            C201955140j.LJII(c1465490oEt, C2188811AlT.LIZIZ(sbLIZ));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                ((TextFontStyleData) it3.next()).LIZJ.LIZIZ = 4;
                            }
                            if (i2 < 1) {
                                C201955140j.LJIILJJIL(C1465490oEt.LIZIZ, "Retrying download...");
                                c0fi2.LJFF(list3, c0fia2, i2 + 1);
                            } else {
                                C0FIA c0fia3 = c0fia2;
                                if (c0fia3 == null) {
                                    return;
                                }
                                c0fia3.onFail();
                            }
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(List<Effect> list4) {
                            for (Effect effect : list4) {
                                C0FI2 c0fi22 = c0fi2;
                                List<TextFontStyleData> list5 = list2;
                                c0fi22.getClass();
                                ArrayList<TextFontStyleData> arrayList2 = new ArrayList();
                                if (effect != null && list5 != null && !list5.isEmpty()) {
                                    String resourceId = effect.getResourceId();
                                    for (TextFontStyleData textFontStyleData2 : list5) {
                                        if (textFontStyleData2 != null && resourceId.equals(textFontStyleData2.textAnimResourceId)) {
                                            arrayList2.add(textFontStyleData2);
                                        }
                                    }
                                }
                                for (TextFontStyleData textFontStyleData3 : arrayList2) {
                                    c0fi2.getClass();
                                    C0FI2.LJJIJLIJ(textFontStyleData3, effect);
                                    C0FI2 c0fi23 = c0fi2;
                                    C0FIA c0fia3 = c0fia2;
                                    c0fi23.getClass();
                                    C0FI2.LJJIIJ(textFontStyleData3, c0fia3);
                                }
                            }
                        }
                    });
                    C1C7U.LIZIZ("EditStickerFontStyleManager@4190.downloadTextMotions$1L");
                    return null;
                }
            });
            return;
        }
        C201955140j.LJIJI(C1465490oEt.LIZIZ, "text data list is null or empty");
    }

    public final void LJI(Context context, Boolean bool, final Boolean bool2, final C0FIB<List<TextFontStyleData>> c0fib) {
        if (context == null) {
            return;
        }
        C1439005kC.LIZ(this.LIZ, "start fetch font data");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi(CreativeToolsPluginService.class);
        if (creativeToolsPluginService != null && !C289560BWo.LIZ()) {
            creativeToolsPluginService.LIZ();
        }
        IFetchEffectChannelListener iFetchEffectChannelListener = new IFetchEffectChannelListener() { // from class: X.0FI4
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("type", "tool_performance_edit_font_list_fetch_time");
                c0lab.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "totaltime");
                C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
                String str = this.LIZLLL.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("prefetch fail err:");
                sbLIZ.append(exceptionResult.getMsg());
                C1439005kC.LIZ(str, C2188811AlT.LIZIZ(sbLIZ));
                C2281251EQx.LIZ.LJII("text", "", "", false);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("type", "tool_performance_edit_font_list_fetch_time");
                c0lab.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, "totaltime");
                C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c0lab.LIZ);
                C1439005kC.LIZ(this.LIZLLL.LIZ, "fetch success");
                if (Objects.equals(this.LIZLLL.LIZ, "language_text_font")) {
                    C1439005kC.LIZ(this.LIZLLL.LIZ, "update request from LanguageTextFont");
                    ((Keva) C0FIF.LIZ.getValue()).storeBoolean("key_has_request_language_text_font", true);
                }
                this.LIZLLL.LJJJ(effectChannelResponse2, bool2);
                C0FIB c0fib2 = c0fib;
                if (c0fib2 != null) {
                    c0fib2.accept(new ArrayList(this.LIZLLL.LIZIZ.values()));
                }
            }
        };
        if (bool.booleanValue()) {
            C196909122h.LIZ().LJJJJI(this.LIZ, true, false, iFetchEffectChannelListener);
        } else {
            C15O7.LIZJ(new ACallableS238S0200000_5(this, iFetchEffectChannelListener, 1));
        }
    }
}
