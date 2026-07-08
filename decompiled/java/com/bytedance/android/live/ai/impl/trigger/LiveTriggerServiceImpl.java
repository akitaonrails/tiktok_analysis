package com.bytedance.android.live.ai.impl.trigger;

import X.AbstractC2203101BKi;
import X.C01GW;
import X.C01JQ;
import X.C0J0V;
import X.C1100830ekj;
import X.C1105270ert;
import X.C1106700euC;
import X.C13LP;
import X.C1472420oQ4;
import X.C157V;
import X.C182200my;
import X.C20430714wz;
import X.C2188811AlT;
import X.C2203061BKe;
import X.C2203071BKf;
import X.C2203091BKh;
import X.C500260Jjc;
import X.C5183020f;
import X.C776250Uch;
import X.InterfaceC1145110fu9;
import X.InterfaceC20489715Fn;
import Y.ARunnableS120S0100000_20;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.ai.api.trigger.ILiveTriggerService;
import com.bytedance.android.livesdk.dataChannel.WatchDurationChannel;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public class LiveTriggerServiceImpl implements ILiveTriggerService {
    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void Xh2() {
        List<AbstractC2203101BKi> list = (List) C2203061BKe.LJFF.getValue();
        if (list != null) {
            for (AbstractC2203101BKi abstractC2203101BKi : list) {
                C157V c157v = (C157V) C20430714wz.LIZ.getValue();
                if (c157v != null) {
                    c157v.LJ(abstractC2203101BKi.getName(), new AwS613S0100000_34(abstractC2203101BKi, 1));
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) C2203061BKe.LIZIZ.getValue()).entrySet()) {
            C182200my c182200my = (C182200my) entry.getValue();
            Object key = entry.getKey();
            for (C2203071BKf c2203071BKf : c182200my.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c2203071BKf.LIZJ);
                sbLIZ.append(" + ");
                sbLIZ.append(c2203071BKf.LIZIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Object linkedHashMap2 = linkedHashMap.get(strLIZIZ);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(strLIZIZ, linkedHashMap2);
                }
                ((Map) linkedHashMap2).put(key, c2203071BKf);
            }
        }
        for (Map map : linkedHashMap.values()) {
            if (!map.isEmpty()) {
                C01GW c01gw = C20430714wz.LIZ;
                String str = ((C2203071BKf) C13LP.LJJJJZ(map.values())).LIZJ;
                String str2 = ((C2203071BKf) C13LP.LJJJJZ(map.values())).LIZIZ;
                C2203091BKh c2203091BKh = new C2203091BKh(map);
                C157V c157v2 = (C157V) C20430714wz.LIZ.getValue();
                if (c157v2 != null) {
                    c157v2.LJIILJJIL(str, str2, new AwS613S0100000_34(c2203091BKh, 0), new AwS578S0100000_34(c2203091BKh, 5), new AwS648S0100000_34(c2203091BKh, 4));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void Fl2(InterfaceC1145110fu9 interfaceC1145110fu9) {
        AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
        Iterator<String> it2 = interfaceC1145110fu9.LIZ().iterator();
        while (it2.hasNext()) {
            C2203061BKe.LJI.put(it2.next(), interfaceC1145110fu9);
        }
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void Xn0(C1100830ekj c1100830ekj) {
        C2203061BKe.LJIIIIZZ = c1100830ekj;
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void hC(InterfaceC1145110fu9 interfaceC1145110fu9) {
        AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
        Iterator<String> it2 = interfaceC1145110fu9.LIZ().iterator();
        while (it2.hasNext()) {
            C2203061BKe.LJI.remove(it2.next());
        }
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void J9(Fragment fragment, DataChannel dataChannel) {
        IMessageManager iMessageManager;
        C2203061BKe.LJIIIZ = 0L;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            Iterator it2 = ((Map) C2203061BKe.LIZJ.getValue()).keySet().iterator();
            while (it2.hasNext()) {
                iMessageManager.removeMessageListener(((Number) it2.next()).intValue(), (C1105270ert) C2203061BKe.LIZLLL.getValue());
            }
        }
        List list = (List) C2203061BKe.LJ.getValue();
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((InterfaceC20489715Fn) it3.next()).Ig();
            }
        }
        List list2 = (List) C2203061BKe.LJFF.getValue();
        if (list2 != null) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((AbstractC2203101BKi) it4.next()).LIZJ();
            }
        }
        C0J0V.LIZ = 0L;
        C0J0V.LIZIZ = false;
        C2203061BKe.LJIIJ = null;
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void g0(Fragment fragment, DataChannel dataChannel) {
        long jLJJLIIIJ;
        Function0<Long> function0;
        IMessageManager iMessageManager;
        AtomicBoolean atomicBoolean = C2203061BKe.LIZ;
        if (dataChannel != null) {
            jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannel);
        } else {
            jLJJLIIIJ = 0;
        }
        C2203061BKe.LJIIIZ = jLJJLIIIJ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            Iterator it2 = ((Map) C2203061BKe.LIZJ.getValue()).keySet().iterator();
            while (it2.hasNext()) {
                iMessageManager.addAsyncMessageListener(((Number) it2.next()).intValue(), (C1105270ert) C2203061BKe.LIZLLL.getValue());
            }
        }
        List list = (List) C2203061BKe.LJ.getValue();
        if (list != null) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ((InterfaceC20489715Fn) it3.next()).g0(fragment, dataChannel);
            }
        }
        List list2 = (List) C2203061BKe.LJFF.getValue();
        if (list2 != null) {
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((AbstractC2203101BKi) it4.next()).LIZIZ(fragment, dataChannel);
            }
        }
        C0J0V.LIZ = System.currentTimeMillis();
        C0J0V.LIZIZ = true;
        if (C2203061BKe.LIZ.compareAndSet(false, true)) {
            List<String> cepPkgCoverageReportList = LiveClientTriggerConfig.INSTANCE.getCepPkgCoverageReportList();
            if (true ^ cepPkgCoverageReportList.isEmpty()) {
                ((ExecutorService) C1472420oQ4.LIZIZ.getValue()).submit(new ARunnableS120S0100000_20(cepPkgCoverageReportList, 339));
            }
        }
        if (dataChannel != null) {
            function0 = (Function0) dataChannel.gg0(WatchDurationChannel.class);
        } else {
            function0 = null;
        }
        C2203061BKe.LJIIJ = function0;
    }

    @Override // com.bytedance.android.live.ai.api.trigger.ILiveTriggerService
    public final void NE(String str, long j, List list, C01JQ c01jq, C5183020f c5183020f) {
        C1106700euC.LIZ(str, j, "client_large_scale_trigger", list, c01jq, c5183020f);
    }
}
