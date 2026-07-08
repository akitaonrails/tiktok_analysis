package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1360305Ub {
    public static final EnumC1360305Ub DRAGGING;
    public static final EnumC1360305Ub IDLE;
    public static final /* synthetic */ EnumC1360305Ub[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1360305Ub SCALING;

    public static InterfaceC2044707zh<EnumC1360305Ub> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1360305Ub enumC1360305Ub = new EnumC1360305Ub("IDLE", 0);
        IDLE = enumC1360305Ub;
        EnumC1360305Ub enumC1360305Ub2 = new EnumC1360305Ub("SCALING", 1);
        SCALING = enumC1360305Ub2;
        EnumC1360305Ub enumC1360305Ub3 = new EnumC1360305Ub("DRAGGING", 2);
        DRAGGING = enumC1360305Ub3;
        EnumC1360305Ub[] enumC1360305UbArr = {enumC1360305Ub, enumC1360305Ub2, enumC1360305Ub3};
        LL = enumC1360305UbArr;
        LLILLJJLI = new C2254308sP(enumC1360305UbArr);
    }

    public static EnumC1360305Ub[] values() {
        return (EnumC1360305Ub[]) LL.clone();
    }

    public static EnumC1360305Ub valueOf(String str) {
        return (EnumC1360305Ub) C08FF.LIZ(EnumC1360305Ub.class, str);
    }

    public EnumC1360305Ub(String str, int i) {
    }
}
