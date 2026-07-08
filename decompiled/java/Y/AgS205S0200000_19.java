package Y;

import X.C09AE;
import X.C09RB;
import X.C0I0B;
import X.C1219950hqr;
import X.C1228760i54;
import X.C1261860iwS;
import X.C1263080iyQ;
import X.C1263210iyd;
import X.C1263460iz2;
import X.C13LP;
import X.C1529305yl;
import X.C1939607ik;
import X.C2252321DDq;
import X.C259800zU;
import X.C461720I8s;
import X.InterfaceC1262160iww;
import X.InterfaceC1263400iyw;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import webcast.api.fans.GroupInviteItem;

/* JADX INFO: loaded from: classes20.dex */
public class AgS205S0200000_19 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS205S0200000_19(Object obj, ShareVideoPanelFragment shareVideoPanelFragment, C259800zU<C09AE> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = shareVideoPanelFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS205S0200000_19 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS205S0200000_19.emit$0(Y.AgS205S0200000_19, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS205S0200000_19 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto Lb
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb:
            java.util.Iterator r7 = r9.iterator()
            r5 = 0
            r4 = 0
        L11:
            boolean r0 = r7.hasNext()
            r3 = 1
            if (r0 == 0) goto L63
            int r6 = r4 + 1
            java.lang.Object r1 = r7.next()
            X.0iW6 r1 = (X.C1245520iW6) r1
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L82
            int r0 = r1.LIZJ
            if (r0 <= 0) goto L82
            java.util.List r1 = r9.subList(r5, r4)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L66
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L66
        L36:
            if (r4 < 0) goto L63
        L38:
            java.lang.Object r1 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment r1 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment) r1
            boolean r0 = r1.LLJILJILJ
            if (r0 == 0) goto L63
            X.0y8i r0 = r1.LLJI
            if (r0 == 0) goto L55
            X.0y8W r1 = r0.LJII(r4)
            if (r1 == 0) goto L55
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment r0 = (com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment) r0
            X.0y8i r0 = r0.LLJI
            if (r0 == 0) goto L55
            r0.LJIILL(r1, r3)
        L55:
            java.lang.Object r0 = r8.l1
            X.00zU r0 = (X.C259800zU) r0
            T r1 = r0.element
            X.09AE r1 = (X.C09AE) r1
            if (r1 == 0) goto L63
            r0 = 0
            r1.LIZIZ(r0)
        L63:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L66:
            java.util.Iterator r2 = r1.iterator()
        L6a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r1 = r2.next()
            X.0iW6 r1 = (X.C1245520iW6) r1
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L7f
            int r0 = r1.LIZJ
            if (r0 > 0) goto L7f
            goto L6a
        L7f:
            if (r4 != 0) goto L82
            goto L38
        L82:
            r4 = r6
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS205S0200000_19.emit$1(Y.AgS205S0200000_19, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$2(AgS205S0200000_19 agS205S0200000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = ((FanGroupChooseGroupFragment) agS205S0200000_19.l0).LLIZ;
        if (fanGroupChooseGroupFragmentParam != null) {
            List<GroupInviteItem> list = ((C1219950hqr) ((FanGroupChooseGroupViewModel) agS205S0200000_19.l1).LLILLJJLI.getValue()).LIZLLL;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (GroupInviteItem groupInviteItem : list) {
                if (groupInviteItem.isHidden) {
                    i3++;
                    if (!groupInviteItem.disabled) {
                        i4++;
                    }
                } else {
                    i++;
                    if (!groupInviteItem.disabled) {
                        i2++;
                    }
                }
            }
            IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
            if (iIMChatDetailAnalytics != null) {
                iIMChatDetailAnalytics.LJFF("group_choose_page_show", new Pair[]{new Pair("pub_chat_list", String.valueOf(i)), new Pair("avl_pub_chat_list", String.valueOf(i2)), new Pair("pri_chat_list", String.valueOf(i3)), new Pair("avl_pri_chat_list", String.valueOf(i4)), new Pair("enter_from", fanGroupChooseGroupFragmentParam.enterFrom)}, C0I0B.LJFF.LIZIZ());
            }
            String strLJIILLIIL = C09RB.LJIILLIIL(C09RB.LJIIIZ(new C1939607ik(list), AFwS257S0000000_19.get$arr$(752)), ",", null, null, AFwS257S0000000_19.get$arr$(753), 30);
            String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS257S0000000_19.get$arr$(751), 30);
            if (fanGroupChooseGroupFragmentParam.LIZ() != 0 && fanGroupChooseGroupFragmentParam.LIZ() == C461720I8s.LIZJ()) {
                z = true;
            } else {
                z = false;
            }
            C1228760i54.LIZ("ttsocial_profile_group_chat_list_show", new Pair[]{new Pair("enter_from", fanGroupChooseGroupFragmentParam.enterFrom), new Pair("enter_method", fanGroupChooseGroupFragmentParam.enterMethod), new Pair("is_profile_owner", C1529305yl.LIZ(Boolean.valueOf(z))), new Pair("visible_group_chat_list", strLJIILLIIL), new Pair("total_group_chat_list", strLJJLIIIJ)}, C0I0B.LJFF.LIZIZ());
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS205S0200000_19 agS205S0200000_19, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Pair pair = (Pair) obj;
        C1263210iyd c1263210iyd = (C1263210iyd) pair.getFirst();
        C1263460iz2 c1263460iz2 = (C1263460iz2) pair.getSecond();
        ArrayList arrayList = null;
        if (c1263210iyd.LIZ) {
            ((C1263080iyQ) agS205S0200000_19.l0).LJIIZILJ(c1263210iyd, null);
        } else {
            List<C1261860iwS> list = c1263210iyd.LJ;
            if (list != null) {
                C1263080iyQ c1263080iyQ = (C1263080iyQ) agS205S0200000_19.l0;
                arrayList = new ArrayList();
                for (C1261860iwS c1261860iwS : list) {
                    if (!c1263080iyQ.LJJ(c1261860iwS)) {
                        arrayList.add(c1261860iwS);
                    }
                }
            }
            if ((arrayList instanceof List) && arrayList != null) {
                List<InterfaceC1262160iww> list2 = c1263460iz2.LIZ;
                C1263080iyQ c1263080iyQ2 = (C1263080iyQ) agS205S0200000_19.l0;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean z = c1263210iyd.LIZJ;
                c1263080iyQ2.getClass();
                c1263080iyQ2.LJIIZILJ(c1263210iyd, C1263080iyQ.LJFF(arrayList, list2, z));
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                InterfaceC1263400iyw interfaceC1263400iyw = (InterfaceC1263400iyw) ((C1263080iyQ) agS205S0200000_19.l0).LLJILJILJ.getValue();
                if (interfaceC1263400iyw != null) {
                    interfaceC1263400iyw.LIZLLL(jCurrentTimeMillis2);
                }
            } else {
                C1263080iyQ c1263080iyQ3 = (C1263080iyQ) agS205S0200000_19.l0;
                AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(799);
                C2252321DDq c2252321DDq = c1263080iyQ3.LLILZLL;
                c2252321DDq.setValue(aFwS257S0000000_19.invoke(c2252321DDq.getValue()));
                return Unit.LIZ;
            }
        }
        return Unit.LIZ;
    }
}
