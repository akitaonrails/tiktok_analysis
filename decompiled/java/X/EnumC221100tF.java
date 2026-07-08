package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC221100tF {
    public static final EnumC221100tF CACHE;
    public static final /* synthetic */ EnumC221100tF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC221100tF ONLINE;

    public static InterfaceC2044707zh<EnumC221100tF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC221100tF enumC221100tF = new EnumC221100tF("CACHE", 0);
        CACHE = enumC221100tF;
        EnumC221100tF enumC221100tF2 = new EnumC221100tF("ONLINE", 1);
        ONLINE = enumC221100tF2;
        EnumC221100tF[] enumC221100tFArr = {enumC221100tF, enumC221100tF2};
        LL = enumC221100tFArr;
        LLILLJJLI = new C2254308sP(enumC221100tFArr);
    }

    public static EnumC221100tF[] values() {
        return (EnumC221100tF[]) LL.clone();
    }

    public static EnumC221100tF valueOf(String str) {
        return (EnumC221100tF) C08FF.LIZ(EnumC221100tF.class, str);
    }

    public EnumC221100tF(String str, int i) {
    }
}
