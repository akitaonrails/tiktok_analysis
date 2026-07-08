package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0cOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010280cOg {
    public static InterfaceC665370Q7z LIZIZ;
    public static List<Integer> LIZJ;
    public static List<Long> LIZLLL;
    public static List<Long> LJ;
    public static int LJFF;
    public static int LJI;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static long LJIIL;
    public static final C1010280cOg LIZ = new C1010280cOg();
    public static String LJII = "auto";
    public static boolean LJIILIIL = true;

    public static Integer LIZ(int i) {
        List<Integer> list = LIZJ;
        if (list != null && i >= 0 && i < list.size()) {
            return (Integer) ListProtector.get(list, i);
        }
        return null;
    }
}
