package X;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0i1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226850i1z implements Serializable {
    public String enterFrom;
    public String enterMethod;
    public List<Integer> inviteTypeList;
    public Long roomId;
    public Integer timeRange;

    public C1226850i1z() {
        this("", "", null, null, null);
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setInviteTypeList(List<Integer> list) {
        this.inviteTypeList = list;
    }

    public final void setRoomId(Long l) {
        this.roomId = l;
    }

    public final void setTimeRange(Integer num) {
        this.timeRange = num;
    }

    public C1226850i1z(String str, String str2, List<Integer> list, Integer num, Long l) {
        this.enterFrom = str;
        this.enterMethod = str2;
        this.inviteTypeList = list;
        this.timeRange = num;
        this.roomId = l;
    }
}
