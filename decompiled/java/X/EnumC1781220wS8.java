package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1781220wS8 implements C1DGK<EnumC1781220wS8> {
    public static final /* synthetic */ EnumC1781220wS8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1781220wS8 RECORD_VIDEO;
    public final String LL = "record_video";

    public static InterfaceC2044707zh<EnumC1781220wS8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1781220wS8 enumC1781220wS8 = new EnumC1781220wS8();
        RECORD_VIDEO = enumC1781220wS8;
        EnumC1781220wS8[] enumC1781220wS8Arr = {enumC1781220wS8};
        LLILLJJLI = enumC1781220wS8Arr;
        LLILLL = new C2254308sP(enumC1781220wS8Arr);
    }

    public static EnumC1781220wS8[] values() {
        return (EnumC1781220wS8[]) LLILLJJLI.clone();
    }

    public final String getStrategyKey() {
        return this.LL;
    }

    public static EnumC1781220wS8 valueOf(String str) {
        return (EnumC1781220wS8) C08FF.LIZ(EnumC1781220wS8.class, str);
    }
}
