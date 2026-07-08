package X;

import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.gift.NormalGiftLayoutBottomMarginUpdateEvent;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS221S0300000_12;

/* JADX INFO: renamed from: X.0Ukj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781230Ukj {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final RecyclableWidgetManager LIZ;
    public final DataChannel LIZIZ;
    public boolean LIZJ;
    public View LIZLLL;
    public final Function1<? super Widget, Unit> LJ;
    public boolean LJFF;
    public Room LJI;
    public LiveRecyclableWidget LJII;
    public LiveWidget LJIIIIZZ;
    public IMessageManager LJIIIZ;
    public final Boolean LJIIJ;

    public final void LIZ() {
        if (this.LIZJ) {
            View view = this.LIZLLL;
            if (view == null) {
                return;
            }
            HandlerHook.viewPost(view, new ARunnableS81S0200000_12(this, view, 132));
            return;
        }
        C1118250fCp c1118250fCp = new C1118250fCp(C439101nJ.LIZ(295), false, false);
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.LC0(NormalGiftLayoutBottomMarginUpdateEvent.class, c1118250fCp);
        }
    }

    public final void LIZIZ() {
        InterfaceC1106030et7.J5.LJFF(this.LJIIJ);
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.SX0(C0TZJ.class, Boolean.FALSE);
        }
        IMessageManager iMessageManager = this.LJIIIZ;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(new C2222371ByV(0));
        }
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            iRoomFunctionService.LLLF(this.LJI, this.LIZIZ);
        }
        IPublicScreenService iPublicScreenService = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        if (iPublicScreenService != null) {
            iPublicScreenService.LLLF(this.LJI, this.LIZIZ);
        }
        IPublicScreenService iPublicScreenService2 = (IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class);
        if (iPublicScreenService2 != null) {
            iPublicScreenService2.Ac2(this.LJI);
        }
        this.LJI = null;
        this.LIZLLL = null;
        this.LJIIIZ = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }

    public final void LIZJ() {
        InterfaceC2262081DgM currentUser;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startMessage, messageManager is null: ");
        sbLIZ.append(this.LJIIIZ == null);
        C20441214yg.LIZIZ("DualDevicePublicScreenManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJFF = true;
        IMessageManager iMessageManager = this.LJIIIZ;
        if (iMessageManager != null) {
            iMessageManager.startMessage();
        }
        if (this.LJIIIZ != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_public_screen_show");
            Room room = this.LJI;
            Long lValueOf = null;
            c474500IjALIZ.LJJII(room != null ? Long.valueOf(room.getId()) : null, "room_id");
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                lValueOf = Long.valueOf(currentUser.getId());
            }
            c474500IjALIZ.LJJII(lValueOf, "anchor_id");
            c474500IjALIZ.LIZ();
        }
        LIZ();
    }

    public C781230Ukj(Context context, LifecycleOwner lifecycleOwner, RecyclableWidgetManager recyclableWidgetManager, DataChannel dataChannel, boolean z, View view, Function1<? super Widget, Unit> function1) {
        this.LIZ = recyclableWidgetManager;
        this.LIZIZ = dataChannel;
        this.LIZJ = z;
        this.LIZLLL = view;
        this.LJ = function1;
        if (dataChannel != null) {
            dataChannel.EQ2(lifecycleOwner, RoomChannel.class, new AwS221S0300000_12(this, context, lifecycleOwner, 26));
        }
        this.LJIIJ = InterfaceC1106030et7.J5.LIZIZ();
    }
}
