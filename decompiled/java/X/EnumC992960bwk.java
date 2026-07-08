package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992960bwk {
    public static final EnumC992960bwk LINK_TYPE_GO_BACK;
    public static final EnumC992960bwk LINK_TYPE_UNKNOWN;
    public static final EnumC992960bwk LINK_TYPE_URL;
    public static final /* synthetic */ EnumC992960bwk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992960bwk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992960bwk enumC992960bwk = new EnumC992960bwk("LINK_TYPE_UNKNOWN", 0, 0);
        LINK_TYPE_UNKNOWN = enumC992960bwk;
        EnumC992960bwk enumC992960bwk2 = new EnumC992960bwk("LINK_TYPE_GO_BACK", 1, 1);
        LINK_TYPE_GO_BACK = enumC992960bwk2;
        EnumC992960bwk enumC992960bwk3 = new EnumC992960bwk("LINK_TYPE_URL", 2, 2);
        LINK_TYPE_URL = enumC992960bwk3;
        EnumC992960bwk[] enumC992960bwkArr = {enumC992960bwk, enumC992960bwk2, enumC992960bwk3};
        LLILLJJLI = enumC992960bwkArr;
        LLILLL = new C2254308sP(enumC992960bwkArr);
    }

    public static EnumC992960bwk[] values() {
        return (EnumC992960bwk[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC992960bwk valueOf(String str) {
        return (EnumC992960bwk) C08FF.LIZ(EnumC992960bwk.class, str);
    }

    public EnumC992960bwk(String str, int i, int i2) {
        this.LL = i2;
    }
}
