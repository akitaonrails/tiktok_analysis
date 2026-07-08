package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10sB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19381710sB {
    public static final EnumC19381710sB CONST;
    public static final EnumC19381710sB DARK;
    public static final /* synthetic */ EnumC19381710sB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19381710sB WHITE;

    public static InterfaceC2044707zh<EnumC19381710sB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19381710sB enumC19381710sB = new EnumC19381710sB("WHITE", 0);
        WHITE = enumC19381710sB;
        EnumC19381710sB enumC19381710sB2 = new EnumC19381710sB("DARK", 1);
        DARK = enumC19381710sB2;
        EnumC19381710sB enumC19381710sB3 = new EnumC19381710sB("CONST", 2);
        CONST = enumC19381710sB3;
        EnumC19381710sB[] enumC19381710sBArr = {enumC19381710sB, enumC19381710sB2, enumC19381710sB3};
        LL = enumC19381710sBArr;
        LLILLJJLI = new C2254308sP(enumC19381710sBArr);
    }

    public static EnumC19381710sB[] values() {
        return (EnumC19381710sB[]) LL.clone();
    }

    public static EnumC19381710sB valueOf(String str) {
        return (EnumC19381710sB) C08FF.LIZ(EnumC19381710sB.class, str);
    }

    public EnumC19381710sB(String str, int i) {
    }
}
