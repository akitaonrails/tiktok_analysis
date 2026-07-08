package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0bEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965750bEr {
    public static final C965750bEr LIZ = new C965750bEr();
    public static final HashMap<String, InterfaceC945140ahc> LIZIZ = new HashMap<>();

    public final synchronized <T extends InterfaceC945140ahc> T LIZ(String str) {
        T t;
        InterfaceC945140ahc interfaceC945140ahc;
        try {
            interfaceC945140ahc = LIZIZ.get(str);
        } finally {
        }
        if (interfaceC945140ahc instanceof InterfaceC945140ahc) {
            t = (T) interfaceC945140ahc;
        } else {
            t = null;
        }
        return t;
    }

    public final synchronized <T extends InterfaceC945140ahc> void LIZIZ(String str, T t) {
        LIZIZ.put(str, t);
    }
}
