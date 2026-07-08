package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1234730iEh {
    public static final EnumC1234730iEh CREATE_GROUP;
    public static final EnumC1234730iEh INVITE_FRIENDS;
    public static final /* synthetic */ EnumC1234730iEh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1234730iEh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1234730iEh enumC1234730iEh = new EnumC1234730iEh("CREATE_GROUP", 0, "create_group");
        CREATE_GROUP = enumC1234730iEh;
        EnumC1234730iEh enumC1234730iEh2 = new EnumC1234730iEh("INVITE_FRIENDS", 1, "invite_friends");
        INVITE_FRIENDS = enumC1234730iEh2;
        EnumC1234730iEh[] enumC1234730iEhArr = {enumC1234730iEh, enumC1234730iEh2};
        LLILLJJLI = enumC1234730iEhArr;
        LLILLL = new C2254308sP(enumC1234730iEhArr);
    }

    public static EnumC1234730iEh[] values() {
        return (EnumC1234730iEh[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC1234730iEh valueOf(String str) {
        return (EnumC1234730iEh) C08FF.LIZ(EnumC1234730iEh.class, str);
    }

    public EnumC1234730iEh(String str, int i, String str2) {
        this.LL = str2;
    }
}
