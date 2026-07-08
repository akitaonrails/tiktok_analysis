package X;

/* JADX INFO: renamed from: X.18AF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C18AF {
    UNNEEDED_PARAM("unneeded_param", "unneeded_param"),
    MISS_PARAM("miss_param", "miss_param"),
    TYPE_ERROR("illegal_type", "illegal_type"),
    VALUE_ERROR("illegal_value", "illegal_value");

    public final String LL;
    public final String LLILLJJLI;

    public static C18AF valueOf(String str) {
        return (C18AF) C08FF.LIZ(C18AF.class, str);
    }

    public final String getErrorTip() {
        return this.LLILLJJLI;
    }

    public final String getValue() {
        return this.LL;
    }

    C18AF(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
