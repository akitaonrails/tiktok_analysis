package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Hjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449450Hjr {
    public InterfaceC444050Hb9 LIZ;
    public C451430Hn3 LIZIZ;
    public List<InterfaceC444050Hb9> LIZJ;
    public int LIZLLL;

    public C449450Hjr(C449490Hjv c449490Hjv) {
        this.LIZJ = new ArrayList();
        if (c449490Hjv.LIZIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new C451430Hn3(c449490Hjv.LIZLLL);
            }
            C451430Hn3 c451430Hn3 = this.LIZIZ;
            if (this.LIZJ == null) {
                this.LIZJ = new ArrayList();
            }
            ((ArrayList) this.LIZJ).add(c451430Hn3);
        }
        if (((ArrayList) this.LIZJ).size() > 0) {
            this.LIZLLL = 0;
            this.LIZ = (InterfaceC444050Hb9) ListProtector.get(this.LIZJ, 0);
        }
    }
}
