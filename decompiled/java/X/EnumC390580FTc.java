package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC390580FTc {
    public static final EnumC390580FTc EMPHASIZED;
    public static final EnumC390580FTc IGNORED;
    public static final /* synthetic */ EnumC390580FTc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC390580FTc NORMAL;

    public static InterfaceC2044707zh<EnumC390580FTc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC390580FTc enumC390580FTc = new EnumC390580FTc("EMPHASIZED", 0);
        EMPHASIZED = enumC390580FTc;
        EnumC390580FTc enumC390580FTc2 = new EnumC390580FTc("NORMAL", 1);
        NORMAL = enumC390580FTc2;
        EnumC390580FTc enumC390580FTc3 = new EnumC390580FTc("IGNORED", 2);
        IGNORED = enumC390580FTc3;
        EnumC390580FTc[] enumC390580FTcArr = {enumC390580FTc, enumC390580FTc2, enumC390580FTc3};
        LL = enumC390580FTcArr;
        LLILLJJLI = new C2254308sP(enumC390580FTcArr);
    }

    public static EnumC390580FTc[] values() {
        return (EnumC390580FTc[]) LL.clone();
    }

    public static EnumC390580FTc valueOf(String str) {
        return (EnumC390580FTc) C08FF.LIZ(EnumC390580FTc.class, str);
    }

    public EnumC390580FTc(String str, int i) {
    }
}
