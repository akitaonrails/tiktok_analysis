package com.bytedance.android.live.liveinteract.multihost.biz.lynx.event;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EventParams$LinkedListChangedV2 {

    @C09CT("added_uids")
    public final List<String> addedUids;

    @C09CT("linked_user_list")
    public final List<LynxCommonData.LinkedUser> linkedUserList;

    @C09CT("removed_uids")
    public final List<String> removedUids;

    public EventParams$LinkedListChangedV2() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParams$LinkedListChangedV2)) {
            return false;
        }
        EventParams$LinkedListChangedV2 eventParams$LinkedListChangedV2 = (EventParams$LinkedListChangedV2) obj;
        return Intrinsics.LJFF(this.linkedUserList, eventParams$LinkedListChangedV2.linkedUserList) && Intrinsics.LJFF(this.addedUids, eventParams$LinkedListChangedV2.addedUids) && Intrinsics.LJFF(this.removedUids, eventParams$LinkedListChangedV2.removedUids);
    }

    public final int hashCode() {
        return (((this.linkedUserList.hashCode() * 31) + this.addedUids.hashCode()) * 31) + this.removedUids.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LinkedListChangedV2(linkedUserList=");
        sbLIZ.append(this.linkedUserList);
        sbLIZ.append(", addedUids=");
        sbLIZ.append(this.addedUids);
        sbLIZ.append(", removedUids=");
        sbLIZ.append(this.removedUids);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventParams$LinkedListChangedV2(List<LynxCommonData.LinkedUser> list, List<String> list2, List<String> list3) {
        this.linkedUserList = list;
        this.addedUids = list2;
        this.removedUids = list3;
    }

    public EventParams$LinkedListChangedV2(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}
