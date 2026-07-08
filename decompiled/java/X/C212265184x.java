package X;

import android.text.TextUtils;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.184x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212265184x extends AbstractC212320187a<TuxTextView, C2297971Ex9, InterfaceC212288185u, InterfaceC212263184v> {
    public final C197039127h LJI;
    public Integer LJII;

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new InterfaceC212263184v() { // from class: X.1851
            @Override // X.InterfaceC212263184v
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }

    public C212265184x(C197039127h c197039127h) {
        super(c197039127h);
        this.LJI = c197039127h;
        c197039127h.setButtonVariant(-1);
        c197039127h.setTuxFont(72);
        c197039127h.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJJI(InterfaceC212288185u interfaceC212288185u) {
        final InterfaceC212288185u interfaceC212288185u2 = interfaceC212288185u;
        return new InterfaceC212263184v(interfaceC212288185u2) { // from class: X.184z
            public final InterfaceC212288185u LIZ;

            {
                this.LIZ = interfaceC212288185u2;
            }

            @Override // X.InterfaceC212263184v
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }
}
