package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC113700bv {
    public static final /* synthetic */ EnumC113700bv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC113700bv MIC_ROOM;
    public static final EnumC113700bv NORMAL_LIVE_ROOM;
    public static final EnumC113700bv WHITE_LIST_MIC_ROOM;
    public int LL;

    public static InterfaceC2044707zh<EnumC113700bv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC113700bv enumC113700bv = new EnumC113700bv("NORMAL_LIVE_ROOM", 0, 0);
        NORMAL_LIVE_ROOM = enumC113700bv;
        EnumC113700bv enumC113700bv2 = new EnumC113700bv("MIC_ROOM", 1, 1);
        MIC_ROOM = enumC113700bv2;
        EnumC113700bv enumC113700bv3 = new EnumC113700bv("WHITE_LIST_MIC_ROOM", 2, 2);
        WHITE_LIST_MIC_ROOM = enumC113700bv3;
        EnumC113700bv[] enumC113700bvArr = {enumC113700bv, enumC113700bv2, enumC113700bv3};
        LLILLJJLI = enumC113700bvArr;
        LLILLL = new C2254308sP(enumC113700bvArr);
    }

    public static EnumC113700bv[] values() {
        return (EnumC113700bv[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC113700bv valueOf(String str) {
        return (EnumC113700bv) C08FF.LIZ(EnumC113700bv.class, str);
    }

    public final void setType(int i) {
        this.LL = i;
    }

    public EnumC113700bv(String str, int i, int i2) {
        this.LL = i2;
    }
}
