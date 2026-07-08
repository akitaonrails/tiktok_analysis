package X;

import X.AbstractC19933512yz;
import X.InterfaceC19933112yv;
import com.google.protobuf.k0;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.130N, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C130N<MType extends k0, BType extends AbstractC19933512yz, IType extends InterfaceC19933112yv> implements InterfaceC19935412zI {
    public InterfaceC19935412zI LIZ;
    public BType LIZIZ;
    public MType LIZJ;
    public boolean LIZLLL;

    public final MType LIZIZ() {
        this.LIZLLL = true;
        return (MType) LIZLLL();
    }

    @Override // X.InterfaceC19935412zI
    public final void LIZ() {
        InterfaceC19935412zI interfaceC19935412zI;
        if (this.LIZIZ != null) {
            this.LIZJ = null;
        }
        if (!this.LIZLLL || (interfaceC19935412zI = this.LIZ) == null) {
            return;
        }
        interfaceC19935412zI.LIZ();
        this.LIZLLL = false;
    }

    public final BType LIZJ() {
        BType btype = this.LIZIZ;
        if (btype != null) {
            return btype;
        }
        BType btype2 = (BType) this.LIZJ.LIZLLL(this);
        this.LIZIZ = btype2;
        btype2.LJ(this.LIZJ);
        btype2.LLILLL = true;
        return btype2;
    }

    public final MType LIZLLL() {
        if (this.LIZJ == null) {
            this.LIZJ = (MType) this.LIZIZ.buildPartial();
        }
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.google.protobuf.k0 r3) {
        /*
            r2 = this;
            BType extends X.12yz r0 = r2.LIZIZ
            if (r0 != 0) goto L24
            MType extends com.google.protobuf.k0 r1 = r2.LIZJ
            X.12yZ r0 = r1.getDefaultInstanceForType()
            if (r1 != r0) goto L24
            r2.LIZJ = r3
        Le:
            BType extends X.12yz r0 = r2.LIZIZ
            if (r0 == 0) goto L15
            r0 = 0
            r2.LIZJ = r0
        L15:
            boolean r0 = r2.LIZLLL
            if (r0 == 0) goto L23
            X.12zI r0 = r2.LIZ
            if (r0 == 0) goto L23
            r0.LIZ()
            r0 = 0
            r2.LIZLLL = r0
        L23:
            return
        L24:
            X.12yz r0 = r2.LIZJ()
            r0.LJ(r3)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C130N.LJ(com.google.protobuf.k0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C130N(k0 k0Var, AbstractC19933512yz.a aVar, boolean z) {
        Charset charset = C19922012x8.LIZ;
        k0Var.getClass();
        this.LIZJ = k0Var;
        this.LIZ = aVar;
        this.LIZLLL = z;
    }
}
