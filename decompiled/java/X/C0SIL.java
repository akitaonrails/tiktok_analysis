package X;

import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.desc.LandscapeVideoDescVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0SIL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIL {
    public final LandscapeVideoDescVM LIZ;
    public final TuxTextView LIZIZ;
    public final Context LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final C444890HcV LJIIIZ;
    public C718800SHm LJIIJ;
    public C21415018rM LJIIJJI;
    public Layout LJIIL;
    public Layout LJIILIIL;

    public final void LIZIZ() {
        Layout layout;
        boolean z = !this.LIZ.LLILZIL;
        Layout layout2 = this.LJIIL;
        if (layout2 == null || (layout = this.LJIILIIL) == null) {
            return;
        }
        int height = layout2.getHeight();
        int i = this.LJIIIIZZ;
        if (height > i) {
            height = i;
        }
        C719160SIw c719160SIw = new C719160SIw(height, layout.getHeight(), z);
        LandscapeVideoDescVM landscapeVideoDescVM = this.LIZ;
        landscapeVideoDescVM.getClass();
        landscapeVideoDescVM.setState(new AwS590S0100000_11(c719160SIw, 388));
    }

    public final void LIZJ() {
        C21415018rM c21415018rM = this.LJIIJJI;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        c21415018rM.setTextAlignment(5);
        C21415018rM c21415018rM2 = this.LJIIJJI;
        C786410Ut5.g9(c21415018rM2 != null ? c21415018rM2 : null, new ACListenerS146S0100000_11(this, 52));
        this.LIZ.getClass();
    }

    public final void LIZ(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.foc);
        C21415018rM c21415018rM = (C21415018rM) viewGroup.findViewById(R.id.desc);
        if (c21415018rM != null) {
            this.LJIIJJI = c21415018rM;
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJI, -2);
        layoutParams.gravity = 16;
        C21415018rM c21415018rM2 = new C21415018rM(view.getContext(), null, 6);
        c21415018rM2.setId(R.id.desc);
        c21415018rM2.setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        c21415018rM2.setVerticalFadingEdgeEnabled(true);
        viewGroup.addView(c21415018rM2, layoutParams);
        this.LJIIJJI = c21415018rM2;
    }

    public final void LIZLLL(boolean z) {
        Layout layout;
        int i;
        if (z) {
            layout = this.LJIIL;
        } else {
            layout = this.LJIILIIL;
            if (layout == null) {
                return;
            }
        }
        C21415018rM c21415018rM = this.LJIIJJI;
        C21415018rM c21415018rM2 = null;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        c21415018rM.setTextLayout(layout);
        C21415018rM c21415018rM3 = this.LJIIJJI;
        if (c21415018rM3 != null) {
            c21415018rM2 = c21415018rM3;
        }
        if (z) {
            i = this.LJIIIIZZ;
        } else {
            i = Integer.MAX_VALUE;
        }
        c21415018rM2.setMaxHeight(i);
    }

    public C0SIL(LandscapeVideoDescVM landscapeVideoDescVM, TuxTextView tuxTextView, Context context) {
        int iIntValue;
        int i;
        int i2;
        Integer numLIZJ;
        Integer numLIZJ2;
        this.LIZ = landscapeVideoDescVM;
        this.LIZIZ = tuxTextView;
        this.LIZJ = context;
        int iIntValue2 = 0;
        if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
            iIntValue = numLIZJ2.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZLLL = iIntValue;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context)) != null) {
            iIntValue2 = numLIZJ.intValue();
        }
        this.LJ = iIntValue2;
        if (((Boolean) landscapeVideoDescVM.LLILLJJLI.getValue()).booleanValue()) {
            i = 14;
        } else {
            i = 15;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf((((double) i) * 1.3d) + ((double) 3))));
        this.LJFF = iLIZIZ;
        this.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(372));
        if (((Boolean) landscapeVideoDescVM.LLILLJJLI.getValue()).booleanValue()) {
            i2 = 52;
        } else {
            i2 = 32;
        }
        this.LJII = i2;
        this.LJIIIIZZ = landscapeVideoDescVM.LLIZLLLIL * iLIZIZ;
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(i2);
        this.LJIIIZ = c444890HcV;
    }
}
