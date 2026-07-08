package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS254S0000000_17;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ejI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1099940ejI {
    public static final EnumC1099940ejI ICON;
    public static final EnumC1099940ejI ICON_LAND;
    public static final EnumC1099940ejI ICON_WITH_TEXT;
    public static final /* synthetic */ EnumC1099940ejI[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final C1099990ejN LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1099940ejI> getEntries() {
        return LLILZ;
    }

    public final boolean getHasTitle() {
        return false;
    }

    public final boolean isPopup() {
        return false;
    }

    static {
        EnumC1099940ejI enumC1099940ejI = new EnumC1099940ejI("ICON", 0, R.layout.h5g, C1099970ejL.LIZ(AFwS254S0000000_17.get$arr$(358)));
        ICON = enumC1099940ejI;
        EnumC1099940ejI enumC1099940ejI2 = new EnumC1099940ejI("ICON_LAND", 1, R.layout.h5f, C1099970ejL.LIZ(AFwS254S0000000_17.get$arr$(359)));
        ICON_LAND = enumC1099940ejI2;
        EnumC1099940ejI enumC1099940ejI3 = new EnumC1099940ejI("ICON_WITH_TEXT", 2, R.layout.h5j, C1099970ejL.LIZ(AFwS254S0000000_17.get$arr$(360)));
        ICON_WITH_TEXT = enumC1099940ejI3;
        EnumC1099940ejI[] enumC1099940ejIArr = {enumC1099940ejI, enumC1099940ejI2, enumC1099940ejI3};
        LLILLL = enumC1099940ejIArr;
        LLILZ = new C2254308sP(enumC1099940ejIArr);
    }

    public static EnumC1099940ejI[] values() {
        return (EnumC1099940ejI[]) LLILLL.clone();
    }

    public final int getLayoutId() {
        return this.LL;
    }

    public final C1099990ejN getLayoutParams() {
        return this.LLILLJJLI;
    }

    public static EnumC1099940ejI valueOf(String str) {
        return (EnumC1099940ejI) C08FF.LIZ(EnumC1099940ejI.class, str);
    }

    public EnumC1099940ejI(String str, int i, int i2, C1099990ejN c1099990ejN) {
        this.LL = i2;
        this.LLILLJJLI = c1099990ejN;
    }
}
