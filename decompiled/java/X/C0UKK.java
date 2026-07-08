package X;

import Y.AfS181S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0UKK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UKK extends FrameLayout implements C0UVD {
    public static final /* synthetic */ int LLJJIJI = 0;
    public C16FV LL;
    public float LLILLJJLI;
    public float LLILLL;
    public C1273890jFr LLILZ;
    public int LLILZIL;
    public final View LLILZLL;
    public final ImageView LLIZ;
    public final ImageView LLIZLLLIL;
    public final C780540Ujc LLJ;
    public C11JF LLJI;
    public final AnimatorSet LLJIJIL;
    public final AnimatorSet LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public DataChannel LLJJ;
    public boolean LLJJI;
    public final int LLJJIII;

    public final void LIZIZ() {
        this.LLJILJILJ = false;
        this.LLJIJIL.cancel();
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void LIZJ() {
        ImageView imageView = this.LLIZ;
        if (imageView != null) {
            C500260Jjc.LLFFF(imageView);
        }
        ImageView imageView2 = this.LLIZLLLIL;
        if (imageView2 != null) {
            C500260Jjc.LJIILIIL(imageView2);
        }
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.Fd(view, this.LLILLJJLI - ((int) C497740JfY.LIZIZ(47.0f)));
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.Ld(view2, this.LLILLL - ((int) C497740JfY.LIZIZ(60.0f)));
        }
        ImageView imageView3 = this.LLIZ;
        if (imageView3 != null) {
            LJ(imageView3);
        }
    }

    public final void LIZLLL() {
        ImageView imageView = this.LLIZ;
        if (imageView != null) {
            C500260Jjc.LJIILIIL(imageView);
        }
        ImageView imageView2 = this.LLIZLLLIL;
        if (imageView2 != null) {
            C500260Jjc.LLFFF(imageView2);
        }
        View view = this.LLILZLL;
        if (view != null) {
            C786410Ut5.Fd(view, this.LLILLJJLI - ((int) C497740JfY.LIZIZ(72.0f)));
        }
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C786410Ut5.Ld(view2, this.LLILLL - ((int) C497740JfY.LIZIZ(60.0f)));
        }
        ImageView imageView3 = this.LLIZLLLIL;
        if (imageView3 != null) {
            LJ(imageView3);
        }
    }

    public final void LJFF() {
        if (!this.LLJILJILJ) {
            this.LLJIJIL.cancel();
        }
        this.LLJILJILJ = true;
        this.LLJI = (C11JF) C11NZ.LJLJJLL(500L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 329));
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI() {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UKK.LJI():void");
    }

    public final C16FV getExposureSunFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hi_);
            this.LL = (C16FV) callbackFindViewById;
        }
        return (C16FV) callbackFindViewById;
    }

    public final C1273890jFr getLiveStream() {
        if (C500260Jjc.LJJIJLIJ()) {
            return null;
        }
        return this.LLILZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11JF c11jf = this.LLJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJIJIL.cancel();
        this.LLJILJIL.cancel();
        C776270Ucj.LIZ.getClass();
        ((CopyOnWriteArrayList) C776270Ucj.LJIIIZ).remove(this);
    }

    public final DataChannel getDataChannel() {
        return this.LLJJ;
    }

    public C0UKK(Context context) {
        View viewTd;
        ImageView imageView;
        ImageView imageView2;
        C780540Ujc c780540Ujc;
        super(context, null, 0);
        this.LLJIJIL = new AnimatorSet();
        this.LLJILJIL = new AnimatorSet();
        this.LLJJI = true;
        this.LLJJIII = 1;
        C01GW c01gw = C485950J3x.LIZ;
        if (C485950J3x.LIZ(R.layout.hsh)) {
            viewTd = C485950J3x.LIZIZ(context, R.layout.hsh, this, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hsh, this, false);
        }
        this.LLILZLL = viewTd;
        addView(viewTd);
        if (viewTd != null) {
            imageView = (ImageView) viewTd.findViewById(R.id.idl);
        } else {
            imageView = null;
        }
        this.LLIZ = imageView;
        if (viewTd != null) {
            imageView2 = (ImageView) viewTd.findViewById(R.id.idm);
        } else {
            imageView2 = null;
        }
        this.LLIZLLLIL = imageView2;
        if (viewTd != null) {
            c780540Ujc = (C780540Ujc) viewTd.findViewById(R.id.hi9);
        } else {
            c780540Ujc = null;
        }
        this.LLJ = c780540Ujc;
        if (viewTd != null) {
            C500260Jjc.LJIILIIL(viewTd);
        }
        C0UK0.LIZ = false;
        C0UK0.LIZIZ = false;
        C0UK0.LIZJ = false;
        this.LLILZ = C500260Jjc.LJJIJLIJ() ? null : C776270Ucj.LIZ.LJIIJJI(false, this, false);
    }

    @Override // X.C0UVD
    public final void LIZ(C1273890jFr c1273890jFr) {
        if (!C500260Jjc.LJJIJLIJ()) {
            this.LLILZ = c1273890jFr;
        }
    }

    public final void LJ(ImageView imageView) {
        this.LLJILJIL.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(500L), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(500L), ObjectAnimator.ofFloat(getExposureSunFromXml(), (Property<C16FV, Float>) View.SCALE_X, 1.5f, 1.0f).setDuration(500L), ObjectAnimator.ofFloat(getExposureSunFromXml(), (Property<C16FV, Float>) View.SCALE_Y, 1.5f, 1.0f).setDuration(500L));
        this.LLJILJIL.start();
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LLJJ = dataChannel;
    }

    public final void setExposureSunFromXml(C16FV c16fv) {
        this.LL = c16fv;
    }
}
