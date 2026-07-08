package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;

/* JADX INFO: renamed from: X.0vcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749160vcQ extends FrameLayout {
    public final TuxIconView LL;
    public final LinearLayout LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final LinearLayout LLILZLL;
    public final LinearLayout LLIZ;
    public InterfaceC1749170vcR LLIZLLLIL;
    public final LinearLayout.LayoutParams LLJ;
    public final LinearLayout.LayoutParams LLJI;
    public boolean LLJIJIL;

    public C1749160vcQ(Context context) {
        super(context, null, 0);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        this.LL = tuxIconView;
        LinearLayout linearLayout = new LinearLayout(context);
        this.LLILLJJLI = linearLayout;
        SmartImageView smartImageView = new SmartImageView(context);
        this.LLILLL = smartImageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLILZ = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        this.LLILZIL = tuxTextView2;
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        this.LLILZLL = linearLayout2;
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.LLIZ = linearLayout3;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(280)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)));
        this.LLJ = layoutParams;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        this.LLJI = layoutParams2;
        this.LLJIJIL = true;
        LinearLayout linearLayout4 = this.LLILLJJLI;
        C786410Ut5.d6(linearLayout4, new FrameLayout.LayoutParams(-1, -2));
        linearLayout4.setOrientation(1);
        linearLayout4.setGravity(1);
        linearLayout4.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C786410Ut5.G6(this.LLILLL, this.LLJ);
        linearLayout4.addView(smartImageView);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C786410Ut5.R6(this.LLILZ, layoutParams3);
        linearLayout4.addView(tuxTextView);
        C786410Ut5.R6(this.LLILZIL, new LinearLayout.LayoutParams(-1, -2));
        linearLayout4.addView(tuxTextView2);
        linearLayout4.addView(linearLayout2);
        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C786410Ut5.d6(this.LLIZ, this.LLJI);
        C426750GoL.LJIIL(linearLayout3, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, 0, 16);
        linearLayout3.setOrientation(1);
        linearLayout4.addView(linearLayout3);
        linearLayout4.setGravity(17);
        tuxTextView.setTextAlignment(4);
        tuxTextView2.setTextAlignment(4);
        TuxIconView tuxIconView2 = this.LL;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        layoutParams4.gravity = 8388661;
        C786410Ut5.M6(tuxIconView2, layoutParams4);
        C0H9H.LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), tuxIconView2);
        C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), tuxIconView2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        tuxIconView2.setTuxIcon(c419910GdJ);
        C786410Ut5.I7(new AjS70S0100000_26(this, 77), tuxIconView2);
        addView(linearLayout);
        addView(tuxIconView);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0477 A[EDGE_INSN: B:268:0x0477->B:238:0x0477 BREAK  A[LOOP:4: B:230:0x0454->B:271:0x0454]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp r24) {
        /*
            Method dump skipped, instruction units count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1749160vcQ.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BasicPopUp):void");
    }

    public final void setListener(InterfaceC1749170vcR interfaceC1749170vcR) {
        this.LLIZLLLIL = interfaceC1749170vcR;
    }
}
