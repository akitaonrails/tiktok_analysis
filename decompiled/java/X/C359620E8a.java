package X;

import com.ss.ugc.android.editor.track.TrackShowType;

/* JADX INFO: renamed from: X.0E8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359620E8a {
    public final TrackShowType LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final boolean LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359620E8a)) {
            return false;
        }
        C359620E8a c359620E8a = (C359620E8a) obj;
        return this.LIZ == c359620E8a.LIZ && Float.compare(this.LIZIZ, c359620E8a.LIZIZ) == 0 && Float.compare(this.LIZJ, c359620E8a.LIZJ) == 0 && Float.compare(this.LIZLLL, c359620E8a.LIZLLL) == 0 && Float.compare(this.LJ, c359620E8a.LJ) == 0 && Float.compare(this.LJFF, c359620E8a.LJFF) == 0 && this.LJI == c359620E8a.LJI && this.LJII == c359620E8a.LJII && Float.compare(this.LJIIIIZZ, c359620E8a.LJIIIIZZ) == 0 && Float.compare(this.LJIIIZ, c359620E8a.LJIIIZ) == 0 && this.LJIIJ == c359620E8a.LJIIJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C359620E8a(TrackShowType trackShowType, float f, float f2, float f3, float f4, int i) {
        boolean z;
        boolean z2;
        if ((i & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(trackShowType, f, 0.0f, f2, f3, f4, z, z2, 0.0f, 0.0f, false);
    }

    public static C359620E8a LIZ(C359620E8a c359620E8a, TrackShowType trackShowType, float f, float f2, float f3, float f4, boolean z, boolean z2, int i) {
        float f5;
        boolean z3;
        float f6;
        float f7;
        boolean z4 = z2;
        boolean z5 = z;
        float f8 = f3;
        float f9 = f2;
        float f10 = f;
        float f11 = f4;
        TrackShowType trackShowType2 = trackShowType;
        if ((i & 1) != 0) {
            trackShowType2 = c359620E8a.LIZ;
        }
        if ((i & 2) != 0) {
            f10 = c359620E8a.LIZIZ;
        }
        if ((i & 4) != 0) {
            f9 = c359620E8a.LIZJ;
        }
        if ((i & 8) != 0) {
            f8 = c359620E8a.LIZLLL;
        }
        if ((i & 16) != 0) {
            f5 = c359620E8a.LJ;
        } else {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f11 = c359620E8a.LJFF;
        }
        if ((i & 64) != 0) {
            z3 = c359620E8a.LJI;
        } else {
            z3 = true;
        }
        if ((i & 128) != 0) {
            z5 = c359620E8a.LJII;
        }
        if ((i & 256) != 0) {
            f6 = c359620E8a.LJIIIIZZ;
        } else {
            f6 = 0.0f;
        }
        if ((i & 512) != 0) {
            f7 = c359620E8a.LJIIIZ;
        } else {
            f7 = 0.0f;
        }
        if ((i & 1024) != 0) {
            z4 = c359620E8a.LJIIJ;
        }
        c359620E8a.getClass();
        return new C359620E8a(trackShowType2, f10, f9, f8, f5, f11, z3, z5, f6, f7, z4);
    }

    public C359620E8a(TrackShowType trackShowType, float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, boolean z3) {
        this.LIZ = trackShowType;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = z;
        this.LJII = z2;
        this.LJIIIIZZ = f6;
        this.LJIIIZ = f7;
        this.LJIIJ = z3;
    }
}
