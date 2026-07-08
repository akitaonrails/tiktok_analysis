package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.tiktok.myna.render.render.MynaElement;
import java.util.List;

/* JADX INFO: renamed from: X.18e6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21332818e6 extends AbstractC21342018fa {
    public final List<MynaElement> LIZ;
    public final List<MynaElement> LIZIZ;

    @Override // X.AbstractC21342018fa
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC21342018fa
    public final int LJ() {
        return this.LIZ.size();
    }

    public C21332818e6(List<MynaElement> list, List<MynaElement> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZ(int i, int i2) {
        if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC21342018fa
    public final boolean LIZIZ(int i, int i2) {
        if (((MynaElement) ListProtector.get(this.LIZ, i)).itemKey == ((MynaElement) ListProtector.get(this.LIZIZ, i2)).itemKey) {
            return true;
        }
        return false;
    }
}
