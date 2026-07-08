package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994780bzg {
    public static final /* synthetic */ EnumC994780bzg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994780bzg NORMAL;
    public static final EnumC994780bzg PREREAD;

    public static InterfaceC2044707zh<EnumC994780bzg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994780bzg enumC994780bzg = new EnumC994780bzg("PREREAD", 0);
        PREREAD = enumC994780bzg;
        EnumC994780bzg enumC994780bzg2 = new EnumC994780bzg("NORMAL", 1);
        NORMAL = enumC994780bzg2;
        EnumC994780bzg[] enumC994780bzgArr = {enumC994780bzg, enumC994780bzg2};
        LL = enumC994780bzgArr;
        LLILLJJLI = new C2254308sP(enumC994780bzgArr);
    }

    public static EnumC994780bzg[] values() {
        return (EnumC994780bzg[]) LL.clone();
    }

    public static EnumC994780bzg valueOf(String str) {
        return (EnumC994780bzg) C08FF.LIZ(EnumC994780bzg.class, str);
    }

    public EnumC994780bzg(String str, int i) {
    }
}
