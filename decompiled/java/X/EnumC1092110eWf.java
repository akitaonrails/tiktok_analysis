package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1092110eWf {
    public static final EnumC1092110eWf BLACK;
    public static final EnumC1092110eWf ERROR;
    public static final /* synthetic */ EnumC1092110eWf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1092110eWf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1092110eWf enumC1092110eWf = new EnumC1092110eWf("BLACK", 0, R.attr.exj);
        BLACK = enumC1092110eWf;
        EnumC1092110eWf enumC1092110eWf2 = new EnumC1092110eWf("ERROR", 1, R.attr.c6e);
        ERROR = enumC1092110eWf2;
        EnumC1092110eWf[] enumC1092110eWfArr = {enumC1092110eWf, enumC1092110eWf2};
        LLILLJJLI = enumC1092110eWfArr;
        LLILLL = new C2254308sP(enumC1092110eWfArr);
    }

    public static EnumC1092110eWf[] values() {
        return (EnumC1092110eWf[]) LLILLJJLI.clone();
    }

    public final int getAttr() {
        return this.LL;
    }

    public static EnumC1092110eWf valueOf(String str) {
        return (EnumC1092110eWf) C08FF.LIZ(EnumC1092110eWf.class, str);
    }

    public EnumC1092110eWf(String str, int i, int i2) {
        this.LL = i2;
    }
}
