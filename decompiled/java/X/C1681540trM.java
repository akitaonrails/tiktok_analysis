package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0trM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681540trM {
    public static final float LJIIJ;
    public static final float LJIIL;
    public static final float LJIJJ;
    public static final float LJIJJLI;
    public static final List<C1668650tWZ> LJJIFFI;
    public static final float LJJIII;
    public static final float LJJIIJZLJL;
    public static final float LJJIIZ;
    public static final float LJJIJ;
    public static final C1677710tlB LIZ = new C1677710tlB(0.0f, 0.44f, 0.5f, 0.98f);
    public static final C1677710tlB LIZIZ = new C1677710tlB(0.33f, 0.0f, 0.67f, 1.0f);
    public static final C1677710tlB LIZJ = new C1677710tlB(0.4f, 0.8f, 0.74f, 1.0f);
    public static final float LIZLLL = 298;
    public static final float LJ = 267;
    public static final float LJFF = 166;
    public static final float LJI = 60;
    public static final float LJII = 110;
    public static final float LJIIIIZZ = 76;
    public static final float LJIIIZ = 122;
    public static final float LJIIJJI = 124;
    public static final float LJIILIIL = 82;
    public static final float LJIILJJIL = 252;
    public static final float LJIILL = 67;
    public static final float LJIILLIIL = 284;
    public static final float LJIIZILJ = 452;
    public static final long LJIJ = C1685850tyJ.LIZLLL(4279242768L);
    public static final long LJIJI = C1685910tyP.LIZJ(0.62f, C1685910tyP.LIZIZ);
    public static final long LJIL = C1685850tyJ.LIZLLL(4294506744L);
    public static final long LJJ = C1685850tyJ.LIZIZ(2048268323);
    public static final long LJJI = C1685850tyJ.LIZLLL(4279638051L);
    public static final float LJJII = 3;
    public static final float LJJIIJ = 17;
    public static final float LJJIIZI = 74;
    public static final float LJJIJIIJI = 90;
    public static final float LJJIJIIJIL = 80;
    public static final float LJJIJIL = 20;
    public static final long LJJIJL = C1685850tyJ.LIZLLL(4291875024L);

    static {
        float f = 83;
        LJIIJ = f;
        LJIIL = f;
        float f2 = 140;
        LJIJJ = f2;
        float f3 = 8;
        LJIJJLI = (f2 * 0.8035f) + f3;
        LJJIFFI = C1697810uHb.LJIIJJI(new C1668650tWZ(f3), new C1668650tWZ(14), new C1668650tWZ(10));
        float f4 = 2;
        LJJIII = f4;
        float f5 = 190;
        LJJIIJZLJL = f5;
        float f6 = 150;
        LJJIIZ = f6;
        LJJIJ = 50 - ((f5 - f6) / f4);
    }

    public static final boolean LIZ(ImageModel imageModel) {
        List<String> listLIZ;
        if (imageModel == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || listLIZ.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            if (!a0.LJJJIL(it2.next())) {
                return true;
            }
        }
        return false;
    }
}
