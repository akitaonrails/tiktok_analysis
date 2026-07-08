package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import iyl.i3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657860tFA extends AbstractC21342018fa {
    public final List<i3> LIZ;
    public final List<i3> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    public C1657860tFA(List<i3> list, List<i3> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        return Intrinsics.LJFF(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        return Intrinsics.LJFF(((i3) ListProtector.get(this.LIZ, i)).LLJLIL, ((i3) ListProtector.get(this.LIZIZ, i2)).LLJLIL);
    }
}
