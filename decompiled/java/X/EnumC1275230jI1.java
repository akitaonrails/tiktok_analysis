package X;

/* JADX INFO: renamed from: X.0jI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1275230jI1 {
    UNKNOWN("unknown"),
    Pathway_ConfigVideoParam("configVideoParam"),
    Pathway_Sync_SetVideoEncoderConfig("setVideoEncoderConfig");

    public final String LL;

    public String getPathName() {
        return this.LL;
    }

    public static EnumC1275230jI1 valueOf(String str) {
        return (EnumC1275230jI1) C08FF.LIZ(EnumC1275230jI1.class, str);
    }

    EnumC1275230jI1(String str) {
        this.LL = str;
    }
}
