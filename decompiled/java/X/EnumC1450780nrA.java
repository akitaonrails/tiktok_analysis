package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1450780nrA {
    public static final EnumC1450780nrA CANCEL;
    public static final EnumC1450780nrA GO_EP;
    public static final /* synthetic */ EnumC1450780nrA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1450780nrA REMOVE_KEY_FRAME;

    public static InterfaceC2044707zh<EnumC1450780nrA> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1450780nrA enumC1450780nrA = new EnumC1450780nrA("GO_EP", 0);
        GO_EP = enumC1450780nrA;
        EnumC1450780nrA enumC1450780nrA2 = new EnumC1450780nrA("REMOVE_KEY_FRAME", 1);
        REMOVE_KEY_FRAME = enumC1450780nrA2;
        EnumC1450780nrA enumC1450780nrA3 = new EnumC1450780nrA("CANCEL", 2);
        CANCEL = enumC1450780nrA3;
        EnumC1450780nrA[] enumC1450780nrAArr = {enumC1450780nrA, enumC1450780nrA2, enumC1450780nrA3};
        LL = enumC1450780nrAArr;
        LLILLJJLI = new C2254308sP(enumC1450780nrAArr);
    }

    public static EnumC1450780nrA[] values() {
        return (EnumC1450780nrA[]) LL.clone();
    }

    public static EnumC1450780nrA valueOf(String str) {
        return (EnumC1450780nrA) C08FF.LIZ(EnumC1450780nrA.class, str);
    }

    public EnumC1450780nrA(String str, int i) {
    }
}
