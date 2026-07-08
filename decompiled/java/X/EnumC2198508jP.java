package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.08jP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2198508jP {
    public static final EnumC2198508jP CONVERSATION;
    public static final /* synthetic */ EnumC2198508jP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2198508jP USER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2198508jP> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2198508jP enumC2198508jP = new EnumC2198508jP("USER", 0, 1);
        USER = enumC2198508jP;
        EnumC2198508jP enumC2198508jP2 = new EnumC2198508jP("CONVERSATION", 1, 2);
        CONVERSATION = enumC2198508jP2;
        EnumC2198508jP[] enumC2198508jPArr = {enumC2198508jP, enumC2198508jP2};
        LLILLJJLI = enumC2198508jPArr;
        LLILLL = new C2254308sP(enumC2198508jPArr);
    }

    public static EnumC2198508jP[] values() {
        return (EnumC2198508jP[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2198508jP valueOf(String str) {
        return (EnumC2198508jP) C08FF.LIZ(EnumC2198508jP.class, str);
    }

    public EnumC2198508jP(String str, int i, int i2) {
        this.LL = i2;
    }
}
