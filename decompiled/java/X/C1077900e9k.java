package X;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0e9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1077900e9k {
    public final InterfaceC782440Umg LIZ;

    public C1077900e9k(Fragment fragment, DataChannel dataChannel, InterfaceC782440Umg interfaceC782440Umg) {
        boolean zBooleanValue;
        boolean z;
        this.LIZ = interfaceC782440Umg;
        boolean zLJI = MethodIDManager.LJI(71949);
        if (LiveLikeDegradeSettings.INSTANCE.disableSelfLike(dataChannel)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if (room == null) {
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
            return;
        }
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        boolean zBooleanValue2 = ((Boolean) dataChannel.gg0(C0TZM.class)).booleanValue();
        if (zBooleanValue || (!((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() && !((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1())) {
            z = true;
        } else {
            z = false;
        }
        IBarrageService iBarrageService = (IBarrageService) C1161920gLG.LIZJ(IBarrageService.class);
        iBarrageService.JU(fragment.getActivity(), fragment, room, new C1077910e9l(this), zBooleanValue2, z, dataChannel);
        InterfaceC1085480eLy interfaceC1085480eLyO41 = iBarrageService.O41(room.getId());
        if (interfaceC1085480eLyO41 != null) {
            interfaceC1085480eLyO41.LJIIJ(new InterfaceC1087920ePu() { // from class: X.0JhG
                @Override // X.InterfaceC1087920ePu
                public final String JA() {
                    return "InteractionLikeHelper";
                }

                @Override // X.InterfaceC1087920ePu
                public final /* synthetic */ void onResult(String str) {
                }

                @Override // X.InterfaceC1087920ePu
                public final void Py(LikeHelper likeHelper, int i) {
                    C465520INi.LIZ.sw0("like");
                }

                @Override // X.InterfaceC1087920ePu
                public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
                    IPerformanceManager iPerformanceManager = C465520INi.LIZ;
                    if (i2 == 1) {
                        iPerformanceManager.t10("like", null);
                    }
                    C1276840jKc.LIZ.getClass();
                    C1276840jKc.LJIIL.put("use_like", "true");
                    Handler handlerLIZ = C473410IhP.LIZ();
                    RunnableC473680Ihq runnableC473680Ihq = C1276840jKc.LJJIIJ;
                    handlerLIZ.removeCallbacks(runnableC473680Ihq);
                    C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, handlerLIZ, runnableC473680Ihq);
                    iPerformanceManager.ml0("show_like");
                }
            });
        }
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }
}
