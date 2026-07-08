package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Doj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2267271Doj extends C2267081DoQ {
    public ArrayList<C2267081DoQ> LJJLIIIJLLLLLLLZ;

    @Override // X.C2267081DoQ
    public void LJJ() {
        this.LJJLIIIJLLLLLLLZ.clear();
        super.LJJ();
    }

    public void LJJIJIIJIL() {
        ArrayList<C2267081DoQ> arrayList = this.LJJLIIIJLLLLLLLZ;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2267081DoQ c2267081DoQ = (C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i);
            if (c2267081DoQ instanceof C2267271Doj) {
                ((C2267271Doj) c2267081DoQ).LJJIJIIJIL();
            }
        }
    }

    public C2267271Doj() {
        this.LJJLIIIJLLLLLLLZ = new ArrayList<>();
    }

    public C2267271Doj(int i) {
        super(0, 0);
        this.LJJLIIIJLLLLLLLZ = new ArrayList<>();
    }

    @Override // X.C2267081DoQ
    public final void LJJIFFI(C21537219Qk c21537219Qk) {
        super.LJJIFFI(c21537219Qk);
        int size = this.LJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            ((C2267081DoQ) ListProtector.get(this.LJJLIIIJLLLLLLLZ, i)).LJJIFFI(c21537219Qk);
        }
    }
}
