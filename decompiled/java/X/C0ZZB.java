package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZB implements C0ZZ3 {
    public final InterfaceC460300I3g LIZ;
    public final C0I4Y<InterfaceC460300I3g> LIZIZ;
    public final C1622006Ws<LiveRoomStruct> LIZJ;
    public final String LIZLLL;
    public final C1622006Ws<Function0<Unit>> LJ;
    public final C1622006Ws<Boolean> LJFF;

    public C0ZZB() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZB)) {
            return false;
        }
        C0ZZB c0zzb = (C0ZZB) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zzb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zzb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zzb.LIZLLL) && Intrinsics.LJFF(this.LJ, c0zzb.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        this.LIZJ.getClass();
        int i = iHashCode * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (i + (str == null ? 0 : str.hashCode())) * 31;
        this.LJ.getClass();
        return iHashCode2;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InLive(liveTitle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", liveContent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", room=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shareLiveIntent=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onShow=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZZ3
    public final C1622006Ws<Boolean> LIZ() {
        return this.LJFF;
    }

    public C0ZZB(InterfaceC460300I3g interfaceC460300I3g, C0I4Y c0i4y, C1622006Ws c1622006Ws, String str, C1622006Ws c1622006Ws2, int i) {
        str = (i & 8) != 0 ? null : str;
        c1622006Ws2 = (i & 16) != 0 ? new C1622006Ws(null) : c1622006Ws2;
        this.LIZ = interfaceC460300I3g;
        this.LIZIZ = c0i4y;
        this.LIZJ = c1622006Ws;
        this.LIZLLL = str;
        this.LJ = c1622006Ws2;
        this.LJFF = new C1622006Ws<>(Boolean.TRUE);
    }
}
