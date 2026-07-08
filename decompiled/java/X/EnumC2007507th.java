package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007507th {
    public static final EnumC2007507th BOTTOM_ACTION_BAR;
    public static final /* synthetic */ EnumC2007507th[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2007507th TOP_TITLE_BAR;

    public static InterfaceC2044707zh<EnumC2007507th> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2007507th enumC2007507th = new EnumC2007507th("TOP_TITLE_BAR", 0);
        TOP_TITLE_BAR = enumC2007507th;
        EnumC2007507th enumC2007507th2 = new EnumC2007507th("BOTTOM_ACTION_BAR", 1);
        BOTTOM_ACTION_BAR = enumC2007507th2;
        EnumC2007507th[] enumC2007507thArr = {enumC2007507th, enumC2007507th2};
        LL = enumC2007507thArr;
        LLILLJJLI = new C2254308sP(enumC2007507thArr);
    }

    public static EnumC2007507th[] values() {
        return (EnumC2007507th[]) LL.clone();
    }

    public static EnumC2007507th valueOf(String str) {
        return (EnumC2007507th) C08FF.LIZ(EnumC2007507th.class, str);
    }

    public EnumC2007507th(String str, int i) {
    }
}
