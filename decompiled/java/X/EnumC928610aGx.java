package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC928610aGx {
    public static final EnumC928610aGx FRIENDS;
    public static final EnumC928610aGx GROUP_CHAT;
    public static final EnumC928610aGx LIVE_EVENT_REGISTERED_FRIENDS;
    public static final /* synthetic */ EnumC928610aGx[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC928610aGx SUGGEST;

    public static InterfaceC2044707zh<EnumC928610aGx> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC928610aGx enumC928610aGx = new EnumC928610aGx("LIVE_EVENT_REGISTERED_FRIENDS", 0);
        LIVE_EVENT_REGISTERED_FRIENDS = enumC928610aGx;
        EnumC928610aGx enumC928610aGx2 = new EnumC928610aGx("FRIENDS", 1);
        FRIENDS = enumC928610aGx2;
        EnumC928610aGx enumC928610aGx3 = new EnumC928610aGx("GROUP_CHAT", 2);
        GROUP_CHAT = enumC928610aGx3;
        EnumC928610aGx enumC928610aGx4 = new EnumC928610aGx("SUGGEST", 3);
        SUGGEST = enumC928610aGx4;
        EnumC928610aGx[] enumC928610aGxArr = {enumC928610aGx, enumC928610aGx2, enumC928610aGx3, enumC928610aGx4};
        LL = enumC928610aGxArr;
        LLILLJJLI = new C2254308sP(enumC928610aGxArr);
    }

    public static EnumC928610aGx[] values() {
        return (EnumC928610aGx[]) LL.clone();
    }

    public static EnumC928610aGx valueOf(String str) {
        return (EnumC928610aGx) C08FF.LIZ(EnumC928610aGx.class, str);
    }

    public EnumC928610aGx(String str, int i) {
    }
}
