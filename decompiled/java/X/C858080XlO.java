package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0XlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C858080XlO {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<C13IQ<?>, InterfaceC858600XmE<?>> LIZ = new LinkedHashMap();

    public final void LIZ(C19719912Dl c19719912Dl, InterfaceC858600XmE interfaceC858600XmE) {
        if (!this.LIZ.containsKey(c19719912Dl)) {
            this.LIZ.put(c19719912Dl, interfaceC858600XmE);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("renderer for ");
        sbLIZ.append(c19719912Dl);
        sbLIZ.append(" is already registered");
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
