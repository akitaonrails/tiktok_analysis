package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0apM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC949940apM {
    public static final /* synthetic */ EnumC949940apM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC949940apM REMOVE;
    public static final EnumC949940apM TURN_OFF;

    public static InterfaceC2044707zh<EnumC949940apM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC949940apM enumC949940apM = new EnumC949940apM("REMOVE", 0);
        REMOVE = enumC949940apM;
        EnumC949940apM enumC949940apM2 = new EnumC949940apM("TURN_OFF", 1);
        TURN_OFF = enumC949940apM2;
        EnumC949940apM[] enumC949940apMArr = {enumC949940apM, enumC949940apM2};
        LL = enumC949940apMArr;
        LLILLJJLI = new C2254308sP(enumC949940apMArr);
    }

    public static EnumC949940apM[] values() {
        return (EnumC949940apM[]) LL.clone();
    }

    public static EnumC949940apM valueOf(String str) {
        return (EnumC949940apM) C08FF.LIZ(EnumC949940apM.class, str);
    }

    public EnumC949940apM(String str, int i) {
    }
}
