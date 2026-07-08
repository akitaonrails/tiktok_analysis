package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Hjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449430Hjp {
    public InterfaceC444050Hb9 LIZ;
    public C451430Hn3 LIZIZ;
    public final List<InterfaceC444050Hb9> LIZJ;
    public int LIZLLL;

    public C449430Hjp(C449490Hjv c449490Hjv) {
        ArrayList arrayList = new ArrayList();
        this.LIZJ = arrayList;
        if (c449490Hjv.LIZIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new C451430Hn3(c449490Hjv.LIZLLL);
            }
            C451430Hn3 c451430Hn3 = this.LIZIZ;
            if (c451430Hn3 != null) {
                arrayList.add(c451430Hn3);
            }
        }
        LIZIZ(0);
    }

    public final InterfaceC444050Hb9 LIZ(int i) {
        return (InterfaceC444050Hb9) C13LP.LJJJLZIJ(i, this.LIZJ);
    }

    public final void LIZIZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LIZJ).size() && !((ArrayList) this.LIZJ).isEmpty()) {
            this.LIZLLL = i;
            this.LIZ = (InterfaceC444050Hb9) ListProtector.get(this.LIZJ, i);
        }
    }
}
