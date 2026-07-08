package X;

/* JADX INFO: renamed from: X.0KgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523800KgU {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;

    public final C523790KgT LIZ() {
        String str = this.LIZ;
        if (str == null || str.length() == 0) {
            "You must specify a non-empty bpea token for API 34".toString();
            throw new IllegalArgumentException("You must specify a non-empty bpea token for API 34");
        }
        String str2 = this.LIZIZ;
        if (str2 == null || str2.length() == 0) {
            "You must specify a non-empty bpea token for API 33".toString();
            throw new IllegalArgumentException("You must specify a non-empty bpea token for API 33");
        }
        String str3 = this.LIZJ;
        if (str3 != null && str3.length() != 0) {
            return new C523790KgT(str, str2, str3);
        }
        "You must specify a non-empty bpea token for lower Android versions".toString();
        throw new IllegalArgumentException("You must specify a non-empty bpea token for lower Android versions");
    }
}
