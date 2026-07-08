package Y;

import X.C15FV;
import X.C15FX;
import X.C1C7U;
import X.C20323314ff;
import X.C20488615Fc;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C975320bUI;
import X.C978500bZQ;
import X.EnumC20488515Fb;
import X.EnumC799870VZh;
import X.InterfaceC973730bRj;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.abmock.SettingsManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS26S0100100_31 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        LinearLayout linearLayout = ((C15FX) this.l0).LLJJ;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            C15FX c15fx = (C15FX) this.l0;
            InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
            c15fx.LJIILJJIL((interfaceC973730bRjYf2 == null || !interfaceC973730bRjYf2.LIZ()) ? "normal" : "cut_short");
            LinearLayout linearLayout2 = ((C15FX) this.l0).LLJJ;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
            FrameLayout frameLayout = ((C15FX) this.l0).LLJJIJIIJIL;
            if (frameLayout != null) {
                C786410Ut5.LJZ(8, frameLayout);
            }
            JSONObject jSONObject = C975320bUI.LIZ;
            C15FX c15fx2 = (C15FX) this.l0;
            boolean z = c15fx2.LLJL;
            long j = this.j1 - 3;
            C15FV c15fv = c15fx2.LLJJJJLIIL;
            if (c15fv == null) {
                c15fv = null;
            }
            String str = c15fv.LLJJJIL;
            JSONObject jSONObject2 = new JSONObject();
            C975320bUI.LJIIJJI(str, j, jSONObject2);
            if (z) {
                C975320bUI.LJIILL("task_over", jSONObject2);
            } else {
                C975320bUI.LJIILLIIL("task_over", jSONObject2);
            }
            C20488615Fc.LIZ(EnumC20488515Fb.PROGRESS_RESULT, 0L, ((C15FX) this.l0).LLJL);
        }
        C978500bZQ.LIZIZ("match_in_progress");
    }

    public static final void run$0(ARunnableS26S0100100_31 aRunnableS26S0100100_31) {
        boolean zLIZ;
        C1C7U.LIZ("MatchBonusTaskContainer@a606.updateCurrentPeriod$4");
        try {
            aRunnableS26S0100100_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchBonusTaskContainer@a606.updateCurrentPeriod$4");
    }

    public static final void run$1(ARunnableS26S0100100_31 aRunnableS26S0100100_31) {
        C20323314ff c20323314ff = (C20323314ff) aRunnableS26S0100100_31.l0;
        long j = aRunnableS26S0100100_31.j1;
        c20323314ff.getClass();
        C1C7U.LIZ("JsBridge2InitTask@8841.init$2$onChanged$1L");
        SettingsManager.LIZLLL().getClass();
        boolean z = true;
        boolean zLIZ = SettingsManager.LIZ("use_bridge_engine_v2", true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("workType == WorkType.BOOT_FINISH: ");
        if (c20323314ff.LLILLJJLI.LL != EnumC799870VZh.BOOT_FINISH) {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append("\nenablePermissionCheck: ");
        sbLIZ.append(zLIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLIZ) {
            c20323314ff.LLILLJJLI.LIZ(j);
        }
        C1C7U.LIZIZ("JsBridge2InitTask@8841.init$2$onChanged$1L");
    }

    public ARunnableS26S0100100_31(Object obj, long j, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
