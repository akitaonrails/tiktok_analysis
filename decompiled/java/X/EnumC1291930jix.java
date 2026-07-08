package X;

/* JADX INFO: renamed from: X.0jix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1291930jix {
    JSON(".json"),
    ZIP(".zip");

    public final String extension;

    public String tempExtension() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(".temp");
        sbLIZ.append(this.extension);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.extension;
    }

    public static EnumC1291930jix valueOf(String str) {
        return (EnumC1291930jix) C08FF.LIZ(EnumC1291930jix.class, str);
    }

    EnumC1291930jix(String str) {
        this.extension = str;
    }
}
