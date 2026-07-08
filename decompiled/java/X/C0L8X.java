package X;

import Y.AComparatorS27S0000000_8;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L8X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L8X {
    public static final C0L8X LIZ = new C0L8X();
    public static boolean LIZIZ;
    public static List<File> LIZJ;
    public static long LIZLLL;

    public final synchronized void LIZIZ() {
        C0VSJ c0vsj = new C0VSJ(C353030Dsj.LIZ);
        if (!c0vsj.exists() || !c0vsj.isDirectory()) {
            throw new IllegalStateException("worksapce folder not exist");
        }
        ArrayList arrayList = new ArrayList(C13LQ.LJJLIIIIJ(new AComparatorS27S0000000_8(6), c0vsj.listFiles()));
        LIZJ = arrayList;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZLLL += ((File) it2.next()).length();
        }
        LIZIZ = true;
    }

    public final synchronized void LIZ(String str) {
        if (!LIZIZ) {
            LIZIZ();
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            List<File> list = LIZJ;
            if (list == null) {
                list = null;
            }
            list.add(c0vsj);
            LIZLLL += c0vsj.length();
            while (LIZLLL > 1048576000) {
                List<File> list2 = LIZJ;
                if (list2 == null) {
                    list2 = null;
                }
                File file = (File) ListProtector.get(list2, 0);
                long length = file.length();
                C2473009ma.LIZ.getClass();
                C2473009ma.LJIIIIZZ(file);
                LIZLLL -= length;
                List<File> list3 = LIZJ;
                if (list3 == null) {
                    list3 = null;
                }
                ListProtector.remove(list3, 0);
            }
        } else {
            throw new IllegalStateException("file to add not exist");
        }
    }

    public final synchronized boolean LIZJ(String str) {
        if (!LIZIZ) {
            LIZIZ();
        }
        List<File> list = LIZJ;
        List<File> list2 = null;
        if (list == null) {
            list = null;
        }
        for (File file : list) {
            if (Intrinsics.LJFF(file.getPath(), str) && file.exists()) {
                file.setLastModified(System.currentTimeMillis());
                List<File> list3 = LIZJ;
                if (list3 == null) {
                    list3 = null;
                }
                list3.remove(file);
                List<File> list4 = LIZJ;
                if (list4 != null) {
                    list2 = list4;
                }
                list2.add(file);
                return true;
            }
        }
        return false;
    }
}
