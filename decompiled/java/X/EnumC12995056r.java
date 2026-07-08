package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.056r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12995056r {
    public static final EnumC12995056r CLICK;
    public static final C12994056q Companion;
    public static final EnumC12995056r DISMISS;
    public static final /* synthetic */ EnumC12995056r[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC12995056r SHOW;
    public final String LL;
    public final int LLILLJJLI;

    public static final EnumC12995056r fromWire(Integer num) {
        Companion.getClass();
        return C12994056q.LIZ(num);
    }

    public static InterfaceC2044707zh<EnumC12995056r> getEntries() {
        return LLILZ;
    }

    static {
        EnumC12995056r enumC12995056r = new EnumC12995056r("SHOW", 0, "Show", 1);
        SHOW = enumC12995056r;
        EnumC12995056r enumC12995056r2 = new EnumC12995056r("CLICK", 1, "Click", 2);
        CLICK = enumC12995056r2;
        EnumC12995056r enumC12995056r3 = new EnumC12995056r("DISMISS", 2, "Dismiss", 3);
        DISMISS = enumC12995056r3;
        EnumC12995056r[] enumC12995056rArr = {enumC12995056r, enumC12995056r2, enumC12995056r3};
        LLILLL = enumC12995056rArr;
        LLILZ = new C2254308sP(enumC12995056rArr);
        Companion = new C12994056q();
    }

    public static EnumC12995056r[] values() {
        return (EnumC12995056r[]) LLILLL.clone();
    }

    public final String getWireTrigger() {
        return this.LL;
    }

    public final int getWireValue() {
        return this.LLILLJJLI;
    }

    public static EnumC12995056r valueOf(String str) {
        return (EnumC12995056r) C08FF.LIZ(EnumC12995056r.class, str);
    }

    public EnumC12995056r(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
