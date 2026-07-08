package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15oG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20631415oG {
    public static final EnumC20631415oG FRAGMENT;
    public static final /* synthetic */ EnumC20631415oG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20631415oG UNSET;
    public static final EnumC20631415oG VIEW;

    public static InterfaceC2044707zh<EnumC20631415oG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20631415oG enumC20631415oG = new EnumC20631415oG("FRAGMENT", 0);
        FRAGMENT = enumC20631415oG;
        EnumC20631415oG enumC20631415oG2 = new EnumC20631415oG("VIEW", 1);
        VIEW = enumC20631415oG2;
        EnumC20631415oG enumC20631415oG3 = new EnumC20631415oG("UNSET", 2);
        UNSET = enumC20631415oG3;
        EnumC20631415oG[] enumC20631415oGArr = {enumC20631415oG, enumC20631415oG2, enumC20631415oG3};
        LL = enumC20631415oGArr;
        LLILLJJLI = new C2254308sP(enumC20631415oGArr);
    }

    public static EnumC20631415oG[] values() {
        return (EnumC20631415oG[]) LL.clone();
    }

    public static EnumC20631415oG valueOf(String str) {
        return (EnumC20631415oG) C08FF.LIZ(EnumC20631415oG.class, str);
    }

    public EnumC20631415oG(String str, int i) {
    }
}
