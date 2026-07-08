package X;

/* JADX INFO: renamed from: X.08AS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AS {
    public static final C08AU LIZ = new C08AR() { // from class: X.08AU
        @Override // X.C08AR
        public final void LIZ() {
        }
    };
    public static final C08AT LIZIZ = new ThreadLocal<C08AR>() { // from class: X.08AT
        @Override // java.lang.ThreadLocal
        public final C08AR initialValue() {
            return C08AS.LIZ;
        }
    };
}
