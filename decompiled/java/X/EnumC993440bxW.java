package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993440bxW {
    public static final /* synthetic */ EnumC993440bxW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993440bxW TYPE_NORMAL;
    public static final EnumC993440bxW TYPE_PRELOAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993440bxW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993440bxW enumC993440bxW = new EnumC993440bxW("TYPE_PRELOAD", 0, "preload");
        TYPE_PRELOAD = enumC993440bxW;
        EnumC993440bxW enumC993440bxW2 = new EnumC993440bxW("TYPE_NORMAL", 1, "normal");
        TYPE_NORMAL = enumC993440bxW2;
        EnumC993440bxW[] enumC993440bxWArr = {enumC993440bxW, enumC993440bxW2};
        LLILLJJLI = enumC993440bxWArr;
        LLILLL = new C2254308sP(enumC993440bxWArr);
    }

    public static EnumC993440bxW[] values() {
        return (EnumC993440bxW[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC993440bxW valueOf(String str) {
        return (EnumC993440bxW) C08FF.LIZ(EnumC993440bxW.class, str);
    }

    public EnumC993440bxW(String str, int i, String str2) {
        this.LL = str2;
    }
}
