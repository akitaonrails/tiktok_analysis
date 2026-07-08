package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Elc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374100Elc extends AbstractC21342018fa {
    public final List<C373800El8> LIZ;
    public final List<C373800El8> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    public C374100Elc(List<C373800El8> list, List<C373800El8> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        return Intrinsics.LJFF(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        if (((C373800El8) ListProtector.get(this.LIZ, i)).LIZ == ((C373800El8) ListProtector.get(this.LIZIZ, i2)).LIZ) {
            return true;
        }
        return false;
    }
}
