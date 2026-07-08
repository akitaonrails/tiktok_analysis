package X;

/* JADX INFO: renamed from: X.14yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20441714yl extends C20441514yj {
    public static final C20446714zZ Companion = new C20446714zZ();
    public final AbstractC20446014zS LLILZ;

    public static final AbstractC20027713Xv createFrom(String str, String str2) {
        Companion.getClass();
        return C20446714zZ.LIZ(str, str2);
    }

    public final AbstractC20446014zS getDomError() {
        return this.LLILZ;
    }

    public C20441714yl(AbstractC20446014zS abstractC20446014zS) {
        this(abstractC20446014zS, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C20441714yl(AbstractC20446014zS abstractC20446014zS, CharSequence charSequence) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/");
        sbLIZ.append(abstractC20446014zS.LIZ);
        super(C2188811AlT.LIZIZ(sbLIZ), charSequence);
        this.LLILZ = abstractC20446014zS;
    }
}
