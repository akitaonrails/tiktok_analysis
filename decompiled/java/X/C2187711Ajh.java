package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Ajh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2187711Ajh {
    public static final ArrayList<InterfaceC2187721Aji> LIZ = new ArrayList<>();

    public static int LIZ(Object obj) {
        for (InterfaceC2187721Aji interfaceC2187721Aji : LIZ) {
            if (interfaceC2187721Aji.LIZLLL(obj)) {
                return interfaceC2187721Aji.LIZ();
            }
        }
        return 0;
    }

    public static boolean LIZIZ(Class cls, Object obj) {
        for (InterfaceC2187721Aji interfaceC2187721Aji : LIZ) {
            if (interfaceC2187721Aji.LIZLLL(obj)) {
                return interfaceC2187721Aji.LIZIZ().equals(cls);
            }
        }
        return false;
    }
}
