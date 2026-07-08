package Y;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C0OBG;
import X.C0SCM;
import X.C118300cf;
import X.C1619720sFe;
import X.C1894700zPA;
import X.C1898010zUV;
import X.C1911800zqk;
import X.C1911810zql;
import X.C19323710ip;
import X.C20684815ws;
import X.C2178808gE;
import X.C2344009Gk;
import X.InterfaceC1897260zTI;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.IncentiveCommon;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.model.OrientationInfo;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS52S0201000_28 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS52S0201000_28 aCListenerS52S0201000_28, View view) {
        String str;
        String str2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup;
        Object obj;
        InviteCodeResponse.InviteResultPopup inviteResultPopup2;
        List<InviteCodeResponse.Button> list;
        TuxSheet tuxSheet = C1898010zUV.LIZIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        Function2 function2 = (Function2) aCListenerS52S0201000_28.l0;
        String strLJIJJ = null;
        if (function2 != null) {
            Integer numValueOf = Integer.valueOf(aCListenerS52S0201000_28.i2);
            InviteCodeResponse.Data data = ((InviteCodeResponse) aCListenerS52S0201000_28.l1).data;
            if (data != null && (inviteResultPopup2 = data.inviteResultPopup) != null && (list = inviteResultPopup2.buttons) != null) {
                obj = ListProtector.get(list, 0);
            } else {
                obj = null;
            }
            function2.invoke(numValueOf, obj);
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InviteCodeResponse inviteCodeResponse = (InviteCodeResponse) aCListenerS52S0201000_28.l1;
            linkedHashMap.put("button_name", "ok");
            InviteCodeResponse.Data data2 = inviteCodeResponse.data;
            if (data2 != null && (inviteResultPopup = data2.inviteResultPopup) != null) {
                str = inviteResultPopup.popupType;
            } else {
                str = null;
            }
            linkedHashMap.put("pop_name", str);
            linkedHashMap.put("position", "now tab");
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            IncentiveCommon incentiveCommon = (IncentiveCommon) C2178808gE.LIZ().LJ(23);
            if (incentiveCommon != null) {
                str2 = incentiveCommon.notificationName;
            } else {
                str2 = null;
            }
            linkedHashMap.put("activity_name", str2);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            }
            linkedHashMap.put("region", strLJIJJ);
            interfaceC1897260zTILIZIZ.LIZ("referral_dialog_pop_click", linkedHashMap);
        }
    }

    public static final void onClick$1(ACListenerS52S0201000_28 aCListenerS52S0201000_28, View view) {
        ((C19323710ip) aCListenerS52S0201000_28.l0).LLILZ.of(aCListenerS52S0201000_28.i2, (OrientationInfo) aCListenerS52S0201000_28.l1);
    }

    public static final void onClick$2(ACListenerS52S0201000_28 aCListenerS52S0201000_28, View view) {
        ((C19323710ip) aCListenerS52S0201000_28.l0).LLILZ.of(aCListenerS52S0201000_28.i2, (OrientationInfo) aCListenerS52S0201000_28.l1);
    }

    public static final void onClick$3(ACListenerS52S0201000_28 aCListenerS52S0201000_28, View view) {
        ((C19323710ip) aCListenerS52S0201000_28.l0).LLILZ.of(aCListenerS52S0201000_28.i2, (OrientationInfo) aCListenerS52S0201000_28.l1);
    }

    public static final void onClick$4(ACListenerS52S0201000_28 aCListenerS52S0201000_28, View view) {
        C1911810zql c1911810zql = (C1911810zql) aCListenerS52S0201000_28.l0;
        C1911800zqk c1911800zqk = (C1911800zqk) ListProtector.get((List) aCListenerS52S0201000_28.l1, aCListenerS52S0201000_28.i2);
        c1911810zql.notifyDataSetChanged();
        c1911810zql.LL.LIZ(c1911800zqk);
    }

    public static final void onClick$5(ACListenerS52S0201000_28 aCListenerS52S0201000_28, View view) {
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        CreatorToolsActivity creatorToolsActivity = (CreatorToolsActivity) aCListenerS52S0201000_28.l0;
        int i = aCListenerS52S0201000_28.i2;
        int i2 = ((C118300cf) aCListenerS52S0201000_28.l1).element;
        C0SCM c0scm = creatorToolsActivity.LLL;
        if (c0scm != null) {
            c0scm.open();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "creator_tools");
        c2344009Gk.LIZJ(0, "promote_status");
        c2344009Gk.LIZJ(i, "user_account_type");
        c2344009Gk.LIZJ(i2, "promote_version");
        c2344009Gk.LJIIIIZZ("enter_from", "creator_tools");
        C20684815ws.LJIILLIIL("Promote_entrance_click", c2344009Gk.LIZ);
    }

    public ACListenerS52S0201000_28(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
