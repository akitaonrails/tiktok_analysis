package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YJY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YJY implements InterfaceC870660YDo {
    public final C0YH7 LIZ;
    public final C0YJZ LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1380));

    public C0YJY(C0YJW c0yjw, C0YH7 c0yh7) {
        this.LIZ = c0yh7;
        this.LIZIZ = new C0YJZ(c0yjw, c0yh7);
    }

    @Override // X.InterfaceC870660YDo
    public final void LIZ(long j, long j2, long j3, String str) {
        if (!this.LIZ.isLogin() || j == this.LIZ.getConfig().LIZIZ()) {
            return;
        }
        C0YJZ c0yjz = this.LIZIZ;
        final C0YH7 c0yh7 = this.LIZ;
        c0yjz.LIZ(new InterfaceC872130YJf<C872120YJe>(c0yh7) { // from class: X.0YJX
            public final C0YH7 LIZ;

            {
                this.LIZ = c0yh7;
            }

            @Override // X.InterfaceC872130YJf
            public final List LIZ(C0YJW c0yjw, Object obj) {
                C872120YJe c872120YJe = (C872120YJe) obj;
                c0yjw.LIZIZ(c872120YJe);
                C869590Y9l c869590Y9lLJLIIL = this.LIZ.LIZJ().LJIIJJI().LJLIIL(c872120YJe.LIZLLL);
                if (c869590Y9lLJLIIL != null) {
                    long index = c869590Y9lLJLIIL.getIndex();
                    C872090YJb c872090YJbLIZ = c0yjw.LIZ(c872120YJe.LIZJ);
                    if (c872090YJbLIZ == null) {
                        return Collections.singletonList(new C872090YJb(c872120YJe.LIZJ, index, C093Y.LIZLLL(Long.valueOf(c872120YJe.LIZ))));
                    }
                    if (c872090YJbLIZ.LIZIZ == index) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.addAll(c872090YJbLIZ.LIZJ);
                        linkedHashSet.add(Long.valueOf(c872120YJe.LIZ));
                        return Collections.singletonList(C872090YJb.LIZ(c872090YJbLIZ, linkedHashSet, 11));
                    }
                    return Collections.singletonList(new C872090YJb(c872120YJe.LIZJ, index, C093Y.LIZLLL(Long.valueOf(c872120YJe.LIZ))));
                }
                return C13BV.INSTANCE;
            }
        }, new C872120YJe(j, j3, str, j2));
    }
}
