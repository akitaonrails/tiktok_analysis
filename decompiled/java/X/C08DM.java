package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08DM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C08DM {
    public static final int LIZ(String str) {
        int iLJJIZ;
        int iLJJIZ2 = a0.LJJIZ(str, File.separatorChar, 0, false, 4);
        if (iLJJIZ2 == 0) {
            if (str.length() > 1) {
                char cCharAt = str.charAt(1);
                char c = File.separatorChar;
                if (cCharAt == c && (iLJJIZ = a0.LJJIZ(str, c, 2, false, 4)) >= 0) {
                    int iLJJIZ3 = a0.LJJIZ(str, File.separatorChar, iLJJIZ + 1, false, 4);
                    if (iLJJIZ3 >= 0) {
                        return iLJJIZ3 + 1;
                    }
                    return str.length();
                }
            }
            return 1;
        }
        if (iLJJIZ2 > 0) {
            if (str.charAt(iLJJIZ2 - 1) == ':') {
                return iLJJIZ2 + 1;
            }
        } else if (iLJJIZ2 == -1 && a0.LJJIJIIJIL(str, ':')) {
            return str.length();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.13BV] */
    public static final C2085708Fb LIZIZ(File file) {
        ?? arrayList;
        String path = file.getPath();
        int iLIZ = LIZ(path);
        String strSubstring = path.substring(0, iLIZ);
        String strSubstring2 = path.substring(iLIZ);
        if (strSubstring2.length() == 0) {
            arrayList = C13BV.INSTANCE;
        } else {
            List listLJJLIIIJ = a0.LJJLIIIJ(strSubstring2, new char[]{File.separatorChar}, false, 0, 6);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(new File((String) it2.next()));
            }
        }
        return new C2085708Fb(new File(strSubstring), arrayList);
    }
}
