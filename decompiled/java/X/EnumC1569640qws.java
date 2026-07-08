package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1569640qws {
    public static final EnumC1569640qws INVALID;
    public static final /* synthetic */ EnumC1569640qws[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1569640qws LOADING;
    public static final EnumC1569640qws NORMAL;

    public static InterfaceC2044707zh<EnumC1569640qws> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1569640qws enumC1569640qws = new EnumC1569640qws("LOADING", 0);
        LOADING = enumC1569640qws;
        EnumC1569640qws enumC1569640qws2 = new EnumC1569640qws("NORMAL", 1);
        NORMAL = enumC1569640qws2;
        EnumC1569640qws enumC1569640qws3 = new EnumC1569640qws("INVALID", 2);
        INVALID = enumC1569640qws3;
        EnumC1569640qws[] enumC1569640qwsArr = {enumC1569640qws, enumC1569640qws2, enumC1569640qws3};
        LL = enumC1569640qwsArr;
        LLILLJJLI = new C2254308sP(enumC1569640qwsArr);
    }

    public static EnumC1569640qws[] values() {
        return (EnumC1569640qws[]) LL.clone();
    }

    public static EnumC1569640qws valueOf(String str) {
        return (EnumC1569640qws) C08FF.LIZ(EnumC1569640qws.class, str);
    }

    public EnumC1569640qws(String str, int i) {
    }
}
