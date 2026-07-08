package X;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import p2.j1;

/* JADX INFO: renamed from: X.0tix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676330tix implements InterfaceC20053113dB {
    public final AnimatedContentTransitionScopeImpl<?> LIZ;

    public C1676330tix(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.LIZ = animatedContentTransitionScopeImpl;
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZ(j1 j1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, 0)).LJJIJ(i));
        int size = list.size() - 1;
        int i2 = 1;
        if (1 <= size) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, i2)).LJJIJ(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZIZ(j1 j1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, 0)).LJJII(i));
        int size = list.size() - 1;
        int i2 = 1;
        if (1 <= size) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, i2)).LJJII(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZJ(j1 j1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, 0)).LJJIIZ(i));
        int size = list.size() - 1;
        int i2 = 1;
        if (1 <= size) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, i2)).LJJIIZ(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // X.InterfaceC20053113dB
    public final int LIZLLL(j1 j1Var, List list, int i) {
        if (list.isEmpty()) {
            return 0;
        }
        Integer numValueOf = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, 0)).LJJIL(i));
        int size = list.size() - 1;
        int i2 = 1;
        if (1 <= size) {
            while (true) {
                Integer numValueOf2 = Integer.valueOf(((InterfaceC1676340tiy) ListProtector.get(list, i2)).LJJIL(i));
                if (numValueOf2.compareTo(numValueOf) > 0) {
                    numValueOf = numValueOf2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    @Override // X.InterfaceC20053113dB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1690350u5Z LJFF(X.InterfaceC1689940u4u r19, java.util.List<? extends X.InterfaceC1673370teB> r20, long r21) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676330tix.LJFF(X.0u4u, java.util.List, long):X.0u5Z");
    }
}
