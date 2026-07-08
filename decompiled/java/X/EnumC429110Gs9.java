package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429110Gs9 {
    public static final EnumC429110Gs9 HISTORY;
    public static final /* synthetic */ EnumC429110Gs9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC429110Gs9 THIS_WEEK;
    public static final EnumC429110Gs9 TODAY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC429110Gs9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429110Gs9 enumC429110Gs9 = new EnumC429110Gs9("TODAY", 0, 1);
        TODAY = enumC429110Gs9;
        EnumC429110Gs9 enumC429110Gs92 = new EnumC429110Gs9("THIS_WEEK", 1, 2);
        THIS_WEEK = enumC429110Gs92;
        EnumC429110Gs9 enumC429110Gs93 = new EnumC429110Gs9("HISTORY", 2, 3);
        HISTORY = enumC429110Gs93;
        EnumC429110Gs9[] enumC429110Gs9Arr = {enumC429110Gs9, enumC429110Gs92, enumC429110Gs93};
        LLILLJJLI = enumC429110Gs9Arr;
        LLILLL = new C2254308sP(enumC429110Gs9Arr);
    }

    public static EnumC429110Gs9[] values() {
        return (EnumC429110Gs9[]) LLILLJJLI.clone();
    }

    public final int getGroupType() {
        return this.LL;
    }

    public static EnumC429110Gs9 valueOf(String str) {
        return (EnumC429110Gs9) C08FF.LIZ(EnumC429110Gs9.class, str);
    }

    public EnumC429110Gs9(String str, int i, int i2) {
        this.LL = i2;
    }
}
