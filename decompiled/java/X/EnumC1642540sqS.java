package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0sqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1642540sqS {
    public static final EnumC1642540sqS BUILTIN_CLICK;
    public static final EnumC1642540sqS INSERT;
    public static final /* synthetic */ EnumC1642540sqS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1642540sqS REMOVE;

    public static InterfaceC2044707zh<EnumC1642540sqS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1642540sqS enumC1642540sqS = new EnumC1642540sqS("BUILTIN_CLICK", 0);
        BUILTIN_CLICK = enumC1642540sqS;
        EnumC1642540sqS enumC1642540sqS2 = new EnumC1642540sqS("INSERT", 1);
        INSERT = enumC1642540sqS2;
        EnumC1642540sqS enumC1642540sqS3 = new EnumC1642540sqS("REMOVE", 2);
        REMOVE = enumC1642540sqS3;
        EnumC1642540sqS[] enumC1642540sqSArr = {enumC1642540sqS, enumC1642540sqS2, enumC1642540sqS3};
        LL = enumC1642540sqSArr;
        LLILLJJLI = new C2254308sP(enumC1642540sqSArr);
    }

    public static EnumC1642540sqS[] values() {
        return (EnumC1642540sqS[]) LL.clone();
    }

    public static EnumC1642540sqS valueOf(String str) {
        return (EnumC1642540sqS) C08FF.LIZ(EnumC1642540sqS.class, str);
    }

    public EnumC1642540sqS(String str, int i) {
    }
}
