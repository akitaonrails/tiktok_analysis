package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0XKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847110XKz {
    public final int LIZ;
    public final List<C0XL7> LIZIZ;
    public final C820370WGd LIZJ;
    public final C0XL9 LIZLLL;

    public final C0XL5 LIZ(C820370WGd c820370WGd) {
        if (this.LIZ < this.LIZIZ.size()) {
            int i = this.LIZ;
            List<C0XL7> list = this.LIZIZ;
            C0XL5 c0xl5LIZ = ((C0XL7) ListProtector.get(list, i)).LIZ(new C847110XKz(i + 1, list, c820370WGd, this.LIZLLL));
            if (c0xl5LIZ == null) {
                C0XL3 c0xl3 = new C0XL3();
                c0xl3.LIZ = c820370WGd;
                c0xl3.LIZIZ = 0;
                c0xl3.LIZJ = "success";
                return new C0XL5(c0xl3);
            }
            return c0xl5LIZ;
        }
        throw new AssertionError();
    }

    public C847110XKz(int i, List<C0XL7> list, C820370WGd c820370WGd, C0XL9 c0xl9) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = c820370WGd;
        this.LIZLLL = c0xl9;
    }
}
