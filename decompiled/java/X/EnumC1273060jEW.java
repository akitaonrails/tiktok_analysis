package X;

/* JADX INFO: renamed from: X.0jEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1273060jEW {
    ExposureValueType_Invalid("Invalid"),
    ExposureValueType_ExposureTimeOnly("ExposureTime"),
    ExposureValueType_IsoOnly("ISO"),
    ExposureValueType_ExposureTimeAndIso("ExposureTimeAndISO");

    public String value;

    public String getValue() {
        return this.value;
    }

    public static EnumC1273060jEW valueOf(String str) {
        return (EnumC1273060jEW) C08FF.LIZ(EnumC1273060jEW.class, str);
    }

    EnumC1273060jEW(String str) {
        this.value = str;
    }
}
