package X;

/* JADX INFO: renamed from: X.0FCZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCZ {
    public final C0FCY LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public C0FCZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FCZ)) {
            return false;
        }
        C0FCZ c0fcz = (C0FCZ) obj;
        return this.LIZ == c0fcz.LIZ && this.LIZIZ == c0fcz.LIZIZ && this.LIZJ == c0fcz.LIZJ && this.LIZLLL == c0fcz.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceEffectPanelSceneState(loadingState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", toastError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showProgressView=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", curProgress=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0FCZ(int i) {
        this(C0FCY.INITIAL, false, false, -1);
    }

    public C0FCZ(C0FCY c0fcy, boolean z, boolean z2, int i) {
        this.LIZ = c0fcy;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = i;
    }

    public static C0FCZ LIZ(C0FCZ c0fcz, C0FCY c0fcy, boolean z, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            c0fcy = c0fcz.LIZ;
        }
        if ((i2 & 2) != 0) {
            z = c0fcz.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z2 = c0fcz.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i = c0fcz.LIZLLL;
        }
        c0fcz.getClass();
        return new C0FCZ(c0fcy, z, z2, i);
    }
}
