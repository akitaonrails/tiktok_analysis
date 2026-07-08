package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: renamed from: X.09CI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C09CI {
    public static <T> void LIZ(Gson gson, C09CU c09cu, List<T> list, Class<T> cls) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return;
        }
        TypeAdapter<T> typeAdapterLJIIJ = gson.LJIIJ(cls);
        c09cu.LIZ();
        while (c09cu.LJIIZILJ()) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                list.add(typeAdapterLJIIJ.read(c09cu));
            }
        }
        c09cu.LJI();
    }

    public static <T> void LIZIZ(Gson gson, C09DL c09dl, List<T> list, Class<T> cls) {
        if (list == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZIZ();
        if (!list.isEmpty()) {
            TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(cls);
            for (T t : list) {
                if (t != null) {
                    typeAdapterLJIIJ.write(c09dl, t);
                }
            }
        }
        c09dl.LJI();
    }
}
