package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MyR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585890MyR {
    public static final /* synthetic */ EnumC585890MyR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC585890MyR SCHEMA_TAG_DRAFT_BOX;
    public final String LL = "draft_box";

    public static InterfaceC2044707zh<EnumC585890MyR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC585890MyR enumC585890MyR = new EnumC585890MyR();
        SCHEMA_TAG_DRAFT_BOX = enumC585890MyR;
        EnumC585890MyR[] enumC585890MyRArr = {enumC585890MyR};
        LLILLJJLI = enumC585890MyRArr;
        LLILLL = new C2254308sP(enumC585890MyRArr);
    }

    public static EnumC585890MyR[] values() {
        return (EnumC585890MyR[]) LLILLJJLI.clone();
    }

    public final String getTagVal() {
        return this.LL;
    }

    public static EnumC585890MyR valueOf(String str) {
        return (EnumC585890MyR) C08FF.LIZ(EnumC585890MyR.class, str);
    }
}
