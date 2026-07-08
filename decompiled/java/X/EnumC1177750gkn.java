package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1177750gkn implements Serializable {
    public static final /* synthetic */ EnumC1177750gkn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1177750gkn NO_INTERNET;
    public static final EnumC1177750gkn SOMETHING_WRONG;

    public static InterfaceC2044707zh<EnumC1177750gkn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1177750gkn enumC1177750gkn = new EnumC1177750gkn("NO_INTERNET", 0);
        NO_INTERNET = enumC1177750gkn;
        EnumC1177750gkn enumC1177750gkn2 = new EnumC1177750gkn("SOMETHING_WRONG", 1);
        SOMETHING_WRONG = enumC1177750gkn2;
        EnumC1177750gkn[] enumC1177750gknArr = {enumC1177750gkn, enumC1177750gkn2};
        LL = enumC1177750gknArr;
        LLILLJJLI = new C2254308sP(enumC1177750gknArr);
    }

    public static EnumC1177750gkn[] values() {
        return (EnumC1177750gkn[]) LL.clone();
    }

    public static EnumC1177750gkn valueOf(String str) {
        return (EnumC1177750gkn) C08FF.LIZ(EnumC1177750gkn.class, str);
    }

    public EnumC1177750gkn(String str, int i) {
    }
}
