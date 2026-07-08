package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ElE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC373860ElE {
    public static final EnumC373860ElE ERASER;
    public static final /* synthetic */ EnumC373860ElE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC373860ElE NORMAL_BRUSH;
    public static final EnumC373860ElE NULL;
    public static final EnumC373860ElE QUICK_BRUSH;

    public static InterfaceC2044707zh<EnumC373860ElE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC373860ElE enumC373860ElE = new EnumC373860ElE("NULL", 0);
        NULL = enumC373860ElE;
        EnumC373860ElE enumC373860ElE2 = new EnumC373860ElE("QUICK_BRUSH", 1);
        QUICK_BRUSH = enumC373860ElE2;
        EnumC373860ElE enumC373860ElE3 = new EnumC373860ElE("NORMAL_BRUSH", 2);
        NORMAL_BRUSH = enumC373860ElE3;
        EnumC373860ElE enumC373860ElE4 = new EnumC373860ElE("ERASER", 3);
        ERASER = enumC373860ElE4;
        EnumC373860ElE[] enumC373860ElEArr = {enumC373860ElE, enumC373860ElE2, enumC373860ElE3, enumC373860ElE4};
        LL = enumC373860ElEArr;
        LLILLJJLI = new C2254308sP(enumC373860ElEArr);
    }

    public static EnumC373860ElE[] values() {
        return (EnumC373860ElE[]) LL.clone();
    }

    public static EnumC373860ElE valueOf(String str) {
        return (EnumC373860ElE) C08FF.LIZ(EnumC373860ElE.class, str);
    }

    public EnumC373860ElE(String str, int i) {
    }
}
