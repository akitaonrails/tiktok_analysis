package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159750gHl implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1814370xJb> LL;
    public final C291001Au<Pair<Board, Integer>> LLILLJJLI;
    public final C291001Au<C443120HZe<Board, Bitmap, Integer>> LLILLL;

    public C1159750gHl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159750gHl)) {
            return false;
        }
        C1159750gHl c1159750gHl = (C1159750gHl) obj;
        return Intrinsics.LJFF(this.LL, c1159750gHl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159750gHl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159750gHl.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveIntelligentBoardsUpsertState(upsertState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", readyToUpsert=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", forceToUpsert=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159750gHl(int i) {
        this(C491101vh.LIZ, new C291001Au(null), new C291001Au(null));
    }

    public C1159750gHl(AbstractC1623806Xk<C1814370xJb> abstractC1623806Xk, C291001Au<Pair<Board, Integer>> c291001Au, C291001Au<C443120HZe<Board, Bitmap, Integer>> c291001Au2) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }

    public static C1159750gHl LIZ(C1159750gHl c1159750gHl, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, int i) {
        C291001Au<Pair<Board, Integer>> c291001Au2;
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1159750gHl.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1159750gHl.LLILLJJLI;
        } else {
            c291001Au2 = null;
        }
        if ((i & 4) != 0) {
            c291001Au = c1159750gHl.LLILLL;
        }
        c1159750gHl.getClass();
        return new C1159750gHl(abstractC1623806Xk, c291001Au2, c291001Au);
    }
}
