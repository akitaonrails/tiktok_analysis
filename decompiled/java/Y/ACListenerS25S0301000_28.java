package Y;

import X.AbstractC1896090zRP;
import X.C01GW;
import X.C1619720sFe;
import X.C1888870zFl;
import X.C1888880zFm;
import X.C1894700zPA;
import X.C1898010zUV;
import X.C2178808gE;
import X.InterfaceC1888890zFn;
import X.InterfaceC1897260zTI;
import android.view.View;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.touchpoint.api.model.IncentiveCommon;
import com.bytedance.touchpoint.api.model.InviteCodeResponse;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes29.dex */
public class ACListenerS25S0301000_28 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onClick$0(ACListenerS25S0301000_28 aCListenerS25S0301000_28, View view) {
        String str;
        String str2;
        InviteCodeResponse.InviteResultPopup inviteResultPopup;
        TuxSheet tuxSheet = C1898010zUV.LIZIZ;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
        Function2 function2 = (Function2) aCListenerS25S0301000_28.l0;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(aCListenerS25S0301000_28.i3), (InviteCodeResponse.Button) aCListenerS25S0301000_28.l1);
        }
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InviteCodeResponse inviteCodeResponse = (InviteCodeResponse) aCListenerS25S0301000_28.l2;
            linkedHashMap.put("button_name", "ok");
            InviteCodeResponse.Data data = inviteCodeResponse.data;
            String strLJIJJ = null;
            if (data != null && (inviteResultPopup = data.inviteResultPopup) != null) {
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

    public static final void onClick$1(ACListenerS25S0301000_28 aCListenerS25S0301000_28, View view) {
        C1888870zFl c1888870zFl = (C1888870zFl) aCListenerS25S0301000_28.l0;
        int i = c1888870zFl.LLILLJJLI;
        if (i >= c1888870zFl.LLILLL) {
            if (!((C1888880zFm) aCListenerS25S0301000_28.l1).LLILZ.isChecked()) {
                InterfaceC1888890zFn interfaceC1888890zFn = ((C1888870zFl) aCListenerS25S0301000_28.l0).LLJ;
                if (interfaceC1888890zFn != null) {
                    interfaceC1888890zFn.LIZ((LocationObject) ListProtector.get((List) aCListenerS25S0301000_28.l2, aCListenerS25S0301000_28.i3));
                }
                C1888870zFl c1888870zFl2 = (C1888870zFl) aCListenerS25S0301000_28.l0;
                c1888870zFl2.LLIZ = aCListenerS25S0301000_28.i3;
                c1888870zFl2.notifyDataSetChanged();
                return;
            }
            return;
        }
        InterfaceC1888890zFn interfaceC1888890zFn2 = c1888870zFl.LLJ;
        if (interfaceC1888890zFn2 == null) {
            return;
        }
        interfaceC1888890zFn2.LIZIZ(i, (LocationObject) ListProtector.get((List) aCListenerS25S0301000_28.l2, aCListenerS25S0301000_28.i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS25S0301000_28(Object obj, C1888870zFl c1888870zFl, C1888880zFm c1888880zFm, List<LocationObject> list, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = c1888870zFl;
        this.l2 = c1888880zFm;
        this.i3 = list;
    }
}
