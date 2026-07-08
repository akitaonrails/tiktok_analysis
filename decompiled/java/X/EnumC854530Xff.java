package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854530Xff {
    public static final EnumC854530Xff CHANGE;
    public static final /* synthetic */ EnumC854530Xff[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854530Xff UNLINK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854530Xff> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854530Xff enumC854530Xff = new EnumC854530Xff("CHANGE", 0, "change");
        CHANGE = enumC854530Xff;
        EnumC854530Xff enumC854530Xff2 = new EnumC854530Xff("UNLINK", 1, "unlink");
        UNLINK = enumC854530Xff2;
        EnumC854530Xff[] enumC854530XffArr = {enumC854530Xff, enumC854530Xff2};
        LLILLJJLI = enumC854530XffArr;
        LLILLL = new C2254308sP(enumC854530XffArr);
    }

    public static EnumC854530Xff[] values() {
        return (EnumC854530Xff[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854530Xff valueOf(String str) {
        return (EnumC854530Xff) C08FF.LIZ(EnumC854530Xff.class, str);
    }

    public EnumC854530Xff(String str, int i, String str2) {
        this.LL = str2;
    }
}
