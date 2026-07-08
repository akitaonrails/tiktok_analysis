package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439580HLo {
    public static final EnumC439580HLo ALLOWED;
    public static final EnumC439580HLo IN_APP_DENIED;
    public static final /* synthetic */ EnumC439580HLo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC439580HLo SYSTEM_DENIED;
    public static final EnumC439580HLo UNKNOWN;

    public static InterfaceC2044707zh<EnumC439580HLo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC439580HLo enumC439580HLo = new EnumC439580HLo("UNKNOWN", 0);
        UNKNOWN = enumC439580HLo;
        EnumC439580HLo enumC439580HLo2 = new EnumC439580HLo("SYSTEM_DENIED", 1);
        SYSTEM_DENIED = enumC439580HLo2;
        EnumC439580HLo enumC439580HLo3 = new EnumC439580HLo("IN_APP_DENIED", 2);
        IN_APP_DENIED = enumC439580HLo3;
        EnumC439580HLo enumC439580HLo4 = new EnumC439580HLo("ALLOWED", 3);
        ALLOWED = enumC439580HLo4;
        EnumC439580HLo[] enumC439580HLoArr = {enumC439580HLo, enumC439580HLo2, enumC439580HLo3, enumC439580HLo4};
        LL = enumC439580HLoArr;
        LLILLJJLI = new C2254308sP(enumC439580HLoArr);
    }

    public static EnumC439580HLo[] values() {
        return (EnumC439580HLo[]) LL.clone();
    }

    public static EnumC439580HLo valueOf(String str) {
        return (EnumC439580HLo) C08FF.LIZ(EnumC439580HLo.class, str);
    }

    public EnumC439580HLo(String str, int i) {
    }
}
