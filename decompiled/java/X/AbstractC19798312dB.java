package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19798312dB {
    public final List<EnumC19798012d8> LIZ = new ArrayList();

    public abstract InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list);

    public final void LIZIZ(String str) {
        if (((ArrayList) this.LIZ).contains(C19796312cr.LIZIZ(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
