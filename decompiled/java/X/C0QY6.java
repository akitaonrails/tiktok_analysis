package X;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0QY6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QY6 extends C0QYK<String> {
    @Override // X.C0QYK
    public final String LIZIZ(String str) {
        if (str == null) {
            return LIZ();
        }
        return str;
    }

    @Override // X.C0QYK
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public String LIZJ(String str, String str2) {
        String str3;
        if (LJ() != null) {
            C0QYK c0qyk = (C0QYK) ((LinkedHashMap) C672180QYe.LIZ).get(LJ());
            Serializable serializable = null;
            if (c0qyk != null) {
                serializable = (Serializable) c0qyk.LIZIZ(str2);
            }
            if ((serializable instanceof String) && (str3 = (String) serializable) != null) {
                return str3;
            }
        }
        if (str == null) {
            return LIZ();
        }
        return str;
    }
}
