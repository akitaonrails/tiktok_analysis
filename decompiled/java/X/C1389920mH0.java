package X;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389920mH0 {
    public Long LIZ;
    public CharSequence LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public long LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public WeakReference<Function0<Unit>> LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public Integer LJIIL;

    public final String toString() {
        return "TuxToastBaseBundle(expireTime=" + this.LIZ + ", message=" + ((Object) this.LIZIZ) + ", icon=" + this.LIZJ + ", iconColor=" + this.LIZLLL + ", duration=" + this.LJ + ", hasShowAnimation=" + this.LJFF + ", hasDismissAnimation=" + this.LJI + ", acrossActivities=" + this.LJII + ", uniqueIdForReuse=" + this.LJIIIIZZ + ", dismissListener=" + this.LJIIIZ + ", tempMax=" + this.LJIIJ + ", isDismissing=" + this.LJIIJJI + ", forceThemeRes=" + this.LJIIL + ')';
    }

    public C1389920mH0(CharSequence charSequence, Integer num, Integer num2, int i) {
        long j;
        boolean z;
        charSequence = (i & 2) != 0 ? null : charSequence;
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 8) != 0 ? null : num2;
        if ((i & 16) != 0) {
            j = 3000;
        } else {
            j = 0;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 64) != 0;
        this.LIZ = null;
        this.LIZIZ = charSequence;
        this.LIZJ = num;
        this.LIZLLL = num2;
        this.LJ = j;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = false;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = null;
        this.LJIIJ = 0;
        this.LJIIJJI = false;
        this.LJIIL = null;
    }
}
