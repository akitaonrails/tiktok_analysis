package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0323009h {
    public static final /* synthetic */ EnumC0323009h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0323009h SCHEMA_DIRECT;
    public static final EnumC0323009h UNKNOWN;

    public static InterfaceC2044707zh<EnumC0323009h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0323009h enumC0323009h = new EnumC0323009h("SCHEMA_DIRECT", 0);
        SCHEMA_DIRECT = enumC0323009h;
        EnumC0323009h enumC0323009h2 = new EnumC0323009h("UNKNOWN", 1);
        UNKNOWN = enumC0323009h2;
        EnumC0323009h[] enumC0323009hArr = {enumC0323009h, enumC0323009h2};
        LL = enumC0323009hArr;
        LLILLJJLI = new C2254308sP(enumC0323009hArr);
    }

    public static EnumC0323009h[] values() {
        return (EnumC0323009h[]) LL.clone();
    }

    public static EnumC0323009h valueOf(String str) {
        return (EnumC0323009h) C08FF.LIZ(EnumC0323009h.class, str);
    }

    public EnumC0323009h(String str, int i) {
    }
}
