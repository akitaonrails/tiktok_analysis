package X;

import com.bytedance.android.livesdk.livesetting.effect.LiveEffectMessageSwitch;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchModelInfoListListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS50S0000100_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0UCj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768430UCj implements C0UAI {
    public static long LJFF;
    public static String LJI;
    public static LiveEffect LJII;
    public static final C768430UCj LIZ = new C768430UCj();
    public static final HashMap<String, C0UC9> LIZIZ = new HashMap<>();
    public static final C768420UCi LIZJ = C768420UCi.LIZ;
    public static final ConcurrentHashSet<Long> LIZLLL = new ConcurrentHashSet<>();
    public static final List<InterfaceC768470UCn> LJ = new ArrayList();
    public static int LJIIIIZZ = 1000000;

    public static final int LIZ() {
        if (LJIIIIZZ + 1 == 1010000) {
            LJIIIIZZ = 1000000;
        }
        int i = LJIIIIZZ + 1;
        LJIIIIZZ = i;
        return i;
    }

    public static void LIZJ(String str) {
        n nVar = new n();
        n nVar2 = new n();
        nVar.LJJIIJ("interface", "liveBasicInformation");
        nVar2.LJJIIJ("event_page", str);
        nVar.LJJIFFI("body", nVar2);
        C0UA1.LIZ().sendEffectMsg(40, 102, LSPassThroughRecordSizeConfig.DEFAULT, nVar.toString());
    }

    public static void LIZLLL(String str) {
        C0UC9 c0uc9;
        C20441214yg.LIZIZ("EffectMonitor#effectsdk", String.valueOf(str));
        if (a0.LJJIIZI(str, ":", false)) {
            Object objLJJJLL = C13LP.LJJJLL(a0.LJJLIIIJILLIZJL(str, new String[]{":"}, 0, 6));
            if (objLJJJLL != null && (c0uc9 = LIZIZ.get(objLJJJLL)) != null) {
                c0uc9.LIZLLL = System.currentTimeMillis();
                return;
            }
            return;
        }
        C0UC9 c0uc92 = LIZIZ.get(str);
        if (c0uc92 == null) {
            return;
        }
        c0uc92.LIZLLL = System.currentTimeMillis();
    }

    public static void LIZIZ(final C0UC9 c0uc9, final long j) {
        C0UC4 c0uc4 = C0UC4.LIZ;
        LiveEffectMessageSwitch liveEffectMessageSwitch = LiveEffectMessageSwitch.INSTANCE;
        if (liveEffectMessageSwitch.enable()) {
            String strLJIILIIL = C0UC4.LJIILIIL(c0uc9.LJI);
            IFetchModelInfoListListener iFetchModelInfoListListener = new IFetchModelInfoListListener() { // from class: X.0UCk
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchModelInfoListListener
                public final void onFail(ExceptionResult exceptionResult) {
                    String string;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(exceptionResult.getErrorCode());
                    sbLIZ.append(", ");
                    sbLIZ.append(exceptionResult.getMsg());
                    C20441214yg.LIZIZ("EffectMonitor#fetchModelfail", C2188811AlT.LIZIZ(sbLIZ));
                    if (Intrinsics.LJFF(c0uc9.LJFF, C0UD4.LIZIZ)) {
                        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                        List<String> list = c0uc9.LJI;
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        Iterator<String> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new Pair(it2.next(), -999));
                        }
                        c1276840jKc.getClass();
                        C1276840jKc.LJIILJJIL(arrayList, false);
                    }
                    C0UC4 c0uc42 = C0UC4.LIZ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_user_wait_time");
                    c474500IjALIZ.LJIL();
                    C0UC4.LJIILL(c474500IjALIZ, c0uc9);
                    List<String> list2 = c0uc9.LJI;
                    if (LiveEffectMessageSwitch.INSTANCE.enable() && list2 != null) {
                        n nVar = new n();
                        Iterator<String> it3 = list2.iterator();
                        while (it3.hasNext()) {
                            nVar.LJJIII(-999, it3.next());
                        }
                        C1276840jKc.LIZ.getClass();
                        for (Map.Entry<String, Integer> entry : C1276840jKc.LJJIIZI.entrySet()) {
                            nVar.LJJIII(entry.getValue(), entry.getKey());
                        }
                        string = nVar.toString();
                    } else {
                        string = "";
                    }
                    c474500IjALIZ.LJJII(string, "effect_model_current_level");
                    c474500IjALIZ.LJJIIZ(Long.valueOf(j), "effect_inner_time", new AwS50S0000100_12(j, 0));
                    c474500IjALIZ.LIZ();
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(List<ModelInfo> list) {
                    String string;
                    List<ModelInfo> list2 = list;
                    C0UC4 c0uc42 = C0UC4.LIZ;
                    if (!LiveEffectMessageSwitch.INSTANCE.enable()) {
                        string = "";
                    } else {
                        n nVar = new n();
                        if (list2 != null) {
                            for (ModelInfo modelInfo : list2) {
                                nVar.LJJIII(Integer.valueOf(modelInfo.getType()), modelInfo.getName());
                            }
                        }
                        C1276840jKc.LIZ.getClass();
                        for (Map.Entry<String, Integer> entry : C1276840jKc.LJJIIZI.entrySet()) {
                            nVar.LJJIII(entry.getValue(), entry.getKey());
                        }
                        string = nVar.toString();
                    }
                    if (list2 != null) {
                        C0UC9 c0uc92 = c0uc9;
                        if (Intrinsics.LJFF(c0uc92.LJFF, C0UD4.LIZIZ) || Intrinsics.LJFF(c0uc92.LJFF, "livebackground")) {
                            C1276840jKc.LIZ.getClass();
                            C1276840jKc.LJIILIIL(list2, false);
                        }
                    }
                    C20441214yg.LIZIZ("EffectMonitor#fetchModel", string);
                    C0UC4 c0uc43 = C0UC4.LIZ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_user_wait_time");
                    c474500IjALIZ.LJIL();
                    C0UC4.LJIILL(c474500IjALIZ, c0uc9);
                    c474500IjALIZ.LJJII(string, "effect_model_current_level");
                    c474500IjALIZ.LJJIIZ(Long.valueOf(j), "effect_inner_time", new AwS50S0000100_12(j, 1));
                    c474500IjALIZ.LIZ();
                }
            };
            if (liveEffectMessageSwitch.enable()) {
                C20441214yg.LIZIZ("EffectMonitor#fetchModel", strLJIILIIL);
                EffectManager effectManager = ((C0UDQ) C0UC4.LJIJ.getValue()).LIZ;
                if (effectManager != null) {
                    effectManager.fetchModelInfoList(strLJIILIIL, iFetchModelInfoListListener);
                    return;
                }
                return;
            }
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_user_wait_time");
        c474500IjALIZ.LJIL();
        C0UC4.LJIILL(c474500IjALIZ, c0uc9);
        c474500IjALIZ.LJJIIZ(Long.valueOf(j), "effect_inner_time", new AwS50S0000100_12(j, 2));
        c474500IjALIZ.LIZ();
    }

    public static final void LJ(LiveEffect liveEffect, long j, boolean z, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(liveEffect.getFilePath());
        sbLIZ.append(", ");
        sbLIZ.append(liveEffect.getPanel());
        C20441214yg.LIZIZ("EffectMonitor#StartRender", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.put(liveEffect.getFilePath(), new C0UC9(liveEffect, j, System.currentTimeMillis(), z, str));
    }
}
