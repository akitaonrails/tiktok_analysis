package com.bytedance.android.live.liveinteract.multihost.biz.lynx.event;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class EventParams$UserStateChanged {

    @C09CT("source")
    public final String source;

    @C09CT("user")
    public final LynxCommonData.LinkedUser user;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParams$UserStateChanged)) {
            return false;
        }
        EventParams$UserStateChanged eventParams$UserStateChanged = (EventParams$UserStateChanged) obj;
        return Intrinsics.LJFF(this.user, eventParams$UserStateChanged.user) && Intrinsics.LJFF(this.source, eventParams$UserStateChanged.source);
    }

    public final int hashCode() {
        return (this.user.hashCode() * 31) + this.source.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserStateChanged(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", source=");
        sbLIZ.append(this.source);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventParams$UserStateChanged(LynxCommonData.LinkedUser linkedUser, String str) {
        this.user = linkedUser;
        this.source = str;
    }
}
