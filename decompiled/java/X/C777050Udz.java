package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.GameFloatTipsOptimize;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Udz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.education.GameLiveNewBroadcastEduNotificationHelperKt$tryShowStartGameLive2MinTipsTask$1", f = "GameLiveNewBroadcastEduNotificationHelper.kt", l = {122}, m = "invokeSuspend")
public final class C777050Udz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GameBroadcastFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C777050Udz(GameBroadcastFragment gameBroadcastFragment, InterfaceC1364105Vn<? super C777050Udz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = gameBroadcastFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C777050Udz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        C1C7U.LIZ("GameLiveNewBroadcastEduNotificationHelperKt@fad5.tryShowStartGameLive2MinTipsTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(120000L, this) == objLJFF) {
                C1C7U.LIZIZ("GameLiveNewBroadcastEduNotificationHelperKt@fad5.tryShowStartGameLive2MinTipsTask$1");
                return objLJFF;
            }
        }
        boolean zIsAppForeground = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground();
        Map<String, Object> map = C1338270kvh.LIZ;
        if (zIsAppForeground) {
            C777060Ue0.LIZIZ(EnumC777090Ue3.First2Min, EnumC777070Ue1.InApp);
            IMessageManager iMessageManager = (IMessageManager) this.LLILLJJLI.getDataChannel().gg0(C776250Uch.class);
            Room room = (Room) this.LLILLJJLI.getDataChannel().gg0(RoomChannel.class);
            String strLJIJI = C497740JfY.LJIJI(2131841803);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            RoomMessage roomMessageLJ = C181500mr.LJ(id, strLJIJI);
            if (iMessageManager != null) {
                iMessageManager.insertMessage(roomMessageLJ, true);
            }
        } else if (GameFloatTipsOptimize.INSTANCE.isExperimentGroup()) {
            C777840UfG.LJII(new C777450Ued(EnumC777090Ue3.First2Min));
        } else {
            C777060Ue0.LIZIZ(EnumC777090Ue3.First2Min, EnumC777070Ue1.Hover);
            C776870Udh c776870Udh = this.LLILLJJLI.LLJJIJI;
            if (c776870Udh != null) {
                c776870Udh.LJIIIZ(EnumC778100Ufg.LIVE_TIP_MESSAGE_FIRST_START_LIVE_2MIN.ordinal(), null, C497740JfY.LJIJI(2131841803), null, true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameLiveNewBroadcastEduNotificationHelperKt@fad5.tryShowStartGameLive2MinTipsTask$1");
        return unit;
    }
}
