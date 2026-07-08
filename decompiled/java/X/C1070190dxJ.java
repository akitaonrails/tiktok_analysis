package X;

/* JADX INFO: renamed from: X.0dxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070190dxJ {
    public static final C19491211Nm LIZ(final C0I7D c0i7d) {
        final C259800zU c259800zU = new C259800zU();
        C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.03x1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<String> c09aj) {
                C1C7U.LIZ("TextChangeObservableKt@5ea6.getTextChangedObservable$observable$1");
                c259800zU.element = c09aj;
                C1C7U.LIZIZ("TextChangeObservableKt@5ea6.getTextChangedObservable$observable$1");
            }
        });
        final C1768006wA c1768006wA = new C1768006wA(c259800zU, 2);
        c0i7d.addTextChangedListener(c1768006wA);
        return c19482711KfLJIJJLI.LJJIIJ(new InterfaceC781210Ukh() { // from class: X.0dxK
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                c0i7d.removeTextChangedListener(c1768006wA);
            }
        });
    }
}
