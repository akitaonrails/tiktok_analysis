package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587490N2l {
    public static final /* synthetic */ EnumC587490N2l[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC587490N2l P2_SEMIBOLD_13SP;
    public static final EnumC587490N2l P3_SEMIBOLD_12SP;
    public final int LL;
    public final float LLILLJJLI;

    public static InterfaceC2044707zh<EnumC587490N2l> getEntries() {
        return LLILZ;
    }

    static {
        EnumC587490N2l enumC587490N2l = new EnumC587490N2l(0, R.style.rk, 13.0f, "P2_SEMIBOLD_13SP");
        P2_SEMIBOLD_13SP = enumC587490N2l;
        EnumC587490N2l enumC587490N2l2 = new EnumC587490N2l(1, R.style.rn, 12.0f, "P3_SEMIBOLD_12SP");
        P3_SEMIBOLD_12SP = enumC587490N2l2;
        EnumC587490N2l[] enumC587490N2lArr = {enumC587490N2l, enumC587490N2l2};
        LLILLL = enumC587490N2lArr;
        LLILZ = new C2254308sP(enumC587490N2lArr);
    }

    public static EnumC587490N2l[] values() {
        return (EnumC587490N2l[]) LLILLL.clone();
    }

    public final float getSp() {
        return this.LLILLJJLI;
    }

    public final int getStyleRes() {
        return this.LL;
    }

    public static EnumC587490N2l valueOf(String str) {
        return (EnumC587490N2l) C08FF.LIZ(EnumC587490N2l.class, str);
    }

    public EnumC587490N2l(int i, int i2, float f, String str) {
        this.LL = i2;
        this.LLILLJJLI = f;
    }
}
