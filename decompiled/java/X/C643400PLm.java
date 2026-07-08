package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.EnhancedProduct;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.Map;

/* JADX INFO: renamed from: X.0PLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643400PLm {
    public final View LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final C653660PkS LIZLLL;
    public final Product LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final int LJII;
    public final EnhancedProduct LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final boolean LJIIJJI;
    public final Map<String, String> LJIIL;
    public final int LJIILIIL;
    public final Float LJIILJJIL;
    public final Float LJIILL;
    public final Map<String, String> LJIILLIIL;
    public final C0Q5N LJIIZILJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C643400PLm() {
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, objArr3, objArr4, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr5, objArr6, objArr7, 0 == true ? 1 : 0, objArr8, objArr9, objArr10, objArr11, 262143);
    }

    public static C643400PLm LIZ(C643400PLm c643400PLm, String str, boolean z, Map map, Float f, int i) {
        View view;
        Aweme aweme;
        String str2;
        C653660PkS c653660PkS;
        Product product;
        boolean z2;
        boolean z3;
        int i2;
        EnhancedProduct enhancedProduct;
        String str3;
        int i3;
        Float f2;
        Map<String, String> map2;
        String str4 = str;
        Float f3 = f;
        Map map3 = map;
        boolean z4 = z;
        C0Q5N c0q5n = null;
        if ((i & 1) != 0) {
            view = c643400PLm.LIZ;
        } else {
            view = null;
        }
        if ((i & 2) != 0) {
            aweme = c643400PLm.LIZIZ;
        } else {
            aweme = null;
        }
        if ((i & 4) != 0) {
            str2 = c643400PLm.LIZJ;
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            c653660PkS = c643400PLm.LIZLLL;
        } else {
            c653660PkS = null;
        }
        if ((i & 16) != 0) {
            product = c643400PLm.LJ;
        } else {
            product = null;
        }
        if ((i & 32) != 0) {
            z2 = c643400PLm.LJFF;
        } else {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = c643400PLm.LJI;
        } else {
            z3 = false;
        }
        if ((i & 128) != 0) {
            i2 = c643400PLm.LJII;
        } else {
            i2 = 0;
        }
        if ((i & 256) != 0) {
            enhancedProduct = c643400PLm.LJIIIIZZ;
        } else {
            enhancedProduct = null;
        }
        if ((i & 512) != 0) {
            str3 = c643400PLm.LJIIIZ;
        } else {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            str4 = c643400PLm.LJIIJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = c643400PLm.LJIIJJI;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map3 = c643400PLm.LJIIL;
        }
        if ((i & 8192) != 0) {
            i3 = c643400PLm.LJIILIIL;
        } else {
            i3 = 0;
        }
        if ((i & 16384) != 0) {
            f2 = c643400PLm.LJIILJJIL;
        } else {
            f2 = null;
        }
        if ((32768 & i) != 0) {
            f3 = c643400PLm.LJIILL;
        }
        if ((65536 & i) != 0) {
            map2 = c643400PLm.LJIILLIIL;
        } else {
            map2 = null;
        }
        if ((i & 131072) != 0) {
            c0q5n = c643400PLm.LJIIZILJ;
        }
        c643400PLm.getClass();
        return new C643400PLm(view, aweme, str2, c653660PkS, product, z2, z3, i2, enhancedProduct, str3, str4, z4, map3, i3, f2, f3, map2, c0q5n);
    }

    public /* synthetic */ C643400PLm(View view, Aweme aweme, String str, C653660PkS c653660PkS, Product product, boolean z, boolean z2, int i, EnhancedProduct enhancedProduct, String str2, Map map, int i2, Float f, Float f2, Map map2, C0Q5N c0q5n, int i3) {
        this((i3 & 1) != 0 ? null : view, (i3 & 2) != 0 ? null : aweme, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : c653660PkS, (i3 & 16) != 0 ? null : product, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? -1 : i, (i3 & 256) != 0 ? null : enhancedProduct, (i3 & 512) != 0 ? null : str2, null, false, (i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : map, (i3 & 8192) != 0 ? -1 : i2, (i3 & 16384) != 0 ? null : f, (32768 & i3) != 0 ? null : f2, (65536 & i3) != 0 ? null : map2, (i3 & 131072) != 0 ? null : c0q5n);
    }

    public C643400PLm(View view, Aweme aweme, String str, C653660PkS c653660PkS, Product product, boolean z, boolean z2, int i, EnhancedProduct enhancedProduct, String str2, String str3, boolean z3, Map<String, String> map, int i2, Float f, Float f2, Map<String, String> map2, C0Q5N c0q5n) {
        this.LIZ = view;
        this.LIZIZ = aweme;
        this.LIZJ = str;
        this.LIZLLL = c653660PkS;
        this.LJ = product;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = i;
        this.LJIIIIZZ = enhancedProduct;
        this.LJIIIZ = str2;
        this.LJIIJ = str3;
        this.LJIIJJI = z3;
        this.LJIIL = map;
        this.LJIILIIL = i2;
        this.LJIILJJIL = f;
        this.LJIILL = f2;
        this.LJIILLIIL = map2;
        this.LJIIZILJ = c0q5n;
    }
}
