package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0J0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC485010J0h {
    public static final EnumC485010J0h FAILED;
    public static final EnumC485010J0h INITIAL_LOADING;
    public static final /* synthetic */ EnumC485010J0h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC485010J0h RUNNING;
    public static final EnumC485010J0h SUCCESS;

    public static InterfaceC2044707zh<EnumC485010J0h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC485010J0h enumC485010J0h = new EnumC485010J0h("RUNNING", 0);
        RUNNING = enumC485010J0h;
        EnumC485010J0h enumC485010J0h2 = new EnumC485010J0h("INITIAL_LOADING", 1);
        INITIAL_LOADING = enumC485010J0h2;
        EnumC485010J0h enumC485010J0h3 = new EnumC485010J0h("SUCCESS", 2);
        SUCCESS = enumC485010J0h3;
        EnumC485010J0h enumC485010J0h4 = new EnumC485010J0h("FAILED", 3);
        FAILED = enumC485010J0h4;
        EnumC485010J0h[] enumC485010J0hArr = {enumC485010J0h, enumC485010J0h2, enumC485010J0h3, enumC485010J0h4};
        LL = enumC485010J0hArr;
        LLILLJJLI = new C2254308sP(enumC485010J0hArr);
    }

    public static EnumC485010J0h[] values() {
        return (EnumC485010J0h[]) LL.clone();
    }

    public static EnumC485010J0h valueOf(String str) {
        return (EnumC485010J0h) C08FF.LIZ(EnumC485010J0h.class, str);
    }

    public EnumC485010J0h(String str, int i) {
    }
}
