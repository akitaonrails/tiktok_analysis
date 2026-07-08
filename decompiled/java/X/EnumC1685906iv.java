package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1685906iv {
    public static final EnumC1685906iv EXPLAIN_PUBLIC;
    public static final EnumC1685906iv GUIDE_SET_PUBLIC;
    public static final /* synthetic */ EnumC1685906iv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1685906iv PERMISSION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1685906iv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1685906iv enumC1685906iv = new EnumC1685906iv("PERMISSION", 0, "activity_status_permission");
        PERMISSION = enumC1685906iv;
        EnumC1685906iv enumC1685906iv2 = new EnumC1685906iv("GUIDE_SET_PUBLIC", 1, "activity_status_guide_set_public");
        GUIDE_SET_PUBLIC = enumC1685906iv2;
        EnumC1685906iv enumC1685906iv3 = new EnumC1685906iv("EXPLAIN_PUBLIC", 2, "activity_status_explain_public");
        EXPLAIN_PUBLIC = enumC1685906iv3;
        EnumC1685906iv[] enumC1685906ivArr = {enumC1685906iv, enumC1685906iv2, enumC1685906iv3};
        LLILLJJLI = enumC1685906ivArr;
        LLILLL = new C2254308sP(enumC1685906ivArr);
    }

    public static EnumC1685906iv[] values() {
        return (EnumC1685906iv[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1685906iv valueOf(String str) {
        return (EnumC1685906iv) C08FF.LIZ(EnumC1685906iv.class, str);
    }

    public EnumC1685906iv(String str, int i, String str2) {
        this.LL = str2;
    }
}
