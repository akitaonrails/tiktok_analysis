package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1174670gfp implements Serializable {
    public static final /* synthetic */ EnumC1174670gfp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1174670gfp NO_INTERNET;
    public static final EnumC1174670gfp RETURN_TO;
    public static final EnumC1174670gfp SEE_MORE;
    public static final EnumC1174670gfp SOMETHING_WRONG;

    public static InterfaceC2044707zh<EnumC1174670gfp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1174670gfp enumC1174670gfp = new EnumC1174670gfp("NO_INTERNET", 0);
        NO_INTERNET = enumC1174670gfp;
        EnumC1174670gfp enumC1174670gfp2 = new EnumC1174670gfp("SOMETHING_WRONG", 1);
        SOMETHING_WRONG = enumC1174670gfp2;
        EnumC1174670gfp enumC1174670gfp3 = new EnumC1174670gfp("RETURN_TO", 2);
        RETURN_TO = enumC1174670gfp3;
        EnumC1174670gfp enumC1174670gfp4 = new EnumC1174670gfp("SEE_MORE", 3);
        SEE_MORE = enumC1174670gfp4;
        EnumC1174670gfp[] enumC1174670gfpArr = {enumC1174670gfp, enumC1174670gfp2, enumC1174670gfp3, enumC1174670gfp4};
        LL = enumC1174670gfpArr;
        LLILLJJLI = new C2254308sP(enumC1174670gfpArr);
    }

    public static EnumC1174670gfp[] values() {
        return (EnumC1174670gfp[]) LL.clone();
    }

    public static EnumC1174670gfp valueOf(String str) {
        return (EnumC1174670gfp) C08FF.LIZ(EnumC1174670gfp.class, str);
    }

    public EnumC1174670gfp(String str, int i) {
    }
}
