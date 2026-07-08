package X;

/* JADX INFO: renamed from: X.0jiU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1291640jiU {
    Json(".json"),
    Zip(".zip");

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

    public static EnumC1291640jiU forFile(String str) {
        for (EnumC1291640jiU enumC1291640jiU : values()) {
            if (str.endsWith(enumC1291640jiU.extension)) {
                return enumC1291640jiU;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unable to find correct extension for ");
        sbLIZ.append(str);
        C1291650jiV.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        return Json;
    }

    public static EnumC1291640jiU valueOf(String str) {
        return (EnumC1291640jiU) C08FF.LIZ(EnumC1291640jiU.class, str);
    }

    EnumC1291640jiU(String str) {
        this.extension = str;
    }
}
