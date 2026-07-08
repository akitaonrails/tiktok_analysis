package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1A47, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A47 {
    public final String LIZ = "";
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final long LJFF;
    public final int LJI;
    public final boolean LJII;
    public final ArrayList<C1A49> LJIIIIZZ;
    public final C1A49 LJIIIZ;
    public boolean LJIIJ;

    public final void LIZIZ() {
        if (!(!this.LJIIJ)) {
            C1696250uF5.LIZIZ("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        C1A49 c1a49 = (C1A49) ListProtector.remove(this.LJIIIIZZ, r1.size() - 1);
        ((C1A49) ListProtector.get(this.LJIIIIZZ, r2.size() - 1)).LJIIIZ.add(new C1696760uFu(c1a49.LIZ, c1a49.LIZIZ, c1a49.LIZJ, c1a49.LIZLLL, c1a49.LJ, c1a49.LJFF, c1a49.LJI, c1a49.LJII, c1a49.LJIIIIZZ, c1a49.LJIIIZ));
    }

    public C1A47(float f, float f2, float f3, float f4, long j, int i, boolean z) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = j;
        this.LJI = i;
        this.LJII = z;
        ArrayList<C1A49> arrayList = new ArrayList<>();
        this.LJIIIIZZ = arrayList;
        C1A49 c1a49 = new C1A49(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.LJIIIZ = c1a49;
        arrayList.add(c1a49);
    }

    public final void LIZ(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
        if (!(!this.LJIIJ)) {
            C1696250uF5.LIZIZ("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        this.LJIIIIZZ.add(new C1A49(str, f, f2, f3, f4, f5, f6, f7, list, 512));
    }
}
