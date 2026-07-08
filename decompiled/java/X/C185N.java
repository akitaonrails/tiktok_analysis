package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.185N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C185N extends AbstractC212320187a<C197039127h, C2298851EyZ, InterfaceC212288185u, InterfaceC212272185e> {
    public final C197039127h LJI;

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new InterfaceC212272185e() { // from class: X.185T
            @Override // X.InterfaceC212272185e
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }

    public C185N(C197039127h c197039127h) {
        super(c197039127h);
        this.LJI = c197039127h;
        c197039127h.setButtonVariant(-1);
        c197039127h.setTuxFont(72);
        c197039127h.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJJI(InterfaceC212288185u interfaceC212288185u) {
        final InterfaceC212288185u interfaceC212288185u2 = interfaceC212288185u;
        return new InterfaceC212272185e(interfaceC212288185u2) { // from class: X.185M
            public final InterfaceC212288185u LIZ;

            {
                this.LIZ = interfaceC212288185u2;
            }

            @Override // X.InterfaceC212272185e
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }
}
