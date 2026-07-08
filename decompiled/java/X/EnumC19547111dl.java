package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19547111dl {
    public static final EnumC19547111dl ALL;
    public static final EnumC19547111dl IDLE;
    public static final /* synthetic */ EnumC19547111dl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19547111dl ONLY_AUDIO_WITHOUT_DUB;
    public static final EnumC19547111dl ONLY_DUB;

    public static InterfaceC2044707zh<EnumC19547111dl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19547111dl enumC19547111dl = new EnumC19547111dl("IDLE", 0);
        IDLE = enumC19547111dl;
        EnumC19547111dl enumC19547111dl2 = new EnumC19547111dl("ONLY_DUB", 1);
        ONLY_DUB = enumC19547111dl2;
        EnumC19547111dl enumC19547111dl3 = new EnumC19547111dl("ONLY_AUDIO_WITHOUT_DUB", 2);
        ONLY_AUDIO_WITHOUT_DUB = enumC19547111dl3;
        EnumC19547111dl enumC19547111dl4 = new EnumC19547111dl("ALL", 3);
        ALL = enumC19547111dl4;
        EnumC19547111dl[] enumC19547111dlArr = {enumC19547111dl, enumC19547111dl2, enumC19547111dl3, enumC19547111dl4};
        LL = enumC19547111dlArr;
        LLILLJJLI = new C2254308sP(enumC19547111dlArr);
    }

    public static EnumC19547111dl[] values() {
        return (EnumC19547111dl[]) LL.clone();
    }

    public static EnumC19547111dl valueOf(String str) {
        return (EnumC19547111dl) C08FF.LIZ(EnumC19547111dl.class, str);
    }

    public EnumC19547111dl(String str, int i) {
    }
}
