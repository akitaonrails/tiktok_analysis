package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC467700IVs {
    public static final EnumC467700IVs CROSS_ROOM_ARCH;
    public static final /* synthetic */ EnumC467700IVs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC467700IVs MULTI_ARCH;
    public static final EnumC467700IVs OLD_ARCH;
    public static final EnumC467700IVs UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC467700IVs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC467700IVs enumC467700IVs = new EnumC467700IVs("UNKNOWN", 0, 0);
        UNKNOWN = enumC467700IVs;
        EnumC467700IVs enumC467700IVs2 = new EnumC467700IVs("MULTI_ARCH", 1, 1);
        MULTI_ARCH = enumC467700IVs2;
        EnumC467700IVs enumC467700IVs3 = new EnumC467700IVs("CROSS_ROOM_ARCH", 2, 2);
        CROSS_ROOM_ARCH = enumC467700IVs3;
        EnumC467700IVs enumC467700IVs4 = new EnumC467700IVs("OLD_ARCH", 3, 3);
        OLD_ARCH = enumC467700IVs4;
        EnumC467700IVs[] enumC467700IVsArr = {enumC467700IVs, enumC467700IVs2, enumC467700IVs3, enumC467700IVs4};
        LLILLJJLI = enumC467700IVsArr;
        LLILLL = new C2254308sP(enumC467700IVsArr);
    }

    public static EnumC467700IVs[] values() {
        return (EnumC467700IVs[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC467700IVs valueOf(String str) {
        return (EnumC467700IVs) C08FF.LIZ(EnumC467700IVs.class, str);
    }

    public EnumC467700IVs(String str, int i, int i2) {
        this.LL = i2;
    }
}
