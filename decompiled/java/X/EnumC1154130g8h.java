package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154130g8h {
    public static final /* synthetic */ EnumC1154130g8h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154130g8h OTHERS;
    public static final EnumC1154130g8h RELATION_BUTTON;

    public static InterfaceC2044707zh<EnumC1154130g8h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154130g8h enumC1154130g8h = new EnumC1154130g8h("RELATION_BUTTON", 0);
        RELATION_BUTTON = enumC1154130g8h;
        EnumC1154130g8h enumC1154130g8h2 = new EnumC1154130g8h("OTHERS", 1);
        OTHERS = enumC1154130g8h2;
        EnumC1154130g8h[] enumC1154130g8hArr = {enumC1154130g8h, enumC1154130g8h2};
        LL = enumC1154130g8hArr;
        LLILLJJLI = new C2254308sP(enumC1154130g8hArr);
    }

    public static EnumC1154130g8h[] values() {
        return (EnumC1154130g8h[]) LL.clone();
    }

    public static EnumC1154130g8h valueOf(String str) {
        return (EnumC1154130g8h) C08FF.LIZ(EnumC1154130g8h.class, str);
    }

    public EnumC1154130g8h(String str, int i) {
    }
}
