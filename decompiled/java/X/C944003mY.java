package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.03mY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C944003mY {
    public final List<InterfaceC944503md> LIZ;
    public final C945303ml LIZIZ;
    public final int LIZJ;

    public final C944403mc LIZ(Object obj) {
        C945303ml c945303ml = (C945303ml) obj;
        if (this.LIZJ >= this.LIZ.size()) {
            return new C944403mc(c945303ml);
        }
        List<InterfaceC944503md> list = this.LIZ;
        int i = this.LIZJ;
        return ((InterfaceC944303mb) ListProtector.get(list, i)).LIZLLL(new C944003mY(list, c945303ml, i + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C944003mY(List<? extends InterfaceC944503md> list, C945303ml c945303ml, int i) {
        this.LIZ = list;
        this.LIZIZ = c945303ml;
        this.LIZJ = i;
    }
}
