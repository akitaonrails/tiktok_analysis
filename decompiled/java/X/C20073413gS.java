package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.13gS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20073413gS {
    public final C13WG LIZ;
    public final C20036313aT LIZIZ;

    public C20073413gS(C20068213fc c20068213fc, AbstractC20029613Yo<C20071413g8> abstractC20029613Yo) {
        this.LIZ = c20068213fc.LIZLLL;
        this.LIZIZ = new C20036313aT(c20068213fc.LJIIIZ().size());
        List<C20068213fc> listLJIIIZ = c20068213fc.LJIIIZ();
        int size = listLJIIIZ.size();
        for (int i = 0; i < size; i++) {
            C20068213fc c20068213fc2 = (C20068213fc) ListProtector.get(listLJIIIZ, i);
            if (abstractC20029613Yo.LIZ(c20068213fc2.LJI)) {
                this.LIZIZ.LIZIZ(c20068213fc2.LJI);
            }
        }
    }
}
