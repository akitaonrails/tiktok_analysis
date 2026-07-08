package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00wQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC240800wQ {
    public static final EnumC240800wQ CLICK;
    public static final /* synthetic */ EnumC240800wQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC240800wQ SWIPE;

    public static InterfaceC2044707zh<EnumC240800wQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC240800wQ enumC240800wQ = new EnumC240800wQ("CLICK", 0);
        CLICK = enumC240800wQ;
        EnumC240800wQ enumC240800wQ2 = new EnumC240800wQ("SWIPE", 1);
        SWIPE = enumC240800wQ2;
        EnumC240800wQ[] enumC240800wQArr = {enumC240800wQ, enumC240800wQ2};
        LL = enumC240800wQArr;
        LLILLJJLI = new C2254308sP(enumC240800wQArr);
    }

    public static EnumC240800wQ[] values() {
        return (EnumC240800wQ[]) LL.clone();
    }

    public static EnumC240800wQ valueOf(String str) {
        return (EnumC240800wQ) C08FF.LIZ(EnumC240800wQ.class, str);
    }

    public EnumC240800wQ(String str, int i) {
    }
}
