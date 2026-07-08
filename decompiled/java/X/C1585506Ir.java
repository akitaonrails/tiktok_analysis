package X;

import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1585506Ir implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<SpacePost> LLILLJJLI;

    public C1585506Ir() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1585506Ir)) {
            return false;
        }
        C1585506Ir c1585506Ir = (C1585506Ir) obj;
        return Intrinsics.LJFF(this.LL, c1585506Ir.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1585506Ir.LLILLJJLI);
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

    public /* synthetic */ C1585506Ir(int i) {
        this(null, "");
    }

    public C1585506Ir(C291001Au c291001Au, String str) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
    }
}
