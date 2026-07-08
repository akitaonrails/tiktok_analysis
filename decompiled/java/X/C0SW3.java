package X;

import Y.ACListenerS146S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.Ad4adModel;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0SW3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SW3 implements InterfaceC987710boH {
    public final View LIZ;
    public final C0R7E LIZIZ;
    public Ad4adModel LIZJ;
    public Aweme LIZLLL;
    public C21279718Pj LJ;
    public ViewGroup LJFF;
    public FrameLayout LJI;
    public C197039127h LJII;
    public C197039127h LJIIIIZZ;
    public final String LJIIIZ;
    public BPEAHandler LJIIJ;
    public ARunnableS111S0100000_11 LJIIJJI;
    public final C01GW LJIIL = C452501pT.LIZIZ(new C0SW4(this));
    public ICommercePromoteService LJIILIIL;

    @Override // X.InterfaceC987710boH
    public final void LIZ(Aweme aweme) {
        if (C707230Rof.LIZLLL(aweme) && !C707230Rof.LJ(aweme)) {
            C622680Oba.LIZJ(this);
            try {
                BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                this.LJIIJ = bPEAHandler;
                ARunnableS111S0100000_11 aRunnableS111S0100000_11 = new ARunnableS111S0100000_11(this, 172);
                this.LJIIJJI = aRunnableS111S0100000_11;
                C786410Ut5.LJLIIL(500L, bPEAHandler, aRunnableS111S0100000_11);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC987710boH
    public final void LIZIZ(Aweme aweme) {
        BPEAHandler bPEAHandler;
        if (C707230Rof.LIZLLL(aweme) && !C707230Rof.LJ(aweme)) {
            C622680Oba.LIZLLL(this);
            ARunnableS111S0100000_11 aRunnableS111S0100000_11 = this.LJIIJJI;
            if (aRunnableS111S0100000_11 != null && (bPEAHandler = this.LJIIJ) != null) {
                bPEAHandler.removeCallbacks(aRunnableS111S0100000_11);
            }
            this.LJIILIIL = null;
        }
    }

    @Override // X.InterfaceC987710boH
    public final void LJI(Aweme aweme) {
        String str;
        Ad4adModel ad4adModel;
        FrameLayout frameLayout;
        C197039127h c197039127h;
        String str2;
        C21279718Pj c21279718Pj;
        ViewGroup viewGroup;
        C21279718Pj c21279718Pj2 = this.LJ;
        if (c21279718Pj2 != null) {
            C786410Ut5.LLLLILI(c21279718Pj2, 8);
        }
        ViewGroup viewGroup2 = this.LJFF;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
        FrameLayout frameLayout2 = this.LJI;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(8, frameLayout2);
        }
        String str3 = null;
        this.LIZLLL = null;
        this.LIZJ = null;
        if (C707230Rof.LIZLLL(aweme)) {
            this.LIZLLL = aweme;
            this.LIZJ = C707230Rof.LIZJ(aweme);
            if (this.LJ == null) {
                if (C299510Bob.LIZ()) {
                    C0R7E c0r7e = this.LIZIZ;
                    if (c0r7e instanceof C0SZ8) {
                        View viewQg = ((C0SZ8) c0r7e).Qg("ad4ad_label", true);
                        if (viewQg instanceof ViewGroup) {
                            viewGroup = (ViewGroup) viewQg;
                        } else {
                            viewGroup = null;
                        }
                        this.LJFF = viewGroup;
                        C21279718Pj c21279718Pj3 = (C21279718Pj) C786410Ut5.Td(C786410Ut5.ne(this.LIZ.getContext()), R.layout.b4t, this.LJFF, false);
                        this.LJ = c21279718Pj3;
                        ViewGroup viewGroup3 = this.LJFF;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(c21279718Pj3);
                        }
                        ViewGroup viewGroup4 = this.LJFF;
                        if (viewGroup4 != null) {
                            C786410Ut5.LJLZ(8, viewGroup4);
                        }
                    } else {
                        "invalid input component should be implemented from IFeedViewHolder".toString();
                        throw new IllegalStateException("invalid input component should be implemented from IFeedViewHolder");
                    }
                } else {
                    this.LJ = (C21279718Pj) this.LIZ.findViewById(R.id.a6o);
                }
            }
            if (this.LJI == null) {
                FrameLayout frameLayout3 = (FrameLayout) this.LJIIL.getValue();
                if (frameLayout3 != null) {
                    if (frameLayout3.findViewById(R.id.cle) == null) {
                        C786410Ut5.Td(C786410Ut5.ne(frameLayout3.getContext()), R.layout.d14, frameLayout3, true);
                    }
                } else {
                    frameLayout3 = null;
                }
                this.LJI = frameLayout3;
            }
            Ad4adModel ad4adModel2 = this.LIZJ;
            if (ad4adModel2 != null && (str2 = ad4adModel2.promotionLabel) != null && (c21279718Pj = this.LJ) != null) {
                C21279518Ph c21279518PhLIZ = C988900bqC.LIZ();
                c21279518PhLIZ.LJIIL(str2);
                c21279518PhLIZ.LJIILJJIL(72);
                c21279518PhLIZ.LIZ(C475630Ikz.LIZIZ(R.attr.ee, this.LIZ.getContext()));
                c21279518PhLIZ.LJIILIIL(C475630Ikz.LIZIZ(R.attr.ej, this.LIZ.getContext()));
                c21279518PhLIZ.LIZLLL(C0HCL.LIZ(22.0f, this.LIZ.getContext()));
                c21279518PhLIZ.LIZIZ(C0HCL.LIZ(2.0f, this.LIZ.getContext()));
                C21279618Pi c21279618Pi = c21279518PhLIZ.LIZ;
                if (c21279618Pi != null) {
                    c21279718Pj.LIZ(c21279618Pi);
                    C786410Ut5.LLLLILI(c21279718Pj, 0);
                    ViewGroup viewGroup5 = this.LJFF;
                    if (viewGroup5 != null) {
                        C786410Ut5.LJLZ(0, viewGroup5);
                    }
                }
            }
            Ad4adModel ad4adModel3 = this.LIZJ;
            if (ad4adModel3 != null) {
                str = ad4adModel3.notInterestedButtonText;
                str3 = ad4adModel3.promoteButtonText;
            } else {
                str = null;
            }
            if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str3)) && (ad4adModel = this.LIZJ) != null && !ad4adModel.banButton && (frameLayout = this.LJI) != null) {
                if (!TextUtils.isEmpty(str)) {
                    C197039127h c197039127h2 = (C197039127h) frameLayout.findViewById(R.id.cle);
                    this.LJII = c197039127h2;
                    if (c197039127h2 != null) {
                        c197039127h2.setText(str);
                    }
                    C197039127h c197039127h3 = this.LJII;
                    if (c197039127h3 != null) {
                        C786410Ut5.U8(c197039127h3, new ACListenerS146S0100000_11(this, 88));
                    }
                    C197039127h c197039127h4 = this.LJII;
                    if (c197039127h4 != null) {
                        C786410Ut5.LLLLLLJ(c197039127h4, 0);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    C197039127h c197039127h5 = (C197039127h) frameLayout.findViewById(R.id.clk);
                    this.LJIIIIZZ = c197039127h5;
                    if (c197039127h5 != null) {
                        c197039127h5.setText(str3);
                    }
                    C197039127h c197039127h6 = this.LJIIIIZZ;
                    if (c197039127h6 != null) {
                        C786410Ut5.U8(c197039127h6, new ACListenerS146S0100000_11(this, 89));
                    }
                    C197039127h c197039127h7 = this.LJIIIIZZ;
                    if (c197039127h7 != null) {
                        C786410Ut5.LLLLLLJ(c197039127h7, 0);
                    }
                    if (TextUtils.isEmpty(str3) && (c197039127h = this.LJIIIIZZ) != null) {
                        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, null, null, false, 30);
                    }
                }
                C786410Ut5.LJZ(0, frameLayout);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        if (Intrinsics.LJFF(c484220Iyq.LIZ.optString("eventName"), "_p_order_success_notification")) {
            FrameLayout frameLayout = this.LJI;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            Ad4adModel ad4adModel = this.LIZJ;
            if (ad4adModel != null) {
                ad4adModel.setBanButton(true);
            }
        }
    }

    public C0SW3(View view, C0RAE c0rae, String str) {
        this.LIZ = view;
        this.LIZIZ = c0rae;
        this.LJIIIZ = str;
    }
}
