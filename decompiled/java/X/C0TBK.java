package X;

import Y.AfS148S0200000_12;
import Y.AfS181S0100000_12;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFixApplyAnimationSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TBK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TBK implements InterfaceC922160a6Y {
    public final C0TBL LIZ;
    public C11JF LJFF;
    public final List<User> LIZLLL = new LinkedList();
    public final Map<User, InterfaceC420801kM> LJ = new HashMap();
    public final int LIZIZ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    public final int LIZJ = 60;

    @Override // X.InterfaceC922160a6Y
    public final void LIZIZ() {
        ((LinkedList) this.LIZLLL).clear();
    }

    public final User LJFF() {
        User user = null;
        if (!this.LIZLLL.isEmpty()) {
            if (MultiGuestFixApplyAnimationSetting.INSTANCE.enable()) {
                Iterator<User> it2 = this.LIZLLL.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    User next = it2.next();
                    User user2 = next;
                    HashMap map = (HashMap) this.LJ;
                    ArrayList arrayList = new ArrayList(map.size());
                    Iterator it3 = map.entrySet().iterator();
                    while (it3.hasNext()) {
                        arrayList.add(Long.valueOf(((User) ((Map.Entry) it3.next()).getKey()).getId()));
                    }
                    if (!arrayList.contains(Long.valueOf(user2.getId()))) {
                        user = next;
                        break;
                    }
                }
                user = user;
            } else {
                Iterator<User> it4 = this.LIZLLL.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    User next2 = it4.next();
                    if (!((HashMap) this.LJ).keySet().contains(next2)) {
                        user = next2;
                        break;
                    }
                }
                user = user;
            }
            if (user != null) {
                C1AZW c1azw = C1AZW.LIZ;
                String strLJ = LJ(125);
                String str = "poll: " + user.getId() + ' ' + user.hashCode();
                c1azw.getClass();
                C1AZW.LIZ(strLJ, str, null, null);
                ((LinkedList) this.LIZLLL).remove(user);
            }
        }
        return user;
    }

    public C0TBK(C0TBL c0tbl) {
        this.LIZ = c0tbl;
    }

    public static String LJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_RequestEnhanceFilter_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC922160a6Y
    public final void LIZ(User user) {
        C1AZW c1azw = C1AZW.LIZ;
        String strLJ = LJ(38);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRequest: ");
        sbLIZ.append(user.getId());
        sbLIZ.append(' ');
        sbLIZ.append(user.hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLJ, strLIZIZ, null, null);
        if (((int) user.getFollowInfo().getFollowStatus()) == 2) {
            String strLJ2 = LJ(108);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("offer: ");
            sbLIZ2.append(user.getId());
            sbLIZ2.append(' ');
            sbLIZ2.append(user.hashCode());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c1azw.getClass();
            C1AZW.LIZ(strLJ2, strLIZIZ2, null, null);
            ((LinkedList) this.LIZLLL).add(user);
            if (this.LJFF == null) {
                if (LJFF() != null) {
                    LIZLLL(user);
                }
                this.LJFF = (C11JF) C11NZ.LJJJJLI(this.LIZJ, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS181S0100000_12(this, 192));
            }
        }
    }

    @Override // X.InterfaceC922160a6Y
    public final void LIZJ(User user) {
        C1AZW c1azw = C1AZW.LIZ;
        String strLJ = LJ(51);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRequestCanceled: ");
        sbLIZ.append(user.getId());
        sbLIZ.append(' ');
        sbLIZ.append(user.hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ(strLJ, strLIZIZ, null, null);
        if (((LinkedList) this.LIZLLL).contains(user)) {
            if (MultiGuestFixApplyAnimationSetting.INSTANCE.enable()) {
                C19719612Di.LJJIIJ(this.LIZLLL, new AwS591S0100000_12(user, 927), true);
            } else {
                ((LinkedList) this.LIZLLL).remove(user);
            }
        }
    }

    public final void LIZLLL(User user) {
        this.LIZ.LJJII(user);
        ((HashMap) this.LJ).put(user, C11NZ.LJLJJLL(this.LIZIZ, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS148S0200000_12(this, user, 53)));
    }
}
