package X;

import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.social.creation.mediapicker.SocialMediaPickerPageScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mqx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581250Mqx implements InterfaceC1737690vJv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1737690vJv
    public final boolean onBackPressed() {
        switch (this.$t) {
            case 0:
                return onBackPressed$0(this);
            case 1:
                return onBackPressed$1(this);
            case 2:
                return onBackPressed$2(this);
            case 3:
                return onBackPressed$3(this);
            case 4:
                return onBackPressed$4(this);
            default:
                return false;
        }
    }

    public static final boolean onBackPressed$0(C581250Mqx c581250Mqx) {
        C555400LqM c555400LqM;
        TuxIconView tuxIconView;
        if (((C555380LqK) c581250Mqx.l0).isVisible() && !C545820Lau.LJ((C555380LqK) c581250Mqx.l0) && (c555400LqM = ((C555380LqK) c581250Mqx.l0).LLJJJIL) != null && (tuxIconView = c555400LqM.LLILLJJLI) != null) {
            tuxIconView.performClick();
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$1(C581250Mqx c581250Mqx) {
        NavigationScene navigationSceneLIZ;
        C566170MIl c566170MIl = (C566170MIl) c581250Mqx.l0;
        InterfaceC566130MIh interfaceC566130MIh = c566170MIl.LLILLL;
        C19A3 c19a3 = c566170MIl.LLIZ;
        if (c19a3 != null && (navigationSceneLIZ = C1447800nmM.LIZ(c19a3)) != null) {
            c566170MIl.Z1(interfaceC566130MIh, navigationSceneLIZ);
            return true;
        }
        return false;
    }

    public static final boolean onBackPressed$2(C581250Mqx c581250Mqx) {
        Function0<Unit> function0 = ((C0MIN) c581250Mqx.l0).LLJJI;
        if (function0 != null) {
            function0.invoke();
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$3(C581250Mqx c581250Mqx) {
        C526910KlV c526910KlV = (C526910KlV) c581250Mqx.l0;
        C527400KmI c527400KmI = c526910KlV.LLJJIJIIJIL;
        C527270Km5 c527270Km5 = null;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        C527270Km5 c527270Km52 = c526910KlV.LLJJIJI;
        if (c527270Km52 != null) {
            c527270Km5 = c527270Km52;
        }
        InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI.LJJIZ(c527270Km5.getCurrentItem());
        if (interfaceC525540KjILJJIZ != null) {
            interfaceC525540KjILJJIZ.onBackPress();
            return true;
        }
        return true;
    }

    public static final boolean onBackPressed$4(C581250Mqx c581250Mqx) {
        ((SocialMediaPickerPageScene) c581250Mqx.l0).onBackPressed();
        return true;
    }

    public C581250Mqx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
