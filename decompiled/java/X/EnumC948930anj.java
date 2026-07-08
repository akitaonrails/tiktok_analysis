package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0anj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC948930anj {
    public static final EnumC948930anj FAIL;
    public static final EnumC948930anj IDLE;
    public static final /* synthetic */ EnumC948930anj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC948930anj MATCHING;
    public static final EnumC948930anj SUCCESS;

    public static InterfaceC2044707zh<EnumC948930anj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC948930anj enumC948930anj = new EnumC948930anj("IDLE", 0);
        IDLE = enumC948930anj;
        EnumC948930anj enumC948930anj2 = new EnumC948930anj("MATCHING", 1);
        MATCHING = enumC948930anj2;
        EnumC948930anj enumC948930anj3 = new EnumC948930anj("FAIL", 2);
        FAIL = enumC948930anj3;
        EnumC948930anj enumC948930anj4 = new EnumC948930anj("SUCCESS", 3);
        SUCCESS = enumC948930anj4;
        EnumC948930anj[] enumC948930anjArr = {enumC948930anj, enumC948930anj2, enumC948930anj3, enumC948930anj4};
        LL = enumC948930anjArr;
        LLILLJJLI = new C2254308sP(enumC948930anjArr);
    }

    public static EnumC948930anj[] values() {
        return (EnumC948930anj[]) LL.clone();
    }

    public static EnumC948930anj valueOf(String str) {
        return (EnumC948930anj) C08FF.LIZ(EnumC948930anj.class, str);
    }

    public EnumC948930anj(String str, int i) {
    }
}
