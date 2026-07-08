package Y;

import X.C1216270hkv;
import X.C1245020iVI;
import X.C1264840j1G;
import X.C1264860j1I;
import X.C1265420j2C;
import X.C19EG;
import X.InterfaceC1264850j1H;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS11S1201000_19 implements View.OnClickListener {
    public final int $t;
    public int i3;
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

    public static final void onClick$0(ACListenerS11S1201000_19 aCListenerS11S1201000_19, View view) {
        ListLiveCircleItemVM listLiveCircleItemVMLIZ;
        if (!C1264860j1I.LJII((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1) && C1216270hkv.LIZLLL(((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).A5()) && (((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).getFragmentActivity() instanceof C19EG) && (listLiveCircleItemVMLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).x3().LIZ(aCListenerS11S1201000_19.i3, ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).getFragmentActivity())) != null) {
            listLiveCircleItemVMLIZ.xQ2((User) aCListenerS11S1201000_19.l2, C1264860j1I.LIZIZ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1), aCListenerS11S1201000_19.s0, ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).qk(), ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Yg(), ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Lk(), view);
        }
    }

    public static final void onClick$1(ACListenerS11S1201000_19 aCListenerS11S1201000_19, View view) {
        int i;
        String str;
        boolean z;
        String str2;
        User user;
        AwemeUnreadInfo awemeUnreadInfo;
        List<String> list;
        Integer numValueOf;
        User user2;
        User user3;
        User user4;
        String uid;
        ListLiveCircleItemVM listLiveCircleItemVMLIZ;
        if (C1264860j1I.LJII((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1)) {
            return;
        }
        if (C1216270hkv.LIZLLL(((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).A5()) && (((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).getFragmentActivity() instanceof C19EG) && (listLiveCircleItemVMLIZ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).x3().LIZ(aCListenerS11S1201000_19.i3, ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).getFragmentActivity())) != null) {
            listLiveCircleItemVMLIZ.xQ2((User) aCListenerS11S1201000_19.l2, C1264860j1I.LIZIZ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1), aCListenerS11S1201000_19.s0, ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).qk(), ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Yg(), ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Lk(), view);
        }
        if (Intrinsics.LJFF(((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Ye(), "following_relation")) {
            C1264840j1G c1264840j1G = new C1264840j1G();
            C1265420j2C c1265420j2CZ0 = ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Z0();
            if (c1265420j2CZ0 != null) {
                i = c1265420j2CZ0.LLILLL;
            } else {
                i = -1;
            }
            c1264840j1G.LJIILLIIL = i;
            C1265420j2C c1265420j2CZ02 = ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Z0();
            MatchedFriendStruct matchedFriendStruct = null;
            if (c1265420j2CZ02 != null) {
                str = c1265420j2CZ02.LLILZ;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            c1264840j1G.LJIIZILJ = str;
            C1265420j2C c1265420j2CZ03 = ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Z0();
            if (c1265420j2CZ03 != null && (user4 = c1265420j2CZ03.LLILLJJLI) != null && (uid = user4.getUid()) != null) {
                str3 = uid;
            }
            c1264840j1G.LJIJ = str3;
            C1265420j2C c1265420j2CZ04 = ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Z0();
            if (c1265420j2CZ04 != null && (user3 = c1265420j2CZ04.LLILLJJLI) != null) {
                matchedFriendStruct = user3.getMatchedFriendStruct();
            }
            int iIntValue = 0;
            if (matchedFriendStruct != null) {
                z = true;
            } else {
                z = false;
            }
            String str4 = "1";
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c1264840j1G.LJIJI = str2;
            c1264840j1G.LJIJJLI = "click_live_head";
            C1265420j2C c1265420j2CZ05 = ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Z0();
            if (c1265420j2CZ05 == null || (user2 = c1265420j2CZ05.LLILLJJLI) == null || !C1245020iVI.LIZIZ(user2)) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c1264840j1G.LJIJJ = str4;
            C1265420j2C c1265420j2CZ06 = ((InterfaceC1264850j1H) aCListenerS11S1201000_19.l1).Z0();
            if (c1265420j2CZ06 != null && (user = c1265420j2CZ06.LLILLJJLI) != null && (awemeUnreadInfo = user.getAwemeUnreadInfo()) != null && (list = awemeUnreadInfo.unreadIdList) != null && (numValueOf = Integer.valueOf(list.size())) != null) {
                iIntValue = numValueOf.intValue();
            }
            c1264840j1G.LJIL = String.valueOf(iIntValue);
            c1264840j1G.LJIILJJIL();
        }
    }

    public ACListenerS11S1201000_19(InterfaceC1264850j1H interfaceC1264850j1H, int i, User user, String str, int i2) {
        this.$t = i2;
        this.l1 = interfaceC1264850j1H;
        this.i3 = i;
        this.l2 = user;
        this.s0 = str;
    }
}
