package X;

import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19326010jC extends AbstractC1893000zMQ {
    public TuxNavBar LL;
    public String LLILLJJLI = "";
    public String LLILLL = "safe";
    public SparkContext LLILZ;
    public SparkActivity LLILZIL;
    public MusicLandingPageViewModel LLILZLL;
    public C1250250idj LLIZ;

    @Override // X.InterfaceC1892990zMP
    public final void LJIILL(int i) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1.equals("not_secure") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r1.equals("protection") == false) goto L4;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZIZ() {
        /*
            r2 = this;
            java.lang.String r1 = r2.LLILLL
            int r0 = r1.hashCode()
            switch(r0) {
                case -1684858151: goto Lc;
                case -1095865757: goto L15;
                case 226612223: goto L1e;
                case 336650556: goto L2e;
                default: goto L9;
            }
        L9:
            java.lang.String r0 = r2.LLILLJJLI
            return r0
        Lc:
            java.lang.String r0 = "protection"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L39
            goto L9
        L15:
            java.lang.String r0 = "not_secure"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L39
            goto L9
        L1e:
            java.lang.String r0 = "no_internet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            r0 = 2131837760(0x7f114340, float:1.9308724E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            return r0
        L2e:
            java.lang.String r0 = "loading"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r0 = ""
            return r0
        L39:
            r0 = 2131850236(0x7f1173fc, float:1.9334028E38)
            java.lang.String r0 = X.C20642515q3.LJI(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19326010jC.LIZIZ():java.lang.String");
    }

    @Override // X.AbstractC1893000zMQ
    public final void LIZ(SparkContext sparkContext) {
        SparkActivity sparkActivity;
        this.LLILZ = sparkContext;
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
        MusicLandingPageViewModel musicLandingPageViewModel = null;
        if (interfaceC1059280dfiLJJIJLIJ != null && (interfaceC1059280dfiLJJIJLIJ instanceof SparkActivity)) {
            sparkActivity = (SparkActivity) interfaceC1059280dfiLJJIJLIJ;
        } else {
            sparkActivity = null;
        }
        this.LLILZIL = sparkActivity;
        MusicLandingPageViewModel musicLandingPageViewModel2 = (MusicLandingPageViewModel) ViewModelProviders.of(sparkActivity).get(MusicLandingPageViewModel.class);
        this.LLILZLL = musicLandingPageViewModel2;
        if (musicLandingPageViewModel2 == null) {
            musicLandingPageViewModel2 = null;
        }
        musicLandingPageViewModel2.LLILZ.observe(this.LLILZIL, new AObserverS230S0100000_28(this, 114));
        MusicLandingPageViewModel musicLandingPageViewModel3 = this.LLILZLL;
        if (musicLandingPageViewModel3 != null) {
            musicLandingPageViewModel = musicLandingPageViewModel3;
        }
        musicLandingPageViewModel.LLILLJJLI.observe(this.LLILZIL, new AObserverS230S0100000_28(this, 115));
    }

    @Override // X.InterfaceC1892990zMP
    public final View LJFF(Context context) {
        View viewSd = C786410Ut5.Sd(R.layout.dri, C786410Ut5.ne(context), null);
        this.LL = (TuxNavBar) viewSd.findViewById(R.id.m56);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZIZ = "back_btn";
        c0om1.LJ(c1251150ifB);
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_x_mark;
        c1251150ifB2.LIZIZ = "close_all_btn";
        c1251150ifB2.LJI = false;
        c0om1.LJ(c1251150ifB2);
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        c1251150ifB3.LIZLLL();
        c1251150ifB3.LIZJ = R.raw.icon_ellipsis_horizontal;
        c1251150ifB3.LIZIZ = "more";
        c1251150ifB3.LJI = false;
        c0om1.LIZIZ(c1251150ifB3);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
            tuxNavBar.LJIIZILJ(true);
        }
        return viewSd;
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
        View viewLJII;
        int i = C1067740dtM.LIZ[enumC1067700dtI.ordinal()];
        View viewLJII2 = null;
        if (i != 1) {
            if (i != 2) {
                TuxNavBar tuxNavBar = this.LL;
                if (tuxNavBar != null) {
                    viewLJII2 = tuxNavBar.LJII("more");
                }
                C12ES.LJIILL(8, viewLJII2);
            } else {
                TuxNavBar tuxNavBar2 = this.LL;
                if (tuxNavBar2 != null) {
                    viewLJII2 = tuxNavBar2.LJII("more");
                }
                C12ES.LJIILL(0, viewLJII2);
            }
        } else {
            TuxNavBar tuxNavBar3 = this.LL;
            if (tuxNavBar3 != null) {
                viewLJII2 = tuxNavBar3.LJII("more");
            }
            C12ES.LJIILL(8, viewLJII2);
        }
        TuxNavBar tuxNavBar4 = this.LL;
        if (tuxNavBar4 != null && (viewLJII = tuxNavBar4.LJII("more")) != null) {
            C786410Ut5.I7(new ACListenerS162S0100000_28(this, 208), viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJI(int i) {
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(i);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void LJJJJ(boolean z) {
        View viewLJII = null;
        if (z) {
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                viewLJII = tuxNavBar.LJII("close_all_btn");
            }
            C12ES.LJIILL(0, viewLJII);
            return;
        }
        TuxNavBar tuxNavBar2 = this.LL;
        if (tuxNavBar2 != null) {
            viewLJII = tuxNavBar2.LJII("close_all_btn");
        }
        C12ES.LJIILL(8, viewLJII);
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void LJJLIIIJ(boolean z) {
        if (z) {
            C12ES.LJIILL(0, this.LL);
        } else {
            C12ES.LJIILL(8, this.LL);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setBackClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("back_btn")) != null) {
            C786410Ut5.I7(onClickListener, viewLJII);
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("close_all_btn")) != null) {
            C786410Ut5.I7(onClickListener, viewLJII);
        }
    }

    @Override // X.AbstractC1893000zMQ, X.InterfaceC1892990zMP
    public final void setSubTitle(String str) {
        C19325710j9.LIZ.getClass();
        C19325710j9.LIZLLL = str;
        try {
            String host = UriProtector.parse(str).getHost();
            if (host != null) {
                str = host;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (this.LLIZ == null) {
            this.LLIZ = new C1250250idj();
        }
        if (str.length() > 0) {
            str = u.LJJIFFI(C20642515q3.LJI(2131826563), "%@", str, false);
        }
        C1250250idj c1250250idj = this.LLIZ;
        if (c1250250idj != null) {
            c1250250idj.LIZLLL = str;
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }

    @Override // X.InterfaceC1892990zMP
    public final void setTitle(String str) {
        this.LLILLJJLI = str;
        if (this.LLIZ == null) {
            this.LLIZ = new C1250250idj();
        }
        C1250250idj c1250250idj = this.LLIZ;
        if (c1250250idj != null) {
            c1250250idj.LIZJ = LIZIZ();
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null) {
                tuxNavBar.LJIJJ(c1250250idj);
            }
        }
    }
}
