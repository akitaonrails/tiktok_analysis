package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974920bTe {
    public static final /* synthetic */ EnumC974920bTe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC974920bTe TEAM_LIST_EMPTY;
    public final String LL = "team_list_empty";

    public static InterfaceC2044707zh<EnumC974920bTe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974920bTe enumC974920bTe = new EnumC974920bTe();
        TEAM_LIST_EMPTY = enumC974920bTe;
        EnumC974920bTe[] enumC974920bTeArr = {enumC974920bTe};
        LLILLJJLI = enumC974920bTeArr;
        LLILLL = new C2254308sP(enumC974920bTeArr);
    }

    public static EnumC974920bTe[] values() {
        return (EnumC974920bTe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC974920bTe valueOf(String str) {
        return (EnumC974920bTe) C08FF.LIZ(EnumC974920bTe.class, str);
    }
}
