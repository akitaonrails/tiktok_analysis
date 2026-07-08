package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.guest.GuestBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineParams;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestHangupRoomIdsChannel;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestUpdateUserInfoFragmentForReservation;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserStateMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0a7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C922680a7O extends AbstractC923750a97 implements OnMessageListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final DataChannel LL;
    public final C304201Fw LLILLJJLI;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public InterfaceC917640ZzG userManager;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C922680a7O.class, "multiGuestDataHolder", "getMultiGuestDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC923750a97
    public final void checkPermissionRealTime$liveinteract_impl_release(int i, C925770aCN c925770aCN) {
    }

    @Override // X.AbstractC923750a97
    public final void onEnterBackground() {
    }

    @Override // X.AbstractC923750a97
    public final void onEnterForeground() {
    }

    @Override // X.AbstractC923750a97
    public final void setDialogView(InterfaceC920780a4K interfaceC920780a4K) {
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1, X.C0JSV
    public final void detachView() {
        C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "detachView");
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "do not release userManager for union session is true.");
        } else {
            InterfaceC917640ZzG interfaceC917640ZzG = this.userManager;
            if (interfaceC917640ZzG != null) {
                interfaceC917640ZzG.release();
            }
        }
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        super.detachView();
    }

    public final MultiGuestDataHolder getMultiGuestDataHolder() {
        C304201Fw c304201Fw = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (MultiGuestDataHolder) c304201Fw.LIZ();
    }

    @Override // X.AbstractC923750a97
    public final InterfaceC917640ZzG getUserManager() {
        return this.userManager;
    }

    @Override // X.AbstractC923750a97
    public final Unit getWaitingList() {
        return Unit.LIZ;
    }

    @Override // X.AbstractC938410aWl, X.AbstractC945390ai1
    public final void attachView(InterfaceC923600a8s interfaceC923600a8s) {
        super.attachView(interfaceC923600a8s);
        C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "attachView");
        InterfaceC917640ZzG interfaceC917640ZzG = this.userManager;
        if (interfaceC917640ZzG != null) {
            interfaceC917640ZzG.LJIILJJIL(1);
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.mMessageManager = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.AUDIENCE_RESERVE_USER_STATE_MESSAGE.getIntType(), this);
        }
    }

    @Override // X.AbstractC923750a97
    public final InterfaceC500100JjM<C470590Icr<GuestApplyStillInLineResponse.ResponseData>> fetchStillInLineData(GuestApplyStillInLineParams guestApplyStillInLineParams) {
        C480460Ism.LIZ().getClass();
        return (InterfaceC500100JjM) ((MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class)).getStillInLineData(guestApplyStillInLineParams).LJIILIIL(new C11L5() { // from class: X.0a7P
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C11L5
            public final void accept(Object obj, Object obj2) {
                GuestApplyStillInLineResponse.ResponseData responseData;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (responseData = (GuestApplyStillInLineResponse.ResponseData) baseResponse.data) != null) {
                    DataChannel dataChannel = this.LIZ.LL;
                    if (dataChannel != null) {
                        List<GuestApplyStillInLineResponse.GuestApplyItem> list = responseData.guestApplyList;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<GuestApplyStillInLineResponse.GuestApplyItem> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Long.valueOf(it2.next().roomId));
                        }
                        dataChannel.zW(MultiGuestHangupRoomIdsChannel.class, arrayList);
                    }
                    C928400aGc.LLIZ = responseData.guestApplyList.size();
                    C928340aGW.LLIZ = responseData.guestInvitedList.size();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchStillInLineData guestApplyList.size=");
                    sbLIZ.append(responseData.guestApplyList.size());
                    C20441214yg.LJIIIZ("MultiGuestV3GuestReservationPresenter", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }).LIZLLL(autoDisposeWithTransformer());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AudienceReserveUserStateMessage audienceReserveUserStateMessage;
        Context context = null;
        if ((iMessage instanceof AudienceReserveUserStateMessage) && (audienceReserveUserStateMessage = (AudienceReserveUserStateMessage) iMessage) != null && audienceReserveUserStateMessage.type == 3) {
            C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", "handleReserveMessage");
            InterfaceC919320a1y interfaceC919320a1y = (InterfaceC919320a1y) this.mView;
            if (interfaceC919320a1y != null) {
                context = interfaceC919320a1y.getContext();
            }
            Activity activityLJIJ = C520010KaN.LJIJ(context, false);
            if (activityLJIJ == null) {
                return;
            }
            C766270U4b.LJIIL(R.drawable.eo_, activityLJIJ, C497740JfY.LJIJJ(2131841105, C0KVU.LIZ(this.room.getOwner())));
            C929810aIt.LIZIZ(3);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(MultiGuestUpdateUserInfoFragmentForReservation.class);
            }
        }
    }

    @Override // X.AbstractC923750a97
    public final void setUserManager(InterfaceC917640ZzG interfaceC917640ZzG) {
        this.userManager = interfaceC917640ZzG;
    }

    public C922680a7O(Room room, DataChannel dataChannel, LifecycleOwner lifecycleOwner) {
        boolean z;
        super(room, dataChannel, lifecycleOwner);
        this.LL = dataChannel;
        this.LLILLJJLI = new C304201Fw("MULTI_GUEST_DATA_HOLDER");
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ() && C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_GUEST_USER_MANAGER") != null) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init needProvideUserManager: ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiGuestV3GuestReservationPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C948450amx.LIZIZ.LJFF(new GuestBusinessUserManager(room, jLJIILL, iMessageManager, lifecycleOwner), "MULTI_GUEST_V3_GUEST_USER_MANAGER");
        }
        C948450amx.LIZIZ.LIZJ(this);
    }
}
