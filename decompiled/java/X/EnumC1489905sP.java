package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05sP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1489905sP {
    public static final /* synthetic */ EnumC1489905sP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1489905sP MIX_STUDIO_NEW;
    public static final EnumC1489905sP STICKER_COMPLETE;
    public static final EnumC1489905sP STICKER_FAIL;
    public static final EnumC1489905sP STICKER_GENERATING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1489905sP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1489905sP enumC1489905sP = new EnumC1489905sP("MIX_STUDIO_NEW", 0, "imagine_studio_new");
        MIX_STUDIO_NEW = enumC1489905sP;
        EnumC1489905sP enumC1489905sP2 = new EnumC1489905sP("STICKER_GENERATING", 1, "sticker_generating");
        STICKER_GENERATING = enumC1489905sP2;
        EnumC1489905sP enumC1489905sP3 = new EnumC1489905sP("STICKER_COMPLETE", 2, "sticker_complete");
        STICKER_COMPLETE = enumC1489905sP3;
        EnumC1489905sP enumC1489905sP4 = new EnumC1489905sP("STICKER_FAIL", 3, "sticker_fail");
        STICKER_FAIL = enumC1489905sP4;
        EnumC1489905sP[] enumC1489905sPArr = {enumC1489905sP, enumC1489905sP2, enumC1489905sP3, enumC1489905sP4};
        LLILLJJLI = enumC1489905sPArr;
        LLILLL = new C2254308sP(enumC1489905sPArr);
    }

    public static EnumC1489905sP[] values() {
        return (EnumC1489905sP[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC1489905sP valueOf(String str) {
        return (EnumC1489905sP) C08FF.LIZ(EnumC1489905sP.class, str);
    }

    public EnumC1489905sP(String str, int i, String str2) {
        this.LL = str2;
    }
}
