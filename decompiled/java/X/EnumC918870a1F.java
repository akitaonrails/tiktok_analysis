package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC918870a1F {
    public static final EnumC918870a1F BATCH_INVITE;
    public static final EnumC918870a1F IN_ROOM;
    public static final /* synthetic */ EnumC918870a1F[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC918870a1F OUTSIDE_FRIEND;
    public static final EnumC918870a1F OUTSIDE_NON_FRIEND;

    public static InterfaceC2044707zh<EnumC918870a1F> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC918870a1F enumC918870a1F = new EnumC918870a1F("OUTSIDE_NON_FRIEND", 0);
        OUTSIDE_NON_FRIEND = enumC918870a1F;
        EnumC918870a1F enumC918870a1F2 = new EnumC918870a1F("OUTSIDE_FRIEND", 1);
        OUTSIDE_FRIEND = enumC918870a1F2;
        EnumC918870a1F enumC918870a1F3 = new EnumC918870a1F("IN_ROOM", 2);
        IN_ROOM = enumC918870a1F3;
        EnumC918870a1F enumC918870a1F4 = new EnumC918870a1F("BATCH_INVITE", 3);
        BATCH_INVITE = enumC918870a1F4;
        EnumC918870a1F[] enumC918870a1FArr = {enumC918870a1F, enumC918870a1F2, enumC918870a1F3, enumC918870a1F4};
        LL = enumC918870a1FArr;
        LLILLJJLI = new C2254308sP(enumC918870a1FArr);
    }

    public static EnumC918870a1F[] values() {
        return (EnumC918870a1F[]) LL.clone();
    }

    public static EnumC918870a1F valueOf(String str) {
        return (EnumC918870a1F) C08FF.LIZ(EnumC918870a1F.class, str);
    }

    public EnumC918870a1F(String str, int i) {
    }
}
