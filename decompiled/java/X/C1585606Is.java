package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1585606Is implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<SpacePost> LLILLJJLI;

    public C1585606Is() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1585606Is)) {
            return false;
        }
        C1585606Is c1585606Is = (C1585606Is) obj;
        return Intrinsics.LJFF(this.LL, c1585606Is.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1585606Is.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<SpacePost> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingVMState(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", spacePost=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1585606Is(int i) {
        this(null, "");
    }

    public C1585606Is(C291001Au c291001Au, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
    }
}
