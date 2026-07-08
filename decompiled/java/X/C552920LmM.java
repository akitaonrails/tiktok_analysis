package X;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.0LmM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552920LmM implements InterfaceC552790Lm9<InterfaceC551900Lki<Serializable>, Serializable, Object, Object> {
    public final InterfaceC552790Lm9<InterfaceC551900Lki<Serializable>, Serializable, Object, Object> LIZ;
    public final C1902107ch LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C552960LmQ LJ = new InterfaceC551240Lje() { // from class: X.0LmQ
        @Override // X.InterfaceC551240Lje
        public final Object LIZ(Map<String, ? extends InterfaceC1406105et> map, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
            String nodeName = this.LIZ.getNodeName();
            C552920LmM c552920LmM = this.LIZ;
            C1902107ch c1902107ch = c552920LmM.LIZIZ;
            return c552920LmM.LIZ.LIZ().LIZ(new C1901907cf(map, nodeName, c1902107ch.LIZIZ, c1902107ch.LIZLLL, c552920LmM.LIZJ, c552920LmM.LIZLLL), interfaceC1364105Vn);
        }
    };
    public final C552900LmK LJFF = new C552900LmK(this);

    @Override // X.InterfaceC552790Lm9
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // X.InterfaceC552790Lm9
    public final String getNodeName() {
        return this.LIZ.getNodeName();
    }

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC551240Lje<Object> LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC552790Lm9
    public final InterfaceC552870LmH<Object> LJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC552820LmC
    public final Object LIZIZ(InterfaceC551900Lki interfaceC551900Lki, Object obj, C552950LmP c552950LmP) {
        return this.LIZ.LIZIZ(interfaceC551900Lki, obj, c552950LmP);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0LmQ] */
    public C552920LmM(InterfaceC552790Lm9<InterfaceC551900Lki<Serializable>, Serializable, Object, Object> interfaceC552790Lm9, C1902107ch c1902107ch, boolean z, boolean z2) {
        this.LIZ = interfaceC552790Lm9;
        this.LIZIZ = c1902107ch;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }

    @Override // X.InterfaceC552790Lm9
    public final Object LIZJ(InterfaceC551900Lki interfaceC551900Lki, Object obj, Map map, C552910LmL c552910LmL) {
        return this.LIZ.LIZJ(interfaceC551900Lki, obj, map, c552910LmL);
    }
}
