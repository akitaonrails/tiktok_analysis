package X;

import Y.AcS105S0101000_12;
import Y.AcS15S0001000_12;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.DobDialogCanceledEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthFailedWithoutConfirm;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.EditBirthSucc;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783550UoT {
    public static final void LIZ(InterfaceC919320a1y interfaceC919320a1y, DataChannel dataChannel) {
        InterfaceC777420Uea interfaceC777420Uea;
        if (interfaceC919320a1y != null) {
            Context context = interfaceC919320a1y.getContext();
            if (dataChannel != null) {
                interfaceC777420Uea = (InterfaceC777420Uea) dataChannel.gg0(C782140UmC.class);
            } else {
                interfaceC777420Uea = null;
            }
            new AwS591S0100000_12(interfaceC919320a1y, 1210);
            C784540Uq4.LIZ(context, interfaceC919320a1y, 13, interfaceC777420Uea);
        }
    }

    public static final void LIZLLL(Context context, DataChannel dataChannel) {
        String strJ4 = C786410Ut5.j4(C497740JfY.LJIJI(2131842781), Arrays.copyOf(new Object[]{String.valueOf(LiveAudienceLinkmicLowestAgeSetting.INSTANCE.getValue())}, 1));
        C19GO c19go = new C19GO(context);
        c19go.LJJIIJ = true;
        c19go.LJII = strJ4;
        c19go.LJ(2131851997, new DialogInterfaceOnClickListenerC785930UsJ(context, dataChannel, 7), false);
        c19go.LIZJ(2131851998, new DialogInterface.OnClickListener() { // from class: X.0Tof
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                HashMap map = new HashMap();
                map.put("choose_type", "dismiss");
                C925600aC6.LJJIJL("guest_connection_underage_popup", "click", map);
            }
        }, false);
        C786410Ut5.M4(c19go.LIZ());
        C925600aC6.LJJIJL("guest_connection_underage_popup", "show", null);
    }

    public static final void LIZIZ(Context context, DataChannel dataChannel, int i) {
        Room room;
        User owner = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIILLIIL = false;
        c782110Um9.LJIILL = false;
        c782110Um9.LIZJ = C497740JfY.LJIJJ(2131840926, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
        String strLJJIFFI = u.LJJIFFI(C497740JfY.LJIJI(2131840925), "{username}", "%s", false);
        Object[] objArr = new Object[1];
        if (room != null) {
            owner = room.getOwner();
        }
        objArr[0] = C0KVU.LIZ(owner);
        c782110Um9.LJIIIZ(C786410Ut5.j4(strLJJIFFI, Arrays.copyOf(objArr, 1)));
        c782110Um9.LJIIJ(2131843824, new AcS105S0101000_12(i, dataChannel, 4));
        c782110Um9.LJIILIIL(2131851997, new AcS15S0001000_12(i, 3));
        C786410Ut5.E4(c782110Um9.LIZ());
        C925600aC6.LJJIIZ(i);
    }

    public static final void LIZJ(Context context, final DataChannel dataChannel, final int i) {
        Context contextLJJIIZI = C520010KaN.LJJIIZI(context, false);
        if (contextLJJIIZI == null) {
            return;
        }
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).showGuideBirthdayEditDialog(contextLJJIIZI, "live_co_host", C925600aC6.LJI(i), new C0UZN() { // from class: X.0UoU
            @Override // X.C0UZN
            public final Unit LJJIFFI() {
                C925600aC6.LJJIJIIJI(i);
                DataChannel dataChannel2 = dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.FQ2(DobDialogCanceledEvent.class);
                }
                return Unit.LIZ;
            }

            @Override // X.C0UZN
            public final Unit onFailed(String str) {
                DataChannel dataChannel2;
                if (Intrinsics.LJFF(str, "") && i == 2 && (dataChannel2 = dataChannel) != null) {
                    dataChannel2.FQ2(EditBirthFailedWithoutConfirm.class);
                }
                return Unit.LIZ;
            }

            @Override // X.C0UZN
            public final Unit LJJI(String str, String str2) {
                C2764015e.LIZ = true;
                C2764015e.LIZIZ = true;
                DataChannel dataChannel2 = dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(EditBirthSucc.class, Integer.valueOf(i));
                }
                return Unit.LIZ;
            }
        });
        C925600aC6.LJJIJIL(i);
    }
}
