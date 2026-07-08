package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC815370Vyh {
    public static final EnumC815370Vyh AVATAR;
    public static final EnumC815370Vyh COMMON;
    public static final /* synthetic */ EnumC815370Vyh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC815370Vyh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC815370Vyh enumC815370Vyh = new EnumC815370Vyh("AVATAR", 0, "avatar");
        AVATAR = enumC815370Vyh;
        EnumC815370Vyh enumC815370Vyh2 = new EnumC815370Vyh("COMMON", 1, "common");
        COMMON = enumC815370Vyh2;
        EnumC815370Vyh[] enumC815370VyhArr = {enumC815370Vyh, enumC815370Vyh2};
        LLILLJJLI = enumC815370VyhArr;
        LLILLL = new C2254308sP(enumC815370VyhArr);
    }

    public static EnumC815370Vyh[] values() {
        return (EnumC815370Vyh[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC815370Vyh valueOf(String str) {
        return (EnumC815370Vyh) C08FF.LIZ(EnumC815370Vyh.class, str);
    }

    public EnumC815370Vyh(String str, int i, String str2) {
        this.LL = str2;
    }
}
