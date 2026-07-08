package X;

import com.bytedance.touchpoint.api.model.TextLink;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ym2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1870440ym2 {
    public final long LIZ;
    public final List<TextLink> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1870440ym2)) {
            return false;
        }
        C1870440ym2 c1870440ym2 = (C1870440ym2) obj;
        return this.LIZ == c1870440ym2.LIZ && Intrinsics.LJFF(this.LIZIZ, c1870440ym2.LIZIZ);
    }

    public C1870440ym2(long j, List<TextLink> list) {
        this.LIZ = j;
        this.LIZIZ = list;
    }
}
