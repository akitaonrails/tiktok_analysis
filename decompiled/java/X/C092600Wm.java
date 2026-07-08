package X;

import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C092600Wm {
    public final String LIZ;
    public final LynxCommonData.Layout LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C092600Wm)) {
            return false;
        }
        C092600Wm c092600Wm = (C092600Wm) obj;
        return Intrinsics.LJFF(this.LIZ, c092600Wm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c092600Wm.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxLayoutChangePayload(trigger=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C092600Wm(String str, LynxCommonData.Layout layout) {
        this.LIZ = str;
        this.LIZIZ = layout;
    }
}
