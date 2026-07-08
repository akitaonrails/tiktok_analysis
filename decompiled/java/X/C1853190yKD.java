package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0yKD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1853190yKD {
    public final File LIZ = C786410Ut5.W3();
    public final Map<String, Set<String>> LIZIZ = new LinkedHashMap();

    public final boolean LIZ(MediaModel mediaModel) {
        String str = mediaModel.relativePath;
        String str2 = mediaModel.fileName;
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return true;
        }
        C0VSJ c0vsj = new C0VSJ(this.LIZ, str);
        Map<String, Set<String>> map = this.LIZIZ;
        String path = c0vsj.getPath();
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object objLJJLIIIJLJLI = linkedHashMap.get(path);
        if (objLJJLIIIJLJLI == null) {
            String[] list = c0vsj.list();
            if (list != null) {
                objLJJLIIIJLJLI = C13LQ.LJJLIIIJLJLI(list);
            } else {
                objLJJLIIIJLJLI = null;
            }
            linkedHashMap.put(path, objLJJLIIIJLJLI);
        }
        Set set = (Set) objLJJLIIIJLJLI;
        if (set == null) {
            return true;
        }
        return set.contains(str2);
    }
}
