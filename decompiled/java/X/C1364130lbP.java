package X;

import Y.ACListenerS124S0200000_21;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.HashMap;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364130lbP extends RecyclerView.ViewHolder implements InterfaceC1363770lap {
    public static final /* synthetic */ int LLJIJIL = 0;
    public SharePanelViewModel LL;
    public final InterfaceC1362600lYw LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public int LLJ;
    public C1365460ldY LLJI;

    static {
        new C1363600laY();
    }

    @Override // X.InterfaceC1363770lap
    public final void onDetachedFromWindow() {
    }

    @Override // X.InterfaceC1363770lap
    public final void onAttachedToWindow() {
        String strLIZJ;
        IMUser iMUser;
        HashMap<String, String> map = new HashMap<>();
        C1365460ldY c1365460ldY = this.LLJI;
        String batchGroupType = null;
        if ((c1365460ldY instanceof C1365460ldY) && c1365460ldY != null) {
            batchGroupType = c1365460ldY.getBatchGroupType();
        }
        map.put("to_user_id", TextUtils.equals("top_supporters", batchGroupType) ? "top_supporters" : "latest");
        map.put("rank_index", String.valueOf(this.LLJ));
        map.put("icon_type", "search_icon");
        C1365460ldY c1365460ldY2 = this.LLJI;
        Object objValueOf = "";
        if (c1365460ldY2 instanceof IMUser) {
            C1364620lcC.LIZ.getClass();
            strLIZJ = C1364620lcC.LIZJ(c1365460ldY2, "");
        } else {
            strLIZJ = "";
        }
        map.put("share_relation_type", strLIZJ);
        map.put("panel_source", "long_press");
        BaseContact baseContact = this.LLJI;
        if ((baseContact instanceof IMUser) && (iMUser = (IMUser) baseContact) != null) {
            objValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        map.put("share_follow_status", objValueOf.toString());
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILLJJLI;
        if (interfaceC1362600lYw != null) {
            interfaceC1362600lYw.LIZLLL(map);
        }
    }

    public C1364130lbP(View view, SharePanelViewModel sharePanelViewModel, InterfaceC1362600lYw interfaceC1362600lYw) {
        super(view);
        this.LL = sharePanelViewModel;
        this.LLILLJJLI = interfaceC1362600lYw;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LLILLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1557));
        this.LLILZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1560));
        this.LLILZIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1558));
        this.LLILZLL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1559));
        this.LLIZ = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1556));
        this.LLIZLLLIL = C452501pT.LIZ(enumC452301pR, new AwS565S0100000_21(view, 1555));
        this.LLJ = -1;
    }

    public final void I5(C1365460ldY c1365460ldY, SharePanelViewModel sharePanelViewModel, int i) {
        String curUserId;
        Bundle bundle;
        this.LLJ = i;
        this.LLJI = c1365460ldY;
        this.LL = sharePanelViewModel;
        if (c1365460ldY.getBatchContacts().isEmpty()) {
            C786410Ut5.LJLLLLLL(8, (View) this.LLIZLLLIL.getValue());
        } else if (c1365460ldY.getBatchContacts().size() == 1) {
            C0I98.LJFF((C1322110kVd) this.LLILLL.getValue(), ((BaseContact) ListProtector.get(c1365460ldY.getBatchContacts(), 0)).getDisplayAvatar(), "LongPressShareBatchViewHolder", null, null, 0, 0, true, null, false);
            C786410Ut5.j((C422820Gi0) this.LLILLL.getValue(), 0);
            C786410Ut5.LJLLLLLL(0, (View) this.LLIZLLLIL.getValue());
            C786410Ut5.j((C422820Gi0) this.LLILZIL.getValue(), 8);
            C786410Ut5.j((C422820Gi0) this.LLILZLL.getValue(), 8);
            C786410Ut5.LJLLLLLL(8, (View) this.LLIZ.getValue());
        } else {
            C0I98.LJFF((C1322110kVd) this.LLILZIL.getValue(), ((BaseContact) ListProtector.get(c1365460ldY.getBatchContacts(), 0)).getDisplayAvatar(), "LongPressShareBatchViewHolder:0", null, null, 0, 0, true, null, false);
            C0I98.LJFF((C1322110kVd) this.LLILZLL.getValue(), ((BaseContact) ListProtector.get(c1365460ldY.getBatchContacts(), 1)).getDisplayAvatar(), "LongPressShareBatchViewHolder:1", null, null, 0, 0, true, null, false);
            C786410Ut5.j((C422820Gi0) this.LLILLL.getValue(), 8);
            C786410Ut5.LJLLLLLL(0, (View) this.LLIZLLLIL.getValue());
            C786410Ut5.j((C422820Gi0) this.LLILZIL.getValue(), 0);
            C786410Ut5.j((C422820Gi0) this.LLILZLL.getValue(), 0);
            C786410Ut5.LJLLLLLL(0, (View) this.LLIZ.getValue());
        }
        ((TextView) this.LLILZ.getValue()).setText(c1365460ldY.getDisplayName());
        C786410Ut5.I7(new ACListenerS124S0200000_21(c1365460ldY, this, 88), this.itemView);
        SharePanelViewModel sharePanelViewModel2 = this.LL;
        SharePackage sharePackage = sharePanelViewModel2.LL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            bundle.putInt("rank_num", sharePanelViewModel2.LJIIJJI().indexOf(this.LLJI));
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        SharePackage sharePackage2 = this.LL.LL;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF == null || (curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId()) == null) {
            curUserId = "";
        }
        C1364620lcC.LJIILIIL(c1365460ldY, bindingAdapterPosition, "column", sharePackage2, true, curUserId, C0I0B.LJFF.LIZIZ(), null);
    }
}
