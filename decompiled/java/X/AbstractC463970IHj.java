package X;

import Y.AfS176S0100000_7;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0IHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC463970IHj {
    public C11JF LIZ;
    public Pair<Integer, String> LIZIZ;
    public final InterfaceC463960IHi LIZJ;
    public boolean LIZLLL;
    public Room LJ;

    public final void LIZIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C463980IHk c463980IHk = (C463980IHk) this;
        C480460Ism.LIZ().getClass();
        this.LIZ = (C11JF) ((RoomApi) C480460Ism.LIZLLL(RoomApi.class)).fetchUserRoom(c463980IHk.LJFF, !TextUtils.isEmpty(UserService.getInstance().user().LJIJ(c463980IHk.LJFF)) ? UserService.getInstance().user().LJIJ(c463980IHk.LJFF) : c463980IHk.LJI).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(c463980IHk, 210), new AfS176S0100000_7(c463980IHk, 211));
    }

    public AbstractC463970IHj(InterfaceC463960IHi interfaceC463960IHi) {
        this.LIZJ = interfaceC463960IHi;
    }

    public final void LIZ(int i, String str) {
        this.LIZIZ = new Pair<>(Integer.valueOf(i), str);
        this.LIZLLL = false;
        this.LIZJ.LIZ(i, str);
    }
}
