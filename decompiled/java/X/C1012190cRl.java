package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0cRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012190cRl {
    public static final List<InterfaceC1012180cRk> LIZ = C1697810uHb.LJIIJJI(new InterfaceC1012180cRk() { // from class: X.0cRn
        @Override // X.InterfaceC1012180cRk
        public final List<C1012220cRo> LIZ(String str, C1012260cRs c1012260cRs, Object obj) {
            String strLIZIZ;
            if (c1012260cRs.LIZIZ()) {
                return null;
            }
            if (str == null) {
                strLIZIZ = c1012260cRs.LIZ;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('.');
                sbLIZ.append(c1012260cRs.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (obj instanceof String) {
                return Collections.singletonList(new C1012220cRo(strLIZIZ, (String) obj));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("element must a string, path: ");
            sbLIZ2.append(strLIZIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }, new InterfaceC1012180cRk() { // from class: X.0cRm
        @Override // X.InterfaceC1012180cRk
        public final List<C1012220cRo> LIZ(String str, C1012260cRs c1012260cRs, Object obj) {
            String strLIZIZ;
            if (!c1012260cRs.LIZIZ()) {
                return null;
            }
            if (str == null) {
                strLIZIZ = c1012260cRs.LIZ;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('.');
                sbLIZ.append(c1012260cRs.LIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            if (obj instanceof JSONArray) {
                String strSubstring = strLIZIZ.substring(0, strLIZIZ.length() - 2);
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = (JSONArray) obj;
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object objOpt = jSONArray.opt(i);
                    if (objOpt != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strSubstring);
                        sbLIZ2.append('[');
                        sbLIZ2.append(i);
                        sbLIZ2.append(']');
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        if (objOpt instanceof String) {
                            arrayList.add(new C1012220cRo(strLIZIZ2, (String) objOpt));
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("item in json array must be a string, path: ");
                            sbLIZ3.append(strLIZIZ2);
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                }
                return Collections.unmodifiableList(arrayList);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("filed name must end with '[]' when it is a json array, path: ");
            sbLIZ4.append(strLIZIZ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
        }
    });
}
