package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: renamed from: X.0JgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498350JgX extends AbstractC752950TgD {
    public final Room LLILZ;
    public final User LLILZIL;
    public final C498340JgW LLILZLL;
    public final DataChannel LLIZ;
    public final boolean LLIZLLLIL = false;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS551S0100000_7(this, 667);
    }

    public C498350JgX(Room room, User user, C498340JgW c498340JgW, DataChannel dataChannel) {
        this.LLILZ = room;
        this.LLILZIL = user;
        this.LLILZLL = c498340JgW;
        this.LLIZ = dataChannel;
    }
}
