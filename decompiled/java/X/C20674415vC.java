package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15vC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("story2_tap_to_next_video_guide")
public final class C20674415vC extends AbstractC725620SdE {
    public final Function0<Unit> LLILZIL;
    public C20674515vD LLILZLL;
    public final WeakReference<ConstraintLayout> LLIZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 7001;
    }

    @Override // X.AbstractC725620SdE
    public final void LJIIL() {
        C20674515vD c20674515vD = this.LLILZLL;
        if (c20674515vD != null) {
            AnonymousClass0956 anonymousClass0956 = c20674515vD.LJFF;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c20674515vD.LJFF = null;
            c20674515vD.LIZ();
        }
    }

    public C20674415vC(ConstraintLayout constraintLayout, Function0<Unit> function0) {
        super("tap_to_forward");
        this.LLILZIL = function0;
        this.LLIZ = new WeakReference<>(constraintLayout);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        View decorView;
        ViewGroup viewGroup;
        C1295960jpS c1295960jpS;
        float f;
        int i;
        Fragment fragmentLIZ;
        C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
        if (c19egLIZIZ == null) {
            c20656615sK.LIZ();
            return;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && (fragmentLIZ = iDetailFeedSafService.LIZ(this.LLIZ.get())) != null) {
            decorView = fragmentLIZ.getView();
        } else {
            decorView = null;
        }
        if (!(decorView instanceof FrameLayout) || decorView == null) {
            decorView = c19egLIZIZ.getWindow().getDecorView();
            if (!(decorView instanceof FrameLayout) || decorView == null) {
                c20656615sK.LIZ();
                return;
            }
        }
        WeakReference weakReference = new WeakReference(decorView);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c20656615sK, 1358);
        C20674515vD c20674515vD = new C20674515vD(c19egLIZIZ, weakReference, awS575S0100000_31, new AwS575S0100000_31(this, 1359));
        View view = (View) c20674515vD.LJ.getValue();
        if (view == null || (viewGroup = (ViewGroup) C2101808Lg.LIZ(weakReference, AFwS276S0000000_31.get$arr$(271))) == null || (c1295960jpS = (C1295960jpS) view.findViewById(R.id.b4e)) == null) {
            awS575S0100000_31.invoke();
        } else {
            C1391850mK7.LIZIZ(view, "439");
            TextView textView = (TextView) view.findViewById(R.id.jdm);
            if (textView != null) {
                Resources resources = view.getResources();
                if (C444960Hcc.LIZIZ()) {
                    i = 2131849023;
                } else {
                    i = 2131849024;
                }
                textView.setText(resources.getString(i));
            }
            View viewFindViewById = view.findViewById(R.id.b4e);
            if (viewFindViewById != null) {
                if (C444960Hcc.LIZIZ()) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.Ob(viewFindViewById, f);
            }
            C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
            viewGroup.addView(view);
            C849850XVn.LIZIZ.LIZJ().LIZIZ(view);
            c1295960jpS.setAnimation(R.raw.tux_lottie_tux_gestures_only_tt_tap);
            c1295960jpS.playAnimation();
            C786410Ut5.T4(view, 0.0f);
            view.animate().alpha(1.0f).setDuration(250L).setListener(null);
            c20674515vD.LJFF = C23250099c.LIZLLL(C817503Hh.LL, C2108208Ns.LIZ, null, new C350701Xt(c20674515vD, null), 2);
        }
        this.LLILZLL = c20674515vD;
    }
}
