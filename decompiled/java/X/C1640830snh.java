package X;

import Y.ACListenerS159S0100000_25;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0snh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1640830snh implements InterfaceC1465240oEU {
    public final ViewGroup LIZ;
    public final LifecycleOwner LIZIZ;
    public final InterfaceC1640760sna LIZJ;
    public final InterfaceC1640930snr LIZLLL;
    public final boolean LJ;
    public final Function0<Unit> LJFF;
    public final Function0<VideoPublishEditModel> LJI;
    public final C1640840sni LJII;
    public final C01GW LJIIIIZZ;
    public C1641720sp8 LJIIIZ;
    public C1640990snx LJIIJ;
    public InterfaceC1640960snu LJIIJJI;
    public C1641080so6 LJIIL;
    public View LJIILIIL;
    public boolean LJIILJJIL;
    public final int LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final Map<String, InterfaceC1640870snl<Effect>> LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public final C11RK LJJIIJ;
    public final C11RK LJJIIJZLJL;
    public final C11RK LJJIIZ;
    public final C11RK LJJIIZI;
    public final C11RK LJJIJ;
    public final C11RK LJJIJIIJI;
    public final C11RK LJJIJIIJIL;
    public final C11PQ LJJIJIL;
    public final C11RK LJJIJL;
    public final C11NJ LJJIJLIJ;
    public final C01GW LJJIL;
    public ViewGroup LJJIZ;

    public C1640830snh() {
        throw null;
    }

    @Override // X.InterfaceC1465240oEU
    public final void LJIIIIZZ() {
        this.LJIILJJIL = true;
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LIZ() {
        C11RK c11rk = this.LJJIIJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LIZIZ() {
        C11RK c11rk = this.LJJIIZ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LIZLLL() {
        C11RK c11rk = this.LJJIIJZLJL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LJ() {
        C11PQ c11pq = this.LJJIJIL;
        c11pq.getClass();
        return new C19475711Hn(c11pq);
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LJFF() {
        C11RK c11rk = this.LJJIIZI;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LJI() {
        C11RK c11rk = this.LJJIJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    @Override // X.InterfaceC1465240oEU
    public final C19475711Hn LJII() {
        C11RK c11rk = this.LJJIJIIJIL;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final C1640790snd LJIIJJI() {
        return (C1640790snd) this.LJJIL.getValue();
    }

    public final C1640950snt LJIIL() {
        return (C1640950snt) this.LJIIIIZZ.getValue();
    }

    public final InterfaceC1641070so5<ProviderEffect> LJIILIIL() {
        return (InterfaceC1641070so5) this.LJIJI.getValue();
    }

    @Override // X.InterfaceC1465240oEU
    public final void loadData() {
        InterfaceC1636810shD interfaceC1636810shDNt1;
        InterfaceC1640760sna interfaceC1640760sna = this.LIZJ;
        if (interfaceC1640760sna == null || (interfaceC1636810shDNt1 = interfaceC1640760sna.Nt1()) == null) {
            return;
        }
        interfaceC1636810shDNt1.Ur1();
    }

    @Override // X.InterfaceC1465240oEU
    public final void o3() {
        int i = this.LJIILL;
        if (i > 0) {
            C786410Ut5.f3(new C1640850snj(this, 0, i), Looper.myQueue());
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [X.0snq] */
    @Override // X.InterfaceC1465240oEU
    public final void show() {
        InterfaceC1640960snu c1643710ssL;
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService;
        InterfaceC1640760sna interfaceC1640760sna;
        InterfaceC1640330smt<SocialAvatarStickerStruct> interfaceC1640330smtEL1;
        InterfaceC1640760sna interfaceC1640760sna2;
        InterfaceC1640330smt<StickerSetCategory> interfaceC1640330smtAN0;
        InterfaceC1640760sna interfaceC1640760sna3;
        InterfaceC1640330smt<ProviderEffect> interfaceC1640330smtOy0;
        InterfaceC1640760sna interfaceC1640760sna4;
        InterfaceC1423450n95<EffectCategoryResponse, Effect> interfaceC1423450n95N61;
        InterfaceC1636810shD interfaceC1636810shDNt1;
        if (!this.LJJII) {
            ViewGroup viewGroup = this.LJJIZ;
            if (viewGroup == null) {
                viewGroup = null;
            }
            ViewPager viewPager = (ViewPager) viewGroup.findViewById(R.id.kni);
            C19YA c19ya = (C19YA) viewGroup.findViewById(R.id.w7c);
            View viewFindViewById = viewGroup.findViewById(R.id.kmt);
            c19ya.setTabMargin(0);
            c19ya.updateTabWidthThreshold(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), -1);
            C01GW c01gw = C0BA2.LIZ;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                c19ya.setTabMargin(4);
                C426750GoL.LJIIIZ(c19ya, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, 0, 0, false, 16);
            }
            C1640880snm c1640880snm = this.LJII.LJIIJJI;
            Drawable drawableLJIIJ = LJIIJ(c1640880snm.LJI);
            if (drawableLJIIJ != null) {
                viewPager.setBackground(drawableLJIIJ);
            }
            Drawable drawableLJIIJ2 = LJIIJ(c1640880snm.LJFF);
            if (drawableLJIIJ2 != null) {
                viewGroup.findViewById(R.id.w7e).setBackground(drawableLJIIJ2);
            }
            Function1<? super ViewPager, Unit> function1 = c1640880snm.LJII;
            if (function1 != null) {
                function1.invoke(viewPager);
            }
            Function1<? super C19YA, Unit> function12 = c1640880snm.LJIIIIZZ;
            if (function12 != null) {
                function12.invoke(c19ya);
            }
            C1640990snx c1640990snx = new C1640990snx(viewPager, c19ya, viewFindViewById, ((Boolean) c01gw.getValue()).booleanValue(), this.LJ || !C300230Bpl.LIZ());
            C11NJ c11nj = this.LJJIJLIJ;
            C11RK<Pair<C1641020so0, Integer>> c11rk = c1640990snx.LJII;
            c11rk.getClass();
            C19475711Hn c19475711Hn = new C19475711Hn(c11rk);
            C516201zk c516201zk = new C516201zk(this, 265);
            C09HM c09hm = C09HN.LIZ;
            c11nj.LIZ(c19475711Hn.LJJLL(c516201zk, c09hm));
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            c1640990snx.LIZ(0, false);
            this.LJIIJ = c1640990snx;
            ViewGroup viewGroup2 = this.LJJIZ;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.kn0);
            View viewFindViewById2 = viewGroup2.findViewById(R.id.kn4);
            Drawable drawableLJIIJ3 = LJIIJ(this.LJII.LJIIJJI.LIZLLL);
            if (drawableLJIIJ3 != null) {
                viewGroup3.setBackground(drawableLJIIJ3);
            }
            Drawable drawableLJIIJ4 = LJIIJ(this.LJII.LJIIJJI.LJ);
            if (drawableLJIIJ4 != null) {
                viewFindViewById2.setBackground(drawableLJIIJ4);
            }
            if (C300240Bpm.LIZ()) {
                c1643710ssL = new C1643750ssP(this.LIZIZ, viewGroup3, new AwS569S0100000_25(this, 938), viewFindViewById2, C1388190mED.LIZ(viewGroup2.getContext()), this.LJII.LJIIIZ, this.LJ, this.LIZLLL);
            } else {
                LifecycleOwner lifecycleOwner = this.LIZIZ;
                AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 940);
                Activity activityLIZ = C1388190mED.LIZ(viewGroup2.getContext());
                C1640840sni c1640840sni = this.LJII;
                c1643710ssL = new C1643710ssL(lifecycleOwner, viewGroup3, awS569S0100000_25, viewFindViewById2, activityLIZ, c1640840sni.LJIIIZ, c1640840sni.LJIIJ, c1640840sni.LJIILIIL, this.LIZLLL);
            }
            this.LJIIJJI = c1643710ssL;
            c1643710ssL.setVisibility(this.LJII.LIZ);
            if (this.LJII.LIZ) {
                C11NJ c11nj2 = this.LJJIJLIJ;
                InterfaceC1640960snu interfaceC1640960snu = this.LJIIJJI;
                if (interfaceC1640960snu == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                c11nj2.LIZ(interfaceC1640960snu.LIZIZ().LJJLL(new AfS194S0100000_25(this, 156), c09hm));
            }
            boolean z = this.LJII.LIZLLL;
            ViewGroup viewGroup4 = this.LJJIZ;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            C1641080so6 c1641080so6 = new C1641080so6(viewGroup4.findViewById(R.id.w4x), this.LJIIJ.LIZ, z);
            this.LJIIL = c1641080so6;
            if (z) {
                ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c1641080so6.LIZ;
                if (viewPagerBottomSheetBehavior != null) {
                    viewPagerBottomSheetBehavior.setState(5);
                }
                C11NJ c11nj3 = this.LJJIJLIJ;
                C1641080so6 c1641080so62 = this.LJIIL;
                if (c1641080so62 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                c11nj3.LIZ(c1641080so62.LIZ().LJJLL(new AfS194S0100000_25(this, 143), c09hm));
            }
            final ViewGroup viewGroup5 = this.LJJIZ;
            if (viewGroup5 == null) {
                viewGroup5 = null;
            }
            ?? r4 = new InterfaceC1644710stx() { // from class: X.0snq
                public final void LIZIZ() {
                    View viewFindViewById3 = viewGroup5.findViewById(R.id.w7p);
                    if (viewFindViewById3 != null) {
                        C786410Ut5.LJLLLLLL(8, viewFindViewById3);
                    }
                }

                @Override // X.InterfaceC1644710stx
                public final void LIZ(View.OnClickListener onClickListener) {
                    View viewFindViewById3 = viewGroup5.findViewById(R.id.w7p);
                    if (viewFindViewById3 != null) {
                        C786410Ut5.I7(onClickListener, viewFindViewById3);
                    }
                }
            };
            if (this.LJII.LJ) {
                r4.LIZ(new ACListenerS159S0100000_25(this, 64));
            } else {
                r4.LIZIZ();
            }
            InterfaceC1640760sna interfaceC1640760sna5 = this.LIZJ;
            if (interfaceC1640760sna5 != null && (interfaceC1636810shDNt1 = interfaceC1640760sna5.Nt1()) != null) {
                interfaceC1636810shDNt1.LJJIJ().observe(this.LIZIZ, new AObserverS227S0100000_25(this, 112));
                interfaceC1636810shDNt1.uJ0().observe(this.LIZIZ, new AObserverS227S0100000_25(this, 113));
            }
            if (!this.LJ && C300230Bpl.LIZ() && (interfaceC1640760sna4 = this.LIZJ) != null && (interfaceC1423450n95N61 = interfaceC1640760sna4.N61()) != null) {
                interfaceC1423450n95N61.X1();
            }
            if (!this.LJ && C0CH3.LIZ() && (interfaceC1640760sna3 = this.LIZJ) != null && (interfaceC1640330smtOy0 = interfaceC1640760sna3.Oy0()) != null) {
                interfaceC1640330smtOy0.X1();
            }
            if (!this.LJ && C289700BXc.LIZ() && (interfaceC1640760sna2 = this.LIZJ) != null && (interfaceC1640330smtAN0 = interfaceC1640760sna2.aN0()) != null) {
                interfaceC1640330smtAN0.X1();
            }
            if (!this.LJ && (iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null)) != null && iSocialAvatarStoryPostService.enable() && (interfaceC1640760sna = this.LIZJ) != null && (interfaceC1640330smtEL1 = interfaceC1640760sna.eL1()) != null) {
                interfaceC1640330smtEL1.X1();
            }
            C11NJ c11nj4 = this.LJJIJLIJ;
            C1641720sp8 c1641720sp8 = this.LJIIIZ;
            if (c1641720sp8 == null) {
                c1641720sp8 = null;
            }
            c11nj4.LIZ(c1641720sp8.W0().LJJLJLI(new AfS194S0100000_25(this, 165)));
            this.LJJII = true;
        }
        if (this.LJII.LIZJ) {
            C1641720sp8 c1641720sp82 = this.LJIIIZ;
            (c1641720sp82 != null ? c1641720sp82 : null).show();
        } else {
            C1641720sp8 c1641720sp83 = this.LJIIIZ;
            (c1641720sp83 != null ? c1641720sp83 : null).Y0();
        }
    }

    @Override // X.InterfaceC1465240oEU
    public final boolean LJIIIZ() {
        C1640950snt c1640950sntLJIIL = LJIIL();
        if (c1640950sntLJIIL.LIZLLL.empty() || c1640950sntLJIIL.LIZ.getVisibility() != 0) {
            return false;
        }
        c1640950sntLJIIL.LIZJ();
        return true;
    }

    public final void LJIILJJIL() {
        LJIIL().LIZIZ(new C1640940sns(EnumC1641510son.GIF, new AwS569S0100000_25(this, 945)));
    }

    @Override // X.InterfaceC1465240oEU
    public final void hide() {
        C1231520i9W.LIZLLL();
        if (this.LJII.LIZJ) {
            C1641720sp8 c1641720sp8 = this.LJIIIZ;
            (c1641720sp8 != null ? c1641720sp8 : null).hide();
        } else {
            C1641720sp8 c1641720sp82 = this.LJIIIZ;
            (c1641720sp82 != null ? c1641720sp82 : null).V0();
        }
    }

    @Override // X.InterfaceC1465240oEU
    public final C11RK LIZJ() {
        return this.LJJIJL;
    }

    public final Drawable LJIIJ(int i) {
        if (i == 0) {
            return null;
        }
        return this.LIZ.getContext().getResources().getDrawable(i);
    }

    public C0NC5<EffectCategoryResponse, Effect> LJIILL(C19YA c19ya) {
        return new C1638500sjw(c19ya);
    }

    public final void LJIILLIIL(List<? extends Effect> list) {
        if (!this.LJJIII && list != null && !list.isEmpty()) {
            InterfaceC1640760sna interfaceC1640760sna = this.LIZJ;
            if (interfaceC1640760sna != null) {
                interfaceC1640760sna.n01(list);
            }
            this.LJJIII = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1640830snh(android.view.ViewGroup r18, X.C1465200oEQ r19, X.InterfaceC1640760sna r20, kotlin.jvm.functions.Function1 r21, X.C1413490mt1 r22, boolean r23, kotlin.jvm.internal.AwS566S0100000_22 r24, kotlin.jvm.internal.AwS566S0100000_22 r25) {
        /*
            Method dump skipped, instruction units count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1640830snh.<init>(android.view.ViewGroup, X.0oEQ, X.0sna, kotlin.jvm.functions.Function1, X.0mt1, boolean, kotlin.jvm.internal.AwS566S0100000_22, kotlin.jvm.internal.AwS566S0100000_22):void");
    }
}
