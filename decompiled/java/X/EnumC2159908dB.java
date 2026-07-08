package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2159908dB {
    public static final EnumC2159908dB DRAFT_EFFECT;
    public static final /* synthetic */ EnumC2159908dB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2159908dB MOBILE_EFFECT;

    public static InterfaceC2044707zh<EnumC2159908dB> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2159908dB enumC2159908dB = new EnumC2159908dB("DRAFT_EFFECT", 0);
        DRAFT_EFFECT = enumC2159908dB;
        EnumC2159908dB enumC2159908dB2 = new EnumC2159908dB("MOBILE_EFFECT", 1);
        MOBILE_EFFECT = enumC2159908dB2;
        EnumC2159908dB[] enumC2159908dBArr = {enumC2159908dB, enumC2159908dB2};
        LL = enumC2159908dBArr;
        LLILLJJLI = new C2254308sP(enumC2159908dBArr);
    }

    public static EnumC2159908dB[] values() {
        return (EnumC2159908dB[]) LL.clone();
    }

    public static EnumC2159908dB valueOf(String str) {
        return (EnumC2159908dB) C08FF.LIZ(EnumC2159908dB.class, str);
    }

    public EnumC2159908dB(String str, int i) {
    }
}
