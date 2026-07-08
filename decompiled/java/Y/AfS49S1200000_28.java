package Y;

import X.C09JN;
import X.C10HL;
import X.C1153800g8A;
import X.C1264020izw;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1720106oR;
import X.C1C7U;
import X.C2018507vT;
import X.C20642515q3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C985403tE;
import android.app.Activity;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS111S1200000_28;

/* JADX INFO: loaded from: classes29.dex */
public class AfS49S1200000_28 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS49S1200000_28 afS49S1200000_28, Object obj) {
        String str;
        C1C7U.LIZ("RelationLabelTextView@f9a7.paint$4");
        Throwable th = (Throwable) obj;
        if (((RelationLabelTextView) afS49S1200000_28.l1).LLJJJJJIL != null && (!r0.isDisposed())) {
            ((RelationLabelTextView) afS49S1200000_28.l1).setText(C20642515q3.LJI(2131845714));
        }
        ((RelationLabelTextView) afS49S1200000_28.l1).LLL = th.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception(");
        sbLIZ.append(th);
        sbLIZ.append(") [");
        sbLIZ.append(afS49S1200000_28.s0);
        sbLIZ.append("] [");
        C1153800g8A c1153800g8A = ((C1264020izw) afS49S1200000_28.l2).LIZ;
        if (c1153800g8A != null) {
            str = c1153800g8A.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("] [");
        sbLIZ.append(((RelationLabelTextView) afS49S1200000_28.l1).getViewId());
        sbLIZ.append(']');
        C1720106oR.LIZ("RelationLabel[V]", C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("RelationLabelTextView@f9a7.paint$4");
    }

    public static final void accept$1(AfS49S1200000_28 afS49S1200000_28, Object obj) {
        C1C7U.LIZ("CleanCacheDialog@a56d.show$disposable$2");
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 1) {
                C10HL c10hl = (C10HL) afS49S1200000_28.l1;
                Activity activity = (Activity) afS49S1200000_28.l2;
                String str = afS49S1200000_28.s0;
                c10hl.getClass();
                if (C2018507vT.LIZ().getInt("show_storage_manager_count", 0) < 3 && !activity.isFinishing()) {
                    C2018507vT.LIZ().storeInt("show_storage_manager_count", C2018507vT.LIZ().getInt("show_storage_manager_count", 0) + 1);
                    C1397580mTM c1397580mTM = new C1397580mTM(activity);
                    c1397580mTM.LJFF(2131837037);
                    c1397580mTM.LIZ(2131834889);
                    C985403tE.LIZ(c1397580mTM, new AwS111S1200000_28(activity, c10hl, str, 14));
                    c1397580mTM.LJII = false;
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("toast_type", "clean_app");
                    C20684815ws.LJIILLIIL("storage_toast_show", c2344009Gk.LIZ);
                    C10HL.LIZ(c10hl, null, str, "app_storage", 1);
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from", str);
                    c2344009Gk2.LJIIIIZZ("type", "app_storage");
                    C20684815ws.LJIILLIIL("clean_storage_toast", c2344009Gk2.LIZ);
                }
            } else if (num.intValue() == 2) {
                C10HL c10hl2 = (C10HL) afS49S1200000_28.l1;
                Activity activity2 = (Activity) afS49S1200000_28.l2;
                String str2 = afS49S1200000_28.s0;
                c10hl2.getClass();
                if (C2018507vT.LIZ().getInt("show_system_clean_count", 0) < 3 && !activity2.isFinishing()) {
                    C2018507vT.LIZ().storeInt("show_system_clean_count", C2018507vT.LIZ().getInt("show_system_clean_count", 0) + 1);
                    C1397580mTM c1397580mTM2 = new C1397580mTM(activity2);
                    c1397580mTM2.LJI(activity2.getString(2131837037));
                    c1397580mTM2.LIZ(2131834890);
                    C985403tE.LIZ(c1397580mTM2, AFwS271S0000000_28.get$arr$(440));
                    c1397580mTM2.LJII = false;
                    new C1397510mTF(c1397580mTM2).LIZLLL();
                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                    c2344009Gk3.LJIIIIZZ("toast_type", "clean_system");
                    C20684815ws.LJIILLIIL("storage_toast_show", c2344009Gk3.LIZ);
                    C10HL.LIZ(c10hl2, null, str2, "phone_storage", 1);
                    C2344009Gk c2344009Gk4 = new C2344009Gk();
                    c2344009Gk4.LJIIIIZZ("enter_from", str2);
                    c2344009Gk4.LJIIIIZZ("type", "phone_storage");
                    C20684815ws.LJIILLIIL("clean_storage_toast", c2344009Gk4.LIZ);
                }
            }
        }
        C1C7U.LIZIZ("CleanCacheDialog@a56d.show$disposable$2");
    }

    public AfS49S1200000_28(Activity activity, C10HL c10hl, int i) {
        this.$t = i;
        this.l1 = c10hl;
        this.l2 = activity;
        this.s0 = "cold_start";
    }

    public AfS49S1200000_28(RelationLabelTextView relationLabelTextView, String str, C1264020izw c1264020izw, int i) {
        this.$t = i;
        this.l1 = relationLabelTextView;
        this.s0 = str;
        this.l2 = c1264020izw;
    }
}
