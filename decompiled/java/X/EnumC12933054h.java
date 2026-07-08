package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12933054h {
    public static final EnumC12933054h EXIT_RULE;
    public static final EnumC12933054h FREQUENCY_RULE;
    public static final /* synthetic */ EnumC12933054h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12933054h NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12933054h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC12933054h enumC12933054h = new EnumC12933054h("NULL", 0, "null");
        NULL = enumC12933054h;
        EnumC12933054h enumC12933054h2 = new EnumC12933054h("FREQUENCY_RULE", 1, "frequency_rule");
        FREQUENCY_RULE = enumC12933054h2;
        EnumC12933054h enumC12933054h3 = new EnumC12933054h("EXIT_RULE", 2, "exit_rule");
        EXIT_RULE = enumC12933054h3;
        EnumC12933054h[] enumC12933054hArr = {enumC12933054h, enumC12933054h2, enumC12933054h3};
        LLILLJJLI = enumC12933054hArr;
        LLILLL = new C2254308sP(enumC12933054hArr);
    }

    public static EnumC12933054h[] values() {
        return (EnumC12933054h[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC12933054h valueOf(String str) {
        return (EnumC12933054h) C08FF.LIZ(EnumC12933054h.class, str);
    }

    public EnumC12933054h(String str, int i, String str2) {
        this.LL = str2;
    }
}
