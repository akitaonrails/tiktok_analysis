package X;

import Y.ACListenerS165S0100000_31;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.share.dislike.DislikeHashTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20623715n1 {
    public final TuxTextView LIZ;
    public final DislikeHashTag LIZIZ;
    public final InterfaceC20623815n2 LIZJ;
    public int LIZLLL;
    public final Drawable LJ;
    public final Drawable LJFF;
    public final String LJI;

    public final void LIZ(int i) {
        if (i == this.LIZLLL) {
            return;
        }
        this.LIZLLL = i;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    this.LIZ.setBackground(this.LJFF);
                    TuxTextView tuxTextView = this.LIZ;
                    tuxTextView.setTextColor(C960203pA.LIZ(R.attr.a1h, tuxTextView.getContext()));
                    return;
                }
                return;
            }
            this.LIZ.setBackground(this.LJ);
            TuxTextView tuxTextView2 = this.LIZ;
            tuxTextView2.setTextColor(C960203pA.LIZ(R.attr.a1h, tuxTextView2.getContext()));
            return;
        }
        this.LIZ.setBackground(this.LJ);
        TuxTextView tuxTextView3 = this.LIZ;
        tuxTextView3.setTextColor(C960203pA.LIZ(R.attr.uh, tuxTextView3.getContext()));
    }

    public C20623715n1(TuxTextView tuxTextView, DislikeHashTag dislikeHashTag, InterfaceC20623815n2 interfaceC20623815n2) {
        this.LIZ = tuxTextView;
        this.LIZIZ = dislikeHashTag;
        this.LIZJ = interfaceC20623815n2;
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.bbx);
        this.LJ = drawableLIZIZ;
        this.LJFF = C800330VaR.LIZIZ(tuxTextView.getContext(), R.drawable.bbw);
        this.LJI = tuxTextView.getContext().getString(2131836307);
        tuxTextView.setBackground(drawableLIZIZ);
        C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 202));
    }
}
