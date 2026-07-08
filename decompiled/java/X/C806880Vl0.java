package X;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Vl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C806880Vl0 {
    public static final LruCache<Class, String> LIZ = new LruCache<>(100);
    public static SparseArray<String> LIZIZ;
    public static Set<Integer> LIZJ;

    public static String LIZIZ(Class cls) {
        LruCache<Class, String> lruCache = LIZ;
        String simpleName = lruCache.get(cls);
        if (TextUtils.isEmpty(simpleName)) {
            simpleName = cls.getSimpleName();
            if (TextUtils.isEmpty(simpleName)) {
                simpleName = "Anonymous";
            }
            lruCache.put(cls, simpleName);
        }
        return simpleName;
    }

    public static String LIZ(Resources resources, int i) {
        String resourcePackageName;
        String str;
        if (resources == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("#");
            sbLIZ.append(Integer.toHexString(i));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((i >>> 24) & 255) != 127) {
            resourcePackageName = resources.getResourcePackageName(i);
            str = ":";
        } else {
            resourcePackageName = "";
            str = "";
        }
        String resourceTypeName = resources.getResourceTypeName(i);
        String resourceEntryName = resources.getResourceEntryName(i);
        StringBuilder sb = new StringBuilder(resourcePackageName.length() + 1 + str.length() + resourceTypeName.length() + 1 + resourceEntryName.length());
        sb.append(e3.g);
        sb.append(resourcePackageName);
        sb.append(str);
        sb.append(resourceTypeName);
        sb.append("/");
        sb.append(resourceEntryName);
        return sb.toString();
    }
}
