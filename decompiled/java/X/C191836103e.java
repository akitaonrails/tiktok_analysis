package X;

import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.103e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191836103e {
    public static final Map<Object, InterfaceC191837103f> LIZ = new LinkedHashMap();

    public static InterfaceC191837103f LIZ(Object obj) {
        InterfaceC191837103f interfaceC191837103f = (InterfaceC191837103f) ((LinkedHashMap) LIZ).get(obj);
        if (interfaceC191837103f == null) {
            return new C191839103h(R.layout.fx0);
        }
        return interfaceC191837103f;
    }
}
