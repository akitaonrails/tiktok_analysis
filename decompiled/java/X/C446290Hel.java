package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446290Hel extends AbstractC21342018fa {
    public final /* synthetic */ C446260Hei LIZ;
    public final /* synthetic */ List<C446280Hek> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return ((ArrayList) this.LIZ.LL).size();
    }

    public C446290Hel(C446260Hei c446260Hei, List<C446280Hek> list) {
        this.LIZ = c446260Hei;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        return Intrinsics.LJFF(ListProtector.get(this.LIZ.LL, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        return Intrinsics.LJFF(((C446280Hek) ListProtector.get(this.LIZ.LL, i)).LIZ, ((C446280Hek) ListProtector.get(this.LIZIZ, i2)).LIZ);
    }
}
