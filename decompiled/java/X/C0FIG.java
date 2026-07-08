package X;

import android.graphics.Typeface;
import android.view.ViewGroup;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;

/* JADX INFO: renamed from: X.0FIG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FIG implements C0FKI {
    public C0FII LIZ;

    @Override // X.C0FKI
    public final void refresh() {
        C0FII c0fii = this.LIZ;
        if (c0fii != null) {
            c0fii.LJIIJ().LJII(C0FAS.LJ(c0fii.LJFF.LIZ.getTextTemplateModel(), C0FAS.LIZ(c0fii.LJFF.LIZ)));
        }
    }

    @Override // X.C0FKI
    public final void LJ() {
        C0FI2.LJIJJ().LJIIIIZZ = null;
        C0FI2.LJIJJLI("editor_pro_font_panel").LJIIIIZZ = null;
    }

    @Override // X.C0FKI
    public final Typeface LIZ(String str) {
        Typeface typefaceLJJI = C0FI2.LJJI(str);
        if (typefaceLJJI == null) {
            return C0FI2.LJIIL(2);
        }
        return typefaceLJJI;
    }

    @Override // X.C0FKI
    public final void LIZIZ(boolean z) {
        C0FII c0fii = this.LIZ;
        if (c0fii != null) {
            if (z && C0FIH.LIZ() && c0fii.LIZLLL.LIZJ && !C444960Hcc.LIZIZ()) {
                c0fii.LJIIJ().LIZJ(true);
            } else {
                c0fii.LJIIJ().LIZJ(false);
            }
        }
    }

    @Override // X.C0FKI
    public final Typeface LIZLLL(TextFontModel textFontModel) {
        Typeface typefaceLJJI = C0FI2.LJJI(textFontModel.fileName);
        if (typefaceLJJI == null) {
            Typeface typefaceLJJIFFI = C0FI2.LJJIFFI(textFontModel.localPath);
            if (typefaceLJJIFFI == null) {
                return C0FI2.LJIIL(2);
            }
            return typefaceLJJIFFI;
        }
        return typefaceLJJI;
    }

    @Override // X.C0FKI
    public final Typeface getTypefaceByFontName(String str) {
        return C0FI2.LJJIII(str);
    }

    @Override // X.C0FKI
    public final C388270FKf LIZJ(ViewGroup viewGroup, C388200FJy c388200FJy, C0FK0 c0fk0) {
        boolean zLJI = MethodIDManager.LJI(202423);
        C0FII c0fii = new C0FII(viewGroup, c388200FJy, c0fk0);
        this.LIZ = c0fii;
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c0fii;
    }
}
