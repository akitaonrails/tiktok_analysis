package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.tracker.event.AdBaseEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS294S0300000_16;

/* JADX INFO: renamed from: X.0cjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1023470cjx extends AbstractC1023360cjm implements InterfaceC1023590ck9 {
    public AbstractC1023470cjx(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // X.AbstractC1023360cjm
    public final CommonAdData getCommonAdData(C1196804mE c1196804mE) {
        CommonAdData commonAdData = (CommonAdData) c1196804mE.LIZ(CommonAdData.class);
        if (commonAdData == null) {
            CommonAdData commonAdData2 = (CommonAdData) c1196804mE.LIZ(AwemeRawAd.class);
            if (commonAdData2 == null) {
                Aweme aweme = (Aweme) c1196804mE.LIZ(Aweme.class);
                if (aweme != null) {
                    return C1017070cZd.LJJIJLIJ(aweme);
                }
                return null;
            }
            return commonAdData2;
        }
        return commonAdData;
    }

    private final <T extends AdBaseEvent> Map<String, Object> logEventInner(T t, Function2<? super T, ? super C1023640ckE, Unit> function2) {
        C1023640ckE c1023640ckE = new C1023640ckE(new Object[0]);
        t.getClass();
        c1023640ckE.withLogicProvider(getAdLogics(new C1023960ckk(null, null, null, new InterfaceC1023650ckF[0], new InterfaceC1023650ckF[0]), c1023640ckE));
        if (function2 != null) {
            function2.invoke(t, c1023640ckE);
        }
        Map<String, C2805016t> map = t.LIZIZ;
        ArrayList arrayList = new ArrayList(map.size());
        for (final Map.Entry<String, C2805016t> entry : map.entrySet()) {
            arrayList.add(new InterfaceC1023650ckF<Object, Object>(entry) { // from class: X.0ck2
                public final String LIZ;
                public final boolean LIZIZ;

                @Override // X.InterfaceC1023650ckF
                public final Object LIZ(Object obj) {
                    return obj;
                }

                @Override // X.InterfaceC1023650ckF
                public final Function1<C1196804mE, Object> LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1023650ckF
                public final boolean LIZJ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1023650ckF
                public final String getName() {
                    return this.LIZ;
                }

                {
                    this.LIZ = entry.getKey();
                    this.LIZIZ = entry.getValue().LIZ;
                }
            });
        }
        getParams((InterfaceC1023650ckF<?, ?>[]) arrayList.toArray(new C1023520ck2[0]), c1023640ckE);
        t.LIZLLL();
        throw null;
    }

    @Override // X.AbstractC1023360cjm
    public final InterfaceC1126004ao getAdLogics(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, C1023640ckE c1023640ckE) {
        C1023480cjy.LIZ.getClass();
        final C1023630ckD[] c1023630ckDArr = {new C1023630ckD(C1023480cjy.LIZIZ, new C1023430cjt(interfaceC1023400cjq)), new C1023630ckD(C1023480cjy.LIZJ, new C1023550ck5(interfaceC1023400cjq)), new C1023630ckD(C1023480cjy.LIZLLL, new C1023580ck8()), new C1023630ckD(C1023480cjy.LJFF, new C1023440cju(this)), new C1023630ckD(C1023480cjy.LJIIIZ, new C1023450cjv(this)), new C1023630ckD(C1023480cjy.LJI, new C1023560ck6(this)), new C1023630ckD(C1023480cjy.LJIIJ, new C1023460cjw(this)), new C1023630ckD(C1023480cjy.LJIIJJI, new C1023530ck3(this)), new C1023630ckD(C1023480cjy.LJIIIIZZ, new C1023540ck4()), new C1023630ckD(C1023480cjy.LJ, new C1023570ck7()), new C1023630ckD(C1023480cjy.LJII, new C1023420cjs(this, interfaceC1023400cjq, c1023640ckE))};
        return new InterfaceC1126004ao(c1023630ckDArr) { // from class: X.0ckB
            public final Map<String, Function1<C1196804mE, Object>> LIZ;

            @Override // X.InterfaceC1126004ao
            public final Map<String, Function1<C1196804mE, Object>> getProvidedLogics() {
                return this.LIZ;
            }

            {
                int iLIZIZ = C2097908Jt.LIZIZ(c1023630ckDArr.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
                for (C1023630ckD<?> c1023630ckD : c1023630ckDArr) {
                    linkedHashMap.put(c1023630ckD.LIZ.getName(), c1023630ckD);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), ((C1023630ckD) entry.getValue()).LIZIZ);
                }
                this.LIZ = new LinkedHashMap(linkedHashMap2);
            }
        };
    }

    public <T extends AdBaseEvent> void logAdEvent(T t, AwemeRawAd awemeRawAd, Function2<? super T, ? super C1023640ckE, Unit> function2) {
        Map<String, Object> mapLogEventInner = logEventInner(t, new AwS294S0300000_16(this, (AbstractC1023470cjx) awemeRawAd, (AwemeRawAd) function2, 0));
        if (mapLogEventInner != null) {
            t.getClass();
            sendAdInternal(null, null, awemeRawAd, mapLogEventInner);
        }
    }

    @Override // X.AbstractC1023360cjm
    public final void sendAdInternal(InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, CommonAdData commonAdData, Map<String, ? extends Object> map) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_rich_log_helper", false)) {
            C1020230cej c1020230cejLIZ = C1020240cek.LIZ(interfaceC1023400cjq.getEventId().getFirst(), interfaceC1023400cjq.getEventId().getSecond(), commonAdData);
            c1020230cejLIZ.LIZLLL(map);
            c1020230cejLIZ.LJ();
        } else {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(interfaceC1023400cjq.getEventId().getFirst(), interfaceC1023400cjq.getEventId().getSecond(), commonAdData);
            c1022820ciuLIZLLL.LIZLLL(map);
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.AbstractC1023360cjm
    public final void sendAdInternal(String str, String str2, CommonAdData commonAdData, Map<String, ? extends Object> map) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_rich_log_helper", false)) {
            C1020230cej c1020230cejLIZ = C1020240cek.LIZ(str, str2, commonAdData);
            c1020230cejLIZ.LIZLLL(map);
            c1020230cejLIZ.LJ();
        } else {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str, str2, commonAdData);
            c1022820ciuLIZLLL.LIZLLL(map);
            c1022820ciuLIZLLL.LJII();
        }
    }

    public <T extends AdBaseEvent> void logAdEvent(T t, String str, String str2, String str3, Function2<? super T, ? super C1023640ckE, Unit> function2) {
        Map<String, Object> mapLogEventInner = logEventInner(t, new C1023510ck1(this, str, str2, str3, function2));
        t.getClass();
        sendAdInternal(null, null, str, str2, str3, mapLogEventInner);
    }

    @Override // X.AbstractC1023360cjm
    public final void sendAdInternal(String str, String str2, String str3, String str4, String str5, Map<String, ? extends Object> map) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_rich_log_helper", false)) {
            C1020230cej c1020230cejLIZIZ = C1020240cek.LIZIZ(str, str2, str3, str4, str5);
            c1020230cejLIZIZ.LIZLLL(map);
            c1020230cejLIZIZ.LJ();
        } else {
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, str2, str3, str4, str5);
            c1022820ciuLJ.LIZLLL(map);
            c1022820ciuLJ.LJII();
        }
    }
}
