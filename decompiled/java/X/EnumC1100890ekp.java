package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ekp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1100890ekp {
    public static final EnumC1100890ekp ADAPTIVE;
    public static final /* synthetic */ EnumC1100890ekp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1100890ekp STABLE;
    public static final EnumC1100890ekp STABLE_NEW;

    public static InterfaceC2044707zh<EnumC1100890ekp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1100890ekp enumC1100890ekp = new EnumC1100890ekp("ADAPTIVE", 0);
        ADAPTIVE = enumC1100890ekp;
        EnumC1100890ekp enumC1100890ekp2 = new EnumC1100890ekp("STABLE", 1);
        STABLE = enumC1100890ekp2;
        EnumC1100890ekp enumC1100890ekp3 = new EnumC1100890ekp("STABLE_NEW", 2);
        STABLE_NEW = enumC1100890ekp3;
        EnumC1100890ekp[] enumC1100890ekpArr = {enumC1100890ekp, enumC1100890ekp2, enumC1100890ekp3};
        LL = enumC1100890ekpArr;
        LLILLJJLI = new C2254308sP(enumC1100890ekpArr);
    }

    public static EnumC1100890ekp[] values() {
        return (EnumC1100890ekp[]) LL.clone();
    }

    public static EnumC1100890ekp valueOf(String str) {
        return (EnumC1100890ekp) C08FF.LIZ(EnumC1100890ekp.class, str);
    }

    public EnumC1100890ekp(String str, int i) {
    }
}
