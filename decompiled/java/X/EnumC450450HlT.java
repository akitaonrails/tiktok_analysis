package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC450450HlT {
    public static final EnumC450450HlT ADD;
    public static final /* synthetic */ EnumC450450HlT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC450450HlT REMOVE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC450450HlT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC450450HlT enumC450450HlT = new EnumC450450HlT("ADD", 0, 1);
        ADD = enumC450450HlT;
        EnumC450450HlT enumC450450HlT2 = new EnumC450450HlT("REMOVE", 1, 2);
        REMOVE = enumC450450HlT2;
        EnumC450450HlT[] enumC450450HlTArr = {enumC450450HlT, enumC450450HlT2};
        LLILLJJLI = enumC450450HlTArr;
        LLILLL = new C2254308sP(enumC450450HlTArr);
    }

    public static EnumC450450HlT[] values() {
        return (EnumC450450HlT[]) LLILLJJLI.clone();
    }

    public final int getAction() {
        return this.LL;
    }

    public static EnumC450450HlT valueOf(String str) {
        return (EnumC450450HlT) C08FF.LIZ(EnumC450450HlT.class, str);
    }

    public EnumC450450HlT(String str, int i, int i2) {
        this.LL = i2;
    }
}
