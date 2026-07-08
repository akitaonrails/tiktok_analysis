package X;

import Y.AfS148S0200000_12;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.broadcast.CommentFeaturePreviewChannel;
import com.bytedance.android.livesdk.broadcast.IsPreviewStartTryMode;
import com.bytedance.android.livesdk.broadcast.StartLiveSuccessChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.broadcast.setting.TTLHVideoResolutionPortraitSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnableInitTimeCostOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHLiveABSettings;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostIM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.MockResponse;

/* JADX INFO: renamed from: X.0UNH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UNH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ C772450URv LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UNH(Context context, DataChannel dataChannel, C772450URv c772450URv, String str) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = c772450URv;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final DialogC780480UjW dialogC780480UjWLIZ;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C036E.LIZ.LIZIZ()) {
            C780470UjV c780470UjV = new C780470UjV(this.LL);
            c780470UjV.LIZIZ = C497740JfY.LJIJI(2131853470);
            dialogC780480UjWLIZ = c780470UjV.LIZ();
            if (dialogC780480UjWLIZ != null) {
                C500260Jjc.LJJLIIIJLLLLLLLZ(dialogC780480UjWLIZ);
            }
        } else {
            dialogC780480UjWLIZ = null;
        }
        ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).fr2(true);
        this.LLILLJJLI.zW(IsPreviewStartTryMode.class, Boolean.TRUE);
        C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
        C11NZ<R> c11nzLJIILIIL = C01QD.LIZ().LIZ().mockTryModeRoom(false).LJIILIIL(new C0UO0());
        final DataChannel dataChannel = this.LLILLJJLI;
        final Context context = this.LL;
        final C772450URv c772450URv = this.LLILLL;
        final String str = this.LLILZ;
        c11nzLJIILIIL.LJJLL(new C09JN() { // from class: X.0URn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C09JN
            public final void accept(Object obj) {
                boolean z;
                Long lValueOf;
                long jElapsedRealtime;
                Bundle bundle;
                Fragment fragment;
                C1C7U.LIZ("PreviewTryModeGoLiveHelper@27ad.onClick$2$1$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                DialogC780480UjW dialogC780480UjW = dialogC780480UjWLIZ;
                if (dialogC780480UjW != null) {
                    C500260Jjc.LJJLIIIJL(dialogC780480UjW);
                }
                if (baseResponse != null && baseResponse.data != null) {
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    Boolean bool = Boolean.TRUE;
                    dataChannelGlobal.JQ2(C930860aKa.class, bool);
                    Room room = ((MockResponse.Data) baseResponse.data).room;
                    if (room == null) {
                        room = new Room();
                        ((MockResponse.Data) baseResponse.data).room = room;
                    }
                    DataChannel dataChannel2 = dataChannel;
                    room.setId(0L);
                    room.setOwner(UserService.getInstance().user().LJIJJLI());
                    room.setOwnerUserId(UserService.getInstance().user().getCurrentUserId());
                    if (room.getRoomAuthStatus() == null) {
                        room.setRoomAuthStatus(new RoomAuthStatus());
                    }
                    room.getRoomAuthStatus().enableChat = C500260Jjc.LJJIJIL((Boolean) dataChannel2.gg0(CommentFeaturePreviewChannel.class));
                    Point pointLIZIZ = C14KS.LIZIZ(C497740JfY.LJII());
                    int i = pointLIZIZ.x;
                    int i2 = pointLIZIZ.y;
                    C1271250jBb c1271250jBb = C1271270jBd.LIZ;
                    c1271250jBb.LIZ.LJI = true;
                    String strValue = TTLHLiveABSettings.INSTANCE.value();
                    if (M2LEnableInitTimeCostOpt.INSTANCE.enabled() && C781520UlC.LJIIJJI(C751980Tee.LIZJ(dataChannel))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1271250jBb.LJIIIIZZ(i, i2, strValue, z, TTLHVideoResolutionPortraitSettings.anchorEverLinked());
                    C1EOY c1eoy = C1EOY.LIZ;
                    C1EOY.LJIIIIZZ();
                    Context context2 = context;
                    User owner = room.getOwner();
                    if (owner != null) {
                        lValueOf = Long.valueOf(owner.getId());
                    } else {
                        lValueOf = null;
                    }
                    C771610UOp.LIZJ(context2, "VIDEO", String.valueOf(lValueOf));
                    dataChannelGlobal.JQ2(C951930asZ.class, 3);
                    Pair pair = new Pair(bool, Long.valueOf(room.getId()));
                    dataChannel.zW(StartLiveSuccessChannel.class, pair);
                    dataChannelGlobal.JQ2(C931470aLZ.class, pair);
                    dataChannelGlobal.JQ2(C930940aKi.class, room);
                    if (C0UQK.LIZJ(dataChannel)) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = -1;
                    }
                    dataChannelGlobal.JQ2(C931190aL7.class, Long.valueOf(jElapsedRealtime));
                    dataChannelGlobal.JQ2(C168U.class, c772450URv.LJII(context, dataChannel, null));
                    C776270Ucj c776270Ucj = C776270Ucj.LIZ;
                    String str2 = str;
                    c776270Ucj.getClass();
                    C776270Ucj.LJII = str2;
                    boolean z2 = false;
                    c776270Ucj.LJIILL(1, false);
                    C1276890jKh.LIZLLL();
                    if (Intrinsics.LJFF(dataChannel.gg0(C771510UOf.class), "independent_live_page")) {
                        ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).saveOpenLiveMultiTabPageParamsOnce();
                    }
                    if (C504210Jpz.LIZ) {
                        C0UNJ c0unj = C0UNJ.LIZ;
                        Context context3 = context;
                        long j = ((MockResponse.Data) baseResponse.data).mockRoomId;
                        DataChannel dataChannel3 = dataChannel;
                        c0unj.getClass();
                        IHostAction iHostActionLJIIJ = C781270Ukn.LJIIJ();
                        PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
                        LiveMode liveMode = LiveMode.VIDEO;
                        previewContinueLiveHelper.getClass();
                        InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = iHostActionLJIIJ.createStartBroadcastFragment(PreviewContinueLiveHelper.LIZ(liveMode));
                        if (interfaceC214902198iCreateStartBroadcastFragment != 0) {
                            if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment.getArguments()) == null) {
                                bundle = new Bundle();
                            }
                            C786410Ut5.LJJJI("request_page", (String) dataChannel3.gg0(C0ULI.class), bundle);
                            bundle.putBoolean("is_try_mode", true);
                            bundle.putBoolean("go_multi_tab_page", Intrinsics.LJFF(dataChannel3.gg0(C771510UOf.class), "independent_live_page"));
                            bundle.putBoolean("start_practice_mode_from_practice_live", Intrinsics.LJFF(dataChannel3.gg0(C758780Tpc.class), bool));
                            bundle.putLong("room_mock_id", j);
                            InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(C1388190mED.LIZ(context3));
                            if (interfaceC20622815msLIZ != null) {
                                z2 = false;
                                C520010KaN.LJIIL(interfaceC20622815msLIZ, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
                            }
                            InterfaceC20622815ms interfaceC20622815msLIZ2 = C520010KaN.LIZ(C1388190mED.LIZIZ(context3));
                            if (interfaceC20622815msLIZ2 != null) {
                                C520010KaN.LJIILLIIL(interfaceC20622815msLIZ2);
                            }
                        }
                    } else {
                        C0UNJ c0unj2 = C0UNJ.LIZ;
                        Context context4 = context;
                        long j2 = ((MockResponse.Data) baseResponse.data).mockRoomId;
                        DataChannel dataChannel4 = dataChannel;
                        c0unj2.getClass();
                        IHostAction iHostActionLJIIJ2 = C781270Ukn.LJIIJ();
                        C19EG c19egLJ = C500260Jjc.LJ(context4);
                        PreviewContinueLiveHelper previewContinueLiveHelper2 = PreviewContinueLiveHelper.LIZ;
                        LiveMode liveMode2 = LiveMode.VIDEO;
                        previewContinueLiveHelper2.getClass();
                        Intent intentCreateStartBroadcastIntent = iHostActionLJIIJ2.createStartBroadcastIntent(c19egLJ, PreviewContinueLiveHelper.LIZ(liveMode2));
                        intentCreateStartBroadcastIntent.putExtra("request_page", (String) dataChannel4.gg0(C0ULI.class));
                        intentCreateStartBroadcastIntent.putExtra("is_try_mode", true);
                        intentCreateStartBroadcastIntent.putExtra("go_multi_tab_page", Intrinsics.LJFF(dataChannel4.gg0(C771510UOf.class), "independent_live_page"));
                        intentCreateStartBroadcastIntent.putExtra("room_mock_id", j2);
                        intentCreateStartBroadcastIntent.putExtra("start_practice_mode_from_practice_live", Intrinsics.LJFF(dataChannel4.gg0(C758780Tpc.class), bool));
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context4, intentCreateStartBroadcastIntent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context4);
                        C2204961BRm.LJJJJJL(context4, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqPWKxFpCtGqSgh3ZTCNJoXvSCydxPVuqX/eg==", null));
                        C19EG c19egLJ2 = C500260Jjc.LJ(context4);
                        if (c19egLJ2 != null) {
                            c19egLJ2.finish();
                        }
                        C19EG c19egLJ3 = C500260Jjc.LJ(context4);
                        if (c19egLJ3 != null) {
                            C786410Ut5.ce(c19egLJ3, 0, 0);
                        }
                    }
                    C781270Ukn.LJ().startLiveManager().LIZLLL(z2);
                }
                C1C7U.LIZIZ("PreviewTryModeGoLiveHelper@27ad.onClick$2$1$1");
            }
        }, new AfS148S0200000_12(dialogC780480UjWLIZ, dataChannel, 58));
        return Unit.LIZ;
    }
}
