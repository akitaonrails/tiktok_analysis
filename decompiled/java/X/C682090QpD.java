package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.ui.ChooseSearchMusicFragment;
import com.ss.android.ugc.aweme.search.pages.choosemusic.core.viewmodel.ChooseSearchMusicStateViewModel;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C682090QpD {
    public static final /* synthetic */ int LIZ = 0;

    public static ChooseSearchMusicStateViewModel LIZ(Fragment fragment) {
        AssemVMLazy assemVMLazy;
        Fragment parentFragment = fragment;
        if (parentFragment == null) {
            throw new IllegalArgumentException("fragment is null!");
        }
        while (!(parentFragment instanceof ChooseSearchMusicFragment)) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == null) {
                throw new IllegalArgumentException("fragment parent is not ChooseSearchMusicFragment");
            }
        }
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChooseSearchMusicStateViewModel.class);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 1225);
        AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(534);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), new C1622206Wu(parentFragment, true), new C338490DOt(parentFragment, true), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) parentFragment, 1226), aFwS241S0000000_10, new C451460Hn6(parentFragment, true), new C451620HnM(parentFragment, true), new C987103tV(parentFragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(parentFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(parentFragment, c19719912DlLIZ), awS554S0100000_10, new AwS554S0100000_10(parentFragment, 1227), aFwS241S0000000_10, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(parentFragment, c19719912DlLIZ), awS554S0100000_10, new C452070Ho5(), C724750Sbp.LJII(parentFragment), C724750Sbp.LJIIIZ(parentFragment), new AwS554S0100000_10((HasDefaultViewModelProviderFactory) parentFragment, 1228), aFwS241S0000000_10, new C451460Hn6(parentFragment, false), new C451620HnM(parentFragment, false), new C987103tV(parentFragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        return (ChooseSearchMusicStateViewModel) assemVMLazy.getValue();
    }
}
