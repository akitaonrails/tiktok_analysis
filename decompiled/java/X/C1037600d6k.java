package X;

/* JADX INFO: renamed from: X.0d6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037600d6k {
    public EnumC1037560d6g LIZ;
    public String LIZIZ;

    public final C1037620d6m LIZ() {
        EnumC1037560d6g enumC1037560d6g = this.LIZ;
        if (enumC1037560d6g == null) {
            "missing landing page type".toString();
            throw new IllegalArgumentException("missing landing page type");
        }
        String str = this.LIZIZ;
        if (str != null) {
            return new C1037620d6m(enumC1037560d6g, str);
        }
        "missing url".toString();
        throw new IllegalArgumentException("missing url");
    }
}
