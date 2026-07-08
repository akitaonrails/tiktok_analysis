package X;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0anx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949070anx implements InterfaceC949300aoK {
    public final InterfaceC947640ale LIZ;
    public final InterfaceC949280aoI<C947590alZ, InterfaceC947660alg> LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final C949310aoL<C947420alI, InterfaceC949240aoE> LIZLLL;

    public C949070anx() {
        throw null;
    }

    @Override // X.InterfaceC949330aoN
    /* JADX INFO: renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final C947420alI getCurrentState() {
        return this.LIZLLL.getCurrentState();
    }

    public C949070anx(C947420alI c947420alI) {
        InterfaceC947640ale interfaceC947640ale = new InterfaceC947640ale() { // from class: X.0alb
            public final int LIZ = 1;

            @Override // X.InterfaceC947640ale
            public final boolean LIZ(C947420alI c947420alI2) {
                int i;
                if (this.LIZ <= 0) {
                    return true;
                }
                Collection<C947590alZ> collectionValues = c947420alI2.LJIIIIZZ.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (C947590alZ c947590alZ : collectionValues) {
                        if (c947590alZ.LIZIZ != EnumC947600ala.AUDIENCE && c947590alZ.LIZJ == EnumC942260acy.READY && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                if (i >= this.LIZ) {
                    return true;
                }
                return false;
            }
        };
        InterfaceC949280aoI<C947590alZ, InterfaceC947660alg> interfaceC949280aoI = new InterfaceC949280aoI<C947590alZ, InterfaceC947660alg>() { // from class: X.0alf
            @Override // X.InterfaceC949280aoI
            public final C947590alZ LIZ(C947590alZ c947590alZ, InterfaceC947660alg interfaceC947660alg) {
                EnumC942260acy enumC942260acy;
                C947590alZ c947590alZ2 = c947590alZ;
                if (Intrinsics.LJFF(interfaceC947660alg, C947670alh.LIZ)) {
                    enumC942260acy = EnumC942260acy.IDLE;
                } else if (Intrinsics.LJFF(interfaceC947660alg, C947680ali.LIZ)) {
                    enumC942260acy = EnumC942260acy.JOINED;
                } else if (Intrinsics.LJFF(interfaceC947660alg, new InterfaceC947660alg() { // from class: X.0alk
                })) {
                    enumC942260acy = EnumC942260acy.IDLE;
                } else if (Intrinsics.LJFF(interfaceC947660alg, C947690alj.LIZ)) {
                    enumC942260acy = EnumC942260acy.READY;
                } else {
                    throw new C1954807lC();
                }
                if (enumC942260acy == c947590alZ2.LIZJ) {
                    return null;
                }
                return new C947590alZ(c947590alZ2.LIZ, c947590alZ2.LIZIZ, enumC942260acy, c947590alZ2.LIZLLL);
            }
        };
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
        this.LIZ = interfaceC947640ale;
        this.LIZIZ = interfaceC949280aoI;
        this.LIZJ = c054gLIZ;
        this.LIZLLL = new C949310aoL<>(c947420alI, new C949200aoA(this), c054gLIZ);
    }

    @Override // X.InterfaceC949300aoK
    public final boolean LIZ(C947420alI c947420alI) {
        return this.LIZ.LIZ(c947420alI);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C947420alI LIZJ(X.C947420alI r18, X.InterfaceC949240aoE r19) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949070anx.LIZJ(X.0alI, X.0aoE):X.0alI");
    }
}
