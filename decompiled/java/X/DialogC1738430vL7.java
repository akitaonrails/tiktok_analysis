package X;

import Y.ACListenerS143S0100000_8;
import Y.AObserverS207S0100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vL7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class DialogC1738430vL7 extends DialogC1389100mFg {
    public final C2211008lQ LLJILJIL;
    public final InterfaceC1738440vL8 LLJILJILJ;
    public final EffectDraftSubmissionListViewModel LLJILLL;
    public C424560Gko LLJJ;
    public C420260Gds LLJJI;
    public FrameLayout LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public final Context LLJJJIL;
    public C0I7D LLJJJJ;
    public TuxTextView LLJJJJJIL;

    public final void LJLI() {
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.gpn);
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = C20642515q3.LJI(2131833194);
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_fill_small;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            c1251150ifB.LIZLLL();
            c1251150ifB.LJ = c419910GdJ;
            c1251150ifB.LIZJ(new AwS570S0100000_26(this, 1638));
            c1251150ifB.LIZLLL = true;
            c0om1.LIZIZ(c1251150ifB);
            c0om1.LIZLLL = true;
            tuxNavBar.setNavActions(c0om1);
        }
    }

    public final void LJLIIIL(String str) {
        C1748470vbJ c1748470vbJ;
        View viewSd = C786410Ut5.Sd(R.layout.d3z, C786410Ut5.ne(getContext()), null);
        if ((viewSd instanceof C1748470vbJ) && (c1748470vbJ = (C1748470vbJ) viewSd) != null) {
            c1748470vbJ.LJIILIIL(str);
            c1748470vbJ.LL.setLines(1);
            c1748470vbJ.LJIIIZ(1);
            c1748470vbJ.LIZJ();
            c1748470vbJ.LJFF(true);
            c1748470vbJ.LJIIJ(C20642515q3.LJI(2131833517));
            this.LLJJJJJIL = new TuxTextView(c1748470vbJ.getContext(), null, 6, 0);
            C0I7D c0i7d = (C0I7D) c1748470vbJ.findViewById(R.id.grz);
            this.LLJJJJ = c0i7d;
            if (c0i7d != null) {
                c0i7d.setTextAlignment(5);
            }
            c1748470vbJ.LIZIZ(new C1775970wJf(this, c1748470vbJ, 4));
            C420260Gds c420260Gds = this.LLJJI;
            if (c420260Gds != null) {
                c420260Gds.setContentFieldView(c1748470vbJ);
            }
            C420260Gds c420260Gds2 = this.LLJJI;
            if (c420260Gds2 != null) {
                c420260Gds2.setTitleText(C20642515q3.LJI(2131833779));
            }
        }
    }

    @Override // X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        UploadableMobileEffect uploadableMobileEffect;
        Drawable drawableLIZ;
        UploadableMobileEffect uploadableMobileEffect2;
        super.onCreate(bundle);
        this.LLJJ = (C424560Gko) findViewById(R.id.gx9);
        this.LLJJI = (C420260Gds) findViewById(R.id.gw8);
        this.LLJJIII = (FrameLayout) findViewById(R.id.gvh);
        C424560Gko c424560Gko = this.LLJJ;
        EnumC2159908dB enumC2159908dB = this.LLJILJIL.LIZ;
        int[] iArr = C2160108dD.LIZ;
        int i = iArr[enumC2159908dB.ordinal()];
        if (i != 1) {
            if (i == 2 && (uploadableMobileEffect2 = this.LLJILJIL.LIZLLL) != null) {
                String str = uploadableMobileEffect2.iconFilePath;
                this.LLJJIJI = str;
                this.LLJJJ = str;
                C0VSJ c0vsj = new C0VSJ(uploadableMobileEffect2.iconFilePath);
                this.LLJILLL.LL.setValue(Uri.fromFile(c0vsj));
                C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(c0vsj);
                c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJII.LJJ(c424560Gko);
                C786410Ut5.h3(c1331670kl3LJII);
            }
        } else {
            UploadableDraftEffect uploadableDraftEffect = this.LLJILJIL.LIZJ;
            if (uploadableDraftEffect != null) {
                String str2 = uploadableDraftEffect.iconFilePath;
                this.LLJJIJI = str2;
                this.LLJJJ = str2;
                C0VSJ c0vsj2 = new C0VSJ(uploadableDraftEffect.iconFilePath);
                this.LLJILLL.LL.setValue(Uri.fromFile(c0vsj2));
                C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(c0vsj2);
                c1331670kl3LJII2.LJJ = EnumC1338240kve.FIT_CENTER;
                c1331670kl3LJII2.LJJ(c424560Gko);
                C786410Ut5.h3(c1331670kl3LJII2);
            }
        }
        FrameLayout frameLayout = this.LLJJIII;
        if (frameLayout != null) {
            Context context = frameLayout.getContext();
            if (context != null) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(15));
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LJFF = Integer.valueOf(R.attr.bx);
                drawableLIZ = c384050F3z.LIZ(context);
            } else {
                drawableLIZ = null;
            }
            frameLayout.setBackground(drawableLIZ);
        }
        C424560Gko c424560Gko2 = this.LLJJ;
        if (c424560Gko2 != null) {
            C786410Ut5.H9(c424560Gko2, new ACListenerS143S0100000_8(this, 153));
        }
        LJLI();
        int i2 = iArr[this.LLJILJIL.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && (uploadableMobileEffect = this.LLJILJIL.LIZLLL) != null) {
                String str3 = uploadableMobileEffect.effectName;
                this.LLJJIJIIJIL = str3;
                this.LLJJIJIL = str3;
                LJLIIIL(uploadableMobileEffect.effectName);
            }
        } else {
            UploadableDraftEffect uploadableDraftEffect2 = this.LLJILJIL.LIZJ;
            if (uploadableDraftEffect2 != null) {
                String str4 = uploadableDraftEffect2.effectName;
                this.LLJJIJIIJIL = str4;
                this.LLJJIJIL = str4;
                LJLIIIL(uploadableDraftEffect2.effectName);
            }
        }
        LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(getContext());
        if (lifecycleOwnerLIZIZ != null) {
            this.LLJILLL.LL.observe(lifecycleOwnerLIZIZ, new AObserverS207S0100000_3(this, 14));
        }
    }

    public DialogC1738430vL7(Context context, C2211008lQ c2211008lQ, InterfaceC1738440vL8 interfaceC1738440vL8, EffectDraftSubmissionListViewModel effectDraftSubmissionListViewModel) {
        super(context, 0);
        this.LLJILJIL = c2211008lQ;
        this.LLJILJILJ = interfaceC1738440vL8;
        this.LLJILLL = effectDraftSubmissionListViewModel;
        this.LLJJJIL = context;
    }
}
