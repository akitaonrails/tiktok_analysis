package X;

import Y.AObserverS224S0100000_21;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lZV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362950lZV extends C1362650lZ1 {
    public C1087110eOb LLJLIL;
    public C427660Gpo LLJLILLLLZIIL;
    public RecyclerView LLJLL;
    public TuxNavBar LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final long LLL;
    public boolean LLLF;
    public boolean LLLFF;

    @Override // X.C1362650lZ1
    public final void LJ() {
    }

    @Override // X.C1362650lZ1
    public final void LJIIIZ() {
    }

    private final C1250250idj getEmptyNavBarTitle() {
        return (C1250250idj) this.LLJLLL.getValue();
    }

    private final C1250250idj getNavBarTitle() {
        return (C1250250idj) this.LLJZ.getValue();
    }

    private final float getVerticalTransition() {
        return ((Number) this.LLJZIJLIL.getValue()).floatValue();
    }

    public final void LJIIJJI() {
        C1087110eOb c1087110eOb = this.LLJLIL;
        if (c1087110eOb == null) {
            c1087110eOb = null;
        }
        C786410Ut5.LJLLLLLL(0, c1087110eOb);
        TuxNavBar tuxNavBar = this.LLJLLIL;
        if (tuxNavBar != null) {
            tuxNavBar.LJIJJ(getEmptyNavBarTitle());
        }
        C427660Gpo c427660Gpo = this.LLJLILLLLZIIL;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        C786410Ut5.Pd(ObjectAnimator.ofFloat(c427660Gpo, "alpha", 0.0f, 1.0f).setDuration(this.LLL));
        RecyclerView recyclerView = this.LLJLL;
        C786410Ut5.Pd(ObjectAnimator.ofFloat(recyclerView != null ? recyclerView : null, "translationY", -getVerticalTransition(), 0.0f).setDuration(this.LLL));
    }

    public final void LJIIL() {
        if (!this.LLLF) {
            if (!this.LLLFF) {
                ViewGroup viewGroup = this.LLJLL;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                while (viewGroup.getParent() != null && (viewGroup.getParent() instanceof ViewGroup) && viewGroup.getId() != R.id.nb1) {
                    viewGroup = (ViewGroup) viewGroup.getParent();
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                this.LLLFF = true;
            }
            C427660Gpo c427660Gpo = this.LLJLILLLLZIIL;
            if (c427660Gpo == null) {
                c427660Gpo = null;
            }
            C786410Ut5.Pd(ObjectAnimator.ofFloat(c427660Gpo, "alpha", 1.0f, 0.0f).setDuration(this.LLL));
            RecyclerView recyclerView = this.LLJLL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            C786410Ut5.Pd(ObjectAnimator.ofFloat(recyclerView, "translationY", getVerticalTransition(), 0.0f).setDuration(this.LLL));
        }
        C1087110eOb c1087110eOb = this.LLJLIL;
        C786410Ut5.LJLLLLLL(8, c1087110eOb != null ? c1087110eOb : null);
        TuxNavBar tuxNavBar = this.LLJLLIL;
        if (tuxNavBar != null) {
            tuxNavBar.LJIJJ(getNavBarTitle());
        }
    }

    @Override // X.C1362650lZ1
    public final void LIZIZ() {
        super.LIZIZ();
        Fragment hostFragment = getHostFragment();
        if (hostFragment != null) {
            getViewModel().LLJI.observe(hostFragment, new AObserverS224S0100000_21(this, 29));
        }
    }

    public C1362950lZV(C1361400lX0 c1361400lX0) {
        super(c1361400lX0);
        this.LLJLLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(546));
        this.LLJZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1439));
        this.LLJZIJLIL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(420));
        this.LLL = 180L;
    }

    @Override // X.C1362650lZ1
    public final void LJI(Context context) {
        C786410Ut5.LJLLJ(context, R.layout.crt, this);
    }

    public static void LJIILIIL(C427660Gpo c427660Gpo, Bundle bundle) {
        String string = bundle.getString("image_url", "");
        if (string.length() > 0) {
            C427660Gpo.LJIIJJI(c427660Gpo, string, false, null, null, false, false, null, null, false, AFwS259S0000000_21.get$arr$(181), 510);
        }
    }

    @Override // X.C1362650lZ1
    public final void LJIIJ(SharePackage sharePackage, List list, Fragment fragment, EnumC1369720lkQ enumC1369720lkQ, InterfaceC1362900lZQ interfaceC1362900lZQ, InterfaceC1362720lZ8 interfaceC1362720lZ8, String str) {
        TuxNavBar tuxNavBar;
        super.LJIIJ(sharePackage, list, fragment, enumC1369720lkQ, interfaceC1362900lZQ, interfaceC1362720lZ8, str);
        View view = fragment.getView();
        if (view != null && (tuxNavBar = (TuxNavBar) view.findViewById(R.id.y4p)) != null) {
            tuxNavBar.LJIJJ(getEmptyNavBarTitle());
        } else {
            tuxNavBar = null;
        }
        this.LLJLLIL = tuxNavBar;
        this.LLJLIL = (C1087110eOb) findViewById(R.id.am7);
        final C427660Gpo c427660Gpo = (C427660Gpo) findViewById(R.id.asn);
        final Bundle bundle = sharePackage.extras;
        String string = bundle.getString("uncrop_avatar_path", "");
        if (string.length() > 0) {
            Uri uriFromFile = Uri.fromFile(new C0VSJ(string));
            C1331660kl2.LIZJ().LJFF(uriFromFile);
            C427660Gpo.LJIIJJI(c427660Gpo, uriFromFile, false, null, null, false, false, null, new AbstractC1335900krs() { // from class: X.0lZW
                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view2, Throwable th) {
                    C1362950lZV c1362950lZV = this.LL;
                    C427660Gpo c427660Gpo2 = c427660Gpo;
                    Bundle bundle2 = bundle;
                    c1362950lZV.getClass();
                    C1362950lZV.LJIILIIL(c427660Gpo2, bundle2);
                }
            }, false, null, 894);
        } else {
            LJIILIIL(c427660Gpo, bundle);
        }
        this.LLJLILLLLZIIL = c427660Gpo;
        this.LLJLL = (RecyclerView) findViewById(R.id.tx2);
        C1364620lcC c1364620lcC = C1364620lcC.LIZ;
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", "show");
        C20684815ws.LJIILLIIL("ai_avatar_save_finish_page", c830490Whz);
    }
}
