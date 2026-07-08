package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992850bwZ {
    public static final EnumC992850bwZ AD_DISPLAY_COUNT_REACHED;
    public static final EnumC992850bwZ AD_DISPLAY_TOO_FAST;
    public static final /* synthetic */ EnumC992850bwZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC992850bwZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992850bwZ enumC992850bwZ = new EnumC992850bwZ("AD_DISPLAY_TOO_FAST", 0);
        AD_DISPLAY_TOO_FAST = enumC992850bwZ;
        EnumC992850bwZ enumC992850bwZ2 = new EnumC992850bwZ("AD_DISPLAY_COUNT_REACHED", 1);
        AD_DISPLAY_COUNT_REACHED = enumC992850bwZ2;
        EnumC992850bwZ[] enumC992850bwZArr = {enumC992850bwZ, enumC992850bwZ2};
        LL = enumC992850bwZArr;
        LLILLJJLI = new C2254308sP(enumC992850bwZArr);
    }

    public static EnumC992850bwZ[] values() {
        return (EnumC992850bwZ[]) LL.clone();
    }

    public static EnumC992850bwZ valueOf(String str) {
        return (EnumC992850bwZ) C08FF.LIZ(EnumC992850bwZ.class, str);
    }

    public EnumC992850bwZ(String str, int i) {
    }
}
