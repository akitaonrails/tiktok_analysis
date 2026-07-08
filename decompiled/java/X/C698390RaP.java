package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0RaP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698390RaP implements InterfaceC698960RbK {
    public final String LIZ;
    public final Rect LIZIZ;

    @Override // X.InterfaceC698960RbK
    public final Rect LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC698960RbK
    public final String LIZIZ() {
        return this.LIZ;
    }

    public C698390RaP(String str, boolean z, boolean z2) {
        int iIntValue;
        this.LIZ = str;
        if (z) {
            C01GW c01gw = C694320RLi.LIZ;
            iIntValue = ((Number) C694320RLi.LIZ.getValue()).intValue();
        } else {
            iIntValue = 0;
        }
        int i = C694320RLi.LIZIZ;
        this.LIZIZ = new Rect(iIntValue, i, z2 ? i : 0, i);
    }
}
