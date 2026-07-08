package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1726506pT {
    public static final EnumC1726506pT CONVERSATION;
    public static final EnumC1726506pT FOLLOWING;
    public static final EnumC1726506pT FRIENDS;
    public static final /* synthetic */ EnumC1726506pT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1726506pT MAF;
    public static final EnumC1726506pT UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1726506pT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1726506pT enumC1726506pT = new EnumC1726506pT("UNKNOWN", 0, 0);
        UNKNOWN = enumC1726506pT;
        EnumC1726506pT enumC1726506pT2 = new EnumC1726506pT("CONVERSATION", 1, 1);
        CONVERSATION = enumC1726506pT2;
        EnumC1726506pT enumC1726506pT3 = new EnumC1726506pT("FRIENDS", 2, 2);
        FRIENDS = enumC1726506pT3;
        EnumC1726506pT enumC1726506pT4 = new EnumC1726506pT("MAF", 3, 3);
        MAF = enumC1726506pT4;
        EnumC1726506pT enumC1726506pT5 = new EnumC1726506pT("FOLLOWING", 4, 4);
        FOLLOWING = enumC1726506pT5;
        EnumC1726506pT[] enumC1726506pTArr = {enumC1726506pT, enumC1726506pT2, enumC1726506pT3, enumC1726506pT4, enumC1726506pT5};
        LLILLJJLI = enumC1726506pTArr;
        LLILLL = new C2254308sP(enumC1726506pTArr);
    }

    public static EnumC1726506pT[] values() {
        return (EnumC1726506pT[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1726506pT valueOf(String str) {
        return (EnumC1726506pT) C08FF.LIZ(EnumC1726506pT.class, str);
    }

    public EnumC1726506pT(String str, int i, int i2) {
        this.LL = i2;
    }
}
