package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC19989213Ja {
    public static final EnumC19989213Ja IN;
    public static final EnumC19989213Ja INVARIANT;
    public static final /* synthetic */ EnumC19989213Ja[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19989213Ja OUT;

    public static InterfaceC2044707zh<EnumC19989213Ja> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19989213Ja enumC19989213Ja = new EnumC19989213Ja("INVARIANT", 0);
        INVARIANT = enumC19989213Ja;
        EnumC19989213Ja enumC19989213Ja2 = new EnumC19989213Ja("IN", 1);
        IN = enumC19989213Ja2;
        EnumC19989213Ja enumC19989213Ja3 = new EnumC19989213Ja("OUT", 2);
        OUT = enumC19989213Ja3;
        EnumC19989213Ja[] enumC19989213JaArr = {enumC19989213Ja, enumC19989213Ja2, enumC19989213Ja3};
        LL = enumC19989213JaArr;
        LLILLJJLI = new C2254308sP(enumC19989213JaArr);
    }

    public static EnumC19989213Ja[] values() {
        return (EnumC19989213Ja[]) LL.clone();
    }

    public static EnumC19989213Ja valueOf(String str) {
        return (EnumC19989213Ja) C08FF.LIZ(EnumC19989213Ja.class, str);
    }

    public EnumC19989213Ja(String str, int i) {
    }
}
