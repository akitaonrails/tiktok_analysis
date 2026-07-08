package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IhF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC473310IhF {
    public static final EnumC473310IhF INIT;
    public static final /* synthetic */ EnumC473310IhF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC473310IhF RESUME;

    public static InterfaceC2044707zh<EnumC473310IhF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC473310IhF enumC473310IhF = new EnumC473310IhF("INIT", 0);
        INIT = enumC473310IhF;
        EnumC473310IhF enumC473310IhF2 = new EnumC473310IhF("RESUME", 1);
        RESUME = enumC473310IhF2;
        EnumC473310IhF[] enumC473310IhFArr = {enumC473310IhF, enumC473310IhF2};
        LL = enumC473310IhFArr;
        LLILLJJLI = new C2254308sP(enumC473310IhFArr);
    }

    public static EnumC473310IhF[] values() {
        return (EnumC473310IhF[]) LL.clone();
    }

    public static EnumC473310IhF valueOf(String str) {
        return (EnumC473310IhF) C08FF.LIZ(EnumC473310IhF.class, str);
    }

    public EnumC473310IhF(String str, int i) {
    }
}
