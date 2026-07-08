package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1087450eP9 {
    public static final EnumC1087450eP9 CLICK;
    public static final /* synthetic */ EnumC1087450eP9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1087450eP9 RECEIVE;
    public static final EnumC1087450eP9 SHOW;

    public static InterfaceC2044707zh<EnumC1087450eP9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1087450eP9 enumC1087450eP9 = new EnumC1087450eP9("RECEIVE", 0);
        RECEIVE = enumC1087450eP9;
        EnumC1087450eP9 enumC1087450eP92 = new EnumC1087450eP9("SHOW", 1);
        SHOW = enumC1087450eP92;
        EnumC1087450eP9 enumC1087450eP93 = new EnumC1087450eP9("CLICK", 2);
        CLICK = enumC1087450eP93;
        EnumC1087450eP9[] enumC1087450eP9Arr = {enumC1087450eP9, enumC1087450eP92, enumC1087450eP93};
        LL = enumC1087450eP9Arr;
        LLILLJJLI = new C2254308sP(enumC1087450eP9Arr);
    }

    public static EnumC1087450eP9[] values() {
        return (EnumC1087450eP9[]) LL.clone();
    }

    public static EnumC1087450eP9 valueOf(String str) {
        return (EnumC1087450eP9) C08FF.LIZ(EnumC1087450eP9.class, str);
    }

    public EnumC1087450eP9(String str, int i) {
    }
}
