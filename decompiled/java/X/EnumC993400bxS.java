package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993400bxS {
    public static final /* synthetic */ EnumC993400bxS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993400bxS TYPE_NORMAL;
    public static final EnumC993400bxS TYPE_TRANSFORM;

    public static InterfaceC2044707zh<EnumC993400bxS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993400bxS enumC993400bxS = new EnumC993400bxS("TYPE_NORMAL", 0);
        TYPE_NORMAL = enumC993400bxS;
        EnumC993400bxS enumC993400bxS2 = new EnumC993400bxS("TYPE_TRANSFORM", 1);
        TYPE_TRANSFORM = enumC993400bxS2;
        EnumC993400bxS[] enumC993400bxSArr = {enumC993400bxS, enumC993400bxS2};
        LL = enumC993400bxSArr;
        LLILLJJLI = new C2254308sP(enumC993400bxSArr);
    }

    public static EnumC993400bxS[] values() {
        return (EnumC993400bxS[]) LL.clone();
    }

    public static EnumC993400bxS valueOf(String str) {
        return (EnumC993400bxS) C08FF.LIZ(EnumC993400bxS.class, str);
    }

    public EnumC993400bxS(String str, int i) {
    }
}
