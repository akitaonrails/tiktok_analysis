package X;

import Y.ACListenerS162S0100000_28;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.services.external.ICommerceToolsService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;
import u4.q0;

/* JADX INFO: renamed from: X.0zqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911760zqg implements InterfaceC1911830zqn {
    public final Context LIZ;
    public final View LIZIZ;
    public final boolean LIZJ;
    public final LinearLayout LIZLLL;
    public final LinearLayout LJ;
    public final TuxTextView LJFF;
    public final TuxTextView LJI;
    public final TuxIconView LJII;
    public final TuxIconView LJIIIIZZ;
    public final RelativeLayout LJIIIZ;
    public final RelativeLayout LJIIJ;
    public final TuxIconView LJIIJJI;
    public final TuxIconView LJIIL;
    public C1910140zo4 LJIILIIL;
    public final List<C1911800zqk> LJIILJJIL;
    public Function0<Unit> LJIILL;
    public final Keva LJIILLIIL;

    public final void LIZJ() {
        if (this.LIZJ) {
            C786410Ut5.LLLLLLZZ(this.LJIIJJI, 8);
            C786410Ut5.LLLLLLZZ(this.LJIIL, 8);
            ((ICommerceToolsService) ServiceManager.get().getService(ICommerceToolsService.class)).getMusicContext().setInCommercialSoundPage(false);
            return;
        }
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZLLL() && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            long j = this.LJIILLIIL.getLong("is_commercial_dialog_shown", -1L);
            if (j == -1 || System.currentTimeMillis() - j > 2592000000L) {
                ICreativeSAAService iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null);
                if (iCreativeSAAService != null) {
                    Activity activityLIZ = C1388190mED.LIZ(this.LIZ);
                    if (activityLIZ == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    iCreativeSAAService.invokeMethodsSafely(activityLIZ, new AwS572S0100000_28(this, 8));
                }
                this.LJIILLIIL.storeLong("is_commercial_dialog_shown", System.currentTimeMillis());
            }
        }
        C786410Ut5.LLLLLLZZ(this.LJIIJJI, ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ() ? 0 : 8);
        C786410Ut5.a9(this.LJIIJJI, new ACListenerS162S0100000_28(this, 1));
        C786410Ut5.LLLLLLZZ(this.LJIIL, ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ() ? 0 : 8);
        C786410Ut5.a9(this.LJIIL, new ACListenerS162S0100000_28(this, 2));
    }

    @Override // X.InterfaceC1911830zqn
    public final void LIZ(C1911800zqk c1911800zqk) {
        if (!c1911800zqk.LIZ) {
            this.LJFF.setText(2131828635);
            this.LJI.setText(2131828635);
        } else {
            this.LJFF.setText(2131837748);
            this.LJI.setText(2131837748);
        }
        C1910140zo4 c1910140zo4 = this.LJIILIIL;
        if (c1910140zo4 != null) {
            c1910140zo4.dismiss();
        }
        InterfaceC681980Qp2 musicContext = ((ICommerceToolsService) ServiceManager.get().getService(ICommerceToolsService.class)).getMusicContext();
        boolean inCommercialSoundPage = musicContext.getInCommercialSoundPage();
        boolean z = c1911800zqk.LIZ;
        if (inCommercialSoundPage != z) {
            musicContext.setInCommercialSoundPage(z);
            LIZJ();
            Function0<Unit> function0 = this.LJIILL;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void LIZIZ(float f) {
        if (Float.isNaN(f)) {
            if (!this.LIZLLL.isClickable()) {
                this.LIZLLL.setEnabled(true);
                this.LIZLLL.setClickable(true);
            }
            if (!this.LJ.isClickable()) {
                this.LJ.setEnabled(true);
                this.LJ.setClickable(true);
                return;
            }
            return;
        }
        if (this.LIZLLL.isClickable()) {
            this.LIZLLL.setEnabled(false);
            this.LIZLLL.setClickable(false);
        }
        if (!this.LJ.isClickable()) {
            return;
        }
        this.LJ.setEnabled(false);
        this.LJ.setClickable(false);
    }

    public final void LIZLLL(RelativeLayout relativeLayout) {
        final TuxIconView tuxIconView;
        if (this.LJIIIZ.getVisibility() == 0) {
            tuxIconView = this.LJII;
        } else {
            tuxIconView = this.LJIIIIZZ;
        }
        if (this.LJIILIIL == null) {
            ((ArrayList) this.LJIILJJIL).clear();
            C1910140zo4 c1910140zo4 = new C1910140zo4(this.LIZ, this);
            c1910140zo4.setWidth(C14KQ.LIZIZ(this.LIZ));
            ((ArrayList) this.LJIILJJIL).add(new C1911800zqk(false, 2131828635));
            ((ArrayList) this.LJIILJJIL).add(new C1911800zqk(true, 2131837748));
            List<C1911800zqk> list = this.LJIILJJIL;
            C1911810zql c1911810zql = c1910140zo4.LLILLJJLI;
            if (c1911810zql == null) {
                c1911810zql = null;
            }
            c1911810zql.setData(list);
            c1910140zo4.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0zqh
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "rotation", 180.0f, 0.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    C786410Ut5.Pd(objectAnimatorOfFloat);
                }
            });
            this.LJIILIIL = c1910140zo4;
        }
        C1910140zo4 c1910140zo42 = this.LJIILIIL;
        if (c1910140zo42 != null) {
            c1910140zo42.showAsDropDown(relativeLayout);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, 180.0f);
        objectAnimatorOfFloat.setDuration(200L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public C1911760zqg(Context context, View view, boolean z) {
        int i;
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = z;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.nj0);
        this.LIZLLL = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.epr);
        this.LJ = linearLayout2;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LJFF = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.epx);
        this.LJI = tuxTextView2;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.lxz);
        this.LJII = tuxIconView;
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.epq);
        this.LJIIIIZZ = tuxIconView2;
        this.LJIIIZ = (RelativeLayout) view.findViewById(R.id.y0_);
        this.LJIIJ = (RelativeLayout) view.findViewById(R.id.epu);
        this.LJIIJJI = (TuxIconView) view.findViewById(R.id.lcr);
        this.LJIIL = (TuxIconView) view.findViewById(R.id.epp);
        this.LJIILJJIL = new ArrayList();
        this.LJIILLIIL = Keva.getRepo("commercial_music_dialog_repo");
        if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIJI() && !z) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            if (((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ()) {
                i = 2131837748;
            } else {
                i = 2131828635;
            }
            tuxTextView.setText(i);
            C10VP.LIZIZ(linearLayout);
            q0.LJIJI(linearLayout, true);
            C786410Ut5.R7(linearLayout, new ACListenerS162S0100000_28(this, 3));
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            tuxTextView2.setText(((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIIJ() ? 2131837748 : 2131828635);
            C10VP.LIZIZ(linearLayout2);
            C786410Ut5.R7(linearLayout2, new ACListenerS162S0100000_28(this, 4));
        }
        LIZJ();
    }
}
