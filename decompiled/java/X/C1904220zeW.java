package X;

import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceCount;
import com.ss.android.ugc.aweme.notice.api.bean.EntranceKey;
import com.ss.android.ugc.aweme.notice.api.bean.FollowTabInfoStruct;
import com.ss.android.ugc.aweme.notice.api.bean.KeyValueModel;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountExtra;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeCountMessage;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS105S0210000_28;
import kotlin.jvm.internal.AwS149S0201000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS63S0001000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0zeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904220zeW implements INoticeCountService, InterfaceC486470J5x {
    public static final C1904220zeW LL;
    public static long LLILLJJLI;
    public static final C01GW LLILLL;
    public static final C01GW LLILZ;
    public static final C01GW LLILZIL;
    public static final C01GW LLILZLL;
    public static final Map<Integer, NoticeGroupAttrs> LLIZ;
    public static final Map<EntranceKey, NoticeGroupAttrs> LLIZLLLIL;
    public static final C01GW LLJ;
    public static final C01GW LLJI;
    public static final C01GW LLJIJIL;
    public static final C01GW LLJILJIL;
    public static List<EntranceCount> LLJILJILJ;
    public static Long LLJILLL;
    public static final C01GW LLJJ;
    public static final SparseArray<InterfaceC1904340zei> LLJJI;
    public static boolean LLJJIII;

    static {
        C1904220zeW c1904220zeW = new C1904220zeW();
        LL = c1904220zeW;
        new ArrayList();
        new AtomicBoolean(false);
        LLILLL = C452501pT.LIZIZ(new C1592160rXC());
        LLILZ = C452501pT.LIZIZ(new C1902460zbg());
        LLILZIL = C452501pT.LIZIZ(new C1160000gIA());
        LLILZLL = C452501pT.LIZIZ(new C0CVM());
        EnumC624380OeK enumC624380OeK = EnumC624380OeK.Normal;
        C0ZAJ c0zaj = C0ZAJ.ShowNum;
        C0ZAJ c0zaj2 = C0ZAJ.ShowDot;
        LLIZ = C2097608Jq.LJIIIIZZ(new Pair(99, new NoticeGroupAttrs(enumC624380OeK, c0zaj, C0ZBF.UN_MUTE, null, false, C0ZBI.UN_ARCHIVE)), new Pair(101, new NoticeGroupAttrs(enumC624380OeK, c0zaj2, C0ZBF.UN_MUTE, null, false, C0ZBI.UN_ARCHIVE)), new Pair(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), new NoticeGroupAttrs(enumC624380OeK, c0zaj2, C0ZBF.UN_MUTE, null, false, C0ZBI.UN_ARCHIVE)));
        int i = C1904270zeb.LIZ;
        LLIZLLLIL = C2097908Jt.LIZJ(new Pair(C1904270zeb.LJIIIIZZ, new NoticeGroupAttrs(enumC624380OeK, c0zaj, C0ZBF.UN_MUTE, null, false, C0ZBI.UN_ARCHIVE)));
        LLJ = C452501pT.LIZIZ(new C1159970gI7());
        LLJI = C452501pT.LIZIZ(new C1159980gI8());
        LLJIJIL = C452501pT.LIZIZ(new C1160010gIB());
        LLJILJIL = C452501pT.LIZIZ(new C1159990gI9());
        LLJJ = C452501pT.LIZIZ(new C1904300zee());
        LLJJI = new SparseArray<>();
        C2203431BLp.LIZIZ.LJI(1, 1, c1904220zeW);
    }

    public static ConcurrentHashMap LJJIJIIJIL() {
        return (ConcurrentHashMap) LLJI.getValue();
    }

    public static ConcurrentHashMap LJJIJIL() {
        return (ConcurrentHashMap) LLJILJIL.getValue();
    }

    public static Map LJJIJL() {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMapLJJIJIIJIL = LJJIJIIJIL();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMapLJJIJIIJIL.entrySet()) {
            if (((NoticeGroupAttrs) entry.getValue()).showType == C0ZAJ.ShowDot && ((NoticeGroupAttrs) entry.getValue()).muteType != C0ZBF.MUTE) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        for (Object obj : setKeySet) {
            LL.getClass();
            Integer num = (Integer) LJJIJIL().get(obj);
            if (num != null && (iIntValue = num.intValue()) > 0) {
                linkedHashMap.put(obj, Integer.valueOf(iIntValue));
            }
            arrayList.add(Unit.LIZ);
        }
        return linkedHashMap;
    }

    public static Map LJJIJLIJ() {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMapLJJIJIIJIL = LJJIJIIJIL();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMapLJJIJIIJIL.entrySet()) {
            if (((NoticeGroupAttrs) entry.getValue()).showType == C0ZAJ.ShowNum && ((NoticeGroupAttrs) entry.getValue()).muteType != C0ZBF.MUTE) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
        for (Object obj : setKeySet) {
            LL.getClass();
            Integer num = (Integer) LJJIJIL().get(obj);
            if (num != null && (iIntValue = num.intValue()) > 0) {
                linkedHashMap.put(obj, Integer.valueOf(iIntValue));
            }
            arrayList.add(Unit.LIZ);
        }
        return linkedHashMap;
    }

    public static ConcurrentHashMap LJJIL() {
        return (ConcurrentHashMap) LLILZ.getValue();
    }

    public static ConcurrentHashMap LJJJJ() {
        return (ConcurrentHashMap) LLJ.getValue();
    }

    public static ConcurrentHashMap LJJJJI() {
        return (ConcurrentHashMap) LLJIJIL.getValue();
    }

    public static Map LJJJJIZL() {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMapLJJJJ = LJJJJ();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMapLJJJJ.entrySet()) {
            if (((NoticeGroupAttrs) entry.getValue()).showType == C0ZAJ.ShowDot) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                LL.getClass();
                Integer num = (Integer) LJJJJI().get(Integer.valueOf(iIntValue2));
                if (num != null && (iIntValue = num.intValue()) > 0) {
                    linkedHashMap.put(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
                }
                arrayList.add(Unit.LIZ);
            }
        }
        return linkedHashMap;
    }

    public static Map LJJJJJ() {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMapLJJJJ = LJJJJ();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMapLJJJJ.entrySet()) {
            if (((NoticeGroupAttrs) entry.getValue()).showType == C0ZAJ.ShowNum && ((NoticeGroupAttrs) entry.getValue()).muteType != C0ZBF.MUTE) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                LL.getClass();
                Integer num = (Integer) LJJJJI().get(Integer.valueOf(iIntValue2));
                if (num != null && (iIntValue = num.intValue()) > 0) {
                    linkedHashMap.put(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
                }
                arrayList.add(Unit.LIZ);
            }
        }
        return linkedHashMap;
    }

    public static int LJJJJL() {
        if (!C1665906fh.LIZJ.LJIIIIZZ()) {
            return -1;
        }
        Integer num = (Integer) LJJIJIL().get(C1904270zeb.LJII);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static int LJJJJLI() {
        if (C1665906fh.LIZJ.LJIIIIZZ()) {
            Integer num = (Integer) LJJIJIL().get(C1904270zeb.LJFF);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        Integer num2 = (Integer) LJJJJI().get(30000);
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) LJJIJIL().get(C1904270zeb.LJFF);
        return iIntValue + (num3 != null ? num3.intValue() : 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LIZ() {
        if (C1665906fh.LIZJ.LJIIIIZZ()) {
            Integer num = (Integer) LJJIJIL().get(C1904270zeb.LJI);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
        Integer num2 = (Integer) LJJJJI().get(19999);
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = (Integer) LJJIJIL().get(C1904270zeb.LJI);
        return iIntValue + (num3 != null ? num3.intValue() : 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJII() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "clearNoticeCountAll");
        LJJJJI().clear();
        LJJIJIL().clear();
        LJJIL().clear();
        LLILLJJLI = 0L;
        LLJJIII = false;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIJJI() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "getAllOtherMultiUserNoticeCount");
        C1904260zea c1904260zeaLIZ = C1904260zea.LIZ();
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId.equals(c1904260zeaLIZ.LIZLLL)) {
            return c1904260zeaLIZ.LIZIZ;
        }
        C1720106oR.LJI("MultiUserManager", C786410Ut5.j4("currentID=%s, this.currentUID=%s", new Object[]{curUserId, c1904260zeaLIZ.LIZLLL}));
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIILL() {
        if (!C1665906fh.LIZJ.LJIIIIZZ()) {
            return -1;
        }
        Integer num = (Integer) LJJIJIL().get(C1904270zeb.LJII);
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) LJJIJIL().get(C1904270zeb.LJIIIIZZ);
        return iIntValue + (num2 != null ? num2.intValue() : 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final Map<Integer, Integer> LJIILLIIL() {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConcurrentHashMap concurrentHashMapLJJJJ = LJJJJ();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMapLJJJJ.entrySet()) {
            if (((NoticeGroupAttrs) entry.getValue()).showType == C0ZAJ.ShowNum) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setKeySet, 10));
            Iterator it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = ((Number) it2.next()).intValue();
                LL.getClass();
                Integer num = (Integer) LJJJJI().get(Integer.valueOf(iIntValue2));
                if (num != null && (iIntValue = num.intValue()) > 0) {
                    linkedHashMap.put(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
                }
                arrayList.add(Unit.LIZ);
            }
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIZILJ() {
        if (C1665906fh.LIZJ.LJIIIIZZ()) {
            Integer num = (Integer) LJJIJIL().get(C1904270zeb.LJFF);
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = (Integer) LJJJJI().get(99);
            return iIntValue + (num2 != null ? num2.intValue() : 0);
        }
        Integer num3 = (Integer) LJJJJI().get(29999);
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        Integer num4 = (Integer) LJJIJIL().get(C1904270zeb.LJFF);
        return iIntValue2 + (num4 != null ? num4.intValue() : 0);
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIJJLI() {
        C1904350zej.LIZ.getClass();
        if (!C0XQ7.LIZJ().isEnableMultiAccountLogin() || ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size() <= 1) {
            return;
        }
        LIZLLL("push", ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI());
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIL() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "getLastAllOtherMultiUserNoticeCount");
        C1904260zea c1904260zeaLIZ = C1904260zea.LIZ();
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId.equals(c1904260zeaLIZ.LIZLLL)) {
            return c1904260zeaLIZ.LIZJ;
        }
        C1720106oR.LJI("MultiUserManager", C786410Ut5.j4("currentID=%s, this.currentUID=%s", new Object[]{curUserId, c1904260zeaLIZ.LIZLLL}));
        return -1;
    }

    public static Map LJJIJ() {
        Map mapLJJIJL = LJJIJL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapLJJIJL).entrySet()) {
            if (!LLIZLLLIL.keySet().contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static Map LJJIJIIJI() {
        Map mapLJJIJLIJ = LJJIJLIJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapLJJIJLIJ).entrySet()) {
            if (!LLIZLLLIL.keySet().contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static Map LJJJI() {
        Map mapLJJJJIZL = LJJJJIZL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapLJJJJIZL).entrySet()) {
            if (!LLIZ.keySet().contains(Integer.valueOf(((Number) entry.getKey()).intValue()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static Map LJJJIL() {
        Map mapLJJJJJ = LJJJJJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) mapLJJJJJ).entrySet()) {
            if (!LLIZ.keySet().contains(Integer.valueOf(((Number) entry.getKey()).intValue()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static List LJJJ(int i) {
        List<Integer> list;
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJIL().get(Integer.valueOf(i));
        if (noticeInboxFilterGroups == null || (list = noticeInboxFilterGroups.groups) == null) {
            return Collections.singletonList(Integer.valueOf(i));
        }
        return list;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        boolean zLJI = MethodIDManager.LJI(71761);
        try {
            NoticeCountMessage noticeCountMessage = (NoticeCountMessage) JsonParseUtils.LIZLLL(NoticeCountMessage.class, new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
            if (noticeCountMessage.noticeGroup == 850) {
                C624190Oe1.LIZ(true);
            } else {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive ");
                sbLIZ.append(noticeCountMessage.noticeGroup);
                sbLIZ.append(',');
                sbLIZ.append(noticeCountMessage.noticeCount);
                sbLIZ.append(" from web socket");
                C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
                LJIILJJIL(noticeCountMessage.noticeGroup, noticeCountMessage.noticeCount);
                LJIJI(2, false);
                if (noticeCountMessage.noticeGroup == 100) {
                    ((InterfaceC801570VcR) C1906090zhX.LIZ(InterfaceC801570VcR.class)).LIZ();
                }
                InterfaceC1904340zei interfaceC1904340zei = LLJJI.get(2);
                if (interfaceC1904340zei != null) {
                    interfaceC1904340zei.LIZ();
                }
                C1904350zej.LIZ.getClass();
                if (C0XQ7.LIZJ().isEnableMultiAccountLogin() && ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI().size() > 1) {
                    LIZLLL("ws_message_triggered", ((AbstractC848400XPy) C0XQ7.LJFF()).LJJI());
                }
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZJ(Message message) {
        NoticeList noticeList;
        int i;
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if ((messageObj instanceof NoticeList) && (noticeList = (NoticeList) messageObj) != null) {
            LLJJIII = true;
            if (message.what == 2) {
                i = 8;
            } else {
                i = 0;
            }
            C2252408s6.LJIIJ("handleNoticeCountData", new C1904200zeU(noticeList, i));
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJI(String str) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getMultiUserNoticeCount ");
        sbLIZ.append(str);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        C1904260zea c1904260zeaLIZ = C1904260zea.LIZ();
        c1904260zeaLIZ.getClass();
        int iIntValue = 0;
        try {
            Integer num = c1904260zeaLIZ.LIZ.get(Long.valueOf(CastLongProtector.parseLong(str)));
            if (num != null) {
                iIntValue = num.intValue();
                return iIntValue;
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return iIntValue;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final NoticeGroupAttrs LJIILIIL(int i) {
        return (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIJ(EntranceKey entranceKey) {
        Integer num = (Integer) LJJIJIL().get(entranceKey);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIJJ(EntranceKey entranceKey) {
        Integer num = (Integer) LJJIJIL().get(entranceKey);
        if (num != null && num.intValue() != 0) {
            C1619080sEc c1619080sEc = new C1619080sEc(1);
            LJJJLIIL(entranceKey, 0, c1619080sEc);
            LJJIJIL().remove(entranceKey);
            c1619080sEc.LJ(entranceKey, 0);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("clearEntranceCountInner end ");
            sbLIZ.append(c1619080sEc);
            C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
            c1619080sEc.post();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJJ(int i) {
        List list;
        int iIntValue;
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJIL().get(Integer.valueOf(i));
        if (noticeInboxFilterGroups == null || (list = noticeInboxFilterGroups.groups) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            LL.getClass();
            Integer num = (Integer) LJJJJI().get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            i2 += iIntValue;
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final C11NZ LJJI(final NoticeList noticeList) {
        return C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zeV
            public final /* synthetic */ int LIZIZ = 8;

            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Boolean> c09aj) {
                C1C7U.LIZ("NoticeCountManager@dc34.rxInitNoticeCount$1");
                C2252408s6.LJIIJ("rxInitNoticeCount", new AwS149S0201000_28(noticeList, this.LIZIZ, (C19482611Ke) c09aj, 18));
                C1C7U.LIZIZ("NoticeCountManager@dc34.rxInitNoticeCount$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJII(com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r8, int r9) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904220zeW.LJJII(com.ss.android.ugc.aweme.notice.api.bean.EntranceKey, int):void");
    }

    public static void LJJIII(EntranceKey entranceKey, int i) {
        C0ZBF c0zbf;
        int iIntValue;
        C0ZAJ c0zaj;
        EntranceKey entranceKey2;
        int iIntValue2;
        C1619080sEc c1619080sEc = new C1619080sEc(401);
        C0ZBF c0zbfLIZ = C0ZBG.LIZ(Integer.valueOf(i));
        NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) LJJIJIIJIL().get(entranceKey);
        C0ZBI c0zbi = null;
        if (noticeGroupAttrs != null) {
            c0zbf = noticeGroupAttrs.muteType;
        } else {
            c0zbf = null;
        }
        if (c0zbf != c0zbfLIZ) {
            NoticeGroupAttrs noticeGroupAttrs2 = (NoticeGroupAttrs) LJJIJIIJIL().get(entranceKey);
            if (noticeGroupAttrs2 != null) {
                noticeGroupAttrs2.muteType = c0zbfLIZ;
            }
            NoticeGroupAttrs noticeGroupAttrs3 = (NoticeGroupAttrs) LJJIJIIJIL().get(entranceKey);
            if (noticeGroupAttrs3 != null) {
                c0zbi = noticeGroupAttrs3.archiveType;
            }
            if (c0zbi != C0ZBI.ARCHIVE) {
                Integer num = (Integer) LJJIJIL().get(entranceKey);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                NoticeGroupAttrs noticeGroupAttrs4 = (NoticeGroupAttrs) LJJIJIIJIL().get(entranceKey);
                if (noticeGroupAttrs4 != null && (c0zaj = noticeGroupAttrs4.showType) != null) {
                    int i2 = C0ZAL.LIZ[c0zaj.ordinal()];
                    int iIntValue3 = 1;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            entranceKey2 = C1904270zeb.LJI;
                        }
                    } else {
                        entranceKey2 = C1904270zeb.LJFF;
                    }
                    C0ZBF c0zbf2 = C0ZBF.MUTE;
                    if (c0zbfLIZ == c0zbf2) {
                        Integer num2 = (Integer) LJJIJIL().get(entranceKey2);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue() - iIntValue;
                        } else {
                            iIntValue2 = 0;
                        }
                    } else {
                        Integer num3 = (Integer) LJJIJIL().get(entranceKey2);
                        if (num3 != null) {
                            iIntValue2 = num3.intValue() + iIntValue;
                        } else {
                            iIntValue2 = iIntValue;
                        }
                    }
                    int iMax = Math.max(iIntValue2, 0);
                    LJJIJIL().put(entranceKey2, Integer.valueOf(iMax));
                    if (Intrinsics.LJFF(entranceKey2, C1904270zeb.LJFF) && iIntValue > 0) {
                        if (c0zbfLIZ == c0zbf2) {
                            iIntValue3 = -1;
                        }
                        ConcurrentHashMap concurrentHashMapLJJIJIL = LJJIJIL();
                        EntranceKey entranceKey3 = C1904270zeb.LJII;
                        Integer num4 = (Integer) LJJIJIL().get(entranceKey3);
                        if (num4 != null) {
                            iIntValue3 += num4.intValue();
                        }
                        concurrentHashMapLJJIJIL.put(entranceKey3, Integer.valueOf(Math.max(iIntValue3, 0)));
                    }
                    c1619080sEc.LJ(entranceKey2, iMax);
                }
            }
        }
        c1619080sEc.post();
    }

    public static void LJJIIJZLJL(int i, int i2) {
        C0ZBF c0zbf;
        int iIntValue;
        NoticeGroupAttrs noticeGroupAttrs;
        C0ZAJ c0zaj;
        int i3;
        int iIntValue2;
        C1619080sEc c1619080sEc = new C1619080sEc(401);
        C0ZBF c0zbfLIZ = C0ZBG.LIZ(Integer.valueOf(i2));
        NoticeGroupAttrs noticeGroupAttrs2 = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i));
        if (noticeGroupAttrs2 != null) {
            c0zbf = noticeGroupAttrs2.muteType;
        } else {
            c0zbf = null;
        }
        if (c0zbf != c0zbfLIZ) {
            NoticeGroupAttrs noticeGroupAttrs3 = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i));
            if (noticeGroupAttrs3 != null) {
                noticeGroupAttrs3.muteType = c0zbfLIZ;
            }
            Integer num = (Integer) LJJJJI().get(Integer.valueOf(i));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (i != 210 && i != 214 && (noticeGroupAttrs = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i))) != null && (c0zaj = noticeGroupAttrs.showType) != null) {
                int i4 = C0ZAL.LIZ[c0zaj.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        i3 = 19999;
                    }
                } else {
                    i3 = 29999;
                }
                C0ZBF c0zbf2 = C0ZBF.MUTE;
                if (c0zbfLIZ == c0zbf2) {
                    Integer num2 = (Integer) LJJJJI().get(Integer.valueOf(i3));
                    if (num2 != null) {
                        iIntValue2 = num2.intValue() - iIntValue;
                    } else {
                        iIntValue2 = 0;
                    }
                } else {
                    Integer num3 = (Integer) LJJJJI().get(Integer.valueOf(i3));
                    if (num3 != null) {
                        iIntValue2 = num3.intValue() + iIntValue;
                    } else {
                        iIntValue2 = iIntValue;
                    }
                }
                int iMax = Math.max(iIntValue2, 0);
                LJJJJI().put(Integer.valueOf(i3), Integer.valueOf(iMax));
                c1619080sEc.LIZLLL(i3, iMax);
                int iLJJIZ = LJJIZ(i, c0zaj);
                if (iLJJIZ != -1) {
                    if (c0zbfLIZ == c0zbf2) {
                        Integer num4 = (Integer) LJJJJI().get(Integer.valueOf(iLJJIZ));
                        if (num4 != null) {
                            iIntValue = num4.intValue() - iIntValue;
                        } else {
                            iIntValue = 0;
                        }
                    } else {
                        Integer num5 = (Integer) LJJJJI().get(Integer.valueOf(iLJJIZ));
                        if (num5 != null) {
                            iIntValue += num5.intValue();
                        }
                    }
                    int iMax2 = Math.max(iIntValue, 0);
                    LJJJJI().put(Integer.valueOf(iLJJIZ), Integer.valueOf(iMax2));
                    c1619080sEc.LIZLLL(iLJJIZ, iMax2);
                }
            }
        }
        c1619080sEc.post();
    }

    public static int LJJIZ(int i, C0ZAJ c0zaj) {
        NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i));
        if (noticeGroupAttrs != null && noticeGroupAttrs.isFromNotice) {
            int i2 = C0ZAL.LIZ[c0zaj.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return 30001;
                }
                return -1;
            }
            return 30000;
        }
        return -1;
    }

    public static int LJJJJJL(int i, C0ZAJ c0zaj) {
        List list;
        C0ZAJ c0zaj2;
        int iIntValue;
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJIL().get(Integer.valueOf(i));
        if (noticeInboxFilterGroups == null || (list = noticeInboxFilterGroups.groups) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            LL.getClass();
            NoticeGroupAttrs noticeGroupAttrs = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(iIntValue2));
            C0ZBF c0zbf = null;
            if (noticeGroupAttrs != null) {
                c0zaj2 = noticeGroupAttrs.showType;
            } else {
                c0zaj2 = null;
            }
            if (c0zaj2 == c0zaj) {
                NoticeGroupAttrs noticeGroupAttrs2 = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(iIntValue2));
                if (noticeGroupAttrs2 != null) {
                    c0zbf = noticeGroupAttrs2.muteType;
                }
                if (c0zbf != C0ZBF.MUTE) {
                    Integer num = (Integer) LJJJJI().get(Integer.valueOf(iIntValue2));
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    i2 += iIntValue;
                }
            }
        }
        return i2;
    }

    public static boolean LJJJJLL(NoticeList noticeList, int i) {
        List<NoticeInboxFilterGroups> groups;
        List<NoticeCount> items;
        int i2;
        ArrayList arrayList;
        NoticeCountExtra noticeCountExtra;
        FollowTabInfoStruct followTabInfoStruct;
        Integer num;
        int i3;
        ArrayList arrayList2;
        int i4 = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "handleNoticeCountData");
        C0ZAG.LIZ.getClass();
        if (C0BMK.LIZ() && !C0ZAG.LIZIZ) {
            C0ZAG.LIZJ = true;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C314760CVm(null), 2);
        }
        if (noticeList == null || (groups = noticeList.getGroups()) == null || (items = noticeList.getItems()) == null) {
            return false;
        }
        List<EntranceCount> entranceCount = noticeList.getEntranceCount();
        Long serverTime = noticeList.getServerTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleNoticeCountData exec start thread=");
        sbLIZ.append(C786410Ut5.u3());
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        System.currentTimeMillis();
        for (NoticeInboxFilterGroups noticeInboxFilterGroups : groups) {
            int i5 = noticeInboxFilterGroups.filterType;
            if (i5 == EnumC1904240zeY.FilterTimelineAll.ordinal()) {
                i3 = 36;
            } else if (i5 == 1) {
                i3 = C1904270zeb.LIZ;
            } else if (i5 == 2) {
                i3 = C1904270zeb.LIZLLL;
            } else if (i5 == 3) {
                i3 = C1904270zeb.LIZIZ;
            } else if (i5 == EnumC1904240zeY.FilterFollow.ordinal()) {
                i3 = 7;
            } else if (i5 == EnumC1904240zeY.FilterTypeQA.ordinal()) {
                i3 = 84;
            } else if (i5 == EnumC1904240zeY.FilterTypeShop.ordinal()) {
                i3 = 599;
            } else if (i5 == EnumC1904240zeY.FilterTypeAllExceptFollow.ordinal()) {
                i3 = 600;
            } else if (i5 == EnumC1904240zeY.FilterTypeFollowAndFollowRequest.ordinal()) {
                i3 = 534;
            } else if (i5 == EnumC1904240zeY.FilterTypeProfileViewer.ordinal()) {
                i3 = 601;
            } else if (i5 == EnumC1904240zeY.FilterTypeAllExceptFollowAndShop.ordinal()) {
                i3 = 602;
            } else {
                i3 = 0;
            }
            if (i3 == C1904270zeb.LIZJ) {
                List<Integer> list = noticeInboxFilterGroups.groups;
                if (list != null) {
                    arrayList2 = new ArrayList(list);
                    arrayList2.add(Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT));
                    arrayList2.removeAll(C00RL.LIZ);
                } else {
                    arrayList2 = null;
                }
                noticeInboxFilterGroups.groups = arrayList2;
            }
            LL.getClass();
            LJJIL().put(Integer.valueOf(noticeInboxFilterGroups.filterType), noticeInboxFilterGroups);
        }
        int i6 = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "handleNoticeCount");
        C1904280zec c1904280zecLJJJJZI = LJJJJZI(items, entranceCount);
        for (NoticeCount noticeCount : items) {
            LL.getClass();
            if ((((Number) C296100Bj6.LIZ.getValue()).intValue() & 2) == 0 && (noticeCountExtra = noticeCount.extra) != null && (followTabInfoStruct = noticeCountExtra.followTabInfo) != null && (num = followTabInfoStruct.level) != null) {
                int iIntValue = num.intValue();
                int i7 = noticeCount.group;
                C1440005kM.LIZ(new C607840Nsk(i7, iIntValue, followTabInfoStruct.followeeInfo, followTabInfoStruct.serverTriggerTime, 0, 16));
                String str = followTabInfoStruct.prioritizedItemId;
                if (str != null) {
                    StringBuilder sb = new StringBuilder();
                    int length = str.length();
                    for (int i8 = 0; i8 < length; i8++) {
                        char cCharAt = str.charAt(i8);
                        if (i7 == 39) {
                            sb.append(cCharAt);
                        }
                    }
                    String string = sb.toString();
                    if (string != null) {
                        C1440005kM.LIZ(new C1564190qo5(string));
                    }
                }
            }
        }
        if (i != 2) {
            if (i != 8) {
                i2 = 100;
            } else {
                i2 = 301;
            }
        } else {
            i2 = 201;
        }
        C1619080sEc c1619080sEc = new C1619080sEc(i2, 0);
        c1619080sEc.LJ = i;
        for (Map.Entry<Integer, Integer> entry : c1904280zecLJJJJZI.LIZ.entrySet()) {
            c1619080sEc.LIZLLL(entry.getKey().intValue(), entry.getValue().intValue());
        }
        for (Map.Entry<EntranceKey, Integer> entry2 : c1904280zecLJJJJZI.LIZIZ.entrySet()) {
            c1619080sEc.LJ(entry2.getKey(), entry2.getValue().intValue());
        }
        Integer num2 = (Integer) LJJJJI().get(29999);
        if (num2 != null) {
            c1619080sEc.LIZLLL(29999, num2.intValue());
        }
        ConcurrentHashMap concurrentHashMapLJJIJIL = LJJIJIL();
        EntranceKey entranceKey = C1904270zeb.LJFF;
        Integer num3 = (Integer) concurrentHashMapLJJIJIL.get(entranceKey);
        if (num3 != null) {
            c1619080sEc.LJ(entranceKey, num3.intValue());
        }
        ConcurrentHashMap concurrentHashMapLJJIJIL2 = LJJIJIL();
        EntranceKey entranceKey2 = C1904270zeb.LJI;
        Integer num4 = (Integer) concurrentHashMapLJJIJIL2.get(entranceKey2);
        if (num4 != null) {
            c1619080sEc.LJ(entranceKey2, num4.intValue());
        }
        ConcurrentHashMap concurrentHashMapLJJIJIL3 = LJJIJIL();
        EntranceKey entranceKey3 = C1904270zeb.LJII;
        Integer num5 = (Integer) concurrentHashMapLJJIJIL3.get(entranceKey3);
        if (num5 != null) {
            c1619080sEc.LJ(entranceKey3, num5.intValue());
        }
        Integer num6 = (Integer) LJJJJI().get(19999);
        if (num6 != null) {
            c1619080sEc.LIZLLL(19999, num6.intValue());
        }
        Integer num7 = (Integer) LJJJJI().get(30000);
        if (num7 != null) {
            c1619080sEc.LIZLLL(30000, num7.intValue());
        }
        c1619080sEc.postSticky();
        int i9 = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "postNoticeCountChangedEvent end " + c1619080sEc);
        if (((Number) C0BM5.LIZ.getValue()).intValue() > 0 && i != 8) {
            LLJILJILJ = entranceCount;
            LLJILLL = serverTime;
            C1440005kM.LIZIZ(new C1902910zcP(entranceCount, serverTime));
        }
        List<KeyValueModel> groupMapping = noticeList.getGroupMapping();
        if (groupMapping != null) {
            for (KeyValueModel keyValueModel : groupMapping) {
                int i10 = CastIntegerProtector.parseInt(keyValueModel.key);
                int i11 = CastIntegerProtector.parseInt(keyValueModel.value);
                Integer numValueOf = Integer.valueOf(i10);
                Integer numValueOf2 = Integer.valueOf(i11);
                LL.getClass();
                ((ConcurrentHashMap) LLILZIL.getValue()).put(numValueOf, numValueOf2);
                C01GW c01gw = LLILZLL;
                if (((ConcurrentHashMap) c01gw.getValue()).containsKey(Integer.valueOf(i11))) {
                    Collection collection = (Collection) ((ConcurrentHashMap) c01gw.getValue()).get(Integer.valueOf(i11));
                    if (collection != null) {
                        arrayList = new ArrayList(collection);
                    } else {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(i10));
                } else {
                    ((ConcurrentHashMap) c01gw.getValue()).put(Integer.valueOf(i11), Collections.singletonList(Integer.valueOf(i10)));
                }
            }
        }
        int i12 = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "handleNoticeCountData exec end");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0252 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1904280zec LJJJJZI(java.util.List r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 753
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904220zeW.LJJJJZI(java.util.List, java.util.List):X.0zec");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LIZLLL(String str, List list) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMultiUserNoticeCount ");
        sbLIZ.append(list);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        C1904260zea c1904260zeaLIZ = C1904260zea.LIZ();
        c1904260zeaLIZ.getClass();
        boolean zLJI = MethodIDManager.LJI(137298);
        if (C10EU.LJIIIIZZ()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else if (C086I.LIZIZ(list)) {
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
        } else {
            C0OC5.LIZ.LIZ(TextUtils.join(",", list), C1901540zaC.LIZIZ()).LJ(new C19335310kh(c1904260zeaLIZ, str, 13), C15O7.LJI, null);
            if (!zLJI) {
                return;
            }
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIIIZ(EntranceKey entranceKey, int i) {
        int i2;
        int i3;
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setEntranceCount ");
        sbLIZ.append(entranceKey);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        Integer num = (Integer) LJJIJIL().get(entranceKey);
        if (num != null && num.intValue() == i2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setEntranceCount ");
            sbLIZ2.append(entranceKey);
            sbLIZ2.append(" same break");
            C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (Intrinsics.LJFF(entranceKey, C1904270zeb.LJIIIIZZ)) {
            i3 = 3;
        } else {
            i3 = 1;
        }
        C1619080sEc c1619080sEc = new C1619080sEc(i3);
        LJJJLIIL(entranceKey, i, c1619080sEc);
        LJJIJIL().put(entranceKey, Integer.valueOf(i2));
        c1619080sEc.LJ(entranceKey, i2);
        c1619080sEc.post();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("setEntranceCount end ");
        sbLIZ3.append(c1619080sEc);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIJ(int[] iArr, boolean z) {
        int iLJIIL = 0;
        for (int i : iArr) {
            iLJIIL += LL.LJIIL(i, z);
        }
        return iLJIIL;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final int LJIIL(int i, boolean z) {
        List<Integer> listSingletonList;
        int iIntValue;
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJIL().get(Integer.valueOf(C1904250zeZ.LIZ(i)));
        if (noticeInboxFilterGroups == null || (listSingletonList = noticeInboxFilterGroups.groups) == null || z) {
            listSingletonList = Collections.singletonList(Integer.valueOf(i));
        }
        Iterator<Integer> it2 = listSingletonList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int iIntValue2 = it2.next().intValue();
            LL.getClass();
            Integer num = (Integer) LJJJJI().get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            i2 += iIntValue;
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIILJJIL(int i, int i2) {
        int i3;
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setNoticeCount ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(i2);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        if (i2 < 0) {
            i2 = 0;
        }
        Integer num = (Integer) LJJJJI().get(Integer.valueOf(i));
        if (num == null) {
            if (i2 == 0) {
                LJJJJI().put(Integer.valueOf(i), Integer.valueOf(i2));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setNoticeCount ");
                sbLIZ2.append(i);
                sbLIZ2.append(" init break");
                C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (i != 99 && i != 101) {
                    i3 = 1;
                } else {
                    i3 = 3;
                }
                C1619080sEc c1619080sEc = new C1619080sEc(i3);
                c1619080sEc.LIZLLL(i, i2);
                c1619080sEc.post();
                return;
            }
            num = 0;
        }
        if (num.intValue() == i2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("setNoticeCount ");
            sbLIZ3.append(i);
            sbLIZ3.append(" same break");
            C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        C2252408s6.LJIIJ("setNoticeCount", new C1904230zeX(i, i2));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJIJI(int i, boolean z) {
        C01GW c01gw = LLJJ;
        if (!((IAccountUserService) c01gw.getValue()).isLogin() || TextUtils.isEmpty(((IAccountUserService) c01gw.getValue()).getCurUserId()) || ((IAccountUserService) c01gw.getValue()).LIZ()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z && jCurrentTimeMillis < LLILLJJLI + 300000) {
            return;
        }
        LLILLJJLI = jCurrentTimeMillis;
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("NCManager", "fetchNoticeCount");
        Calendar calendar = Calendar.getInstance();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "source");
        c2344009Gk.LIZJ(calendar.get(11), "hour");
        C20684815ws.LJIILLIIL("do_notice_count_fetch", c2344009Gk.LIZ);
        C2252408s6.LIZ(new AwS63S0001000_28(i, 6));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJJIFFI(EnumC624380OeK enumC624380OeK, int[] iArr) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearNoticeCountByFilterType ");
        sbLIZ.append(Arrays.toString(iArr));
        sbLIZ.append(' ');
        sbLIZ.append(enumC624380OeK);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        C2252408s6.LJIIJ("clearNoticeCountByFilterType", new AwS429S0200000_28(enumC624380OeK, iArr, 174));
    }

    public static void LJJIIJ(int i, int i2, int i3) {
        NoticeInboxFilterGroups noticeInboxFilterGroups;
        List<Integer> list;
        LJJIIJZLJL(i, i2);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("inbox_mute_group_message", true) && (noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJIL().get(Integer.valueOf(i3))) != null && (list = noticeInboxFilterGroups.groups) != null) {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                LL.getClass();
                LJJIIJZLJL(iIntValue, i2);
            }
        }
    }

    public static void LJJJJZ(int i, int i2, C1619080sEc c1619080sEc) {
        NoticeGroupAttrs noticeGroupAttrs;
        C0ZAJ c0zaj;
        C0ZBF c0zbf;
        int i3;
        int iIntValue;
        Integer num = (Integer) LJJJJI().get(Integer.valueOf(i));
        if (num != null) {
            i2 -= num.intValue();
        }
        if (i2 != 0 && (noticeGroupAttrs = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i))) != null && (c0zaj = noticeGroupAttrs.showType) != null) {
            NoticeGroupAttrs noticeGroupAttrs2 = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i));
            if (noticeGroupAttrs2 == null || (c0zbf = noticeGroupAttrs2.muteType) == null) {
                c0zbf = C0ZBF.UN_MUTE;
            }
            if (c0zbf == C0ZBF.MUTE) {
                i2 = 0;
            }
            if (i != 210 && i != 214 && i != 342) {
                int i4 = C0ZAL.LIZ[c0zaj.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    } else {
                        i3 = 19999;
                    }
                } else {
                    i3 = 29999;
                }
                Integer num2 = (Integer) LJJJJI().get(Integer.valueOf(i3));
                if (num2 != null) {
                    iIntValue = num2.intValue() + i2;
                } else {
                    iIntValue = i2;
                }
                LJJJJI().put(Integer.valueOf(i3), Integer.valueOf(iIntValue));
                c1619080sEc.LIZLLL(i3, iIntValue);
                int iLJJIZ = LJJIZ(i, c0zaj);
                if (iLJJIZ != -1) {
                    Integer num3 = (Integer) LJJJJI().get(Integer.valueOf(iLJJIZ));
                    if (num3 != null) {
                        i2 += num3.intValue();
                    }
                    LJJJJI().put(Integer.valueOf(iLJJIZ), Integer.valueOf(i2));
                    c1619080sEc.LIZLLL(i3, i2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJLIIL(com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r8, int r9, X.C1619080sEc r10) {
        /*
            com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r0 = X.C1904270zeb.LJIIIIZZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.ConcurrentHashMap r0 = LJJIJIL()
            java.lang.Object r0 = r0.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r5 = 0
            if (r0 == 0) goto L1f
            int r7 = r0.intValue()
        L1a:
            int r3 = r9 - r7
            if (r3 != 0) goto L21
            return
        L1f:
            r7 = 0
            goto L1a
        L21:
            java.util.concurrent.ConcurrentHashMap r0 = LJJIJIIJIL()
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r0
            if (r0 == 0) goto Lb8
            X.0ZAJ r2 = r0.showType
            if (r2 == 0) goto Lb8
            java.util.concurrent.ConcurrentHashMap r0 = LJJIJIIJIL()
            java.lang.Object r0 = r0.get(r8)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r0
            if (r0 == 0) goto L41
            X.0ZBF r1 = r0.muteType
            if (r1 != 0) goto L43
        L41:
            X.0ZBF r1 = X.C0ZBF.UN_MUTE
        L43:
            X.0ZBF r0 = X.C0ZBF.MUTE
            if (r1 != r0) goto L48
            r3 = 0
        L48:
            int[] r1 = X.C0ZAL.LIZ
            int r0 = r2.ordinal()
            r1 = r1[r0]
            r6 = 1
            if (r1 == r6) goto L5a
            r0 = 2
            if (r1 == r0) goto L57
            return
        L57:
            com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r4 = X.C1904270zeb.LJI
            goto L5c
        L5a:
            com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r4 = X.C1904270zeb.LJFF
        L5c:
            java.util.concurrent.ConcurrentHashMap r0 = LJJIJIL()
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L6d
            int r0 = r0.intValue()
            int r3 = r3 + r0
        L6d:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap r0 = LJJIJIL()
            r0.put(r4, r1)
            com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r0 = X.C1904270zeb.LJFF
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto Lac
            if (r7 <= 0) goto Lb6
            r1 = 1
        L83:
            if (r9 <= 0) goto Lb4
            r0 = 1
        L86:
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto Lac
        L8a:
            java.util.concurrent.ConcurrentHashMap r2 = LJJIJIL()
            com.ss.android.ugc.aweme.notice.api.bean.EntranceKey r1 = X.C1904270zeb.LJII
            java.util.concurrent.ConcurrentHashMap r0 = LJJIJIL()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto La1
            int r0 = r0.intValue()
            int r6 = r6 + r0
        La1:
            int r0 = java.lang.Math.max(r6, r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r1, r0)
        Lac:
            r10.LJ(r4, r3)
            return
        Lb0:
            if (r0 != 0) goto Lac
            r6 = -1
            goto L8a
        Lb4:
            r0 = 0
            goto L86
        Lb6:
            r1 = 0
            goto L83
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904220zeW.LJJJLIIL(com.ss.android.ugc.aweme.notice.api.bean.EntranceKey, int, X.0sEc):void");
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJ(int i, EnumC624380OeK enumC624380OeK, boolean z) {
        List<Integer> listSingletonList;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearNoticeCountSynchronously ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(enumC624380OeK);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        NoticeInboxFilterGroups noticeInboxFilterGroups = (NoticeInboxFilterGroups) LJJIL().get(Integer.valueOf(C1904250zeZ.LIZ(i)));
        if (noticeInboxFilterGroups == null || (listSingletonList = noticeInboxFilterGroups.groups) == null || z) {
            listSingletonList = Collections.singletonList(Integer.valueOf(i));
        }
        C1619080sEc c1619080sEc = new C1619080sEc(1);
        Iterator<Integer> it2 = listSingletonList.iterator();
        while (it2.hasNext()) {
            LL.LJJIIZI(it2.next().intValue(), enumC624380OeK, c1619080sEc);
        }
        c1619080sEc.post();
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clearNoticeCountSynchronously end ");
        sbLIZ2.append(c1619080sEc);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    public final void LJFF(EnumC624380OeK enumC624380OeK, boolean z, int[] iArr) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearNoticeCount ");
        sbLIZ.append(Arrays.toString(iArr));
        sbLIZ.append(' ');
        sbLIZ.append(enumC624380OeK);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        C2252408s6.LJIIJ("clearNoticeCount", new AwS105S0210000_28(enumC624380OeK, z, iArr, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // com.ss.android.ugc.aweme.notice.api.services.INoticeCountService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(X.EnumC624380OeK r12, boolean r13, int[] r14) {
        /*
            r11 = this;
            int r5 = r14.length
            r10 = 0
            r4 = 0
        L3:
            if (r4 >= r5) goto Lbb
            r9 = r14[r4]
            X.0zeW r0 = X.C1904220zeW.LL
            r0.getClass()
            r8 = 1
            if (r13 != 0) goto L66
            java.util.concurrent.ConcurrentHashMap r1 = LJJIL()
            int r0 = X.C1904250zeZ.LIZ(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeInboxFilterGroups) r0
            if (r0 == 0) goto L66
            java.util.List<java.lang.Integer> r1 = r0.groups
            if (r1 == 0) goto L66
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r1.iterator()
        L30:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r6 = r7.next()
            r1 = r6
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            if (r12 == 0) goto L5c
            X.0zeW r1 = X.C1904220zeW.LL
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r2 = LJJJJ()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r2.get(r1)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r1 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r1
            if (r1 == 0) goto L30
            X.0OeK r1 = r1.clearOccasion
            if (r12 != r1) goto L30
        L5c:
            r0.add(r6)
            goto L30
        L60:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L84
        L66:
            if (r12 == 0) goto L7c
            java.util.concurrent.ConcurrentHashMap r1 = LJJJJ()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs r0 = (com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs) r0
            if (r0 == 0) goto Lb4
            X.0OeK r0 = r0.clearOccasion
            if (r12 != r0) goto Lb4
        L7c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L84:
            java.util.Iterator r3 = r0.iterator()
        L88:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            X.0zeW r0 = X.C1904220zeW.LL
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = LJJJJI()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L88
            int r0 = r0.intValue()
            if (r0 <= 0) goto L88
            return r8
        Lb4:
            X.13BV r0 = X.C13BV.INSTANCE
            goto L84
        Lb7:
            int r4 = r4 + 1
            goto L3
        Lbb:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1904220zeW.LJIIIIZZ(X.0OeK, boolean, int[]):boolean");
    }

    public final void LJJIIZI(int i, EnumC624380OeK enumC624380OeK, C1619080sEc c1619080sEc) {
        Integer num;
        List list;
        int iLJIIL = LJIIL(i, true);
        LJJIIZ(i, 0, enumC624380OeK, c1619080sEc);
        ArrayList arrayList = new ArrayList();
        C01GW c01gw = LLILZLL;
        if (!((ConcurrentHashMap) c01gw.getValue()).isEmpty() && (list = (List) ((ConcurrentHashMap) c01gw.getValue()).get(Integer.valueOf(i))) != null && (!list.isEmpty())) {
            arrayList.addAll(list);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            LL.getClass();
            LJJIIZ(iIntValue, 0, enumC624380OeK, c1619080sEc);
        }
        C01GW c01gw2 = LLILZIL;
        if (!((ConcurrentHashMap) c01gw2.getValue()).isEmpty() && (num = (Integer) ((ConcurrentHashMap) c01gw2.getValue()).get(Integer.valueOf(i))) != null) {
            int iIntValue2 = num.intValue();
            LJJIIZ(iIntValue2, Math.max(LL.LJIIL(iIntValue2, true) - iLJIIL, 0), enumC624380OeK, c1619080sEc);
        }
    }

    public static void LJJIIZ(int i, int i2, EnumC624380OeK enumC624380OeK, C1619080sEc c1619080sEc) {
        NoticeGroupAttrs noticeGroupAttrs;
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearNoticeCountInner ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(enumC624380OeK);
        C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ));
        Integer num = (Integer) LJJJJI().get(Integer.valueOf(i));
        if (num != null && num.intValue() != 0) {
            if (enumC624380OeK != null && ((noticeGroupAttrs = (NoticeGroupAttrs) LJJJJ().get(Integer.valueOf(i))) == null || noticeGroupAttrs.clearOccasion != enumC624380OeK)) {
                return;
            }
            LJJJJZ(i, i2, c1619080sEc);
            LJJJJI().remove(Integer.valueOf(i));
            c1619080sEc.LIZLLL(i, i2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("clearNoticeCountInner end ");
            sbLIZ2.append(c1619080sEc);
            C1720106oR.LJI("NCManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
