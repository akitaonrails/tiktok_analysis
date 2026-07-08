package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC087200Uk {
    public static final EnumC087200Uk DEFAULT;
    public static final /* synthetic */ EnumC087200Uk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "default";

    public static InterfaceC2044707zh<EnumC087200Uk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC087200Uk enumC087200Uk = new EnumC087200Uk();
        DEFAULT = enumC087200Uk;
        EnumC087200Uk[] enumC087200UkArr = {enumC087200Uk};
        LLILLJJLI = enumC087200UkArr;
        LLILLL = new C2254308sP(enumC087200UkArr);
    }

    public static EnumC087200Uk[] values() {
        return (EnumC087200Uk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC087200Uk valueOf(String str) {
        return (EnumC087200Uk) C08FF.LIZ(EnumC087200Uk.class, str);
    }
}
