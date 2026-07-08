package X;

import android.text.TextUtils;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.184y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212266184y extends AbstractC212320187a<TuxTextView, C212284185q, InterfaceC212288185u, InterfaceC212264184w> {
    public final C197039127h LJI;
    public Boolean LJII;
    public Integer LJIIIIZZ;

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJ() {
        return new InterfaceC212264184w() { // from class: X.1852
            @Override // X.InterfaceC212264184w
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }

    public C212266184y(C197039127h c197039127h) {
        super(c197039127h);
        this.LJI = c197039127h;
        c197039127h.setButtonVariant(-1);
        c197039127h.setTuxFont(72);
        c197039127h.setEllipsize(TextUtils.TruncateAt.MIDDLE);
    }

    @Override // X.AbstractC212320187a
    public final InterfaceC212321187b LJIIJJI(InterfaceC212288185u interfaceC212288185u) {
        final InterfaceC212288185u interfaceC212288185u2 = interfaceC212288185u;
        return new InterfaceC212264184w(interfaceC212288185u2) { // from class: X.1850
            public final InterfaceC212288185u LIZ;

            {
                this.LIZ = interfaceC212288185u2;
            }

            @Override // X.InterfaceC212264184w
            public final void LIZ(C197039127h c197039127h, int i) {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZJ = Float.valueOf(this.LIZ.LIZ());
                c384050F3z.LIZ = Integer.valueOf(i);
                c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
            }
        };
    }
}
