package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC742830TBx {
    public static final EnumC742830TBx AD;
    public static final /* synthetic */ EnumC742830TBx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC742830TBx SOCIAL;
    public final Integer LL;

    public static InterfaceC2044707zh<EnumC742830TBx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC742830TBx enumC742830TBx = new EnumC742830TBx("SOCIAL", 0, 1);
        SOCIAL = enumC742830TBx;
        EnumC742830TBx enumC742830TBx2 = new EnumC742830TBx("AD", 1, 2);
        AD = enumC742830TBx2;
        EnumC742830TBx[] enumC742830TBxArr = {enumC742830TBx, enumC742830TBx2};
        LLILLJJLI = enumC742830TBxArr;
        LLILLL = new C2254308sP(enumC742830TBxArr);
    }

    public static EnumC742830TBx[] values() {
        return (EnumC742830TBx[]) LLILLJJLI.clone();
    }

    public final Integer getValue() {
        return this.LL;
    }

    public static EnumC742830TBx valueOf(String str) {
        return (EnumC742830TBx) C08FF.LIZ(EnumC742830TBx.class, str);
    }

    public EnumC742830TBx(String str, int i, Integer num) {
        this.LL = num;
    }
}
