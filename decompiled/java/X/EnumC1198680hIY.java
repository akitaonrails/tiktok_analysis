package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1198680hIY implements Serializable {
    public static final EnumC1198680hIY ACTIVITY_RETAG;
    public static final EnumC1198680hIY ADD_LOCATION;
    public static final C1198880hIs Companion;
    public static final EnumC1198680hIY DATE_LOCATION;
    public static final /* synthetic */ EnumC1198680hIY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1198680hIY LOCATION_STICKER;
    public static final EnumC1198680hIY POI_EDIT_POST;
    public static final EnumC1198680hIY POI_RE_TAG;

    public static InterfaceC2044707zh<EnumC1198680hIY> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0hIs] */
    static {
        EnumC1198680hIY enumC1198680hIY = new EnumC1198680hIY("ADD_LOCATION", 0);
        ADD_LOCATION = enumC1198680hIY;
        EnumC1198680hIY enumC1198680hIY2 = new EnumC1198680hIY("POI_RE_TAG", 1);
        POI_RE_TAG = enumC1198680hIY2;
        EnumC1198680hIY enumC1198680hIY3 = new EnumC1198680hIY("POI_EDIT_POST", 2);
        POI_EDIT_POST = enumC1198680hIY3;
        EnumC1198680hIY enumC1198680hIY4 = new EnumC1198680hIY("LOCATION_STICKER", 3);
        LOCATION_STICKER = enumC1198680hIY4;
        EnumC1198680hIY enumC1198680hIY5 = new EnumC1198680hIY("DATE_LOCATION", 4);
        DATE_LOCATION = enumC1198680hIY5;
        EnumC1198680hIY enumC1198680hIY6 = new EnumC1198680hIY("ACTIVITY_RETAG", 5);
        ACTIVITY_RETAG = enumC1198680hIY6;
        EnumC1198680hIY[] enumC1198680hIYArr = {enumC1198680hIY, enumC1198680hIY2, enumC1198680hIY3, enumC1198680hIY4, enumC1198680hIY5, enumC1198680hIY6};
        LL = enumC1198680hIYArr;
        LLILLJJLI = new C2254308sP(enumC1198680hIYArr);
        Companion = new Object() { // from class: X.0hIs
        };
    }

    public static EnumC1198680hIY[] values() {
        return (EnumC1198680hIY[]) LL.clone();
    }

    public static EnumC1198680hIY valueOf(String str) {
        return (EnumC1198680hIY) C08FF.LIZ(EnumC1198680hIY.class, str);
    }

    public EnumC1198680hIY(String str, int i) {
    }
}
