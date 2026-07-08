package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641520soo {
    public static final EnumC1641520soo HIDE;
    public static final /* synthetic */ EnumC1641520soo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1641520soo SHOW;

    public static InterfaceC2044707zh<EnumC1641520soo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1641520soo enumC1641520soo = new EnumC1641520soo("SHOW", 0);
        SHOW = enumC1641520soo;
        EnumC1641520soo enumC1641520soo2 = new EnumC1641520soo("HIDE", 1);
        HIDE = enumC1641520soo2;
        EnumC1641520soo[] enumC1641520sooArr = {enumC1641520soo, enumC1641520soo2};
        LL = enumC1641520sooArr;
        LLILLJJLI = new C2254308sP(enumC1641520sooArr);
    }

    public static EnumC1641520soo[] values() {
        return (EnumC1641520soo[]) LL.clone();
    }

    public static EnumC1641520soo valueOf(String str) {
        return (EnumC1641520soo) C08FF.LIZ(EnumC1641520soo.class, str);
    }

    public EnumC1641520soo(String str, int i) {
    }
}
