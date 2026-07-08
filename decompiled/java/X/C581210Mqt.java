package X;

import android.view.View;
import com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene;
import com.ss.android.ugc.aweme.texttoimage.intro.TextToImageIntroFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581210Mqt implements InterfaceC1292040jj8 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1292040jj8
    public final void onResult(Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, obj);
                break;
            case 1:
                onResult$1(this, obj);
                break;
            case 2:
                onResult$2(this, obj);
                break;
            case 3:
                onResult$3(this, obj);
                break;
            case 4:
                onResult$4(this, obj);
                break;
        }
    }

    public C581210Mqt(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C581210Mqt c581210Mqt, Object obj) {
        C1295960jpS c1295960jpS;
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS != null && (c1295960jpS = ((TextToImageIntroFragment) c581210Mqt.l0).LL) != null) {
            c1295960jpS.setComposition(c1294720jnS);
        }
    }

    public static final void onResult$1(C581210Mqt c581210Mqt, Object obj) {
        C1295960jpS c1295960jpS;
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        View view = ((TextToImageEditScene) c581210Mqt.l0).mView;
        if (view != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.i7d)) != null) {
            c1295960jpS.setComposition(c1294720jnS);
            c1295960jpS.setProgress(1.0f);
        }
    }

    public static final void onResult$2(C581210Mqt c581210Mqt, Object obj) {
        C1295960jpS c1295960jpS;
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        View view = ((TextToImageEditScene) c581210Mqt.l0).mView;
        if (view != null && (c1295960jpS = (C1295960jpS) view.findViewById(R.id.i7d)) != null) {
            TextToImageEditScene textToImageEditScene = (TextToImageEditScene) c581210Mqt.l0;
            c1295960jpS.setComposition(c1294720jnS);
            C562670M4z.LIZ.getClass();
            if (C562670M4z.LJI) {
                c1295960jpS.playAnimation();
                C571960Mby c571960Mby = textToImageEditScene.LLJL;
                if (c571960Mby != null) {
                    c571960Mby.bl0(true);
                }
                C562670M4z.LJI = false;
            }
        }
    }

    public static final void onResult$3(C581210Mqt c581210Mqt, Object obj) {
        C1294720jnS c1294720jnS = (C1294720jnS) obj;
        if (c1294720jnS == null) {
            C201955140j.LIZLLL(C554890LpX.LIZIZ, "CeleTempPreview", "play lottie, composition is null");
            C1295960jpS c1295960jpS = ((C568710MSf) c581210Mqt.l0).LLJJJJJIL;
            if (c1295960jpS != null) {
                C368610Ecl.LIZIZ(c1295960jpS);
                return;
            }
            return;
        }
        C568710MSf c568710MSf = (C568710MSf) c581210Mqt.l0;
        if (c568710MSf.LLJJJJJIL == null) {
            c568710MSf.LLJJJJLIIL = new AwS409S0200000_8(c568710MSf, c1294720jnS, 105);
        } else {
            c568710MSf.LLLLILI(c1294720jnS);
        }
    }

    public static final void onResult$4(C581210Mqt c581210Mqt, Object obj) {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("play loading lottie, addFailureListener, e = ");
        sbLIZ.append(obj);
        C537680L6w.LIZ(c554890LpX, "CeleTempPreview", C2188811AlT.LIZIZ(sbLIZ), null);
        C568710MSf c568710MSf = (C568710MSf) c581210Mqt.l0;
        if (c568710MSf.LLJJJJJIL == null) {
            c568710MSf.LLJJJJLIIL = new AwS552S0100000_8(c568710MSf, 890);
            return;
        }
        View view = c568710MSf.LLJJJJ;
        if (view == null) {
            return;
        }
        C368610Ecl.LIZIZ(view);
    }
}
