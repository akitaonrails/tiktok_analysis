package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.vibefeed.experiment.SocialVibeFeedConfigSetting;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.IVibeFeedEntranceViewModel;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS673S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0r6S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575580r6S extends C0N7Z implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final Lifecycle LLILLL;
    public final C01GW LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public C0ZP4 LLJ;
    public C0ZP4 LLJI;
    public C0ZP4 LLJIJIL;
    public C0ZP4 LLJILJIL;
    public EnumC1575470r6H LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1575580r6S.class, "consumeVM", "getConsumeVM()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedConsumeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    @Override // X.C0N7Z, X.C0SZ8
    public final void unBind() {
        this.LLJJ = false;
        this.LLJILJILJ = EnumC1575470r6H.LOCKED;
        C0ZP4 c0zp4 = this.LLJI;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        C0ZP4 c0zp42 = this.LLJIJIL;
        if (c0zp42 != null) {
            c0zp42.dispose();
        }
        C0ZP4 c0zp43 = this.LLJ;
        if (c0zp43 != null) {
            c0zp43.dispose();
        }
        C0ZP4 c0zp44 = this.LLJILJIL;
        if (c0zp44 != null) {
            c0zp44.dispose();
        }
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJ = null;
        this.LLJI = null;
        C1575450r6F c1575450r6FLIZJ = LIZJ();
        c1575450r6FLIZJ.LJI = false;
        c1575450r6FLIZJ.LJII = 0;
        C11JF c11jf = c1575450r6FLIZJ.LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        DialogC1389620mGW dialogC1389620mGW = c1575450r6FLIZJ.LJIIJ;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        c1575450r6FLIZJ.LJIIJ = null;
    }

    public final VibeFeedConsumeViewModel LIZ() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (VibeFeedConsumeViewModel) assemVMLazy.getValue();
    }

    public final EnumC912680ZrG LIZIZ() {
        return (EnumC912680ZrG) this.LLILZLL.getValue();
    }

    public final C1575450r6F LIZJ() {
        return (C1575450r6F) this.LLIZLLLIL.getValue();
    }

    public final JSONObject LIZLLL() {
        return (JSONObject) this.LLILZ.getValue();
    }

    public final void LJII() {
        String strOptString;
        C1575290r5z c1575290r5z = C1575290r5z.LIZ;
        JSONObject jSONObjectLIZLLL = LIZLLL();
        String strOptString2 = jSONObjectLIZLLL != null ? jSONObjectLIZLLL.optString("conversation_id") : null;
        String str = "";
        if (strOptString2 == null) {
            strOptString2 = "";
        }
        JSONObject jSONObjectLIZLLL2 = LIZLLL();
        if (jSONObjectLIZLLL2 != null && (strOptString = jSONObjectLIZLLL2.optString("enter_type")) != null) {
            str = strOptString;
        }
        EnumC1575470r6H enumC1575470r6H = this.LLJILJILJ;
        EnumC912680ZrG enumC912680ZrGLIZIZ = LIZIZ();
        int iYQ2 = LIZ().yQ2();
        c1575290r5z.getClass();
        C1575290r5z.LJ(false, "send_reminder", strOptString2, str, enumC1575470r6H, enumC912680ZrGLIZIZ, iYQ2);
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        IDetailBaseAbility iDetailBaseAbility = (IDetailBaseAbility) (interfaceC494301wDLIZ instanceof IDetailPageAbility ? interfaceC494301wDLIZ : null);
        if (iDetailBaseAbility != null) {
            iDetailBaseAbility.yF(-1, "send_reminder");
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1575580r6S(C0RF0 c0rf0) {
        AssemVMLazy assemVMLazy;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        super(c0rf0);
        this.LLILLL = c0rf0.LIZJ.getLifecycle();
        this.LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1692));
        Fragment fragment = c0rf0.LIZJ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedConsumeViewModel.class);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1687);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(593);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) fragment, 1688), aFwS264S0000000_24, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24(fragment, 1689), aFwS264S0000000_24, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) fragment, 1690), aFwS264S0000000_24, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILZIL = assemVMLazy;
        C13LE.LIZ(IVibeFeedEntranceViewModel.class);
        AFwS264S0000000_24.get$arr$(594);
        new C452070Ho5();
        C724750Sbp.LJII(this);
        if (this instanceof HasDefaultViewModelProviderFactory) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        C1220000hqw.LIZ(hasDefaultViewModelProviderFactory);
        this.LLILZLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1685));
        this.LLIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1686));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1691));
        this.LLJILJILJ = EnumC1575470r6H.LOCKED;
    }

    public final void LJ(EnumC1575470r6H enumC1575470r6H) {
        int i = C1575490r6J.LIZ[enumC1575470r6H.ordinal()];
        if (i != 1) {
            if (i != 2) {
                C786410Ut5.LJLZ(0, (ViewGroup) this.LL.LIZ.findViewById(R.id.wov));
                C786410Ut5.LJLZ(8, (ViewGroup) this.LL.LIZ.findViewById(R.id.wp9));
                return;
            }
            C786410Ut5.LJLZ(8, (ViewGroup) this.LL.LIZ.findViewById(R.id.wov));
            C786410Ut5.LJLZ(0, (ViewGroup) this.LL.LIZ.findViewById(R.id.wp9));
            C786410Ut5.LJLZ(8, (ViewGroup) this.LL.LIZ.findViewById(R.id.i6o));
            C629160Om2.LIZ.getClass();
            if (C629160Om2.LIZ()) {
                return;
            }
            C786410Ut5.LJLZ(0, (ViewGroup) this.LL.LIZ.findViewById(R.id.ng2));
            return;
        }
        C786410Ut5.LJLZ(8, (ViewGroup) this.LL.LIZ.findViewById(R.id.wov));
        C786410Ut5.LJLZ(0, (ViewGroup) this.LL.LIZ.findViewById(R.id.wp9));
        C786410Ut5.LJLZ(0, (ViewGroup) this.LL.LIZ.findViewById(R.id.i6o));
        C786410Ut5.LJLZ(8, (ViewGroup) this.LL.LIZ.findViewById(R.id.ng2));
    }

    @Override // X.C0SZ8
    public final void LJI(Aweme aweme) {
        this.LLILLJJLI = aweme;
        ViewGroup viewGroup = (ViewGroup) this.LL.LIZ.findViewById(R.id.wp4);
        C1575530r6N.LIZ.getClass();
        C1331670kl3 c1331670kl3LJFF = C1575440r6E.LJFF(C1575530r6N.LIZJ(), SocialVibeFeedConfigSetting.LIZ().invitePanelPageBackgroundUrl);
        c1331670kl3LJFF.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJFF.LJJII(new C1620620sH6(viewGroup, 0));
        if (LIZIZ().isGroup()) {
            C736680Sv4.LJIIIIZZ(this, LIZ(), new C2217381BqS() { // from class: X.0P3W
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0P3X) obj).LLJILJIL;
                }
            }, null, new AwS623S0100000_9(this, 177), 6);
        } else {
            LIZ().DQ2(C13BV.INSTANCE);
        }
        this.LLJ = C736680Sv4.LJIIIZ(this, LIZ(), new C2217381BqS() { // from class: X.0r6T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0P3X) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.0P3j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0P3X) obj).LLJI;
            }
        }, null, new AwS673S0100000_24(this, 7), 12);
    }

    @Override // X.C0SZ8
    public final void LJJIJIIJIL(int i) {
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup;
        String strOptString;
        String strOptString2;
        this.LLJILJIL = C736680Sv4.LJIIIIZZ(this, LIZ(), new C2217381BqS() { // from class: X.0r6U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0P3X) obj).LLIZLLLIL;
            }
        }, null, new AwS623S0100000_9(this, 178), 6);
        this.LLJILLL = true;
        InterfaceC494301wD interfaceC494301wD = null;
        if (this.LLJJ) {
            C1575290r5z c1575290r5z = C1575290r5z.LIZ;
            JSONObject jSONObjectLIZLLL = LIZLLL();
            if (jSONObjectLIZLLL != null) {
                strOptString = jSONObjectLIZLLL.optString("conversation_id");
            } else {
                strOptString = null;
            }
            String str = "";
            if (strOptString == null) {
                strOptString = "";
            }
            JSONObject jSONObjectLIZLLL2 = LIZLLL();
            if (jSONObjectLIZLLL2 != null && (strOptString2 = jSONObjectLIZLLL2.optString("enter_type")) != null) {
                str = strOptString2;
            }
            EnumC1575470r6H enumC1575470r6H = this.LLJILJILJ;
            EnumC912680ZrG enumC912680ZrGLIZIZ = LIZIZ();
            int iYQ2 = LIZ().yQ2();
            c1575290r5z.getClass();
            C1575290r5z.LJ(true, null, strOptString, str, enumC1575470r6H, enumC912680ZrGLIZIZ, iYQ2);
        }
        LIZJ().LJI = true;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        if (interfaceC494301wDLIZ instanceof IDetailPageAbility) {
            interfaceC494301wD = interfaceC494301wDLIZ;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wD;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null && (viewGroup = detailPageComponentDn1.LLLII) != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup);
        }
    }

    @Override // X.C0N7Z, X.C0SZ8
    public final void LLLI(int i) {
        VibeFeedConsumeViewModel vibeFeedConsumeViewModelLIZ = LIZ();
        C23250099c.LIZLLL(vibeFeedConsumeViewModelLIZ.getAssemVMScope(), null, null, new C05DV(vibeFeedConsumeViewModelLIZ, null), 3);
    }

    @Override // X.C0SZ8
    public final void h(boolean z) {
        DetailPageComponent detailPageComponentDn1;
        ViewGroup viewGroup;
        LIZJ().LJI = false;
        this.LLJILLL = false;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(this.LL.LIZJ, null), IFeedFragmentAbility.class, null);
        if (interfaceC494301wDLIZ instanceof IDetailPageAbility) {
            interfaceC494301wD = interfaceC494301wDLIZ;
        }
        IDetailPageAbility iDetailPageAbility = (IDetailPageAbility) interfaceC494301wD;
        if (iDetailPageAbility != null && (detailPageComponentDn1 = iDetailPageAbility.Dn1()) != null && (viewGroup = detailPageComponentDn1.LLLII) != null) {
            C786410Ut5.LJLLLLLL(0, viewGroup);
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
