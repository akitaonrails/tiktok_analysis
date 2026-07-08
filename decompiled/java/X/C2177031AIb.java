package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.1AIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177031AIb {
    public final Context LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final C1AXQ LJFF;
    public final boolean LJI;
    public final EnumC945310aht LJII;
    public final boolean LJIIIIZZ;
    public final Drawable LJIIIZ;
    public final C965220bE0 LJIIJ;

    public final String toString() {
        return "Config(context=" + this.LIZ + ", scene=" + this.LIZIZ + ", roomId=" + this.LIZJ + ", liveType=" + this.LIZLLL + ", owner=" + this.LJ + ", provider=" + this.LJFF + ", isOnlyCalculatePlayerRange=" + this.LJI + ", pageType=" + this.LJII + ", isRoomOwner=" + this.LJIIIIZZ + ", bgDrawable=" + this.LJIIIZ + ", identifyLayoutHelper=" + this.LJIIJ + ')';
    }

    public /* synthetic */ C2177031AIb(Context context, int i, long j, String str, long j2, C1AXQ c1axq, boolean z, EnumC945310aht enumC945310aht, boolean z2) {
        this(context, i, j, str, j2, c1axq, z, enumC945310aht, z2, null, null);
    }

    public C2177031AIb(Context context, int i, long j, String str, long j2, C1AXQ c1axq, boolean z, EnumC945310aht enumC945310aht, boolean z2, Drawable drawable, C965220bE0 c965220bE0) {
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str;
        this.LJ = j2;
        this.LJFF = c1axq;
        this.LJI = z;
        this.LJII = enumC945310aht;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = drawable;
        this.LJIIJ = c965220bE0;
    }
}
