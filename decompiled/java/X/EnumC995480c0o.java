package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995480c0o {
    public static final EnumC995480c0o LL;
    public static final EnumC995480c0o LLILLJJLI;
    public static final /* synthetic */ EnumC995480c0o[] LLILLL;

    public static EnumC995480c0o valueOf(String str) {
        return (EnumC995480c0o) C08FF.LIZ(EnumC995480c0o.class, str);
    }

    public static EnumC995480c0o[] values() {
        return (EnumC995480c0o[]) LLILLL.clone();
    }

    static {
        EnumC995480c0o enumC995480c0o = new EnumC995480c0o("Min", 0);
        LL = enumC995480c0o;
        EnumC995480c0o enumC995480c0o2 = new EnumC995480c0o("Max", 1);
        LLILLJJLI = enumC995480c0o2;
        EnumC995480c0o[] enumC995480c0oArr = {enumC995480c0o, enumC995480c0o2};
        LLILLL = enumC995480c0oArr;
        new C2254308sP(enumC995480c0oArr);
    }

    public EnumC995480c0o(String str, int i) {
    }
}
