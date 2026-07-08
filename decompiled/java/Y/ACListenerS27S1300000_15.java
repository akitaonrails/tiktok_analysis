package Y;

import X.C01FQ;
import X.C01GW;
import X.C01N8;
import X.C1161920gLG;
import X.C13LP;
import X.C15438062q;
import X.C16FS;
import X.C766270U4b;
import X.C915850ZwN;
import X.C915980Zwa;
import X.C919870a2r;
import X.C920280a3W;
import X.C928700aH6;
import X.C931840aMA;
import X.C944440agU;
import X.C949960apO;
import X.C958830b3h;
import X.C960270b61;
import X.EnumC920250a3T;
import X.InterfaceC302601Fg;
import android.view.View;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.QuickCohostContent;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS27S1300000_15 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public static final void onClick$0(ACListenerS27S1300000_15 aCListenerS27S1300000_15, View view) {
        List list;
        ?? LIZ;
        String str;
        String str2;
        IDebugService iDebugService = (IDebugService) C1161920gLG.LIZJ(IDebugService.class);
        if (iDebugService != null) {
            iDebugService.aq();
        }
        Function0 function0 = (Function0) aCListenerS27S1300000_15.l1;
        if (function0 != null) {
            list = (List) function0.invoke();
            if (list != null) {
                C960270b61.LIZIZ("click_random_linkmic_button", list);
            }
        } else {
            list = null;
        }
        Map<String, String> mapLLLFZ = C915980Zwa.LJI().LIZ().LLLFZ();
        Boolean bool = (Boolean) aCListenerS27S1300000_15.l2;
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str2 = "big_card";
            } else {
                str2 = "small_card";
            }
            mapLLLFZ.put("card_style", str2);
        }
        String str3 = aCListenerS27S1300000_15.s0;
        if (str3 != null) {
            mapLLLFZ.put("detailed_card_tag_style", str3);
        }
        if (list != null) {
            LIZ = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                LIZ.add(Long.valueOf(((QuickCohostContent) it2.next()).contentId));
            }
        } else {
            LIZ = C960270b61.LIZ();
        }
        if (!LIZ.isEmpty()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        mapLLLFZ.put("is_tag", str);
        mapLLLFZ.put("interest_tag", C13LP.LJJLIIIJ(LIZ, null, null, null, 0, null, AFwS250S0000000_15.get$arr$(19), 31));
        C01GW<C958830b3h> c01gw = C958830b3h.LJII;
        C944440agU.LIZ().LJIJJLI("auto_match_click");
        C949960apO.LIZIZ(((C16FS) aCListenerS27S1300000_15.l3).getContext(), ViewTreeLifecycleOwner.get((C16FS) aCListenerS27S1300000_15.l3));
    }

    public static final void onClick$1(ACListenerS27S1300000_15 aCListenerS27S1300000_15, View view) {
        InterfaceC302601Fg interfaceC302601FgLIZ;
        long id;
        if (((EnumC920250a3T) aCListenerS27S1300000_15.l1) == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            User user = (User) aCListenerS27S1300000_15.l2;
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            C915850ZwN.LJIIJJI(24, id, "click", null, false);
        }
        C919870a2r.LIZLLL(C928700aH6.LIZ(((C931840aMA) aCListenerS27S1300000_15.l3).U5()), String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "", "click", "anchor", "anchor_connection_panel");
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow() && (interfaceC302601FgLIZ = C01FQ.LIZ()) != null && interfaceC302601FgLIZ.LJIJI()) {
            C01N8.LIZ(0, "zoom", C920280a3W.LIZIZ((EnumC920250a3T) aCListenerS27S1300000_15.l1), 0L, "guest", "live_show", "");
            C766270U4b.LIZLLL(2131843582);
            return;
        }
        C931840aMA c931840aMA = (C931840aMA) aCListenerS27S1300000_15.l3;
        String str = aCListenerS27S1300000_15.s0;
        if (str == null) {
            str = "";
        }
        c931840aMA.w6(str, null, (EnumC920250a3T) aCListenerS27S1300000_15.l1);
    }

    public ACListenerS27S1300000_15(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
    }
}
