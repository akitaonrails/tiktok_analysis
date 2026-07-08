package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2012307uT {
    public static final EnumC2012307uT BUTTON;
    public static final EnumC2012307uT CARD;
    public static final /* synthetic */ EnumC2012307uT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2012307uT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2012307uT enumC2012307uT = new EnumC2012307uT("CARD", 0);
        CARD = enumC2012307uT;
        EnumC2012307uT enumC2012307uT2 = new EnumC2012307uT("BUTTON", 1);
        BUTTON = enumC2012307uT2;
        EnumC2012307uT[] enumC2012307uTArr = {enumC2012307uT, enumC2012307uT2};
        LL = enumC2012307uTArr;
        LLILLJJLI = new C2254308sP(enumC2012307uTArr);
    }

    public static EnumC2012307uT[] values() {
        return (EnumC2012307uT[]) LL.clone();
    }

    public static EnumC2012307uT valueOf(String str) {
        return (EnumC2012307uT) C08FF.LIZ(EnumC2012307uT.class, str);
    }

    public EnumC2012307uT(String str, int i) {
    }
}
