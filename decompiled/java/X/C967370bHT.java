package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967370bHT extends C968830bJp {
    public final InterfaceC966930bGl LJ;
    public final CopyOnWriteArraySet<Function0<Unit>> LJFF;
    public final C967320bHO LJI;
    public final C967310bHN LJII;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0bHO] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0bHN] */
    public C967370bHT(InterfaceC966930bGl interfaceC966930bGl, C967460bHc c967460bHc) {
        super(c967460bHc);
        this.LJ = interfaceC966930bGl;
        this.LJFF = new CopyOnWriteArraySet<>();
        this.LJI = new AbstractC967230bHF<C968340bJ2>() { // from class: X.0bHO
            @Override // X.AbstractC967230bHF
            public final void LIZIZ() {
                Iterator<Function0<Unit>> it2 = this.LIZJ.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
            }

            @Override // X.AbstractC967230bHF
            public final List<C968340bJ2> LIZJ() {
                return this.LIZJ.LJ.LJJJJZI();
            }
        };
        this.LJII = new AbstractC967230bHF<C968980bK4>() { // from class: X.0bHN
            @Override // X.AbstractC967230bHF
            public final void LIZIZ() {
                Iterator<Function0<Unit>> it2 = this.LIZJ.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().invoke();
                }
            }

            @Override // X.AbstractC967230bHF
            public final List<C968980bK4> LIZJ() {
                return this.LIZJ.LJ.LJLIL();
            }
        };
    }
}
