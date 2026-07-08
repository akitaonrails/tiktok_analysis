package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0afO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC943760afO {
    public static final /* synthetic */ EnumC943760afO[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC943760afO MULTIGUEST;
    public static final EnumC943760afO MULTI_GUEST_SHOW;
    public static final EnumC943760afO PK;
    public static final EnumC943760afO PLAZA;
    public final int LL;
    public boolean LLILLJJLI = false;

    public static InterfaceC2044707zh<EnumC943760afO> getEntries() {
        return LLILZ;
    }

    static {
        EnumC943760afO enumC943760afO = new EnumC943760afO("MULTIGUEST", 0, 0);
        MULTIGUEST = enumC943760afO;
        EnumC943760afO enumC943760afO2 = new EnumC943760afO("PK", 1, 1);
        PK = enumC943760afO2;
        EnumC943760afO enumC943760afO3 = new EnumC943760afO("MULTI_GUEST_SHOW", 2, 2);
        MULTI_GUEST_SHOW = enumC943760afO3;
        EnumC943760afO enumC943760afO4 = new EnumC943760afO("PLAZA", 3, 3);
        PLAZA = enumC943760afO4;
        EnumC943760afO[] enumC943760afOArr = {enumC943760afO, enumC943760afO2, enumC943760afO3, enumC943760afO4};
        LLILLL = enumC943760afOArr;
        LLILZ = new C2254308sP(enumC943760afOArr);
    }

    public static EnumC943760afO[] values() {
        return (EnumC943760afO[]) LLILLL.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public final boolean getVisibility() {
        return this.LLILLJJLI;
    }

    public static EnumC943760afO valueOf(String str) {
        return (EnumC943760afO) C08FF.LIZ(EnumC943760afO.class, str);
    }

    public final void setVisibility(boolean z) {
        this.LLILLJJLI = z;
    }

    public EnumC943760afO(String str, int i, int i2) {
        this.LL = i2;
    }
}
