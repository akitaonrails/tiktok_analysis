package Y;

import X.AbstractC1387200mCc;
import X.C06W7;
import X.C098200Yq;
import X.C1388190mED;
import X.C1389890mGx;
import X.C13LP;
import X.C189200o6;
import X.C1906580ziK;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2344009Gk;
import X.C793770VBv;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS0S1000000_2 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C19EG c19eg;
        List<Fragment> listLJJLIIIJL;
        Object c098200Yq;
        View view;
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof C19EG) || (c19eg = (C19EG) topActivity) == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        if (supportFragmentManager == null || (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) == null) {
            String str = this.s0;
            C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
            return;
        }
        String str2 = this.s0;
        try {
            Fragment fragment = (Fragment) C13LP.LJJJLZIJ(listLJJLIIIJL.size() - 1, listLJJLIIIJL);
            if (fragment == null || (view = fragment.getView()) == null || view.getRootView() == null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
                c1389890mGx2.LJIIJ(str2);
                c1389890mGx2.LJIIJJI();
            } else {
                C1389890mGx c1389890mGx3 = new C1389890mGx(fragment);
                c1389890mGx3.LJIIJ(str2);
                c1389890mGx3.LJIIJJI();
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m1boximpl(c098200Yq);
    }

    public static final void run$0(ARunnableS0S1000000_2 aRunnableS0S1000000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ColdBootTaskLogger@5929.reportResetCoreReasonV2$1");
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(aRunnableS0S1000000_2.s0, 1);
            jSONObject.put("metric", jSONObject2);
            C793770VBv.LJFF("cold_boot_reset_core_reason_name_v2", null, jSONObject);
        } finally {
            try {
            } finally {
                if (!zLIZ) {
                }
            }
        }
        C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportResetCoreReasonV2$1");
    }

    public static final void run$1(ARunnableS0S1000000_2 aRunnableS0S1000000_2) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAdShoppingService@64bb.showToast$1");
        try {
            aRunnableS0S1000000_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAdShoppingService@64bb.showToast$1");
    }

    public static final void run$2(ARunnableS0S1000000_2 aRunnableS0S1000000_2) {
        boolean zLIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        C1C7U.LIZ("IMErrorUtils@8723.toast$1");
        try {
            AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
            if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && C06W7.LIZIZ(activityLIZ)) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(aRunnableS0S1000000_2.s0);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMErrorUtils@8723.toast$1");
    }

    public static final void run$3(ARunnableS0S1000000_2 aRunnableS0S1000000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ComponentCommonMobHelper@d0db.mobClickInternal$2");
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("component_key", aRunnableS0S1000000_2.s0);
            C20684815ws.LJIILLIIL("fcp_component_status_improperly", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComponentCommonMobHelper@d0db.mobClickInternal$2");
    }

    public ARunnableS0S1000000_2(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
