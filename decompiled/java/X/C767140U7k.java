package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767140U7k {
    public final String LIZ;
    public final String LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final LiveEffect LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C767140U7k)) {
            return false;
        }
        C767140U7k c767140U7k = (C767140U7k) obj;
        if (!Intrinsics.LJFF(this.LIZ, c767140U7k.LIZ) || this.LIZJ != c767140U7k.LIZJ) {
            return false;
        }
        return true;
    }

    public C767140U7k(String str, String str2, float f, int i, int i2, int i3, LiveEffect liveEffect, long j, boolean z, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = f;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = liveEffect;
        this.LJII = j;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str3;
        this.LJIIJ = str4;
        this.LJIIJJI = str5;
    }
}
