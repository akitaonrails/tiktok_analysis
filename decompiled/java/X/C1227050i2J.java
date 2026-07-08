package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227050i2J implements InterfaceC1227250i2d {
    public final AbstractC1225770i0F LIZ;
    public final AbstractC1225780i0G LIZIZ;

    public C1227050i2J(AbstractC1225770i0F abstractC1225770i0F) {
        this.LIZ = abstractC1225770i0F;
        this.LIZIZ = abstractC1225770i0F.LJJJJLL();
    }

    @Override // X.InterfaceC1227250i2d
    public final void LIZ(Integer num, String str, String str2, String str3) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", this.LIZIZ.LJIIIZ().LIZJ()), new Pair("enter_method", this.LIZIZ.LJIIIZ().LIZLLL()));
        if (str != null) {
            mapLJIIJ.put("to_user_id", str);
        }
        if (num != null) {
            mapLJIIJ.put("rank_num", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapLJIIJ.put("member_label", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("member_type", str3);
        }
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            Pair[] pairArr = (Pair[]) C2097808Js.LJIL(mapLJIIJ).toArray(new Pair[0]);
            iIMChatDetailAnalytics.LJFF("choose_add_member", (Pair[]) Arrays.copyOf(pairArr, pairArr.length), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.InterfaceC1227250i2d
    public final void LIZIZ(Integer num, String str, String str2, String str3) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("to_user_id", str), new Pair("enter_from", this.LIZIZ.LJIIIZ().LIZJ()), new Pair("enter_method", this.LIZIZ.LJIIIZ().LIZLLL()));
        if (num != null) {
            mapLJIIJ.put("rank_num", String.valueOf(num.intValue()));
        }
        if (str2 != null && str2.length() > 0) {
            mapLJIIJ.put("member_label", str2);
        }
        if (str3 != null && str3.length() > 0) {
            mapLJIIJ.put("member_type", str3);
        }
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics != null) {
            Pair[] pairArr = (Pair[]) C2097808Js.LJIL(mapLJIIJ).toArray(new Pair[0]);
            iIMChatDetailAnalytics.LJFF("show_add_member", (Pair[]) Arrays.copyOf(pairArr, pairArr.length), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // X.InterfaceC1227250i2d
    public final void LIZJ(List<C0YAE> list, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list2;
        String string;
        BaseContact baseContact;
        String uid;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LIZ.LLILLL;
        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list2 = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1224840hyk> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object obj = it2.next().LLJI.get("contact");
                if ((obj instanceof IMUser) && (baseContact = (BaseContact) obj) != null && (uid = baseContact.getUid()) != null) {
                    arrayList.add(uid);
                }
            }
            Pair[] pairArr = new Pair[6];
            pairArr[0] = new Pair("to_user_id_set", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            pairArr[1] = new Pair("enter_from", this.LIZIZ.LJIIIZ().LIZJ());
            pairArr[2] = new Pair("enter_method", this.LIZIZ.LJIIIZ().LIZLLL());
            pairArr[3] = new Pair("add_member_cnt", String.valueOf(list2.size()));
            if (list == null || (string = Integer.valueOf(list.size()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[4] = new Pair("add_member_cnt_success", string);
            pairArr[5] = new Pair("group_type", C1229100i5c.LJI(str));
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            if (map != null) {
                mapLJIIJ.putAll(map);
            }
            if (map2 != null) {
                mapLJIIJ.putAll(map2);
            }
            if (map3 != null) {
                mapLJIIJ.putAll(map3);
            }
            IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
            if (iIMChatDetailAnalytics != null) {
                Pair[] pairArr2 = (Pair[]) C2097808Js.LJIL(mapLJIIJ).toArray(new Pair[0]);
                iIMChatDetailAnalytics.LJFF("finish_add_member", (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length), C0I0B.LJFF.LIZIZ());
            }
        }
    }
}
