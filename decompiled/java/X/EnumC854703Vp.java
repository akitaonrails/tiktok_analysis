package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC854703Vp {
    public static final EnumC854703Vp ACCEPT;
    public static final EnumC854703Vp CLOSE;
    public static final /* synthetic */ EnumC854703Vp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC854703Vp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854703Vp enumC854703Vp = new EnumC854703Vp("CLOSE", 0, 1);
        CLOSE = enumC854703Vp;
        EnumC854703Vp enumC854703Vp2 = new EnumC854703Vp("ACCEPT", 1, 2);
        ACCEPT = enumC854703Vp2;
        EnumC854703Vp[] enumC854703VpArr = {enumC854703Vp, enumC854703Vp2};
        LLILLJJLI = enumC854703VpArr;
        LLILLL = new C2254308sP(enumC854703VpArr);
    }

    public static EnumC854703Vp[] values() {
        return (EnumC854703Vp[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC854703Vp valueOf(String str) {
        return (EnumC854703Vp) C08FF.LIZ(EnumC854703Vp.class, str);
    }

    public EnumC854703Vp(String str, int i, int i2) {
        this.LL = i2;
    }
}
