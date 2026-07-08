package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20132913q3 {
    public static final Map<Class<?>, String> LIZIZ = new LinkedHashMap();
    public final Map<String, AbstractC20133313q7<? extends C20131713pr>> LIZ = new LinkedHashMap();

    public final void LIZ(AbstractC20133313q7 abstractC20133313q7) {
        boolean z;
        String strLIZ = C20133013q4.LIZ(abstractC20133313q7.getClass());
        if (C20133013q4.LIZIZ(strLIZ)) {
            AbstractC20133313q7 abstractC20133313q72 = (AbstractC20133313q7) ((LinkedHashMap) this.LIZ).get(strLIZ);
            if (!Intrinsics.LJFF(abstractC20133313q72, abstractC20133313q7)) {
                if (abstractC20133313q72 != null && abstractC20133313q72.LIZIZ) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (!abstractC20133313q7.LIZIZ) {
                        this.LIZ.put(strLIZ, abstractC20133313q7);
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Navigator ");
                    sbLIZ.append(abstractC20133313q7);
                    sbLIZ.append(" is already attached to another NavController");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Navigator ");
                sbLIZ2.append(abstractC20133313q7);
                sbLIZ2.append(" is replacing an already attached ");
                sbLIZ2.append(abstractC20133313q72);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                strLIZIZ2.toString();
                throw new IllegalStateException(strLIZIZ2);
            }
            return;
        }
        "navigator name cannot be an empty string".toString();
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final <T extends AbstractC20133313q7<?>> T LIZIZ(String str) {
        if (C20133013q4.LIZIZ(str)) {
            T t = (T) ((LinkedHashMap) this.LIZ).get(str);
            if (t != null) {
                return t;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not find Navigator with name \"");
            sbLIZ.append(str);
            sbLIZ.append("\". You must call NavController.addNavigator() for each navigation type.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        "navigator name cannot be an empty string".toString();
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
