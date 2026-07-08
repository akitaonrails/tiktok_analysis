package Y;

import X.AnonymousClass1668;
import X.C0I0B;
import X.C191862104e;
import X.C191871104n;
import X.C197039127h;
import X.C19EG;
import X.C1B15;
import X.C20684815ws;
import X.C828330WeV;
import X.EnumC1672106gh;
import X.InterfaceC828360WeY;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.reminduser.impl.RemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.reminduser.impl.RemindUsersViewHelper;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public class ACListenerS66S1200000_34 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS66S1200000_34 aCListenerS66S1200000_34, View view) {
        Lifecycle lifecycle;
        RemindUsersViewHelper remindUsersViewHelper = RemindUsersViewHelper.LIZIZ;
        Lifecycle lifecycle2 = ((C19EG) aCListenerS66S1200000_34.l1).getLifecycle();
        remindUsersViewHelper.getClass();
        C191862104e c191862104eLJ = C191871104n.LJ();
        C1B15 c1b15 = RemindUsersViewHelper.LJII;
        c191862104eLJ.getClass();
        C191862104e.LIZJ(c1b15);
        WeakReference<Lifecycle> weakReference = RemindUsersViewHelper.LJI;
        if (weakReference != null) {
            lifecycle = weakReference.get();
        } else {
            lifecycle = null;
        }
        if (!Intrinsics.LJFF(lifecycle, lifecycle2)) {
            if (RemindUsersViewHelper.LJI != null) {
                RemindUsersViewHelper.LJFF();
            }
            RemindUsersViewHelper.LJI = new WeakReference<>(lifecycle2);
            lifecycle2.addObserver(RemindUsersViewHelper.LJIIIIZZ);
        }
        SmartRouter.buildRoute((Context) aCListenerS66S1200000_34.l2, "aweme://privacy/setting/page?page_tag=direct_message_permission&show_top_hint=false&show_section_bottom_hint=true&enter_from=permission_setting_toast").open();
        RemindUsersAnalytics remindUsersAnalytics = RemindUsersAnalytics.LIZIZ;
        C0I0B c0i0b = C0I0B.LJFF;
        remindUsersAnalytics.LJIIIIZZ(false, c0i0b.LIZIZ());
        remindUsersAnalytics.LJII(aCListenerS66S1200000_34.s0, EnumC1672106gh.DM_SETTINGS_POPUP, c0i0b.LIZIZ());
    }

    public static final void onClick$1(ACListenerS66S1200000_34 aCListenerS66S1200000_34, View view) {
        new C828330WeV(new ThirdPartyBizCert(402685963)).LIZIZ(((C197039127h) aCListenerS66S1200000_34.l1).getContext(), aCListenerS66S1200000_34.s0, new InterfaceC828360WeY() { // from class: X.1B3o
            @Override // X.InterfaceC828360WeY
            public final void LIZ(Context context, String str) {
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.url = str;
                sparkThirdContext.bizCert = new ThirdPartyBizCert(402685963);
                C1554300qY8.LIZIZ(context, sparkThirdContext);
            }
        }, null);
        C20684815ws.LJIILLIIL("tt_amber_alert_more_details_click", ((AnonymousClass1668) aCListenerS66S1200000_34.l2).e0().LIZ);
    }

    public ACListenerS66S1200000_34(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj;
        this.s0 = str;
    }
}
