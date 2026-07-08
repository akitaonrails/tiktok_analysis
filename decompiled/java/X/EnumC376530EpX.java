package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EpX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC376530EpX {
    public static final EnumC376530EpX AIMATTING_TOAST;
    public static final EnumC376530EpX DIRECT;
    public static final /* synthetic */ EnumC376530EpX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC376530EpX MAX_LIMIT_TOAST;
    public static final EnumC376530EpX MIN_LIMIT_TOAST;

    public static InterfaceC2044707zh<EnumC376530EpX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC376530EpX enumC376530EpX = new EnumC376530EpX("DIRECT", 0);
        DIRECT = enumC376530EpX;
        EnumC376530EpX enumC376530EpX2 = new EnumC376530EpX("MAX_LIMIT_TOAST", 1);
        MAX_LIMIT_TOAST = enumC376530EpX2;
        EnumC376530EpX enumC376530EpX3 = new EnumC376530EpX("MIN_LIMIT_TOAST", 2);
        MIN_LIMIT_TOAST = enumC376530EpX3;
        EnumC376530EpX enumC376530EpX4 = new EnumC376530EpX("AIMATTING_TOAST", 3);
        AIMATTING_TOAST = enumC376530EpX4;
        EnumC376530EpX[] enumC376530EpXArr = {enumC376530EpX, enumC376530EpX2, enumC376530EpX3, enumC376530EpX4};
        LL = enumC376530EpXArr;
        LLILLJJLI = new C2254308sP(enumC376530EpXArr);
    }

    public static EnumC376530EpX[] values() {
        return (EnumC376530EpX[]) LL.clone();
    }

    public static EnumC376530EpX valueOf(String str) {
        return (EnumC376530EpX) C08FF.LIZ(EnumC376530EpX.class, str);
    }

    public EnumC376530EpX(String str, int i) {
    }
}
