package X;

import Y.ARunnableS124S0100000_24;
import Y.AsS50S0100000_24;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaAppBarBehavior;
import com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainViewModel;
import com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility;
import com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterCenterScene;
import com.ss.android.ugc.aweme.series.feed.model.SeriesCenterSceneEnum;
import com.ss.android.ugc.aweme.service.MiniDramaAccountService;
import com.ss.android.ugc.aweme.service.MiniDramaComplianceService;
import com.ss.android.ugc.aweme.service.MiniDramaRouterService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0rBT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578690rBT extends C1578640rBO implements InterfaceC1577740r9w, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final Fragment LL;
    public final InterfaceC1578680rBS LLILLJJLI;
    public C1578830rBh LLILLL;
    public C16GX LLILZ;
    public C21543519Sv LLILZIL;
    public C1578940rBs LLILZLL;
    public C1578880rBm LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(243));
    public List<NavItem> LLJ;
    public boolean LLJI;
    public View LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public TuxIconView LLJILLL;
    public TuxTextView LLJJ;
    public C1390130mHL LLJJI;
    public FrameLayout LLJJIII;
    public C16G0 LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public IDramaSkylightAbility LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public Boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public EnumC994140bye LLJLL;
    public final C01GW LLJLLIL;
    public final int LLJLLL;
    public C1578760rBa LLJZ;
    public boolean LLJZIJLIL;
    public final SimpleDateFormat LLL;
    public C1578910rBp LLLF;
    public List<SeriesCenterCenterScene> LLLFF;
    public final AwS425S0200000_24 LLLFFI;
    public boolean LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1578690rBT.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/minidrama/tab/v2/DramaTopTabMainViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final void LJJIFFI() {
        this.LLJLIL = false;
        MiniDramaComplianceService.LIZ.getClass();
        MiniDramaComplianceService miniDramaComplianceServiceLIZ = C1578810rBf.LIZ();
        boolean z = this.LLJLL == EnumC994140bye.LLILLL || !LJIILIIL(miniDramaComplianceServiceLIZ != null ? miniDramaComplianceServiceLIZ.LIZ() : null);
        View view = this.LLJJIJIL;
        if (view != null) {
            C1573020r2K.LIZIZ(view, z);
        }
        View view2 = this.LLJJIJIIJIL;
        if (view2 != null) {
            C1573020r2K.LIZIZ(view2, !z);
        }
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            C1573020r2K.LIZ(LJIIJJI(), view3);
        }
        View view4 = this.LLJJIJIIJIL;
        if (view4 != null) {
            C1573020r2K.LIZ(LJIIJJI(), view4);
        }
        C718540SGm.LIZ(this.LLILZ);
        C718540SGm.LIZ(this.LLJIJIL);
        C718540SGm.LIZ(this.LLJJIII);
        C718540SGm.LIZ(this.LLJJI);
        C718540SGm.LIZ(this.LLJILJIL);
        LJJIIJZLJL(true);
        if (z) {
            C1578700rBU c1578700rBU = new C1578700rBU(new AwS568S0100000_24(this, 762), AFwS213S0000000_24.get$arr$(244));
            Fragment fragment = this.LL;
            C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), c1578700rBU, C1578700rBU.class, "source_default_key");
            C723850SaN.LIZ(fragment, false, null, new AwS390S0200000_24(fragment, c1578700rBU, 18), 3);
            return;
        }
        C1155770gBL c1155770gBL = new C1155770gBL(new AwS568S0100000_24(this, 761));
        Fragment fragment2 = this.LL;
        C1554960qZC.LIZ(C1558360qeg.LJFF(fragment2, null), c1155770gBL, C1155770gBL.class, "source_default_key");
        C723850SaN.LIZ(fragment2, false, null, new AwS384S0200000_18(fragment2, c1155770gBL, 56), 3);
    }

    public final void LJJII() {
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        C736680Sv4.LJIIIIZZ(this, LJIIL(), new C2217381BqS() { // from class: X.0gRZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1156010gBj) obj).LLILLJJLI;
            }
        }, null, new AwS638S0100000_24(this, 54), 6);
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1577740r9w
    public final void LIZJ() {
        C16GX c16gx;
        C16GX c16gx2 = this.LLILZ;
        if ((c16gx2 == null || !LJIILJJIL(c16gx2)) && (c16gx = this.LLILZ) != null) {
            c16gx.postOnAnimation(new ARunnableS124S0100000_24(this, 58));
        }
    }

    @Override // X.InterfaceC1577740r9w
    public final boolean LIZLLL() {
        C16GX c16gx = this.LLILZ;
        return c16gx != null && LJIILJJIL(c16gx);
    }

    public final void LJII() {
        RecyclerView recyclerView;
        C16G1 c16g1;
        C16G1 c16g12;
        View viewFindViewById;
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            C718540SGm.LIZ(view);
        }
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            C718540SGm.LIZ(view2);
        }
        C718540SGm.LIZIZ(this.LLILZ);
        C718540SGm.LIZ(this.LLJIJIL);
        C718540SGm.LIZ(this.LLJJIII);
        C718540SGm.LIZ(this.LLJJI);
        boolean zZA = this.LLILLJJLI.n9().zA();
        boolean z = zZA || !this.LLILLJJLI.dH(getContext());
        C1578940rBs c1578940rBs = this.LLILZLL;
        if (c1578940rBs != null) {
            c1578940rBs.setVariant(EnumC1579060rC4.CAPSULE);
            c1578940rBs.setHorizontalMargin(8);
            c1578940rBs.setWidthRule(new C1573990r3t(0));
            c1578940rBs.setFont(52);
            c1578940rBs.setOnSelectedChangeListener(new InterfaceC1573860r3g() { // from class: X.0rBe
                @Override // X.InterfaceC1573860r3g
                public final void LIZ(int i, boolean z2, AbstractC1573810r3b abstractC1573810r3b) {
                    C1578830rBh c1578830rBh;
                    if (z2) {
                        C1578830rBh c1578830rBh2 = this.LIZ.LLILLL;
                        if ((c1578830rBh2 != null && i == c1578830rBh2.getCurrentItem()) || (c1578830rBh = this.LIZ.LLILLL) == null) {
                            return;
                        }
                        c1578830rBh.setCurrentItem(i, false);
                    }
                }
            });
            c1578940rBs.setOnReselectedListener(new InterfaceC1578620rBM() { // from class: X.0rBL
                @Override // X.InterfaceC1578620rBM
                public final void B3() {
                    this.LIZ.LLILLJJLI.n9().Xm("click_tab");
                    this.LIZ.LJJIII();
                }
            });
        }
        if (LJIIZILJ()) {
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                C718540SGm.LIZ(view3);
            }
        } else {
            View view4 = this.LLJILJILJ;
            if (view4 != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, view4.getContext());
                view4.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{numLIZJ != null ? numLIZJ.intValue() : 0, 0}));
                if (C444960Hcc.LIZJ(view4.getContext())) {
                    C786410Ut5.Ob(view4, -1.0f);
                }
                C1578940rBs c1578940rBs2 = this.LLILZLL;
                if (c1578940rBs2 != null && (recyclerView = c1578940rBs2.getRecyclerView()) != null) {
                    recyclerView.addOnScrollListener(new AsS50S0100000_24(view4, 6));
                }
            }
        }
        View viewLJI = LJI();
        if (viewLJI != null && (viewFindViewById = viewLJI.findViewById(R.id.g8j)) != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0rAN
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view5) {
                    if (view5 != null) {
                        String string = UriProtector.parse("aweme://paidcontent/drama/center").buildUpon().appendQueryParameter("enter_from", "homepage_series").appendQueryParameter("is_from_innerfeed_discover", String.valueOf(this.LLILZ.LJIILL())).toString();
                        MiniDramaRouterService.LIZ.getClass();
                        MiniDramaRouterService miniDramaRouterServiceLIZ = C1573900r3k.LIZ();
                        if (miniDramaRouterServiceLIZ != null) {
                            miniDramaRouterServiceLIZ.LIZIZ(string, C2097608Jq.LJ());
                        }
                        C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                        C1611660s2e.LJJJJ(null, "button", this.LLILZ.LLILLJJLI.n9().d9(), "all_series_default", C1577260r9A.LIZ, this.LLILZ.LJIILL());
                    }
                }
            }, viewFindViewById);
        }
        C16GX c16gx = this.LLILZ;
        if (c16gx != null) {
            c16gx.setOutlineProvider(null);
            c16gx.setStateListAnimator(null);
            c16gx.setLiftOnScroll(false);
            c16gx.LJ(false, false, true);
            this.LLJZ = new C1578760rBa(c16gx, new AwS568S0100000_24(this, 1722));
            ViewGroup.LayoutParams layoutParams = c16gx.getLayoutParams();
            if ((layoutParams instanceof C16G1) && (c16g12 = (C16G1) layoutParams) != null) {
                c16g12.LIZIZ(new DramaAppBarBehavior(c16gx.getContext(), null));
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gx);
                c16gx.setLayoutParams(c16g12);
            }
        }
        C21543519Sv c21543519Sv = this.LLILZIL;
        if (c21543519Sv != null) {
            C1573020r2K.LIZ(LJIIJJI(), c21543519Sv);
            c21543519Sv.setMinimumHeight(LJIIJJI() - this.LLJLLL);
        }
        View view5 = this.LLJILJIL;
        if (view5 != null) {
            ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.height = LJIIJJI();
            C786410Ut5.W5(view5, layoutParams2);
        }
        View view6 = this.LLJIJIL;
        if (view6 != null) {
            ViewGroup.LayoutParams layoutParams3 = view6.getLayoutParams();
            if ((layoutParams3 instanceof C16G1) && (c16g1 = (C16G1) layoutParams3) != null) {
                ((ViewGroup.MarginLayoutParams) c16g1).topMargin = ((int) this.LLILLJJLI.JO()) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                c16g1.LIZJ = 1;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)));
            gradientDrawable.setColor(C1578770rBb.LIZIZ(view6.getContext(), R.attr.oj));
            gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C1578770rBb.LIZIZ(view6.getContext(), R.attr.dy));
            view6.setBackground(gradientDrawable);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0rAO
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view7) {
                    if (view7 != null) {
                        C1578690rBT c1578690rBT = this.LLILZ;
                        C16GX c16gx2 = c1578690rBT.LLILZ;
                        if (c16gx2 != null) {
                            boolean z2 = !C1578690rBT.LJIILJJIL(c16gx2);
                            c16gx2.LJ(z2, true, true);
                            if (z2) {
                                C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                                C1611660s2e.LJJJJI(c1578690rBT.LLILLJJLI.n9().d9(), C1577260r9A.LIZ, "click", c1578690rBT.LJIILL());
                            }
                        }
                        InterfaceC1572860r24 interfaceC1572860r24Iu = c1578690rBT.LLILLJJLI.n9().Iu();
                        if (interfaceC1572860r24Iu != null) {
                            interfaceC1572860r24Iu.LIZJ();
                        }
                    }
                }
            }, view6);
        }
        if (!this.LLJLIL) {
            Fragment fragment = this.LL;
            C1155730gBH c1155730gBH = new C1155730gBH(Boolean.valueOf(z));
            C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), c1155730gBH, C1155730gBH.class, "source_default_key");
            C723850SaN.LIZ(fragment, false, null, new AwS384S0200000_18(fragment, c1155730gBH, 210), 3);
            this.LLJLIL = true;
        }
        LJJIIJZLJL(z);
        View view7 = this.LLJILJIL;
        if (view7 != null) {
            C1573020r2K.LIZIZ(view7, !zZA);
        }
    }

    public final C1578910rBp LJIIIIZZ() {
        if (this.LLLF == null) {
            C1578830rBh c1578830rBh = this.LLILLL;
            this.LLLF = c1578830rBh != null ? (C1578910rBp) C09RB.LJIIL(C09RB.LJIIIZ(new C09RD(c1578830rBh), new Function1<Object, Boolean>() { // from class: X.0rBd
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof C1578910rBp);
                }
            })) : null;
        }
        return this.LLLF;
    }

    public final IDramaSkylightAbility LJIIJ() {
        if (this.LLJJJJLIIL == null) {
            this.LLJJJJLIIL = (IDramaSkylightAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IDramaSkylightAbility.class, null);
        }
        return this.LLJJJJLIIL;
    }

    public final int LJIIJJI() {
        return ((Number) this.LLJLLIL.getValue()).intValue();
    }

    public final DramaTopTabMainViewModel LJIIL() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        return (DramaTopTabMainViewModel) assemVMLazy.getValue();
    }

    public final boolean LJIILL() {
        return ((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue();
    }

    public final boolean LJIILLIIL() {
        SeriesCenterCenterScene seriesCenterCenterScene;
        C1578830rBh c1578830rBh = this.LLILLL;
        return (c1578830rBh == null || (seriesCenterCenterScene = (SeriesCenterCenterScene) C13LP.LJJJLZIJ(c1578830rBh.getCurrentItem(), this.LLLFF)) == null || seriesCenterCenterScene.scene != SeriesCenterSceneEnum.PICKS) ? false : true;
    }

    public final boolean LJIIZILJ() {
        return ((Boolean) this.LLIZLLLIL.getValue()).booleanValue();
    }

    public final void LJIJI() {
        C1578760rBa c1578760rBa = this.LLJZ;
        if (c1578760rBa != null) {
            c1578760rBa.LIZ(new AwS568S0100000_24(c1578760rBa, 1721));
        }
        Map<EnumC1574490r4h, Map<String, Aweme>> map = C1574470r4f.LIZ;
        C1574470r4f.LIZLLL(EnumC1574490r4h.HOMEPAGE_SERIES);
        C1574470r4f.LIZLLL(EnumC1574490r4h.THREE_COLUMN_SKYLIGHT);
        C1574470r4f.LIZLLL(EnumC1574490r4h.THREE_COLUMN_CATEGORY);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            r3 = this;
            X.0rBf r0 = com.ss.android.ugc.aweme.service.MiniDramaComplianceService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaComplianceService r0 = X.C1578810rBf.LIZ()
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.LIZ()
        Lf:
            boolean r0 = r3.LJIILIIL(r0)
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L59
            X.0rBQ r0 = com.ss.android.ugc.aweme.service.MiniDramaAccountService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.MiniDramaAccountService r0 = X.C1578660rBQ.LIZ()
            if (r0 == 0) goto L4b
            boolean r0 = r0.LIZJ()
            if (r0 != r1) goto L4b
        L29:
            X.0bye r2 = X.EnumC994140bye.LL
        L2b:
            X.0bye r1 = r3.LLJLL
            if (r2 == r1) goto L62
            r3.LLJLL = r2
            X.0bye r0 = X.EnumC994140bye.LL
            if (r2 != r0) goto L5e
            r3.LJII()
            r3.LJJII()
            com.ss.android.ugc.aweme.minidrama.tab.v2.DramaTopTabMainViewModel r1 = r3.LJIIL()
            X.01GW r0 = r3.LLJJL
            java.lang.Object r0 = r0.getValue()
            X.0gGC r0 = (X.InterfaceC1158780gGC) r0
            r1.vQ2(r0)
            return
        L4b:
            X.0Ax1 r0 = X.C279250Ax1.LIZ
            r0.getClass()
            boolean r0 = X.C279250Ax1.LIZ()
            if (r0 == 0) goto L29
            X.0bye r2 = X.EnumC994140bye.LLILLJJLI
            goto L2b
        L59:
            X.0bye r2 = X.EnumC994140bye.LLILLL
            goto L2b
        L5c:
            r0 = 0
            goto Lf
        L5e:
            r3.LJJIFFI()
            return
        L62:
            X.0bye r0 = X.EnumC994140bye.LL
            if (r1 != r0) goto L6f
            com.ss.android.ugc.aweme.minidrama.tab.v2.ability.IDramaSkylightAbility r0 = r3.LJIIJ()
            if (r0 == 0) goto L6f
            r0.gl1()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1578690rBT.LJIJJ():void");
    }

    public final void LJJIIZ() {
        View view;
        View view2;
        C1578830rBh c1578830rBh = this.LLILLL;
        if (c1578830rBh != null) {
            c1578830rBh.getCurrentItem();
            if (LJIILLIIL()) {
                View view3 = this.LLJILJIL;
                if ((view3 == null || view3.getVisibility() != 8) && (view2 = this.LLJILJIL) != null) {
                    C718540SGm.LIZ(view2);
                    return;
                }
                return;
            }
            View view4 = this.LLJILJIL;
            if ((view4 == null || view4.getVisibility() != 0) && (view = this.LLJILJIL) != null) {
                C718540SGm.LIZIZ(view);
            }
        }
    }

    public final Context getContext() {
        return (Context) this.LLJJJJ.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    public final int LJIIIZ() {
        return LJIIZILJ() ? R.attr.zp : R.attr.zm;
    }

    public final void LJJIII() {
        InterfaceC1561380qjY interfaceC1561380qjY;
        C1578670rBR c1578670rBR;
        AbstractC1155960gBe abstractC1155960gBe = LJIIL().getState().LLILLJJLI;
        if ((abstractC1155960gBe instanceof C1155940gBc) && (((C1155940gBc) abstractC1155960gBe).LIZ instanceof C1576810r8R)) {
            return;
        }
        C1578830rBh c1578830rBh = this.LLILLL;
        int currentItem = c1578830rBh != null ? c1578830rBh.getCurrentItem() : 0;
        C1578830rBh c1578830rBh2 = this.LLILLL;
        String strLJJIJL = null;
        PagerAdapter adapter = c1578830rBh2 != null ? c1578830rBh2.getAdapter() : null;
        if ((adapter instanceof C1578670rBR) && (c1578670rBR = (C1578670rBR) adapter) != null) {
            strLJJIJL = c1578670rBR.LJJIJL(currentItem);
        }
        if (!this.LL.isAdded() || this.LL.isDetached()) {
            return;
        }
        C128Y c128yLJJJJZI = this.LL.getChildFragmentManager().LJJJJZI(strLJJIJL);
        if (!(c128yLJJJJZI instanceof InterfaceC1561380qjY) || (interfaceC1561380qjY = (InterfaceC1561380qjY) c128yLJJJJZI) == null) {
            return;
        }
        interfaceC1561380qjY.VN();
    }

    public static boolean LJIILJJIL(C16GX c16gx) {
        C16GU c16gu;
        C16G1 c16g1;
        ViewGroup.LayoutParams layoutParams = c16gx.getLayoutParams();
        C16BC c16bc = null;
        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
            c16bc = c16g1.LIZ;
        }
        if ((c16bc instanceof AppBarLayout$Behavior) && (c16gu = (C16GU) c16bc) != null && c16gu.getTopAndBottomOffset() != 0) {
            return false;
        }
        return true;
    }

    public static final void LJIJ(Bundle bundle) throws JSONException {
        MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.TOP_TAB).LJIIL();
        C1578900rBo.LL.getClass();
        if (C296950BkT.LIZ() && C1578900rBo.LLILLL.compareAndSet(false, true)) {
            C01GW c01gw = C1578900rBo.LLILZ;
            C1548820qPI.LJI((C085L) c01gw.getValue(), "short_drama_center_loaded");
            C1548820qPI.LJI((C085L) c01gw.getValue(), "short_drama_center_container_close");
        }
    }

    @Override // X.InterfaceC1577740r9w
    public final void LIZ(C1578720rBW c1578720rBW) {
        C1578760rBa c1578760rBa = this.LLJZ;
        if (c1578760rBa != null) {
            c1578760rBa.LIZ(new AwS425S0200000_24(c1578760rBa, c1578720rBW, 65));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    @Override // X.InterfaceC1577740r9w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r4) {
        /*
            r3 = this;
            r1 = 8
            if (r4 != 0) goto Lc
            android.view.View r0 = r3.LLJIJIL
            if (r0 == 0) goto Lb
            X.C786410Ut5.LJLLLLLL(r1, r0)
        Lb:
            return
        Lc:
            boolean r0 = r3.LIZLLL()
            if (r0 == 0) goto L1a
            android.view.View r0 = r3.LLJIJIL
            if (r0 == 0) goto L19
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L19:
            return
        L1a:
            android.view.View r0 = r3.LLJIJIL
            r2 = 0
            if (r0 == 0) goto L3f
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 != 0) goto L3f
        L26:
            android.view.View r0 = r3.LLJIJIL
            if (r0 == 0) goto L2d
            X.C786410Ut5.LJLLLLLL(r2, r0)
        L2d:
            if (r1 != 0) goto L3e
            X.0rBS r0 = r3.LLILLJJLI
            X.0rAH r0 = r0.n9()
            X.0r24 r0 = r0.Iu()
            if (r0 == 0) goto L3e
            r0.LIZ()
        L3e:
            return
        L3f:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1578690rBT.LIZIZ(boolean):void");
    }

    @Override // X.InterfaceC1577740r9w
    public final void LJ(boolean z) {
        if (LIZLLL() != z) {
            C16GX c16gx = this.LLILZ;
            if (c16gx != null) {
                c16gx.setExpanded(z);
            }
            if (z) {
                C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
                C1611660s2e.LJJJJI(this.LLILLJJLI.n9().d9(), C1577260r9A.LIZ, "pull", LJIILL());
            }
        }
    }

    public final boolean LJIILIIL(String str) {
        if (str == null || str.length() <= 0) {
            return true;
        }
        try {
            Date date = this.LLL.parse(str);
            if (date == null) {
                return false;
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date);
            int i = calendar.get(1) - calendar2.get(1);
            if (calendar.get(2) < calendar2.get(2) || (calendar.get(2) == calendar2.get(2) && calendar.get(5) < calendar2.get(5))) {
                i--;
            }
            if (i >= 18) {
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LJIJJLI(int i) {
        C16GX c16gx;
        ViewGroup.LayoutParams layoutParams;
        String str;
        View viewLJI;
        DramaAppBarBehavior dramaAppBarBehavior;
        C16G1 c16g1;
        View viewFindViewById;
        Object parent;
        View view;
        int i2;
        View viewLJI2 = LJI();
        C16BC c16bc = null;
        boolean z = true;
        if (viewLJI2 != null && (viewFindViewById = viewLJI2.findViewById(R.id.g_4)) != null) {
            LJJIIJ(this, viewFindViewById, 3);
            C1578940rBs c1578940rBs = this.LLILZLL;
            if (c1578940rBs != null) {
                parent = c1578940rBs.getParent();
            } else {
                parent = null;
            }
            if ((parent instanceof View) && (view = (View) parent) != null) {
                if (LJIIZILJ()) {
                    i2 = 1;
                } else {
                    i2 = 21;
                }
                LJJIIJ(this, view, i2);
            }
        }
        LJJIIZ();
        if (LJIILLIIL()) {
            C16GX c16gx2 = this.LLILZ;
            if (c16gx2 != null) {
                c16gx2.LJ(!this.LLLFZ, false, true);
            }
        } else if (this.LLLFZ && (c16gx = this.LLILZ) != null) {
            c16gx.LJ(true, false, true);
        }
        boolean zLJIILLIIL = LJIILLIIL();
        boolean z2 = !zLJIILLIIL;
        C16GX c16gx3 = this.LLILZ;
        if (c16gx3 != null) {
            layoutParams = c16gx3.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
            c16bc = c16g1.LIZ;
        }
        if ((c16bc instanceof DramaAppBarBehavior) && (dramaAppBarBehavior = (DramaAppBarBehavior) c16bc) != null) {
            dramaAppBarBehavior.LIZ = z2;
            dramaAppBarBehavior.LIZIZ = z2;
        }
        if (!zLJIILLIIL && this.LLILLJJLI.dH(getContext())) {
            z = false;
        }
        LJJIIJZLJL(z);
        if (zLJIILLIIL && (viewLJI = LJI()) != null) {
            HandlerHook.viewPost(viewLJI, new ARunnableS124S0100000_24(this, 59));
        }
        if (!this.LLLFZ) {
            C1581520rG2 c1581520rG2 = C1581520rG2.LJI;
            String str2 = C1577260r9A.LIZ;
            SeriesCenterCenterScene seriesCenterCenterScene = (SeriesCenterCenterScene) C13LP.LJJJLZIJ(i, this.LLLFF);
            if (seriesCenterCenterScene == null || (str = seriesCenterCenterScene.metricName) == null) {
                str = "";
            }
            C1611660s2e.LJJIJLIJ(i, "homepage_series", str2, str, null, LJIILL());
            return;
        }
        this.LLLFZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1578690rBT.LJJI(com.ss.android.ugc.aweme.minidrama.tab.v2.navbar.NavItem):void");
    }

    public final void LJJIIJZLJL(boolean z) {
        int i;
        if (Intrinsics.LJFF(Boolean.valueOf(z), this.LLJL)) {
            return;
        }
        this.LLJL = Boolean.valueOf(z);
        this.LLJI = z;
        C1578880rBm c1578880rBm = this.LLIZ;
        if (c1578880rBm != null) {
            c1578880rBm.setDarkMode(z);
        }
        IDramaSkylightAbility iDramaSkylightAbilityLJIIJ = LJIIJ();
        if (iDramaSkylightAbilityLJIIJ != null) {
            iDramaSkylightAbilityLJIIJ.ar1(z);
        }
        this.LLILLJJLI.SE(z);
        Context context = getContext();
        if (context == null) {
            return;
        }
        int iLIZ = C1578770rBb.LIZ(context, LJIIIZ());
        int iLIZIZ = C1578770rBb.LIZIZ(context, LJIIIZ());
        if (z) {
            i = iLIZ;
        } else {
            i = iLIZIZ;
        }
        FrameLayout frameLayout = this.LLJJIII;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(i);
        }
        if (LJIIZILJ()) {
            View view = this.LLJILJILJ;
            if (view != null) {
                C718540SGm.LIZ(view);
            }
            View view2 = this.LLJILJIL;
            if (view2 != null) {
                view2.setBackgroundColor(i);
            }
        } else {
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i}));
            }
        }
        if (z) {
            View viewLJI = LJI();
            if (viewLJI != null) {
                viewLJI.setBackgroundColor(iLIZ);
            }
            View view4 = this.LLJJJ;
            if (view4 != null) {
                view4.setBackgroundColor(iLIZ);
            }
        } else {
            View viewLJI2 = LJI();
            if (viewLJI2 != null) {
                viewLJI2.setBackgroundColor(iLIZIZ);
            }
            View view5 = this.LLJJJ;
            if (view5 != null) {
                view5.setBackground(null);
            }
        }
        C1582470rHZ c1582470rHZ = new C1582470rHZ(LJJ(context, R.attr.a00, z), LJJ(context, R.attr.a0o, z), LJJ(context, R.attr.a03, z), LJJ(context, R.attr.a1k, z));
        C1578940rBs c1578940rBs = this.LLILZLL;
        if (c1578940rBs != null) {
            c1578940rBs.setSelectionStyle(c1582470rHZ);
        }
        if (z) {
            TuxIconView tuxIconView = this.LLJILLL;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(C1578770rBb.LIZ(context, R.attr.a1h));
            }
            TuxTextView tuxTextView = this.LLJJ;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(C1578770rBb.LIZ(context, R.attr.a1h));
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJILLL;
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColor(C1578770rBb.LIZIZ(context, R.attr.a1h));
        }
        TuxTextView tuxTextView2 = this.LLJJ;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setTextColor(C1578770rBb.LIZIZ(context, R.attr.a1h));
    }

    public C1578690rBT(Fragment fragment, InterfaceC1578680rBS interfaceC1578680rBS) {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        this.LL = fragment;
        this.LLILLJJLI = interfaceC1578680rBS;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJ = c13bv;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 758));
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DramaTopTabMainViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 371);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(129);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) fragment, 372), aFwS256S0000000_18, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS562S0100000_18, new AwS568S0100000_24(fragment, 763), aFwS256S0000000_18, null, null, null);
            z = false;
            z2 = true;
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) fragment, 373), aFwS256S0000000_18, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJJJJJIL = assemVMLazy;
        this.LLJJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 759));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 760));
        this.LLJLL = EnumC994140bye.LL;
        this.LLJLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 765));
        this.LLJLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setLenient(z);
        this.LLL = simpleDateFormat;
        this.LLLFF = c13bv;
        this.LLLFFI = new AwS425S0200000_24(this, new C013C(), 32);
        this.LLLFZ = z2;
    }

    public final void LJIL(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        EnumC994140bye enumC994140bye;
        View viewFindViewById;
        C16G1 c16g1;
        View view2;
        ViewGroup viewGroup;
        View view3;
        if (LJIILL() || !this.LLILLJJLI.n9().zA()) {
            this.LLILLJJLI.dH(getContext());
        }
        Object parent = view.getParent();
        String strLIZ = null;
        if ((parent instanceof View) && (view3 = (View) parent) != null) {
            view3.setBackground(null);
        }
        this.LLILZLL = (C1578940rBs) view.findViewById(R.id.wws);
        if (LJIIZILJ() && (view2 = this.LLILZLL) != null) {
            ViewParent parent2 = view2.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                int iIndexOfChild = viewGroup.indexOfChild(view2);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                int visibility = view2.getVisibility();
                view2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, view2);
                View viewFindViewById2 = viewGroup.findViewById(R.id.g8j);
                if (viewFindViewById2 != null) {
                    C786410Ut5.LJLLLLLL(8, viewFindViewById2);
                }
                C1578880rBm c1578880rBm = new C1578880rBm(viewGroup.getContext());
                c1578880rBm.setId(View.generateViewId());
                if (layoutParams2 instanceof C19ME) {
                    C19ME c19me = new C19ME((C19ME) layoutParams2);
                    ((ViewGroup.MarginLayoutParams) c19me).height = this.LLJLLL;
                    c19me.endToStart = -1;
                    c19me.endToEnd = 0;
                    layoutParams2 = c19me;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1578880rBm);
                c1578880rBm.setLayoutParams(layoutParams2);
                List<NavItem> list = this.LLJ;
                AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(this, 495);
                c1578880rBm.LL = list;
                c1578880rBm.LLILLJJLI = awS603S0100000_24;
                c1578880rBm.LIZ();
                c1578880rBm.setDarkMode(this.LLJI);
                viewGroup.addView(c1578880rBm, iIndexOfChild + 1);
                this.LLIZ = c1578880rBm;
            }
        }
        this.LLILZ = (C16GX) view.findViewById(R.id.b6_);
        this.LLILZIL = (C21543519Sv) view.findViewById(R.id.e6a);
        View viewFindViewById3 = view.findViewById(R.id.i_j);
        this.LLJIJIL = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOutlineProvider(null);
        }
        View viewFindViewById4 = view.findViewById(R.id.w0n);
        this.LLJILJIL = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOutlineProvider(null);
        }
        View viewFindViewById5 = view.findViewById(R.id.ds1);
        this.LLJILJILJ = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOutlineProvider(null);
        }
        this.LLJILLL = (TuxIconView) view.findViewById(R.id.g8f);
        View viewFindViewById6 = view.findViewById(R.id.g8j);
        if (viewFindViewById6 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById6);
        }
        this.LLJJ = (TuxTextView) view.findViewById(R.id.g8g);
        C1390130mHL c1390130mHL = (C1390130mHL) view.findViewById(R.id.g9i);
        this.LLJJI = c1390130mHL;
        if (c1390130mHL != null) {
            c1390130mHL.setOutlineProvider(null);
        }
        C1390130mHL c1390130mHL2 = this.LLJJI;
        if (c1390130mHL2 != null) {
            layoutParams = c1390130mHL2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
            c16g1.LIZJ = 17;
        }
        C1390130mHL c1390130mHL3 = this.LLJJI;
        if (c1390130mHL3 != null && (viewFindViewById = c1390130mHL3.findViewById(R.id.o9n)) != null) {
            viewFindViewById.setBackground(null);
        }
        this.LLJJIJI = (C16G0) view.findViewById(R.id.g_3);
        this.LLJJIJIIJIL = view.findViewById(R.id.g92);
        this.LLJJIJIL = view.findViewById(R.id.g_9);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.w0t);
        this.LLJJIII = frameLayout;
        if (frameLayout != null) {
            frameLayout.setOutlineProvider(null);
        }
        MiniDramaComplianceService.LIZ.getClass();
        MiniDramaComplianceService miniDramaComplianceServiceLIZ = C1578810rBf.LIZ();
        if (miniDramaComplianceServiceLIZ != null) {
            strLIZ = miniDramaComplianceServiceLIZ.LIZ();
        }
        if (LJIILIIL(strLIZ)) {
            MiniDramaAccountService.LIZ.getClass();
            MiniDramaAccountService miniDramaAccountServiceLIZ = C1578660rBQ.LIZ();
            if (miniDramaAccountServiceLIZ == null || !miniDramaAccountServiceLIZ.LIZJ()) {
                C279250Ax1.LIZ.getClass();
                if (C279250Ax1.LIZ()) {
                    enumC994140bye = EnumC994140bye.LLILLJJLI;
                }
            }
            this.LLJLL = EnumC994140bye.LL;
            LJII();
            LJJII();
            LJIIL().vQ2((InterfaceC1158780gGC) this.LLJJL.getValue());
            return;
        }
        enumC994140bye = EnumC994140bye.LLILLL;
        this.LLJLL = enumC994140bye;
        LJJIFFI();
    }

    public static final Integer LJJ(Context context, int i, boolean z) {
        int iLIZIZ;
        if (z) {
            iLIZIZ = C1578770rBb.LIZ(context, i);
        } else {
            iLIZIZ = C1578770rBb.LIZIZ(context, i);
        }
        return Integer.valueOf(iLIZIZ);
    }

    public static final void LJJIIJ(C1578690rBT c1578690rBT, View view, int i) {
        C21536219Qa c21536219Qa;
        C16GZ c16gz;
        View view2;
        C21536219Qa c21536219Qa2;
        C16GZ c16gz2;
        View view3;
        ViewGroup.LayoutParams layoutParams = null;
        if (c1578690rBT.LJIILLIIL()) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof C21536219Qa) && (c21536219Qa2 = (C21536219Qa) layoutParams2) != null) {
                c21536219Qa2.LIZ = 2;
                c21536219Qa2.LIZIZ = 1.0f;
                C786410Ut5.W5(view, c21536219Qa2);
                Object parent = view.getParent();
                if ((parent instanceof View) && (view3 = (View) parent) != null) {
                    layoutParams = view3.getLayoutParams();
                }
                if ((layoutParams instanceof C16GZ) && (c16gz2 = (C16GZ) layoutParams) != null) {
                    c16gz2.LIZ = 1;
                    return;
                }
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        if ((layoutParams3 instanceof C21536219Qa) && (c21536219Qa = (C21536219Qa) layoutParams3) != null) {
            c21536219Qa.LIZ = 0;
            C786410Ut5.W5(view, c21536219Qa);
            Object parent2 = view.getParent();
            if ((parent2 instanceof View) && (view2 = (View) parent2) != null) {
                layoutParams = view2.getLayoutParams();
            }
            if (!(layoutParams instanceof C16GZ) || (c16gz = (C16GZ) layoutParams) == null) {
                return;
            }
            c16gz.LIZ = i;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
