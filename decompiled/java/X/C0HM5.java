package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HM5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HM5 {
    public static final C0HM5 FLASH_AUTO;
    public static final C0HM5 FLASH_OFF;
    public static final C0HM5 FLASH_ON;
    public static final /* synthetic */ C0HM5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0HM5> getEntries() {
        return LLILLL;
    }

    static {
        C0HM5 c0hm5 = new C0HM5("FLASH_OFF", 0, 0);
        FLASH_OFF = c0hm5;
        C0HM5 c0hm52 = new C0HM5("FLASH_ON", 1, 1);
        FLASH_ON = c0hm52;
        C0HM5 c0hm53 = new C0HM5("FLASH_AUTO", 2, 2);
        FLASH_AUTO = c0hm53;
        C0HM5[] c0hm5Arr = {c0hm5, c0hm52, c0hm53};
        LLILLJJLI = c0hm5Arr;
        LLILLL = new C2254308sP(c0hm5Arr);
    }

    public static C0HM5[] values() {
        return (C0HM5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0HM5 valueOf(String str) {
        return (C0HM5) C08FF.LIZ(C0HM5.class, str);
    }

    public C0HM5(String str, int i, int i2) {
        this.LL = i2;
    }
}
