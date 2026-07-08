package X;

/* JADX INFO: renamed from: X.0ENy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC363760ENy implements InterfaceC1600460rka {
    public final boolean LIZ(String str, boolean z) {
        return ((C0E12) this).LIZ.getBoolean(str, z);
    }

    public final void LIZIZ(String str, boolean z) {
        ((C0E12) this).LIZ.storeBoolean(str, z);
    }

    @Override // X.InterfaceC1600460rka
    public final void LIZJ(String str, int i) {
        ((C0E12) this).LIZ.storeInt(str, i);
    }

    @Override // X.InterfaceC1600460rka
    public final int getInt(String str, int i) {
        return ((C0E12) this).LIZ.getInt(str, i);
    }
}
