package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0b7B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960990b7B {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final /* synthetic */ C960890b71 LJ;

    public C960990b7B(C960890b71 c960890b71, boolean z) {
        this.LJ = c960890b71;
        if (z) {
            for (Object obj : c960890b71.LLJILJILJ) {
                if (obj != null && (obj instanceof C956150azN)) {
                    this.LIZ++;
                    if (C955940az2.LIZIZ(((C955590ayT) obj).LJIIJ)) {
                        this.LIZIZ++;
                        User owner = ((C955590ayT) obj).LJ.getOwner();
                        if (owner != null && C950220apo.LJIJJ(owner)) {
                            this.LIZJ++;
                        } else {
                            this.LIZLLL++;
                        }
                    }
                }
            }
            C960890b71 c960890b712 = this.LJ;
            int size = c960890b712.LLLII.size();
            for (int i = c960890b712.LLLLIILL; i < size; i++) {
                this.LIZ++;
                C960890b71 c960890b713 = this.LJ;
                if (C955940az2.LIZIZ(c960890b713.LLJJLIIIJLLLLLLLZ.get(Long.valueOf(((Room) ListProtector.get(c960890b713.LLLII, i)).getId())))) {
                    this.LIZIZ++;
                    this.LIZJ++;
                }
            }
            C960890b71 c960890b714 = this.LJ;
            int size2 = c960890b714.LLLIIIL.size();
            for (int i2 = c960890b714.LLLLJ; i2 < size2; i2++) {
                this.LIZ++;
                C960890b71 c960890b715 = this.LJ;
                if (C955940az2.LIZIZ(c960890b715.LLJJLIIIJLLLLLLLZ.get(Long.valueOf(((Room) ListProtector.get(c960890b715.LLLIIIL, i2)).getId())))) {
                    this.LIZIZ++;
                    this.LIZLLL++;
                }
            }
        }
    }
}
