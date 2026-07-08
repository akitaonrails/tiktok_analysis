package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZPU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPU {
    public final String LIZ;
    public final int LIZIZ;
    public final List<C0ZPT> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZPU)) {
            return false;
        }
        C0ZPU c0zpu = (C0ZPU) obj;
        return Intrinsics.LJFF(this.LIZ, c0zpu.LIZ) && this.LIZIZ == c0zpu.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0zpu.LIZJ);
    }

    public C0ZPU() {
        this(null, R.attr.a1h, C13BV.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZPU(String str, int i, List<? extends C0ZPT> list) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = list;
    }
}
