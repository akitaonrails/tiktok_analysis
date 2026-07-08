package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC557320LtS {
    public static final EnumC557320LtS CANCEL;
    public static final /* synthetic */ EnumC557320LtS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC557320LtS OPEN_SETTINGS;

    public static InterfaceC2044707zh<EnumC557320LtS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC557320LtS enumC557320LtS = new EnumC557320LtS("OPEN_SETTINGS", 0);
        OPEN_SETTINGS = enumC557320LtS;
        EnumC557320LtS enumC557320LtS2 = new EnumC557320LtS("CANCEL", 1);
        CANCEL = enumC557320LtS2;
        EnumC557320LtS[] enumC557320LtSArr = {enumC557320LtS, enumC557320LtS2};
        LL = enumC557320LtSArr;
        LLILLJJLI = new C2254308sP(enumC557320LtSArr);
    }

    public static EnumC557320LtS[] values() {
        return (EnumC557320LtS[]) LL.clone();
    }

    public static EnumC557320LtS valueOf(String str) {
        return (EnumC557320LtS) C08FF.LIZ(EnumC557320LtS.class, str);
    }

    public EnumC557320LtS(String str, int i) {
    }
}
