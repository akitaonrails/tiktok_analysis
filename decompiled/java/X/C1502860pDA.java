package X;

import android.util.Pair;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502860pDA {
    public static final C1502860pDA LIZ = new C1502860pDA();

    public static C443120HZe LIZ(C1502870pDB c1502870pDB) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(new C2089008Gi(c1502870pDB.LIZ).LJ(), linkedHashMap);
        return new C443120HZe(pairLIZJ.first, pairLIZJ.second, linkedHashMap);
    }

    public static List LIZIZ(C1502870pDB c1502870pDB) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap<String, String> linkedHashMap = c1502870pDB.LIZIZ;
        if (linkedHashMap != null) {
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                arrayList.add(new C080U(entry.getKey(), entry.getValue()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.bytedance.retrofit2.mime.MultipartTypedOutput] */
    public static TypedOutput LIZJ(C1502870pDB c1502870pDB) {
        C259800zU c259800zU = new C259800zU();
        LinkedHashMap<String, File> linkedHashMap = c1502870pDB.LJ;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            ?? multipartTypedOutput = new MultipartTypedOutput();
            Map<String, String> map = c1502870pDB.LIZLLL;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    multipartTypedOutput.addPart(entry.getKey(), new TypedString(entry.getValue()));
                }
            }
            for (Map.Entry<String, File> entry2 : linkedHashMap.entrySet()) {
                multipartTypedOutput.addPart(entry2.getKey(), new TypedFile(null, entry2.getValue()));
            }
            c259800zU.element = multipartTypedOutput;
        }
        return (TypedOutput) c259800zU.element;
    }
}
