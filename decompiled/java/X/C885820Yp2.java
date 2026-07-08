package X;

import Y.ARunnableS25S0101000_14;
import android.os.Build;
import android.os.Handler;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.core.chatlist.api.engine.IChatListEngine;
import com.ss.android.ugc.aweme.im.service.analytics.IMResourceLoggerService;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Yp2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885820Yp2 implements C0ZB7 {
    public static final C885820Yp2 LIZ = new C885820Yp2();

    @Override // X.C0ZB7
    public final void LIZ() {
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        C885830Yp3.LJ(c885830Yp3, "click_inbox_tab", null, 4);
        C885830Yp3.LJ(c885830Yp3, "click_inbox_tab_first_time", AFwS187S0000000_2.get$arr$(989), 2);
        ((IMResourceLoggerService) ServiceManager.get().getService(IMResourceLoggerService.class)).LIZ();
        C0Z7A.LIZ.getValue();
        C0Z7A.LIZ(System.currentTimeMillis());
    }

    @Override // X.C0ZB7
    public final boolean LIZIZ() {
        if (((Number) C0BBM.LIZ.getValue()).intValue() != 1 || !((Boolean) C884110YmH.LJFF.getValue()).booleanValue()) {
            return false;
        }
        C885850Yp5.LIZ.getClass();
        return C885850Yp5.LJIIIIZZ.LIZJ() < ((Number) C269810Ahn.LIZ.getValue()).intValue();
    }

    @Override // X.C0ZB7
    public final void LIZJ() {
        C19212010Ec.LIZJ.LJJJI();
        IChatListEngine.LIZ.getClass();
        IChatListEngine iChatListEngineLIZ = C884160YmM.LIZ();
        long j = C884080YmE.LIZ().sessionDataMediatorDebounceTimeMs;
        C1ED8.LIZ.getClass();
        iChatListEngineLIZ.LJIILJJIL(new C884980Yng(j, ((Number) C1ED8.LJIILIIL.getValue()).longValue(), ((Boolean) C1ED8.LJIIIZ.getValue()).booleanValue()));
        C885100Yns c885100YnsLIZ = C885150Ynx.LIZ();
        c885100YnsLIZ.getClass();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            abstractC883730YlfLJ.LJFF = false;
            abstractC883730YlfLJ.LJIJJLI();
            C884160YmM.LIZ().LJ(C881500Yi4.LIZLLL(), C1697810uHb.LJIIJJI(new C879040Ye6(new C885140Ynw()), new C879040Ye6(new C1730306q5()), new C879040Ye6(AFwS201S0000000_14.get$arr$(626))));
        }
        C883610YlT c883610YlTLIZ = C882120Yj4.LIZ();
        c883610YlTLIZ.getClass();
        if (!EventBus.LIZLLL().LJIIJ(c883610YlTLIZ) && c883610YlTLIZ.LIZLLL.compareAndSet(false, true)) {
            EventBus.LIZLLL().LJIJJ(c883610YlTLIZ);
        }
        EventBus.LIZLLL().LJIJJ(c885100YnsLIZ);
        C884110YmH c884110YmH = C884110YmH.LIZ;
        C884110YmH.LJ(c884110YmH, "1");
        C884110YmH.LJ(c884110YmH, "13");
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        C885830Yp3.LJ(c885830Yp3, "subscribe", new C886220Ypg(), 2);
    }

    @Override // X.C0ZB7
    public final void LJI() {
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        if (((Boolean) C07QT.LIZ.getValue()).booleanValue()) {
            C885830Yp3.LJ(c885830Yp3, "init", new C885890Yp9(), 2);
        }
    }

    @Override // X.C0ZB7
    public final void LJIIIIZZ() {
        IChatListEngine.LIZ.getClass();
        C884160YmM.LIZ().clear();
        C885100Yns c885100YnsLIZ = C885150Ynx.LIZ();
        c885100YnsLIZ.getClass();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        for (AbstractC883730Ylf abstractC883730Ylf : C1697810uHb.LJIIJJI(AbstractC883730Ylf.LJIIIZ.getValue(), AbstractC883730Ylf.LJIIJ.getValue())) {
            abstractC883730Ylf.LJIIZILJ().clear();
            ((CopyOnWriteArrayList) abstractC883730Ylf.LIZIZ.getValue()).clear();
            abstractC883730Ylf.LJ = null;
        }
        EventBus.LIZLLL().LJJI(c885100YnsLIZ);
        C883610YlT c883610YlTLIZ = C882120Yj4.LIZ();
        c883610YlTLIZ.getClass();
        C885150Ynx.LIZ().LIZ().LJIIIIZZ(new AwS558S0100000_14(c883610YlTLIZ, 1354));
        C886310Ypp c886310Ypp = C886310Ypp.LIZ;
        C886310Ypp.LIZJ = true;
        AnonymousClass0956 anonymousClass0956 = C886310Ypp.LIZLLL;
        if (anonymousClass0956 != null && (!anonymousClass0956.isCompleted())) {
            anonymousClass0956.LIZIZ(null);
        }
        C879730YfD.LIZ.getClass();
        C879730YfD.LIZIZ.setValue(null);
        C884110YmH.LJ(C884110YmH.LIZ, "3");
        C885850Yp5.LIZ.getClass();
        C885850Yp5.LJII = -1;
        C885850Yp5.LJ = -1;
        C885850Yp5.LJIIIIZZ.LJ(0);
        C885850Yp5.LIZIZ = 0;
        C885850Yp5.LIZJ = 0;
        C885850Yp5.LJFF = 0;
        C885850Yp5.LIZLLL = false;
        if (C1207204nu.LIZ()) {
            ((AtomicBoolean) C885850Yp5.LJIILIIL.getValue()).set(false);
            ((C823170WQx) C885850Yp5.LJIILJJIL.getValue()).clear();
            ((C823170WQx) C885850Yp5.LJIIZILJ.getValue()).clear();
            ((C823170WQx) C885850Yp5.LJIJ.getValue()).clear();
            ((C823170WQx) C885850Yp5.LJIJI.getValue()).clear();
            ((C563400M7u) C885850Yp5.LJIIJ.getValue()).LJ(-1);
            ((C563400M7u) C885850Yp5.LJIIJJI.getValue()).LJ(-1);
            ((C563400M7u) C885850Yp5.LJIIL.getValue()).LJ(-1);
            ((C563400M7u) C885850Yp5.LJIILLIIL.getValue()).LJ(-1);
            ((C563400M7u) C885850Yp5.LJIILL.getValue()).LJ(-1);
            ((C823170WQx) C885850Yp5.LJIJJLI.getValue()).clear();
            ((C823170WQx) C885850Yp5.LJIJJ.getValue()).clear();
            ((C823170WQx) C885850Yp5.LJIL.getValue()).clear();
            ((AtomicReference) C885850Yp5.LJJ.getValue()).set("");
            ((C563400M7u) C885850Yp5.LJJI.getValue()).LJ(-1);
            ((C563400M7u) C885850Yp5.LJJIFFI.getValue()).LJ(0);
        }
        if (C289920BXy.LIZ()) {
            ((AtomicBoolean) C885850Yp5.LJJII.getValue()).set(false);
            ((AtomicBoolean) C885850Yp5.LJJIII.getValue()).set(false);
            ((C563400M7u) C885850Yp5.LJJIIJ.getValue()).LJ(-1);
            ((AtomicBoolean) C885850Yp5.LJJIIJZLJL.getValue()).set(false);
            ((C823170WQx) C885850Yp5.LJJIIZ.getValue()).clear();
            ((C563400M7u) C885850Yp5.LJJIIZI.getValue()).LJ(-1);
        }
        if (C0BBO.LIZ()) {
            ((C563400M7u) C885850Yp5.LJI.getValue()).LJ(-1);
        }
        C885830Yp3.LL.getClass();
        ((LinkedHashMap) C885830Yp3.LLILLJJLI).clear();
        C885830Yp3.LLILLL = true;
        C885830Yp3.LLILZ = true;
        C885830Yp3.LLILZIL = true;
    }

    @Override // X.C0ZB7
    public final void LJIILJJIL() {
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        if (C885830Yp3.LIZIZ("received_dm_unread") || C885830Yp3.LIZIZ("received_notice_unread")) {
            C885830Yp3.LJ(c885830Yp3, "unread_badge_show", new C886230Yph(), 2);
        }
    }

    public static boolean LJIILL(C890610Ywl c890610Ywl) {
        if (c890610Ywl.getType() != 104 && c890610Ywl.getType() != 108 && c890610Ywl.getType() != 105 && c890610Ywl.getType() != 107) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    @Override // X.C0ZB7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(boolean r15) {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C885820Yp2.LIZLLL(boolean):void");
    }

    @Override // X.C0ZB7
    public final void LJ(boolean z) {
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        C885830Yp3.LJ(c885830Yp3, "unread_bubble_show", new C886110YpV(z), 2);
    }

    @Override // X.C0ZB7
    public final void LJFF(List<? extends InterfaceC1891350zJl> list) {
        int i = 0;
        if (C0BBO.LIZ()) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    if (interfaceC1891350zJl instanceof C890610Ywl) {
                        LIZ.getClass();
                        if (LJIILL((C890610Ywl) interfaceC1891350zJl)) {
                            break;
                        }
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            C885850Yp5.LIZ.getClass();
            if (C0BBO.LIZ()) {
                ((C563400M7u) C885850Yp5.LJI.getValue()).LJ(i2);
            }
        }
        if (!((ArrayList) list).isEmpty()) {
            i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) list) {
                if (interfaceC1891350zJl2 instanceof C890610Ywl) {
                    LIZ.getClass();
                    if (LJIILL((C890610Ywl) interfaceC1891350zJl2) && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
        }
        C885850Yp5.LIZ.getClass();
        C885850Yp5.LJFF = i;
    }

    @Override // X.C0ZB7
    public final void LJII(boolean z) {
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        C885830Yp3.LJ(c885830Yp3, "received_notice_unread", new C886040YpO(z), 2);
    }

    @Override // X.C0ZB7
    public final void LJIIIZ(MotionEvent motionEvent) {
        InterfaceC879010Ye3 interfaceC879010Ye3LIZLLL;
        InterfaceC884640Yn8 config;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                System.currentTimeMillis();
                if ((C300740Bqa.LIZ() & 131072) != 0 && !C886270Ypl.LIZ) {
                    C886270Ypl.LIZ = true;
                    if (Build.VERSION.SDK_INT < 26) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05QK(null), 3);
                    }
                }
            } else {
                motionEvent.getAction();
            }
        }
        C882120Yj4.LIZ().getClass();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null) {
            InterfaceC884020Ym8 interfaceC884020Ym8 = abstractC883730YlfLJ.LJ;
            if (interfaceC884020Ym8 == null || (config = interfaceC884020Ym8.getConfig()) == null || (interfaceC879010Ye3LIZLLL = config.getKey()) == null) {
                interfaceC879010Ye3LIZLLL = C881500Yi4.LIZLLL();
            }
            C1729806q0.LIZ(interfaceC879010Ye3LIZLLL, new C1563206Ac(motionEvent, abstractC883730YlfLJ, null));
        }
    }

    @Override // X.C0ZB7
    public final void LJIILIIL(C885880Yp8 c885880Yp8) {
        Integer numValueOf;
        FilterTabType filterTabType;
        Set<EnumC880480YgQ> set;
        int size;
        List<C890610Ywl> list;
        List<C890610Ywl> list2;
        if (c885880Yp8 != null && c885880Yp8.LJ == 1) {
            C885830Yp3 c885830Yp3 = C885830Yp3.LL;
            c885830Yp3.getClass();
            Integer numValueOf2 = null;
            C885830Yp3.LJ(c885830Yp3, "received_dm_data", null, 6);
            C884110YmH c884110YmH = C884110YmH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("r(");
            if (c885880Yp8 != null && (list2 = c885880Yp8.LIZ) != null) {
                numValueOf = Integer.valueOf(list2.size());
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append('_');
            if (c885880Yp8 != null) {
                filterTabType = c885880Yp8.LIZJ;
            } else {
                filterTabType = null;
            }
            sbLIZ.append(filterTabType);
            sbLIZ.append('_');
            if (c885880Yp8 != null) {
                set = c885880Yp8.LIZLLL;
            } else {
                set = null;
            }
            sbLIZ.append(set);
            sbLIZ.append('_');
            if (c885880Yp8 != null) {
                numValueOf2 = Integer.valueOf(c885880Yp8.LJ);
            }
            sbLIZ.append(numValueOf2);
            sbLIZ.append(')');
            C884110YmH.LJ(c884110YmH, C2188811AlT.LIZIZ(sbLIZ));
            C885850Yp5.LIZ.getClass();
            if (c885880Yp8 != null && (list = c885880Yp8.LIZ) != null) {
                size = list.size();
            } else {
                size = 0;
            }
            C885850Yp5.LJ = size;
            C886240Ypi.LIZ.getClass();
            if (C886240Ypi.LIZIZ.compareAndSet(false, true)) {
                ((IDMResourceLoadService) ServiceManager.get().getService(IDMResourceLoadService.class)).LIZIZ().LIZ("conversation_list_preload", null, null, null, true, null);
            }
        }
    }

    @Override // X.C0ZB7
    public final void LJIIJ(int i, RecyclerView.LayoutManager layoutManager) {
        C885830Yp3.LL.getClass();
        if (!C885830Yp3.LLIZ && C885830Yp3.LIZIZ("click_inbox_tab_first_time", "preloaded", "received_dm_data")) {
            C786410Ut5.LJJZZIII((Handler) C885830Yp3.LLJJIJI.getValue(), new ARunnableS25S0101000_14(i, layoutManager, 6));
        }
    }

    @Override // X.C0ZB7
    public final void LJIIJJI(String str, JSONObject jSONObject) throws JSONException {
        long j;
        int size;
        Integer numValueOf;
        Integer numValueOf2;
        int size2;
        List<C890610Ywl> list;
        int iHashCode = str.hashCode();
        C886260Ypk c886260Ypk = null;
        if (iHashCode != -1212815295) {
            if (iHashCode != -626212251) {
                if (iHashCode == 1841470632 && str.equals("inbox_page")) {
                    C885830Yp3 c885830Yp3 = C885830Yp3.LL;
                    c885830Yp3.getClass();
                    jSONObject.put("total_conv_size", C885830Yp3.LLJI);
                    AbstractC883730Ylf.LJIIIIZZ.getClass();
                    AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
                    if (abstractC883730YlfLJ != null) {
                        C885880Yp8 c885880Yp8LJLZ = abstractC883730YlfLJ.LJIILLIIL().LJLZ();
                        if (c885880Yp8LJLZ != null && (list = c885880Yp8LJLZ.LIZ) != null) {
                            size2 = list.size();
                        } else {
                            size2 = 0;
                        }
                        numValueOf = Integer.valueOf(size2);
                    } else {
                        numValueOf = null;
                    }
                    AbstractC883730Ylf abstractC883730YlfLJ2 = C881500Yi4.LJ();
                    if (abstractC883730YlfLJ2 != null) {
                        numValueOf2 = Integer.valueOf(abstractC883730YlfLJ2.LJIILJJIL());
                    } else {
                        numValueOf2 = null;
                    }
                    jSONObject.put("inbox_conv_size", numValueOf);
                    jSONObject.put("account_type", C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
                    jSONObject.put("unread_cnt", C885830Yp3.LLJJIII);
                    jSONObject.put("cur_page_unread_cnt", numValueOf2);
                    C885830Yp3.LJFF(c885830Yp3, "im_conv_fluency", null, jSONObject, 2);
                    return;
                }
                return;
            }
            if (!str.equals("quick_reply_list")) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0Z7V c0z7vLJIILJJIL = C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL();
            linkedHashMap.put("account_type", c0z7vLJIILJJIL.LIZIZ(C461720I8s.LIZJ()));
            linkedHashMap.put("quick_reply_count", String.valueOf(c0z7vLJIILJJIL.LJIIIZ()));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.optString(next));
            }
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("quick_reply_list_fps", linkedHashMap);
            return;
        }
        if (!str.equals("im_message_request_page_fluency")) {
            return;
        }
        EnumC871430YGn enumC871430YGn = C879050Ye7.LJI;
        if (enumC871430YGn != null) {
            c886260Ypk = (C886260Ypk) ((LinkedHashMap) C879050Ye7.LJFF).get(enumC871430YGn);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<String> itKeys2 = jSONObject.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            linkedHashMap2.put(next2, JSONObjectProtectorUtils.getString(jSONObject, next2));
        }
        EnumC871430YGn enumC871430YGn2 = C879050Ye7.LJI;
        if (enumC871430YGn2 == null) {
            enumC871430YGn2 = EnumC871430YGn.ALL_STRANGER;
        }
        if (C879050Ye7.LJI != null) {
            Iterator<C0Y9G> it2 = C876470YZx.LIZ().LJIIJ(enumC871430YGn2).iterator();
            j = 0;
            while (it2.hasNext()) {
                j += it2.next().LIZLLL;
            }
        } else {
            j = -1;
        }
        if (C879050Ye7.LJI != null) {
            size = C876470YZx.LIZ().LJIIJ(enumC871430YGn2).size();
        } else {
            size = -1;
        }
        linkedHashMap2.put("account_type", C1668706g9.LIZ(IIMBusinessChatService.LIZ).LJIILJJIL().LIZIZ(C461720I8s.LIZJ()));
        if (c886260Ypk != null) {
            linkedHashMap2.put("request_message_count", String.valueOf(c886260Ypk.LIZIZ));
            linkedHashMap2.put("cur_page_unread_cnt", String.valueOf(c886260Ypk.LIZ));
        }
        linkedHashMap2.put("unread_cnt", String.valueOf(j));
        linkedHashMap2.put("request_total_count", String.valueOf(size));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_message_request_page_fluency", linkedHashMap2);
    }

    @Override // X.C0ZB7
    public final void LJIIL(int i, boolean z) {
        C885830Yp3 c885830Yp3 = C885830Yp3.LL;
        c885830Yp3.getClass();
        C885830Yp3.LJ(c885830Yp3, "received_dm_unread", new C886030YpN(i, z), 2);
    }
}
