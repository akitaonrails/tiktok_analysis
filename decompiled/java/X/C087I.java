package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.recorder.navi.featureflags.TiktokAvatarLokiConfig;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolveEffectsResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolvedEffect;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS212S0300000_3;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.087I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C087I implements MessageCenter.Listener {
    public static final String LLILZLL = ((TiktokAvatarLokiConfig.TiktokAvatarLokiConfigData) TiktokAvatarLokiConfig.LIZIZ.getValue()).lokiPanelName;
    public static final C443120HZe<Integer, Integer, Integer> LLIZ = new C443120HZe<>(8194, 0, 0);
    public static final C443120HZe<Integer, Long, Long> LLIZLLLIL = new C443120HZe<>(66668, 1L, 0L);
    public final InterfaceC1635390sev LL;
    public final InterfaceC2032907xn LLILLJJLI;
    public final InterfaceC19428410zi LLILLL;
    public final NaviVideoCreationService LLILZ;
    public C11NJ LLILZIL;

    public C087I(InterfaceC1635390sev interfaceC1635390sev, C19428310zh c19428310zh, C20672087y c20672087y) {
        NaviVideoCreationService.LIZ.getClass();
        NaviVideoCreationService naviVideoCreationServiceLIZ = C0XST.LIZ();
        this.LL = interfaceC1635390sev;
        this.LLILLJJLI = c19428310zh;
        this.LLILLL = c20672087y;
        this.LLILZ = naviVideoCreationServiceLIZ;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C443120HZe<Integer, Integer, Integer> c443120HZe = LLIZ;
        if (i == c443120HZe.getFirst().intValue() && i2 == c443120HZe.getSecond().intValue() && i3 == c443120HZe.getThird().intValue() && str != null) {
            C201955140j.LIZIZ("JEFF", "Download message received");
            final ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i4));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Parsed paths ");
                sbLIZ.append(arrayList);
                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                C11NJ c11nj = this.LLILZIL;
                if (c11nj != null) {
                    c11nj.LIZ(this.LLILZ.resolveEffects(LLILZLL, GsonProtectorUtils.toJson(new Gson(), arrayList)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.07zs
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            String str2;
                            C1C7U.LIZ("LazyPrefabLoader@6f00.downloadEffectNaviService$1");
                            ResolveEffectsResponse resolveEffectsResponse = (ResolveEffectsResponse) obj;
                            List<ResolvedEffect> list = resolveEffectsResponse.resolvedEffects;
                            if (list != null && !list.isEmpty()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Resolved effects ");
                                sbLIZ2.append(resolveEffectsResponse.resolvedEffects);
                                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ2));
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (ResolvedEffect resolvedEffect : resolveEffectsResponse.resolvedEffects) {
                                    String str3 = resolvedEffect.effectId;
                                    if (str3 != null && (str2 = resolvedEffect.path) != null) {
                                        linkedHashMap.put(str2, str3);
                                    }
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Effects to download ");
                                sbLIZ3.append(linkedHashMap.values());
                                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ3));
                                this.LL.LL.LJFF(C13LP.LLIIII(linkedHashMap.values()), true, null, new C2500409r0(new AwS212S0300000_3((List) arrayList, (List<String>) this.LL, (C087I) linkedHashMap, (Map<String, String>) 9), 0));
                            }
                            C1C7U.LIZIZ("LazyPrefabLoader@6f00.downloadEffectNaviService$1");
                        }
                    }, new C09JN() { // from class: X.07xZ
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("LazyPrefabLoader@6f00.downloadEffectNaviService$2");
                            C201955140j.LJI("JEFF", (Throwable) obj);
                            C1C7U.LIZIZ("LazyPrefabLoader@6f00.downloadEffectNaviService$2");
                        }
                    }));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Parse exception, ");
                sbLIZ2.append(e);
                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }
}
