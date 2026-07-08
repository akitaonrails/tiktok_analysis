package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.081h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20499081h {
    public static final EnumC20499081h FALSE;
    public static final /* synthetic */ EnumC20499081h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20499081h TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20499081h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20499081h enumC20499081h = new EnumC20499081h("FALSE", 0, "false");
        FALSE = enumC20499081h;
        EnumC20499081h enumC20499081h2 = new EnumC20499081h("TRUE", 1, "true");
        TRUE = enumC20499081h2;
        EnumC20499081h[] enumC20499081hArr = {enumC20499081h, enumC20499081h2};
        LLILLJJLI = enumC20499081hArr;
        LLILLL = new C2254308sP(enumC20499081hArr);
    }

    public static EnumC20499081h[] values() {
        return (EnumC20499081h[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20499081h valueOf(String str) {
        return (EnumC20499081h) C08FF.LIZ(EnumC20499081h.class, str);
    }

    public EnumC20499081h(String str, int i, String str2) {
        this.LL = str2;
    }
}
