package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1136790fgj {
    public static final C1137540fhw Companion;
    public static final /* synthetic */ EnumC1136790fgj[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1136790fgj MULTI_HOST_MEDIUM;
    public static final EnumC1136790fgj MULTI_HOST_SMALL;
    public static final EnumC1136790fgj ONE_HOST_MEDIUM_V3;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC1136790fgj> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1136790fgj enumC1136790fgj = new EnumC1136790fgj("ONE_HOST_MEDIUM_V3", 0, R.layout.hrx, R.dimen.b0v, 8);
        ONE_HOST_MEDIUM_V3 = enumC1136790fgj;
        EnumC1136790fgj enumC1136790fgj2 = new EnumC1136790fgj("MULTI_HOST_MEDIUM", 1, R.layout.goe, R.dimen.b0s, 4);
        MULTI_HOST_MEDIUM = enumC1136790fgj2;
        EnumC1136790fgj enumC1136790fgj3 = new EnumC1136790fgj("MULTI_HOST_SMALL", 2, R.layout.gof, R.dimen.b0t, 4);
        MULTI_HOST_SMALL = enumC1136790fgj3;
        EnumC1136790fgj[] enumC1136790fgjArr = {enumC1136790fgj, enumC1136790fgj2, enumC1136790fgj3};
        LLILZ = enumC1136790fgjArr;
        LLILZIL = new C2254308sP(enumC1136790fgjArr);
        Companion = new C1137540fhw();
    }

    public static EnumC1136790fgj[] values() {
        return (EnumC1136790fgj[]) LLILZ.clone();
    }

    public final int getDefaultHeightDimen() {
        return this.LLILLJJLI;
    }

    public final int getGapDp() {
        return this.LLILLL;
    }

    public final int getLayoutId() {
        return this.LL;
    }

    public static EnumC1136790fgj valueOf(String str) {
        return (EnumC1136790fgj) C08FF.LIZ(EnumC1136790fgj.class, str);
    }

    public EnumC1136790fgj(String str, int i, int i2, int i3, int i4) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
    }
}
