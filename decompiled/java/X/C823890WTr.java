package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: X.0WTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C823890WTr {
    public final String LIZ;

    public C823890WTr(String str) {
        str.getClass();
        this.LIZ = str;
    }

    public final String LIZIZ(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it2 = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        LIZ(sb, it2);
        return sb.toString();
    }

    public CharSequence LIZJ(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public C823890WTr(C823890WTr c823890WTr) {
        this.LIZ = c823890WTr.LIZ;
    }

    public final void LIZ(StringBuilder sb, Iterator it2) {
        try {
            if (it2.hasNext()) {
                sb.append(LIZJ(it2.next()));
                while (it2.hasNext()) {
                    sb.append((CharSequence) this.LIZ);
                    sb.append(LIZJ(it2.next()));
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }
}
