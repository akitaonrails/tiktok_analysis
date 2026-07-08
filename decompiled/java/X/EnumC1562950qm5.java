package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1562950qm5 {
    public static final EnumC1562950qm5 DEBUG;
    public static final /* synthetic */ EnumC1562950qm5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1562950qm5 PRIMARY;
    public static final EnumC1562950qm5 RED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1562950qm5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1562950qm5 enumC1562950qm5 = new EnumC1562950qm5("PRIMARY", 0, R.attr.a1h);
        PRIMARY = enumC1562950qm5;
        EnumC1562950qm5 enumC1562950qm52 = new EnumC1562950qm5("RED", 1, R.attr.zs);
        RED = enumC1562950qm52;
        EnumC1562950qm5 enumC1562950qm53 = new EnumC1562950qm5("DEBUG", 2, R.attr.a0i);
        DEBUG = enumC1562950qm53;
        EnumC1562950qm5[] enumC1562950qm5Arr = {enumC1562950qm5, enumC1562950qm52, enumC1562950qm53};
        LLILLJJLI = enumC1562950qm5Arr;
        LLILLL = new C2254308sP(enumC1562950qm5Arr);
    }

    public static EnumC1562950qm5[] values() {
        return (EnumC1562950qm5[]) LLILLJJLI.clone();
    }

    public final int getTintRes() {
        return this.LL;
    }

    public static EnumC1562950qm5 valueOf(String str) {
        return (EnumC1562950qm5) C08FF.LIZ(EnumC1562950qm5.class, str);
    }

    public EnumC1562950qm5(String str, int i, int i2) {
        this.LL = i2;
    }
}
