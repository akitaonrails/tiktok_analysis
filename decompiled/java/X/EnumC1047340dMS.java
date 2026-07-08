package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1047340dMS {
    public static final EnumC1047340dMS Closed;
    public static final /* synthetic */ EnumC1047340dMS[] LLILLJJLI;
    public final String LL = "closed";

    public static EnumC1047340dMS valueOf(String str) {
        return (EnumC1047340dMS) C08FF.LIZ(EnumC1047340dMS.class, str);
    }

    public static EnumC1047340dMS[] values() {
        return (EnumC1047340dMS[]) LLILLJJLI.clone();
    }

    static {
        EnumC1047340dMS enumC1047340dMS = new EnumC1047340dMS();
        Closed = enumC1047340dMS;
        LLILLJJLI = new EnumC1047340dMS[]{enumC1047340dMS};
    }

    public final String getActionType() {
        return this.LL;
    }
}
