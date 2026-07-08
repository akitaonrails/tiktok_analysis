package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.08Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2134008Xq implements C08T3 {
    public static boolean LIZJ(ClassLoader classLoader, C0VSJ c0vsj, File file, boolean z, InterfaceC2134908Xz interfaceC2134908Xz, String str, C08Y1 c08y1) {
        ArrayList arrayList = new ArrayList();
        Object objLIZ = new C2133708Xn(Object.class, classLoader, C2133408Xk.LIZLLL(classLoader, "pathList")).LIZ();
        C2133808Xo c2133808Xo = new C2133808Xo(Object.class, objLIZ, C2133408Xk.LIZLLL(objLIZ, "dexElements"));
        List listAsList = Arrays.asList((Object[]) c2133808Xo.LIZ());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAsList) {
            arrayList2.add(new C2133708Xn(File.class, obj, C2133408Xk.LIZLLL(obj, str)).LIZ());
        }
        if (arrayList2.contains(file)) {
            return true;
        }
        if (!z && !c08y1.LIZ(objLIZ, file, c0vsj)) {
            file.getPath();
            return false;
        }
        c2133808Xo.LIZJ(Arrays.asList(interfaceC2134908Xz.LIZ(objLIZ, new ArrayList(Collections.singleton(file)), c0vsj, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        C08T4 c08t4 = new C08T4("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(c08t4, ListProtector.get(arrayList, i));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        new C2133808Xo(IOException.class, objLIZ, C2133408Xk.LIZLLL(objLIZ, "dexElementsSuppressedExceptions")).LIZJ(arrayList);
        throw c08t4;
    }
}
