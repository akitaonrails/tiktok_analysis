package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0SIR, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIR {
    public final String LIZ;
    public final List<Object> LIZIZ;
    public final C0SIK LIZJ;
    public final Object LIZLLL;

    public /* synthetic */ C0SIR(String str, List list, C0SIK c0sik, int i) {
        this(str, (List<Object>) ((i & 2) != 0 ? new ArrayList() : list), (i & 4) != 0 ? null : c0sik, (Object) null);
    }

    public C0SIR(String str, List<Object> list, C0SIK c0sik, Object obj) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = c0sik;
        this.LIZLLL = obj;
    }
}
