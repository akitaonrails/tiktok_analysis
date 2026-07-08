package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomFriendsTabAvatarAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;

/* JADX INFO: renamed from: X.0rJF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583510rJF {
    public static final /* synthetic */ int LIZ = 0;

    public static IFriendsTabRouterAbility LIZ(C19EG c19eg) {
        return (IFriendsTabRouterAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19eg, null), IFriendsTabRouterAbility.class, null);
    }

    public static IFriendsTabLayoutAbility LIZIZ(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return null;
        }
        return LIZLLL(C1558360qeg.LJI(c19egLIZIZ, null));
    }

    public static IFriendsTabLayoutAbility LIZJ(Fragment fragment) {
        if (fragment.getFragmentManager() == null) {
            return null;
        }
        return LIZLLL(C1558360qeg.LJFF(fragment, null));
    }

    public static IFriendsTabLayoutAbility LIZLLL(InterfaceC665370Q7z interfaceC665370Q7z) {
        return (IFriendsTabLayoutAbility) C1558520qew.LIZ(interfaceC665370Q7z, IFriendsTabLayoutAbility.class, null);
    }

    public static ISocial2TabProtocolAbility LJ(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return null;
        }
        return LJI(C1558360qeg.LJI(c19egLIZIZ, null));
    }

    public static ISocial2TabProtocolAbility LJFF(C19EG c19eg) {
        return LJI(C1558360qeg.LJI(c19eg, null));
    }

    public static ISocial2TabProtocolAbility LJI(InterfaceC665370Q7z interfaceC665370Q7z) {
        return (ISocial2TabProtocolAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISocial2TabProtocolAbility.class, null);
    }

    public static IBottomTabLayoutAbility LJII(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return null;
        }
        return LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null));
    }

    public static IBottomTabLayoutAbility LJIIIIZZ(Fragment fragment) {
        if (fragment.getFragmentManager() == null) {
            return null;
        }
        return LJIIIZ(C1558360qeg.LJFF(fragment, null));
    }

    public static IBottomTabLayoutAbility LJIIIZ(InterfaceC665370Q7z interfaceC665370Q7z) {
        return (IBottomTabLayoutAbility) C1558520qew.LIZ(interfaceC665370Q7z, IBottomTabLayoutAbility.class, null);
    }

    public static IBottomFriendsTabAvatarAbility LJIIJ(Context context) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            return null;
        }
        return LJIIJJI(C1558360qeg.LJI(c19egLIZIZ, null));
    }

    public static IBottomFriendsTabAvatarAbility LJIIJJI(InterfaceC665370Q7z interfaceC665370Q7z) {
        return (IBottomFriendsTabAvatarAbility) C1558520qew.LIZ(interfaceC665370Q7z, IBottomFriendsTabAvatarAbility.class, null);
    }
}
