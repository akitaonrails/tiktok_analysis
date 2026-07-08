package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fRW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1127360fRW {
    public static final EnumC1127360fRW DialogCountdown;
    public static final EnumC1127360fRW Idle;
    public static final EnumC1127360fRW ItemCountdown;
    public static final /* synthetic */ EnumC1127360fRW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1127360fRW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1127360fRW enumC1127360fRW = new EnumC1127360fRW("DialogCountdown", 0);
        DialogCountdown = enumC1127360fRW;
        EnumC1127360fRW enumC1127360fRW2 = new EnumC1127360fRW("ItemCountdown", 1);
        ItemCountdown = enumC1127360fRW2;
        EnumC1127360fRW enumC1127360fRW3 = new EnumC1127360fRW("Idle", 2);
        Idle = enumC1127360fRW3;
        EnumC1127360fRW[] enumC1127360fRWArr = {enumC1127360fRW, enumC1127360fRW2, enumC1127360fRW3};
        LL = enumC1127360fRWArr;
        LLILLJJLI = new C2254308sP(enumC1127360fRWArr);
    }

    public static EnumC1127360fRW[] values() {
        return (EnumC1127360fRW[]) LL.clone();
    }

    public static EnumC1127360fRW valueOf(String str) {
        return (EnumC1127360fRW) C08FF.LIZ(EnumC1127360fRW.class, str);
    }

    public EnumC1127360fRW(String str, int i) {
    }
}
