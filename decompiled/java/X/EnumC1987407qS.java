package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987407qS {
    public static final EnumC1987407qS FULL_MIGRATE;
    public static final /* synthetic */ EnumC1987407qS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1987407qS PARTIAL_MIGRATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1987407qS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1987407qS enumC1987407qS = new EnumC1987407qS("PARTIAL_MIGRATE", 0, 1);
        PARTIAL_MIGRATE = enumC1987407qS;
        EnumC1987407qS enumC1987407qS2 = new EnumC1987407qS("FULL_MIGRATE", 1, 2);
        FULL_MIGRATE = enumC1987407qS2;
        EnumC1987407qS[] enumC1987407qSArr = {enumC1987407qS, enumC1987407qS2};
        LLILLJJLI = enumC1987407qSArr;
        LLILLL = new C2254308sP(enumC1987407qSArr);
    }

    public static EnumC1987407qS[] values() {
        return (EnumC1987407qS[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1987407qS valueOf(String str) {
        return (EnumC1987407qS) C08FF.LIZ(EnumC1987407qS.class, str);
    }

    public EnumC1987407qS(String str, int i, int i2) {
        this.LL = i2;
    }
}
