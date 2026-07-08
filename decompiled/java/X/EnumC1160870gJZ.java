package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gJZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1160870gJZ {
    public static final EnumC1160870gJZ EMPTY;
    public static final EnumC1160870gJZ ERROR;
    public static final /* synthetic */ EnumC1160870gJZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1160870gJZ SUCCESS;
    public int LL;

    public static InterfaceC2044707zh<EnumC1160870gJZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1160870gJZ enumC1160870gJZ = new EnumC1160870gJZ("SUCCESS", 0, 0);
        SUCCESS = enumC1160870gJZ;
        EnumC1160870gJZ enumC1160870gJZ2 = new EnumC1160870gJZ("EMPTY", 1, 1);
        EMPTY = enumC1160870gJZ2;
        EnumC1160870gJZ enumC1160870gJZ3 = new EnumC1160870gJZ("ERROR", 2, 2);
        ERROR = enumC1160870gJZ3;
        EnumC1160870gJZ[] enumC1160870gJZArr = {enumC1160870gJZ, enumC1160870gJZ2, enumC1160870gJZ3};
        LLILLJJLI = enumC1160870gJZArr;
        LLILLL = new C2254308sP(enumC1160870gJZArr);
    }

    public static EnumC1160870gJZ[] values() {
        return (EnumC1160870gJZ[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1160870gJZ valueOf(String str) {
        return (EnumC1160870gJZ) C08FF.LIZ(EnumC1160870gJZ.class, str);
    }

    public final void setStatus(int i) {
        this.LL = i;
    }

    public EnumC1160870gJZ(String str, int i, int i2) {
        this.LL = i2;
    }
}
