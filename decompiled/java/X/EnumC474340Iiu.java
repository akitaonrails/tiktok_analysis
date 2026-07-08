package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC474340Iiu {
    public static final EnumC474340Iiu INNER_FEED;
    public static final /* synthetic */ EnumC474340Iiu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC474340Iiu NORMAL_FEED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC474340Iiu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC474340Iiu enumC474340Iiu = new EnumC474340Iiu("NORMAL_FEED", 0, 0);
        NORMAL_FEED = enumC474340Iiu;
        EnumC474340Iiu enumC474340Iiu2 = new EnumC474340Iiu("INNER_FEED", 1, 1);
        INNER_FEED = enumC474340Iiu2;
        EnumC474340Iiu[] enumC474340IiuArr = {enumC474340Iiu, enumC474340Iiu2};
        LLILLJJLI = enumC474340IiuArr;
        LLILLL = new C2254308sP(enumC474340IiuArr);
    }

    public static EnumC474340Iiu[] values() {
        return (EnumC474340Iiu[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC474340Iiu valueOf(String str) {
        return (EnumC474340Iiu) C08FF.LIZ(EnumC474340Iiu.class, str);
    }

    public EnumC474340Iiu(String str, int i, int i2) {
        this.LL = i2;
    }
}
