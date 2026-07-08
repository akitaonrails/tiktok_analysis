package X;

/* JADX INFO: renamed from: X.0aId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public enum EnumC929650aId {
    WINDOW("window"),
    PANEL("panel");

    public String value;

    public static EnumC929650aId valueOf(String str) {
        return (EnumC929650aId) C08FF.LIZ(EnumC929650aId.class, str);
    }

    EnumC929650aId(String str) {
        this.value = str;
    }
}
