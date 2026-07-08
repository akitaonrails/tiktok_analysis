package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC617010OHz {
    public static final EnumC617010OHz CHANNEL_NOT_SUBSCRIBED;
    public static final EnumC617010OHz CHANNEL_SUBSCRIBED;
    public static final C0OI0 Companion;
    public static final EnumC617010OHz INVALID;
    public static final /* synthetic */ EnumC617010OHz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC617010OHz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC617010OHz enumC617010OHz = new EnumC617010OHz("INVALID", 0, -1);
        INVALID = enumC617010OHz;
        EnumC617010OHz enumC617010OHz2 = new EnumC617010OHz("CHANNEL_NOT_SUBSCRIBED", 1, 0);
        CHANNEL_NOT_SUBSCRIBED = enumC617010OHz2;
        EnumC617010OHz enumC617010OHz3 = new EnumC617010OHz("CHANNEL_SUBSCRIBED", 2, 1);
        CHANNEL_SUBSCRIBED = enumC617010OHz3;
        EnumC617010OHz[] enumC617010OHzArr = {enumC617010OHz, enumC617010OHz2, enumC617010OHz3};
        LLILLJJLI = enumC617010OHzArr;
        LLILLL = new C2254308sP(enumC617010OHzArr);
        Companion = new C0OI0();
    }

    public static EnumC617010OHz[] values() {
        return (EnumC617010OHz[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC617010OHz valueOf(String str) {
        return (EnumC617010OHz) C08FF.LIZ(EnumC617010OHz.class, str);
    }

    public EnumC617010OHz(String str, int i, int i2) {
        this.LL = i2;
    }
}
