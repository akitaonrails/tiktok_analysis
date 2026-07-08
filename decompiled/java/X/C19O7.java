package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19O7, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19O7 extends C19OA {
    public ArrayList<C19OA> LIZ = new ArrayList<>();

    public void LIZLLL() {
        ArrayList<C19OA> arrayList = this.LIZ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19OA c19oa = (C19OA) ListProtector.get(this.LIZ, i);
            if (c19oa instanceof C19O7) {
                ((C19O7) c19oa).LIZLLL();
            }
        }
    }

    @Override // X.C19OA
    public void reset() {
        this.LIZ.clear();
        super.reset();
    }

    public final void LIZJ(C19OA c19oa) {
        this.LIZ.add(c19oa);
        C19OA c19oa2 = c19oa.mParent;
        if (c19oa2 != null) {
            ((C19O7) c19oa2).LIZ.remove(c19oa);
            c19oa.reset();
        }
        c19oa.mParent = this;
    }

    @Override // X.C19OA
    public final void resetSolverVariables(C21532019Ok c21532019Ok) {
        super.resetSolverVariables(c21532019Ok);
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            ((C19OA) ListProtector.get(this.LIZ, i)).resetSolverVariables(c21532019Ok);
        }
    }

    @Override // X.C19OA
    public final void setOffset(int i, int i2) {
        super.setOffset(i, i2);
        int size = this.LIZ.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C19OA) ListProtector.get(this.LIZ, i3)).setOffset(getRootX(), getRootY());
        }
    }
}
