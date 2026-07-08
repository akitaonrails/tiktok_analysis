package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0q2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534880q2o {
    public static final Keva LIZ = KevaImpl.getRepo("forest_cdn", 1);

    public static void LIZ(String str) {
        LIZ.erase(str);
    }

    public static void LIZIZ(String str, String str2) {
        LIZ.storeStringJustDisk(str, str2);
    }
}
