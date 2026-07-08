package X;

import Y.ACListenerS141S0100000_6;
import Y.ARunnableS106S0100000_6;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.optimizeemojirebinding.SystemSmallEmojiGridAdapterWithoutViewPager;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiPanelBottomPaddingVM;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.saas.host.api.infra.IMInfraService;
import com.ss.android.ugc.aweme.im.saas.host.api.performance.IFpsMonitorHelper;
import com.ss.android.ugc.aweme.im.service.service.IMPerformanceService;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.impl.ui.StickerGridAdapter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C450470HlV extends C450480HlW {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJIIZ;
    public final LifecycleOwner LJIILIIL;
    public final ViewGroup LJIILJJIL;
    public final C0H3N LJIILL;
    public InterfaceC444050Hb9 LJIILLIIL;
    public final C450880HmA LJIIZILJ;
    public final int LJIJ;
    public final InterfaceC450890HmB LJIJI;
    public final InterfaceC497601wk LJIJJ;
    public final List<Integer> LJIJJLI;
    public final Integer LJIL;
    public final Integer LJJ;
    public final Space LJJI;
    public AnonymousClass0956 LJJIFFI;
    public final C450530Hlb LJJII;
    public final AwS550S0100000_6 LJJIII;
    public boolean LJJIIJ;
    public volatile InterfaceC450290HlD LJJIIJZLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C450470HlV.class, "stickersRepository", "getStickersRepository()Lcom/ss/android/ugc/aweme/im/sticker/api/repo/IMStickerRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU = new C2217401BqU(C450470HlV.class, "emojiPanelBottomPaddingVM", "<v#0>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C450470HlV.class, "emojiPanelBottomPaddingVM", "<v#1>", 0);
        c09r3.getClass();
        LJJIIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217401BqU, c2217401BqU2};
    }

    public C450470HlV() {
        throw null;
    }

    public final InterfaceC450290HlD LJIIIZ() {
        InterfaceC450290HlD interfaceC450290HlD = this.LJJIIJZLJL;
        if (interfaceC450290HlD == null) {
            synchronized (this) {
                interfaceC450290HlD = this.LJJIIJZLJL;
                if (interfaceC450290HlD == null) {
                    InterfaceC450290HlD interfaceC450290HlD2 = (InterfaceC450290HlD) C1807670x8n.LLLLLZ();
                    this.LJJIIJZLJL = interfaceC450290HlD2;
                    return interfaceC450290HlD2;
                }
            }
        }
        return interfaceC450290HlD;
    }

    private final void LJIIJJI() {
        int iLIZJ = this.LJIILLIIL.LIZJ();
        if (iLIZJ == 7 || iLIZJ == 9) {
            LJIILLIIL(EnumC450500HlY.LOADING);
        } else {
            C786410Ut5.LLLZLZ(LJFF(), 8);
            C786410Ut5.LLLZZIL(LIZLLL(), 8);
        }
    }

    public final void LJI() {
        List<C451030HmP> data;
        C1722300uv6 c1722300uv6;
        List<Integer> list;
        List<Integer> list2;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD = this.LJIIL;
        if (abstractC450910HmD == null || (data = abstractC450910HmD.getData()) == null || data.size() != LJIIIIZZ()) {
            return;
        }
        C450550Hld c450550HldLJ = LJ();
        int visibility = c450550HldLJ.getVisibility();
        c450550HldLJ.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c450550HldLJ);
        C1749280vcc c1749280vccLJFF = LJFF();
        c1749280vccLJFF.setTopMargin(C418440Gaw.LIZIZ(46));
        C786410Ut5.wd((TuxTextView) c1749280vccLJFF.findViewById(R.id.message_tv), C418440Gaw.LIZIZ(-12));
        if (!C451740HnY.LIZ() || (((list = this.LJIJJLI) != null && list.contains(Integer.valueOf(EnumC451180Hme.VIDEO_STICKER_STATIC.getType()))) || ((list2 = this.LJIJJLI) != null && list2.contains(Integer.valueOf(EnumC451180Hme.VIDEO_STICKER_ANIMATED.getType()))))) {
            c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_2pt_sticker;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            c1722300uv6.LJIIIIZZ = LIZIZ().getContext().getString(2131848837);
        } else {
            c1722300uv6 = new C1722300uv6();
            Drawable drawableLIZIZ = C800330VaR.LIZIZ(LIZIZ().getContext(), R.drawable.bpz);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZ = drawableLIZIZ;
            c1722300uv6.LJIIIIZZ = LIZIZ().getContext().getString(2131848848);
            c1722300uv6.LJIIJ = new AwS585S0100000_6(this, 408);
        }
        c1749280vccLJFF.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(c1749280vccLJFF, 0);
        C786410Ut5.LLLZZIL(LIZLLL(), 8);
    }

    public final int LJIIIIZZ() {
        List<C451030HmP> data;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD;
        List<C451030HmP> data2;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD2 = this.LJIIL;
        if (abstractC450910HmD2 != null && (data = abstractC450910HmD2.getData()) != null) {
            Iterator<C451030HmP> it2 = data.iterator();
            int i = 0;
            while (it2.hasNext()) {
                Integer numLIZIZ = it2.next().LIZIZ();
                int type = EnumC451180Hme.ENTRANCE.getType();
                if (numLIZIZ == null || numLIZIZ.intValue() != type) {
                    if (i >= 0) {
                        return i;
                    }
                    abstractC450910HmD = this.LJIIL;
                    if (abstractC450910HmD != null && (data2 = abstractC450910HmD.getData()) != null) {
                        return data2.size();
                    }
                } else {
                    i++;
                }
            }
            abstractC450910HmD = this.LJIIL;
            if (abstractC450910HmD != null) {
                return data2.size();
            }
        }
        return 0;
    }

    public final AbstractC450910HmD<C451030HmP> LJIIJ() {
        int iLIZJ = this.LJIILLIIL.LIZJ();
        if (iLIZJ != 2) {
            if (iLIZJ == 5) {
                return new SystemSmallEmojiGridAdapterWithoutViewPager(this.LJIILIIL, LJ(), this.LJIILL, this.LJIIZILJ, new AwS585S0100000_6(this, 405));
            }
            if (iLIZJ != 7 && iLIZJ != 9 && iLIZJ != 10) {
                return null;
            }
        }
        return new StickerGridAdapter(this.LJIILIIL, LIZIZ().getContext(), this.LJIILLIIL.LIZJ(), this.LJIL, this.LJJ, new AwS585S0100000_6(this, 406));
    }

    @Override // X.C450480HlW
    public final ViewGroup LIZ() {
        return this.LJIILJJIL;
    }

    public final void LJII(C21673919s1 c21673919s1) {
        String str;
        C1366690lfX c1366690lfXLIZIZ;
        IMStickerApi.LIZ.getClass();
        if (C457760HxG.LIZIZ(true) && c21673919s1.LIZIZ() > 0) {
            int iLIZJ = this.LJIILLIIL.LIZJ();
            if (iLIZJ != 2) {
                if (iLIZJ != 5) {
                    if (iLIZJ != 7) {
                        if (iLIZJ != 9) {
                            if (iLIZJ != 10) {
                                str = "";
                            } else {
                                str = "aimoji_setsticker";
                            }
                        } else {
                            str = "sticker_set";
                        }
                    } else {
                        str = "fav_sticker";
                    }
                } else {
                    str = "system_emoji";
                }
            } else {
                str = "navi";
            }
            IMPerformanceService performanceService = C1336205Ku.LIZ(false).getPerformanceService();
            if (performanceService != null) {
                c1366690lfXLIZIZ = performanceService.LIZIZ();
            } else {
                c1366690lfXLIZIZ = null;
            }
            C450520Hla c450520Hla = new C450520Hla();
            if (c1366690lfXLIZIZ != null && c1366690lfXLIZIZ.LIZ(c450520Hla)) {
                c1366690lfXLIZIZ.LIZJ(c450520Hla, new C1724006p4(str));
            }
            IFpsMonitorHelper.LIZ.getClass();
            IFpsMonitorHelper value = C0HYO.LIZIZ.getValue();
            if (value != null) {
                value.stop();
            }
        }
    }

    public final View LJIIL(boolean z) {
        AssemVMLazy assemVMLazy;
        AssemVMLazy assemVMLazy2;
        AbstractC450910HmD<C451030HmP> abstractC450910HmDLJIIJ = LJIIJ();
        if (abstractC450910HmDLJIIJ != null) {
            abstractC450910HmDLJIIJ.LLILZ = this.LJIJI;
            if ((this.LJIILLIIL instanceof C443730Had) && C451740HnY.LIZ()) {
                abstractC450910HmDLJIIJ.setShowFooter(true);
            }
            LJ().setAdapter(abstractC450910HmDLJIIJ);
            if (z) {
                abstractC450910HmDLJIIJ.LLLIIIIL(LJ());
                if (!this.LJJIIJ) {
                    this.LJJIIJ = true;
                    IMInfraService.LIZ.getClass();
                    IMInfraService iMInfraServiceLIZ = C451130HmZ.LIZ();
                    if (iMInfraServiceLIZ != null) {
                        iMInfraServiceLIZ.LIZIZ(LJ(), "aweme_im_sticker_panel_scroll");
                    }
                }
            }
        } else {
            abstractC450910HmDLJIIJ = null;
        }
        this.LJIIL = abstractC450910HmDLJIIJ;
        Integer numLIZJ = C1308910kAL.LIZJ(this.LJIJ, LIZIZ().getContext());
        if (numLIZJ != null) {
            LIZIZ().setBackgroundColor(numLIZJ.intValue());
        }
        if (this.LJIILLIIL.LIZJ() == 5) {
            C786410Ut5.LJZI(0, LIZJ());
            C786410Ut5.Q7(LIZJ(), new ACListenerS141S0100000_6(this, 158));
            Drawable drawable = LIZJ().getDrawable();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            final Fragment fragmentLIZ = C946803n0.LIZ(this.LJIILJJIL);
            if (fragmentLIZ != null) {
                InterfaceC724530SbT interfaceC724530SbT = new InterfaceC724530SbT() { // from class: X.03H7
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

                    @Override // androidx.lifecycle.LifecycleOwner
                    public final Lifecycle getLifecycle() {
                        return fragmentLIZ.getLifecycle();
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
                };
                InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmojiPanelBottomPaddingVM.class);
                C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 594);
                AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(531);
                if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
                    assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(fragmentLIZ, true), new C338490DOt(fragmentLIZ, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZ, 1525), aFwS236S0000000_6, new C451460Hn6(fragmentLIZ, true), new C451620HnM(fragmentLIZ, true), new C987103tV(fragmentLIZ, true));
                } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                    assemVMLazy2 = C451650HnP.LIZ(fragmentLIZ, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragmentLIZ, c19719912DlLIZ), c5182020e, new AwS550S0100000_6(fragmentLIZ, 1526), aFwS236S0000000_6, null, null, null);
                } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                    assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZ, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ), C724750Sbp.LJIIIZ(fragmentLIZ), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZ, 1527), aFwS236S0000000_6, new C451460Hn6(fragmentLIZ, false), new C451620HnM(fragmentLIZ, false), new C987103tV(fragmentLIZ, false));
                } else {
                    throw new IllegalArgumentException("Do not support this scope here.");
                }
                this.LJJIFFI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(interfaceC724530SbT), null, null, new C450340HlI(assemVMLazy2, this, null), 3);
            }
        } else {
            C786410Ut5.LJZI(8, LIZJ());
            AnonymousClass0956 anonymousClass0956 = this.LJJIFFI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
        if (!z) {
            LJIIJJI();
        }
        final Fragment fragmentLIZ2 = C946803n0.LIZ(this.LJIILJJIL);
        if (fragmentLIZ2 == null) {
            return LIZIZ();
        }
        InterfaceC724530SbT interfaceC724530SbT2 = new InterfaceC724530SbT() { // from class: X.03HF
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

            @Override // androidx.lifecycle.LifecycleOwner
            public final Lifecycle getLifecycle() {
                return fragmentLIZ2.getLifecycle();
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
        };
        InterfaceC724760Sbq interfaceC724760Sbq2 = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(EmojiPanelBottomPaddingVM.class);
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(c19719912DlLIZ2, 1519);
        AFwS236S0000000_6 aFwS236S0000000_62 = AFwS236S0000000_6.get$arr$(530);
        if (Intrinsics.LJFF(interfaceC724760Sbq2, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZ2, c19719912DlLIZ2), awS550S0100000_6, new C452070Ho5(), new C1622206Wu(fragmentLIZ2, true), new C338490DOt(fragmentLIZ2, true), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZ2, 1520), aFwS236S0000000_62, new C451460Hn6(fragmentLIZ2, true), new C451620HnM(fragmentLIZ2, true), new C987103tV(fragmentLIZ2, true));
        } else if (interfaceC724760Sbq2 instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragmentLIZ2, (InterfaceC451590HnJ) interfaceC724760Sbq2, C724750Sbp.LJIIJ(fragmentLIZ2, c19719912DlLIZ2), awS550S0100000_6, new AwS550S0100000_6(fragmentLIZ2, 1521), aFwS236S0000000_62, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq2, interfaceC724760Sbq2)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragmentLIZ2, c19719912DlLIZ2), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(fragmentLIZ2), C724750Sbp.LJIIIZ(fragmentLIZ2), new AwS550S0100000_6((HasDefaultViewModelProviderFactory) fragmentLIZ2, 1522), aFwS236S0000000_62, new C451460Hn6(fragmentLIZ2, false), new C451620HnM(fragmentLIZ2, false), new C987103tV(fragmentLIZ2, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(interfaceC724530SbT2), null, null, new C450330HlH(assemVMLazy, this, null), 3);
        return LIZIZ();
    }

    public final void LJIILIIL(int i) {
        List<C451030HmP> data;
        AbstractC450910HmD<C451030HmP> abstractC450910HmD = this.LJIIL;
        if (abstractC450910HmD != null && (data = abstractC450910HmD.getData()) != null) {
            ListProtector.remove(data, i);
        }
        AbstractC450910HmD<C451030HmP> abstractC450910HmD2 = this.LJIIL;
        if (abstractC450910HmD2 != null) {
            abstractC450910HmD2.notifyItemRemoved(i);
        }
        HandlerHook.viewPost(LJ(), new ARunnableS106S0100000_6(this, 298));
    }

    public final void LJIILJJIL(List<? extends C451030HmP> list) {
        ArrayList arrayList;
        List<C451030HmP> data;
        AbstractC450030Hkn<List<StickerItem>> value;
        C450040Hko c450040Hko;
        List<C451030HmP> data2;
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        AbstractC450910HmD<C451030HmP> abstractC450910HmD = this.LJIIL;
        if (abstractC450910HmD != null) {
            abstractC450910HmD.setData(arrayList);
        }
        if (this.LJIILLIIL instanceof C443730Had) {
            C05YD<AbstractC450030Hkn<List<StickerItem>>> favouriteStickersFlow = LJIIIZ().getFavouriteStickersFlow();
            if (favouriteStickersFlow != null) {
                value = favouriteStickersFlow.getValue();
            } else {
                value = null;
            }
            if (value instanceof C450040Hko) {
                c450040Hko = (C450040Hko) value;
            } else {
                c450040Hko = null;
            }
            if (c450040Hko != null && c450040Hko.LIZIZ) {
                AbstractC450910HmD<C451030HmP> abstractC450910HmD2 = this.LJIIL;
                if (abstractC450910HmD2 != null) {
                    abstractC450910HmD2.setLoadMoreListener(this.LJJIII);
                }
            } else {
                AbstractC450910HmD<C451030HmP> abstractC450910HmD3 = this.LJIIL;
                if (abstractC450910HmD3 != null) {
                    abstractC450910HmD3.setLoadMoreListener((C0P6P) null);
                }
                AbstractC450910HmD<C451030HmP> abstractC450910HmD4 = this.LJIIL;
                if (abstractC450910HmD4 != null) {
                    abstractC450910HmD4.setShowFooter(false);
                }
            }
            AbstractC450910HmD<C451030HmP> abstractC450910HmD5 = this.LJIIL;
            if (abstractC450910HmD5 != null && (data2 = abstractC450910HmD5.getData()) != null) {
                LJIJ(data2);
                return;
            }
            return;
        }
        AbstractC450910HmD<C451030HmP> abstractC450910HmD6 = this.LJIIL;
        if (abstractC450910HmD6 == null || (data = abstractC450910HmD6.getData()) == null) {
            return;
        }
        LJIJ(data);
    }

    public final void LJIILL(AbstractC450030Hkn<?> abstractC450030Hkn) {
        if (abstractC450030Hkn instanceof C450060Hkq) {
            LJIILLIIL(EnumC450500HlY.LOADING);
        } else if (abstractC450030Hkn instanceof C450050Hkp) {
            LJIILLIIL(EnumC450500HlY.ERROR);
        } else {
            LJIILLIIL(EnumC450500HlY.NETWORK);
        }
    }

    public final void LJIILLIIL(EnumC450500HlY enumC450500HlY) {
        int i;
        if (enumC450500HlY == null) {
            i = -1;
        } else {
            i = C450490HlX.LIZ[enumC450500HlY.ordinal()];
        }
        if (i != -1 && i != 1) {
            if (i != 2) {
                C786410Ut5.LLLZZIL(LIZLLL(), 8);
                if (this.LJIILLIIL.LIZJ() == 7) {
                    if (this.LJIILLIIL.LIZ().size() == 1) {
                        Integer numLIZIZ = ((C451030HmP) ListProtector.get(this.LJIILLIIL.LIZ(), 0)).LIZIZ();
                        int type = EnumC451180Hme.ENTRANCE.getType();
                        if (numLIZIZ != null && numLIZIZ.intValue() == type) {
                            return;
                        }
                    }
                    if (this.LJIILLIIL.LIZ().isEmpty()) {
                        return;
                    }
                }
                C786410Ut5.LLLZLZ(LJFF(), 8);
                return;
            }
            C1749280vcc c1749280vccLJFF = LJFF();
            c1749280vccLJFF.setTopMargin(C418440Gaw.LIZIZ(64));
            C786410Ut5.wd((TuxTextView) c1749280vccLJFF.findViewById(R.id.message_tv), C418440Gaw.LIZIZ(-8));
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_refresh;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c1722300uv6.LIZJ = 0;
            c1722300uv6.LIZIZ = c419910GdJ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1722300uv6.LJIIIIZZ = LIZIZ().getContext().getString(2131848847);
            c1722300uv6.LJIIJ = new AwS585S0100000_6(this, 407);
            c1749280vccLJFF.setStatus(c1722300uv6);
            C786410Ut5.LLLZLZ(c1749280vccLJFF, 0);
            C786410Ut5.LLLZZIL(LIZLLL(), 8);
            return;
        }
        C786410Ut5.LLLZLZ(LJFF(), 8);
        C1390410mHn c1390410mHnLIZLLL = LIZLLL();
        c1390410mHnLIZLLL.LIZJ();
        C786410Ut5.LLLZZIL(c1390410mHnLIZLLL, 0);
    }

    public final void LJIIZILJ(InterfaceC444050Hb9 interfaceC444050Hb9) {
        this.LJIILLIIL = interfaceC444050Hb9;
        LJIIJJI();
    }

    public final void LJIJ(List<? extends C451030HmP> list) {
        if (this.LJIILLIIL.LIZJ() == 2 || this.LJIILLIIL.LIZJ() == 7 || this.LJIILLIIL.LIZJ() == 10 || this.LJIILLIIL.LIZJ() == 9) {
            this.LJJII.LJI(LJ(), this.LJIILL, list, Integer.valueOf(this.LJIILLIIL.LIZJ()), null);
            LJ().setPopHelper(this.LJJII);
        }
    }

    public C450470HlV(LifecycleOwner lifecycleOwner, ViewGroup viewGroup, C0H3N c0h3n, C443910Hav c443910Hav, C450880HmA c450880HmA, int i, InterfaceC450890HmB interfaceC450890HmB, LifecycleCoroutineScope lifecycleCoroutineScope, Integer num, Integer num2) {
        super(lifecycleOwner, viewGroup, c0h3n, c443910Hav, c450880HmA, i, interfaceC450890HmB);
        this.LJIILIIL = lifecycleOwner;
        this.LJIILJJIL = viewGroup;
        this.LJIILL = c0h3n;
        this.LJIILLIIL = c443910Hav;
        this.LJIIZILJ = c450880HmA;
        this.LJIJ = i;
        this.LJIJI = interfaceC450890HmB;
        this.LJIJJ = lifecycleCoroutineScope;
        this.LJIJJLI = null;
        this.LJIL = num;
        this.LJJ = num2;
        this.LJJI = (Space) LIZIZ().findViewById(R.id.fkl);
        int i2 = 6;
        this.LJJII = new C450530Hlb(i2, new C450460HlU(this), (Function2) null);
        this.LJJIII = new AwS550S0100000_6(this, 1528);
    }
}
