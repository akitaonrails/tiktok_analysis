package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2006407tW {
    public static final EnumC2006407tW CANCEL_BUTTON;
    public static final /* synthetic */ EnumC2006407tW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2006407tW SELECT_NEW;
    public static final EnumC2006407tW TRASH_BOX;

    public static InterfaceC2044707zh<EnumC2006407tW> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2006407tW enumC2006407tW = new EnumC2006407tW("TRASH_BOX", 0);
        TRASH_BOX = enumC2006407tW;
        EnumC2006407tW enumC2006407tW2 = new EnumC2006407tW("CANCEL_BUTTON", 1);
        CANCEL_BUTTON = enumC2006407tW2;
        EnumC2006407tW enumC2006407tW3 = new EnumC2006407tW("SELECT_NEW", 2);
        SELECT_NEW = enumC2006407tW3;
        EnumC2006407tW[] enumC2006407tWArr = {enumC2006407tW, enumC2006407tW2, enumC2006407tW3};
        LL = enumC2006407tWArr;
        LLILLJJLI = new C2254308sP(enumC2006407tWArr);
    }

    public static EnumC2006407tW[] values() {
        return (EnumC2006407tW[]) LL.clone();
    }

    public static EnumC2006407tW valueOf(String str) {
        return (EnumC2006407tW) C08FF.LIZ(EnumC2006407tW.class, str);
    }

    public EnumC2006407tW(String str, int i) {
    }
}
