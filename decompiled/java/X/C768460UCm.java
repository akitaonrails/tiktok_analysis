package X;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.log.EffectMessageInfo;
import com.bytedance.android.live.effect.log.EffectMessageInfoList;
import com.bytedance.android.live.effect.log.EffectModelMessage;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectAutoReloadSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectMessageSwitch;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.effectmanager.common.model.ModelInfo;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchModelInfoListListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0UCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768460UCm {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(291));

    public static final InterfaceC767150U7l<? extends LiveEffect> LJI() {
        return (InterfaceC767150U7l) LIZ.getValue();
    }

    public static final InterfaceC769000UEo LIZIZ() {
        return C781270Ukn.LJI().baseComposerManager();
    }

    public static final InterfaceC769210UFj LIZJ() {
        return C781270Ukn.LJI().getLiveBeautyLogManager();
    }

    public static final C0U40 LIZLLL() {
        return C781270Ukn.LJI().getLiveEffectDataProvider();
    }

    public static final C0U7A LJ() {
        return C781270Ukn.LJI().getLiveEffectRestoreManager();
    }

    public static final InterfaceC767160U7m LJFF() {
        return C781270Ukn.LJI().getLiveFilterLogManager();
    }

    public static final InterfaceC771640UOs LJII() {
        return C781270Ukn.LJI().getLiveStickerLogManager();
    }

    public static final InterfaceC761840TuY LJIIIIZZ() {
        return C781270Ukn.LJI().getLiveVoiceEffectHelper();
    }

    public static final boolean LJIIJ() {
        return C781270Ukn.LJI().isUsingBGMFunction().booleanValue();
    }

    public static final LiveDialogFragment LIZ(Context context, DataChannel dataChannel) {
        return C781270Ukn.LJI().getEnhanceDialogFragment(context, dataChannel);
    }

    public static final void LJIIIZ(int i, int i2, int i3, String str) {
        k kVarLJJIIZ;
        String strLJIL;
        String strLJIL2;
        C0UD5 c0ud5LJFF;
        long jLJIIZILJ;
        k kVarLJJIIZ2;
        String strLJIL3;
        LiveEffect next;
        List<EffectMessageInfo> list;
        EffectMessageInfoList effectMessageInfoList;
        List<EffectMessageInfo> list2;
        if (C781270Ukn.LJI().getEffectMessageHandler() != null) {
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(numValueOf);
            sbLIZ.append(", ");
            sbLIZ.append(numValueOf2);
            sbLIZ.append(", ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("EffectMonitor#handleMsg", C2188811AlT.LIZIZ(sbLIZ));
            long effectId = -1;
            if (i != 17) {
                if (i != 40) {
                    if (i == 86 && numValueOf != null) {
                        if (numValueOf.intValue() == 11) {
                            C20441214yg.LIZIZ("EffectMonitor#handleModel", String.valueOf(str));
                            if (LiveEffectMessageSwitch.INSTANCE.enable() && str != null) {
                                try {
                                    EffectModelMessage effectModelMessage = (EffectModelMessage) C19748512Ol.LIZIZ.LJII(str, EffectModelMessage.class);
                                    if (effectModelMessage.modelPath != null && effectModelMessage.modelName != null) {
                                        EffectMessageInfoList effectMessageInfoList2 = effectModelMessage.effectInfo;
                                        if (effectMessageInfoList2 != null && (list = effectMessageInfoList2.resourceAdded) != null && (!list.isEmpty()) && (effectMessageInfoList = effectModelMessage.effectInfo) != null && (list2 = effectMessageInfoList.resourceAdded) != null) {
                                            Iterator<EffectMessageInfo> it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                String str2 = it2.next().path;
                                                if (str2 != null) {
                                                    String str3 = effectModelMessage.modelName;
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append(str2);
                                                    sbLIZ2.append(", ");
                                                    sbLIZ2.append(str3);
                                                    C20441214yg.LIZIZ("EffectMonitor#updateModel", C2188811AlT.LIZIZ(sbLIZ2));
                                                    C0UC9 c0uc9 = C768430UCj.LIZIZ.get(str2);
                                                    if (c0uc9 != null) {
                                                        c0uc9.LJI.add(str3);
                                                    }
                                                }
                                            }
                                        }
                                        final String str4 = effectModelMessage.modelName;
                                        final boolean zLJFF = Intrinsics.LJFF(effectModelMessage.isResident, Boolean.TRUE);
                                        C0UC4 c0uc4 = C0UC4.LIZ;
                                        IFetchModelInfoListListener iFetchModelInfoListListener = new IFetchModelInfoListListener() { // from class: X.0UCl
                                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchModelInfoListListener
                                            public final void onFail(ExceptionResult exceptionResult) {
                                                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                                                List listSingletonList = Collections.singletonList(new Pair(str4, -999));
                                                boolean z = zLJFF;
                                                c1276840jKc.getClass();
                                                C1276840jKc.LJIILJJIL(listSingletonList, z);
                                            }

                                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                            public final void onSuccess(List<ModelInfo> list3) {
                                                List<ModelInfo> list4 = list3;
                                                if (list4 != null) {
                                                    boolean z = zLJFF;
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("modelInfo: ");
                                                    sbLIZ3.append(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, list4));
                                                    C20441214yg.LIZIZ("InteractiveR#onMessage", C2188811AlT.LIZIZ(sbLIZ3));
                                                    C1276840jKc.LIZ.getClass();
                                                    C1276840jKc.LJIILIIL(list4, z);
                                                }
                                            }
                                        };
                                        if (LiveEffectMessageSwitch.INSTANCE.enable()) {
                                            C0UDQ c0udq = (C0UDQ) C0UC4.LJIJ.getValue();
                                            String strLJIILIIL = C0UC4.LJIILIIL(Collections.singletonList(str4));
                                            EffectManager effectManager = c0udq.LIZ;
                                            if (effectManager != null) {
                                                effectManager.fetchModelInfoList(strLJIILIIL, iFetchModelInfoListListener);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return;
                                }
                            }
                            return;
                        }
                        if (numValueOf.intValue() == 12) {
                            C20441214yg.LIZIZ("EffectMonitor#handleModel", String.valueOf(str));
                            if (LiveEffectMessageSwitch.INSTANCE.enable() && str != null) {
                                C1276840jKc.LIZ.getClass();
                                C1276840jKc.LJJIIZI.remove(str);
                                C1276840jKc.LJJIIZ.remove(str);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (numValueOf != null && numValueOf.intValue() == 102 && numValueOf2 != null && numValueOf2.intValue() == 1000000) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("roomId: ");
                    sbLIZ3.append(C768430UCj.LJFF);
                    sbLIZ3.append(", message: ");
                    sbLIZ3.append(str);
                    C20441214yg.LIZIZ("InteractiveR#onMessage", C2188811AlT.LIZIZ(sbLIZ3));
                    if (C768430UCj.LJFF != 0) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("body: ");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", roomId: ");
                        sbLIZ4.append(C768430UCj.LJFF);
                        C20441214yg.LIZIZ("InteractiveE#onStart", C2188811AlT.LIZIZ(sbLIZ4));
                        if (C768430UCj.LJFF != 0 && str != null) {
                            try {
                                new p();
                                n nVarLJIILIIL = p.LIZJ(str).LJIILIIL();
                                if (nVarLJIILIIL.LJJIJIIJIL("request_url") && nVarLJIILIIL.LJJIJIIJIL("body")) {
                                    boolean zLJFF2 = Intrinsics.LJFF(nVarLJIILIIL.LJJIIZ("request_url").LJIL(), "interactiveEffects_start");
                                    n nVarLJJIJ = nVarLJIILIIL.LJJIJ("body");
                                    if (nVarLJJIJ.LJJIJIIJIL("unique_key")) {
                                        if (zLJFF2) {
                                            Iterator<LiveEffect> it3 = C0UA1.LIZ().qr(C0UD4.LIZIZ).iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next = it3.next();
                                                    if (next.LLJJJ()) {
                                                        break;
                                                    }
                                                } else {
                                                    next = null;
                                                    break;
                                                }
                                            }
                                            LiveEffect liveEffect = next;
                                            if (liveEffect != null) {
                                                C768430UCj.LJI = nVarLJJIJ.LJJIIZ("unique_key").LJIL();
                                                C768430UCj.LJII = liveEffect;
                                                n nVar = new n();
                                                nVar.LJJIII(Long.valueOf(C768430UCj.LJFF), "room_id");
                                                nVar.LJJIII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
                                                nVar.LJJIIJ("trigger_strategy", nVarLJJIJ.toString());
                                                nVarLJIILIIL.LJJIJL("body");
                                                nVarLJIILIIL.LJJIFFI("body", nVar);
                                            } else {
                                                return;
                                            }
                                        } else if (C768430UCj.LJII != null && C768430UCj.LJI != null) {
                                            nVarLJJIJ.LJJIII(Long.valueOf(C768430UCj.LJFF), "room_id");
                                            LiveEffect liveEffect2 = C768430UCj.LJII;
                                            if (liveEffect2 != null) {
                                                effectId = liveEffect2.getEffectId();
                                            }
                                            nVarLJJIJ.LJJIII(Long.valueOf(effectId), "effect_id");
                                        } else {
                                            return;
                                        }
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("isOpen: ");
                                        sbLIZ5.append(zLJFF2);
                                        sbLIZ5.append(", message: ");
                                        sbLIZ5.append(nVarLJIILIIL);
                                        C20441214yg.LJ("InteractiveE#sendReq", C2188811AlT.LIZIZ(sbLIZ5));
                                        C0U60.LIZ().SQ2(new C080800Ry(nVarLJIILIIL, zLJFF2));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("message: ");
                                sbLIZ6.append(str);
                                C20441214yg.LJ("InteractiveE#sendReqFail", C2188811AlT.LIZIZ(sbLIZ6));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (numValueOf != null) {
                if (numValueOf.intValue() == 10) {
                    C20441214yg.LIZIZ("EffectMonitor#handleMsg", String.valueOf(str));
                    if (str != null) {
                        try {
                            new p();
                            n nVarLJIILIIL2 = p.LIZJ(str).LJIILIIL();
                            if (nVarLJIILIIL2.LJJIJIIJIL("resource_added")) {
                                h hVarLJJIIZI = nVarLJIILIIL2.LJJIIZI("resource_added");
                                n nVarLJJIJ2 = nVarLJIILIIL2.LJJIJ("effect_inner_info");
                                for (k kVar : hVarLJJIIZI) {
                                    if ((kVar instanceof n) && (kVarLJJIIZ = ((n) kVar).LJJIIZ("path")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                                        k kVarLJJIIZ3 = ((n) kVar).LJJIIZ("sticker_panel");
                                        if (kVarLJJIIZ3 != null) {
                                            strLJIL2 = kVarLJJIIZ3.LJIL();
                                        } else {
                                            strLJIL2 = null;
                                        }
                                        k kVarLJJIIZ4 = ((n) kVar).LJJIIZ("effect_id");
                                        if (kVarLJJIIZ4 != null && (strLJIL3 = kVarLJJIIZ4.LJIL()) != null) {
                                            CastLongProtector.parseLong(strLJIL3);
                                        }
                                        Iterator it4 = ((ArrayList) C768430UCj.LJ).iterator();
                                        while (it4.hasNext()) {
                                            ((InterfaceC768470UCn) it4.next()).LJII();
                                        }
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        Iterator<Map.Entry<String, C0UC9>> it5 = C768430UCj.LIZIZ.entrySet().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                break;
                                            }
                                            Map.Entry<String, C0UC9> next2 = it5.next();
                                            if (a0.LJJIIZI(strLJIL, next2.getKey(), false) && next2.getValue().LIZJ != -1 && next2.getValue().LIZLLL != -1) {
                                                C20441214yg.LIZIZ("EffectMonitor#report", next2.toString());
                                                String key = next2.getKey();
                                                C768430UCj c768430UCj = C768430UCj.LIZ;
                                                LiveEffect liveEffect3 = next2.getValue().LIZ;
                                                long j = jCurrentTimeMillis - next2.getValue().LIZJ;
                                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_render_time");
                                                c474500IjALIZ.LJIL();
                                                C767250U7v.LJIIJ(c474500IjALIZ, liveEffect3);
                                                c474500IjALIZ.LJJII(Long.valueOf(j), "use_time");
                                                c474500IjALIZ.LIZ();
                                                C0UC9 value = next2.getValue();
                                                if (nVarLJJIJ2 != null && (kVarLJJIIZ2 = nVarLJJIJ2.LJJIIZ("effect_inner_time")) != null) {
                                                    jLJIIZILJ = kVarLJJIIZ2.LJIIZILJ();
                                                } else {
                                                    jLJIIZILJ = -1;
                                                }
                                                C768430UCj.LIZIZ(value, jLJIIZILJ);
                                                if (key != null) {
                                                    C768430UCj.LIZIZ.remove(key);
                                                }
                                            }
                                        }
                                        if (Intrinsics.LJFF(strLJIL2, C0UD4.LIZIZ) && (c0ud5LJFF = C0UF5.LJFF()) != null && c0ud5LJFF.LIZ) {
                                            C0UA1.LIZ().Hr();
                                            C0UD5 c0ud5LJFF2 = C0UF5.LJFF();
                                            if (c0ud5LJFF2 != null) {
                                                c0ud5LJFF2.LIZ = false;
                                            }
                                        } else if (Intrinsics.LJFF(strLJIL2, "live_ec_top_atmosphere") && C500260Jjc.LJJIIZ(C769020UEq.LIZ) && C500260Jjc.LJJIIZ(C769020UEq.LIZIZ)) {
                                            C0UA1.LIZ().Er();
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            return;
                        }
                    }
                    return;
                }
                if (numValueOf.intValue() == 4) {
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("message: ");
                    sbLIZ7.append(str);
                    C20441214yg.LIZIZ("EffectMonitor#loadfail", C2188811AlT.LIZIZ(sbLIZ7));
                    if (LiveEffectAutoReloadSetting.INSTANCE.isEnable()) {
                        try {
                            new p();
                            n nVarLJIILIIL3 = p.LIZJ(str).LJIILIIL();
                            long jLJIIZILJ2 = nVarLJIILIIL3.LJJIIZ("effect_id").LJIIZILJ();
                            String strLJIL4 = nVarLJIILIIL3.LJJIIZ("sticker_panel").LJIL();
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("before enter: ");
                            sbLIZ8.append(jLJIIZILJ2);
                            sbLIZ8.append(", ");
                            sbLIZ8.append(strLJIL4);
                            C20441214yg.LIZIZ("EffectMonitor#loadfail", C2188811AlT.LIZIZ(sbLIZ8));
                            ConcurrentHashSet<Long> concurrentHashSet = C768430UCj.LIZLLL;
                            if (!concurrentHashSet.contains(Long.valueOf(jLJIIZILJ2)) && Intrinsics.LJFF(strLJIL4, C0UD4.LJFF)) {
                                C20441214yg.LIZIZ("EffectMonitor#loadfail", "entered");
                                concurrentHashSet.add(Long.valueOf(jLJIIZILJ2));
                                LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class);
                                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveSmallItemBeautyViewModel), C0PEM.LIZJ, null, new C510501yp(liveSmallItemBeautyViewModel.LLILZ.LJIIJ(jLJIIZILJ2), liveSmallItemBeautyViewModel, null), 2);
                            }
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                }
            }
        }
    }
}
