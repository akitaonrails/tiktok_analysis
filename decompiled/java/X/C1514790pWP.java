package X;

import android.view.View;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pWP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514790pWP {
    public static final Map<EnumC1520910pgH, InterfaceC1520090pex<?>> LIZ = new LinkedHashMap();
    public static final C1514800pWQ LIZIZ = new C1514800pWQ();

    public static View LIZ(String str) {
        Reference reference = (Reference) ((LinkedHashMap) LIZIZ.LIZ).get(str);
        if (reference != null) {
            return (View) reference.get();
        }
        return null;
    }

    public static InterfaceC1520090pex LIZIZ(String str) {
        Map<EnumC1520910pgH, InterfaceC1520090pex<?>> map = LIZ;
        Object obj = ((LinkedHashMap) LIZIZ.LIZJ).get(str);
        if (obj == null) {
            obj = EnumC1520910pgH.UNKNOWN;
        }
        return (InterfaceC1520090pex) ((LinkedHashMap) map).get(obj);
    }

    public static AbstractC1514820pWS LIZJ(String str) {
        InterfaceC1520090pex interfaceC1520090pexLIZIZ;
        View viewLIZ = LIZ(str);
        if (viewLIZ == null || (interfaceC1520090pexLIZIZ = LIZIZ(str)) == null) {
            return null;
        }
        return interfaceC1520090pexLIZIZ.getViewSession(viewLIZ);
    }

    public static AbstractC1514820pWS LIZLLL(View view) {
        InterfaceC1520090pex interfaceC1520090pexLIZIZ;
        String str;
        ArrayList arrayList = new ArrayList();
        C1514770pWN c1514770pWN = LIZIZ.LIZIZ.get(view);
        if (c1514770pWN != null && (str = c1514770pWN.LIZ) != null) {
            arrayList.add(str);
        }
        if (!(!arrayList.isEmpty()) || (interfaceC1520090pexLIZIZ = LIZIZ((String) C13LP.LJJJJZI(arrayList))) == null) {
            return null;
        }
        return interfaceC1520090pexLIZIZ.getViewSession(view);
    }
}
