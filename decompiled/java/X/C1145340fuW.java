package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145340fuW implements InterfaceC0148002o {
    public final C291001Au<Board> LL;
    public final int LLILLJJLI;

    public C1145340fuW() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145340fuW)) {
            return false;
        }
        C1145340fuW c1145340fuW = (C1145340fuW) obj;
        return Intrinsics.LJFF(this.LL, c1145340fuW.LL) && this.LLILLJJLI == c1145340fuW.LLILLJJLI;
    }

    public final int hashCode() {
        C291001Au<Board> c291001Au = this.LL;
        return ((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudienceDecorationDataState(board=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", boardAction=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1145340fuW(int i) {
        this(0, null);
    }

    public C1145340fuW(int i, C291001Au c291001Au) {
        this.LL = c291001Au;
        this.LLILLJJLI = i;
    }
}
