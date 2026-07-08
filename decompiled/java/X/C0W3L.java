package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0W3L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W3L {
    public final List LIZ;
    public final Object LIZIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.LIZIZ.getClass().getSimpleName());
        sb.append('{');
        int size = ((ArrayList) this.LIZ).size();
        for (int i = 0; i < size; i++) {
            sb.append((String) ListProtector.get(this.LIZ, i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ C0W3L(Object obj) {
        C0W3J.LJIIIIZZ(obj);
        this.LIZIZ = obj;
        this.LIZ = new ArrayList();
    }

    public final void LIZ(Object obj, String str) {
        ((ArrayList) this.LIZ).add(str + "=" + String.valueOf(obj));
    }
}
