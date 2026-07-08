package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.zhiliaoapp.musically.R;
import irm.AkS80S0100000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566300MIy extends AbstractC1664490tPr<C566100MIe, C534660Ky0> {
    public final IAIMEServices LLJJJIL;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 603));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 606));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 605));
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 604));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 608));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 607));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 610));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 609));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 611));

    public final C1295960jpS LLLLLJIL() {
        return (C1295960jpS) this.LLJJJJLIIL.getValue();
    }

    public final ConstraintLayout LLLLLJLJLL() {
        return (ConstraintLayout) this.LLJL.getValue();
    }

    public final TuxTextView LLLLLL() {
        return (TuxTextView) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public C566300MIy(IAIMEServices iAIMEServices) {
        this.LLJJJIL = iAIMEServices;
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((ImageView) this.LLJJL.getValue()).setImageDrawable(new AbstractC415370GQl() { // from class: X.0GHx
            {
                this.LIZJ.LJIIIZ(94.3406f, 43.1204f);
                this.LIZJ.LJFF(106.203f, 36.2932f, 120.797f, 36.2932f, 132.659f, 43.1204f);
                this.LIZJ.LJIIIIZZ(175.231f, 67.622f);
                this.LIZJ.LJFF(183.749f, 72.5245f, 189.0f, 81.6097f, 189.0f, 91.4448f);
                this.LIZJ.LJIJI(146.555f);
                this.LIZJ.LJFF(189.0f, 156.39f, 183.749f, 165.476f, 175.231f, 170.378f);
                this.LIZJ.LJIIIIZZ(132.659f, 194.88f);
                this.LIZJ.LJFF(120.797f, 201.707f, 106.203f, 201.707f, 94.3406f, 194.88f);
                this.LIZJ.LJIIIIZZ(51.7693f, 170.378f);
                this.LIZJ.LJFF(43.2511f, 165.476f, 38.0f, 156.39f, 38.0f, 146.555f);
                this.LIZJ.LJIJI(91.4448f);
                this.LIZJ.LJFF(38.0f, 81.6097f, 43.2511f, 72.5245f, 51.7692f, 67.622f);
                this.LIZJ.LJIIIIZZ(94.3406f, 43.1204f);
                this.LIZJ.LJ();
                this.LIZJ.LJIJ(Path.FillType.WINDING);
                this.LIZIZ.setStyle(Paint.Style.STROKE);
                this.LIZIZ.setStrokeWidth(6.0f);
                this.LIZIZ.setStrokeCap(Paint.Cap.ROUND);
                this.LIZIZ.setAlpha(82);
                this.LIZIZ.setColor(Color.argb(82, 217, 217, 217));
                this.LIZ.add(this.LIZIZ);
            }

            @Override // X.AbstractC415370GQl
            public final void LIZ(Canvas canvas) {
                LIZIZ(228.0f, 240.0f, canvas);
                canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
            }
        });
        LLLLLJIL().setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/creation-obj-us/creation_alself_queueing_ani_tux_lottie.json");
        LLLLLJIL().setRepeatCount(-1);
        TuxTextView tuxTextViewLLLLLL = LLLLLL();
        tuxTextViewLLLLLL.setTypeface(Typeface.SANS_SERIF, 3);
        tuxTextViewLLLLLL.setTextSize(1, 40.0f);
        ((TuxTextView) this.LLJLILLLLZIIL.getValue()).setTypeface(Typeface.SANS_SERIF, 3);
        ((TuxTextView) this.LLJLIL.getValue()).setTypeface(Typeface.SANS_SERIF, 3);
        C786410Ut5.I7(new AkS80S0100000_8(this, 24), (View) this.LLJLL.getValue());
        C0MIO c0mio = (C0MIO) this.LLJJJJ.getValue();
        if (c0mio != null) {
            c0mio.Hg1(this.LLJILLL, new AwS583S0100000_4(this, 156));
        }
        C0MIO c0mio2 = (C0MIO) this.LLJJJJ.getValue();
        if (c0mio2 != null) {
            c0mio2.iE(this.LLJILLL, new C527970KnD(this, null));
        }
        C0MIO c0mio3 = (C0MIO) this.LLJJJJ.getValue();
        if (c0mio3 != null) {
            c0mio3.tH(this.LLJILLL, new AwS587S0100000_8(this, 409));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byi, viewGroup, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C960203pA.LIZ(R.attr.e4, requireSceneContext()));
        viewGroup2.setBackground(gradientDrawable);
        return viewGroup2;
    }
}
