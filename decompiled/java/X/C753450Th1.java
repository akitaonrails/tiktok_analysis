package X;

import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Th1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753450Th1 implements InterfaceC517220KQe {
    public final CharSequence LIZ;
    public final View.OnClickListener LIZIZ;
    public final ColorStateList LIZJ;
    public final InterfaceC753420Tgy LIZLLL;
    public final int LJ;

    public C753450Th1(C753460Th2 c753460Th2) {
        this.LIZ = c753460Th2.LIZ;
        this.LIZIZ = c753460Th2.LIZIZ;
        this.LIZJ = c753460Th2.LIZJ;
        this.LIZLLL = c753460Th2.LJ;
        this.LJ = c753460Th2.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Th3, android.view.View] */
    @Override // X.InterfaceC517220KQe
    public final View LIZ(final Context context, ViewGroup viewGroup, DialogInterface dialogInterface) {
        ?? r3 = new C1091740eW4(context) { // from class: X.0Th3
            public TextView LLILZ;
            public ImageView LLILZIL;

            {
                LinearLayout.inflate(getContext(), R.layout.deg, this);
                setOrientation(0);
                setGravity(17);
                this.LLILZ = (TextView) findViewById(R.id.n1p);
                this.LLILZIL = (ImageView) findViewById(R.id.n1o);
            }

            public void setColor(ColorStateList colorStateList) {
                if (colorStateList == null) {
                    return;
                }
                this.LLILZ.setTextColor(colorStateList);
                C1763660vzo.LIZJ(this.LLILZIL, colorStateList);
            }

            public void setColorAttr(int i) {
                setColor(C20736316Cj.LIZIZ(i, getContext()));
            }

            public void setText(int i) {
                this.LLILZ.setText(i);
            }

            public void setColor(int i) {
                setColor(ColorStateList.valueOf(i));
            }

            public void setText(CharSequence charSequence) {
                this.LLILZ.setText(charSequence);
            }
        };
        r3.setText(this.LIZ);
        int i = this.LJ;
        if (i != -1) {
            r3.setColorAttr(i);
        } else {
            ColorStateList colorStateList = this.LIZJ;
            if (colorStateList != null) {
                r3.setColor(colorStateList);
            }
        }
        if (this.LIZLLL == null) {
            C786410Ut5.a8(r3, this.LIZIZ);
        } else {
            C786410Ut5.a8(r3, new ACListenerS116S0200000_12(this, dialogInterface, 109));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView((View) r3, layoutParams);
        return frameLayout;
    }
}
