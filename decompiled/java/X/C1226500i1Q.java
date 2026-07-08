package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.fangroup.model.GroupInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0i1Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226500i1Q extends C1225970i0Z {
    public final EnumC1226540i1U LLILLL;
    public final AbstractC1225770i0F LLILZ;
    public final C1225530hzr LLILZIL;
    public final C1226460i1M LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public boolean LLJ;
    public final Map<String, String> LLJI;

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final View LJ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ.LJJJJLL().LIZIZ()), R.layout.de3, null, false);
        C1749280vcc c1749280vcc = (C1749280vcc) viewTd.findViewById(R.id.h3a);
        String string = viewTd.getContext().getString(2131850368);
        AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(viewTd, this, 148);
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.n5;
        Drawable drawableLIZ = c0hti.LIZ(viewTd.getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJI = string;
        c1722300uv6.LJIIIZ = awS368S0200000_2;
        c1749280vcc.setStatus(c1722300uv6);
        return viewTd;
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJJIJIIJIL() throws JSONException {
        List<C1224840hyk> list;
        C1224780hye c1224780hyeLJIILLIIL;
        Map<String, List<C1224840hyk>> map;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R == null || (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) == null || (map = c1224780hyeLJIILLIIL.LIZ) == null || (list = map.get(EnumC1226540i1U.TAB_KEY_LIVE_CREATOR_GROUP.getValue())) == null) {
            list = C13BV.INSTANCE;
        }
        int size = list.size();
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("group_num", size);
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "live_creator_group_count"));
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJFF() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224300hxs
    public final void LJJI() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224180hxg
    public final Object LJJIL(InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1226470i1N(this, null), interfaceC1364105Vn);
    }

    @Override // X.C1225970i0Z, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        String str;
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list != null) {
            C1224840hyk c1224840hyk = (C1224840hyk) C13LP.LJJJLL(list);
            if (c1224840hyk != null) {
                str = c1224840hyk.LLILZ;
            } else {
                str = null;
            }
            this.LLIZLLLIL = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJIZL(X.InterfaceC1364105Vn r32) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226500i1Q.LJJJJIZL(X.05Vn):java.lang.Object");
    }

    public final String LJJJJJ(List<GroupInfo> list) {
        String str = null;
        boolean z = false;
        for (GroupInfo groupInfo : list) {
            if (C123100dR.LIZ(this.LLIZ) && Intrinsics.LJFF(this.LLIZ, groupInfo.conversationId) && groupInfo.groupStatus != 5) {
                return groupInfo.conversationId;
            }
            if (groupInfo.groupStatus != 5 && !z) {
                str = groupInfo.conversationId;
                z = true;
            }
        }
        if (C123100dR.LIZ(this.LLIZLLLIL)) {
            return this.LLIZLLLIL;
        }
        return str;
    }

    @C14EU
    public final void onFanGroupCreateFinish(C1617806Vc c1617806Vc) {
        String conversationId;
        if (c1617806Vc.LIZ) {
            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
            if (interfaceC1226510i1R != null) {
                interfaceC1226510i1R.LJI();
            }
            C0Y8T c0y8t = c1617806Vc.LIZIZ;
            if (c0y8t != null) {
                conversationId = c0y8t.getConversationId();
            } else {
                conversationId = null;
            }
            this.LLIZ = conversationId;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1226490i1P(this, null), 3);
        }
    }

    @Override // X.C1225970i0Z, X.InterfaceC1223360hwM
    public final void LJJ(FrameLayout frameLayout, String str) {
        int i;
        String str2 = (String) ((LinkedHashMap) this.LLJI).get(str);
        if (C123100dR.LIZ(str2)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, frameLayout);
        if (frameLayout.findViewById(R.id.tv_recall_reason) == null) {
            C786410Ut5.Sd(R.layout.de5, C786410Ut5.ne(frameLayout.getContext()), frameLayout);
        }
        TextView textView = (TextView) frameLayout.findViewById(R.id.tv_recall_reason);
        if (C123100dR.LIZ(str2)) {
            textView.setText((CharSequence) ((LinkedHashMap) this.LLJI).get(str));
            C786410Ut5.LJLLLLLL(0, textView);
        } else {
            textView.setText("");
            C786410Ut5.LJLLLLLL(8, textView);
        }
    }

    public C1226500i1Q(EnumC1226540i1U enumC1226540i1U, AbstractC1225770i0F abstractC1225770i0F, C1225530hzr c1225530hzr) {
        super(c1225530hzr);
        this.LLILLL = enumC1226540i1U;
        this.LLILZ = abstractC1225770i0F;
        this.LLILZIL = c1225530hzr;
        this.LLILZLL = new C1226460i1M(abstractC1225770i0F);
        this.LLJ = true;
        this.LLJI = new LinkedHashMap();
    }
}
