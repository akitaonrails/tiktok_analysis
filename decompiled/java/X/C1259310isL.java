package X;

import Y.ACListenerS122S0200000_19;
import Y.AObjectS362S0100000_19;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0isL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("story_archive_v2_profile_popup")
public final class C1259310isL extends AbstractC20660015ss<View> {
    public final Context LL;
    public final Fragment LLILLJJLI;
    public final Function1<C20515215Pi, Unit> LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 499;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        return null;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        View view;
        ViewGroup viewGroup;
        Fragment fragment = this.LLILLJJLI;
        if (fragment != null) {
            view = fragment.getView();
        } else {
            view = null;
        }
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_lock;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this.LL);
        C20515215Pi c20515215Pi = new C20515215Pi(viewGroup);
        Context context = c20515215Pi.LIZIZ;
        if (context != null) {
            c20515215Pi.LIZIZ = C1388190mED.LJ(R.attr.a1d, context);
        }
        c20515215Pi.LJFF(c419910GdJ);
        c20515215Pi.LIZ.LIZIZ = 8000L;
        c20515215Pi.LJII(2131833968);
        c20515215Pi.LIZJ(2131833967);
        c20515215Pi.LIZ(2131833964);
        int iLIZ = C1338790kwX.LIZ(44.0f);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJIIIZ = iLIZ;
        c1057450dcl.LJIILL = true;
        c1057450dcl.LJIIL = true;
        c1057450dcl.LIZJ = true;
        c1057450dcl.LJIILIIL = new ACListenerS122S0200000_19(this, c20515215Pi, 40);
        c1057450dcl.LJIIJJI = new ACListenerS122S0200000_19(this, c20515215Pi, 41);
        c1057450dcl.LJIILJJIL = AFwS257S0000000_19.get$arr$(638);
        c20515215Pi.LJ();
        C20514915Pf c20514915Pf = c20515215Pi.LJ;
        C735840Sti.LIZ.getClass();
        C735840Sti.LJIJ("show", "personal_homepage_bottom");
        return c20514915Pf;
    }

    public C1259310isL(Context context, Fragment fragment, AObjectS362S0100000_19 aObjectS362S0100000_19) {
        this.LL = context;
        this.LLILLJJLI = fragment;
        this.LLILLL = aObjectS362S0100000_19;
    }
}
