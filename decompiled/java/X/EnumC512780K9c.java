package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0K9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC512780K9c {
    public static final EnumC512780K9c FOLLOW_GUIDE;
    public static final EnumC512780K9c FRAME_L3_SLOT;
    public static final EnumC512780K9c GIFT_GUIDE;
    public static final EnumC512780K9c HOT_WORD_GIFT;
    public static final /* synthetic */ EnumC512780K9c[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC512780K9c PAID_EVENT_TRAIL_CARD;
    public static final EnumC512780K9c PROGRAMMED_LIVE_FOLLOW;
    public static final EnumC512780K9c SUB_ONLY_TRAIL_CARD;

    public static InterfaceC2044707zh<EnumC512780K9c> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC512780K9c enumC512780K9c = new EnumC512780K9c("HOT_WORD_GIFT", 0);
        HOT_WORD_GIFT = enumC512780K9c;
        EnumC512780K9c enumC512780K9c2 = new EnumC512780K9c("FRAME_L3_SLOT", 1);
        FRAME_L3_SLOT = enumC512780K9c2;
        EnumC512780K9c enumC512780K9c3 = new EnumC512780K9c("GIFT_GUIDE", 2);
        GIFT_GUIDE = enumC512780K9c3;
        EnumC512780K9c enumC512780K9c4 = new EnumC512780K9c("FOLLOW_GUIDE", 3);
        FOLLOW_GUIDE = enumC512780K9c4;
        EnumC512780K9c enumC512780K9c5 = new EnumC512780K9c("PROGRAMMED_LIVE_FOLLOW", 4);
        PROGRAMMED_LIVE_FOLLOW = enumC512780K9c5;
        EnumC512780K9c enumC512780K9c6 = new EnumC512780K9c("SUB_ONLY_TRAIL_CARD", 5);
        SUB_ONLY_TRAIL_CARD = enumC512780K9c6;
        EnumC512780K9c enumC512780K9c7 = new EnumC512780K9c("PAID_EVENT_TRAIL_CARD", 6);
        PAID_EVENT_TRAIL_CARD = enumC512780K9c7;
        EnumC512780K9c[] enumC512780K9cArr = {enumC512780K9c, enumC512780K9c2, enumC512780K9c3, enumC512780K9c4, enumC512780K9c5, enumC512780K9c6, enumC512780K9c7};
        LL = enumC512780K9cArr;
        LLILLJJLI = new C2254308sP(enumC512780K9cArr);
    }

    public static EnumC512780K9c[] values() {
        return (EnumC512780K9c[]) LL.clone();
    }

    public static EnumC512780K9c valueOf(String str) {
        return (EnumC512780K9c) C08FF.LIZ(EnumC512780K9c.class, str);
    }

    public EnumC512780K9c(String str, int i) {
    }
}
