package X;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: X.0WN7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WN7 {
    public final C828420Wee LIZ;
    public final String LIZIZ;
    public final Uri LIZJ;
    public final String LIZLLL;
    public final Uri LJ;
    public final int LJFF;
    public final int LJI;
    public final Context LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII.hashCode()) * 31;
        boolean z = this.LJIIIIZZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode + r0) * 31;
        String str = this.LJIIIZ;
        int iHashCode2 = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.LJIIJ) * 31;
        String str2 = this.LJIIJJI;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "WebRouterEvent(securityEvent=" + this.LIZ + ", outUrl=" + this.LIZIZ + ", outUri=" + this.LIZJ + ", realUrl=" + this.LIZLLL + ", realUri=" + this.LJ + ", webRuntime=" + this.LJFF + ", dataflowId=" + this.LJI + ", context=" + this.LJII + ", isFirstParty=" + this.LJIIIIZZ + ", containerId=" + this.LJIIIZ + ", uiType=" + this.LJIIJ + ", sparkRuntime=" + this.LJIIJJI + ')';
    }

    public /* synthetic */ C0WN7(C828420Wee c828420Wee, String str, Uri uri, String str2, Uri uri2, int i, int i2, Context context, boolean z) {
        this(c828420Wee, str, uri, str2, uri2, i, i2, context, z, null, -1, "");
    }

    public C0WN7(C828420Wee c828420Wee, String str, Uri uri, String str2, Uri uri2, int i, int i2, Context context, boolean z, String str3, int i3, String str4) {
        this.LIZ = c828420Wee;
        this.LIZIZ = str;
        this.LIZJ = uri;
        this.LIZLLL = str2;
        this.LJ = uri2;
        this.LJFF = i;
        this.LJI = i2;
        this.LJII = context;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str3;
        this.LJIIJ = i3;
        this.LJIIJJI = str4;
    }
}
