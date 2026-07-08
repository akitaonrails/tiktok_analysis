package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0Ivw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC482420Ivw implements InterfaceC1891350zJl {
    public final ToplivePageItem LL;
    public final String LLILLJJLI;
    public String LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        String nickName;
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("[section:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(",itemId:");
        sbLIZ.append(this.LL.itemId);
        sbLIZ.append(",detail:");
        Room room = this.LL.room;
        if (room == null || (owner = room.getOwner()) == null || (nickName = owner.getNickName()) == null) {
            nickName = "";
        }
        sbLIZ.append(nickName);
        sbLIZ.append(",requestId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!Intrinsics.LJFF(this.LLILLJJLI, "you_may_like")) {
            return Intrinsics.LJFF(interfaceC1891350zJl.getClass(), getClass());
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public AbstractC482420Ivw(ToplivePageItem toplivePageItem, String str) {
        this.LL = toplivePageItem;
        this.LLILLJJLI = str;
    }
}
