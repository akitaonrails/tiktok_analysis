package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Qy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C842603Qy {
    public final List<String> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C842603Qy)) {
            return false;
        }
        C842603Qy c842603Qy = (C842603Qy) obj;
        return Intrinsics.LJFF(this.LIZ, c842603Qy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c842603Qy.LIZIZ);
    }

    public C842603Qy(List<String> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
