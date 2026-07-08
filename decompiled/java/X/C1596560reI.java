package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS62S0001000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0reI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596560reI {
    public static final String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "homepage_follow" : "homepage_hot" : "homepage_friends";
    }

    public static final Fragment LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return (Fragment) lifecycleOwner;
        }
        if (lifecycleOwner instanceof UIAssem) {
            return LIZ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof ReusedAssem) {
            return LIZ(((AbstractC738140SxQ) lifecycleOwner).getParent());
        }
        if (lifecycleOwner instanceof PowerCell) {
            return LIZ(((PowerCell) lifecycleOwner).getParent());
        }
        return null;
    }

    public static final String LIZJ(int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "following";
                }
            } else {
                str = "fyp";
            }
        } else {
            str = "friends";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append("skylight_container_view_model");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZLLL(int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = "";
                } else {
                    str = "following";
                }
            } else {
                str = "fyp";
            }
        } else {
            str = "friends";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append("skylight_list_view_model");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final EnumC1596540reG LJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return EnumC1596540reG.UNDEFINED;
                    }
                    return EnumC1596540reG.INBOX_TAB;
                }
                return EnumC1596540reG.FOLLOW_TAB;
            }
            return EnumC1596540reG.FYP_TAB;
        }
        return EnumC1596540reG.FRIENDS_TAB;
    }

    public static final int LJII(C1564490qoZ c1564490qoZ) {
        if (c1564490qoZ == null) {
            return -1;
        }
        return c1564490qoZ.LLILLJJLI.LJFF;
    }

    public static final FeedSkylightContainerViewModel LJFF(int i, Fragment fragment) {
        AssemVMLazy assemVMLazy;
        try {
            InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
            AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(i, 8);
            AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(613);
            if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS62S0001000_24, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) fragment, 1737), aFwS264S0000000_24, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
            } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS62S0001000_24, new AwS568S0100000_24(fragment, 1738), aFwS264S0000000_24, null, null, null);
            } else if (Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS62S0001000_24, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) fragment, 1739), aFwS264S0000000_24, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
            } else {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            return (FeedSkylightContainerViewModel) assemVMLazy.getValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return null;
        }
    }

    public static final FeedSkylightContainerViewModel LJI(int i, C19EG c19eg) {
        try {
            AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(i, 9);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedSkylightContainerViewModel.class);
            return (FeedSkylightContainerViewModel) new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ), awS62S0001000_24, new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) c19eg, 1740), AFwS264S0000000_24.get$arr$(614)).getValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return null;
        }
    }
}
