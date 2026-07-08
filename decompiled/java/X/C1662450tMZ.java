package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.CustomPermissionPopUpForNonFirstTimeAuth;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AwS109S1000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1662450tMZ extends C1662440tMY {
    public final Keva LLLLLJLJLL;
    public boolean LLLLLL;
    public final boolean LLLLLLIL;

    public boolean LLLLLZ() {
        return this.LLLLLLIL;
    }

    @Override // X.C1662440tMY, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // X.C1662440tMY
    public final void LLLLLLZZ(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        C19EG c19eg;
        String str;
        super.LLLLLLZZ(bool, bool2, bool3, bool4);
        if (bool2 != null && bool2.booleanValue() && LLLLLZ() && !Intrinsics.LJFF(this.LLLLLIL, Boolean.TRUE)) {
            if (CustomPermissionPopUpForNonFirstTimeAuth.isEnabled() && this.LLLLLL && this.LLLLLJLJLL.getBoolean("simplify_permission_denied_permanent_non_first", false)) {
                Activity activity = this.mActivity;
                if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
                    this.LLLLLL = false;
                    boolean zLIZLLL = C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO");
                    if (!C533930Kwp.LIZLLL("android.permission.CAMERA")) {
                        if (!zLIZLLL) {
                            str = "camera,microphone";
                        } else {
                            str = "camera";
                        }
                    } else {
                        str = "microphone";
                    }
                    C540290LGx c540290LGx = C540290LGx.LIZ;
                    AwS109S1000000_25 awS109S1000000_25 = new AwS109S1000000_25(str, 1);
                    AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 331);
                    AwS109S1000000_25 awS109S1000000_252 = new AwS109S1000000_25(str, 2);
                    c540290LGx.getClass();
                    this.LLLLL = C540290LGx.LJIIIZ(c19eg, awS109S1000000_25, awS569S0100000_25, awS109S1000000_252);
                    C562660M4y.LIZ.getClass();
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("type", str);
                    C20684815ws.LJIILLIIL("go_to_settings_show", c0lab.LIZ);
                }
            }
            this.LLLLLJLJLL.storeBoolean("simplify_permission_denied_permanent_non_first", true);
        }
    }

    public C1662450tMZ(C1664690tQB<C1662500tMe> c1664690tQB, C1662570tMl c1662570tMl, C385670FAf<Boolean> c385670FAf, C385670FAf<Boolean> c385670FAf2, ShortVideoContext shortVideoContext) {
        super(c1664690tQB, c1662570tMl, c385670FAf, c385670FAf2, shortVideoContext);
        this.LLLLLJLJLL = Keva.getRepo("simplify_permission_denied_permanent_repo");
        this.LLLLLL = true;
        this.LLLLLLIL = true;
    }
}
