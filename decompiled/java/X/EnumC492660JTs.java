package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JTs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC492660JTs {
    public static final EnumC492660JTs CLOSE;
    public static final /* synthetic */ EnumC492660JTs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC492660JTs START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC492660JTs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC492660JTs enumC492660JTs = new EnumC492660JTs("CLOSE", 0, "close");
        CLOSE = enumC492660JTs;
        EnumC492660JTs enumC492660JTs2 = new EnumC492660JTs("START", 1, "start");
        START = enumC492660JTs2;
        EnumC492660JTs[] enumC492660JTsArr = {enumC492660JTs, enumC492660JTs2};
        LLILLJJLI = enumC492660JTsArr;
        LLILLL = new C2254308sP(enumC492660JTsArr);
    }

    public static EnumC492660JTs[] values() {
        return (EnumC492660JTs[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC492660JTs valueOf(String str) {
        return (EnumC492660JTs) C08FF.LIZ(EnumC492660JTs.class, str);
    }

    public EnumC492660JTs(String str, int i, String str2) {
        this.LL = str2;
    }
}
