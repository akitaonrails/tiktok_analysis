package X;

import kotlin.jvm.functions.Function1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC646250PWl {
    public static final EnumC646250PWl BIND_AWEME;
    public static final EnumC646250PWl BIND_SEARCH_RESULT_PARAM;
    public static final EnumC646250PWl ETE_SESSION_ID;
    public static final EnumC646250PWl EXTERNAL;
    public static final EnumC646250PWl FRAGMENT;
    public static final EnumC646250PWl GLOBAL;
    public static final EnumC646250PWl ITEM;
    public static final /* synthetic */ EnumC646250PWl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC646250PWl OBJECT;
    public static final EnumC646250PWl SEARCH_ROOT;
    public static final EnumC646250PWl SEARCH_STACK;
    public static final EnumC646250PWl SESSION_ID;
    public final Function1<C0PWA, Object> LL;

    public static InterfaceC2044707zh<EnumC646250PWl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC646250PWl enumC646250PWl = new EnumC646250PWl(0, "GLOBAL");
        GLOBAL = enumC646250PWl;
        EnumC646250PWl enumC646250PWl2 = new EnumC646250PWl(1, "EXTERNAL");
        EXTERNAL = enumC646250PWl2;
        EnumC646250PWl enumC646250PWl3 = new EnumC646250PWl(2, "SEARCH_ROOT", new C646230PWj());
        SEARCH_ROOT = enumC646250PWl3;
        EnumC646250PWl enumC646250PWl4 = new EnumC646250PWl(3, "FRAGMENT", new C646240PWk());
        FRAGMENT = enumC646250PWl4;
        EnumC646250PWl enumC646250PWl5 = new EnumC646250PWl(4, "ITEM", new C646170PWd());
        ITEM = enumC646250PWl5;
        EnumC646250PWl enumC646250PWl6 = new EnumC646250PWl(5, "OBJECT", new C646310PWr());
        OBJECT = enumC646250PWl6;
        EnumC646250PWl enumC646250PWl7 = new EnumC646250PWl(6, "SESSION_ID", new C646260PWm());
        SESSION_ID = enumC646250PWl7;
        EnumC646250PWl enumC646250PWl8 = new EnumC646250PWl(7, "ETE_SESSION_ID", new C646270PWn());
        ETE_SESSION_ID = enumC646250PWl8;
        EnumC646250PWl enumC646250PWl9 = new EnumC646250PWl(8, "SEARCH_STACK", new C646160PWc());
        SEARCH_STACK = enumC646250PWl9;
        EnumC646250PWl enumC646250PWl10 = new EnumC646250PWl(9, "BIND_AWEME", new C646290PWp());
        BIND_AWEME = enumC646250PWl10;
        EnumC646250PWl enumC646250PWl11 = new EnumC646250PWl(10, "BIND_SEARCH_RESULT_PARAM", new C646280PWo());
        BIND_SEARCH_RESULT_PARAM = enumC646250PWl11;
        EnumC646250PWl[] enumC646250PWlArr = {enumC646250PWl, enumC646250PWl2, enumC646250PWl3, enumC646250PWl4, enumC646250PWl5, enumC646250PWl6, enumC646250PWl7, enumC646250PWl8, enumC646250PWl9, enumC646250PWl10, enumC646250PWl11};
        LLILLJJLI = enumC646250PWlArr;
        LLILLL = new C2254308sP(enumC646250PWlArr);
    }

    public static EnumC646250PWl[] values() {
        return (EnumC646250PWl[]) LLILLJJLI.clone();
    }

    public final Function1<C0PWA, Object> getBinder() {
        return this.LL;
    }

    public static EnumC646250PWl valueOf(String str) {
        return (EnumC646250PWl) C08FF.LIZ(EnumC646250PWl.class, str);
    }

    public /* synthetic */ EnumC646250PWl(int i, String str) {
        this(i, str, new C646320PWs());
    }

    public EnumC646250PWl(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
