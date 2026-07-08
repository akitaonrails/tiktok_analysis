package X;

import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gr8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428480Gr8 implements C186D<ConstraintLayout> {
    public InterfaceC428490Gr9 LIZ = new C428500GrA();

    @Override // X.C186D
    public final C0H0C LIZ(ConstraintLayout constraintLayout) {
        return (C0H0C) constraintLayout.findViewById(R.id.gm0);
    }

    @Override // X.C186D
    public final TuxTextView LIZIZ(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        TuxTextView tuxTextView = new TuxTextView(constraintLayout2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.glt);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setTuxFont(92);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setBackground(C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.bmw));
        C19ME c19me = new C19ME(-2, this.LIZ.LIZJ());
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.constrainedWidth = true;
        constraintLayout2.addView(tuxTextView, c19me);
        return tuxTextView;
    }

    @Override // X.C186D
    public final C186G LIZJ(ConstraintLayout constraintLayout) {
        return (C186G) constraintLayout.findViewById(R.id.gmj);
    }

    @Override // X.C186D
    public final AppCompatImageView LIZLLL(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        AppCompatImageView appCompatImageView = new AppCompatImageView(constraintLayout2.getContext());
        appCompatImageView.setId(R.id.gm6);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.wm);
        c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
        appCompatImageView.setBackground(c384050F3z.LIZ(constraintLayout2.getContext()));
        C19ME c19me = new C19ME(0, 0);
        c19me.endToEnd = 0;
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        c19me.constrainedWidth = true;
        constraintLayout2.addView(appCompatImageView, c19me);
        return appCompatImageView;
    }

    @Override // X.C186D
    public final SmartImageView LJ(ConstraintLayout constraintLayout) {
        Integer numLIZJ;
        SmartImageView smartImageView = (SmartImageView) constraintLayout.findViewById(R.id.gm_);
        if (this.LIZ.LJII()) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.eu9);
            c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
            smartImageView.setPlaceholderImage(c384050F3z.LIZ(smartImageView.getContext()));
        }
        Integer bgColor = this.LIZ.getBgColor();
        if (bgColor != null && (numLIZJ = C1308910kAL.LIZJ(bgColor.intValue(), smartImageView.getContext())) != null) {
            smartImageView.setColorFilter(numLIZJ.intValue());
        }
        return smartImageView;
    }

    @Override // X.C186D
    public final TuxTextView LJFF(ConstraintLayout constraintLayout) {
        ConstraintLayout constraintLayout2 = constraintLayout;
        TuxTextView tuxTextView = new TuxTextView(constraintLayout2.getContext(), null, 6, 0);
        tuxTextView.setId(R.id.glu);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setTuxFont(91);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJIIJJI = Float.valueOf(this.LIZ.LIZLLL());
        c384050F3z.LIZIZ = Integer.valueOf(this.LIZ.LJ());
        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        C19ME c19me = new C19ME(-2, this.LIZ.LIZJ());
        c19me.endToEnd = 0;
        c19me.startToEnd = R.id.glt;
        c19me.topToTop = 0;
        c19me.horizontalBias = 0.0f;
        c19me.constrainedWidth = true;
        constraintLayout2.addView(tuxTextView, c19me);
        return tuxTextView;
    }

    @Override // X.C186D
    public final void LJI(C428500GrA c428500GrA) {
        this.LIZ = c428500GrA;
    }
}
