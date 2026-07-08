package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0geV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1173850geV {
    public static final C1173880geY Companion;
    public static final EnumC1173850geV HIDDEN;
    public static final /* synthetic */ EnumC1173850geV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1173850geV SHOW_DATA;
    public static final EnumC1173850geV SHOW_SKELETON;

    public static InterfaceC2044707zh<EnumC1173850geV> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0geY] */
    static {
        EnumC1173850geV enumC1173850geV = new EnumC1173850geV("HIDDEN", 0);
        HIDDEN = enumC1173850geV;
        EnumC1173850geV enumC1173850geV2 = new EnumC1173850geV("SHOW_SKELETON", 1);
        SHOW_SKELETON = enumC1173850geV2;
        EnumC1173850geV enumC1173850geV3 = new EnumC1173850geV("SHOW_DATA", 2);
        SHOW_DATA = enumC1173850geV3;
        EnumC1173850geV[] enumC1173850geVArr = {enumC1173850geV, enumC1173850geV2, enumC1173850geV3};
        LL = enumC1173850geVArr;
        LLILLJJLI = new C2254308sP(enumC1173850geVArr);
        Companion = new Object() { // from class: X.0geY
        };
    }

    public static EnumC1173850geV[] values() {
        return (EnumC1173850geV[]) LL.clone();
    }

    public static EnumC1173850geV valueOf(String str) {
        return (EnumC1173850geV) C08FF.LIZ(EnumC1173850geV.class, str);
    }

    public EnumC1173850geV(String str, int i) {
    }
}
