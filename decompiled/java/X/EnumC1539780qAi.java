package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1539780qAi {
    public static final EnumC1539780qAi DEBUG_CONTEXT;
    public static final EnumC1539780qAi GLOBAL_PROPS;
    public static final EnumC1539780qAi INIT_DATA;
    public static final /* synthetic */ EnumC1539780qAi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1539780qAi REQUEST_EXTRA;
    public static final EnumC1539780qAi SSR_META;
    public static final EnumC1539780qAi SSR_RESULT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1539780qAi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1539780qAi enumC1539780qAi = new EnumC1539780qAi("SSR_META", 0, 0);
        SSR_META = enumC1539780qAi;
        EnumC1539780qAi enumC1539780qAi2 = new EnumC1539780qAi("SSR_RESULT", 1, 1);
        SSR_RESULT = enumC1539780qAi2;
        EnumC1539780qAi enumC1539780qAi3 = new EnumC1539780qAi("INIT_DATA", 2, 2);
        INIT_DATA = enumC1539780qAi3;
        EnumC1539780qAi enumC1539780qAi4 = new EnumC1539780qAi("GLOBAL_PROPS", 3, 3);
        GLOBAL_PROPS = enumC1539780qAi4;
        EnumC1539780qAi enumC1539780qAi5 = new EnumC1539780qAi("DEBUG_CONTEXT", 4, 4);
        DEBUG_CONTEXT = enumC1539780qAi5;
        EnumC1539780qAi enumC1539780qAi6 = new EnumC1539780qAi("REQUEST_EXTRA", 5, 5);
        REQUEST_EXTRA = enumC1539780qAi6;
        EnumC1539780qAi[] enumC1539780qAiArr = {enumC1539780qAi, enumC1539780qAi2, enumC1539780qAi3, enumC1539780qAi4, enumC1539780qAi5, enumC1539780qAi6};
        LLILLJJLI = enumC1539780qAiArr;
        LLILLL = new C2254308sP(enumC1539780qAiArr);
    }

    public static EnumC1539780qAi[] values() {
        return (EnumC1539780qAi[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC1539780qAi valueOf(String str) {
        return (EnumC1539780qAi) C08FF.LIZ(EnumC1539780qAi.class, str);
    }

    public EnumC1539780qAi(String str, int i, int i2) {
        this.LL = i2;
    }
}
