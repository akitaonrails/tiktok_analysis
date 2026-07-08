package X;

import android.content.Context;

/* JADX INFO: renamed from: X.01zc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C515401zc implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C515401zc c515401zc, InterfaceC2329309At interfaceC2329309At) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01PU((Context) c515401zc.l1, (EnumC389301fH) c515401zc.l2, (C394101g3) c515401zc.l0, interfaceC2329309At, null), 3);
    }

    public static final void subscribe$1(C515401zc c515401zc, InterfaceC2329309At interfaceC2329309At) {
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        C394101g3 c394101g3 = (C394101g3) c515401zc.l0;
        C23250099c.LIZLLL(c054gLIZ, null, null, new C328101Pb((Context) c515401zc.l2, (EnumC389301fH) c515401zc.l1, c394101g3, interfaceC2329309At, null), 3);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C515401zc(android.content.Context r2, X.EnumC389301fH r3, X.C394101g3 r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C515401zc.<init>(android.content.Context, X.01fH, X.01g3, int):void");
    }
}
