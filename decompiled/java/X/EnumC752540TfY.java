package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC752540TfY {
    public static final EnumC752540TfY GUIDE;
    public static final /* synthetic */ EnumC752540TfY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC752540TfY MODERATOR_LIST;

    public static InterfaceC2044707zh<EnumC752540TfY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC752540TfY enumC752540TfY = new EnumC752540TfY("GUIDE", 0);
        GUIDE = enumC752540TfY;
        EnumC752540TfY enumC752540TfY2 = new EnumC752540TfY("MODERATOR_LIST", 1);
        MODERATOR_LIST = enumC752540TfY2;
        EnumC752540TfY[] enumC752540TfYArr = {enumC752540TfY, enumC752540TfY2};
        LL = enumC752540TfYArr;
        LLILLJJLI = new C2254308sP(enumC752540TfYArr);
    }

    public static EnumC752540TfY[] values() {
        return (EnumC752540TfY[]) LL.clone();
    }

    public final EnumC748580TYa toBroadcastDialogPage() {
        return C752550TfZ.LIZ[ordinal()] == 1 ? EnumC748580TYa.MODERATOR_LIST : EnumC748580TYa.GUIDE;
    }

    public static EnumC752540TfY valueOf(String str) {
        return (EnumC752540TfY) C08FF.LIZ(EnumC752540TfY.class, str);
    }

    public EnumC752540TfY(String str, int i) {
    }
}
