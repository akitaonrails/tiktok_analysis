package X;

/* JADX INFO: renamed from: X.0qtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567550qtV extends RuntimeException {
    public static final C1567550qtV INSTANCE = new C1567550qtV();

    public C1567550qtV() {
        super("No more data");
    }

    private final Object readResolve() {
        return INSTANCE;
    }
}
