package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452900HpQ {
    public static final EnumC452900HpQ FAKE_MESSAGE;
    public static final EnumC452900HpQ FLOATING;
    public static final /* synthetic */ EnumC452900HpQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC452900HpQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC452900HpQ enumC452900HpQ = new EnumC452900HpQ("FAKE_MESSAGE", 0);
        FAKE_MESSAGE = enumC452900HpQ;
        EnumC452900HpQ enumC452900HpQ2 = new EnumC452900HpQ("FLOATING", 1);
        FLOATING = enumC452900HpQ2;
        EnumC452900HpQ[] enumC452900HpQArr = {enumC452900HpQ, enumC452900HpQ2};
        LL = enumC452900HpQArr;
        LLILLJJLI = new C2254308sP(enumC452900HpQArr);
    }

    public static EnumC452900HpQ[] values() {
        return (EnumC452900HpQ[]) LL.clone();
    }

    public static EnumC452900HpQ valueOf(String str) {
        return (EnumC452900HpQ) C08FF.LIZ(EnumC452900HpQ.class, str);
    }

    public EnumC452900HpQ(String str, int i) {
    }
}
