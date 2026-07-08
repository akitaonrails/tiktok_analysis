package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0LvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558570LvT {
    public final CreativeInfo LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C558570LvT(CreativeInfo creativeInfo) {
        boolean z = false;
        this(creativeInfo, true, z, z, 12);
    }

    public C558570LvT(CreativeInfo creativeInfo, boolean z, boolean z2, boolean z3) {
        this.LIZ = creativeInfo;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }

    public /* synthetic */ C558570LvT(CreativeInfo creativeInfo, boolean z, boolean z2, boolean z3, int i) {
        this(creativeInfo, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
