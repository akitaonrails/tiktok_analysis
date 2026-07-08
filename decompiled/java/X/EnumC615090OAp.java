package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC615090OAp {
    public static final EnumC615090OAp COLLECT;
    public static final EnumC615090OAp INVITE_UPDATE_AVATARS;
    public static final /* synthetic */ EnumC615090OAp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC615090OAp NETWORK;
    public static final EnumC615090OAp VIDEO_DELETION;

    public static InterfaceC2044707zh<EnumC615090OAp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC615090OAp enumC615090OAp = new EnumC615090OAp("NETWORK", 0);
        NETWORK = enumC615090OAp;
        EnumC615090OAp enumC615090OAp2 = new EnumC615090OAp("INVITE_UPDATE_AVATARS", 1);
        INVITE_UPDATE_AVATARS = enumC615090OAp2;
        EnumC615090OAp enumC615090OAp3 = new EnumC615090OAp("COLLECT", 2);
        COLLECT = enumC615090OAp3;
        EnumC615090OAp enumC615090OAp4 = new EnumC615090OAp("VIDEO_DELETION", 3);
        VIDEO_DELETION = enumC615090OAp4;
        EnumC615090OAp[] enumC615090OApArr = {enumC615090OAp, enumC615090OAp2, enumC615090OAp3, enumC615090OAp4};
        LL = enumC615090OApArr;
        LLILLJJLI = new C2254308sP(enumC615090OApArr);
    }

    public static EnumC615090OAp[] values() {
        return (EnumC615090OAp[]) LL.clone();
    }

    public static EnumC615090OAp valueOf(String str) {
        return (EnumC615090OAp) C08FF.LIZ(EnumC615090OAp.class, str);
    }

    public EnumC615090OAp(String str, int i) {
    }
}
