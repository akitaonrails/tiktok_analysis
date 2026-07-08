package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0V3S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0V3S {
    public final int LIZ;
    public int LIZIZ;
    public C0V35 LIZJ;
    public final List<C0V35> LIZLLL = new ArrayList();

    public final List<C0V35> LIZ() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (((ArrayList) this.LIZLLL).size() == this.LIZ) {
            for (int i2 = this.LIZIZ - 1; i2 < ((ArrayList) this.LIZLLL).size(); i2++) {
                arrayList.add(ListProtector.get(this.LIZLLL, i2));
            }
            while (i < this.LIZIZ - 1) {
                arrayList.add(ListProtector.get(this.LIZLLL, i));
                i++;
            }
        } else {
            while (i < ((ArrayList) this.LIZLLL).size()) {
                arrayList.add(ListProtector.get(this.LIZLLL, i));
                i++;
            }
        }
        return arrayList;
    }

    public final C0V35 LIZIZ() {
        int i = this.LIZIZ;
        if (i <= 0) {
            return null;
        }
        return (C0V35) ListProtector.get(this.LIZLLL, i - 1);
    }

    public C0V3S(int i) {
        this.LIZ = i;
    }
}
