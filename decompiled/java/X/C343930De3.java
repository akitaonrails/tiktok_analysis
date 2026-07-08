package X;

import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.0De3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343930De3 implements Serializable {
    public Map<String, ? extends Object> extras;
    public InterfaceC1631620sYq<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> onSelected;
    public int pendingCount;
    public List<UserInvitee> preSelectedUser;

    public C343930De3() {
        this(null, 0, null, null, 15, null);
    }

    public final void setExtras(Map<String, ? extends Object> map) {
        this.extras = map;
    }

    public final void setOnSelected(InterfaceC1631620sYq<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq) {
        this.onSelected = interfaceC1631620sYq;
    }

    public final void setPendingCount(int i) {
        this.pendingCount = i;
    }

    public final void setPreSelectedUser(List<UserInvitee> list) {
        this.preSelectedUser = list;
    }

    public C343930De3(List<UserInvitee> list, int i, InterfaceC1631620sYq<? super List<UserInvitee>, ? super List<UserInvitee>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, Map<String, ? extends Object> map) {
        this.preSelectedUser = list;
        this.pendingCount = i;
        this.onSelected = interfaceC1631620sYq;
        this.extras = map;
    }

    public C343930De3(List list, int i, InterfaceC1631620sYq interfaceC1631620sYq, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : interfaceC1631620sYq, (i2 & 8) != 0 ? C2097608Jq.LJ() : map);
    }
}
