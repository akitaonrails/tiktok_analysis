package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C310770CGd {
    public static final Random LIZ = new Random();
    public static final Map<String, InterfaceC303650BvH> LIZIZ = new LinkedHashMap();

    public static final InterfaceC303650BvH LIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZIZ;
        Object c310800CGg = linkedHashMap.get(str);
        if (c310800CGg == null) {
            final boolean z = true;
            if (Intrinsics.LJFF(str, "system_launch")) {
                if (LIZ.nextFloat() >= 0.005f) {
                    z = false;
                }
                c310800CGg = new AbstractC310790CGf(z) { // from class: X.0CGe
                };
            } else {
                if (LIZ.nextFloat() >= 0.005f) {
                    z = false;
                }
                c310800CGg = new C310800CGg(z);
            }
            linkedHashMap.put(str, c310800CGg);
        }
        return (InterfaceC303650BvH) c310800CGg;
    }
}
