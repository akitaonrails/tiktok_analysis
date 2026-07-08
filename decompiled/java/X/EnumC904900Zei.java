package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC904900Zei {
    public static final EnumC904900Zei ANSWER;
    public static final EnumC904900Zei DEMO_MESSAGE;
    public static final EnumC904900Zei GENERATING;
    public static final /* synthetic */ EnumC904900Zei[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC904900Zei MOCK_MESSAGE;

    public static InterfaceC2044707zh<EnumC904900Zei> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC904900Zei enumC904900Zei = new EnumC904900Zei("ANSWER", 0);
        ANSWER = enumC904900Zei;
        EnumC904900Zei enumC904900Zei2 = new EnumC904900Zei("GENERATING", 1);
        GENERATING = enumC904900Zei2;
        EnumC904900Zei enumC904900Zei3 = new EnumC904900Zei("MOCK_MESSAGE", 2);
        MOCK_MESSAGE = enumC904900Zei3;
        EnumC904900Zei enumC904900Zei4 = new EnumC904900Zei("DEMO_MESSAGE", 3);
        DEMO_MESSAGE = enumC904900Zei4;
        EnumC904900Zei[] enumC904900ZeiArr = {enumC904900Zei, enumC904900Zei2, enumC904900Zei3, enumC904900Zei4};
        LL = enumC904900ZeiArr;
        LLILLJJLI = new C2254308sP(enumC904900ZeiArr);
    }

    public static EnumC904900Zei[] values() {
        return (EnumC904900Zei[]) LL.clone();
    }

    public static EnumC904900Zei valueOf(String str) {
        return (EnumC904900Zei) C08FF.LIZ(EnumC904900Zei.class, str);
    }

    public EnumC904900Zei(String str, int i) {
    }
}
