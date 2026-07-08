package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1519405xA {
    public static final EnumC1519405xA DONE;
    public static final /* synthetic */ EnumC1519405xA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1519405xA PLAYING;
    public static final EnumC1519405xA SHOW_HINT;
    public static final EnumC1519405xA WAITING;

    public static InterfaceC2044707zh<EnumC1519405xA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1519405xA enumC1519405xA = new EnumC1519405xA("WAITING", 0);
        WAITING = enumC1519405xA;
        EnumC1519405xA enumC1519405xA2 = new EnumC1519405xA("PLAYING", 1);
        PLAYING = enumC1519405xA2;
        EnumC1519405xA enumC1519405xA3 = new EnumC1519405xA("SHOW_HINT", 2);
        SHOW_HINT = enumC1519405xA3;
        EnumC1519405xA enumC1519405xA4 = new EnumC1519405xA("DONE", 3);
        DONE = enumC1519405xA4;
        EnumC1519405xA[] enumC1519405xAArr = {enumC1519405xA, enumC1519405xA2, enumC1519405xA3, enumC1519405xA4};
        LL = enumC1519405xAArr;
        LLILLJJLI = new C2254308sP(enumC1519405xAArr);
    }

    public static EnumC1519405xA[] values() {
        return (EnumC1519405xA[]) LL.clone();
    }

    public static EnumC1519405xA valueOf(String str) {
        return (EnumC1519405xA) C08FF.LIZ(EnumC1519405xA.class, str);
    }

    public EnumC1519405xA(String str, int i) {
    }
}
