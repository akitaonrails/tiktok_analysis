package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC584580MwK {
    public static final EnumC584580MwK FAST;
    public static final /* synthetic */ EnumC584580MwK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC584580MwK SLOW;
    public static final EnumC584580MwK UNKNOWN;

    public static InterfaceC2044707zh<EnumC584580MwK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC584580MwK enumC584580MwK = new EnumC584580MwK("FAST", 0);
        FAST = enumC584580MwK;
        EnumC584580MwK enumC584580MwK2 = new EnumC584580MwK("SLOW", 1);
        SLOW = enumC584580MwK2;
        EnumC584580MwK enumC584580MwK3 = new EnumC584580MwK("UNKNOWN", 2);
        UNKNOWN = enumC584580MwK3;
        EnumC584580MwK[] enumC584580MwKArr = {enumC584580MwK, enumC584580MwK2, enumC584580MwK3};
        LL = enumC584580MwKArr;
        LLILLJJLI = new C2254308sP(enumC584580MwKArr);
    }

    public static EnumC584580MwK[] values() {
        return (EnumC584580MwK[]) LL.clone();
    }

    public static EnumC584580MwK valueOf(String str) {
        return (EnumC584580MwK) C08FF.LIZ(EnumC584580MwK.class, str);
    }

    public EnumC584580MwK(String str, int i) {
    }
}
