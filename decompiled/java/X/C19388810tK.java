package X;

import android.widget.Magnifier;

/* JADX INFO: renamed from: X.10tK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19388810tK implements InterfaceC1850740yGG {
    public final Magnifier LIZ;

    @Override // X.InterfaceC1850740yGG
    public final long LIZ() {
        return (((long) this.LIZ.getHeight()) & 4294967295L) | (((long) this.LIZ.getWidth()) << 32);
    }

    @Override // X.InterfaceC1850740yGG
    public final void LIZIZ() {
        this.LIZ.update();
    }

    @Override // X.InterfaceC1850740yGG
    public final void dismiss() {
        this.LIZ.dismiss();
    }

    public C19388810tK(Magnifier magnifier) {
        this.LIZ = magnifier;
    }

    @Override // X.InterfaceC1850740yGG
    public void LIZJ(float f, long j, long j2) {
        this.LIZ.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
