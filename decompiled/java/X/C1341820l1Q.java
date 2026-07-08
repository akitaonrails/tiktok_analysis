package X;

import Y.ACListenerS124S0200000_21;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0l1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341820l1Q {
    public final ViewGroup LIZ;
    public final Aweme LIZIZ;
    public final Fragment LIZJ;
    public final String LIZLLL;
    public final View LJ;
    public final CommentContextSource LJFF;

    public final void LIZ(View view) {
        InterfaceC1334290kpH interfaceC1334290kpH;
        User curUser;
        Aweme aweme = this.LIZIZ;
        if (aweme == null) {
            return;
        }
        CommentService.LIZ.getClass();
        if (!C523420Kfs.LIZ().LJIILLIIL(aweme) && !aweme.isCmtSwt() && C1348690lCV.LIZ(aweme)) {
            KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.rka);
            if (callbackFindViewById instanceof InterfaceC1334290kpH) {
                interfaceC1334290kpH = (InterfaceC1334290kpH) callbackFindViewById;
            } else {
                interfaceC1334290kpH = null;
            }
            try {
                IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
                    UrlModel avatarThumb = curUser.getAvatarThumb();
                    if (avatarThumb != null && interfaceC1334290kpH != null) {
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                        int iLIZJ = (int) C12ES.LIZJ(36.0f, view.getContext());
                        int iLIZJ2 = (int) C12ES.LIZJ(36.0f, view.getContext());
                        c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZJ;
                        c1331670kl3LJIIIIZZ.LJIIIZ = iLIZJ2;
                        c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                        c1331670kl3LJIIIIZZ.LJJ(interfaceC1334290kpH);
                        c1331670kl3LJIIIIZZ.LJIIJJI();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            ((TextView) view.findViewById(R.id.rke)).setText(view.getContext().getString(2131850818));
            ACListenerS124S0200000_21 aCListenerS124S0200000_21 = new ACListenerS124S0200000_21(aweme, this, 6);
            C786410Ut5.I7(aCListenerS124S0200000_21, view);
            View viewFindViewById = view.findViewById(R.id.rkc);
            if (viewFindViewById != null) {
                C786410Ut5.I7(aCListenerS124S0200000_21, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.rkf);
            if (viewFindViewById2 != null) {
                C786410Ut5.I7(new ACListenerS124S0200000_21(aweme, this, 3), viewFindViewById2);
            }
            View viewFindViewById3 = view.findViewById(R.id.rkd);
            if (viewFindViewById3 != null) {
                C786410Ut5.I7(new ACListenerS124S0200000_21(aweme, this, 4), viewFindViewById3);
            }
            View viewFindViewById4 = view.findViewById(R.id.rk_);
            if (viewFindViewById4 != null) {
                C786410Ut5.I7(new ACListenerS124S0200000_21(aweme, this, 5), viewFindViewById4);
                return;
            }
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
    }

    public C1341820l1Q(ViewGroup viewGroup, Aweme aweme, Fragment fragment, String str) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        this.LIZ = viewGroup;
        this.LIZIZ = aweme;
        this.LIZJ = fragment;
        this.LIZLLL = str;
        Fragment fragment2 = this.LIZJ;
        CommentContextSource commentContextSource = null;
        if (fragment2 != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(fragment2, null), "source_default_key", CommentContextSource.class, null)) != null) {
            commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        }
        this.LJFF = commentContextSource;
        View viewFindViewById = viewGroup.findViewById(R.id.rkg);
        if (viewFindViewById != null) {
            this.LJ = viewFindViewById;
            LIZ(viewFindViewById);
        } else {
            View viewLIZIZ = C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a49, viewGroup, false);
            this.LJ = viewLIZIZ;
            viewGroup.addView(viewLIZIZ);
            LIZ(viewLIZIZ);
        }
        InterfaceC427710Gpt interfaceC427710Gpt = new InterfaceC427710Gpt() { // from class: X.0Gps
            @Override // X.InterfaceC427710Gpt
            public final void LLLLLLZZ(int i, User user, User user2) {
                InterfaceC1334290kpH interfaceC1334290kpH;
                User curUser;
                try {
                    View view = this.LL.LJ;
                    if (view != null) {
                        KeyEvent.Callback callbackFindViewById = view.findViewById(R.id.rka);
                        if (callbackFindViewById instanceof InterfaceC1334290kpH) {
                            interfaceC1334290kpH = (InterfaceC1334290kpH) callbackFindViewById;
                        } else {
                            interfaceC1334290kpH = null;
                        }
                        try {
                            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
                            if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
                                UrlModel avatarThumb = curUser.getAvatarThumb();
                                if (avatarThumb != null && interfaceC1334290kpH != null) {
                                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                                    c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
                                    int iLIZJ = (int) C12ES.LIZJ(36.0f, view.getContext());
                                    int iLIZJ2 = (int) C12ES.LIZJ(36.0f, view.getContext());
                                    c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZJ;
                                    c1331670kl3LJIIIIZZ.LJIIIZ = iLIZJ2;
                                    c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                                    c1331670kl3LJIIIIZZ.LJJ(interfaceC1334290kpH);
                                    c1331670kl3LJIIIIZZ.LJIIJJI();
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        };
        try {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(interfaceC427710Gpt);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        View view = this.LJ;
        if (view != null) {
            view.addOnAttachStateChangeListener(new C0IDR(interfaceC427710Gpt, 0));
        }
    }
}
