package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pIK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1506060pIK {
    public static final EnumC1506060pIK ATTACH;
    public static final /* synthetic */ EnumC1506060pIK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1506060pIK PAUSE;
    public static final EnumC1506060pIK PLAY;
    public static final EnumC1506060pIK RELEASE;
    public static final EnumC1506060pIK RESUME;
    public static final EnumC1506060pIK STOP;

    public static InterfaceC2044707zh<EnumC1506060pIK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1506060pIK enumC1506060pIK = new EnumC1506060pIK("ATTACH", 0);
        ATTACH = enumC1506060pIK;
        EnumC1506060pIK enumC1506060pIK2 = new EnumC1506060pIK("PLAY", 1);
        PLAY = enumC1506060pIK2;
        EnumC1506060pIK enumC1506060pIK3 = new EnumC1506060pIK("RESUME", 2);
        RESUME = enumC1506060pIK3;
        EnumC1506060pIK enumC1506060pIK4 = new EnumC1506060pIK("PAUSE", 3);
        PAUSE = enumC1506060pIK4;
        EnumC1506060pIK enumC1506060pIK5 = new EnumC1506060pIK("STOP", 4);
        STOP = enumC1506060pIK5;
        EnumC1506060pIK enumC1506060pIK6 = new EnumC1506060pIK("RELEASE", 5);
        RELEASE = enumC1506060pIK6;
        EnumC1506060pIK[] enumC1506060pIKArr = {enumC1506060pIK, enumC1506060pIK2, enumC1506060pIK3, enumC1506060pIK4, enumC1506060pIK5, enumC1506060pIK6};
        LL = enumC1506060pIKArr;
        LLILLJJLI = new C2254308sP(enumC1506060pIKArr);
    }

    public static EnumC1506060pIK[] values() {
        return (EnumC1506060pIK[]) LL.clone();
    }

    public static EnumC1506060pIK valueOf(String str) {
        return (EnumC1506060pIK) C08FF.LIZ(EnumC1506060pIK.class, str);
    }

    public EnumC1506060pIK(String str, int i) {
    }
}
