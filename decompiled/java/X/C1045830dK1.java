package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0dK1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045830dK1 extends C1045650dJj implements InterfaceC1031390cwj {
    public InterfaceC1031420cwm LJ;

    @Override // X.InterfaceC1031390cwj
    public final void LJII() {
        this.LJ = null;
    }

    public C1045830dK1(InterfaceC1045690dJn interfaceC1045690dJn) {
        super(interfaceC1045690dJn);
    }

    @Override // X.InterfaceC1031390cwj
    public final void LIZ(Context context) {
        InterfaceC1031420cwm interfaceC1031420cwm;
        if (context != null && (interfaceC1031420cwm = this.LJ) != null) {
            interfaceC1031420cwm.LIZ(context);
        }
    }

    @Override // X.InterfaceC1031390cwj
    public final void LJIL(InterfaceC1031420cwm interfaceC1031420cwm) {
        this.LJ = interfaceC1031420cwm;
    }
}
