package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2004207tA {
    public static final EnumC2004207tA AI_GENERATED;
    public static final /* synthetic */ EnumC2004207tA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2004207tA PICK_ALBUM;
    public static final EnumC2004207tA RECOMMENDED_ALBUM;

    public static InterfaceC2044707zh<EnumC2004207tA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2004207tA enumC2004207tA = new EnumC2004207tA("PICK_ALBUM", 0);
        PICK_ALBUM = enumC2004207tA;
        EnumC2004207tA enumC2004207tA2 = new EnumC2004207tA("AI_GENERATED", 1);
        AI_GENERATED = enumC2004207tA2;
        EnumC2004207tA enumC2004207tA3 = new EnumC2004207tA("RECOMMENDED_ALBUM", 2);
        RECOMMENDED_ALBUM = enumC2004207tA3;
        EnumC2004207tA[] enumC2004207tAArr = {enumC2004207tA, enumC2004207tA2, enumC2004207tA3};
        LL = enumC2004207tAArr;
        LLILLJJLI = new C2254308sP(enumC2004207tAArr);
    }

    public static EnumC2004207tA[] values() {
        return (EnumC2004207tA[]) LL.clone();
    }

    public static EnumC2004207tA valueOf(String str) {
        return (EnumC2004207tA) C08FF.LIZ(EnumC2004207tA.class, str);
    }

    public EnumC2004207tA(String str, int i) {
    }
}
