package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585200MxK {
    public static final EnumC585200MxK DOWN;
    public static final EnumC585200MxK IDLE;
    public static final /* synthetic */ EnumC585200MxK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585200MxK UP;

    public static InterfaceC2044707zh<EnumC585200MxK> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585200MxK enumC585200MxK = new EnumC585200MxK("IDLE", 0);
        IDLE = enumC585200MxK;
        EnumC585200MxK enumC585200MxK2 = new EnumC585200MxK("UP", 1);
        UP = enumC585200MxK2;
        EnumC585200MxK enumC585200MxK3 = new EnumC585200MxK("DOWN", 2);
        DOWN = enumC585200MxK3;
        EnumC585200MxK[] enumC585200MxKArr = {enumC585200MxK, enumC585200MxK2, enumC585200MxK3};
        LL = enumC585200MxKArr;
        LLILLJJLI = new C2254308sP(enumC585200MxKArr);
    }

    public static EnumC585200MxK[] values() {
        return (EnumC585200MxK[]) LL.clone();
    }

    public static EnumC585200MxK valueOf(String str) {
        return (EnumC585200MxK) C08FF.LIZ(EnumC585200MxK.class, str);
    }

    public EnumC585200MxK(String str, int i) {
    }
}
