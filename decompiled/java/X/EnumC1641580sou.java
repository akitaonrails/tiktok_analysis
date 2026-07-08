package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641580sou {
    public static final EnumC1641580sou CLOSE;
    public static final EnumC1641580sou DRAGGING;
    public static final /* synthetic */ EnumC1641580sou[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1641580sou> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641580sou enumC1641580sou = new EnumC1641580sou("DRAGGING", 0);
        DRAGGING = enumC1641580sou;
        EnumC1641580sou enumC1641580sou2 = new EnumC1641580sou("CLOSE", 1);
        CLOSE = enumC1641580sou2;
        EnumC1641580sou[] enumC1641580souArr = {enumC1641580sou, enumC1641580sou2};
        LL = enumC1641580souArr;
        LLILLJJLI = new C2254308sP(enumC1641580souArr);
    }

    public static EnumC1641580sou[] values() {
        return (EnumC1641580sou[]) LL.clone();
    }

    public static EnumC1641580sou valueOf(String str) {
        return (EnumC1641580sou) C08FF.LIZ(EnumC1641580sou.class, str);
    }

    public EnumC1641580sou(String str, int i) {
    }
}
