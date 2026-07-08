package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.12Ip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733312Ip extends C1662870tNF {
    public static final /* synthetic */ int LLLIL = 0;
    public C19734112Ix LLLIIL;
    public final ImageView LLLIILIL;

    public final C19734112Ix getConfig() {
        return this.LLLIIL;
    }

    private final void setIconEnableUi(boolean z) {
        if (z) {
            getImageView().clearColorFilter();
        } else {
            getImageView().setColorFilter(R.color.et, PorterDuff.Mode.DST_IN);
        }
    }

    @Override // X.C1662870tNF
    public final View LIZJ(Context context) {
        int iLIZIZ = (int) C11VU.LIZIZ(4.0f, context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(iLIZIZ, iLIZIZ);
        View view = new View(context);
        C786410Ut5.W5(view, layoutParams);
        return view;
    }

    @Override // X.C1662870tNF
    public final View LJFF(Context context) {
        this.LLLIIL.getClass();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C12JJ.LIZ(context), -2);
        C19518211Xw c19518211Xw = new C19518211Xw(context, null);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19518211Xw);
        c19518211Xw.setLayoutParams(layoutParams);
        c19518211Xw.setGravity(17);
        return c19518211Xw;
    }

    @Override // X.C1662870tNF
    public final void LJIIIIZZ(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            View dotView = getDotView();
            if (dotView != null) {
                layoutParams = dotView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = 81;
            layoutParams2.topMargin = (int) C11VU.LIZIZ(this.LLLIIL.LJIJI, getContext());
            View dotView2 = getDotView();
            if (dotView2 != null) {
                C786410Ut5.W5(dotView2, layoutParams2);
            }
        }
        super.LJIIIIZZ(z);
    }

    public final void setConfig(C19734112Ix c19734112Ix) {
        this.LLLIIL = c19734112Ix;
    }

    @Override // X.C1662870tNF
    public void setCustomSelected(boolean z) {
        Resources resources;
        int i;
        super.setCustomSelected(z);
        if (z) {
            resources = getResources();
            i = this.LLLIIL.LJIIIZ;
        } else {
            resources = getResources();
            i = this.LLLIIL.LJIJJLI;
        }
        int color = resources.getColor(i);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public final void setEnableUI(boolean z) {
        LJIIIZ(z, false);
    }

    public final void setTextEnableUi(boolean z) {
        Resources resources;
        int i;
        if (z) {
            resources = getResources();
            i = this.LLLIIL.LJIJJLI;
        } else {
            resources = getResources();
            i = R.color.et;
        }
        int color = resources.getColor(i);
        TextView textView = getTextView();
        if (textView != null) {
            textView.setTextColor(color);
        }
    }

    public C19733312Ip(Context context, C19734112Ix c19734112Ix) {
        super(context, c19734112Ix.LIZ, c19734112Ix.LIZIZ, c19734112Ix.LIZJ, c19734112Ix.LIZLLL, 0, 0, c19734112Ix.LJ, c19734112Ix.LJFF, 0, 0, c19734112Ix.LJII, c19734112Ix.LJIIIIZZ, 0, 0, c19734112Ix.LJIIIZ, c19734112Ix.LJIIJ, c19734112Ix.LJIIJJI, c19734112Ix.LJIIL, c19734112Ix.LJIILL, c19734112Ix.LJIILLIIL, c19734112Ix.LJIJ, c19734112Ix.LJIL, false, false, true, c19734112Ix.LJIILIIL, c19734112Ix.LJI, false, false, false, c19734112Ix.LJIILJJIL, -243269632, 13);
        this.LLLIIL = c19734112Ix;
        LIZIZ(context);
        this.LLLIILIL = (ImageView) findViewById(R.id.lfc);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(boolean r5, boolean r6) {
        /*
            r4 = this;
            X.12Ix r0 = r4.LLLIIL
            boolean r0 = r0.LJJ
            if (r0 == 0) goto L9
            r4.setIconEnableUi(r5)
        L9:
            r2 = 1084227584(0x40a00000, float:5.0)
            if (r6 == 0) goto L4e
            if (r5 == 0) goto L5d
            android.content.res.Resources r1 = r4.getResources()
            X.12Ix r0 = r4.LLLIIL
            int r0 = r0.LJIJJ
            int r3 = r1.getColor(r0)
        L1b:
            android.view.View r0 = r4.getDotView()
            if (r0 == 0) goto L34
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L34
            android.content.Context r0 = r4.getContext()
            float r0 = X.C11VU.LIZIZ(r2, r0)
            int r0 = (int) r0
            r1.height = r0
            r1.width = r0
        L34:
            android.view.View r2 = r4.getDotView()
            if (r2 == 0) goto L4d
            X.0sro r1 = new X.0sro
            r1.<init>()
            r0 = 1
            r1.LIZLLL(r0)
            r1.LIZIZ(r3)
            android.graphics.drawable.GradientDrawable r0 = r1.LIZ()
            r2.setBackground(r0)
        L4d:
            return
        L4e:
            if (r5 == 0) goto L5d
            android.content.res.Resources r1 = r4.getResources()
            X.12Ix r0 = r4.LLLIIL
            int r0 = r0.LJIILLIIL
            int r3 = r1.getColor(r0)
            goto L1b
        L5d:
            android.content.res.Resources r1 = r4.getResources()
            X.12Ix r0 = r4.LLLIIL
            int r0 = r0.LJIIZILJ
            int r3 = r1.getColor(r0)
            r2 = 1088421888(0x40e00000, float:7.0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19733312Ip.LJIIIZ(boolean, boolean):void");
    }
}
