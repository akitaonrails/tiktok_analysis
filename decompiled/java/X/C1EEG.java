package X;

/* JADX INFO: renamed from: X.1EEG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EEG {
    public C1EEF LIZ;
    public int LIZIZ;
    public final C1EEH LIZJ = new C1EEF() { // from class: X.1EEH
        @Override // X.C1EEF
        public final boolean LIZ(Long l) {
            return true;
        }

        @Override // X.C1EEF
        public final boolean LIZIZ() {
            return false;
        }
    };

    public final void LIZIZ() {
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        if (i == 0) {
            C1EEE c1eeeLIZ = C1EEJ.LIZ();
            if (c1eeeLIZ != null) {
                c1eeeLIZ.LJIIIZ(this.LIZ);
            }
            this.LIZ = null;
        }
    }

    public static void LIZ(C1EEG c1eeg) {
        C1EEF c1eefLJFF;
        C1EEH c1eeh = c1eeg.LIZJ;
        if (c1eeg.LIZIZ == 0) {
            C1EEE c1eeeLIZ = C1EEJ.LIZ();
            if (c1eeeLIZ != null) {
                c1eefLJFF = c1eeeLIZ.LJFF();
            } else {
                c1eefLJFF = null;
            }
            c1eeg.LIZ = c1eefLJFF;
            C1EEE c1eeeLIZ2 = C1EEJ.LIZ();
            if (c1eeeLIZ2 != null) {
                c1eeeLIZ2.LJIIIZ(c1eeh);
            }
        }
        c1eeg.LIZIZ++;
    }
}
