package X;

/* JADX INFO: renamed from: X.0VN3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VN3 {
    public final int version;

    public abstract void createAllTables(C0VLF c0vlf);

    public abstract void dropAllTables(C0VLF c0vlf);

    public abstract void onCreate(C0VLF c0vlf);

    public abstract void onOpen(C0VLF c0vlf);

    public void onPostMigrate(C0VLF c0vlf) {
    }

    public void onPreMigrate(C0VLF c0vlf) {
    }

    public C0VN3(int i) {
        this.version = i;
    }

    public C0VN4 onValidateSchema(C0VLF c0vlf) {
        validateMigration(c0vlf);
        return new C0VN4(true, null);
    }

    public void validateMigration(C0VLF c0vlf) {
        throw new UnsupportedOperationException("validateMigration is deprecated");
    }
}
