package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496890JeB {
    public static final boolean LIZ(boolean z) {
        if (!LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable() && z) {
            int iLJII = ((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJII();
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (iLJII >= C927600aFK.LJIIL()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final EnumC496870Je9 LIZIZ(User user, boolean z) {
        InterfaceC2262081DgM currentUser;
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        Set<Long> setFP2;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).HA(user) == 2) {
            return EnumC496870Je9.DISCONNECTED;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null) {
            room = (Room) dataChannelGlobal.gg0(C930930aKh.class);
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Long lValueOf4 = null;
        if (interfaceC500940JkiUser != null) {
            currentUser = interfaceC500940JkiUser.getCurrentUser();
        } else {
            currentUser = null;
        }
        if (room != null) {
            try {
                lValueOf = Long.valueOf(room.getOwnerUserId());
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            if (currentUser != null && (lValueOf2 = Long.valueOf(currentUser.getId())) != null) {
                lValueOf2.longValue();
                if (z) {
                    if (room != null) {
                        lValueOf3 = Long.valueOf(room.getOwnerUserId());
                    } else {
                        lValueOf3 = null;
                    }
                    if (currentUser != null) {
                        lValueOf4 = Long.valueOf(currentUser.getId());
                    }
                    boolean zLJFF = Intrinsics.LJFF(lValueOf3, lValueOf4);
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    boolean zLJFF2 = C923330a8R.LJFF();
                    if ((zLJFF || zLJFF2) && C489080JFy.LIZ(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).QZ(), 2) && (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vL1().contains(Long.valueOf(user.getId())) || !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).uz0().contains(Long.valueOf(user.getId())))) {
                        if (LinkCoreModelKt.currentUserIsAnchor()) {
                            setFP2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).YZ1();
                        } else {
                            setFP2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).fP2();
                        }
                        if (setFP2.contains(Long.valueOf(user.getId()))) {
                            return EnumC496870Je9.GRAYED;
                        }
                        return EnumC496870Je9.ACTIVE;
                    }
                }
                return EnumC496870Je9.GONE;
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }
}
