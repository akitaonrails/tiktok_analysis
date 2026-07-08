package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.125g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196986125g {
    public static C196986125g LJFF;
    public static final String[] LJI = {"default", "Proxima-Nova-Semibold.otf"};
    public final Map<String, TextFontStyleData> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final Map<String, Typeface> LIZIZ = new ConcurrentHashMap();
    public String LIZJ = "default";
    public String LIZLLL = "default";
    public final InterfaceC1635410sex LJ;

    public static C196986125g LJFF() {
        if (LJFF == null) {
            synchronized (C196986125g.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C196986125g();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final Typeface LIZ() {
        if (((ConcurrentHashMap) this.LIZIZ).get(this.LIZJ) == null) {
            return Typeface.DEFAULT_BOLD;
        }
        return (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(this.LIZJ);
    }

    public final List<TextFontStyleData> LJ() {
        if (this.LIZ.size() == 0) {
            return new ArrayList();
        }
        for (TextFontStyleData textFontStyleData : this.LIZ.values()) {
            if (textFontStyleData != null) {
                if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                    if (((ConcurrentHashMap) this.LIZIZ).get(textFontStyleData.fileName) != null) {
                        textFontStyleData.LIZIZ = 1;
                    }
                }
                Typeface typefaceLJI = LJI(textFontStyleData.LIZ);
                if (typefaceLJI != null) {
                    ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, typefaceLJI);
                    textFontStyleData.LIZIZ = 1;
                } else {
                    textFontStyleData.LIZIZ = 2;
                }
            }
        }
        return new ArrayList(this.LIZ.values());
    }

    public C196986125g() {
        IEffectService iEffectServiceEffectService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).effectService();
        C844470XAv.LIZ.getClass();
        this.LJ = iEffectServiceEffectService.createFontEffectPlatform(C844470XAv.LIZ());
    }

    public static Typeface LJI(String str) {
        if (TextUtils.isEmpty(str) || !new C0VSJ(str).exists()) {
            return null;
        }
        try {
            return C786410Ut5.x4(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final Typeface LIZIZ(int i) {
        if (i == 1) {
            if (((ConcurrentHashMap) this.LIZIZ).get(this.LIZLLL) != null) {
                return (Typeface) ((ConcurrentHashMap) this.LIZIZ).get(this.LIZLLL);
            }
            return Typeface.DEFAULT_BOLD;
        }
        return LIZ();
    }

    public final TextFontStyleData LIZJ(int i) {
        return this.LIZ.get(LIZLLL(i));
    }

    public final String LIZLLL(int i) {
        if (i == 1) {
            return this.LIZLLL;
        }
        return this.LIZJ;
    }

    public final TextFontStyleData LJII(Effect effect) {
        Typeface typefaceLJI;
        try {
            TextFontStyleData textFontStyleData = (TextFontStyleData) C2346409Hi.LIZ.LJII(effect.getExtra(), TextFontStyleData.class);
            if (!TextUtils.isEmpty(textFontStyleData.fileName)) {
                TextFontStyleData textFontStyleData2 = this.LIZ.get(textFontStyleData.fileName);
                if (textFontStyleData2 == null) {
                    this.LIZ.put(textFontStyleData.fileName, textFontStyleData);
                } else {
                    textFontStyleData2.fileName = textFontStyleData.fileName;
                    textFontStyleData2.fontName = textFontStyleData.fontName;
                    textFontStyleData2.fontSize = textFontStyleData.fontSize;
                    textFontStyleData2.title = textFontStyleData.title;
                    textFontStyleData2.enableBgColor = textFontStyleData.enableBgColor;
                    textFontStyleData2.enableMaskBlurLightColor = textFontStyleData.enableMaskBlurLightColor;
                    textFontStyleData = textFontStyleData2;
                }
                textFontStyleData.LIZJ = effect;
                if (((ConcurrentHashMap) this.LIZIZ).get(textFontStyleData.fileName) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C2286708xd.LIZJ(effect.getUnzipPath())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effect.getUnzipPath());
                    String str = File.separator;
                    sbLIZ.append(str);
                    sbLIZ.append(textFontStyleData.fileName);
                    Typeface typefaceLJI2 = LJI(C2188811AlT.LIZIZ(sbLIZ));
                    if (typefaceLJI2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(effect.getUnzipPath());
                        sbLIZ2.append(str);
                        sbLIZ2.append(textFontStyleData.fileName);
                        textFontStyleData.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        textFontStyleData.LIZIZ = 1;
                        ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, typefaceLJI2);
                        return textFontStyleData;
                    }
                    for (File file : new C0VSJ(effect.getUnzipPath()).listFiles()) {
                        if (file.isFile() && !file.getAbsolutePath().endsWith(".json") && (typefaceLJI = LJI(file.getAbsolutePath())) != null) {
                            textFontStyleData.LIZ = file.getAbsolutePath();
                            textFontStyleData.LIZIZ = 1;
                            ((ConcurrentHashMap) this.LIZIZ).put(textFontStyleData.fileName, typefaceLJI);
                            return textFontStyleData;
                        }
                    }
                    return null;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("parseTextFontStyleData err: ");
            sbLIZ3.append(e.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        }
    }

    public final void LJIIIZ(int i) {
        List<TextFontStyleData> listLJ = LJ();
        if (!((ArrayList) listLJ).isEmpty() && ((TextFontStyleData) ListProtector.get(listLJ, 0)).LIZIZ == 1) {
            LJIIIIZZ(i, ((TextFontStyleData) ListProtector.get(listLJ, 0)).fileName);
        }
    }

    public final void LJIIIIZZ(int i, String str) {
        if (i == 1) {
            this.LIZLLL = str;
        } else {
            this.LIZJ = str;
        }
    }
}
