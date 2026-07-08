package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.13y2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20182413y2 {
    public final String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public final List<String> LJFF = new ArrayList();
    public final List<C20182413y2> LJI = new ArrayList();

    public final synchronized void LIZIZ() {
        ((ArrayList) this.LJFF).add("endSubphase");
        ((ArrayList) this.LJI).add(C20182313y1.LIZLLL("endSubphase"));
    }

    public final synchronized C20182413y2 LIZ(String str) {
        if (((ArrayList) this.LJFF).contains(str)) {
            return (C20182413y2) ListProtector.get(this.LJI, ((ArrayList) this.LJFF).indexOf(str));
        }
        C20182413y2 c20182413y2LIZLLL = C20182313y1.LIZLLL(str);
        ((ArrayList) this.LJFF).add(str);
        ((ArrayList) this.LJI).add(c20182413y2LIZLLL);
        return c20182413y2LIZLLL;
    }

    public C20182413y2(String str, long j, long j2, long j3) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
