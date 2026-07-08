package X;

import Y.AObjectS392S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ei9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099230ei9 {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final FrameLayout LIZJ;
    public final C16F5 LIZLLL;
    public final ViewGroup LJ;
    public final FrameLayout LJFF;
    public final ViewGroup LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public final View LJIIJ;
    public final FrameLayout LJIIJJI;
    public final C1099610eil LJIIL;
    public final Function0<Unit> LJIILIIL;
    public final Function0<Unit> LJIILJJIL;
    public final Function0<Unit> LJIILL;
    public final Function0<Unit> LJIILLIIL;
    public final C1096340edU LJIIZILJ;
    public final Function0<Unit> LJIJ;
    public final Function0<Unit> LJIJI;
    public C1295960jpS LJIJJ;
    public Map<String, ? extends C1294320jmo> LJIJJLI;
    public Bitmap LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public C1094740eau LJJIFFI;
    public AnimatorSet LJJII;
    public AnimatorSet LJJIII;
    public boolean LJJIIZ;
    public final C11NJ LJJIIJ = new C11NJ();
    public boolean LJJIIJZLJL = true;
    public boolean LJJIIZI = true;

    public final void LIZIZ() {
        this.LJJI = false;
        this.LJJ = false;
        this.LJJIFFI = null;
        if (!this.LJJIIJZLJL) {
            C1099610eil c1099610eil = this.LJIIL;
            if (c1099610eil != null) {
                C786410Ut5.H8(c1099610eil, null);
            }
            C1099610eil c1099610eil2 = this.LJIIL;
            if (c1099610eil2 != null) {
                c1099610eil2.setClickable(this.LJJIIZ);
            }
        }
        this.LJJIIZ = false;
        this.LJJIIJZLJL = true;
        this.LJIJ.invoke();
    }

    public final void LIZJ() {
        AnimatorSet animatorSet = this.LJJII;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJJIII;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
            animatorSet2.cancel();
        }
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ.LJ();
        this.LJIJJ = null;
        this.LJIJJLI = null;
        this.LJIL = null;
        this.LJJ = false;
        this.LJJI = false;
        this.LJJIFFI = null;
        FrameLayout frameLayout = this.LIZJ;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
    }

    public static Bitmap LIZ(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        canvas.drawBitmap(bitmap, matrix, null);
        return bitmapCreateBitmap;
    }

    public final void LIZLLL(C1295960jpS c1295960jpS) {
        if (this.LJJIIZI && this.LJIJJ != null && this.LJJ && this.LJIJJLI != null) {
            HandlerHook.viewPost(c1295960jpS, new ARunnableS86S0200000_17(this, c1295960jpS, 65));
        }
    }

    public C1099230ei9(Context context, DataChannel dataChannel, FrameLayout frameLayout, C16F5 c16f5, ViewGroup viewGroup, FrameLayout frameLayout2, ViewGroup viewGroup2, View view, View view2, C427340GpI c427340GpI, View view3, FrameLayout frameLayout3, C1099610eil c1099610eil, AObjectS392S0100000_17 aObjectS392S0100000_17, AObjectS392S0100000_17 aObjectS392S0100000_172, AObjectS392S0100000_17 aObjectS392S0100000_173, AObjectS392S0100000_17 aObjectS392S0100000_174, C1096340edU c1096340edU, AObjectS392S0100000_17 aObjectS392S0100000_175, AObjectS392S0100000_17 aObjectS392S0100000_176) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = frameLayout;
        this.LIZLLL = c16f5;
        this.LJ = viewGroup;
        this.LJFF = frameLayout2;
        this.LJI = viewGroup2;
        this.LJII = view;
        this.LJIIIIZZ = view2;
        this.LJIIIZ = c427340GpI;
        this.LJIIJ = view3;
        this.LJIIJJI = frameLayout3;
        this.LJIIL = c1099610eil;
        this.LJIILIIL = aObjectS392S0100000_17;
        this.LJIILJJIL = aObjectS392S0100000_172;
        this.LJIILL = aObjectS392S0100000_173;
        this.LJIILLIIL = aObjectS392S0100000_174;
        this.LJIIZILJ = c1096340edU;
        this.LJIJ = aObjectS392S0100000_175;
        this.LJIJI = aObjectS392S0100000_176;
    }
}
