package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.experiment.SkipSystemPermissionPopup;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.ss.android.ugc.aweme.verify.EffectFullWidthHorizontalCarouselAB;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1662440tMY extends C1662320tMM {
    public final ShortVideoContext LLLIZZ;
    public final boolean LLLJ;
    public RemoteImageView LLLJIL;
    public boolean LLLJL;
    public ViewGroup LLLL;
    public ViewGroup LLLLII;
    public ViewGroup LLLLIIIILLL;
    public TuxIconView LLLLIIL;
    public ViewGroup LLLLIILL;
    public ViewGroup LLLLIILLL;
    public ViewGroup LLLLIL;
    public TuxIconView LLLLILI;
    public ViewGroup LLLLJ;
    public ViewGroup LLLLJI;
    public AutoDismissPermissionDialog LLLLL;
    public Boolean LLLLLIL;
    public Boolean LLLLLILLIL;
    public Boolean LLLLLJIL;

    @Override // X.C1662320tMM
    public final void LLLLLLJ(boolean z, boolean z2) {
    }

    public final void LLLLLLLLLL() {
        if (SkipSystemPermissionPopup.isEnabled()) {
            LLLLIL().LJFF.invoke();
        } else {
            this.LLLLLJIL = Boolean.TRUE;
            LLLLIL().LIZIZ.invoke();
        }
        C562660M4y c562660M4y = C562660M4y.LIZ;
        ShortVideoContext shortVideoContext = this.LLLIZZ;
        c562660M4y.getClass();
        C562660M4y.LIZ(shortVideoContext, "camera");
    }

    public final void LLLLLLLZIL() {
        if (SkipSystemPermissionPopup.isEnabled()) {
            LLLLIL().LJFF.invoke();
        } else {
            this.LLLLLJIL = Boolean.TRUE;
            LLLLIL().LIZ.invoke();
        }
        C562660M4y c562660M4y = C562660M4y.LIZ;
        ShortVideoContext shortVideoContext = this.LLLIZZ;
        c562660M4y.getClass();
        C562660M4y.LIZ(shortVideoContext, "microphone");
    }

    @Override // X.C1662320tMM
    public final boolean LLLLLJLJLL() {
        return this.LLLJ;
    }

    public final void LLLLLLLLL(Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_fill_small_green;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0i);
            TuxIconView tuxIconView = this.LLLLILI;
            if (tuxIconView != null) {
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            ViewGroup viewGroup = this.LLLLIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            ViewGroup viewGroup2 = this.LLLLIILLL;
            if (viewGroup2 != null) {
                viewGroup2.setEnabled(false);
            }
            ViewGroup viewGroup3 = this.LLLLIILL;
            if (viewGroup3 != null) {
                viewGroup3.setEnabled(false);
            }
            TuxIconView tuxIconView2 = this.LLLLILI;
            if (tuxIconView2 != null) {
                tuxIconView2.setEnabled(false);
                return;
            }
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_microphone_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.z_);
        TuxIconView tuxIconView3 = this.LLLLILI;
        if (tuxIconView3 != null) {
            tuxIconView3.setTuxIcon(c419910GdJ2);
        }
        ViewGroup viewGroup4 = this.LLLLIL;
        if (viewGroup4 != null) {
            C786410Ut5.LJLZ(8, viewGroup4);
        }
        ViewGroup viewGroup5 = this.LLLLIILLL;
        if (viewGroup5 != null) {
            viewGroup5.setEnabled(true);
        }
        ViewGroup viewGroup6 = this.LLLLIILL;
        if (viewGroup6 != null) {
            viewGroup6.setEnabled(true);
        }
        TuxIconView tuxIconView4 = this.LLLLILI;
        if (tuxIconView4 == null) {
            return;
        }
        tuxIconView4.setEnabled(true);
    }

    public final void LLLLLLZ(Boolean bool) {
        ViewGroup viewGroup = this.LLLLII;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLLLIILLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        LLLLLLLLL(Boolean.valueOf(C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")));
        if (Intrinsics.LJFF(Boolean.valueOf(C533930Kwp.LIZLLL("android.permission.CAMERA")), Boolean.TRUE)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_tick_fill_small_green;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a0i);
            TuxIconView tuxIconView = this.LLLLIIL;
            if (tuxIconView != null) {
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            ViewGroup viewGroup3 = this.LLLLIIIILLL;
            if (viewGroup3 != null) {
                C786410Ut5.LJLZ(0, viewGroup3);
            }
            ViewGroup viewGroup4 = this.LLLLII;
            if (viewGroup4 != null) {
                viewGroup4.setEnabled(false);
            }
            ViewGroup viewGroup5 = this.LLLL;
            if (viewGroup5 != null) {
                viewGroup5.setEnabled(false);
            }
            TuxIconView tuxIconView2 = this.LLLLIIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setEnabled(false);
            }
        } else {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_camera_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.z_);
            TuxIconView tuxIconView3 = this.LLLLIIL;
            if (tuxIconView3 != null) {
                tuxIconView3.setTuxIcon(c419910GdJ2);
            }
            ViewGroup viewGroup6 = this.LLLLIIIILLL;
            if (viewGroup6 != null) {
                C786410Ut5.LJLZ(8, viewGroup6);
            }
            ViewGroup viewGroup7 = this.LLLLII;
            if (viewGroup7 != null) {
                viewGroup7.setEnabled(true);
            }
            ViewGroup viewGroup8 = this.LLLL;
            if (viewGroup8 != null) {
                viewGroup8.setEnabled(true);
            }
            TuxIconView tuxIconView4 = this.LLLLIIL;
            if (tuxIconView4 != null) {
                tuxIconView4.setEnabled(true);
            }
        }
        if (bool != null) {
            this.LLLLLILLIL = Boolean.valueOf(bool.booleanValue());
        }
    }

    @Override // X.C1662320tMM, com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (d4.LIZ(this.LLLIZZ) && !this.LLLJL) {
            LLLLIL().LJ.invoke();
            this.LLLJL = true;
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LJIIL;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 205));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LJIILJJIL;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 206));
        LLLLJI(LLLLILI(), new C2217371BqR() { // from class: X.0tMd
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LIZJ;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1662500tMe) obj).LIZJ = (C0HWO) obj2;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 207));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0tMc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1662500tMe) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 208));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
    @Override // X.C1662320tMM, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1662440tMY.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.ViewGroup");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void LLLLLLZZ(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        ViewGroup viewGroup;
        if (bool != null) {
            bool.booleanValue();
            Boolean bool5 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool5)) {
                LLLLLLZ(bool3);
                if (Intrinsics.LJFF(bool4, bool5)) {
                    ViewGroup viewGroup2 = this.LLLLJ;
                    if (viewGroup2 != null) {
                        C786410Ut5.LJLZ(8, viewGroup2);
                    }
                    LLLLIL().LJIIIIZZ.invoke(Boolean.FALSE);
                    if (!EffectFullWidthHorizontalCarouselAB.isEnabled() && (viewGroup = this.LLLLJI) != null) {
                        C786410Ut5.LJLZ(0, viewGroup);
                    }
                }
            }
        }
    }

    public C1662440tMY(C1664690tQB<C1662500tMe> c1664690tQB, C1662570tMl c1662570tMl, C385670FAf<Boolean> c385670FAf, C385670FAf<Boolean> c385670FAf2, ShortVideoContext shortVideoContext) {
        super(c1664690tQB, c1662570tMl, c385670FAf, c385670FAf2, shortVideoContext);
        this.LLLIZZ = shortVideoContext;
        this.LLLJ = true;
    }
}
