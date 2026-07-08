package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083170eIF {
    public static final EnumC1083170eIF DONATION_STICKER_WRAPPER_WIDGET;
    public static final EnumC1083170eIF LIVE_BILLBOARD_WIDGET;
    public static final EnumC1083170eIF LIVE_EVENT_STICKER_WRAPPER_WIDGET;
    public static final /* synthetic */ EnumC1083170eIF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083170eIF ROOM_STICKER_WRAPPER_WIDGET;
    public static final EnumC1083170eIF STICKER_CONTAINER_WIDGET;

    public static InterfaceC2044707zh<EnumC1083170eIF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083170eIF enumC1083170eIF = new EnumC1083170eIF("DONATION_STICKER_WRAPPER_WIDGET", 0);
        DONATION_STICKER_WRAPPER_WIDGET = enumC1083170eIF;
        EnumC1083170eIF enumC1083170eIF2 = new EnumC1083170eIF("ROOM_STICKER_WRAPPER_WIDGET", 1);
        ROOM_STICKER_WRAPPER_WIDGET = enumC1083170eIF2;
        EnumC1083170eIF enumC1083170eIF3 = new EnumC1083170eIF("LIVE_EVENT_STICKER_WRAPPER_WIDGET", 2);
        LIVE_EVENT_STICKER_WRAPPER_WIDGET = enumC1083170eIF3;
        EnumC1083170eIF enumC1083170eIF4 = new EnumC1083170eIF("STICKER_CONTAINER_WIDGET", 3);
        STICKER_CONTAINER_WIDGET = enumC1083170eIF4;
        EnumC1083170eIF enumC1083170eIF5 = new EnumC1083170eIF("LIVE_BILLBOARD_WIDGET", 4);
        LIVE_BILLBOARD_WIDGET = enumC1083170eIF5;
        EnumC1083170eIF[] enumC1083170eIFArr = {enumC1083170eIF, enumC1083170eIF2, enumC1083170eIF3, enumC1083170eIF4, enumC1083170eIF5};
        LL = enumC1083170eIFArr;
        LLILLJJLI = new C2254308sP(enumC1083170eIFArr);
    }

    public static EnumC1083170eIF[] values() {
        return (EnumC1083170eIF[]) LL.clone();
    }

    public static EnumC1083170eIF valueOf(String str) {
        return (EnumC1083170eIF) C08FF.LIZ(EnumC1083170eIF.class, str);
    }

    public EnumC1083170eIF(String str, int i) {
    }
}
