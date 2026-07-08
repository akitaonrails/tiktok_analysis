package X;

import Y.ACListenerS166S0100000_32;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS169S0101000_32;
import kotlin.jvm.internal.AwS181S1100000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS46S0102000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21285518Rp extends C1394720mOk {
    public static final /* synthetic */ int LLJJ = 0;
    public boolean LLIZ;
    public String LLIZLLLIL;
    public final C419910GdJ LLJ;
    public final C419910GdJ LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // X.C1394720mOk
    public final int LIZ() {
        return R.layout.cyu;
    }

    public TuxIconView getButton() {
        return (TuxIconView) this.LLJIJIL.getValue();
    }

    public SmartImageView getCover() {
        return (SmartImageView) this.LLJILJIL.getValue();
    }

    public FrameLayout getCoverContainer() {
        return (FrameLayout) this.LLJILJILJ.getValue();
    }

    public ConstraintLayout getTopicItemContainer() {
        return (ConstraintLayout) this.LLJILLL.getValue();
    }

    @Override // android.view.View
    public final String getId() {
        return this.LLIZLLLIL;
    }

    public final void LIZIZ(UrlModel urlModel) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS433S0200000_32(this, urlModel, 18));
            return;
        }
        LIZLLL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(81)));
        LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
        setPanelItemHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(102)));
        getCover().setPlaceholderImage(R.color.an);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJJ(getCover());
        c1331670kl3LJIIIIZZ.LJIIJ(new AbstractC1335900krs() { // from class: X.165k
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                int i;
                int iLIZIZ;
                Number numberValueOf;
                int i2 = 90;
                if (c428600GrK != null) {
                    i2 = c428600GrK.LIZIZ;
                }
                if (c428600GrK != null) {
                    i = c428600GrK.LIZ;
                } else {
                    i = 64;
                }
                float f = i2 / i;
                double d = f;
                if (d > 1.7d) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
                } else if (d >= 1.4d) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
                } else if (d >= 1.2d) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                }
                float f2 = iLIZIZ * f;
                if (f2 > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))) {
                    numberValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
                } else {
                    numberValueOf = Float.valueOf(f2);
                }
                this.LL.LIZLLL(iLIZIZ, numberValueOf.intValue());
            }
        });
    }

    public final void LJ(boolean z) {
        C419910GdJ c419910GdJ;
        if (!getAttached()) {
            getPendingSetting().offer(new AwS148S0110000_32(this, z, 1));
            return;
        }
        this.LLIZ = z;
        TuxIconView button = getButton();
        if (z) {
            c419910GdJ = this.LLJI;
        } else {
            c419910GdJ = this.LLJ;
        }
        button.setTuxIcon(c419910GdJ);
    }

    public final void setButton(C419910GdJ c419910GdJ) {
        getButton().setTuxIcon(c419910GdJ);
    }

    public final void setButtonOnClickListener(Function0<Unit> function0) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS433S0200000_32(this, (C21285518Rp) function0, (Function0<Unit>) 19));
        } else {
            C786410Ut5.a9(getButton(), new ACListenerS166S0100000_32(function0, 24));
        }
    }

    public void setButtonVisibility(int i) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS169S0101000_32(this, i, 9));
        } else {
            C786410Ut5.LLLLLLZZ(getButton(), i);
        }
    }

    public final void setCollected(boolean z) {
        this.LLIZ = z;
    }

    public final void setId(String str) {
        this.LLIZLLLIL = str;
    }

    public final void setPanelItemHeight(int i) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS169S0101000_32(this, i, 10));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getTopicItemContainer().getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.m6(getTopicItemContainer(), layoutParams);
    }

    public final void setRating(String str) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS181S1100000_32(this, str, 6));
        } else {
            C786410Ut5.LJZL(0, (LinearLayout) findViewById(R.id.srp));
            ((TextView) findViewById(R.id.srz)).setText(str);
        }
    }

    public C21285518Rp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZLLLIL = "";
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_bookmark;
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LJ = numValueOf;
        this.LLJ = c419910GdJ;
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ2.LIZ = R.raw.icon_bookmark_fill;
        c419910GdJ2.LJ = numValueOf;
        this.LLJI = c419910GdJ2;
        this.LLJIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 580));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 581));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 582));
        this.LLJILLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 583));
    }

    public final void LIZJ(int i, int i2) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS46S0102000_32(this, i, i2, 2));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getCoverContainer().getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        C786410Ut5.a6(getCoverContainer(), layoutParams);
    }

    public final void LIZLLL(int i, int i2) {
        if (!getAttached()) {
            getPendingSetting().offer(new AwS46S0102000_32(this, i, i2, 3));
            return;
        }
        ViewGroup.LayoutParams layoutParams = getCover().getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        C786410Ut5.G6(getCover(), layoutParams);
    }
}
