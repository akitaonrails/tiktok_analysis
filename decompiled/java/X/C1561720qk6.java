package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;

/* JADX INFO: renamed from: X.0qk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561720qk6 {
    public static final IMFFeedAbility LIZ(Fragment fragment) {
        Object ability;
        Object objLIZ = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(fragment, null), MainFragmentScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(IMFFeedAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof IMFFeedAbility) {
                objLIZ = ability;
            }
            return (IMFFeedAbility) objLIZ;
        }
        if ((fragment instanceof InterfaceC1593630rZZ) && fragment.getFragmentManager() != null) {
            objLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IMFFeedAbility.class, null);
        }
        return (IMFFeedAbility) objLIZ;
    }

    public static final HomeViewPagerAbility LIZIZ(Fragment fragment) {
        Object ability;
        Object objLIZ = null;
        if (C297720Bli.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(fragment, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
            } else {
                ability = null;
            }
            if (ability instanceof HomeViewPagerAbility) {
                objLIZ = ability;
            }
            return (HomeViewPagerAbility) objLIZ;
        }
        if ((fragment instanceof InterfaceC1593630rZZ) && fragment.getFragmentManager() != null) {
            objLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), HomeViewPagerAbility.class, null);
        }
        return (HomeViewPagerAbility) objLIZ;
    }

    public static final IMFPubAbility LIZJ(Fragment fragment) {
        InterfaceC494301wD interfaceC494301wDLIZ = null;
        if ((fragment instanceof InterfaceC1593630rZZ) && fragment.getFragmentManager() != null) {
            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IMFPubAbility.class, null);
        }
        return (IMFPubAbility) interfaceC494301wDLIZ;
    }

    public static final IMFShopAbility LIZLLL(Fragment fragment) {
        InterfaceC494301wD interfaceC494301wDLIZ = null;
        if ((fragment instanceof InterfaceC1593630rZZ) && fragment.getFragmentManager() != null) {
            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IMFShopAbility.class, null);
        }
        return (IMFShopAbility) interfaceC494301wDLIZ;
    }

    public static final IMFToolBarAbility LJ(Fragment fragment) {
        InterfaceC494301wD interfaceC494301wDLIZ = null;
        if ((fragment instanceof InterfaceC1593630rZZ) && fragment.getFragmentManager() != null) {
            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IMFToolBarAbility.class, null);
        }
        return (IMFToolBarAbility) interfaceC494301wDLIZ;
    }
}
