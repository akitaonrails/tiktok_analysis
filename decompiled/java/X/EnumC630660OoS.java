package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC630660OoS {
    public static final /* synthetic */ EnumC630660OoS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC630660OoS LOADED;
    public static final EnumC630660OoS LOADING;
    public static final EnumC630660OoS PUBLISH;
    public static final EnumC630660OoS UNLOADING;

    public static InterfaceC2044707zh<EnumC630660OoS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC630660OoS enumC630660OoS = new EnumC630660OoS("UNLOADING", 0);
        UNLOADING = enumC630660OoS;
        EnumC630660OoS enumC630660OoS2 = new EnumC630660OoS("LOADED", 1);
        LOADED = enumC630660OoS2;
        EnumC630660OoS enumC630660OoS3 = new EnumC630660OoS("LOADING", 2);
        LOADING = enumC630660OoS3;
        EnumC630660OoS enumC630660OoS4 = new EnumC630660OoS("PUBLISH", 3);
        PUBLISH = enumC630660OoS4;
        EnumC630660OoS[] enumC630660OoSArr = {enumC630660OoS, enumC630660OoS2, enumC630660OoS3, enumC630660OoS4};
        LL = enumC630660OoSArr;
        LLILLJJLI = new C2254308sP(enumC630660OoSArr);
    }

    public static EnumC630660OoS[] values() {
        return (EnumC630660OoS[]) LL.clone();
    }

    public static EnumC630660OoS valueOf(String str) {
        return (EnumC630660OoS) C08FF.LIZ(EnumC630660OoS.class, str);
    }

    public EnumC630660OoS(String str, int i) {
    }
}
