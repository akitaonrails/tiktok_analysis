package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0deW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058540deW {
    public final C1482580ogS LIZ;
    public String LIZIZ;
    public int LIZJ;
    public List<String> LIZLLL = new ArrayList();
    public long LJ;
    public String LJFF;
    public C1484750ojx LJI;
    public String LJII;

    public final C1482580ogS LIZ() {
        if (this.LIZIZ == null && this.LIZLLL.size() != 0) {
            this.LIZIZ = C2254508sR.LIZ((String) ListProtector.get(this.LIZLLL, 0));
        }
        ((ArrayList) this.LIZ.LIZJ).add(this);
        return this.LIZ;
    }

    public C1058540deW(C1482580ogS c1482580ogS) {
        this.LIZ = c1482580ogS;
    }

    public final void LIZIZ(String str) {
        this.LIZLLL.clear();
        this.LIZLLL.add(str);
    }
}
