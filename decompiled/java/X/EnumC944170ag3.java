package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ag3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC944170ag3 {
    public static final /* synthetic */ EnumC944170ag3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC944170ag3 STALL_LINKMIC_CHANGE_LAYOUT;
    public static final EnumC944170ag3 STALL_LINKMIC_TO_LINKMIC;
    public static final EnumC944170ag3 STALL_LINKMIC_TO_LIVE;
    public static final EnumC944170ag3 STALL_LIVE_TO_LINKMIC;
    public static final EnumC944170ag3 STALL_OTHER;
    public static final EnumC944170ag3 STALL_ROOM_EXIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC944170ag3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC944170ag3 enumC944170ag3 = new EnumC944170ag3("STALL_LIVE_TO_LINKMIC", 0, 1);
        STALL_LIVE_TO_LINKMIC = enumC944170ag3;
        EnumC944170ag3 enumC944170ag32 = new EnumC944170ag3("STALL_LINKMIC_TO_LIVE", 1, 2);
        STALL_LINKMIC_TO_LIVE = enumC944170ag32;
        EnumC944170ag3 enumC944170ag33 = new EnumC944170ag3("STALL_LINKMIC_CHANGE_LAYOUT", 2, 3);
        STALL_LINKMIC_CHANGE_LAYOUT = enumC944170ag33;
        EnumC944170ag3 enumC944170ag34 = new EnumC944170ag3("STALL_LINKMIC_TO_LINKMIC", 3, 4);
        STALL_LINKMIC_TO_LINKMIC = enumC944170ag34;
        EnumC944170ag3 enumC944170ag35 = new EnumC944170ag3("STALL_OTHER", 4, 5);
        STALL_OTHER = enumC944170ag35;
        EnumC944170ag3 enumC944170ag36 = new EnumC944170ag3("STALL_ROOM_EXIT", 5, 6);
        STALL_ROOM_EXIT = enumC944170ag36;
        EnumC944170ag3[] enumC944170ag3Arr = {enumC944170ag3, enumC944170ag32, enumC944170ag33, enumC944170ag34, enumC944170ag35, enumC944170ag36};
        LLILLJJLI = enumC944170ag3Arr;
        LLILLL = new C2254308sP(enumC944170ag3Arr);
    }

    public static EnumC944170ag3[] values() {
        return (EnumC944170ag3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC944170ag3 valueOf(String str) {
        return (EnumC944170ag3) C08FF.LIZ(EnumC944170ag3.class, str);
    }

    public EnumC944170ag3(String str, int i, int i2) {
        this.LL = i2;
    }
}
