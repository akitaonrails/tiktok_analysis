package Y;

import X.C1453730nvv;
import X.C1454990nxx;
import X.C15R6;
import X.C1C7U;
import X.C347660Dk4;
import X.C348100Dkm;
import X.C352130DrH;
import X.EnumC356060Dxc;
import X.InterfaceC1452170ntP;
import android.util.Pair;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS1S1112000_22 implements Callable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS1S1112000_22 aCallableS1S1112000_22) {
        float f;
        C1C7U.LIZ("EditMusicControlComponent@1121.onMvMusicChanged$callable$1");
        InterfaceC1452170ntP value = ((C1453730nvv) aCallableS1S1112000_22.l1).JY0().g().getValue();
        Pair pair = null;
        if (value != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
            if (c348100DkmLIZIZ != null) {
                C347660Dk4 c347660Dk4LJJJJ = c348100DkmLIZIZ.LJFF().LJJJJ();
                if (c347660Dk4LJJJJ != null) {
                    f = c347660Dk4LJJJJ.LJIIIZ;
                } else {
                    f = 1.0f;
                    c347660Dk4LJJJJ = new C347660Dk4();
                }
                String str = aCallableS1S1112000_22.s0;
                int i = aCallableS1S1112000_22.i3;
                int i2 = aCallableS1S1112000_22.i4;
                c347660Dk4LJJJJ.LJJIFFI = EnumC356060Dxc.MV_MUSIC;
                c347660Dk4LJJJJ.LIZIZ = str;
                c347660Dk4LJJJJ.LJIIIZ = f;
                long j = i;
                c347660Dk4LJJJJ.LJFF = j;
                long j2 = i2;
                c347660Dk4LJJJJ.LJI = j2;
                c347660Dk4LJJJJ.LIZLLL = j;
                c347660Dk4LJJJJ.LJ = j2;
                c348100DkmLIZIZ.LJFF().LJJJJLL(null);
                c348100DkmLIZIZ.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                value.play();
                if (!aCallableS1S1112000_22.z2) {
                    pair = new Pair(1, null);
                } else {
                    pair = new Pair(1, C15R6.LIZIZ(aCallableS1S1112000_22.s0, true, null));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1C7U.LIZIZ("EditMusicControlComponent@1121.onMvMusicChanged$callable$1");
        return pair;
    }

    public static final Object call$1(ACallableS1S1112000_22 aCallableS1S1112000_22) {
        float f;
        C1C7U.LIZ("FTCEditRootScene@43ac.onMvMusicChanged$callable$1");
        InterfaceC1452170ntP interfaceC1452170ntPLLLLZ = ((C1454990nxx) aCallableS1S1112000_22.l1).LLLLZ();
        Pair pair = null;
        if (interfaceC1452170ntPLLLLZ != null) {
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLLLLZ);
            if (c348100DkmLIZIZ != null) {
                C347660Dk4 c347660Dk4LJJJJ = c348100DkmLIZIZ.LJFF().LJJJJ();
                if (c347660Dk4LJJJJ != null) {
                    f = c347660Dk4LJJJJ.LJIIIZ;
                } else {
                    f = 1.0f;
                    c347660Dk4LJJJJ = new C347660Dk4();
                }
                String str = aCallableS1S1112000_22.s0;
                int i = aCallableS1S1112000_22.i3;
                int i2 = aCallableS1S1112000_22.i4;
                c347660Dk4LJJJJ.LJJIFFI = EnumC356060Dxc.MV_MUSIC;
                c347660Dk4LJJJJ.LIZIZ = str;
                c347660Dk4LJJJJ.LJIIIZ = f;
                long j = i;
                c347660Dk4LJJJJ.LJFF = j;
                long j2 = i2;
                c347660Dk4LJJJJ.LJI = j2;
                c347660Dk4LJJJJ.LIZLLL = j;
                c347660Dk4LJJJJ.LJ = j2;
                c348100DkmLIZIZ.LJFF().LJJJJLL(null);
                c348100DkmLIZIZ.LJFF().LJJJJLL(c347660Dk4LJJJJ);
                interfaceC1452170ntPLLLLZ.play();
                if (!aCallableS1S1112000_22.z2) {
                    pair = new Pair(1, null);
                } else {
                    pair = new Pair(1, C15R6.LIZIZ(aCallableS1S1112000_22.s0, true, null));
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1C7U.LIZIZ("FTCEditRootScene@43ac.onMvMusicChanged$callable$1");
        return pair;
    }

    public ACallableS1S1112000_22(int i, int i2, Object obj, String str, boolean z, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
    }
}
