package X;

import Y.ARunnableS94S0000000_17;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftUserConsumeLayerSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveScoreSystemFluencyInterval;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0elb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101370elb implements InterfaceC1101120elC, InterfaceC1089980eTE, InterfaceC1101410elf {
    public static InterfaceC1078630eAv LJ;
    public static long LJFF;
    public static boolean LJII;
    public static final C1101370elb LIZ = new C1101370elb();
    public static final C1101350elZ LIZIZ = new C1101350elZ();
    public static final List<Function1<Map<String, Float>, Unit>> LIZJ = new ArrayList();
    public static final List<InterfaceC1101400ele> LIZLLL = new ArrayList();
    public static final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public static final ARunnableS94S0000000_17 LJIIIIZZ = new ARunnableS94S0000000_17(5);
    public static C1101380elc LJIIIZ = new C1101380elc();

    @Override // X.InterfaceC1101120elC
    public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg, C1100750ekb c1100750ekb) {
    }

    @Override // X.InterfaceC1089980eTE
    public final Map<String, String> LJFF() {
        InterfaceC1100990ekz interfaceC1100990ekzMessage;
        InterfaceC1100990ekz interfaceC1100990ekzMessage2;
        InterfaceC1100990ekz interfaceC1100990ekzMessage3;
        InterfaceC1100990ekz interfaceC1100990ekzMessage4;
        InterfaceC1100990ekz interfaceC1100990ekzMessage5;
        Pair[] pairArr = new Pair[5];
        C1101350elZ c1101350elZ = LIZIZ;
        InterfaceC1100800ekg interfaceC1100800ekg = c1101350elZ.LIZJ;
        float fLIZIZ = 0.0f;
        pairArr[0] = new Pair("enter_avg_qps_client", String.valueOf((interfaceC1100800ekg == null || (interfaceC1100990ekzMessage5 = interfaceC1100800ekg.message()) == null) ? 0.0f : interfaceC1100990ekzMessage5.LIZ(15, MemberMessage.class)));
        InterfaceC1100800ekg interfaceC1100800ekg2 = c1101350elZ.LIZJ;
        pairArr[1] = new Pair("chat_avg_qps_client", String.valueOf((interfaceC1100800ekg2 == null || (interfaceC1100990ekzMessage4 = interfaceC1100800ekg2.message()) == null) ? 0.0f : interfaceC1100990ekzMessage4.LIZ(15, ChatMessage.class)));
        InterfaceC1100800ekg interfaceC1100800ekg3 = c1101350elZ.LIZJ;
        pairArr[2] = new Pair("gift_avg_qps_client", String.valueOf((interfaceC1100800ekg3 == null || (interfaceC1100990ekzMessage3 = interfaceC1100800ekg3.message()) == null) ? 0.0f : interfaceC1100990ekzMessage3.LIZ(15, GiftMessage.class)));
        InterfaceC1100800ekg interfaceC1100800ekg4 = c1101350elZ.LIZJ;
        pairArr[3] = new Pair("like_avg_qps_client", String.valueOf((interfaceC1100800ekg4 == null || (interfaceC1100990ekzMessage2 = interfaceC1100800ekg4.message()) == null) ? 0.0f : interfaceC1100990ekzMessage2.LIZ(15, GiftMessage.class)));
        InterfaceC1100800ekg interfaceC1100800ekg5 = c1101350elZ.LIZJ;
        if (interfaceC1100800ekg5 != null && (interfaceC1100990ekzMessage = interfaceC1100800ekg5.message()) != null) {
            fLIZIZ = interfaceC1100990ekzMessage.LIZIZ(15);
        }
        pairArr[4] = new Pair("avg_qps_client", String.valueOf(fLIZIZ));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1101120elC
    public final void onStop() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed A[PHI: r1
      0x00ed: PHI (r1v13 boolean) = (r1v12 boolean), (r1v15 boolean), (r1v15 boolean) binds: [B:31:0x00e9, B:18:0x004a, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1101120elC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101370elb.LIZ():void");
    }

    @Override // X.InterfaceC1089980eTE
    public final float LJII() {
        return (float) LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC1089980eTE
    public final Map<String, String> LJIIJ() {
        LinkedHashMap linkedHashMap;
        Map<String, String> mapLIZIZ;
        InterfaceC1078630eAv interfaceC1078630eAv = LJ;
        if (interfaceC1078630eAv == null || (mapLIZIZ = interfaceC1078630eAv.LIZIZ()) == null) {
            linkedHashMap = new LinkedHashMap();
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZIZ.size()));
            Iterator<T> it2 = mapLIZIZ.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("revenue_");
                sbLIZ.append((String) entry.getKey());
                linkedHashMap2.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        }
        linkedHashMap.put("revenue_consumption_layer", String.valueOf(LiveGiftUserConsumeLayerSetting.INSTANCE.getValue()));
        return linkedHashMap;
    }

    @Override // X.InterfaceC1089980eTE
    public final String LJIIL() {
        C1101350elZ c1101350elZ = LIZIZ;
        c1101350elZ.getClass();
        return C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(c1101350elZ.LIZLLL())}, 1));
    }

    @Override // X.InterfaceC1089980eTE
    public final float getScore() {
        return LIZIZ.LIZLLL();
    }

    @Override // X.InterfaceC1089980eTE
    public final void LIZIZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        InterfaceC1100990ekz interfaceC1100990ekzMessage;
        C1101350elZ c1101350elZ = LIZIZ;
        c1101350elZ.LIZJ = interfaceC1100800ekg;
        for (Class<? extends AbstractC1136060ffY> cls : c1101350elZ.LIZIZ) {
            if (interfaceC1100800ekg != null && (interfaceC1100990ekzMessage = interfaceC1100800ekg.message()) != null) {
                interfaceC1100990ekzMessage.LIZJ(cls, c1101350elZ.LIZ);
            }
        }
        interfaceC1100800ekg.LJIIIIZZ(this);
        C465520INi.LIZ.s51(this);
        BPEAHandler bPEAHandler = LJI;
        ARunnableS94S0000000_17 aRunnableS94S0000000_17 = LJIIIIZZ;
        bPEAHandler.removeCallbacks(aRunnableS94S0000000_17);
        int value = LiveScoreSystemFluencyInterval.INSTANCE.getValue();
        if (value > 0) {
            C786410Ut5.LJLIIL(((long) value) * 1000, bPEAHandler, aRunnableS94S0000000_17);
        }
    }

    @Override // X.InterfaceC1101120elC
    public final void LIZLLL(InterfaceC1100800ekg interfaceC1100800ekg) {
        LJI.removeCallbacks(LJIIIIZZ);
        C1101350elZ c1101350elZ = LIZIZ;
        c1101350elZ.LIZJ = null;
        for (int i = 0; i < c1101350elZ.LIZIZ.length; i++) {
        }
        if (LJII) {
            c1101350elZ.LJFF.stop();
            LJII = false;
        }
        LJIIIZ = new C1101380elc();
    }

    @Override // X.InterfaceC1089980eTE
    public final void LJIIIIZZ(Function1<? super Map<String, Float>, Unit> function1) {
        ((ArrayList) LIZJ).remove(function1);
    }

    @Override // X.InterfaceC1101120elC
    public final void LJIIIZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        LJFF = SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC1089980eTE
    public final void LJIIJJI(Function1<? super Map<String, Float>, Unit> function1) {
        List<Function1<Map<String, Float>, Unit>> list = LIZJ;
        if (!((ArrayList) list).contains(function1)) {
            ((ArrayList) list).add(function1);
        }
    }

    @Override // X.InterfaceC1089980eTE
    public final long LJIILIIL(Long l) {
        long jElapsedRealtime;
        if (l != null) {
            jElapsedRealtime = l.longValue();
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        long j = LJFF;
        if (j > 0) {
            return jElapsedRealtime - j;
        }
        return -1L;
    }

    public final boolean LJIILJJIL(String str) {
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getAdaptLiveGiftDowngrade() && !C1135800ff8.LJJII()) {
            Integer num = (Integer) ((LinkedHashMap) C1193604li.LIZ).get(str);
            if (num != null && num.intValue() == 0) {
                return false;
            }
            LJIILL(str, true, false, true);
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("epi_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer num2 = (Integer) ((LinkedHashMap) C1193504lh.LIZ).get(strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkDowngrade: key ");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" value ");
        sbLIZ2.append(num2);
        C20441214yg.LIZIZ("GiftEpiDowngradeTrigger", C2188811AlT.LIZIZ(sbLIZ2));
        if (num2 == null || num2.intValue() != 1) {
            return false;
        }
        getClass();
        LJIILL(str, true, true, false);
        return true;
    }

    @Override // X.InterfaceC1089980eTE
    public final void LJ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateConfigByKey: key ");
        sbLIZ.append(str);
        sbLIZ.append(", value ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GiftPtfDowngradeTrigger", C2188811AlT.LIZIZ(sbLIZ));
        C1193604li.LIZ.put(str, Integer.valueOf(i));
        if (i == 1) {
            LJIILL(str, false, false, true);
        }
    }

    @Override // X.InterfaceC1089980eTE
    public final void LJI(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateConfigByKey: key ");
        sbLIZ.append(str);
        sbLIZ.append(", value ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GiftEpiDowngradeTrigger", C2188811AlT.LIZIZ(sbLIZ));
        C1193504lh.LIZ.put(str, Integer.valueOf(i));
        if (i == 1) {
            LIZ.getClass();
            LJIILL(str, false, true, false);
        }
    }

    public static void LJIILL(String str, boolean z, boolean z2, boolean z3) {
        if (!Intrinsics.LJFF(str, "live_gift_overload_downgrade_tracking_enable") && !Intrinsics.LJFF(str, "live_gift_overload_downgrade_tray_animation_enable")) {
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled() && GiftEventTrackSamplingSetting.shouldBlock(false)) {
                return;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_overload_downgrade");
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIIZ.LIZIZ.LIZ), "memory_downgrade_level");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIIZ.LIZJ.LIZ), "overload_score_downgrade_level");
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIIZ.LIZ.LIZ), "fps_downgrade_level");
            C1101350elZ c1101350elZ = LIZIZ;
            c474500IjALIZ.LJJIFFI(Float.valueOf(c1101350elZ.LIZLLL()), "overload_score");
            c474500IjALIZ.LJJIFFI(Float.valueOf(c1101350elZ.LIZJ()), "memory");
            c474500IjALIZ.LJJIII("fps", Double.valueOf(c1101350elZ.LIZIZ()));
            c474500IjALIZ.LJJII(str, "downgrade_key");
            c474500IjALIZ.LJJII(Boolean.valueOf(z), "real_downgrade");
            c474500IjALIZ.LJJII(Boolean.valueOf(z2), "is_from_epi");
            c474500IjALIZ.LJJII(Boolean.valueOf(z3), "is_from_ptf");
            c474500IjALIZ.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIZILJ(X.EnumC1999107sL r12, com.bytedance.android.livesdk.livesetting.gift.DowngradeDimensionConfig r13, X.C1101390eld r14, float r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1101370elb.LJIIZILJ(X.07sL, com.bytedance.android.livesdk.livesetting.gift.DowngradeDimensionConfig, X.0eld, float, boolean):boolean");
    }
}
