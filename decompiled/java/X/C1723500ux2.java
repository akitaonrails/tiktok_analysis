package X;

import com.bytedance.ies.powerlist.PowerCell;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ux2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723500ux2 implements Type {
    public final int LL;
    public final Class<? extends PowerCell<? extends C14NM>> LLILLJJLI;

    public final int hashCode() {
        return this.LL;
    }

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
        if (Intrinsics.LJFF(C1723500ux2.class, cls) && this.LL == ((C1723500ux2) obj).LL) {
            return true;
        }
        return false;
    }

    public C1723500ux2(int i, Class<? extends PowerCell<? extends C14NM>> cls) {
        this.LL = i;
        this.LLILLJJLI = cls;
        if (C20606115kB.LIZIZ) {
            if (50000 <= i && i < 60001) {
            } else {
                throw new IllegalStateException("contentType range must be in 50000 to 60000");
            }
        }
    }
}
