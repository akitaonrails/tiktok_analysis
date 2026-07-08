package X;

import com.lynx.react.bridge.ReadableArray;
import java.util.Objects;

/* JADX INFO: renamed from: X.0kIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1314110kIj {
    public C1313840kII LIZ;
    public C1313840kII LIZIZ;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C1314110kIj c1314110kIj = (C1314110kIj) obj;
        if (!Objects.equals(this.LIZ, c1314110kIj.LIZ) || !Objects.equals(this.LIZIZ, c1314110kIj.LIZIZ)) {
            return false;
        }
        return true;
    }

    public static C1314110kIj LIZ(int i, ReadableArray readableArray) {
        C1314110kIj c1314110kIj = new C1314110kIj();
        c1314110kIj.LIZ = new C1313840kII(readableArray.getDynamic(i), readableArray.getInt(i + 1));
        c1314110kIj.LIZIZ = new C1313840kII(readableArray.getDynamic(i + 2), readableArray.getInt(i + 3));
        return c1314110kIj;
    }
}
