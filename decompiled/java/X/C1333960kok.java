package X;

/* JADX INFO: renamed from: X.0kok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1333960kok extends AbstractC1328990kgj<C1329210kh5> {
    public final InterfaceC1334020koq LIZ;
    public String LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("use fetcher: ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1333960kok(InterfaceC1334020koq interfaceC1334020koq) {
        this.LIZ = interfaceC1334020koq;
    }

    @Override // X.AbstractC1328990kgj, X.InterfaceC1328710kgH
    public final void LIZLLL(C1328680kgE c1328680kgE) {
        Runnable runnable = ((C1329210kh5) c1328680kgE).LJI.LJII;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // X.InterfaceC1328710kgH
    public final void LIZ(C1328680kgE c1328680kgE, C1328510kfx c1328510kfx) {
        C1329210kh5 c1329210kh5 = (C1329210kh5) c1328680kgE;
        if (c1329210kh5 != null) {
            C1335880krq c1335880krq = new C1335880krq(c1328510kfx);
            c1329210kh5.LJI.LJFF = c1329210kh5.LIZJ();
            c1329210kh5.LJI.getClass();
            EnumC1331380kka enumC1331380kka = c1329210kh5.LIZIZ.LJFF().LJIILL;
            if (enumC1331380kka == EnumC1331380kka.IMMEDIATE) {
                c1329210kh5.LJI.LJI = EnumC1334360kpO.IMMEDIATE;
            } else if (enumC1331380kka == EnumC1331380kka.HIGH) {
                c1329210kh5.LJI.LJI = EnumC1334360kpO.HIGH;
            } else if (enumC1331380kka == EnumC1331380kka.MEDIUM) {
                c1329210kh5.LJI.LJI = EnumC1334360kpO.MEDIUM;
            } else {
                c1329210kh5.LJI.LJI = EnumC1334360kpO.LOW;
            }
            c1329210kh5.LJI.LIZLLL = c1329210kh5.LIZ();
            c1329210kh5.LJI.LJIIJ = c1329210kh5.LIZIZ.LJFF().LIZJ;
            c1329210kh5.LJI.LJIIIZ = c1329210kh5.LIZIZ.LJFF().LJJIII;
            c1329210kh5.LJI.LJIJI = c1329210kh5.LIZIZ.LJFF().LJIIL;
            c1329210kh5.LJI.LJIIJJI = c1329210kh5.LIZIZ.LJFF().LJJIIJZLJL;
            C1333990kon c1333990kon = c1329210kh5.LJI;
            c1329210kh5.LIZIZ.LJFF();
            c1333990kon.getClass();
            C1333990kon c1333990kon2 = c1329210kh5.LJI;
            C1332160klq c1332160klqLJIIIZ = C1332160klq.LJIIIZ();
            if (c1332160klqLJIIIZ.LIZIZ.LJJJJL.LIZ() != null) {
                ((InterfaceC1334030kor) c1332160klqLJIIIZ.LIZIZ.LJJJJL.LIZ()).LIZ();
            }
            c1333990kon2.getClass();
            C1333900koe c1333900koe = C1330890kjn.LIZ;
            if (c1333900koe != null) {
                c1329210kh5.LJI.LJIIIIZZ = c1333900koe.LIZIZ;
            }
            final InterfaceC1334000koo interfaceC1334000kooLIZ = this.LIZ.LIZ();
            this.LIZIZ = interfaceC1334000kooLIZ.getClass().getName();
            interfaceC1334000kooLIZ.LIZ(c1329210kh5.LJI, c1335880krq);
            c1329210kh5.LIZIZ.LJ(new C1330860kjk() { // from class: X.0kop
                @Override // X.InterfaceC1330340kiu
                public final void LIZJ() {
                    interfaceC1334000kooLIZ.cancel();
                }
            });
            interfaceC1334000kooLIZ.LIZIZ(c1329210kh5.LJI, c1335880krq);
        }
    }

    @Override // X.InterfaceC1328710kgH
    public final C1328680kgE LIZJ(InterfaceC1328020kfA interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        C1329210kh5 c1329210kh5 = new C1329210kh5(interfaceC1328020kfA, interfaceC1327930kf1);
        c1329210kh5.LJI = new C1333990kon();
        return c1329210kh5;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dc  */
    @Override // X.AbstractC1328990kgj, X.InterfaceC1328710kgH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map LJ(X.C1328680kgE r12, int r13) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1333960kok.LJ(X.0kgE, int):java.util.Map");
    }
}
