package X;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19566211gq {
    public final Map<C13IQ<?>, C19566111gp<?>> LIZ = new LinkedHashMap();

    public final C19566011go LIZIZ() {
        C19566111gp[] c19566111gpArr = (C19566111gp[]) ((LinkedHashMap) this.LIZ).values().toArray(new C19566111gp[0]);
        return new C19566011go((C19566111gp[]) Arrays.copyOf(c19566111gpArr, c19566111gpArr.length));
    }

    public final void LIZ(Function1 function1, C19719912Dl c19719912Dl) {
        if (!this.LIZ.containsKey(c19719912Dl)) {
            this.LIZ.put(c19719912Dl, new C19566111gp<>(function1, c19719912Dl));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("A `initializer` with the same `clazz` has already been added: ");
        sbLIZ.append(c19719912Dl.LIZLLL());
        sbLIZ.append('.');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
