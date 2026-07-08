package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Hls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450700Hls extends FrameLayout {
    public final View LL;
    public C450840Hm6 LLILLJJLI;

    public final C450840Hm6 getAction() {
        return this.LLILLJJLI;
    }

    public C450700Hls(Context context) {
        super(context, null, R.attr.z6);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ha, this, true);
        this.LL = viewTd;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxTooltip, R.attr.z6, 0);
        try {
            TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.text);
            int i = R$styleable.TuxTooltip__tux_tooltipActionFont;
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i);
            tuxTextView.setTuxFont(typedArrayObtainStyledAttributes.getInt(i, 0));
            int i2 = R$styleable.TuxTooltip__tux_tooltipActionTextColor;
            C450710Hlt.LIZ(typedArrayObtainStyledAttributes, i2);
            tuxTextView.setTextColor(typedArrayObtainStyledAttributes.getColor(i2, 0));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setAction(C450840Hm6 c450840Hm6) {
        Integer numLIZLLL;
        this.LLILLJJLI = c450840Hm6;
        if (c450840Hm6 != null) {
            if (c450840Hm6.LIZ != 0) {
                C786410Ut5.LJZI(0, (ImageView) this.LL.findViewById(R.id.jxe));
                ImageView imageView = (ImageView) this.LL.findViewById(R.id.jxe);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c450840Hm6.LIZ;
                if (c450840Hm6.LIZIZ != 0) {
                    numLIZLLL = C1308910kAL.LIZJ(c450840Hm6.LIZIZ, getContext());
                } else {
                    numLIZLLL = C1308910kAL.LIZLLL(getContext(), R$styleable.TuxTooltip, R$styleable.TuxTooltip__tux_tooltipActionTextColor);
                }
                c419910GdJ.LIZLLL = numLIZLLL;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                imageView.setImageDrawable(c419910GdJ.LIZ(getContext()));
            } else {
                C786410Ut5.LJZI(8, (ImageView) this.LL.findViewById(R.id.jxe));
            }
            TuxTextView tuxTextView = (TuxTextView) this.LL.findViewById(R.id.text);
            if (c450840Hm6.LIZJ != 0) {
                tuxTextView.setText(getResources().getString(c450840Hm6.LIZJ));
            } else {
                tuxTextView.setText(c450840Hm6.LIZLLL);
            }
            int i = c450840Hm6.LJ;
            if (i != -1) {
                tuxTextView.setTextColorRes(i);
            }
            C427690Gpr.LJ(this.LL, C418440Gaw.LIZIZ(8));
            C786410Ut5.I7(c450840Hm6.LJFF, this.LL);
            int i2 = C20094413jq.LJIIZILJ;
            View view = this.LL;
            C1397760mTe c1397760mTe = new C1397760mTe();
            c1397760mTe.LIZ = tuxTextView.getText();
            c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
            c1397760mTe.LIZJ = null;
            C20094813ju.LIZ(view, c1397760mTe.LIZ());
        }
    }
}
