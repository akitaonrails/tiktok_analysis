package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0htM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221500htM {
    public static final EnumC1221500htM FAIL;
    public static final EnumC1221500htM IN_PROGRESS;
    public static final /* synthetic */ EnumC1221500htM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221500htM SUCCESS;

    public static InterfaceC2044707zh<EnumC1221500htM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221500htM enumC1221500htM = new EnumC1221500htM("FAIL", 0);
        FAIL = enumC1221500htM;
        EnumC1221500htM enumC1221500htM2 = new EnumC1221500htM("SUCCESS", 1);
        SUCCESS = enumC1221500htM2;
        EnumC1221500htM enumC1221500htM3 = new EnumC1221500htM("IN_PROGRESS", 2);
        IN_PROGRESS = enumC1221500htM3;
        EnumC1221500htM[] enumC1221500htMArr = {enumC1221500htM, enumC1221500htM2, enumC1221500htM3};
        LL = enumC1221500htMArr;
        LLILLJJLI = new C2254308sP(enumC1221500htMArr);
    }

    public static EnumC1221500htM[] values() {
        return (EnumC1221500htM[]) LL.clone();
    }

    public static EnumC1221500htM valueOf(String str) {
        return (EnumC1221500htM) C08FF.LIZ(EnumC1221500htM.class, str);
    }

    public EnumC1221500htM(String str, int i) {
    }
}
