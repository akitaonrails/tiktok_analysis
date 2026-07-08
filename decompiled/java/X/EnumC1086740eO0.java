package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1086740eO0 {
    public static final EnumC1086740eO0 LL;
    public static final EnumC1086740eO0 LLILLJJLI;
    public static final EnumC1086740eO0 LLILLL;
    public static final /* synthetic */ EnumC1086740eO0[] LLILZ;

    static {
        EnumC1086740eO0 enumC1086740eO0 = new EnumC1086740eO0("IDLE", 0);
        LL = enumC1086740eO0;
        EnumC1086740eO0 enumC1086740eO02 = new EnumC1086740eO0("MARQUEE_RUNNING", 1);
        LLILLJJLI = enumC1086740eO02;
        EnumC1086740eO0 enumC1086740eO03 = new EnumC1086740eO0("MARQUEE_FINISHED", 2);
        LLILLL = enumC1086740eO03;
        EnumC1086740eO0[] enumC1086740eO0Arr = {enumC1086740eO0, enumC1086740eO02, enumC1086740eO03};
        LLILZ = enumC1086740eO0Arr;
        new C2254308sP(enumC1086740eO0Arr);
    }

    public static EnumC1086740eO0[] values() {
        return (EnumC1086740eO0[]) LLILZ.clone();
    }

    public static EnumC1086740eO0 valueOf(String str) {
        return (EnumC1086740eO0) C08FF.LIZ(EnumC1086740eO0.class, str);
    }

    public EnumC1086740eO0(String str, int i) {
    }
}
