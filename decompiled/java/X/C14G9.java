package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14G9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14G9 {
    public static final C14G9 ACTIVITY;
    public static final C14G9 EXTERNAL;
    public static final C14G9 FRAGMENT;
    public static final C14G9 GLOBAL;
    public static final C14G9 ITEM;
    public static final /* synthetic */ C14G9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C14G9 OBJECT;
    public final Function1<C14GK, Object> LL;

    public static InterfaceC2044707zh<C14G9> getEntries() {
        return LLILLL;
    }

    static {
        C14G9 c14g9 = new C14G9(0, "GLOBAL");
        GLOBAL = c14g9;
        C14G9 c14g92 = new C14G9(1, "EXTERNAL");
        EXTERNAL = c14g92;
        C14G9 c14g93 = new C14G9(2, "ACTIVITY", AFwS274S0000000_30.get$arr$(33));
        ACTIVITY = c14g93;
        C14G9 c14g94 = new C14G9(3, "FRAGMENT", AFwS274S0000000_30.get$arr$(34));
        FRAGMENT = c14g94;
        C14G9 c14g95 = new C14G9(4, "ITEM", AFwS274S0000000_30.get$arr$(35));
        ITEM = c14g95;
        C14G9 c14g96 = new C14G9(5, "OBJECT", AFwS274S0000000_30.get$arr$(36));
        OBJECT = c14g96;
        C14G9[] c14g9Arr = {c14g9, c14g92, c14g93, c14g94, c14g95, c14g96};
        LLILLJJLI = c14g9Arr;
        LLILLL = new C2254308sP(c14g9Arr);
    }

    public static C14G9[] values() {
        return (C14G9[]) LLILLJJLI.clone();
    }

    public final Function1<C14GK, Object> getBinder() {
        return this.LL;
    }

    public static C14G9 valueOf(String str) {
        return (C14G9) C08FF.LIZ(C14G9.class, str);
    }

    public /* synthetic */ C14G9(int i, String str) {
        this(i, str, AFwS274S0000000_30.get$arr$(32));
    }

    public C14G9(int i, String str, Function1 function1) {
        this.LL = function1;
    }
}
