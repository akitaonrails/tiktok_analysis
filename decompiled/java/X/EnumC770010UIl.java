package X;

/* JADX INFO: renamed from: X.0UIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public enum EnumC770010UIl {
    DEFAULT("unfinished"),
    NULL("emptyFace"),
    MALE("1"),
    FEMALE("2"),
    MULTIPLE("other"),
    FAILED("algoFailed");

    public final String value;

    public static EnumC770010UIl valueOf(String str) {
        return (EnumC770010UIl) C08FF.LIZ(EnumC770010UIl.class, str);
    }

    EnumC770010UIl(String str) {
        this.value = str;
    }
}
