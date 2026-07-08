package X;

/* JADX INFO: renamed from: X.199x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public enum EnumC214943199x {
    NONE(0, "NONE"),
    CREATED(1, "CREATED"),
    VIEW_CREATED(2, "VIEW_CREATED"),
    ACTIVITY_CREATED(3, "ACTIVITY_CREATED"),
    STARTED(4, "STARTED"),
    RESUMED(5, "RESUMED");

    public final String name;
    public final int value;

    public String getName() {
        return this.name;
    }

    public static EnumC214943199x valueOf(String str) {
        return (EnumC214943199x) C08FF.LIZ(EnumC214943199x.class, str);
    }

    EnumC214943199x(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
