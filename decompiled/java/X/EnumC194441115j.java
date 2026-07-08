package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.115j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC194441115j {
    public static final EnumC194441115j HOLD;
    public static final /* synthetic */ EnumC194441115j[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC194441115j LOCKED;
    public static final EnumC194441115j TAP;

    public static InterfaceC2044707zh<EnumC194441115j> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC194441115j enumC194441115j = new EnumC194441115j("TAP", 0);
        TAP = enumC194441115j;
        EnumC194441115j enumC194441115j2 = new EnumC194441115j("HOLD", 1);
        HOLD = enumC194441115j2;
        EnumC194441115j enumC194441115j3 = new EnumC194441115j("LOCKED", 2);
        LOCKED = enumC194441115j3;
        EnumC194441115j[] enumC194441115jArr = {enumC194441115j, enumC194441115j2, enumC194441115j3};
        LL = enumC194441115jArr;
        LLILLJJLI = new C2254308sP(enumC194441115jArr);
    }

    public static EnumC194441115j[] values() {
        return (EnumC194441115j[]) LL.clone();
    }

    public static EnumC194441115j valueOf(String str) {
        return (EnumC194441115j) C08FF.LIZ(EnumC194441115j.class, str);
    }

    public EnumC194441115j(String str, int i) {
    }
}
