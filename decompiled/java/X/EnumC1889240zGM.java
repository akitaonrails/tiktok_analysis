package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1889240zGM {
    public static final EnumC1889240zGM ACTIVITY;
    public static final EnumC1889240zGM FOLLOWER;
    public static final EnumC1889240zGM INBOX;
    public static final /* synthetic */ EnumC1889240zGM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1889240zGM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1889240zGM enumC1889240zGM = new EnumC1889240zGM("INBOX", 0);
        INBOX = enumC1889240zGM;
        EnumC1889240zGM enumC1889240zGM2 = new EnumC1889240zGM("ACTIVITY", 1);
        ACTIVITY = enumC1889240zGM2;
        EnumC1889240zGM enumC1889240zGM3 = new EnumC1889240zGM("FOLLOWER", 2);
        FOLLOWER = enumC1889240zGM3;
        EnumC1889240zGM[] enumC1889240zGMArr = {enumC1889240zGM, enumC1889240zGM2, enumC1889240zGM3};
        LL = enumC1889240zGMArr;
        LLILLJJLI = new C2254308sP(enumC1889240zGMArr);
    }

    public static EnumC1889240zGM[] values() {
        return (EnumC1889240zGM[]) LL.clone();
    }

    public static EnumC1889240zGM valueOf(String str) {
        return (EnumC1889240zGM) C08FF.LIZ(EnumC1889240zGM.class, str);
    }

    public EnumC1889240zGM(String str, int i) {
    }
}
