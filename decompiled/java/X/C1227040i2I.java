package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMCreateChatAnalytics;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227040i2I extends AbstractC1225770i0F {
    public final C1226980i2C LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224490hyB LJJJJIZL() {
        return new C1227990i3p(this, this.LLJIJIL.LLLFFI);
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224330hxv LJJJJJL() {
        return new C1227340i2m(this, this.LLJIJIL.LLL);
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224410hy3 LJJJJL() {
        return new C1225720i0A(this, this.LLJIJIL.LLLFZ);
    }

    @Override // X.AbstractC1225770i0F
    public final C1224950hyv LJJJJLI() {
        return new C1227330i2l(this, (C1227080i2M) this.LLJIJIL.LLLFF.LIZIZ);
    }

    @Override // X.AbstractC1225770i0F, X.InterfaceC1224300hxs
    public final void LJJI() {
        IIMCreateChatAnalytics iIMCreateChatAnalytics;
        super.LJJI();
        if (this.LLJIJIL.LLJJJ && (iIMCreateChatAnalytics = (IIMCreateChatAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMCreateChatAnalytics.class)) != null) {
            iIMCreateChatAnalytics.LIZ(C0I0B.LJFF.LIZIZ());
        }
        C1227150i2T c1227150i2T = (C1227150i2T) this.LLJILJIL.getValue();
        C0I0B.LJFF.LIZIZ();
        c1227150i2T.getClass();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", c1227150i2T.LIZJ.LJIIIZ().LIZJ());
        arrayMap.put("invited_user_cnt_total", String.valueOf(((List) c1227150i2T.LJ.getValue()).size() + 1));
        Map<String, Object> mapLIZLLL = c1227150i2T.LIZJ.LIZLLL();
        if (mapLIZLLL != null) {
            for (Map.Entry<String, Object> entry : mapLIZLLL.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof String) || value == null) {
                    value = "";
                }
                arrayMap.put(key, value);
            }
        }
        arrayMap.put("enter_from", c1227150i2T.LIZJ.LJIIIZ().LIZJ());
        arrayMap.put("enter_method", c1227150i2T.LIZJ.LJIIIZ().LIZLLL());
        arrayMap.put("group_type", c1227150i2T.LIZLLL.getValue());
        InterfaceC1224210hxj interfaceC1224210hxj = (InterfaceC1224210hxj) C13LP.LJJJLL(((C1225790i0H) c1227150i2T.LIZ.LJIILLIIL()).LIZ());
        boolean z = (interfaceC1224210hxj != null ? interfaceC1224210hxj.LIZIZ() : null) instanceof C1228060i3w;
        arrayMap.putAll((ArrayMap) c1227150i2T.LIZIZ);
        C20684815ws.LJIILLIIL("create_group_chat_panel_performance", arrayMap);
    }

    @Override // X.AbstractC1225770i0F, X.InterfaceC1224300hxs
    public final void LJJIJL() {
        IIMCreateChatAnalytics iIMCreateChatAnalytics;
        super.LJJIJL();
        if (this.LLJIJIL.LLJJJ && (iIMCreateChatAnalytics = (IIMCreateChatAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMCreateChatAnalytics.class)) != null) {
            iIMCreateChatAnalytics.LIZIZ(C0I0B.LJFF.LIZIZ());
        }
        C1227060i2K c1227060i2K = (C1227060i2K) this.LLJILLL.getValue();
        if (c1227060i2K != null) {
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("show_create_group_chat_panel", c1227060i2K.LIZ());
        }
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224480hyA LJJJJJ() {
        return C1227670i3J.LIZIZ;
    }

    @Override // X.AbstractC1225770i0F
    public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
        return this.LLJIJIL;
    }

    public C1227040i2I(C1226980i2C c1226980i2C) {
        super(c1226980i2C);
        this.LLJIJIL = c1226980i2C;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3281));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3280));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3282));
    }

    @Override // X.AbstractC1225770i0F, X.InterfaceC1224250hxn
    public final void LJJIJLIJ(C1224050hxT c1224050hxT) {
        IIMChatDetailAnalytics iIMChatDetailAnalytics;
        if (c1224050hxT.LIZ != null && (iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class)) != null) {
            iIMChatDetailAnalytics.LJIIIZ(this.LLJIJIL.LLJZIJLIL.LJIIZILJ, "auto");
        }
    }

    @Override // X.AbstractC1225770i0F, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        Collection collection;
        Set<Map.Entry<String, List<C1224840hyk>>> setEntrySet;
        Map.Entry entry;
        Map<String, List<C1224840hyk>> map = c1224790hyf.LIZ;
        if (map != null && (setEntrySet = map.entrySet()) != null && (entry = (Map.Entry) C13LP.LJJJLIIL(setEntrySet)) != null) {
            collection = (Collection) entry.getValue();
        } else {
            collection = null;
        }
        if (C866950Xzh.LIZIZ(collection)) {
            C1227150i2T c1227150i2T = (C1227150i2T) this.LLJILJIL.getValue();
            if (!c1227150i2T.LJII) {
                c1227150i2T.LJII = true;
                c1227150i2T.LIZIZ.put("contact_load_duration", String.valueOf(System.currentTimeMillis() - c1227150i2T.LIZJ.LL));
            }
        }
    }

    @Override // X.AbstractC1225770i0F
    public final void LJJJJZ(AbstractC1225650i03 abstractC1225650i03) {
        IIMChatDetailAnalytics iIMChatDetailAnalytics;
        boolean zBooleanValue;
        C1227160i2U c1227160i2U;
        String str;
        Boolean bool;
        C0S2X c0s2x;
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        super.LJJJJZ(abstractC1225650i03);
        C1227060i2K c1227060i2K = (C1227060i2K) this.LLJILLL.getValue();
        C1224780hye c1224780hyeLJIILLIIL2 = null;
        if (c1227060i2K != null) {
            InterfaceC1226510i1R interfaceC1226510i1R = this.LLILLL;
            if (interfaceC1226510i1R != null) {
                c1224780hyeLJIILLIIL2 = interfaceC1226510i1R.LJIILLIIL();
            }
            if (abstractC1225650i03 instanceof C1225640i02) {
                C1227060i2K.LIZIZ(c1227060i2K, EnumC1227220i2a.SEARCH, c1224780hyeLJIILLIIL2);
            } else if (abstractC1225650i03 instanceof C1225670i05) {
                C1227060i2K.LIZIZ(c1227060i2K, EnumC1227220i2a.DISMISS, c1224780hyeLJIILLIIL2);
            } else if ((abstractC1225650i03 instanceof C1225690i07) && ((C1225690i07) abstractC1225650i03).LIZ.LIZ == EnumC1227730i3P.MAIN) {
                C1227060i2K.LIZIZ(c1227060i2K, EnumC1227220i2a.CREATE_GROUP, c1224780hyeLJIILLIIL2);
            }
        }
        int size = 0;
        if (abstractC1225650i03 instanceof C1225690i07) {
            C1224590hyL c1224590hyL = ((C1225690i07) abstractC1225650i03).LIZ;
            if (c1224590hyL.LIZIZ && !c1224590hyL.LJ && c1224590hyL.LIZ == EnumC1227730i3P.MAIN) {
                InterfaceC1226510i1R interfaceC1226510i1R2 = this.LLILLL;
                if (interfaceC1226510i1R2 != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
                    size = list.size();
                }
                C1227150i2T c1227150i2T = (C1227150i2T) this.LLJILJIL.getValue();
                if (!c1227150i2T.LJI) {
                    c1227150i2T.LJI = true;
                    c1227150i2T.LIZIZ.put("create_chat_duration", String.valueOf(System.currentTimeMillis() - c1227150i2T.LIZJ.LL));
                    ArrayMap<String, String> arrayMap = c1227150i2T.LIZIZ;
                    if (size > 1) {
                        c0s2x = C0S2X.GROUP;
                    } else {
                        c0s2x = C0S2X.PRIVATE;
                    }
                    arrayMap.put("create_chat_type", c0s2x.getValue());
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC1225650i03 instanceof C1225680i06) {
            C1224840hyk c1224840hyk = ((C1225680i06) abstractC1225650i03).LIZ;
            if (c1224840hyk.LLJILJIL) {
                return;
            }
            C1227150i2T c1227150i2T2 = (C1227150i2T) this.LLJILJIL.getValue();
            c1227150i2T2.getClass();
            Object obj = c1224840hyk.LLJI.get("is_search");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            IMUser iMUserLIZ = C1225230hzN.LIZ(c1224840hyk);
            if (iMUserLIZ != null) {
                c1227160i2U = new C1227160i2U(C1227190i2X.LIZ(iMUserLIZ), C1227190i2X.LIZIZ(c1224840hyk, true));
            } else {
                c1227160i2U = new C1227160i2U(0);
            }
            C0I0B.LJFF.LIZIZ();
            Pair[] pairArr = new Pair[7];
            pairArr[0] = new Pair("relation", c1227160i2U.LIZ.getKey());
            pairArr[1] = new Pair("source", c1227160i2U.LIZIZ.getKey());
            pairArr[2] = new Pair("previous_page", c1227150i2T2.LIZ.LJJJJLL().LJIIIZ().LIZJ());
            pairArr[3] = new Pair("enter_method", c1227150i2T2.LIZ.LJJJJLL().LJIIIZ().LIZLLL());
            pairArr[4] = new Pair("enter_from", c1227150i2T2.LIZ.LJJJJLL().LJIIIZ().LIZJ());
            if (zBooleanValue) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            pairArr[5] = new Pair("is_search", str);
            pairArr[6] = new Pair("group_type", c1227150i2T2.LIZLLL.getValue());
            C20684815ws.LJIILLIIL("choose_group_member", C2097608Jq.LJIIJ(pairArr));
            ((C1226180i0u) this.LLJILJILJ.getValue()).LIZ(c1224840hyk, "new_group");
            return;
        }
        if (!(abstractC1225650i03 instanceof C1225640i02) || (iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class)) == null) {
            return;
        }
        iIMChatDetailAnalytics.LJIIIZ(this.LLJIJIL.LLJZIJLIL.LJIIZILJ, "click");
    }

    @Override // X.AbstractC1225770i0F
    public final void LJJJJZI(C1224840hyk c1224840hyk) {
        C1227150i2T c1227150i2T = (C1227150i2T) this.LLJILJIL.getValue();
        String str = c1224840hyk.LLILZ;
        c1227150i2T.getClass();
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_group_member", C2097608Jq.LJIIJ(new Pair("previous_page", c1227150i2T.LIZJ.LJIIIZ().LIZJ()), new Pair("enter_from", "member_list"), new Pair("to_user_id", str)));
    }
}
