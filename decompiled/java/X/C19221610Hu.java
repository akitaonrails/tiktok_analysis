package X;

import Y.ACListenerS162S0100000_28;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IPromoteReplaceMusicService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.edit.ReplaceMusicRequest;
import com.ss.android.ugc.aweme.services.edit.StripMusicRequest;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10Hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19221610Hu extends C214906198m implements InterfaceC1380420m1g {
    public final C19EG LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final ReplaceMusicRequest LLILZ;
    public final StripMusicRequest LLILZIL;
    public final View LLILZLL;
    public RelativeLayout LLIZ;
    public C1380390m1d LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public SmartImageView LLJIJIL;
    public TuxTextView LLJILJIL;
    public C20515215Pi LLJILJILJ;
    public boolean LLJILLL;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    public final void show() {
        if (this.LL.isFinishing()) {
            return;
        }
        ((IPromoteReplaceMusicService) ServiceManager.get().getService(IPromoteReplaceMusicService.class)).LIZ().getClass();
        if (C1911640zqU.LJI) {
            return;
        }
        if (!this.LLILLJJLI) {
            C20515215Pi c20515215Pi = this.LLJILJILJ;
            if (c20515215Pi != null) {
                c20515215Pi.LJ();
            }
            this.LLJILLL = true;
            return;
        }
        C19EG c19eg = this.LL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131829772);
        creativeToastBuilder.icon(R.raw.icon_tick_fill_small);
        creativeToastBuilder.iconColorRes(R.attr.a0i);
        C1390380mHk.LIZ(c19eg, 3035, creativeToastBuilder);
        ((C19221910Hx) ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService()).LJII(c19eg);
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        C20515215Pi c20515215Pi;
        if (isShowing() && !this.LL.isFinishing() && this.LLIZLLLIL.hasWindowFocus()) {
            this.LLIZLLLIL.LIZ(0.0f, true);
        }
        if (this.LLJILLL && (c20515215Pi = this.LLJILJILJ) != null) {
            c20515215Pi.LIZIZ();
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        dismiss();
    }

    public C19221610Hu(C19EG c19eg, boolean z, String str, ReplaceMusicRequest replaceMusicRequest, StripMusicRequest stripMusicRequest) {
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = replaceMusicRequest;
        this.LLILZIL = stripMusicRequest;
        View viewSd = C786410Ut5.Sd(R.layout.d_9, (LayoutInflater) C786410Ut5.H2(C0CHQ.LIZ, "layout_inflater"), null);
        this.LLILZLL = viewSd;
        this.LLIZ = (RelativeLayout) viewSd.findViewById(R.id.tp_);
        C1380390m1d c1380390m1d = (C1380390m1d) viewSd.findViewById(R.id.si1);
        this.LLIZLLLIL = c1380390m1d;
        c1380390m1d.LLILLL = this.LLIZ;
        c1380390m1d.setPullUpListener(this);
        this.LLJ = this.LLIZ.findViewById(R.id.lc0);
        this.LLJI = this.LLIZ.findViewById(R.id.video_retry);
        this.LLJIJIL = (SmartImageView) this.LLIZ.findViewById(R.id.ld7);
        this.LLJILJIL = (TuxTextView) this.LLIZ.findViewById(R.id.tv_tips);
        View view = this.LLJ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 206), view);
        }
        if (!TextUtils.isEmpty(str)) {
            C1324750kZt.LJIIIZ(this.LLJIJIL, str, (int) C12ES.LIZJ(48.0f, c19eg), (int) C12ES.LIZJ(62.0f, c19eg));
        }
        if (z) {
            View view2 = this.LLJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(4, view2);
            }
            TuxTextView tuxTextView = this.LLJILJIL;
            if (tuxTextView != null) {
                tuxTextView.setText(2131846360);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) c19eg.findViewById(R.id.s0t);
            if (viewGroup == null) {
                C201955140j.LJIIIIZZ(C201962140q.LIZIZ, "ReplaceMusicPopWindow", "can't find container view!");
            } else {
                C20515215Pi c20515215Pi = new C1257230ioz(viewGroup, true).LIZ;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_exclamation_mark_circle_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                c20515215Pi.LJFF(c419910GdJ);
                c20515215Pi.LIZJ(2131846363);
                c20515215Pi.LIZ(2131857938);
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LIZJ = false;
                c1057450dcl.LJIILL = true;
                c1057450dcl.LJIILIIL = new ACListenerS162S0100000_28(this, 207);
                c20515215Pi.LIZ.LJIILJJIL = new AwS607S0100000_28(this, 397);
                this.LLJILJILJ = c20515215Pi;
            }
        }
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(viewSd);
        setWidth(C12ES.LJIIJ(C0CHQ.LIZ));
        setHeight(-2);
        setAnimationStyle(R.style.afu);
    }
}
