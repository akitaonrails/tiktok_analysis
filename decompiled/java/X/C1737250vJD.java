package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737250vJD extends AbstractC21342018fa {
    public final /* synthetic */ C1737500vJc LIZ;
    public final /* synthetic */ List<C1737450vJX> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return ((ArrayList) this.LIZ.LL).size();
    }

    public C1737250vJD(C1737500vJc c1737500vJc, List<C1737450vJX> list) {
        this.LIZ = c1737500vJc;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        return Intrinsics.LJFF(ListProtector.get(this.LIZ.LL, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        return Intrinsics.LJFF(ListProtector.get(this.LIZ.LL, i), ListProtector.get(this.LIZIZ, i2));
    }
}
