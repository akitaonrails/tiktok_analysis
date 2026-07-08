package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985000bju {
    public static final C985000bju LIZJ = new C985000bju("", new int[0]);
    public final String LIZ;
    public final int[] LIZIZ;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C985000bju.class, cls)) {
            return false;
        }
        C985000bju c985000bju = (C985000bju) obj;
        if (Intrinsics.LJFF(this.LIZ, c985000bju.LIZ) && Arrays.equals(this.LIZIZ, c985000bju.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C985000bju(String str, int[] iArr) {
        this.LIZ = str;
        this.LIZIZ = iArr;
    }
}
