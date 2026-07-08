package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0ucr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710990ucr {
    public static final ConcurrentHashMap<String, InterfaceC1709310ua9> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(547));

    public static InterfaceC1709310ua9 LIZ(String str) {
        InterfaceC1709310ua9 interfaceC1709310ua9 = LIZ.get(str);
        if (interfaceC1709310ua9 == null) {
            return (C1715620ukK) LIZIZ.getValue();
        }
        return interfaceC1709310ua9;
    }
}
