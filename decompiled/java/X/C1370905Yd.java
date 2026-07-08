package X;

/* JADX INFO: renamed from: X.05Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1370905Yd {
    public static final /* synthetic */ C1370905Yd LIZ = new C1370905Yd();
    public static final C05YZ LIZIZ = new C05YW() { // from class: X.05YZ
        public final String toString() {
            return "SharingStarted.Eagerly";
        }

        @Override // X.C05YW
        public final InterfaceC346201Wa<C05YY> LIZ(C05YD<Integer> c05yd) {
            return new C516501zn(C05YY.START, 1);
        }
    };
    public static final C1371305Yh LIZJ = new C05YW() { // from class: X.05Yh
        public final String toString() {
            return "SharingStarted.Lazily";
        }

        @Override // X.C05YW
        public final InterfaceC346201Wa<C05YY> LIZ(C05YD<Integer> c05yd) {
            return new C095D(new C1371105Yf(c05yd, null));
        }
    };

    public static C1370805Yc LIZ(C1370905Yd c1370905Yd, long j, int i) {
        long j2 = 0;
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = Long.MAX_VALUE;
        }
        c1370905Yd.getClass();
        return new C1370805Yc(j, j2);
    }
}
