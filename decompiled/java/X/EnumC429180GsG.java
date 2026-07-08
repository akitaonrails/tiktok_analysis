package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429180GsG {
    public static final /* synthetic */ EnumC429180GsG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC429180GsG TASK_DURATION_INVALID;
    public static final EnumC429180GsG TASK_EMPTY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC429180GsG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429180GsG enumC429180GsG = new EnumC429180GsG("TASK_EMPTY", 0, 1);
        TASK_EMPTY = enumC429180GsG;
        EnumC429180GsG enumC429180GsG2 = new EnumC429180GsG("TASK_DURATION_INVALID", 1, 2);
        TASK_DURATION_INVALID = enumC429180GsG2;
        EnumC429180GsG[] enumC429180GsGArr = {enumC429180GsG, enumC429180GsG2};
        LLILLJJLI = enumC429180GsGArr;
        LLILLL = new C2254308sP(enumC429180GsGArr);
    }

    public static EnumC429180GsG[] values() {
        return (EnumC429180GsG[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC429180GsG valueOf(String str) {
        return (EnumC429180GsG) C08FF.LIZ(EnumC429180GsG.class, str);
    }

    public EnumC429180GsG(String str, int i, int i2) {
        this.LL = i2;
    }
}
