package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.09CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C09CJ {
    public static <T> void LIZ(Gson gson, C09CU c09cu, Set<T> set, Class<T> cls) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return;
        }
        TypeAdapter<T> typeAdapterLJIIJ = gson.LJIIJ(cls);
        c09cu.LIZ();
        while (c09cu.LJIIZILJ()) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                ((HashSet) set).add(typeAdapterLJIIJ.read(c09cu));
            }
        }
        c09cu.LJI();
    }

    public static <T> void LIZIZ(Gson gson, C09DL c09dl, Set<T> set, Class<T> cls) {
        if (set == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZIZ();
        if (!set.isEmpty()) {
            TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(cls);
            for (T t : set) {
                if (t != null) {
                    typeAdapterLJIIJ.write(c09dl, t);
                }
            }
        }
        c09dl.LJI();
    }
}
