package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07r1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990907r1 {
    public static final /* synthetic */ EnumC1990907r1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1990907r1 ZOOM_MAX;
    public static final EnumC1990907r1 ZOOM_MIN;

    public static InterfaceC2044707zh<EnumC1990907r1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1990907r1 enumC1990907r1 = new EnumC1990907r1("ZOOM_MAX", 0);
        ZOOM_MAX = enumC1990907r1;
        EnumC1990907r1 enumC1990907r12 = new EnumC1990907r1("ZOOM_MIN", 1);
        ZOOM_MIN = enumC1990907r12;
        EnumC1990907r1[] enumC1990907r1Arr = {enumC1990907r1, enumC1990907r12};
        LL = enumC1990907r1Arr;
        LLILLJJLI = new C2254308sP(enumC1990907r1Arr);
    }

    public static EnumC1990907r1[] values() {
        return (EnumC1990907r1[]) LL.clone();
    }

    public static EnumC1990907r1 valueOf(String str) {
        return (EnumC1990907r1) C08FF.LIZ(EnumC1990907r1.class, str);
    }

    public EnumC1990907r1(String str, int i) {
    }
}
