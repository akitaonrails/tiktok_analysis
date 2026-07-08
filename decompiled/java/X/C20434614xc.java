package X;

/* JADX INFO: renamed from: X.14xc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20434614xc extends AbstractC20434814xe {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZIZ;

    public C20434614xc(String str) {
        this.LIZIZ = str;
        if (C1212290heV.LIZ(str)) {
            return;
        }
        "registrationResponseJson must not be empty, and must be a valid JSON".toString();
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }
}
