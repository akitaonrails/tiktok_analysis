package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0omg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486440omg {
    public static final EnumC1486440omg BOTTOMSHEET;
    public static final EnumC1486440omg FULLSCREEN;
    public static final /* synthetic */ EnumC1486440omg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1486440omg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1486440omg enumC1486440omg = new EnumC1486440omg("BOTTOMSHEET", 0);
        BOTTOMSHEET = enumC1486440omg;
        EnumC1486440omg enumC1486440omg2 = new EnumC1486440omg("FULLSCREEN", 1);
        FULLSCREEN = enumC1486440omg2;
        EnumC1486440omg[] enumC1486440omgArr = {enumC1486440omg, enumC1486440omg2};
        LL = enumC1486440omgArr;
        LLILLJJLI = new C2254308sP(enumC1486440omgArr);
    }

    public static EnumC1486440omg[] values() {
        return (EnumC1486440omg[]) LL.clone();
    }

    public static EnumC1486440omg valueOf(String str) {
        return (EnumC1486440omg) C08FF.LIZ(EnumC1486440omg.class, str);
    }

    public EnumC1486440omg(String str, int i) {
    }
}
