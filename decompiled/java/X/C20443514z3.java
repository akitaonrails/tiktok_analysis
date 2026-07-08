package X;

/* JADX INFO: renamed from: X.14z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20443514z3 extends C20443214z0 {
    public static final C20446814za Companion = new C20446814za();
    public final AbstractC20446014zS LLILZ;

    public static final AbstractC20027413Xs createFrom(String str, String str2) {
        Companion.getClass();
        return C20446814za.LIZ(str, str2);
    }

    public final AbstractC20446014zS getDomError() {
        return this.LLILZ;
    }

    public C20443514z3(AbstractC20446014zS abstractC20446014zS) {
        this(abstractC20446014zS, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20443514z3(AbstractC20446014zS abstractC20446014zS, CharSequence charSequence) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/");
        sbLIZ.append(abstractC20446014zS.LIZ);
        super(C2188811AlT.LIZIZ(sbLIZ), charSequence);
        this.LLILZ = abstractC20446014zS;
    }
}
