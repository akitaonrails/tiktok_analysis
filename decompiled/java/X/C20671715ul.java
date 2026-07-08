package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.BottomSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftAvatarAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.LeftSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.MiddleSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.RightSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.TopSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.assem.external.DMSparkBadgeAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushBottomVM;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushLeftVM;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushMiddleVM;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushRightVM;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushTopVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20671715ul extends C214906198m implements LifecycleOwner, InterfaceC20672915ux, InterfaceC20663615tS, InterfaceC1591906Ld, ViewModelStoreOwner {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final C19EG LL;
    public final InnerPushMessage LLILLJJLI;
    public final LifecycleRegistry LLILLL;
    public final LifecycleRegistry LLILZ;
    public final C19EG LLILZIL;
    public final boolean LLILZLL;
    public final InterfaceC665370Q7z LLIZ;
    public final C20671715ul LLIZLLLIL;
    public final ViewModelStore LLJ;
    public C21647019ng LLJI;
    public Function0<Unit> LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final InterfaceC20672015uo LLJJJJ;
    public final C01GW LLJJJJJIL;
    public AssemSupervisor LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C20671715ul.class, "leftVM", "getLeftVM()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushLeftVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C20671715ul.class, "middleVM", "getMiddleVM()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushMiddleVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C20671715ul.class, "rightVM", "getRightVM()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushRightVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C20671715ul.class, "topVM", "getTopVM()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushTopVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C20671715ul.class, "bottomVM", "getBottomVM()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushBottomVM;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.InterfaceC20663615tS
    public final /* bridge */ /* synthetic */ C20665215ti LJIILLIIL() {
        return null;
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return null;
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

    public final AssemSupervisor LJJIJIL() {
        AssemSupervisor assemSupervisor = this.LLJJJJLIIL;
        if (assemSupervisor != null) {
            return assemSupervisor;
        }
        C19290510dT.LIZLLL("[supervisor]", "initialize");
        AssemSupervisor assemSupervisorLJFF = C724240Sb0.LJFF(this);
        this.LLJJJJLIIL = assemSupervisorLJFF;
        return assemSupervisorLJFF;
    }

    public final void LJJIJLIJ() {
        int childCount = ((ViewGroup) this.LLJJJIL.getValue()).getChildCount();
        if (childCount <= 3) {
            return;
        }
        C786410Ut5.LJJZZI((LinearLayout) this.LLJJJIL.getValue(), 3, childCount - 3);
    }

    @Override // X.InterfaceC20663615tS
    public final int getMessageType() {
        return this.LLILLJJLI.getType();
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return getContentView();
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        C20664415ta c20664415ta;
        View contentView = getContentView();
        if (!(contentView instanceof C20664415ta) || (c20664415ta = (C20664415ta) contentView) == null) {
            super.dismiss();
        } else {
            c20664415ta.LIZIZ(new AwS575S0100000_31(this, 1389));
        }
    }

    @Override // X.InterfaceC719640SKs
    public final /* bridge */ /* synthetic */ LifecycleOwner E82() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC713360RyY
    public final /* bridge */ /* synthetic */ ViewModelStoreOwner LLIIIILZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20663615tS
    public final InnerPushMessage getMsg() {
        return this.LLILLJJLI;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLJ;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20663615tS
    public final void LJII(InnerPushMessage innerPushMessage) {
        C20644215qK.LIZ(innerPushMessage);
    }

    public final void LJJIJIIJI(boolean z) {
        int i;
        int i2;
        FrameLayout frameLayout = (FrameLayout) this.LLJJIII.getValue();
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZ(i, frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.LLJJIJI.getValue();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJZ(i2, frameLayout2);
        FrameLayout frameLayout3 = (FrameLayout) this.LLJJIJIIJIL.getValue();
        if (!z) {
            i3 = 8;
        }
        C786410Ut5.LJZ(i3, frameLayout3);
    }

    public final ViewGroup LJJIJIIJIL(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return (ViewGroup) this.LLJJJ.getValue();
                    }
                    return (ViewGroup) this.LLJJIJIL.getValue();
                }
                return (ViewGroup) this.LLJJIJIIJIL.getValue();
            }
            return (ViewGroup) this.LLJJIJI.getValue();
        }
        return (ViewGroup) this.LLJJIII.getValue();
    }

    public final void LJJIZ(Lifecycle.State state) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new AnonymousClass0636(this, state, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.15tg, X.15ul, X.15ux, android.widget.PopupWindow, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9, types: [X.15uo, android.view.View] */
    public C20671715ul(C19EG c19eg, InnerPushMessage innerPushMessage) {
        AssemVMLazy assemVMLazy;
        Function0 awS575S0100000_31;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        Function0 awS575S0100000_312;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory2;
        AssemVMLazy assemVMLazy2;
        Function0 awS575S0100000_313;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory3;
        Function0 awS575S0100000_314;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory4;
        AssemVMLazy assemVMLazy3;
        Function0 awS575S0100000_315;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory5;
        Function0 awS575S0100000_316;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory6;
        AssemVMLazy assemVMLazy4;
        Function0 awS575S0100000_317;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory7;
        Function0 awS575S0100000_318;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory8;
        AssemVMLazy assemVMLazy5;
        Function0 awS575S0100000_319;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory9;
        Function0 awS575S0100000_3110;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory10;
        ?? c20664615tc;
        Integer numValueOf;
        Function0 awS575S0100000_3111;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory11;
        Function0 awS575S0100000_3112;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory12;
        Function0 awS575S0100000_3113;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory13;
        Function0 awS575S0100000_3114;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory14;
        Function0 awS575S0100000_3115;
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory15;
        this.LL = c19eg;
        this.LLILLJJLI = innerPushMessage;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.LLILLL = lifecycleRegistry;
        this.LLILZ = lifecycleRegistry;
        this.LLILZIL = c19eg;
        this.LLILZLL = true;
        this.LLIZ = C1558360qeg.LJI(this.LL, null);
        this.LLIZLLLIL = this;
        this.LLJ = new ViewModelStore();
        lifecycleRegistry.getCurrentState();
        InterfaceC724760Sbq interfaceC724760Sbq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushLeftVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 1056);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(286);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            AwS575S0100000_31 awS575S0100000_3116 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1421);
            AwS575S0100000_31 awS575S0100000_3117 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1386);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory15 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_3115 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory15, 1412);
            } else {
                awS575S0100000_3115 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, c452070Ho5, awS575S0100000_3116, awS575S0100000_3117, awS575S0100000_3115, aFwS276S0000000_31, new AwS575S0100000_31((InterfaceC20672915ux) this, 1429), new AwS575S0100000_31((InterfaceC20672915ux) this, 1432), new AwS575S0100000_31((InterfaceC20672915ux) this, 1434));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory2 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_312 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory2, 1437);
            } else {
                awS575S0100000_312 = C1143000fqk.LIZ;
            }
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, awS575S0100000_312, aFwS276S0000000_31, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            C452070Ho5 c452070Ho52 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ = C724750Sbp.LJIIIZ(this);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_31 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory, 1407);
            } else {
                awS575S0100000_31 = C1143000fqk.LIZ;
            }
            assemVMLazy = new AssemVMLazy(function0LJIIJ, awS546S0100000_2, c452070Ho52, c1622206WuLJII, c338490DOtLJIIIZ, awS575S0100000_31, aFwS276S0000000_31, new AwS575S0100000_31((InterfaceC20672915ux) this, 1410), new AwS575S0100000_31((InterfaceC20672915ux) this, 1413), new AwS575S0100000_31((InterfaceC20672915ux) this, 1416));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJILJIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InnerPushMiddleVM.class);
        AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(c19719912DlLIZ2, 1054);
        AFwS276S0000000_31 aFwS276S0000000_312 = AFwS276S0000000_31.get$arr$(288);
        Function0 function0LJIIJ2 = C724750Sbp.LJIIJ(this, c19719912DlLIZ2);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            C452070Ho5 c452070Ho53 = new C452070Ho5();
            AwS575S0100000_31 awS575S0100000_3118 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1423);
            AwS575S0100000_31 awS575S0100000_3119 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1425);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory14 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_3114 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory14, 1427);
            } else {
                awS575S0100000_3114 = C1143000fqk.LIZ;
            }
            assemVMLazy2 = new AssemVMLazy(function0LJIIJ2, awS546S0100000_22, c452070Ho53, awS575S0100000_3118, awS575S0100000_3119, awS575S0100000_3114, aFwS276S0000000_312, new AwS575S0100000_31((InterfaceC20672915ux) this, 1430), new AwS575S0100000_31((InterfaceC20672915ux) this, 1435), new AwS575S0100000_31((InterfaceC20672915ux) this, 1438));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory4 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_314 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory4, 1441);
            } else {
                awS575S0100000_314 = C1143000fqk.LIZ;
            }
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS546S0100000_22, awS575S0100000_314, aFwS276S0000000_312, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            C452070Ho5 c452070Ho54 = new C452070Ho5();
            C1622206Wu c1622206WuLJII2 = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ2 = C724750Sbp.LJIIIZ(this);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory3 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_313 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory3, 1443);
            } else {
                awS575S0100000_313 = C1143000fqk.LIZ;
            }
            assemVMLazy2 = new AssemVMLazy(function0LJIIJ2, awS546S0100000_22, c452070Ho54, c1622206WuLJII2, c338490DOtLJIIIZ2, awS575S0100000_313, aFwS276S0000000_312, new AwS575S0100000_31((InterfaceC20672915ux) this, 1381), new AwS575S0100000_31((InterfaceC20672915ux) this, 1383), new AwS575S0100000_31((InterfaceC20672915ux) this, 1385));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJILJILJ = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(InnerPushRightVM.class);
        AwS546S0100000_2 awS546S0100000_23 = new AwS546S0100000_2(c19719912DlLIZ3, 1052);
        AFwS276S0000000_31 aFwS276S0000000_313 = AFwS276S0000000_31.get$arr$(285);
        Function0 function0LJIIJ3 = C724750Sbp.LJIIJ(this, c19719912DlLIZ3);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            C452070Ho5 c452070Ho55 = new C452070Ho5();
            AwS575S0100000_31 awS575S0100000_3120 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1392);
            AwS575S0100000_31 awS575S0100000_3121 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1395);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory13 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_3113 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory13, 1397);
            } else {
                awS575S0100000_3113 = C1143000fqk.LIZ;
            }
            assemVMLazy3 = new AssemVMLazy(function0LJIIJ3, awS546S0100000_23, c452070Ho55, awS575S0100000_3120, awS575S0100000_3121, awS575S0100000_3113, aFwS276S0000000_313, new AwS575S0100000_31((InterfaceC20672915ux) this, 1400), new AwS575S0100000_31((InterfaceC20672915ux) this, 1403), new AwS575S0100000_31((InterfaceC20672915ux) this, 1405));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory6 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_316 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory6, 1408);
            } else {
                awS575S0100000_316 = C1143000fqk.LIZ;
            }
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS546S0100000_23, awS575S0100000_316, aFwS276S0000000_313, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            C452070Ho5 c452070Ho56 = new C452070Ho5();
            C1622206Wu c1622206WuLJII3 = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ3 = C724750Sbp.LJIIIZ(this);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory5 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_315 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory5, 1411);
            } else {
                awS575S0100000_315 = C1143000fqk.LIZ;
            }
            assemVMLazy3 = new AssemVMLazy(function0LJIIJ3, awS546S0100000_23, c452070Ho56, c1622206WuLJII3, c338490DOtLJIIIZ3, awS575S0100000_315, aFwS276S0000000_313, new AwS575S0100000_31((InterfaceC20672915ux) this, 1414), new AwS575S0100000_31((InterfaceC20672915ux) this, 1417), new AwS575S0100000_31((InterfaceC20672915ux) this, 1419));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJILLL = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(InnerPushTopVM.class);
        AwS546S0100000_2 awS546S0100000_24 = new AwS546S0100000_2(c19719912DlLIZ4, 1055);
        AFwS276S0000000_31 aFwS276S0000000_314 = AFwS276S0000000_31.get$arr$(289);
        Function0 function0LJIIJ4 = C724750Sbp.LJIIJ(this, c19719912DlLIZ4);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            C452070Ho5 c452070Ho57 = new C452070Ho5();
            AwS575S0100000_31 awS575S0100000_3122 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1428);
            AwS575S0100000_31 awS575S0100000_3123 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1431);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory12 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_3112 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory12, 1433);
            } else {
                awS575S0100000_3112 = C1143000fqk.LIZ;
            }
            assemVMLazy4 = new AssemVMLazy(function0LJIIJ4, awS546S0100000_24, c452070Ho57, awS575S0100000_3122, awS575S0100000_3123, awS575S0100000_3112, aFwS276S0000000_314, new AwS575S0100000_31((InterfaceC20672915ux) this, 1436), new AwS575S0100000_31((InterfaceC20672915ux) this, 1439), new AwS575S0100000_31((InterfaceC20672915ux) this, 1442));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory8 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_318 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory8, 1382);
            } else {
                awS575S0100000_318 = C1143000fqk.LIZ;
            }
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS546S0100000_24, awS575S0100000_318, aFwS276S0000000_314, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            C452070Ho5 c452070Ho58 = new C452070Ho5();
            C1622206Wu c1622206WuLJII4 = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ4 = C724750Sbp.LJIIIZ(this);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory7 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_317 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory7, 1384);
            } else {
                awS575S0100000_317 = C1143000fqk.LIZ;
            }
            assemVMLazy4 = new AssemVMLazy(function0LJIIJ4, awS546S0100000_24, c452070Ho58, c1622206WuLJII4, c338490DOtLJIIIZ4, awS575S0100000_317, aFwS276S0000000_314, new AwS575S0100000_31((InterfaceC20672915ux) this, 1388), new AwS575S0100000_31((InterfaceC20672915ux) this, 1390), new AwS575S0100000_31((InterfaceC20672915ux) this, 1393));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJJ = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(InnerPushBottomVM.class);
        AwS546S0100000_2 awS546S0100000_25 = new AwS546S0100000_2(c19719912DlLIZ5, 1053);
        AFwS276S0000000_31 aFwS276S0000000_315 = AFwS276S0000000_31.get$arr$(287);
        Function0 function0LJIIJ5 = C724750Sbp.LJIIJ(this, c19719912DlLIZ5);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            C452070Ho5 c452070Ho59 = new C452070Ho5();
            AwS575S0100000_31 awS575S0100000_3124 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1398);
            AwS575S0100000_31 awS575S0100000_3125 = new AwS575S0100000_31((InterfaceC20672915ux) this, 1401);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory11 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_3111 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory11, 1404);
            } else {
                awS575S0100000_3111 = C1143000fqk.LIZ;
            }
            assemVMLazy5 = new AssemVMLazy(function0LJIIJ5, awS546S0100000_25, c452070Ho59, awS575S0100000_3124, awS575S0100000_3125, awS575S0100000_3111, aFwS276S0000000_315, new AwS575S0100000_31((InterfaceC20672915ux) this, 1406), new AwS575S0100000_31((InterfaceC20672915ux) this, 1409), new AwS575S0100000_31((InterfaceC20672915ux) this, 1415));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory10 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_3110 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory10, 1418);
            } else {
                awS575S0100000_3110 = C1143000fqk.LIZ;
            }
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS546S0100000_25, awS575S0100000_3110, aFwS276S0000000_315, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            C452070Ho5 c452070Ho510 = new C452070Ho5();
            C1622206Wu c1622206WuLJII5 = C724750Sbp.LJII(this);
            C338490DOt c338490DOtLJIIIZ5 = C724750Sbp.LJIIIZ(this);
            if ((this instanceof HasDefaultViewModelProviderFactory) && (hasDefaultViewModelProviderFactory9 = (HasDefaultViewModelProviderFactory) this) != null) {
                awS575S0100000_319 = new AwS575S0100000_31(hasDefaultViewModelProviderFactory9, 1420);
            } else {
                awS575S0100000_319 = C1143000fqk.LIZ;
            }
            assemVMLazy5 = new AssemVMLazy(function0LJIIJ5, awS546S0100000_25, c452070Ho510, c1622206WuLJII5, c338490DOtLJIIIZ5, awS575S0100000_319, aFwS276S0000000_315, new AwS575S0100000_31((InterfaceC20672915ux) this, 1422), new AwS575S0100000_31((InterfaceC20672915ux) this, 1424), new AwS575S0100000_31((InterfaceC20672915ux) this, 1426));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLJJI = assemVMLazy5;
        this.LLJJIII = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1391));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1394));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1399));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1440));
        this.LLJJJ = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1387));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1402));
        InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
        if (uiTemplate != null && (numValueOf = Integer.valueOf(uiTemplate.pullUpLayoutType)) != null && numValueOf.intValue() == 1) {
            c20664615tc = new C20664415ta(c19eg);
        } else {
            c20664615tc = new C20664615tc(c19eg);
        }
        c20664615tc.setInnerPushNotifier(this);
        this.LLJJJJ = c20664615tc;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31((C20671715ul) this, 1396));
        LJJIZ(Lifecycle.State.INITIALIZED);
        C844470XAv.LIZ.getClass();
        setWidth(C12ES.LJIIJ(C844470XAv.LIZ()));
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(c20664615tc);
        LJJIZ(Lifecycle.State.CREATED);
    }

    @Override // X.InterfaceC20665015tg
    public final void LJIJI(String str, boolean z) {
        InnerPushUITemplate uiTemplate;
        if (!isShowing()) {
            return;
        }
        InnerPushUITemplate uiTemplate2 = this.LLILLJJLI.getUiTemplate();
        if ((uiTemplate2 == null || uiTemplate2.pullUpLayoutType != 1 || !C20731216Ak.LIZ()) && (((uiTemplate = this.LLILLJJLI.getUiTemplate()) != null && uiTemplate.pullUpLayoutType == 1) || !C20731216Ak.LIZIZ())) {
            dismiss();
            C20663715tT.LIZ.LJFF(this.LLILLJJLI, z, str);
            LJJIZ(Lifecycle.State.DESTROYED);
            return;
        }
        C0PH3.LIZ(C0PH3.LIZ, "InnerPushPopupWindow_Exit", this.LL, getContentView(), 0.0f, C418440Gaw.LIZIZ(Integer.valueOf((-getContentView().getMeasuredHeight()) - C497820Jfg.LIZJ(this.LL))), new C20664915tf(this, z, str), 32).LJI(true);
    }

    @Override // X.InterfaceC20663615tS
    public final void LJJIII(C20665215ti c20665215ti, InnerPushMessage innerPushMessage) {
        long j;
        C21647019ng c21647019ng;
        C20664415ta c20664415ta;
        ((ConcurrentHashMap) C1276704z7.LIZ.getValue()).put(new Pair(C13LE.LIZ(DMSparkBadgeAssem.class), 7), AFwS248S0000000_14.get$arr$(429));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[show], uiTemplate = ");
        sbLIZ.append(innerPushMessage.getUiTemplate());
        C19290510dT.LIZLLL("InnerPushAssemWindow", C2188811AlT.LIZIZ(sbLIZ));
        C723850SaN.LJ(this, new AwS397S0200000_31(this, innerPushMessage, 93));
        InterfaceC20672015uo interfaceC20672015uo = this.LLJJJJ;
        InnerPushConfig config = this.LLILLJJLI.getConfig();
        if (config != null) {
            j = ((long) config.popupDurationSeconds) * 1000;
        } else {
            j = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        interfaceC20672015uo.setShowDuration(j);
        this.LLJJJJ.setMessage(this.LLILLJJLI);
        InterfaceC20672015uo interfaceC20672015uo2 = this.LLJJJJ;
        Integer numValueOf = null;
        if ((interfaceC20672015uo2 instanceof C20664415ta) && (c20664415ta = (C20664415ta) interfaceC20672015uo2) != null) {
            c20664415ta.LIZ(getContentView().findViewById(R.id.koo));
        }
        this.LLJJJJ.onShow();
        InnerPushUITemplate uiTemplate = this.LLILLJJLI.getUiTemplate();
        if (uiTemplate != null) {
            this.LLJJJJ.setInnerPushLayoutRadius(uiTemplate.globalRadius);
        }
        C20644215qK.LIZ(this.LLILLJJLI);
        InnerPushUITemplate uiTemplate2 = this.LLILLJJLI.getUiTemplate();
        if (uiTemplate2 != null) {
            numValueOf = Integer.valueOf(uiTemplate2.pullUpLayoutType);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (C20731216Ak.LIZ()) {
                int i = -getContentView().getMeasuredHeight();
                this.LLJI = C0PH3.LIZ(C0PH3.LIZ, "InnerPushPopupWindow_Enter", this.LL, getContentView(), C418440Gaw.LIZIZ(Integer.valueOf(i - C497820Jfg.LIZJ(this.LL))), 0.0f, null, 96);
                C786410Ut5.ed(getContentView(), C418440Gaw.LIZIZ(Integer.valueOf(i - C497820Jfg.LIZJ(this.LL))));
            } else {
                setAnimationStyle(-1);
            }
            setClippingEnabled(false);
            getContentView().setPadding(0, C497820Jfg.LIZJ(this.LL), 0, 0);
            showAtLocation(this.LL.getWindow().getDecorView(), 8388659, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
        } else {
            if (C20731216Ak.LIZIZ()) {
                int i2 = -getContentView().getMeasuredHeight();
                this.LLJI = C0PH3.LIZ(C0PH3.LIZ, "InnerPushPopupWindow_Enter", this.LL, getContentView(), C418440Gaw.LIZIZ(Integer.valueOf(i2 - C497820Jfg.LIZJ(this.LL))), 0.0f, null, 96);
                C786410Ut5.ed(getContentView(), C418440Gaw.LIZIZ(Integer.valueOf(i2 - C497820Jfg.LIZJ(this.LL))));
            } else {
                setAnimationStyle(R.style.jh);
            }
            setClippingEnabled(false);
            View contentView = getContentView();
            if (contentView != null) {
                contentView.setPadding(0, C497820Jfg.LIZJ(this.LL), 0, 0);
            }
            showAtLocation(this.LL.getWindow().getDecorView(), 8388659, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showAtLocation translationY:");
            sbLIZ2.append(getContentView().getTranslationY());
            sbLIZ2.append(" -76:");
            sbLIZ2.append(C418440Gaw.LIZIZ(-76));
            C19290510dT.LIZ("InnerPushAssemWindow", C2188811AlT.LIZIZ(sbLIZ2));
            if (C20731216Ak.LIZIZ() && (c21647019ng = this.LLJI) != null) {
                c21647019ng.LJI(true);
            }
        }
        LJJIZ(Lifecycle.State.RESUMED);
    }

    @Override // X.InterfaceC1591906Ld
    public final void LJIJJLI(View view, int i, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        String str;
        InnerPushUITemplate uiTemplate2;
        if (C0OBG.LIZIZ(view) && (uiTemplate2 = innerPushMessage.getUiTemplate()) != null && uiTemplate2.isNeedDoubleClickCheck()) {
            return;
        }
        String str2 = null;
        switch (i) {
            case 1:
            case 6:
                InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
                if (uiTemplate3 != null) {
                    str2 = uiTemplate3.avatarSchema;
                }
                break;
            case 2:
            case 7:
                InnerPushUITemplate uiTemplate4 = innerPushMessage.getUiTemplate();
                if (uiTemplate4 != null) {
                    str2 = uiTemplate4.middleSchemaUrl;
                }
                break;
            case 3:
                InnerPushUITemplate uiTemplate5 = innerPushMessage.getUiTemplate();
                if (uiTemplate5 != null) {
                    str2 = uiTemplate5.rightSchemaUrl;
                }
                break;
            case 4:
                InnerPushUITemplate uiTemplate6 = innerPushMessage.getUiTemplate();
                if (uiTemplate6 != null) {
                    str2 = uiTemplate6.topSchemaUrl;
                }
                break;
            case 5:
                InnerPushUITemplate uiTemplate7 = innerPushMessage.getUiTemplate();
                if (uiTemplate7 != null) {
                    str2 = uiTemplate7.bottomSchemaUrl;
                }
                break;
            default:
                InnerPushUITemplate uiTemplate8 = innerPushMessage.getUiTemplate();
                if (uiTemplate8 != null) {
                    str2 = uiTemplate8.globalSchemaUrl;
                }
                break;
        }
        int i2 = C20642815q6.LIZ;
        C20642815q6.LIZIZ(innerPushMessage.getType(), innerPushMessage, i);
        InterfaceC19330810jy interfaceC19330810jyLIZ = C20641815pw.LIZ(innerPushMessage.getType());
        if ((interfaceC19330810jyLIZ != null && interfaceC19330810jyLIZ.LIZ(i, innerPushMessage)) || C20663315tP.LIZ(i, innerPushMessage)) {
            return;
        }
        if (str2 != null && str2.length() != 0) {
            C10M5 c10m5 = C10M5.LIZ;
            C19EG c19eg = this.LL;
            c10m5.getClass();
            C10M5.LIZ(str2, c19eg, this, i, innerPushMessage);
            return;
        }
        InterfaceC19330810jy interfaceC19330810jyLIZ2 = C20641815pw.LIZ(innerPushMessage.getType());
        if ((interfaceC19330810jyLIZ2 == null || !interfaceC19330810jyLIZ2.LIZ(0, innerPushMessage)) && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (str = uiTemplate.globalSchemaUrl) != null && str.length() != 0) {
            C10M5 c10m52 = C10M5.LIZ;
            C19EG c19eg2 = this.LL;
            c10m52.getClass();
            C10M5.LIZ(str, c19eg2, this, i, innerPushMessage);
        }
    }

    public final void LJJIJ(Assembler assembler, int i, InnerPushUITemplate innerPushUITemplate) {
        Class cls;
        switch (i) {
            case 1:
                cls = LeftSlotAssem.class;
                break;
            case 2:
                cls = MiddleSlotAssem.class;
                break;
            case 3:
                cls = RightSlotAssem.class;
                break;
            case 4:
                cls = TopSlotAssem.class;
                break;
            case 5:
                cls = BottomSlotAssem.class;
                break;
            case 6:
                cls = LeftAvatarAssem.class;
                break;
            default:
                return;
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(cls);
        if (c19719912DlLIZ == null) {
            return;
        }
        LJJJI(i, innerPushUITemplate, false);
        if (i != 4) {
            if (i == 5) {
                C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts] invalid bottom type, skip");
                if (innerPushUITemplate != null && innerPushUITemplate.bottomType == 0) {
                    C786410Ut5.LJZ(8, (FrameLayout) this.LLJJJ.getValue());
                    return;
                }
                C786410Ut5.LJZ(0, (FrameLayout) this.LLJJJ.getValue());
            }
        } else {
            if (innerPushUITemplate != null && innerPushUITemplate.topType == 0) {
                C19290510dT.LIZLLL("InnerPushAssemWindow", "[assembleMainParts] invalid top type, skip");
                C786410Ut5.LJZ(8, (FrameLayout) this.LLJJIJIL.getValue());
                return;
            }
            C786410Ut5.LJZ(0, (FrameLayout) this.LLJJIJIL.getValue());
        }
        assembler.RQ2(this, new AwS110S0101000_2(c19719912DlLIZ, i, 11));
    }

    public final void LJJJI(int i, InnerPushUITemplate innerPushUITemplate, boolean z) {
        if (innerPushUITemplate == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateVMState] area = ");
        sbLIZ.append(i);
        sbLIZ.append(", isUpdating = ");
        sbLIZ.append(z);
        C19290510dT.LIZLLL("InnerPushAssemWindow", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            AssemVMLazy assemVMLazy = this.LLJJI;
                            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
                            assemVMLazy.getValue().setState(new AwS603S0100000_24(new C1556670qbx(innerPushUITemplate.bottomType, innerPushUITemplate.bottomBtnText, innerPushUITemplate.bottomSchemaUrl), 497));
                            return;
                        }
                        return;
                    }
                    AssemVMLazy assemVMLazy2 = this.LLJJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJL;
                    AssemViewModel value = assemVMLazy2.getValue();
                    int i2 = innerPushUITemplate.topType;
                    String str = innerPushUITemplate.topImageUrl;
                    value.setState(new AwS603S0100000_24(new C1567300qt6(i2, innerPushUITemplate.topImageRes, str, innerPushUITemplate.topSchemaUrl, innerPushUITemplate.topImageWidth, innerPushUITemplate.topImageHeight, innerPushUITemplate.topImageRadius), 498));
                    return;
                }
                AssemVMLazy assemVMLazy3 = this.LLJILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr3 = LLJJL;
                assemVMLazy3.getValue().setState(new AwS610S0100000_31(C20666515tv.LIZJ(innerPushUITemplate), 392));
                return;
            }
            AssemVMLazy assemVMLazy4 = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr4 = LLJJL;
            assemVMLazy4.getValue().setState(new AwS610S0100000_31(C20666515tv.LIZIZ(innerPushUITemplate, z), 390));
            return;
        }
        AssemVMLazy assemVMLazy5 = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr5 = LLJJL;
        assemVMLazy5.getValue().setState(new AwS610S0100000_31(C20666515tv.LIZ(innerPushUITemplate, z), 389));
    }

    @Override // X.InterfaceC20663615tS
    public final void LIZJ(InnerPushMessage innerPushMessage, int[] iArr, boolean z, boolean z2) {
        InterfaceC20672015uo interfaceC20672015uo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[updateView], areas = ");
        sbLIZ.append(Arrays.toString(iArr));
        sbLIZ.append(", template = ");
        sbLIZ.append(innerPushMessage.getUiTemplate());
        C19290510dT.LIZLLL("InnerPushAssemWindow", C2188811AlT.LIZIZ(sbLIZ));
        ((InterfaceC332260D0u) this.LLJJJJJIL.getValue()).setValue(innerPushMessage);
        C723850SaN.LJ(this, new AwS240S0300000_31(iArr, this, innerPushMessage, 35));
        if (z) {
            KeyEvent.Callback contentView = getContentView();
            if ((contentView instanceof InterfaceC20672015uo) && (interfaceC20672015uo = (InterfaceC20672015uo) contentView) != null) {
                interfaceC20672015uo.LIZJ();
            }
        }
    }

    public final void LJJIIJZLJL(Assembler assembler, InnerPushMessage innerPushMessage, boolean z, int[] iArr) {
        for (int i : iArr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[assembleMainParts], area = ");
            sbLIZ.append(i);
            C19290510dT.LIZLLL("InnerPushAssemWindow", C2188811AlT.LIZIZ(sbLIZ));
            AssemSupervisor assemSupervisorLJJIJIL = LJJIJIL();
            if (assemSupervisorLJJIJIL != null) {
                C1276604z6.LIZJ(assemSupervisorLJJIJIL, i, innerPushMessage, this, LJJIJIIJIL(i), null, new C20671815um(i, innerPushMessage, this, z, assembler));
            }
        }
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.15up
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LLJIJIL);
            }
        }, null, new AwS635S0100000_21(this, 132), 6);
    }

    public final void LJJIIZ(Assembler assembler, InnerPushMessage innerPushMessage, boolean z, int[] iArr) {
        AssemSupervisor assemSupervisorLJJIJIL = LJJIJIL();
        if (assemSupervisorLJJIJIL != null) {
            C1276604z6.LIZJ(assemSupervisorLJJIJIL, 0, innerPushMessage, this, null, new AwS575S0100000_31(this, 1444), new C20671915un(this, assembler, iArr, z, innerPushMessage));
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
