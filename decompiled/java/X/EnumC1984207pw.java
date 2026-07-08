package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1984207pw {
    public static final EnumC1984207pw LL;
    public static final EnumC1984207pw LLILLJJLI;
    public static final /* synthetic */ EnumC1984207pw[] LLILLL;

    static {
        EnumC1984207pw enumC1984207pw = new EnumC1984207pw("Preparing", 0);
        LL = enumC1984207pw;
        EnumC1984207pw enumC1984207pw2 = new EnumC1984207pw("Producing", 1);
        LLILLJJLI = enumC1984207pw2;
        EnumC1984207pw[] enumC1984207pwArr = {enumC1984207pw, enumC1984207pw2};
        LLILLL = enumC1984207pwArr;
        new C2254308sP(enumC1984207pwArr);
    }

    public static EnumC1984207pw[] values() {
        return (EnumC1984207pw[]) LLILLL.clone();
    }

    public static EnumC1984207pw valueOf(String str) {
        return (EnumC1984207pw) C08FF.LIZ(EnumC1984207pw.class, str);
    }

    public EnumC1984207pw(String str, int i) {
    }
}
