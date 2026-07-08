package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09gJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2434109gJ {
    public static final EnumC2434109gJ DM_USER_RECEIVE;
    public static final EnumC2434109gJ DM_USER_SEND;
    public static final /* synthetic */ EnumC2434109gJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2434109gJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2434109gJ enumC2434109gJ = new EnumC2434109gJ("DM_USER_SEND", 0, 1);
        DM_USER_SEND = enumC2434109gJ;
        EnumC2434109gJ enumC2434109gJ2 = new EnumC2434109gJ("DM_USER_RECEIVE", 1, 2);
        DM_USER_RECEIVE = enumC2434109gJ2;
        EnumC2434109gJ[] enumC2434109gJArr = {enumC2434109gJ, enumC2434109gJ2};
        LLILLJJLI = enumC2434109gJArr;
        LLILLL = new C2254308sP(enumC2434109gJArr);
    }

    public static EnumC2434109gJ[] values() {
        return (EnumC2434109gJ[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC2434109gJ valueOf(String str) {
        return (EnumC2434109gJ) C08FF.LIZ(EnumC2434109gJ.class, str);
    }

    public EnumC2434109gJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
