package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.friendstab.interfaces.IBottomTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rPC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587200rPC {
    public static int LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static final C1587200rPC LIZ = new C1587200rPC();
    public static String LIZIZ = "";
    public static String LJFF = "";

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    public static void LIZ(final C19EG c19eg, Bundle bundle) {
        IBottomTabLayoutAbility iBottomTabLayoutAbilityLJIIIZ;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = bundle.getString("enter_method", "");
        final C259800zU c259800zU2 = new C259800zU();
        ?? string = bundle.getString("last_from_tab_tag", "");
        c259800zU2.element = string;
        if (string.length() == 0) {
            c259800zU2.element = LIZIZ;
        }
        CharSequence charSequence = (CharSequence) c259800zU.element;
        if (charSequence != null && charSequence.length() != 0 && !Intrinsics.LJFF(c259800zU.element, "duplicated")) {
            final String strLJIIJ = LJFF;
            if (strLJIIJ.length() == 0) {
                C1400330mXn c1400330mXn = C1400330mXn.LIZ;
                String str = LIZIZ;
                c1400330mXn.getClass();
                strLJIIJ = C1400330mXn.LJIIJ(c19eg, str, null);
            }
            LJFF = "";
            T t = c259800zU.element;
            if (Intrinsics.LJFF(t, "click_top")) {
                c259800zU.element = "click_top_icon";
            } else if (Intrinsics.LJFF(t, "click_bottom")) {
                c259800zU.element = "click_button_icon";
                C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
                if (c19egLIZIZ != null && (iBottomTabLayoutAbilityLJIIIZ = C1583510rJF.LJIIIZ(C1558360qeg.LJI(c19egLIZIZ, null))) != null) {
                    iBottomTabLayoutAbilityLJIIIZ.MB2();
                }
            }
            C15O7.LIZJ(new Callable() { // from class: X.0rPA
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instruction units count: 648
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1587180rPA.call():java.lang.Object");
                }
            });
        }
    }
}
