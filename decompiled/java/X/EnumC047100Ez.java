package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC047100Ez {
    public static final EnumC047100Ez AI_VOICE;
    public static final /* synthetic */ EnumC047100Ez[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC047100Ez NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC047100Ez> getEntries() {
        return LLILLL;
    }

    static {
        EnumC047100Ez enumC047100Ez = new EnumC047100Ez("NORMAL", 0, 0);
        NORMAL = enumC047100Ez;
        EnumC047100Ez enumC047100Ez2 = new EnumC047100Ez("AI_VOICE", 1, 1);
        AI_VOICE = enumC047100Ez2;
        EnumC047100Ez[] enumC047100EzArr = {enumC047100Ez, enumC047100Ez2};
        LLILLJJLI = enumC047100EzArr;
        LLILLL = new C2254308sP(enumC047100EzArr);
    }

    public static EnumC047100Ez[] values() {
        return (EnumC047100Ez[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC047100Ez valueOf(String str) {
        return (EnumC047100Ez) C08FF.LIZ(EnumC047100Ez.class, str);
    }

    public EnumC047100Ez(String str, int i, int i2) {
        this.LL = i2;
    }
}
