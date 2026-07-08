package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142140fpM {
    public static final EnumC1142140fpM COMPLETED;
    public static final EnumC1142140fpM ERROR;
    public static final EnumC1142140fpM IDLE;
    public static final /* synthetic */ EnumC1142140fpM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142140fpM LOADING;
    public static final EnumC1142140fpM PAUSED;
    public static final EnumC1142140fpM PLAYING;

    public static InterfaceC2044707zh<EnumC1142140fpM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142140fpM enumC1142140fpM = new EnumC1142140fpM("IDLE", 0);
        IDLE = enumC1142140fpM;
        EnumC1142140fpM enumC1142140fpM2 = new EnumC1142140fpM("LOADING", 1);
        LOADING = enumC1142140fpM2;
        EnumC1142140fpM enumC1142140fpM3 = new EnumC1142140fpM("PLAYING", 2);
        PLAYING = enumC1142140fpM3;
        EnumC1142140fpM enumC1142140fpM4 = new EnumC1142140fpM("PAUSED", 3);
        PAUSED = enumC1142140fpM4;
        EnumC1142140fpM enumC1142140fpM5 = new EnumC1142140fpM("COMPLETED", 4);
        COMPLETED = enumC1142140fpM5;
        EnumC1142140fpM enumC1142140fpM6 = new EnumC1142140fpM("ERROR", 5);
        ERROR = enumC1142140fpM6;
        EnumC1142140fpM[] enumC1142140fpMArr = {enumC1142140fpM, enumC1142140fpM2, enumC1142140fpM3, enumC1142140fpM4, enumC1142140fpM5, enumC1142140fpM6};
        LL = enumC1142140fpMArr;
        LLILLJJLI = new C2254308sP(enumC1142140fpMArr);
    }

    public static EnumC1142140fpM[] values() {
        return (EnumC1142140fpM[]) LL.clone();
    }

    public static EnumC1142140fpM valueOf(String str) {
        return (EnumC1142140fpM) C08FF.LIZ(EnumC1142140fpM.class, str);
    }

    public EnumC1142140fpM(String str, int i) {
    }
}
