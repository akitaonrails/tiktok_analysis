package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09ph, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2492309ph {
    public static final EnumC2492309ph AUTO;
    public static final /* synthetic */ EnumC2492309ph[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2492309ph MANUAL;

    public static InterfaceC2044707zh<EnumC2492309ph> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2492309ph enumC2492309ph = new EnumC2492309ph("AUTO", 0);
        AUTO = enumC2492309ph;
        EnumC2492309ph enumC2492309ph2 = new EnumC2492309ph("MANUAL", 1);
        MANUAL = enumC2492309ph2;
        EnumC2492309ph[] enumC2492309phArr = {enumC2492309ph, enumC2492309ph2};
        LL = enumC2492309phArr;
        LLILLJJLI = new C2254308sP(enumC2492309phArr);
    }

    public static EnumC2492309ph[] values() {
        return (EnumC2492309ph[]) LL.clone();
    }

    public static EnumC2492309ph valueOf(String str) {
        return (EnumC2492309ph) C08FF.LIZ(EnumC2492309ph.class, str);
    }

    public EnumC2492309ph(String str, int i) {
    }
}
