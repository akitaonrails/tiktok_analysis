package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC357480Dzu {
    public static final EnumC357480Dzu CANCELED;
    public static final EnumC357480Dzu FAILED;
    public static final /* synthetic */ EnumC357480Dzu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC357480Dzu NONE;
    public static final EnumC357480Dzu PROCESSING;
    public static final EnumC357480Dzu SUCCESS;

    public static InterfaceC2044707zh<EnumC357480Dzu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC357480Dzu enumC357480Dzu = new EnumC357480Dzu("NONE", 0);
        NONE = enumC357480Dzu;
        EnumC357480Dzu enumC357480Dzu2 = new EnumC357480Dzu("PROCESSING", 1);
        PROCESSING = enumC357480Dzu2;
        EnumC357480Dzu enumC357480Dzu3 = new EnumC357480Dzu("SUCCESS", 2);
        SUCCESS = enumC357480Dzu3;
        EnumC357480Dzu enumC357480Dzu4 = new EnumC357480Dzu("FAILED", 3);
        FAILED = enumC357480Dzu4;
        EnumC357480Dzu enumC357480Dzu5 = new EnumC357480Dzu("CANCELED", 4);
        CANCELED = enumC357480Dzu5;
        EnumC357480Dzu[] enumC357480DzuArr = {enumC357480Dzu, enumC357480Dzu2, enumC357480Dzu3, enumC357480Dzu4, enumC357480Dzu5};
        LL = enumC357480DzuArr;
        LLILLJJLI = new C2254308sP(enumC357480DzuArr);
    }

    public static EnumC357480Dzu[] values() {
        return (EnumC357480Dzu[]) LL.clone();
    }

    public static EnumC357480Dzu valueOf(String str) {
        return (EnumC357480Dzu) C08FF.LIZ(EnumC357480Dzu.class, str);
    }

    public EnumC357480Dzu(String str, int i) {
    }
}
