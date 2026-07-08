package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08Wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2131008Wm {
    public static final EnumC2131008Wm CANCEL;
    public static final EnumC2131008Wm DELAYING;
    public static final EnumC2131008Wm ENQUEUE;
    public static final EnumC2131008Wm FAIL;
    public static final EnumC2131008Wm INIT;
    public static final /* synthetic */ EnumC2131008Wm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2131008Wm SATISFY;
    public static final EnumC2131008Wm SATISFY_TIMEOUT;
    public static final EnumC2131008Wm SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2131008Wm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2131008Wm enumC2131008Wm = new EnumC2131008Wm("INIT", 0, 0);
        INIT = enumC2131008Wm;
        EnumC2131008Wm enumC2131008Wm2 = new EnumC2131008Wm("SATISFY", 1, 1);
        SATISFY = enumC2131008Wm2;
        EnumC2131008Wm enumC2131008Wm3 = new EnumC2131008Wm("DELAYING", 2, 2);
        DELAYING = enumC2131008Wm3;
        EnumC2131008Wm enumC2131008Wm4 = new EnumC2131008Wm("ENQUEUE", 3, 4);
        ENQUEUE = enumC2131008Wm4;
        EnumC2131008Wm enumC2131008Wm5 = new EnumC2131008Wm("SUCCESS", 4, 5);
        SUCCESS = enumC2131008Wm5;
        EnumC2131008Wm enumC2131008Wm6 = new EnumC2131008Wm("FAIL", 5, 6);
        FAIL = enumC2131008Wm6;
        EnumC2131008Wm enumC2131008Wm7 = new EnumC2131008Wm("CANCEL", 6, 7);
        CANCEL = enumC2131008Wm7;
        EnumC2131008Wm enumC2131008Wm8 = new EnumC2131008Wm("SATISFY_TIMEOUT", 7, 8);
        SATISFY_TIMEOUT = enumC2131008Wm8;
        EnumC2131008Wm[] enumC2131008WmArr = {enumC2131008Wm, enumC2131008Wm2, enumC2131008Wm3, enumC2131008Wm4, enumC2131008Wm5, enumC2131008Wm6, enumC2131008Wm7, enumC2131008Wm8};
        LLILLJJLI = enumC2131008WmArr;
        LLILLL = new C2254308sP(enumC2131008WmArr);
    }

    public static EnumC2131008Wm[] values() {
        return (EnumC2131008Wm[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2131008Wm valueOf(String str) {
        return (EnumC2131008Wm) C08FF.LIZ(EnumC2131008Wm.class, str);
    }

    public EnumC2131008Wm(String str, int i, int i2) {
        this.LL = i2;
    }
}
