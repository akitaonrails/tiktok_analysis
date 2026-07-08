package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pAq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501420pAq {
    public static final List<InterfaceC1501340pAi> LIZ;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new InterfaceC1501340pAi() { // from class: X.0pCB
            /* JADX WARN: Type inference failed for: r0v6, types: [X.11OF] */
            @Override // X.InterfaceC1501340pAi
            public final C11OF LIZIZ(Class cls) {
                boolean zLJFF = Intrinsics.LJFF(cls, C11NN.class);
                boolean zLJFF2 = Intrinsics.LJFF(cls, AbstractC19484711Kz.class);
                boolean zLJFF3 = Intrinsics.LJFF(cls, AbstractC19483511Kn.class);
                boolean zLJFF4 = Intrinsics.LJFF(cls, AbstractC19486711Lt.class);
                if (!Intrinsics.LJFF(cls, C11NZ.class) && !zLJFF && !zLJFF2 && !zLJFF3 && !zLJFF4) {
                    return null;
                }
                return new InterfaceC1502010pBn(zLJFF, zLJFF2, zLJFF3, zLJFF4) { // from class: X.11OF
                    public final boolean LIZ;
                    public final boolean LIZIZ;
                    public final boolean LIZJ;
                    public final boolean LIZLLL;

                    @Override // X.InterfaceC1502010pBn
                    public final Object LIZ(C19665911wv c19665911wv) {
                        C19498611Qi c19498611Qi = new C19498611Qi(c19665911wv);
                        if (this.LIZ) {
                            return c19498611Qi.LJLJLJ(EnumC19496911Pr.LATEST);
                        }
                        if (this.LIZIZ) {
                            return new C19474411Ha(c19498611Qi);
                        }
                        if (this.LIZJ) {
                            return new C11IK(c19498611Qi);
                        }
                        if (this.LIZLLL) {
                            return new C11IW(c19498611Qi);
                        }
                        return c19498611Qi;
                    }

                    {
                        this.LIZ = zLJFF;
                        this.LIZIZ = zLJFF2;
                        this.LIZJ = zLJFF3;
                        this.LIZLLL = zLJFF4;
                    }
                };
            }
        });
        LIZ = arrayList;
    }
}
