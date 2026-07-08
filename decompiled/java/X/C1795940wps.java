package X;

/* JADX INFO: renamed from: X.0wps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795940wps {
    public String LIZ;
    public String LIZIZ;

    public final C1795970wpv LIZ() {
        String str = this.LIZIZ;
        if ("first_party".equals(str)) {
            throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
        }
        if (this.LIZ == null) {
            throw new IllegalArgumentException("Product id must be provided.");
        }
        if (str != null) {
            return new C1795970wpv(this);
        }
        throw new IllegalArgumentException("Product type must be provided.");
    }
}
