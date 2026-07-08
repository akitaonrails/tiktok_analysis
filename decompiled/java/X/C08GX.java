package X;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08GX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GX {
    public static void LIZ(File file, HashMap<String, Object> map, List<String> list) {
        String name;
        if (file.getName().startsWith(e3.d)) {
            return;
        }
        if (!C08GN.LIZIZ(list)) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                if (file.getAbsolutePath().startsWith((String) it2.next())) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < file.getName().length(); i++) {
                        sb.append("*");
                    }
                    name = sb.toString();
                }
            }
            name = file.getName();
        } else {
            name = file.getName();
        }
        if (file.isFile()) {
            map.put(name, Long.valueOf(file.length()));
        }
        if (file.isDirectory()) {
            HashMap map2 = new HashMap();
            map.put(name, map2);
            for (String str : file.list()) {
                LIZ(new C0VSJ(file, str), map2, list);
            }
        }
    }

    public static void LIZIZ(C0VSJ c0vsj, BufferedWriter bufferedWriter, List list) throws IOException {
        HashMap map = new HashMap();
        bufferedWriter.write("{");
        bufferedWriter.newLine();
        File[] fileArrListFiles = c0vsj.listFiles();
        for (int i = 0; i < fileArrListFiles.length; i++) {
            map.clear();
            LIZ(fileArrListFiles[i], map, list);
            if (!map.keySet().isEmpty()) {
                LIZJ(map, 1, bufferedWriter);
                if (i + 1 < fileArrListFiles.length) {
                    bufferedWriter.write(",");
                }
            }
        }
        bufferedWriter.write("}");
        bufferedWriter.flush();
    }

    public static void LIZJ(HashMap<String, Object> map, int i, BufferedWriter bufferedWriter) throws IOException {
        int size = map.keySet().size();
        int i2 = 0;
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            i2++;
            if (obj instanceof Long) {
                for (int i3 = 0; i3 < i + 1; i3++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(C786410Ut5.j4("\"%s\": %d", new Object[]{str.replaceAll("\n", ""), Long.valueOf(((Long) obj).longValue())}));
                if (i2 < size) {
                    bufferedWriter.write(",");
                }
                bufferedWriter.newLine();
            } else {
                for (int i4 = 0; i4 < i; i4++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(C786410Ut5.j4("\"%s\": {", new Object[]{str.replaceAll("\n", "")}));
                bufferedWriter.newLine();
                int i5 = i + 1;
                LIZJ((HashMap) obj, i5, bufferedWriter);
                for (int i6 = 0; i6 < i5; i6++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write("}");
                if (i2 < size) {
                    bufferedWriter.write(",");
                }
                bufferedWriter.newLine();
            }
        }
    }
}
