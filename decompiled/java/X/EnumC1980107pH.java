package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1980107pH {
    public static final /* synthetic */ EnumC1980107pH[] LLILLJJLI;
    public static final EnumC1980107pH PLATFORM_CONFIG;
    public final String LL = "platform_config";

    static {
        EnumC1980107pH enumC1980107pH = new EnumC1980107pH();
        PLATFORM_CONFIG = enumC1980107pH;
        LLILLJJLI = new EnumC1980107pH[]{enumC1980107pH};
    }

    public static EnumC1980107pH[] values() {
        return (EnumC1980107pH[]) LLILLJJLI.clone();
    }

    public String getKey() {
        return this.LL;
    }

    public static EnumC1980107pH valueOf(String str) {
        return (EnumC1980107pH) C08FF.LIZ(EnumC1980107pH.class, str);
    }
}
