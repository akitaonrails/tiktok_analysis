package X;

import android.content.Context;
import android.text.SpannableString;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS130S0110000_12;

/* JADX INFO: renamed from: X.0TgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752980TgG extends C750630TcT {
    public final C752990TgH LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        C752990TgH c752990TgH = this.LLILZIL;
        return new AwS130S0110000_12(this, (c752990TgH.LJFF instanceof WhisperMessage) && (C500260Jjc.LJJJI(Boolean.valueOf(c752990TgH.LIZIZ)) || C500260Jjc.LJJJI(Boolean.valueOf(this.LLILZIL.LIZJ))), 27);
    }

    public C752980TgG(C752990TgH c752990TgH) {
        super(c752990TgH);
        this.LLILZIL = c752990TgH;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        RoomAuthStatus roomAuthStatus;
        C752990TgH c752990TgH = this.LLILZIL;
        Room room = c752990TgH.LIZLLL;
        if ((room == null || (roomAuthStatus = room.mRoomAuthStatus) == null || roomAuthStatus.enableChat) && c752990TgH.LIZ != null && c752990TgH.LJIIJ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        Room room;
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        DataChannel dataChannel = this.LLILZIL.LJIIIZ;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && room.cppVersion == 2) {
            Room room2 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room2 != null && (roomAuthStatus = room2.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null) {
                C0UFF c0uff = C0UFE.Companion;
                int i = anchorLevelPermission.pin;
                c0uff.getClass();
                if (C0UFF.LIZ(i) != C0UFE.OFF) {
                    return;
                }
            }
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.e1s, context);
            if (c20743516FdLIZLLL != null) {
                c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezt, context));
                String strLJIJI = C497740JfY.LJIJI(2131843777);
                if (strLJIJI != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJIJI);
                    sbLIZ.append("  ");
                    SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                    float f = 14;
                    c20743516FdLIZLLL.setBounds(0, 0, (int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f));
                    C416770GVv c416770GVv = new C416770GVv(c20743516FdLIZLLL);
                    c416770GVv.LIZIZ(0.0f);
                    c416770GVv.LLILZ = (int) C497740JfY.LIZIZ(8);
                    C786410Ut5.p2(spannableString, c416770GVv, strLJIJI.length(), spannableString.length(), 33);
                    if (c755180Tjo != null) {
                        c755180Tjo.LJI(spannableString);
                    }
                }
            }
        }
    }
}
