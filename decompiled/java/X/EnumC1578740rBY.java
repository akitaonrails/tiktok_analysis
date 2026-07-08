package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rBY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1578740rBY {
    public static final EnumC1578740rBY COLLAPSED;
    public static final EnumC1578740rBY DRAGGING;
    public static final EnumC1578740rBY EXPANDED;
    public static final /* synthetic */ EnumC1578740rBY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1578740rBY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1578740rBY enumC1578740rBY = new EnumC1578740rBY("EXPANDED", 0);
        EXPANDED = enumC1578740rBY;
        EnumC1578740rBY enumC1578740rBY2 = new EnumC1578740rBY("COLLAPSED", 1);
        COLLAPSED = enumC1578740rBY2;
        EnumC1578740rBY enumC1578740rBY3 = new EnumC1578740rBY("DRAGGING", 2);
        DRAGGING = enumC1578740rBY3;
        EnumC1578740rBY[] enumC1578740rBYArr = {enumC1578740rBY, enumC1578740rBY2, enumC1578740rBY3};
        LL = enumC1578740rBYArr;
        LLILLJJLI = new C2254308sP(enumC1578740rBYArr);
    }

    public static EnumC1578740rBY[] values() {
        return (EnumC1578740rBY[]) LL.clone();
    }

    public static EnumC1578740rBY valueOf(String str) {
        return (EnumC1578740rBY) C08FF.LIZ(EnumC1578740rBY.class, str);
    }

    public EnumC1578740rBY(String str, int i) {
    }
}
