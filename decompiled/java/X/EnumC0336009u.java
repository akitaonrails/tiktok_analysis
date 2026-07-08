package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0336009u {
    public static final C0337009v Companion;
    public static final EnumC0336009u DEFAULT;
    public static final /* synthetic */ EnumC0336009u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 0;

    public static InterfaceC2044707zh<EnumC0336009u> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.009v] */
    static {
        EnumC0336009u enumC0336009u = new EnumC0336009u();
        DEFAULT = enumC0336009u;
        EnumC0336009u[] enumC0336009uArr = {enumC0336009u};
        LLILLJJLI = enumC0336009uArr;
        LLILLL = new C2254308sP(enumC0336009uArr);
        Companion = new Object() { // from class: X.009v
        };
    }

    public static EnumC0336009u[] values() {
        return (EnumC0336009u[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0336009u valueOf(String str) {
        return (EnumC0336009u) C08FF.LIZ(EnumC0336009u.class, str);
    }
}
