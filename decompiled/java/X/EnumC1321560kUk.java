package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kUk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1321560kUk {
    public static final EnumC1321560kUk ANIMATING;
    public static final EnumC1321560kUk CANCELLED;
    public static final EnumC1321560kUk COMPLETED;
    public static final EnumC1321560kUk IDLE;
    public static final /* synthetic */ EnumC1321560kUk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1321560kUk PAUSED;
    public static final EnumC1321560kUk PREPARING;

    public static InterfaceC2044707zh<EnumC1321560kUk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1321560kUk enumC1321560kUk = new EnumC1321560kUk("IDLE", 0);
        IDLE = enumC1321560kUk;
        EnumC1321560kUk enumC1321560kUk2 = new EnumC1321560kUk("PREPARING", 1);
        PREPARING = enumC1321560kUk2;
        EnumC1321560kUk enumC1321560kUk3 = new EnumC1321560kUk("ANIMATING", 2);
        ANIMATING = enumC1321560kUk3;
        EnumC1321560kUk enumC1321560kUk4 = new EnumC1321560kUk("PAUSED", 3);
        PAUSED = enumC1321560kUk4;
        EnumC1321560kUk enumC1321560kUk5 = new EnumC1321560kUk("COMPLETED", 4);
        COMPLETED = enumC1321560kUk5;
        EnumC1321560kUk enumC1321560kUk6 = new EnumC1321560kUk("CANCELLED", 5);
        CANCELLED = enumC1321560kUk6;
        EnumC1321560kUk[] enumC1321560kUkArr = {enumC1321560kUk, enumC1321560kUk2, enumC1321560kUk3, enumC1321560kUk4, enumC1321560kUk5, enumC1321560kUk6};
        LL = enumC1321560kUkArr;
        LLILLJJLI = new C2254308sP(enumC1321560kUkArr);
    }

    public static EnumC1321560kUk[] values() {
        return (EnumC1321560kUk[]) LL.clone();
    }

    public static EnumC1321560kUk valueOf(String str) {
        return (EnumC1321560kUk) C08FF.LIZ(EnumC1321560kUk.class, str);
    }

    public EnumC1321560kUk(String str, int i) {
    }
}
