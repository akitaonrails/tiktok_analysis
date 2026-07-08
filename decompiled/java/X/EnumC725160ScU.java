package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ScU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC725160ScU {
    public static final EnumC725160ScU IDLE;
    public static final /* synthetic */ EnumC725160ScU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC725160ScU RUNNING;
    public static final EnumC725160ScU SUCCESS;

    public static InterfaceC2044707zh<EnumC725160ScU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC725160ScU enumC725160ScU = new EnumC725160ScU("IDLE", 0);
        IDLE = enumC725160ScU;
        EnumC725160ScU enumC725160ScU2 = new EnumC725160ScU("RUNNING", 1);
        RUNNING = enumC725160ScU2;
        EnumC725160ScU enumC725160ScU3 = new EnumC725160ScU("SUCCESS", 2);
        SUCCESS = enumC725160ScU3;
        EnumC725160ScU[] enumC725160ScUArr = {enumC725160ScU, enumC725160ScU2, enumC725160ScU3};
        LL = enumC725160ScUArr;
        LLILLJJLI = new C2254308sP(enumC725160ScUArr);
    }

    public static EnumC725160ScU[] values() {
        return (EnumC725160ScU[]) LL.clone();
    }

    public static EnumC725160ScU valueOf(String str) {
        return (EnumC725160ScU) C08FF.LIZ(EnumC725160ScU.class, str);
    }

    public EnumC725160ScU(String str, int i) {
    }
}
