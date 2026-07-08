package com.bytedance.android.live.liveinteract.multihost.biz.lynx.event;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EventParams$LayoutDidChange {

    @C09CT("layout")
    public final LynxCommonData.Layout layout;

    @C09CT("trigger")
    public final String trigger;

    public EventParams$LayoutDidChange() {
        this("", new LynxCommonData.Layout(null, new LynxCommonData.LayoutDiffInfo(null, null, 3, null), null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventParams$LayoutDidChange)) {
            return false;
        }
        EventParams$LayoutDidChange eventParams$LayoutDidChange = (EventParams$LayoutDidChange) obj;
        return Intrinsics.LJFF(this.trigger, eventParams$LayoutDidChange.trigger) && Intrinsics.LJFF(this.layout, eventParams$LayoutDidChange.layout);
    }

    public final int hashCode() {
        return (this.trigger.hashCode() * 31) + this.layout.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutDidChange(trigger=");
        sbLIZ.append(this.trigger);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.layout);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EventParams$LayoutDidChange(String str, LynxCommonData.Layout layout) {
        this.trigger = str;
        this.layout = layout;
    }
}
