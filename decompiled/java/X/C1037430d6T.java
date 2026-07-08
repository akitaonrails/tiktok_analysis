package X;

import Y.ACListenerS119S0200000_16;
import Y.ACListenerS82S0300000_16;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0d6T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037430d6T extends LinearLayout implements InterfaceC1038540d8G {
    public C1017520caM LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;
    public final C197039127h LLILZIL;
    public final CopyOnWriteArrayList<InterfaceC1037440d6U> LLILZLL;

    @Override // X.InterfaceC1038540d8G
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC1038540d8G
    public final void LIZIZ() {
        this.LLILZIL.performClick();
    }

    @Override // X.InterfaceC1038540d8G
    public final boolean isVisible() {
        return getVisibility() == 0;
    }

    public C1037430d6T(Context context) {
        super(context, null, 0);
        this.LLILZLL = new CopyOnWriteArrayList<>();
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.lb, this, true);
        setOrientation(0);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.a_j);
        this.LLILLL = (TuxIconView) findViewById(R.id.a_g);
        this.LLILZ = (TuxTextView) findViewById(R.id.a_h);
        findViewById(R.id.a_i);
        this.LLILZIL = (C197039127h) findViewById(R.id.a_k);
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0WAZ(new C259800zU(), context, this, null), 2);
    }

    @Override // X.InterfaceC1038540d8G
    public final void LIZ(InterfaceC1037440d6U interfaceC1037440d6U) {
        this.LLILZLL.remove(interfaceC1037440d6U);
    }

    @Override // X.InterfaceC1038540d8G
    public final void LIZJ(C1035880d3y c1035880d3y) {
        if (c1035880d3y.getIabType() != 1) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        } else {
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            C1041160dCU c1041160dCU = new C1041160dCU(new C1041170dCV(0, 0, null, null, c1035880d3y, 30));
            C1037680d6s.LIZ.getClass();
            c1041160dCU.logAd(C1037680d6s.LIZIZ, c1035880d3y.getAwemeRawAd());
        }
    }

    @Override // X.InterfaceC1038540d8G
    public final void LIZLLL(InterfaceC1037440d6U interfaceC1037440d6U) {
        if (!this.LLILZLL.contains(interfaceC1037440d6U)) {
            this.LLILZLL.add(interfaceC1037440d6U);
        }
    }

    public final void LJ(C1035880d3y c1035880d3y) {
        String creativeIdStr;
        InterfaceC1017210cZr interfaceC1017210cZr;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        C1017520caM c1017520caMSW0 = null;
        if (awemeRawAd != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null && (interfaceC1017210cZr = (InterfaceC1017210cZr) C1043460dGC.LJI(InterfaceC1017210cZr.class)) != null) {
            c1017520caMSW0 = interfaceC1017210cZr.SW0(creativeIdStr);
        }
        this.LL = c1017520caMSW0;
        C786410Ut5.U8(this.LLILZIL, new ACListenerS82S0300000_16(this, c1035880d3y, 15));
        C786410Ut5.a9(this.LLILLJJLI, new ACListenerS119S0200000_16(this, c1035880d3y, 24));
    }

    public final void setBrowserInfo(C818790WAb c818790WAb) {
        String strLJIIJ;
        Drawable drawable;
        Drawable drawableLJIILIIL;
        TuxTextView tuxTextView = this.LLILZ;
        if (c818790WAb == null || (strLJIIJ = c818790WAb.LIZ) == null) {
            strLJIIJ = C1383370m6R.LJIIJ(2131824735);
        }
        tuxTextView.setText(strLJIIJ);
        if (c818790WAb != null) {
            drawable = c818790WAb.LIZIZ;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            TuxIconView tuxIconView = this.LLILLL;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zi);
            c384050F3z.LJFF = Integer.valueOf(R.attr.zp);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            tuxIconView.setBackground(c384050F3z.LIZ(this.LLILLL.getContext()));
            this.LLILLL.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            drawableLJIILIIL = c818790WAb.LIZIZ;
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZ = R.raw.icon_globe_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a00);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LLILLL.getContext());
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            drawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z2.LIZ(this.LLILLL.getContext()));
        }
        this.LLILLL.setImageDrawable(drawableLJIILIIL);
    }

    @Override // X.InterfaceC1038540d8G
    public void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, this);
    }
}
