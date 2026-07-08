package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1012360cS2 {
    public static final EnumC1012360cS2 LIVE_FEED_ADS_PIN_CARD;
    public static final EnumC1012360cS2 LIVE_ROOM_PIN_CARD;
    public static final /* synthetic */ EnumC1012360cS2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1012360cS2 VIDEO_FEED_ADS_PIN_CARD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1012360cS2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1012360cS2 enumC1012360cS2 = new EnumC1012360cS2("LIVE_ROOM_PIN_CARD", 0, 0);
        LIVE_ROOM_PIN_CARD = enumC1012360cS2;
        EnumC1012360cS2 enumC1012360cS22 = new EnumC1012360cS2("LIVE_FEED_ADS_PIN_CARD", 1, 1);
        LIVE_FEED_ADS_PIN_CARD = enumC1012360cS22;
        EnumC1012360cS2 enumC1012360cS23 = new EnumC1012360cS2("VIDEO_FEED_ADS_PIN_CARD", 2, 2);
        VIDEO_FEED_ADS_PIN_CARD = enumC1012360cS23;
        EnumC1012360cS2[] enumC1012360cS2Arr = {enumC1012360cS2, enumC1012360cS22, enumC1012360cS23};
        LLILLJJLI = enumC1012360cS2Arr;
        LLILLL = new C2254308sP(enumC1012360cS2Arr);
    }

    public static EnumC1012360cS2[] values() {
        return (EnumC1012360cS2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1012360cS2 valueOf(String str) {
        return (EnumC1012360cS2) C08FF.LIZ(EnumC1012360cS2.class, str);
    }

    public EnumC1012360cS2(String str, int i, int i2) {
        this.LL = i2;
    }
}
