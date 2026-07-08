package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2249631D3h {
    public static final /* synthetic */ EnumC2249631D3h[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2249631D3h ON_CLICK_LISTENER;
    public static final EnumC2249631D3h ON_TOUCH_LISTENER;
    public static final EnumC2249631D3h OTHERS;
    public static final EnumC2249631D3h OVERRIDE_TOUCH_METHOD;

    public static InterfaceC2044707zh<EnumC2249631D3h> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2249631D3h enumC2249631D3h = new EnumC2249631D3h("OVERRIDE_TOUCH_METHOD", 0);
        OVERRIDE_TOUCH_METHOD = enumC2249631D3h;
        EnumC2249631D3h enumC2249631D3h2 = new EnumC2249631D3h("ON_CLICK_LISTENER", 1);
        ON_CLICK_LISTENER = enumC2249631D3h2;
        EnumC2249631D3h enumC2249631D3h3 = new EnumC2249631D3h("ON_TOUCH_LISTENER", 2);
        ON_TOUCH_LISTENER = enumC2249631D3h3;
        EnumC2249631D3h enumC2249631D3h4 = new EnumC2249631D3h("OTHERS", 3);
        OTHERS = enumC2249631D3h4;
        EnumC2249631D3h[] enumC2249631D3hArr = {enumC2249631D3h, enumC2249631D3h2, enumC2249631D3h3, enumC2249631D3h4};
        LL = enumC2249631D3hArr;
        LLILLJJLI = new C2254308sP(enumC2249631D3hArr);
    }

    public static EnumC2249631D3h[] values() {
        return (EnumC2249631D3h[]) LL.clone();
    }

    public static EnumC2249631D3h valueOf(String str) {
        return (EnumC2249631D3h) C08FF.LIZ(EnumC2249631D3h.class, str);
    }

    public EnumC2249631D3h(String str, int i) {
    }
}
