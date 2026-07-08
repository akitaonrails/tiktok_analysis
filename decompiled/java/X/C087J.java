package X;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.NaviAvatarLokiConfig;
import com.ss.android.ugc.gamora.recorder.navi.core.MessageReceiverLifecycleImpl;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolveEffectsResponse;
import com.ss.android.ugc.gamora.recorder.navi.model.ResolvedEffect;
import com.ss.android.ugc.gamora.recorder.navi.service.NaviVideoCreationService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS45S1300000_3;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.087J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C087J implements MessageCenter.Listener {
    public static final C443120HZe<Integer, Integer, Integer> LLILZLL = new C443120HZe<>(8194, 0, 0);
    public static final C443120HZe<Integer, Long, Long> LLIZ = new C443120HZe<>(8195, 0L, 0L);
    public static final Pair<Integer, Long> LLIZLLLIL = new Pair<>(66668, 1L);
    public final InterfaceC1635390sev LL;
    public final InterfaceC2032907xn LLILLJJLI;
    public final InterfaceC19428410zi LLILLL;
    public final NaviVideoCreationService LLILZ;
    public C11NJ LLILZIL;

    public C087J(C13P5 c13p5, C19428210zg c19428210zg, MessageReceiverLifecycleImpl messageReceiverLifecycleImpl) {
        NaviVideoCreationService.LIZ.getClass();
        NaviVideoCreationService naviVideoCreationServiceLIZ = C0XST.LIZ();
        this.LL = c13p5;
        this.LLILLJJLI = c19428210zg;
        this.LLILLL = messageReceiverLifecycleImpl;
        this.LLILZ = naviVideoCreationServiceLIZ;
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i, int i2, int i3, String str) {
        C443120HZe<Integer, Integer, Integer> c443120HZe = LLILZLL;
        if (i == c443120HZe.getFirst().intValue() && i2 == c443120HZe.getSecond().intValue() && i3 == c443120HZe.getThird().intValue() && str != null) {
            C201955140j.LIZIZ("JEFF", "Download message received");
            ArrayList arrayList = new ArrayList();
            try {
                String str2 = "";
                if (u.LJJIIJZLJL(str, e3.e, false)) {
                    JSONArray jSONArray = new JSONArray(str);
                    int length = jSONArray.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        arrayList.add(JSONArrayProtectorUtils.getString(jSONArray, i4));
                    }
                } else {
                    arrayList.add(new JSONObject(str).optString("res", ""));
                    str2 = "model";
                }
                Pair pair = new Pair(arrayList, str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Parsed paths ");
                sbLIZ.append(pair.getFirst());
                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ));
                final List list = (List) pair.getFirst();
                final String str3 = (String) pair.getSecond();
                C11NJ c11nj = this.LLILZIL;
                if (c11nj != null) {
                    c11nj.LIZ(this.LLILZ.resolveEffects(NaviAvatarLokiConfig.LIZ().headLokiPanelName, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), list)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.07zt
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("NaviLazyPrefabLoader@4e97.downloadEffectNaviService$1");
                            ResolveEffectsResponse resolveEffectsResponse = (ResolveEffectsResponse) obj;
                            List<ResolvedEffect> list2 = resolveEffectsResponse.resolvedEffects;
                            if (list2 != null && !list2.isEmpty()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Resolved effects ");
                                sbLIZ2.append(resolveEffectsResponse.resolvedEffects);
                                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ2));
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                List<ResolvedEffect> list3 = resolveEffectsResponse.resolvedEffects;
                                if (list3 != null) {
                                    for (ResolvedEffect resolvedEffect : list3) {
                                        String str4 = resolvedEffect.path;
                                        String str5 = resolvedEffect.effectId;
                                        if (str5 != null && str4 != null) {
                                            linkedHashMap.put(str4, str5);
                                        }
                                    }
                                }
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Effects to download ");
                                sbLIZ3.append(linkedHashMap.values());
                                C201955140j.LIZIZ("JEFF", C2188811AlT.LIZIZ(sbLIZ3));
                                C087J c087j = this.LL;
                                c087j.LL.LJFF(C13LP.LLIIII(linkedHashMap.values()), true, null, new C2500409r0(new AwS45S1300000_3((List) list, (List<String>) str3, (String) this.LL, (C087J) linkedHashMap, (Map<String, String>) 3), 3));
                            }
                            C1C7U.LIZIZ("NaviLazyPrefabLoader@4e97.downloadEffectNaviService$1");
                        }
                    }, new C09JN() { // from class: X.07xY
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("NaviLazyPrefabLoader@4e97.downloadEffectNaviService$2");
                            C201955140j.LJI("JEFF", (Throwable) obj);
                            C1C7U.LIZIZ("NaviLazyPrefabLoader@4e97.downloadEffectNaviService$2");
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
