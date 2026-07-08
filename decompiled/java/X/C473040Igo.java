package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Igo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C473040Igo {
    public static <T> ArrayList<T> LIZ(Gson gson, C09CU c09cu, Class<T> cls) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TypeAdapter<T> typeAdapterLJIIJ = gson.LJIIJ(cls);
        ArrayList<T> arrayList = new ArrayList<>();
        c09cu.LIZ();
        while (c09cu.LJIIZILJ()) {
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                arrayList.add(typeAdapterLJIIJ.read(c09cu));
            }
        }
        c09cu.LJI();
        return arrayList;
    }

    public static <T> HashMap<String, T> LIZIZ(Gson gson, C09CU c09cu, Class<T> cls) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TypeAdapter<T> typeAdapterLJIIJ = gson.LJIIJ(cls);
        HashMap<String, T> map = new HashMap<>();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                map.put(strLJJJJ, typeAdapterLJIIJ.read(c09cu));
            }
        }
        c09cu.LJII();
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> LinkedHashMap<K, V> LIZJ(Gson gson, C09CU c09cu, Class<K> cls, Class<V> cls2) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(cls);
        TypeAdapter typeAdapterLJIIJ2 = gson.LJIIJ(cls2);
        C082J c082j = (LinkedHashMap<K, V>) new LinkedHashMap();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            Object obj = typeAdapterLJIIJ.read(c09cu);
            if (c09cu.LJJLIIIJ() == C09D6.NULL) {
                c09cu.LJJJJJL();
            } else {
                c082j.put(obj, typeAdapterLJIIJ2.read(c09cu));
            }
        }
        c09cu.LJII();
        return c082j;
    }

    public static <T> void LIZLLL(Gson gson, C09DL c09dl, List<T> list, Class<T> cls) {
        if (list == null) {
            c09dl.LJIJJ();
            return;
        }
        TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(cls);
        c09dl.LIZIZ();
        for (T t : list) {
            if (t != null) {
                typeAdapterLJIIJ.write(c09dl, t);
            }
        }
        c09dl.LJI();
    }

    public static <K, V> void LJ(Gson gson, C09DL c09dl, Map<K, V> map, Class<V> cls) {
        if (map == null) {
            c09dl.LJIJJ();
            return;
        }
        TypeAdapter typeAdapterLJIIJ = gson.LJIIJ(cls);
        c09dl.LIZLLL();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            c09dl.LJIILLIIL(String.valueOf(entry.getKey()));
            typeAdapterLJIIJ.write(c09dl, entry.getValue());
        }
        c09dl.LJII();
    }
}
