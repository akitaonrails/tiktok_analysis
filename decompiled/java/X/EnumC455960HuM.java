package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC455960HuM {
    public static final EnumC455960HuM LEFT;
    public static final /* synthetic */ EnumC455960HuM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC455960HuM RIGHT;
    public final float LL;

    public static InterfaceC2044707zh<EnumC455960HuM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC455960HuM enumC455960HuM = new EnumC455960HuM(0.0f, "LEFT", 0);
        LEFT = enumC455960HuM;
        EnumC455960HuM enumC455960HuM2 = new EnumC455960HuM(1.0f, "RIGHT", 1);
        RIGHT = enumC455960HuM2;
        EnumC455960HuM[] enumC455960HuMArr = {enumC455960HuM, enumC455960HuM2};
        LLILLJJLI = enumC455960HuMArr;
        LLILLL = new C2254308sP(enumC455960HuMArr);
    }

    public static EnumC455960HuM[] values() {
        return (EnumC455960HuM[]) LLILLJJLI.clone();
    }

    public final float getRatio() {
        return this.LL;
    }

    public static EnumC455960HuM valueOf(String str) {
        return (EnumC455960HuM) C08FF.LIZ(EnumC455960HuM.class, str);
    }

    public EnumC455960HuM(float f, String str, int i) {
        this.LL = f;
    }
}
