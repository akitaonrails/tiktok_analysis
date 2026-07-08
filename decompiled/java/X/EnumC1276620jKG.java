package X;

/* JADX INFO: renamed from: X.0jKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1276620jKG {
    APPDATA_SEI_ASYN_MODE(0),
    APPDATA_SEI_SYN_MODE(1);

    public int appdataSEISynMode;

    public static EnumC1276620jKG valueOf(String str) {
        return (EnumC1276620jKG) C08FF.LIZ(EnumC1276620jKG.class, str);
    }

    EnumC1276620jKG(int i) {
        this.appdataSEISynMode = i;
    }
}
