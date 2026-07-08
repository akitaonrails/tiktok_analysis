package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicBarStyleConfig;
import com.ss.android.ugc.aweme.ecommerce.mall.bean.DynamicColorConfig;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2249331D2d {
    public final Function1<String, Unit> LIZ;
    public final Type LIZIZ;
    public final Type LIZJ;

    public C2249331D2d() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2249331D2d(Function1<? super String, Unit> function1) {
        this.LIZ = function1;
        this.LIZIZ = new TypeToken<List<? extends DynamicColorConfig>>() { // from class: X.1D2c
        }.getType();
        this.LIZJ = new TypeToken<List<? extends DynamicBarStyleConfig>>() { // from class: X.1D2b
        }.getType();
    }

    public static String LIZ(List list) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                DynamicBarStyleConfig dynamicBarStyleConfig = (DynamicBarStyleConfig) obj;
                String str = dynamicBarStyleConfig.target;
                if (!C13LP.LJJJJ(str, C2249351D2f.LIZJ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalid dynamic bar style target: ");
                    sbLIZ.append(str);
                    sbLIZ.append(", index=");
                    sbLIZ.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                String str2 = dynamicBarStyleConfig.activeType;
                if (str2 == null) {
                    str2 = "always";
                }
                if (!C2249351D2f.LIZIZ.contains(str2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invalid dynamic bar style active_type: ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append(", index=");
                    sbLIZ2.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
                String strLIZ = C1886307a9.LIZ(dynamicBarStyleConfig.style);
                if (strLIZ == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("dynamic bar style style is null, index=");
                    sbLIZ3.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (!C2249351D2f.LIZLLL.contains(strLIZ)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("invalid dynamic bar style style: ");
                    sbLIZ4.append(strLIZ);
                    sbLIZ4.append(", index=");
                    sbLIZ4.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ4);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    public static String LIZIZ(List list) {
        String str;
        String str2;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                DynamicColorConfig dynamicColorConfig = (DynamicColorConfig) obj;
                String str3 = dynamicColorConfig.type;
                if (!C13LP.LJJJJ(str3, C2249351D2f.LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("invalid dynamic color type: ");
                    sbLIZ.append(str3);
                    sbLIZ.append(", index=");
                    sbLIZ.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                String str4 = dynamicColorConfig.activeType;
                if (str4 == null) {
                    str4 = "always";
                }
                if (!C2249351D2f.LIZIZ.contains(str4)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invalid dynamic color active_type: ");
                    sbLIZ2.append(str4);
                    sbLIZ2.append(", index=");
                    sbLIZ2.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (dynamicColorConfig.color == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("dynamic color color is null, index=");
                    sbLIZ3.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
                if (Intrinsics.LJFF(str3, "item") && ((str = dynamicColorConfig.sectionId) == null || str.length() == 0 || (str2 = dynamicColorConfig.itemId) == null || str2.length() == 0)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("dynamic color item section_id or item_id is empty, index=");
                    sbLIZ4.append(i);
                    return C2188811AlT.LIZIZ(sbLIZ4);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }
}
