package X;

import com.bytedance.keva.KevaImpl;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1BLT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLT {
    public static String LIZ(String str) {
        Map<String, String> map = C1BLV.LIZ;
        return C1BLV.LIZ(str);
    }

    public static void LIZIZ(C1BLC c1blc) {
        C2203381BLk.LIZ.getClass();
        if (!c1blc.LJI.LJ) {
            KevaImpl.getRepo("dynamic_task_triggered", 0).erase(c1blc.LIZ);
            return;
        }
        List listSingletonList = Collections.singletonList(c1blc.LIZIZ);
        Iterable iterable = c1blc.LJI.LJIIIIZZ;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        List listLJJJJI = C13LP.LJJJJI(C13LP.LJLIL(iterable, listSingletonList));
        C1924107gF c1924107gFLIZ = C1924007gE.LIZ(KevaImpl.getRepo("dynamic_task_triggered", 0).getString(c1blc.LIZ, null));
        if (c1924107gFLIZ == null) {
            c1924107gFLIZ = new C1924107gF(0, 0L, listLJJJJI);
        }
        long jCurrentTimeMillis = c1924107gFLIZ.LIZIZ;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        KevaImpl.getRepo("dynamic_task_triggered", 0).storeString(c1blc.LIZ, new C1924107gF(c1924107gFLIZ.LIZJ + 1, jCurrentTimeMillis, c1924107gFLIZ.LIZ).toString());
    }
}
