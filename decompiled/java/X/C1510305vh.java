package X;

import java.util.Map;

/* JADX INFO: renamed from: X.05vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1510305vh {
    public static final boolean LIZ(C869590Y9l c869590Y9l) {
        if (LIZIZ(c869590Y9l) != -1) {
            return true;
        }
        return false;
    }

    public static final int LIZIZ(C869590Y9l c869590Y9l) {
        Map<String, String> localExt;
        String str;
        Integer numLJIIJJI;
        if (c869590Y9l != null && (localExt = c869590Y9l.getLocalExt()) != null && (str = localExt.get("fake_msg_protocol_type")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return -1;
    }
}
