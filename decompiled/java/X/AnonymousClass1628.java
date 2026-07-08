package X;

import android.content.Context;
import android.os.Environment;
import com.ss.android.ugc.aweme.cla.experiments.captions.ClaDiskCacheConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1628, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1628 {
    public static final String LIZ;
    public static final C603820NmG<String, String> LIZIZ;
    public static int LIZJ;
    public static final int LIZLLL;

    static {
        File fileY2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = C2354709Kn.LIZ;
        if (Environment.isExternalStorageEmulated() || (fileY2 = C786410Ut5.y2(context, null)) == null) {
            fileY2 = C2354709Kn.LIZ(context);
        } else {
            C2354709Kn.LJI(fileY2);
        }
        sbLIZ.append(fileY2.getPath());
        sbLIZ.append(File.separator);
        sbLIZ.append("realtime_captions_cache");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZ = strLIZIZ;
        ClaDiskCacheConfig claDiskCacheConfig = C162J.LIZ;
        LIZIZ = new C603820NmG<>(claDiskCacheConfig.maxDiskCacheSize);
        LIZLLL = C0SKG.LIZ.maxPrefetchNumber;
        String[] strArrLJJJJLL = C746760TRa.LIZ().LJJJJLL();
        List listLJLI = strArrLJJJJLL != null ? C13LQ.LJLI(strArrLJJJJLL) : null;
        EnumC114900c7 enumC114900c7 = EnumC114900c7.TRANSLATION_LOG;
        enumC114900c7.getValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("enable disk cache; cachedValue size: ");
        sbLIZ2.append(listLJLI != null ? Integer.valueOf(listLJLI.size()) : null);
        sbLIZ2.append("; cachedValue: ");
        sbLIZ2.append(listLJLI);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (listLJLI == null || listLJLI.isEmpty() || claDiskCacheConfig.forceClean) {
            C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
            c2137908Zd.LIZLLL(strLIZIZ);
            c2137908Zd.LIZIZ(strLIZIZ);
            return;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (!c0vsj.exists()) {
            C2137908Zd.LIZJ.LIZIZ(strLIZIZ);
        }
        if (c0vsj.isDirectory()) {
            enumC114900c7.getValue();
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (file.exists()) {
                        arrayList.add(file);
                    }
                }
                arrayList.size();
            }
            File[] fileArrListFiles2 = c0vsj.listFiles();
            if (fileArrListFiles2 != null) {
                ArrayList<File> arrayList2 = new ArrayList();
                for (File file2 : fileArrListFiles2) {
                    if (file2.exists()) {
                        arrayList2.add(file2);
                    }
                }
                for (File file3 : arrayList2) {
                    String absolutePath = file3.getAbsolutePath();
                    if (listLJLI.contains(absolutePath)) {
                        LIZIZ.LIZLLL(absolutePath, absolutePath);
                    } else {
                        file3.delete();
                    }
                }
            }
        }
    }
}
