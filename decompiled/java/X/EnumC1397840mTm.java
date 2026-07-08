package X;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Switch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1397840mTm {
    public static final EnumC1397840mTm BUTTON;
    public static final EnumC1397840mTm CHECK_BOX;
    public static final EnumC1397840mTm IMAGE_VIEW;
    public static final /* synthetic */ EnumC1397840mTm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1397840mTm NONE;
    public static final EnumC1397840mTm PROGRESS_BAR;
    public static final EnumC1397840mTm SWITCH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1397840mTm> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1397840mTm enumC1397840mTm = new EnumC1397840mTm("NONE", 0, "");
        NONE = enumC1397840mTm;
        EnumC1397840mTm enumC1397840mTm2 = new EnumC1397840mTm("BUTTON", 1, Button.class.getName());
        BUTTON = enumC1397840mTm2;
        EnumC1397840mTm enumC1397840mTm3 = new EnumC1397840mTm("CHECK_BOX", 2, CheckBox.class.getName());
        CHECK_BOX = enumC1397840mTm3;
        EnumC1397840mTm enumC1397840mTm4 = new EnumC1397840mTm("IMAGE_VIEW", 3, ImageView.class.getName());
        IMAGE_VIEW = enumC1397840mTm4;
        EnumC1397840mTm enumC1397840mTm5 = new EnumC1397840mTm("PROGRESS_BAR", 4, ProgressBar.class.getName());
        PROGRESS_BAR = enumC1397840mTm5;
        EnumC1397840mTm enumC1397840mTm6 = new EnumC1397840mTm("SWITCH", 5, Switch.class.getName());
        SWITCH = enumC1397840mTm6;
        EnumC1397840mTm[] enumC1397840mTmArr = {enumC1397840mTm, enumC1397840mTm2, enumC1397840mTm3, enumC1397840mTm4, enumC1397840mTm5, enumC1397840mTm6};
        LLILLJJLI = enumC1397840mTmArr;
        LLILLL = new C2254308sP(enumC1397840mTmArr);
    }

    public static EnumC1397840mTm[] values() {
        return (EnumC1397840mTm[]) LLILLJJLI.clone();
    }

    public final String getClassName() {
        return this.LL;
    }

    public static EnumC1397840mTm valueOf(String str) {
        return (EnumC1397840mTm) C08FF.LIZ(EnumC1397840mTm.class, str);
    }

    public EnumC1397840mTm(String str, int i, String str2) {
        this.LL = str2;
    }
}
