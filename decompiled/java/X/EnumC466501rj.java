package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01rj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC466501rj {
    public static final EnumC466501rj FAVORITE;
    public static final /* synthetic */ EnumC466501rj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC466501rj UN_FAVORITE;

    public static InterfaceC2044707zh<EnumC466501rj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC466501rj enumC466501rj = new EnumC466501rj("FAVORITE", 0);
        FAVORITE = enumC466501rj;
        EnumC466501rj enumC466501rj2 = new EnumC466501rj("UN_FAVORITE", 1);
        UN_FAVORITE = enumC466501rj2;
        EnumC466501rj[] enumC466501rjArr = {enumC466501rj, enumC466501rj2};
        LL = enumC466501rjArr;
        LLILLJJLI = new C2254308sP(enumC466501rjArr);
    }

    public static EnumC466501rj[] values() {
        return (EnumC466501rj[]) LL.clone();
    }

    public static EnumC466501rj valueOf(String str) {
        return (EnumC466501rj) C08FF.LIZ(EnumC466501rj.class, str);
    }

    public EnumC466501rj(String str, int i) {
    }
}
