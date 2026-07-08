package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0arQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C951220arQ extends AbstractC21342018fa {
    public final List<?> LIZ;
    public final List<?> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        List<?> list = this.LIZIZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        List<?> list = this.LIZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C951220arQ(List<?> list, List<?> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        if ((ListProtector.get(this.LIZ, i) instanceof InterfaceC951240arS) && (ListProtector.get(this.LIZIZ, i2) instanceof InterfaceC951240arS)) {
            return ((InterfaceC951240arS) ListProtector.get(this.LIZ, i)).LIZIZ(ListProtector.get(this.LIZIZ, i2));
        }
        return false;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        if ((ListProtector.get(this.LIZ, i) instanceof InterfaceC951240arS) && (ListProtector.get(this.LIZIZ, i2) instanceof InterfaceC951240arS)) {
            return ((InterfaceC951240arS) ListProtector.get(this.LIZ, i)).LJII(ListProtector.get(this.LIZIZ, i2));
        }
        if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
            return true;
        }
        return false;
    }
}
