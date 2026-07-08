package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShareToEditAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShootAssem;
import com.ss.android.ugc.aweme.template.assem.TemplateDescAssem;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0P4E, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4E extends C19IN {
    public final int $t;
    public Object l0;

    @Override // X.C19IN
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P4E(Object obj, int i) {
        super(500, true);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C0P4E c0p4e, View view) {
        try {
            if (!C0XQ7.LJFF().isLogin()) {
                C0XPD.LIZJ(C724240Sb0.LJI((MusicShareToEditAssem) c0p4e.l0), "single_song", "click_add_to_story", new C627150Oin().LIZ, new C639000P4o((MusicShareToEditAssem) c0p4e.l0, 0));
            } else {
                MusicShareToEditAssem.sp((MusicShareToEditAssem) c0p4e.l0);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZ$1(C0P4E c0p4e, View view) {
        ShootAbility shootAbility;
        Fragment fragmentLJI = C724240Sb0.LJI((MusicShootAssem) c0p4e.l0);
        if (fragmentLJI != null && (shootAbility = (ShootAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), ShootAbility.class, null)) != null) {
            shootAbility.lP0();
        }
    }

    public static final void LIZ$2(C0P4E c0p4e, View view) {
        Fragment fragmentLJI = C724240Sb0.LJI((TemplateDescAssem) c0p4e.l0);
        if (fragmentLJI != null) {
            ((TemplateDescAssem) c0p4e.l0).sp().vQ2(fragmentLJI);
        }
        C11FU c11fu = ((TemplateDescAssem) c0p4e.l0).LLJJJJLIIL;
        if (c11fu != null) {
            c11fu.LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0P4E(TemplateDescAssem templateDescAssem, int i) {
        super(0, 3);
        this.$t = i;
        this.l0 = templateDescAssem;
    }
}
