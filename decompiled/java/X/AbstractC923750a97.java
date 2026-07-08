package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.dataChannel.MultiGuestLiveSuspended;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;

/* JADX INFO: renamed from: X.0a97, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC923750a97 extends AbstractC938410aWl<InterfaceC923600a8s> {
    public static final int $stable = 8;
    public C0THQ copyrightPerceptionHelper;
    public boolean isNeedLeaveChannelWhenEnterRoom;
    public final DataChannel mDataChannel;
    public final Room room;
    public final C01GW taskDispatcher$delegate;
    public InterfaceC917640ZzG userManager;

    public void cancel(String str) {
    }

    public abstract void checkPermissionRealTime$liveinteract_impl_release(int i, C925770aCN c925770aCN);

    public void exitInteractInNormalWay(String str, boolean z, int i) {
    }

    public void exitInteractInNormalWayAfterFeedback(@InterfaceC924020a9Y String str, String str2, int i) {
    }

    public void exitInteractWithConfirm(@InterfaceC924020a9Y String str, String str2, int i) {
    }

    public InterfaceC500100JjM<C470590Icr<GuestApplyStillInLineResponse.ResponseData>> fetchStillInLineData(GuestApplyStillInLineParams guestApplyStillInLineParams) {
        return null;
    }

    public InterfaceC500100JjM<C470590Icr<MultiLiveGuestInfoList>> fetchUserListData(boolean z) {
        return null;
    }

    public abstract Unit getWaitingList();

    public abstract void onEnterBackground();

    public abstract void onEnterForeground();

    public void releaseLiveVideoClient() {
    }

    public void reportLeaveRoom() {
    }

    public abstract void setDialogView(InterfaceC920780a4K interfaceC920780a4K);

    public InterfaceC777420Uea getTaskDispatcher() {
        return (InterfaceC777420Uea) this.taskDispatcher$delegate.getValue();
    }

    public final C0THQ getCopyrightPerceptionHelper() {
        return this.copyrightPerceptionHelper;
    }

    public final Room getRoom() {
        return this.room;
    }

    public InterfaceC917640ZzG getUserManager() {
        return this.userManager;
    }

    public final boolean isNeedLeaveChannelWhenEnterRoom() {
        return this.isNeedLeaveChannelWhenEnterRoom;
    }

    public final boolean isFromModeratorKickOut(Integer num) {
        if (num != null && num.intValue() == 5) {
            return true;
        }
        return false;
    }

    public final boolean isKickOutReasonable(Integer num) {
        if (num != null && num.intValue() == 4) {
            return true;
        }
        return false;
    }

    public final void setCopyrightPerceptionHelper(C0THQ c0thq) {
        this.copyrightPerceptionHelper = c0thq;
    }

    public final void setNeedLeaveChannelWhenEnterRoom(boolean z) {
        this.isNeedLeaveChannelWhenEnterRoom = z;
    }

    public void setUserManager(InterfaceC917640ZzG interfaceC917640ZzG) {
        this.userManager = interfaceC917640ZzG;
    }

    public final boolean onInterceptPunishedMessageNew$liveinteract_impl_release(PerceptionMessage perceptionMessage, PerceptionMessage perceptionMessage2) {
        T t;
        Context context;
        C0THQ c0thq;
        if (perceptionMessage == null) {
            perceptionMessage = perceptionMessage2;
        }
        if (perceptionMessage != null) {
            if (perceptionMessage.dialog != null && (t = this.mView) != 0) {
                InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) t;
                if (interfaceC919320a1y != null && (context = interfaceC919320a1y.getContext()) != null) {
                    PerceptionDialogInfo perceptionDialogInfo = perceptionMessage.dialog;
                    if (perceptionDialogInfo != null) {
                        C782130UmB.LIZLLL(perceptionDialogInfo, context, (LifecycleOwner) this.mView, getTaskDispatcher(), null, null, new AwS629S0100000_15(perceptionMessage, 23), 88);
                    }
                    PerceptionDialogInfo perceptionDialogInfo2 = perceptionMessage.dialog;
                    if (perceptionDialogInfo2 != null && (c0thq = this.copyrightPerceptionHelper) != null) {
                        c0thq.LIZIZ(perceptionDialogInfo2.countDownTime);
                    }
                    DataChannelGlobal.LLILZ.GQ2(MultiGuestLiveSuspended.class);
                }
                return true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("info: applyResult isnull or view null -> ");
            sbLIZ.append(perceptionMessage);
            C944240agA.LJFF("LinkIn_Guest_permission_Punished error", C2188811AlT.LIZIZ(sbLIZ));
        }
        return false;
    }

    public AbstractC923750a97(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.room = room;
        this.mDataChannel = dataChannel;
        this.taskDispatcher$delegate = C930540aK4.LJJIJIL(new AwS559S0100000_15(this, 262));
        this.isNeedLeaveChannelWhenEnterRoom = true;
    }

    public static /* synthetic */ void checkPermissionRealTime$liveinteract_impl_release$default(AbstractC923750a97 abstractC923750a97, int i, C925770aCN c925770aCN, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                c925770aCN = null;
            }
            abstractC923750a97.checkPermissionRealTime$liveinteract_impl_release(i, c925770aCN);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPermissionRealTime");
    }

    public static /* synthetic */ boolean onInterceptPunishedMessageNew$liveinteract_impl_release$default(AbstractC923750a97 abstractC923750a97, PerceptionMessage perceptionMessage, PerceptionMessage perceptionMessage2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                perceptionMessage2 = null;
            }
            return abstractC923750a97.onInterceptPunishedMessageNew$liveinteract_impl_release(perceptionMessage, perceptionMessage2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInterceptPunishedMessageNew");
    }

    public static /* synthetic */ void exitInteractInNormalWay$default(AbstractC923750a97 abstractC923750a97, String str, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            abstractC923750a97.exitInteractInNormalWay(str, z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exitInteractInNormalWay");
    }
}
