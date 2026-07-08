package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0e1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1072790e1V {
    public static final EnumC1072790e1V AUTHORIZE;
    public static final EnumC1072790e1V AUTO;
    public static final /* synthetic */ EnumC1072790e1V[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1072790e1V RELATED;

    public static InterfaceC2044707zh<EnumC1072790e1V> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1072790e1V enumC1072790e1V = new EnumC1072790e1V("AUTO", 0);
        AUTO = enumC1072790e1V;
        EnumC1072790e1V enumC1072790e1V2 = new EnumC1072790e1V("AUTHORIZE", 1);
        AUTHORIZE = enumC1072790e1V2;
        EnumC1072790e1V enumC1072790e1V3 = new EnumC1072790e1V("RELATED", 2);
        RELATED = enumC1072790e1V3;
        EnumC1072790e1V[] enumC1072790e1VArr = {enumC1072790e1V, enumC1072790e1V2, enumC1072790e1V3};
        LL = enumC1072790e1VArr;
        LLILLJJLI = new C2254308sP(enumC1072790e1VArr);
    }

    public static EnumC1072790e1V[] values() {
        return (EnumC1072790e1V[]) LL.clone();
    }

    public static EnumC1072790e1V valueOf(String str) {
        return (EnumC1072790e1V) C08FF.LIZ(EnumC1072790e1V.class, str);
    }

    public EnumC1072790e1V(String str, int i) {
    }
}
