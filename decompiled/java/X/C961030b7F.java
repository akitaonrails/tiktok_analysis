package X;

import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: renamed from: X.0b7F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961030b7F {
    public final InterfaceC961690b8J LIZ;
    public final Object LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostSectionCacheEntry(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ttlMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isClickPreload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isOneTimeUsable=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final EnumC961090b7L LIZIZ() {
        return this.LJ ? EnumC961090b7L.CLICK_CACHE : this.LJI ? EnumC961090b7L.PRELOAD_CACHE : EnumC961090b7L.LAST_CACHE;
    }

    public static C961030b7F LIZ(C961030b7F c961030b7F, BaseResponse baseResponse) {
        InterfaceC961690b8J interfaceC961690b8J = c961030b7F.LIZ;
        long j = c961030b7F.LIZJ;
        long j2 = c961030b7F.LIZLLL;
        boolean z = c961030b7F.LJ;
        boolean z2 = c961030b7F.LJFF;
        boolean z3 = c961030b7F.LJI;
        c961030b7F.getClass();
        return new C961030b7F(interfaceC961690b8J, baseResponse, j, j2, z, z2, z3);
    }

    public C961030b7F(InterfaceC961690b8J interfaceC961690b8J, Object obj, long j, long j2, boolean z, boolean z2, boolean z3) {
        this.LIZ = interfaceC961690b8J;
        this.LIZIZ = obj;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
    }
}
