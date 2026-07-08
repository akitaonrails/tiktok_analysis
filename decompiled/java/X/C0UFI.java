package X;

import Y.AObjectS115S0000000_12;
import Y.AfS0S0110100_12;
import android.os.SystemClock;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.LiveGetGoalInfoApi;
import com.bytedance.android.live.effect.StickerSelectChannel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.LiveGoalHighLightEvent;
import com.bytedance.android.live.effect.model.LastPosition;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.live.effect.model.LogParams;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0UFI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UFI implements C0U6C {
    public static final C0UFI LIZ = new C0UFI();
    public static List<? extends LiveEffect> LIZIZ;
    public static DataChannel LIZJ;
    public static boolean LIZLLL;
    public static n LJ;
    public static C207209166l LJFF;
    public static final C0U78 LJI;
    public static final List<Boolean> LJII;
    public static C0UC8 LJIIIIZZ;
    public static Function0<Unit> LJIIIZ;
    public static Function0<Unit> LJIIJ;
    public static final C0UFL LJIIJJI;
    public static final AObjectS115S0000000_12 LJIIL;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0UFL] */
    static {
        new LastPosition(10000, 10000);
        new LastPosition(10000, 10000);
        LJI = C0UA1.LIZ();
        Boolean bool = Boolean.FALSE;
        LJII = C1697810uHb.LJIILJJIL(bool, bool, bool);
        LJIIJJI = new C0U45() { // from class: X.0UFL
            @Override // X.C0U45
            public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
            }

            @Override // X.C0U45
            public final void LIZ(LiveEffect liveEffect) {
                String resourceId;
                C0UFI c0ufi = C0UFI.LIZ;
                if (liveEffect != null) {
                    resourceId = liveEffect.getResourceId();
                } else {
                    resourceId = null;
                }
                LiveEffect liveEffectLJFF = C0UFI.LJFF(resourceId);
                boolean z = true;
                if (liveEffectLJFF != null) {
                    liveEffectLJFF.LJJLIL(true);
                    liveEffectLJFF.LJLILLLLZI(false);
                }
                if (C0UFI.LIZLLL) {
                    if (C0UFI.LIZLLL() && C0UFI.LIZIZ()) {
                        c0ufi.LJIILIIL();
                        if (!C500260Jjc.LJJIJLIJ()) {
                            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getVideoSizeManager().getClass();
                            z = C0UFT.LJFF;
                        }
                        c0ufi.LJIJI(null, null, z, false);
                        C486790J7d.LIZLLL(new Runnable() { // from class: X.0UFK
                            public static void LIZ() {
                                C0UFI c0ufi2 = C0UFI.LIZ;
                                List<? extends LiveEffect> list = C0UFI.LIZIZ;
                                C0UFI.LIZ(list != null ? (LiveEffect) ListProtector.get(list, InterfaceC772190UQv.X3.LIZIZ().intValue()) : null);
                                C0UFI.LJIIZILJ(false);
                                C20337914i1<n> c20337914i1 = InterfaceC772190UQv.W3;
                                if (c20337914i1.LIZIZ().LJJIJIIJIL("stream_goal_id")) {
                                    C0UFJ c0ufj = C0UFJ.LIZ;
                                    LogParams logParams = (LogParams) C769080UEw.LIZIZ(c20337914i1.LIZIZ(), LogParams.class);
                                    if (logParams == null) {
                                        logParams = new LogParams(null, null, null, null, null, null, 0, 0, 0, C158B.LIZ());
                                    }
                                    C0UFJ.LIZIZ = logParams;
                                    logParams.startTime = C158B.LIZ();
                                    c20337914i1.LJFF(new n());
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LiveGoalEffectHelper@76ee.initLiveGoalEffectInternal$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LiveGoalEffectHelper@76ee.initLiveGoalEffectInternal$1");
                            }
                        }, null, 300L);
                    } else {
                        C0UFI.LJIILL();
                    }
                    C0UFI.LIZLLL = false;
                }
                C20441214yg.LIZIZ("LiveGoalEffect", "download resource zip successfully!");
            }

            @Override // X.C0U45
            public final void LIZJ(LiveEffect liveEffect) {
                String resourceId;
                C0UFI c0ufi = C0UFI.LIZ;
                if (liveEffect != null) {
                    resourceId = liveEffect.getResourceId();
                } else {
                    resourceId = null;
                }
                LiveEffect liveEffectLJFF = C0UFI.LJFF(resourceId);
                if (liveEffectLJFF != null) {
                    liveEffectLJFF.LJJLIL(false);
                    liveEffectLJFF.LJLILLLLZI(true);
                }
            }

            @Override // X.C0U45
            public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
                String resourceId;
                C0UFI c0ufi = C0UFI.LIZ;
                if (liveEffect != null) {
                    resourceId = liveEffect.getResourceId();
                } else {
                    resourceId = null;
                }
                LiveEffect liveEffectLJFF = C0UFI.LJFF(resourceId);
                if (liveEffectLJFF != null) {
                    liveEffectLJFF.LJJLIL(false);
                    liveEffectLJFF.LJLILLLLZI(false);
                }
                C20441214yg.LIZIZ("LiveGoalEffect", "download resource zip Failed!!!!");
            }
        };
        LJIIL = new AObjectS115S0000000_12(0);
    }

    public static final boolean LIZIZ() {
        List<? extends LiveEffect> list = LIZIZ;
        if (list != null) {
            Iterator<? extends LiveEffect> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!C766720U5u.LJIILLIIL(it2.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL() {
        if (!LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            return false;
        }
        Integer numLIZIZ = InterfaceC772190UQv.X3.LIZIZ();
        return (numLIZIZ == null || numLIZIZ.intValue() != 0) && InterfaceC772190UQv.V3.LIZIZ().LJJIIZ("max_line") != null;
    }

    public static String LJII() {
        String strLIZLLL;
        C207209166l c207209166l = LJFF;
        if (c207209166l == null || (strLIZLLL = C771370UNr.LIZLLL(c207209166l)) == null || !new C0VSJ(strLIZLLL).exists()) {
            return null;
        }
        return strLIZLLL;
    }

    public static final void LJIILL() {
        InterfaceC772190UQv.V3.LJFF(new n());
        InterfaceC772190UQv.X3.LJFF(0);
    }

    public static LiveGoalInfo LJIJ() {
        LiveGoalInfo liveGoalInfo = new LiveGoalInfo("", null, null, "", "", 0.0f, null, null, null, null, new LastPosition(10000, 10000), 0, 1, 0, 1, null, null);
        try {
            LiveGoalInfo liveGoalInfo2 = (LiveGoalInfo) C19748512Ol.LIZIZ.LIZJ(InterfaceC772190UQv.V3.LIZIZ(), LiveGoalInfo.class);
            return liveGoalInfo2 != null ? liveGoalInfo2 : liveGoalInfo;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return liveGoalInfo;
        }
    }

    public static final void LJJIFFI() {
        if (LJ != null) {
            InterfaceC772190UQv.V3.LJFF(LJ);
            LJ = null;
        }
    }

    public final void LJIIL() {
        if (LJIIIIZZ != null) {
            C768300UBw.LJIILJJIL(LJIIIIZZ, true);
        }
        LJIIIIZZ = null;
        LJI.lr("livebackground");
        LJIIZILJ(true);
        Function0<Unit> function0 = LJIIJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LJIILIIL() {
        DataChannel dataChannel;
        LiveEffect liveEffectLJI = C767770U9v.LJI(LIZJ);
        if (liveEffectLJI != null) {
            DataChannel dataChannel2 = LIZJ;
            if (dataChannel2 != null) {
                dataChannel2.SX0(C0UFX.class, liveEffectLJI);
            }
        } else {
            LiveEffect liveEffectLJFF = C767770U9v.LJFF();
            if (liveEffectLJFF != null && (dataChannel = LIZJ) != null) {
                dataChannel.SX0(C0UFX.class, liveEffectLJFF);
            }
        }
        if (C767770U9v.LIZLLL()) {
            LJIIL();
        }
    }

    public static final boolean LJIIIIZZ() {
        return C767770U9v.LIZLLL();
    }

    public static final void LJJI() {
        LiveGoalInfo liveGoalInfoLJIJ = LJIJ();
        liveGoalInfoLJIJ.effectPosition = InterfaceC772190UQv.X3.LIZIZ().intValue();
        C20337914i1<n> c20337914i1 = InterfaceC772190UQv.V3;
        String strLIZ = C769080UEw.LIZ(liveGoalInfoLJIJ);
        c20337914i1.LJFF(strLIZ != null ? C769080UEw.LIZJ(strLIZ) : null);
    }

    public final void LJIIJJI() {
        LJIIL();
        LJIILL();
    }

    public final void LJIILLIIL() {
        LiveEffect liveEffect;
        C0UA6 c0ua6;
        C0UA6 c0ua62;
        LJIIL();
        InterfaceC772190UQv.X3.LJFF(Integer.valueOf(LJIJ().effectPosition));
        DataChannel dataChannel = LIZJ;
        if (dataChannel == null || (liveEffect = (LiveEffect) dataChannel.gg0(C0UFX.class)) == null) {
            return;
        }
        if (liveEffect.LJJJJIZL()) {
            C0UA1.LIZ().kr(liveEffect, "livebackground");
            WeakReference<C0UA6> weakReference = C0UA4.LIZ;
            if (weakReference != null && (c0ua62 = weakReference.get()) != null) {
                c0ua62.LIZ(null, liveEffect);
            }
            C0U58 c0u58 = C0U5U.LJ;
            if (c0u58 != null) {
                c0u58.LJI(liveEffect);
            }
            C0U58 c0u582 = C0U5U.LJ;
            if (c0u582 != null) {
                c0u582.LJ(liveEffect);
            }
        } else if (!liveEffect.LLJILLL()) {
            DataChannel dataChannel2 = LIZJ;
            C0UA1.LIZ().kr(liveEffect, C0UD4.LIZIZ);
            if (dataChannel2 != null) {
                dataChannel2.zW(StickerSelectChannel.class, liveEffect);
            }
            WeakReference<C0UA6> weakReference2 = C0UA4.LIZ;
            if (weakReference2 != null && (c0ua6 = weakReference2.get()) != null) {
                c0ua6.LIZ(null, liveEffect);
            }
        } else if (LJIJ().effectPosition == 0) {
            LJIIL();
        } else {
            LIZ(liveEffect);
            LJIIZILJ(false);
        }
        DataChannel dataChannel3 = LIZJ;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C0UFX.class, null);
        }
    }

    public static final void LIZ(LiveEffect liveEffect) {
        Integer numValueOf;
        boolean z;
        int i;
        if (liveEffect != null) {
            LJI.kr(liveEffect, "livebackground");
            long effectId = liveEffect.getEffectId();
            String resourceId = liveEffect.getResourceId();
            String name = liveEffect.getName();
            boolean zLJJLIIIJILLIZJL = liveEffect.LJJLIIIJILLIZJL();
            String strLJLL = liveEffect.LJLL();
            String broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
            boolean z2 = liveEffect.getLogParams().LIZ;
            boolean z3 = liveEffect.getLogParams().LIZIZ;
            String strLJJJJI = liveEffect.LJJJJI();
            String strLJJIJLIJ = liveEffect.LJJIJLIJ();
            String strLLILII = liveEffect.LLILII();
            String str = (String) DataChannelGlobal.LLILZ.gg0(C931060aKu.class);
            String strValueOf = String.valueOf(C767790U9x.LJFF + 1);
            boolean zLLIILII = liveEffect.LLIILII();
            Integer numLJJIJL = liveEffect.LJJIJL();
            String designerId = null;
            if (numLJJIJL != null) {
                numValueOf = Integer.valueOf(numLJJIJL.intValue() + 1);
            } else {
                numValueOf = null;
            }
            String strValueOf2 = String.valueOf(numValueOf);
            Effect effect = liveEffect.LIZJ;
            if (effect != null) {
                if (!C0UDE.LIZ(effect.getExtra()) && !C0UDE.LIZ(effect.getSdkExtra())) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            long jLIZ = C158B.LIZ();
            Effect effect2 = liveEffect.LIZJ;
            if (effect2 != null && effect2.getSource() == 1) {
                i = 1;
            } else {
                i = 0;
            }
            Effect effect3 = liveEffect.LIZJ;
            if (effect3 != null) {
                designerId = effect3.getDesignerId();
            }
            boolean z4 = false;
            String str2 = null;
            LJIIIIZZ = new C0UC8(effectId, resourceId, name, zLJJLIIIJILLIZJL, strLJLL, broadcastScene, z2, z3, "normal_icon", strLJJJJI, strLJJIJLIJ, strLLILII, str, strValueOf, z4, jLIZ, zLLIILII, strValueOf2, z, 0L, i, designerId, liveEffect.getLogParams().LIZJ, liveEffect.getLogParams().LIZLLL, z4, str2, str2, liveEffect.LJJJI(), liveEffect.getSessionId(), C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.LLJJJ())) ? 1 : 0, 101203968);
            C768300UBw.LJIILJJIL(LJIIIIZZ, false);
            Function0<Unit> function0 = LJIIIZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static LiveEffect LJFF(String str) {
        List<? extends LiveEffect> list = LIZIZ;
        LiveEffect liveEffect = null;
        if (list == null) {
            return null;
        }
        Iterator<? extends LiveEffect> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect next = it2.next();
            if (Intrinsics.LJFF(next.getResourceId(), str)) {
                liveEffect = next;
                break;
            }
        }
        return liveEffect;
    }

    public static final void LJIIIZ(String str) {
        n nVarLIZJ = C769080UEw.LIZJ(str);
        if (nVarLIZJ == null) {
            return;
        }
        if (nVarLIZJ.LJJIJIIJIL("highlight")) {
            n nVarLJJIJ = nVarLIZJ.LJJIJ("highlight");
            if (nVarLJJIJ.LJJIJIIJIL("highlight_line")) {
                DataChannel dataChannel = LIZJ;
                if (dataChannel != null) {
                    dataChannel.LC0(LiveGoalHighLightEvent.class, Integer.valueOf(nVarLJJIJ.LJJIIZ("highlight_line").LJIIJJI()));
                    return;
                }
                return;
            }
            DataChannel dataChannel2 = LIZJ;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.LC0(LiveGoalHighLightEvent.class, -1);
            return;
        }
        DataChannel dataChannel3 = LIZJ;
        if (dataChannel3 == null) {
            return;
        }
        dataChannel3.LC0(LiveGoalHighLightEvent.class, -1);
    }

    public static final void LJIIJ(boolean z) {
        LJIIIIZZ = null;
        if (z) {
            LJIIIZ = null;
            LJIIJ = null;
            LIZIZ = null;
            LIZJ = null;
            LJ = null;
            LJFF = null;
        }
    }

    public static final void LJIIZILJ(boolean z) {
        String strLIZ;
        if (z || (strLIZ = C769080UEw.LIZ(LJIJ())) == null) {
            strLIZ = "";
        }
        LJI.setRenderCacheString("LiveGoal", strLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRenderCacheString: ");
        sbLIZ.append(strLIZ);
        C20441214yg.LIZIZ("LiveGoalEffect", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJIJJ(List<? extends LiveEffect> list) {
        LiveEffect.LiveGoalExtra liveGoalExtra;
        LiveEffect.LiveGoalExtra liveGoalExtra2;
        LiveEffect.LiveGoalExtra liveGoalExtra3;
        ArrayList arrayList = new ArrayList();
        if (list.size() >= 4) {
            arrayList.addAll(list.subList(0, 4));
        }
        Iterator<? extends LiveEffect> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect next = it2.next();
            if (next.LJJIJIIJI()) {
                if (next != null) {
                    ListProtector.add(arrayList, 0, next);
                }
            }
        }
        Iterator<? extends LiveEffect> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            LiveEffect next2 = it3.next();
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL = next2.LJLJLLL();
            if (stickerSDKExtraLJLJLLL != null && (liveGoalExtra3 = stickerSDKExtraLJLJLLL.liveGoalExtra) != null && liveGoalExtra3.isFullScreen()) {
                if (next2 != null) {
                    ListProtector.add(arrayList, 1, next2);
                }
            }
        }
        Iterator<? extends LiveEffect> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            LiveEffect next3 = it4.next();
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL2 = next3.LJLJLLL();
            if (stickerSDKExtraLJLJLLL2 != null && (liveGoalExtra2 = stickerSDKExtraLJLJLLL2.liveGoalExtra) != null && liveGoalExtra2.isHorizontal()) {
                if (next3 != null) {
                    ListProtector.add(arrayList, 2, next3);
                }
            }
        }
        Iterator<? extends LiveEffect> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                break;
            }
            LiveEffect next4 = it5.next();
            LiveEffect.StickerSDKExtra stickerSDKExtraLJLJLLL3 = next4.LJLJLLL();
            if (stickerSDKExtraLJLJLLL3 != null && (liveGoalExtra = stickerSDKExtraLJLJLLL3.liveGoalExtra) != null && liveGoalExtra.isVertical()) {
                if (next4 != null) {
                    ListProtector.add(arrayList, 3, next4);
                }
            }
        }
        LIZIZ = arrayList;
    }

    public static final void LJIL(String str) {
        LastPosition lastPosition;
        n nVarLIZJ = C769080UEw.LIZJ(str);
        if (nVarLIZJ == null || !nVarLIZJ.LJJIJIIJIL("last_position") || (lastPosition = (LastPosition) C769080UEw.LIZIZ(nVarLIZJ.LJJIIZ("last_position"), LastPosition.class)) == null) {
            return;
        }
        n nVar = LJ;
        n nVarLIZJ2 = null;
        if (nVar != null) {
            LiveGoalInfo liveGoalInfo = (LiveGoalInfo) C769080UEw.LIZIZ(nVar, LiveGoalInfo.class);
            if (liveGoalInfo == null) {
                return;
            }
            liveGoalInfo.lastPosition = lastPosition;
            String strLIZ = C769080UEw.LIZ(liveGoalInfo);
            if (strLIZ != null) {
                nVarLIZJ2 = C769080UEw.LIZJ(strLIZ);
            }
            LJ = nVarLIZJ2;
            return;
        }
        LiveGoalInfo liveGoalInfoLJIJ = LJIJ();
        liveGoalInfoLJIJ.lastPosition = lastPosition;
        C20337914i1<n> c20337914i1 = InterfaceC772190UQv.V3;
        String strLIZ2 = C769080UEw.LIZ(liveGoalInfoLJIJ);
        if (strLIZ2 != null) {
            nVarLIZJ2 = C769080UEw.LIZJ(strLIZ2);
        }
        c20337914i1.LJFF(nVarLIZJ2);
    }

    public final void LJIJJLI(String str) {
        n nVarLIZJ;
        if (LIZLLL() && LIZIZ() && new C0VSJ(str).exists()) {
            LiveGoalInfo liveGoalInfoLJIJ = LJIJ();
            liveGoalInfoLJIJ.iconPath = str;
            C20337914i1<n> c20337914i1 = InterfaceC772190UQv.V3;
            String strLIZ = C769080UEw.LIZ(liveGoalInfoLJIJ);
            if (strLIZ != null) {
                nVarLIZJ = C769080UEw.LIZJ(strLIZ);
            } else {
                nVarLIZJ = null;
            }
            c20337914i1.LJFF(nVarLIZJ);
            LJIIZILJ(false);
        }
    }

    public static boolean LIZJ(int i, boolean z) {
        if (z) {
            return true;
        }
        if (C500260Jjc.LJJIJLIJ()) {
            ListProtector.set(LJII, i, Boolean.TRUE);
        } else if (((Boolean) ListProtector.get(LJII, i)).booleanValue()) {
            return false;
        }
        return true;
    }

    public static void LJI(Function1 function1, final boolean z) {
        String strLJIJ = UserService.getInstance().user().LJIJ(UserService.getInstance().user().getCurrentUserId());
        if (strLJIJ == null) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_goal_fetch_request");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LIZ();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        C480460Ism.LIZ().getClass();
        ((LiveGetGoalInfoApi) C480460Ism.LIZLLL(LiveGetGoalInfoApi.class)).getGoalInfo(strLJIJ, 0L, 1, 1).LJIILIIL(new C0UO0()).LJJLL(new AfS0S0110100_12(jUptimeMillis, function1, z, 0), new C09JN() { // from class: X.0UFM
            @Override // X.C09JN
            public final void accept(Object obj) {
                int statusCode;
                C1C7U.LIZ("LiveGoalEffectHelper@76ee.getGoalApi$2");
                Throwable th = (Throwable) obj;
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (th instanceof C501470JlZ) {
                    statusCode = ((C501520Jle) th).getErrorCode();
                } else if (th instanceof C1811850xFX) {
                    statusCode = ((C1811850xFX) th).statusCode;
                } else if (th instanceof C1494690ozz) {
                    statusCode = ((C1494690ozz) th).getStatusCode();
                } else {
                    statusCode = -1;
                }
                C0UFI c0ufi = C0UFI.LIZ;
                C0UFI.LJIILJJIL(jUptimeMillis2, Boolean.valueOf(z), Integer.valueOf(statusCode), "");
                C1C7U.LIZIZ("LiveGoalEffectHelper@76ee.getGoalApi$2");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJ(com.bytedance.android.livesdk.gift.model.LiveStreamGoal r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UFI.LJJ(com.bytedance.android.livesdk.gift.model.LiveStreamGoal, boolean):void");
    }

    public static void LJ(String str, String str2, Function1 function1) {
        if (str == null || str2 == null) {
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C13LP.LJJLIIIJ(listLJJLIIIJILLIZJL.subList(0, listLJJLIIIJILLIZJL.size() - 1), e3.d, null, null, 0, null, null, 62));
        sbLIZ.append(".png");
        C207209166l c207209166l = new C207209166l(str2, EnumC771350UNp.LIVE_GOAL, null, null, C2188811AlT.LIZIZ(sbLIZ), null, false, 3, false, 748);
        C207232167i.LIZIZ(c207209166l, function1);
        LJFF = c207209166l;
    }

    public static void LJIILJJIL(long j, Boolean bool, Integer num, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_goal_fetch_status");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(str, "request_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LIZ();
    }

    public final void LJIJI(Integer num, Integer num2, boolean z, boolean z2) {
        VideoSize videoSize;
        int iLJIILJJIL;
        int iLJIILIIL;
        AbstractC1273900jFs liveCore;
        C1269340j8W c1269340j8WLLD;
        AbstractC1273900jFs liveCore2;
        C1269340j8W c1269340j8WLLD2;
        n nVarLIZJ;
        if (C500260Jjc.LJJIJLIJ()) {
            C0UFQ c0ufq = C0UFQ.LIZ;
            videoSize = C0UFQ.LIZ();
            if (videoSize == null) {
                return;
            }
        } else {
            InterfaceC769120UFa videoSizeManager = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getVideoSizeManager();
            if (z2 && num != null && num2 != null) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                videoSizeManager.getClass();
                if (iIntValue < 0 && z) {
                    ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalAreaHelper().getClass();
                    iIntValue = C0UFQ.LIZLLL;
                }
                C0UFT.LIZLLL = iIntValue;
                if (iIntValue2 < 0 && z) {
                    ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGoalAreaHelper().getClass();
                    iIntValue2 = C0UFQ.LJ - C497740JfY.LJIJ();
                }
                C0UFT.LJ = iIntValue2;
                float f = C0UFT.LIZLLL / iIntValue2;
                InterfaceC769940UIe interfaceC769940UIe = C0UFT.LJIIIZ;
                if (interfaceC769940UIe != null && (liveCore2 = interfaceC769940UIe.getLiveCore()) != null && (c1269340j8WLLD2 = liveCore2.LLD()) != null) {
                    iLJIILJJIL = c1269340j8WLLD2.LJIILJJIL(0);
                } else {
                    iLJIILJJIL = 720;
                }
                InterfaceC769940UIe interfaceC769940UIe2 = C0UFT.LJIIIZ;
                if (interfaceC769940UIe2 != null && (liveCore = interfaceC769940UIe2.getLiveCore()) != null && (c1269340j8WLLD = liveCore.LLD()) != null) {
                    iLJIILIIL = c1269340j8WLLD.LJIILIIL(0);
                } else {
                    iLJIILIIL = 1280;
                }
                float f2 = iLJIILJJIL / iLJIILIIL;
                if (f > f2) {
                    int i = C0UFT.LIZLLL;
                    C0UFT.LIZIZ = i;
                    C0UFT.LIZJ = (int) (i / f2);
                } else {
                    int i2 = C0UFT.LJ;
                    C0UFT.LIZJ = i2;
                    C0UFT.LIZIZ = (int) (i2 * f2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("surfaceWidth:");
                sbLIZ.append(C0UFT.LIZLLL);
                sbLIZ.append(",videoWidth:");
                sbLIZ.append(iLJIILJJIL);
                sbLIZ.append(",realWidth:");
                sbLIZ.append(C0UFT.LIZIZ);
                sbLIZ.append(",surfaceHeight:");
                sbLIZ.append(C0UFT.LJ);
                sbLIZ.append(",videoHeight:");
                sbLIZ.append(iLJIILIIL);
                sbLIZ.append(",realHeight:");
                sbLIZ.append(C0UFT.LIZJ);
                C20441214yg.LIZIZ("LiveGoalEffect", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C0UFT.LIZ();
            }
            videoSizeManager.getClass();
            videoSize = new VideoSize(C0UFT.LIZIZ, C0UFT.LIZLLL, C0UFT.LIZJ, C0UFT.LJ, z);
        }
        C0UFQ c0ufq2 = C0UFQ.LIZ;
        C0UFQ.LIZIZ = videoSize;
        LiveGoalInfo liveGoalInfoLJIJ = LJIJ();
        liveGoalInfoLJIJ.dragMode = !z ? 1 : 0;
        C0UFJ.LIZIZ.dragMode = !z ? 1 : 0;
        liveGoalInfoLJIJ.canvas = C0UFQ.LIZIZ();
        liveGoalInfoLJIJ.safeArea = C0UFQ.LJ();
        liveGoalInfoLJIJ.initPosition = C0UFQ.LIZLLL();
        C20337914i1<n> c20337914i1 = InterfaceC772190UQv.V3;
        String strLIZ = C769080UEw.LIZ(liveGoalInfoLJIJ);
        if (strLIZ != null) {
            nVarLIZJ = C769080UEw.LIZJ(strLIZ);
        } else {
            nVarLIZJ = null;
        }
        c20337914i1.LJFF(nVarLIZJ);
        LJIIZILJ(false);
    }
}
