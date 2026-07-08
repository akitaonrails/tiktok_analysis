package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS116S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.feed.adexperience.extlayer.AdExtensionLayerVM;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.Set;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.0dPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049020dPA implements C0SCN, InterfaceC1049130dPL {
    public final InterfaceC988720bpu LL;
    public View LLILLJJLI;
    public C1049210dPT LLILLL;
    public View LLILZ;
    public TuxTextView LLILZIL;
    public FrameLayout LLILZLL;
    public C20286814Zm LLIZ;
    public C1049100dPI LLIZLLLIL;
    public C1049060dPE LLJ;
    public AdExtensionLayerVM LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(84));
    public final ViewOnLayoutChangeListenerC1077260e8i LLJILJIL = new ViewOnLayoutChangeListenerC1077260e8i(this, 3);
    public float LLJILJILJ;
    public C1049110dPJ LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // X.InterfaceC690490R6p
    public final void LIZJ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC690000R4s
    public final void LJ(Aweme aweme, boolean z) {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJI() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LJIIJ(ViewStub viewStub, Context context, Aweme aweme, View view, View view2, View view3, View view4, boolean z, AbstractC19368810q6 abstractC19368810q6) {
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC690490R6p
    public final void LIZ() {
        IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) this.LLJIJIL.getValue();
        if (iVideoPlayTaskManager != null) {
            iVideoPlayTaskManager.reset();
        }
    }

    @Override // X.InterfaceC20289914aH
    public final void LJIIIZ() {
        AdExtensionLayerVM adExtensionLayerVM = this.LLJI;
        if (adExtensionLayerVM != null && adExtensionLayerVM.LLILLL) {
            C1049100dPI c1049100dPI = this.LLIZLLLIL;
            if (c1049100dPI != null) {
                C1049080dPG.LIZ.getClass();
                c1049100dPI.logAd(C1049080dPG.LJ);
            }
            AdExtensionLayerVM adExtensionLayerVM2 = this.LLJI;
            if (adExtensionLayerVM2 != null) {
                adExtensionLayerVM2.LLILLL = false;
            }
        }
        LJIJJ();
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText("Ad 2/2");
        }
        AdExtensionLayerVM adExtensionLayerVM3 = this.LLJI;
        if (adExtensionLayerVM3 != null) {
            adExtensionLayerVM3.setState(new AwS30S0001000_16(2, 42));
        }
        C1049110dPJ c1049110dPJLJIJ = LJIJ();
        c1049110dPJLJIJ.LJ = true;
        InterfaceC1008930cMV interfaceC1008930cMVLIZ = c1049110dPJLJIJ.LIZ();
        if (interfaceC1008930cMVLIZ != null) {
            interfaceC1008930cMVLIZ.LJIILL(new C988650bpn(EnumC996680c2k.SLIDE_UP.getValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002f A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL() {
        /*
            r4 = this;
            X.0dPB r3 = X.C1049030dPB.LIZ
            X.0dPE r0 = r4.LLJ
            if (r0 == 0) goto Ld
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LIZJ
        L8:
            monitor-enter(r3)
            r2 = 0
            if (r0 == 0) goto L2f
            goto Lf
        Ld:
            r0 = 0
            goto L8
        Lf:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r0)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L2f
            java.lang.String r1 = r0.getCreativeIdStr()     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L2f
            java.util.Set<java.lang.String> r0 = X.C1049030dPB.LIZIZ     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 != 0) goto L31
            java.util.Set<java.lang.String> r0 = X.C1049030dPB.LIZJ     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L32
            goto L31
        L2c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L2f:
            monitor-exit(r3)
            goto L33
        L31:
            r2 = 1
        L32:
            monitor-exit(r3)
        L33:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1049020dPA.LJIILLIIL():boolean");
    }

    public final C1049110dPJ LJIJ() {
        C1049110dPJ c1049110dPJ = this.LLJILLL;
        if (c1049110dPJ != null) {
            return c1049110dPJ;
        }
        C1049110dPJ c1049110dPJ2 = new C1049110dPJ(this);
        this.LLJILLL = c1049110dPJ2;
        return c1049110dPJ2;
    }

    public final void LJIJI() {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        AdExtensionLayerVM adExtensionLayerVM = this.LLJI;
        if (adExtensionLayerVM != null) {
            adExtensionLayerVM.setState(new AwS30S0001000_16(0, 42));
        }
    }

    public final void LJIJJ() {
        String creativeIdStr;
        C1049030dPB c1049030dPB = C1049030dPB.LIZ;
        C1049060dPE c1049060dPE = this.LLJ;
        Aweme aweme = c1049060dPE != null ? c1049060dPE.LIZJ : null;
        synchronized (c1049030dPB) {
            if (aweme != null) {
                AwemeRawAd awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme);
                if (awemeRawAdLJJIJLIJ != null && (creativeIdStr = awemeRawAdLJJIJLIJ.getCreativeIdStr()) != null) {
                    Set<String> set = C1049030dPB.LIZJ;
                    if (!set.contains(creativeIdStr)) {
                        set.add(creativeIdStr);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    @Override // X.InterfaceC690490R6p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI() {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1049020dPA.LJJLJLI():void");
    }

    @Override // X.InterfaceC690490R6p
    public final void g2() {
        IVideoPlayTaskManager iVideoPlayTaskManager = (IVideoPlayTaskManager) this.LLJIJIL.getValue();
        if (iVideoPlayTaskManager != null) {
            iVideoPlayTaskManager.reset();
        }
    }

    @Override // X.InterfaceC690490R6p
    public final boolean isShowing() {
        C1049210dPT c1049210dPT = this.LLILLL;
        return c1049210dPT != null && c1049210dPT.getVisibility() == 0;
    }

    @Override // X.C0SCN
    public final boolean nE2() {
        C20286814Zm c20286814Zm = this.LLIZ;
        if (c20286814Zm != null) {
            return c20286814Zm.LJJIFFI;
        }
        return false;
    }

    @Override // X.InterfaceC20289914aH
    public final void LJFF() {
        C1049110dPJ c1049110dPJ;
        InterfaceC1008930cMV interfaceC1008930cMVLIZ;
        LJIJI();
        AdExtensionLayerVM adExtensionLayerVM = this.LLJI;
        if (adExtensionLayerVM == null || !adExtensionLayerVM.LL || (c1049110dPJ = this.LLJILLL) == null || (interfaceC1008930cMVLIZ = c1049110dPJ.LIZ()) == null) {
            return;
        }
        interfaceC1008930cMVLIZ.LJIILL(new C988650bpn(EnumC996680c2k.SLIDE_DOWN.getValue()));
    }

    @Override // X.InterfaceC20289914aH
    public final boolean So() {
        AdExtensionLayerVM adExtensionLayerVM;
        if (isShowing()) {
            return true;
        }
        return LJIILLIIL() && (adExtensionLayerVM = this.LLJI) != null && adExtensionLayerVM.LLILLJJLI;
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ InterfaceC988720bpu Mh() {
        return this.LL;
    }

    public C1049020dPA(InterfaceC988720bpu interfaceC988720bpu) {
        this.LL = interfaceC988720bpu;
    }

    @Override // X.InterfaceC1049130dPL
    public final void LIZIZ(String str) {
        String creativeIdStr;
        TuxTextView tuxTextView;
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        C1049060dPE c1049060dPE = this.LLJ;
        if (c1049060dPE != null && (aweme = c1049060dPE.LIZJ) != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null) {
            creativeIdStr = awemeRawAdLJJIJLIJ.getCreativeIdStr();
        } else {
            creativeIdStr = null;
        }
        if (!Intrinsics.LJFF(str, creativeIdStr)) {
            return;
        }
        if (!isShowing() && (tuxTextView = this.LLILZIL) != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        if (isShowing()) {
            LJIIZILJ(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC690490R6p
    public final void LJIIL(C1049060dPE c1049060dPE) {
        AwemeRawAd awemeRawAdLJJIJLIJ;
        C1049100dPI c1049100dPI;
        Object tag;
        Aweme aweme;
        C1049170dPP c1049170dPP;
        IAnoleManager iAnoleManagerRi;
        int childCount;
        C1049170dPP c1049170dPP2;
        Integer numValueOf;
        C1049090dPH c1049090dPH;
        C1049090dPH c1049090dPH2;
        FrameLayout frameLayout;
        C1049210dPT c1049210dPT;
        float fLIZIZ;
        View viewFindViewById;
        TuxTextView tuxTextView;
        C1049210dPT c1049210dPT2;
        View viewFindViewById2;
        FrameLayout frameLayout2;
        this.LLJ = c1049060dPE;
        ReusedAssem reusedAssem = (ReusedAssem) c1049060dPE.LJIIJ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdExtensionLayerVM.class);
        this.LLJI = (AdExtensionLayerVM) C737910Sx3.LIZ(reusedAssem, C724750Sbp.LJIIJ(reusedAssem, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 57), null, AFwS252S0000000_16.get$arr$(79)).getValue(this, new C2217391BqT(this) { // from class: X.0dPK
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return ((C1049020dPA) this.receiver).LLJI;
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((C1049020dPA) this.receiver).LLJI = (AdExtensionLayerVM) obj;
            }
        });
        Aweme aweme2 = c1049060dPE.LIZJ;
        FrameLayout frameLayout3 = null;
        if (aweme2 != null) {
            awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2);
        } else {
            awemeRawAdLJJIJLIJ = null;
        }
        if (awemeRawAdLJJIJLIJ != null) {
            c1049100dPI = new C1049100dPI(awemeRawAdLJJIJLIJ);
        } else {
            c1049100dPI = null;
        }
        this.LLIZLLLIL = c1049100dPI;
        ViewStub viewStub = c1049060dPE.LIZ;
        if (viewStub != null) {
            if (this.LLILLJJLI == null && viewStub.getParent() != null) {
                viewStub.setLayoutResource(R.layout.d15);
                this.LLILLJJLI = C786410Ut5.LJLLLL(viewStub);
            } else {
                View rootView = this.LL.getRootView();
                if (rootView != null) {
                    viewFindViewById = rootView.findViewById(R.id.a8o);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = viewFindViewById;
                if (viewFindViewById != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL))) - C14LC.LJIILLIIL;
            View view = this.LLILLJJLI;
            if (view != null) {
                C1383370m6R.LIZJ(view, null, null, null, Integer.valueOf(iLIZIZ), 7);
            }
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                tuxTextView = (TuxTextView) view2.findViewById(R.id.a8n);
            } else {
                tuxTextView = null;
            }
            this.LLILZIL = tuxTextView;
            View view3 = this.LLILLJJLI;
            if (view3 != null) {
                c1049210dPT2 = (C1049210dPT) view3.findViewById(R.id.a8m);
            } else {
                c1049210dPT2 = null;
            }
            this.LLILLL = c1049210dPT2;
            if (c1049210dPT2 != null) {
                c1049210dPT2.setOnVisibilityChange$commercialize_feed_impl_release(null);
            }
            C1049210dPT c1049210dPT3 = this.LLILLL;
            if (c1049210dPT3 != null) {
                viewFindViewById2 = c1049210dPT3.findViewById(R.id.a8r);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILZ = viewFindViewById2;
            C1049210dPT c1049210dPT4 = this.LLILLL;
            if (c1049210dPT4 != null) {
                frameLayout2 = (FrameLayout) c1049210dPT4.findViewById(R.id.abm);
            } else {
                frameLayout2 = null;
            }
            this.LLILZLL = frameLayout2;
        }
        AbstractC19368810q6 abstractC19368810q6 = c1049060dPE.LJII;
        if ((abstractC19368810q6 instanceof C20286814Zm) && (c1049210dPT = this.LLILLL) != null) {
            if (c1049060dPE.LJIIIIZZ instanceof C1049220dPU) {
                C20286814Zm c20286814Zm = (C20286814Zm) abstractC19368810q6;
                c20286814Zm.LJJLIIIJILLIZJL = null;
                c20286814Zm.LJJLIIIJ = true;
            }
            C20286814Zm c20286814Zm2 = (C20286814Zm) abstractC19368810q6;
            this.LLIZ = c20286814Zm2;
            if (c20286814Zm2 != null) {
                c20286814Zm2.LJJLIIIIJ = false;
                c20286814Zm2.LJFF = true;
                if (c1049210dPT.getContext() != null && C14KQ.LJ(r0) <= C418440Gaw.LIZIZ(740)) {
                    fLIZIZ = C418440Gaw.LIZIZ(8);
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(24);
                }
                c20286814Zm2.LJIJ = fLIZIZ;
            }
            C20286814Zm c20286814Zm3 = this.LLIZ;
            if (c20286814Zm3 != null) {
                c20286814Zm3.LJIIIIZZ(this.LLILLL);
            }
            C20286814Zm c20286814Zm4 = this.LLIZ;
            if (c20286814Zm4 != null) {
                c20286814Zm4.LIZLLL = new AwS595S0100000_16(this, 445);
            }
            C1049210dPT c1049210dPT5 = this.LLILLL;
            if (c1049210dPT5 != null) {
                View.OnClickListener aCListenerS151S0100000_16 = new ACListenerS151S0100000_16(this, 165);
                if (C1848410yCV.LIZ) {
                    aCListenerS151S0100000_16 = new f(aCListenerS151S0100000_16);
                }
                a aVar = new a(aCListenerS151S0100000_16);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c1049210dPT5);
                }
                c1049210dPT5.setOnClickListener(aVar);
            }
            View view4 = this.LLILZ;
            if (view4 != null) {
                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 166), view4);
            }
            C1049210dPT c1049210dPT6 = this.LLILLL;
            if (c1049210dPT6 != null) {
                c1049210dPT6.setTouchEventViewType$commercialize_feed_impl_release(c1049060dPE.LJIIIIZZ);
            }
        }
        C1049210dPT c1049210dPT7 = this.LLILLL;
        if (c1049210dPT7 != null) {
            HandlerHook.viewPost(c1049210dPT7, new ARunnableS112S0100000_12(this, 481));
        }
        FrameLayout frameLayout4 = this.LLILZLL;
        if (frameLayout4 != null) {
            tag = frameLayout4.getTag();
        } else {
            tag = null;
        }
        if ((tag instanceof View.OnLayoutChangeListener) && (frameLayout = this.LLILZLL) != null) {
            frameLayout.removeOnLayoutChangeListener((View.OnLayoutChangeListener) tag);
        }
        FrameLayout frameLayout5 = this.LLILZLL;
        if (frameLayout5 != null) {
            frameLayout5.addOnLayoutChangeListener(this.LLJILJIL);
        }
        FrameLayout frameLayout6 = this.LLILZLL;
        if (frameLayout6 != null) {
            frameLayout6.setTag(this.LLJILJIL);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            C1383370m6R.LIZIZ(tuxTextView2, new AwS591S0100000_12(this, 1205));
        }
        if (!this.LLJJ) {
            this.LLJJ = true;
            AdExtensionLayerVM adExtensionLayerVM = this.LLJI;
            if (adExtensionLayerVM != null && (c1049090dPH2 = (C1049090dPH) adExtensionLayerVM.getState()) != null) {
                numValueOf = Integer.valueOf(c1049090dPH2.LL);
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() == 0) {
                    LJIJI();
                } else if (numValueOf.intValue() == 2) {
                    TuxTextView tuxTextView3 = this.LLILZIL;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView3, 0);
                    }
                    TuxTextView tuxTextView4 = this.LLILZIL;
                    if (tuxTextView4 != null) {
                        tuxTextView4.setText("Ad 2/2");
                    }
                    AdExtensionLayerVM adExtensionLayerVM2 = this.LLJI;
                    if (adExtensionLayerVM2 != null) {
                        adExtensionLayerVM2.setState(new AwS30S0001000_16(2, 42));
                    }
                } else if (numValueOf.intValue() == 1) {
                    TuxTextView tuxTextView5 = this.LLILZIL;
                    if (tuxTextView5 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView5, 0);
                    }
                    TuxTextView tuxTextView6 = this.LLILZIL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText("Ad 1/2");
                    }
                    AdExtensionLayerVM adExtensionLayerVM3 = this.LLJI;
                    if (adExtensionLayerVM3 != null) {
                        adExtensionLayerVM3.setState(new AwS30S0001000_16(1, 42));
                    }
                }
            }
            AdExtensionLayerVM adExtensionLayerVM4 = this.LLJI;
            if (adExtensionLayerVM4 != null && (c1049090dPH = (C1049090dPH) adExtensionLayerVM4.getState()) != null && c1049090dPH.LLILLJJLI) {
                AdExtensionLayerVM adExtensionLayerVM5 = this.LLJI;
                if (adExtensionLayerVM5 != null && adExtensionLayerVM5.LL) {
                    LJIJ().LIZLLL = true;
                }
                C1049210dPT c1049210dPT8 = this.LLILLL;
                if (c1049210dPT8 != null) {
                    HandlerHook.viewPost(c1049210dPT8, new ARunnableS116S0100000_16(this, 259));
                }
            }
            C1049210dPT c1049210dPT9 = this.LLILLL;
            if (c1049210dPT9 != null) {
                c1049210dPT9.setOnVisibilityChange$commercialize_feed_impl_release(new AwS560S0100000_16(this, 975));
            }
        }
        synchronized (C1049030dPB.LIZ) {
            if (!C1049030dPB.LIZLLL.contains(this)) {
                C1049030dPB.LIZLLL.LIZJ(this);
            }
        }
        C1049060dPE c1049060dPE2 = this.LLJ;
        if (c1049060dPE2 != null && (aweme = c1049060dPE2.LIZJ) != null) {
            final C1049110dPJ c1049110dPJLJIJ = LJIJ();
            if (AwemeExtKt.isAdTraffic(aweme)) {
                c1049170dPP = new C1049170dPP(c1049110dPJLJIJ.LIZIZ(), aweme);
            } else {
                c1049170dPP = null;
            }
            c1049110dPJLJIJ.LIZJ = c1049170dPP;
            if (C1837407Ho.LIZ()) {
                FrameLayout frameLayout7 = c1049110dPJLJIJ.LJFF.LLILZLL;
                if ((frameLayout7 instanceof ViewGroup) && frameLayout7 != null) {
                    int childCount2 = frameLayout7.getChildCount();
                    if (childCount2 > 0 && (c1049170dPP2 = c1049110dPJLJIJ.LIZJ) != null) {
                        c1049170dPP2.LJJIIZ(childCount2);
                    }
                    C786410Ut5.LJJJJI(frameLayout7);
                }
            }
            c1049110dPJLJIJ.LIZIZ = aweme;
            if (!a0.LJJJIL(c1049110dPJLJIJ.LIZIZ()) && C693790RJh.LIZ(c1049110dPJLJIJ.LIZIZ).contains(c1049110dPJLJIJ.LIZIZ())) {
                FrameLayout frameLayout8 = c1049110dPJLJIJ.LJFF.LLILZLL;
                if (frameLayout8 instanceof ViewGroup) {
                    frameLayout3 = frameLayout8;
                }
                C1049170dPP c1049170dPP3 = c1049110dPJLJIJ.LIZJ;
                if (c1049170dPP3 != null) {
                    if (frameLayout3 != null) {
                        childCount = frameLayout3.getChildCount();
                    } else {
                        childCount = -1;
                    }
                    C1049180dPQ.LIZ.getClass();
                    c1049170dPP3.logAd(C1049180dPQ.LIZJ, new AwS124S0101000_16(c1049170dPP3, childCount, 2));
                }
                C1013700cUC.LIZIZ(frameLayout3, c1049110dPJLJIJ.LIZIZ, c1049110dPJLJIJ.LIZIZ());
                if (frameLayout3 != null) {
                    C786410Ut5.LJJJJI(frameLayout3);
                }
                InterfaceC1008930cMV interfaceC1008930cMVLIZ = c1049110dPJLJIJ.LIZ();
                if (interfaceC1008930cMVLIZ != null && (iAnoleManagerRi = interfaceC1008930cMVLIZ.Ri()) != null) {
                    iAnoleManagerRi.mount(frameLayout3, c1049110dPJLJIJ.LIZIZ(), new InterfaceC1014340cVE() { // from class: X.0dPD
                        @Override // X.InterfaceC1014340cVE
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJFF(boolean z) {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJII() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LIZIZ() {
                            AdExtensionLayerVM adExtensionLayerVM6 = ((C1049110dPJ) c1049110dPJLJIJ).LJFF.LLJI;
                            if (adExtensionLayerVM6 != null) {
                                adExtensionLayerVM6.LL = true;
                            }
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJJJIL() {
                            C1049110dPJ c1049110dPJ = (C1049110dPJ) c1049110dPJLJIJ;
                            if (c1049110dPJ.LJ) {
                                C1049020dPA c1049020dPA = c1049110dPJ.LJFF;
                                AdExtensionLayerVM adExtensionLayerVM6 = c1049020dPA.LLJI;
                                if (adExtensionLayerVM6 != null) {
                                    adExtensionLayerVM6.LL = false;
                                }
                                if (c1049020dPA.isShowing()) {
                                    C1049020dPA c1049020dPA2 = c1049110dPJ.LJFF;
                                    if (c1049020dPA2.LLJJI) {
                                        return;
                                    }
                                    c1049020dPA2.LJIIZILJ(false);
                                }
                            }
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LIZLLL(boolean z) {
                            TuxTextView tuxTextView7;
                            C1049110dPJ c1049110dPJ = (C1049110dPJ) c1049110dPJLJIJ;
                            if (!z) {
                                C1049020dPA c1049020dPA = c1049110dPJ.LJFF;
                                c1049020dPA.LJIJJ();
                                if (!c1049020dPA.isShowing() && (tuxTextView7 = c1049020dPA.LLILZIL) != null) {
                                    C786410Ut5.LLLLZLL(tuxTextView7, 8);
                                    return;
                                }
                                return;
                            }
                            c1049110dPJ.getClass();
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJ(String str, View view5, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                            AbstractC1049040dPC abstractC1049040dPC = c1049110dPJLJIJ;
                            abstractC1049040dPC.LIZIZ();
                            abstractC1049040dPC.getClass();
                        }
                    });
                }
            }
            if (c1049110dPJLJIJ.LIZLLL) {
                c1049110dPJLJIJ.LIZLLL = false;
                InterfaceC1008930cMV interfaceC1008930cMVLIZ2 = c1049110dPJLJIJ.LIZ();
                if (interfaceC1008930cMVLIZ2 != null) {
                    interfaceC1008930cMVLIZ2.LJIILL(new C988650bpn(EnumC996680c2k.SLIDE_DOWN.getValue()));
                }
            }
        }
    }

    public final void LJIILL(Integer num) {
        FrameLayout frameLayout;
        C1049060dPE c1049060dPE;
        Aweme aweme;
        boolean z;
        int i;
        float fLIZIZ;
        float width;
        int height;
        float f;
        float fLIZIZ2;
        int iMax;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i2;
        float height2;
        int width2;
        float f2;
        C1049210dPT c1049210dPT = this.LLILLL;
        if (c1049210dPT != null && (frameLayout = this.LLILZLL) != null && (c1049060dPE = this.LLJ) != null && (aweme = c1049060dPE.LIZJ) != null) {
            int height3 = c1049210dPT.getHeight();
            int width3 = c1049210dPT.getWidth();
            float fLIZIZ3 = C418440Gaw.LIZIZ(30);
            boolean zLJJIJIL = C735370Ssx.LJJIJIL(aweme);
            if (C14KQ.LJ(c1049210dPT.getContext()) <= C418440Gaw.LIZIZ(740)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (zLJJIJIL) {
                    i2 = 90;
                } else {
                    i2 = 68;
                }
                fLIZIZ2 = C418440Gaw.LIZIZ(Integer.valueOf(i2));
                if (!C257310A6n.LIZ()) {
                    fLIZIZ2 = Math.min(fLIZIZ2, width3 / 2.0f);
                }
                if (C257310A6n.LIZ()) {
                    if (c1049210dPT.getWidth() != 0 && c1049210dPT.getHeight() != 0) {
                        height2 = c1049210dPT.getHeight();
                        width2 = c1049210dPT.getWidth();
                    } else {
                        f2 = 1.0f;
                        fLIZIZ = f2 * fLIZIZ2;
                    }
                } else {
                    height2 = c1049210dPT.getHeight();
                    width2 = c1049210dPT.getWidth();
                }
                f2 = height2 / width2;
                fLIZIZ = f2 * fLIZIZ2;
            } else {
                if (zLJJIJIL) {
                    i = 146;
                } else {
                    i = 195;
                }
                fLIZIZ = C418440Gaw.LIZIZ(Integer.valueOf(i));
                if (!C257310A6n.LIZ()) {
                    fLIZIZ = Math.min(fLIZIZ, height3 / 3.0f);
                }
                if (C257310A6n.LIZ()) {
                    if (c1049210dPT.getWidth() != 0 && c1049210dPT.getHeight() != 0) {
                        width = c1049210dPT.getWidth();
                        height = c1049210dPT.getHeight();
                    } else {
                        f = 1.0f;
                        fLIZIZ2 = f * fLIZIZ;
                    }
                } else {
                    width = c1049210dPT.getWidth();
                    height = c1049210dPT.getHeight();
                }
                f = width / height;
                fLIZIZ2 = f * fLIZIZ;
            }
            C20286814Zm c20286814Zm = this.LLIZ;
            if (c20286814Zm != null) {
                c20286814Zm.LIZIZ = fLIZIZ2;
                c20286814Zm.LIZJ = fLIZIZ;
            }
            float f3 = 2;
            float fLIZIZ4 = C418440Gaw.LIZIZ(56) / f3;
            if (num != null) {
                iMax = num.intValue();
            } else {
                iMax = Math.max(frameLayout.getHeight(), (int) C418440Gaw.LIZIZ(180));
            }
            float f4 = (iMax + fLIZIZ) - fLIZIZ4;
            float f5 = height3;
            float f6 = (((f5 - fLIZIZ3) - f4) / f3) + fLIZIZ3;
            float f7 = ((f5 - fLIZIZ) / 2.0f) - f6;
            C20286814Zm c20286814Zm2 = this.LLIZ;
            if (c20286814Zm2 != null) {
                c20286814Zm2.LJFF(Math.max(1.0f, f7));
            }
            View view = this.LLILZ;
            if (view != null) {
                C1383370m6R.LIZIZ(view, new C743520TEo(fLIZIZ2, fLIZIZ, f6));
            }
            float f8 = (f6 + fLIZIZ) - fLIZIZ4;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    if (marginLayoutParams.topMargin != ((int) f8)) {
                        marginLayoutParams.topMargin = (int) f8;
                    } else {
                        return;
                    }
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.a6(frameLayout, marginLayoutParams);
        }
    }

    public final void LJIIZILJ(boolean z) {
        C20286814Zm c20286814Zm;
        C1049060dPE c1049060dPE = this.LLJ;
        AbstractC19368810q6 abstractC19368810q6 = null;
        if (c1049060dPE != null) {
            abstractC19368810q6 = c1049060dPE.LJII;
        }
        if ((abstractC19368810q6 instanceof C20286814Zm) && (c20286814Zm = (C20286814Zm) abstractC19368810q6) != null) {
            this.LLJJI = true;
            if (z) {
                ValueAnimator valueAnimator = c20286814Zm.LJJLIIJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                c20286814Zm.LJJ(this.LLJILJILJ, 0.0f, false);
            } else {
                ValueAnimator valueAnimator2 = c20286814Zm.LJJLIIJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                c20286814Zm.LJIJI();
                this.LLJILJILJ = 0.0f;
            }
            LJFF();
        }
    }

    @Override // X.InterfaceC690000R4s
    public final void LJIIJJI(EnumC20283814Yi enumC20283814Yi, Aweme aweme, boolean z) {
        C20286814Zm c20286814Zm;
        C1049060dPE c1049060dPE = this.LLJ;
        AbstractC19368810q6 abstractC19368810q6 = null;
        if (c1049060dPE != null) {
            abstractC19368810q6 = c1049060dPE.LJII;
        }
        if ((abstractC19368810q6 instanceof C20286814Zm) && (c20286814Zm = (C20286814Zm) abstractC19368810q6) != null) {
            c20286814Zm.LJIJI();
        }
        LJFF();
        C1049100dPI c1049100dPI = this.LLIZLLLIL;
        if (c1049100dPI != null) {
            C1049080dPG.LIZ.getClass();
            c1049100dPI.logAd(C1049080dPG.LIZLLL);
        }
    }
}
