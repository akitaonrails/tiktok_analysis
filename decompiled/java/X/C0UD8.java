package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UD8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UD8 {
    public final long LIZ;
    public final float LIZIZ;
    public final String LIZJ;
    public final LiveEffect LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautyLogBean(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", name=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", liveEffect=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isDefaultValue=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", startTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0UD8(C0UD8 c0ud8) {
        this(c0ud8.LIZ, c0ud8.LIZIZ, c0ud8.LIZJ, c0ud8.LIZLLL, c0ud8.LJ);
    }

    public /* synthetic */ C0UD8(long j, float f, String str, LiveEffect liveEffect, boolean z) {
        this(j, f, str, liveEffect, z, System.currentTimeMillis());
    }

    public C0UD8(long j, float f, String str, LiveEffect liveEffect, boolean z, long j2) {
        this.LIZ = j;
        this.LIZIZ = f;
        this.LIZJ = str;
        this.LIZLLL = liveEffect;
        this.LJ = z;
        this.LJFF = j2;
    }
}
