package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753270Tgj extends C750630TcT {
    public final C753080TgQ LLILZIL;
    public final C21627319kV LLILZLL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 794);
    }

    public C753270Tgj(C753080TgQ c753080TgQ) {
        super(c753080TgQ);
        this.LLILZIL = c753080TgQ;
        this.LLILZLL = C21627319kV.LIZJ();
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        RoomAuthStatus roomAuthStatus;
        C753080TgQ c753080TgQ = this.LLILZIL;
        Room room = c753080TgQ.LIZLLL;
        if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && !roomAuthStatus.enableChat) {
            return false;
        }
        DataChannel dataChannel = c753080TgQ.LJIIIZ;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C753280Tgk.class), Boolean.FALSE)) {
            return false;
        }
        C753080TgQ c753080TgQ2 = this.LLILZIL;
        if (c753080TgQ2.LIZ != null) {
            if (c753080TgQ2.LIZIZ || !C494680Jac.LJI(c753080TgQ2.LJIIIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        String strLJI = this.LLILZLL.LJI(C0KVU.LIZ(this.LLILZ.LIZ), new InterfaceC21543319St() { // from class: X.0Tgl
            @Override // X.InterfaceC21543319St
            public final boolean LIZ(int i, CharSequence charSequence) {
                return false;
            }
        });
        if (c755180Tjo != null) {
            c755180Tjo.LJI(C497740JfY.LJIJJ(2131841261, strLJI));
        }
    }
}
