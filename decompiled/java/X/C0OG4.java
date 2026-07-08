package X;

import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OG4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OG4 implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Integer> LL;
    public final CollectMusicResponse LLILLJJLI;
    public final Boolean LLILLL;

    public C0OG4() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OG4)) {
            return false;
        }
        C0OG4 c0og4 = (C0OG4) obj;
        return Intrinsics.LJFF(this.LL, c0og4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0og4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0og4.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        CollectMusicResponse collectMusicResponse = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (collectMusicResponse == null ? 0 : collectMusicResponse.hashCode())) * 31;
        Boolean bool = this.LLILLL;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCollectState(collectState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", clickCollect=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OG4(C1623606Xi c1623606Xi, int i) {
        this((i & 1) != 0 ? new C1623606Xi(0) : c1623606Xi, null, null);
    }

    public C0OG4(AbstractC1623806Xk<Integer> abstractC1623806Xk, CollectMusicResponse collectMusicResponse, Boolean bool) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = collectMusicResponse;
        this.LLILLL = bool;
    }

    public static C0OG4 LIZ(C0OG4 c0og4, AbstractC1623806Xk abstractC1623806Xk, CollectMusicResponse collectMusicResponse, Boolean bool, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c0og4.LL;
        }
        if ((i & 2) != 0) {
            collectMusicResponse = c0og4.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            bool = c0og4.LLILLL;
        }
        c0og4.getClass();
        return new C0OG4(abstractC1623806Xk, collectMusicResponse, bool);
    }
}
