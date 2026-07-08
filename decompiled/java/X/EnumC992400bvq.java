package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992400bvq {
    public static final EnumC992400bvq IMAGE_EDIT;
    public static final EnumC992400bvq INSPIRATIONS;
    public static final /* synthetic */ EnumC992400bvq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992400bvq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992400bvq enumC992400bvq = new EnumC992400bvq("INSPIRATIONS", 0, "inspirations");
        INSPIRATIONS = enumC992400bvq;
        EnumC992400bvq enumC992400bvq2 = new EnumC992400bvq("IMAGE_EDIT", 1, "image_edit");
        IMAGE_EDIT = enumC992400bvq2;
        EnumC992400bvq[] enumC992400bvqArr = {enumC992400bvq, enumC992400bvq2};
        LLILLJJLI = enumC992400bvqArr;
        LLILLL = new C2254308sP(enumC992400bvqArr);
    }

    public static EnumC992400bvq[] values() {
        return (EnumC992400bvq[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC992400bvq valueOf(String str) {
        return (EnumC992400bvq) C08FF.LIZ(EnumC992400bvq.class, str);
    }

    public EnumC992400bvq(String str, int i, String str2) {
        this.LL = str2;
    }
}
