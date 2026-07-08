package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ins, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1256540ins {
    public static final EnumC1256540ins INBOX;
    public static final /* synthetic */ EnumC1256540ins[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1256540ins PROFILE;

    public static InterfaceC2044707zh<EnumC1256540ins> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1256540ins enumC1256540ins = new EnumC1256540ins("INBOX", 0);
        INBOX = enumC1256540ins;
        EnumC1256540ins enumC1256540ins2 = new EnumC1256540ins("PROFILE", 1);
        PROFILE = enumC1256540ins2;
        EnumC1256540ins[] enumC1256540insArr = {enumC1256540ins, enumC1256540ins2};
        LL = enumC1256540insArr;
        LLILLJJLI = new C2254308sP(enumC1256540insArr);
    }

    public static EnumC1256540ins[] values() {
        return (EnumC1256540ins[]) LL.clone();
    }

    public static EnumC1256540ins valueOf(String str) {
        return (EnumC1256540ins) C08FF.LIZ(EnumC1256540ins.class, str);
    }

    public EnumC1256540ins(String str, int i) {
    }
}
