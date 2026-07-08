package X;

import com.bytedance.android.livesdk.livesetting.message.LiveMessageRealTimeTrackerSettings;
import com.bytedance.android.livesdk.livesetting.message.RealtimeTrackerConfig;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Byb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222431Byb implements InterfaceC2222261ByK, InterfaceC1300500jwm {
    public final C2222461Bye LIZ;
    public final Map<Integer, C2222491Byh> LIZIZ;
    public final C2222491Byh LIZJ;
    public long LIZLLL;
    public final C2222441Byc LJ;
    public final CopyOnWriteArrayList<C2222441Byc> LJFF;
    public long LJI;

    @Override // X.InterfaceC2222261ByK
    public final void LIZIZ() {
        ((LinkedHashMap) this.LIZIZ).clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = jCurrentTimeMillis;
        C2222441Byc c2222441Byc = this.LJ;
        c2222441Byc.LIZIZ = jCurrentTimeMillis;
        c2222441Byc.LIZ();
        ((ArrayList) C1EOY.LJIJJLI).add(this);
        this.LJI = System.currentTimeMillis();
    }

    @Override // X.InterfaceC2222261ByK
    public final void LIZLLL() {
        C1EOY c1eoy = C1EOY.LIZ;
        ((ArrayList) C1EOY.LJIJJLI).remove(this);
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJ() {
        if (!this.LIZ.LIZ) {
            return;
        }
        System.currentTimeMillis();
        this.LJ.LIZJ = System.currentTimeMillis();
        if (this.LIZ.LIZJ.contains("default")) {
            LJIIL(this.LJ);
        }
        ((LinkedHashMap) this.LIZIZ).clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZLLL = jCurrentTimeMillis;
        C2222441Byc c2222441Byc = this.LJ;
        c2222441Byc.LIZIZ = jCurrentTimeMillis;
        c2222441Byc.LIZ();
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJIILIIL() {
        C1EOY c1eoy = C1EOY.LIZ;
        ((ArrayList) C1EOY.LJIJJLI).remove(this);
        this.LJFF.clear();
        ((LinkedHashMap) this.LIZIZ).clear();
        this.LIZLLL = 0L;
        this.LJ.LIZ();
    }

    public C2222431Byb() {
        C2222461Bye c2222461Bye = new C2222461Bye();
        RealtimeTrackerConfig config = LiveMessageRealTimeTrackerSettings.INSTANCE.getConfig();
        c2222461Bye.LIZ = config.getEnable();
        c2222461Bye.LIZIZ = config.getLogSample();
        c2222461Bye.LIZJ = config.getRecordScenes();
        c2222461Bye.LIZLLL = config.getMethodsGroupName();
        c2222461Bye.LJ = config.getMethodsGroupList();
        c2222461Bye.LJFF = config.getReportInterval();
        this.LIZ = c2222461Bye;
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new C2222491Byh();
        this.LJ = new C2222441Byc("default");
        this.LJFF = new CopyOnWriteArrayList<>();
        this.LJI = System.currentTimeMillis();
    }

    @Override // X.InterfaceC2222261ByK
    public final C2222461Bye LJFF() {
        return this.LIZ;
    }

    public final C2222491Byh LJII(C2222441Byc c2222441Byc) {
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - c2222441Byc.LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        if (iCurrentTimeMillis > this.LIZ.LJFF) {
            return null;
        }
        Map<Integer, C2222491Byh> map = this.LIZIZ;
        Integer numValueOf = Integer.valueOf(iCurrentTimeMillis);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object c2222491Byh = linkedHashMap.get(numValueOf);
        if (c2222491Byh == null) {
            c2222491Byh = new C2222491Byh();
            linkedHashMap.put(numValueOf, c2222491Byh);
        }
        return (C2222491Byh) c2222491Byh;
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJIIIIZZ(int i) {
        if (!this.LIZ.LIZ) {
            return;
        }
        this.LJ.LIZIZ(i);
        Iterator<C2222441Byc> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(i);
        }
    }

    public final void LJIIIZ(List<? extends IMessage> list) {
        C2222491Byh c2222491ByhLJII;
        if ((!this.LIZ.LIZ) || (c2222491ByhLJII = LJII(this.LJ)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IMessage iMessage : list) {
            if (this.LIZ.LJ.isEmpty() || this.LIZ.LJ.contains(iMessage.getMethodName())) {
                arrayList.add(iMessage);
            }
        }
        c2222491ByhLJII.LIZIZ += arrayList.size();
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (C2221841Bxe.LIZJ(((IMessage) it2.next()).getGeneralMessageType()) && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c2222491ByhLJII.LIZLLL += i;
        c2222491ByhLJII.LIZJ += arrayList.size() - i;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            long jLJI = LJI((IMessage) it3.next(), "decode_self_message_time");
            if (jLJI >= 0) {
                C2222441Byc c2222441Byc = this.LJ;
                C2222471Byf c2222471Byf = c2222441Byc.LJIIL;
                c2222471Byf.LIZ += jLJI;
                c2222471Byf.LIZLLL++;
                c2222471Byf.LIZ(jLJI);
                c2222441Byc.LJIIL.LIZIZ(jLJI);
                for (C2222441Byc c2222441Byc2 : this.LJFF) {
                    C2222471Byf c2222471Byf2 = c2222441Byc2.LJIIL;
                    c2222471Byf2.LIZ += jLJI;
                    c2222471Byf2.LIZLLL++;
                    c2222471Byf2.LIZ(jLJI);
                    c2222441Byc2.LJIIL.LIZIZ(jLJI);
                }
            }
        }
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJIIJ(IMessage iMessage) {
        C2222461Bye c2222461Bye = this.LIZ;
        if (!c2222461Bye.LIZ) {
            return;
        }
        if ((!c2222461Bye.LJ.isEmpty()) && !this.LIZ.LJ.contains(iMessage.getMethodName())) {
            return;
        }
        C2222491Byh c2222491ByhLJII = LJII(this.LJ);
        if (c2222491ByhLJII != null) {
            c2222491ByhLJII.LJ++;
            if (Intrinsics.LJFF(iMessage.getExtraParams().get("is_direct_dispatch"), 1)) {
                c2222491ByhLJII.LJII++;
            }
            if (C2221841Bxe.LIZJ(iMessage.getGeneralMessageType())) {
                c2222491ByhLJII.LJI++;
            } else {
                c2222491ByhLJII.LJFF++;
            }
        }
        long jLJI = LJI(iMessage, "all_time");
        if (jLJI > 0) {
            C2222441Byc c2222441Byc = this.LJ;
            C2222471Byf c2222471Byf = c2222441Byc.LJIILIIL;
            c2222471Byf.LIZ += jLJI;
            c2222471Byf.LIZLLL++;
            c2222471Byf.LIZ(jLJI);
            c2222441Byc.LJIILIIL.LIZIZ(jLJI);
            for (C2222441Byc c2222441Byc2 : this.LJFF) {
                C2222471Byf c2222471Byf2 = c2222441Byc2.LJIILIIL;
                c2222471Byf2.LIZ += jLJI;
                c2222471Byf2.LIZLLL++;
                c2222471Byf2.LIZ(jLJI);
                c2222441Byc2.LJIILIIL.LIZIZ(jLJI);
            }
        }
        if (LJI(iMessage, "enqueue_time") > 0) {
            C2222441Byc c2222441Byc3 = this.LJ;
            C2222471Byf c2222471Byf3 = c2222441Byc3.LJIILJJIL;
            c2222471Byf3.LIZ += jLJI;
            c2222471Byf3.LIZLLL++;
            c2222471Byf3.LIZ(jLJI);
            c2222441Byc3.LJIILJJIL.LIZIZ(jLJI);
            for (C2222441Byc c2222441Byc4 : this.LJFF) {
                C2222471Byf c2222471Byf4 = c2222441Byc4.LJIILJJIL;
                c2222471Byf4.LIZ += jLJI;
                c2222471Byf4.LIZLLL++;
                c2222471Byf4.LIZ(jLJI);
                c2222441Byc4.LJIILJJIL.LIZIZ(jLJI);
            }
        }
    }

    public final void LJIIJJI(List<ProtoApiResult.ProtoMessage> list) {
        C2222491Byh c2222491ByhLJII;
        if ((!this.LIZ.LIZ) || (c2222491ByhLJII = LJII(this.LJ)) == null) {
            return;
        }
        int i = 0;
        for (ProtoApiResult.ProtoMessage protoMessage : list) {
            if (this.LIZ.LJ.isEmpty() || this.LIZ.LJ.contains(protoMessage.method)) {
                i++;
            }
        }
        c2222491ByhLJII.LIZ += i;
    }

    public final void LJIIL(C2222441Byc c2222441Byc) {
        long j;
        long j2;
        long j3;
        double d;
        if (new SecureRandom().nextDouble() < this.LIZ.LIZIZ / LSPassThroughRecordSizeConfig.DEFAULT) {
            long j4 = c2222441Byc.LIZJ;
            long j5 = c2222441Byc.LIZIZ;
            long j6 = j4 - j5;
            long j7 = j5 - this.LIZLLL;
            long j8 = LSPassThroughRecordSizeConfig.DEFAULT;
            int i = (int) (j7 / j8);
            int i2 = 0;
            if (i < 0) {
                i = 0;
            }
            int iMin = Math.min((int) (j6 / j8), this.LIZ.LJFF);
            long j9 = 0;
            if (i <= iMin && iMin >= 1) {
                if (iMin - i >= 3) {
                    iMin--;
                }
                if (i <= iMin) {
                    int i3 = i;
                    while (true) {
                        C2222491Byh c2222491Byh = (C2222491Byh) ((LinkedHashMap) this.LIZIZ).get(Integer.valueOf(i3));
                        if (c2222491Byh == null) {
                            c2222491Byh = this.LIZJ;
                        }
                        int i4 = c2222491Byh.LIZ;
                        C2222451Byd c2222451Byd = c2222441Byc.LIZLLL;
                        c2222451Byd.LIZ += (double) i4;
                        c2222451Byd.LJ(i4);
                        c2222441Byc.LIZLLL.LJFF(i4);
                        int i5 = c2222491Byh.LIZIZ;
                        C2222451Byd c2222451Byd2 = c2222441Byc.LJ;
                        c2222451Byd2.LIZ += (double) i5;
                        c2222451Byd2.LJ(i5);
                        c2222441Byc.LJ.LJFF(i5);
                        int i6 = c2222491Byh.LIZJ;
                        C2222451Byd c2222451Byd3 = c2222441Byc.LJFF;
                        c2222451Byd3.LIZ += (double) i6;
                        c2222451Byd3.LJ(i6);
                        c2222441Byc.LJFF.LJFF(i6);
                        int i7 = c2222491Byh.LIZLLL;
                        C2222451Byd c2222451Byd4 = c2222441Byc.LJI;
                        c2222451Byd4.LIZ += (double) i7;
                        c2222451Byd4.LJ(i7);
                        c2222441Byc.LJI.LJFF(i7);
                        int i8 = c2222491Byh.LJ;
                        C2222451Byd c2222451Byd5 = c2222441Byc.LJII;
                        c2222451Byd5.LIZ += (double) i8;
                        c2222451Byd5.LJ(i8);
                        c2222441Byc.LJII.LJFF(i8);
                        int i9 = c2222491Byh.LJI;
                        C2222451Byd c2222451Byd6 = c2222441Byc.LJIIIZ;
                        c2222451Byd6.LIZ += (double) i9;
                        c2222451Byd6.LJ(i9);
                        c2222441Byc.LJIIIZ.LJFF(i9);
                        int i10 = c2222491Byh.LJFF;
                        C2222451Byd c2222451Byd7 = c2222441Byc.LJIIIIZZ;
                        c2222451Byd7.LIZ += (double) i10;
                        c2222451Byd7.LJ(i10);
                        c2222441Byc.LJIIIIZZ.LJFF(i10);
                        int i11 = c2222491Byh.LJII;
                        C2222451Byd c2222451Byd8 = c2222441Byc.LJIIJ;
                        c2222451Byd8.LIZ += (double) i11;
                        c2222451Byd8.LJ(i11);
                        c2222441Byc.LJIIJ.LJFF(i11);
                        if (i3 == iMin) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                double d2 = (iMin - i) + 1;
                c2222441Byc.LIZLLL.LIZ /= d2;
                c2222441Byc.LJ.LIZ /= d2;
                c2222441Byc.LJFF.LIZ /= d2;
                c2222441Byc.LJI.LIZ /= d2;
                c2222441Byc.LJII.LIZ /= d2;
                c2222441Byc.LJIIIIZZ.LIZ /= d2;
                c2222441Byc.LJIIIZ.LIZ /= d2;
                c2222441Byc.LJIIJ.LIZ /= d2;
                C2222481Byg c2222481Byg = c2222441Byc.LJIIJJI;
                c2222481Byg.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (c2222481Byg.LIZ != 0) {
                    if (c2222481Byg.LIZIZ != 0) {
                        c2222481Byg.LJ += ((long) r3) * (jCurrentTimeMillis - r0) * 1.0d;
                    }
                }
                long j10 = jCurrentTimeMillis - c2222481Byg.LIZJ;
                if (j10 > 0) {
                    d = c2222481Byg.LJ / j10;
                } else {
                    d = 0.0d;
                }
                c2222481Byg.LIZLLL = d;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_im_full_link");
            c474500IjALIZ.LJJII(c2222441Byc.LIZ, Scene.SCENE_SERVICE);
            c474500IjALIZ.LJJII(this.LIZ.LIZLLL, "methods_group_name");
            c474500IjALIZ.LJJII(Long.valueOf(c2222441Byc.LIZJ - c2222441Byc.LIZIZ), "duration");
            c474500IjALIZ.LJJII(c2222441Byc.LIZLLL.LIZJ(), "receive_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LIZLLL.LIZ()), "receive_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LIZLLL.LIZIZ()), "receive_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJ.LIZJ(), "decode_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJ.LIZ()), "decode_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJ.LIZIZ()), "decode_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJFF.LIZJ(), "room_decode_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJFF.LIZ()), "room_decode_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJFF.LIZIZ()), "room_decode_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJI.LIZJ(), "p2p_decode_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJI.LIZ()), "p2p_decode_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJI.LIZIZ()), "p2p_decode_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJII.LIZJ(), "dispatch_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJII.LIZ()), "dispatch_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJII.LIZIZ()), "dispatch_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJIIIIZZ.LIZJ(), "room_dispatch_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJIIIIZZ.LIZ()), "room_dispatch_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJIIIIZZ.LIZIZ()), "room_dispatch_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJIIIZ.LIZJ(), "p2p_dispatch_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJIIIZ.LIZ()), "p2p_dispatch_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJIIIZ.LIZIZ()), "p2p_dispatch_tps_min");
            c474500IjALIZ.LJJII(c2222441Byc.LJIIJ.LIZJ(), "direct_dispatch_tps");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJIIJ.LIZ()), "direct_dispatch_tps_max");
            c474500IjALIZ.LJJII(Integer.valueOf(c2222441Byc.LJIIJ.LIZIZ()), "direct_dispatch_tps_min");
            c474500IjALIZ.LJJII(C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(c2222441Byc.LJIIJJI.LIZLLL)}, 1)), "dispatch_buffer_count");
            int i12 = c2222441Byc.LJIIJJI.LJFF;
            if (i12 == -1) {
                i12 = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i12), "dispatch_buffer_count_max");
            int i13 = c2222441Byc.LJIIJJI.LJI;
            if (i13 != -1) {
                i2 = i13;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "dispatch_buffer_count_min");
            C2222471Byf c2222471Byf = c2222441Byc.LJIIL;
            int i14 = c2222471Byf.LIZLLL;
            if (i14 > 0) {
                j = c2222471Byf.LIZ / ((long) i14);
            } else {
                j = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j), "decode_time");
            long j11 = c2222441Byc.LJIIL.LIZIZ;
            if (j11 == -1) {
                j11 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j11), "decode_time_max");
            long j12 = c2222441Byc.LJIIL.LIZJ;
            if (j12 == -1) {
                j12 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j12), "decode_time_min");
            C2222471Byf c2222471Byf2 = c2222441Byc.LJIILIIL;
            int i15 = c2222471Byf2.LIZLLL;
            if (i15 > 0) {
                j2 = c2222471Byf2.LIZ / ((long) i15);
            } else {
                j2 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j2), "dispatch_time");
            long j13 = c2222441Byc.LJIILIIL.LIZIZ;
            if (j13 == -1) {
                j13 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j13), "dispatch_time_max");
            long j14 = c2222441Byc.LJIILIIL.LIZJ;
            if (j14 == -1) {
                j14 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j14), "dispatch_time_min");
            C2222471Byf c2222471Byf3 = c2222441Byc.LJIILJJIL;
            int i16 = c2222471Byf3.LIZLLL;
            if (i16 > 0) {
                j3 = c2222471Byf3.LIZ / ((long) i16);
            } else {
                j3 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j3), "dispatch_wait_time");
            long j15 = c2222441Byc.LJIILJJIL.LIZIZ;
            if (j15 == -1) {
                j15 = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j15), "dispatch_wait_time_max");
            long j16 = c2222441Byc.LJIILJJIL.LIZJ;
            if (j16 != -1) {
                j9 = j16;
            }
            c474500IjALIZ.LJJII(Long.valueOf(j9), "dispatch_wait_time_min");
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LJI), "watch_duration");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        }
    }

    public static long LJI(IMessage iMessage, String str) {
        try {
            Object obj = iMessage.getExtraParams().get(MessageMonitor.getLiveMessageStageName(str, MessageMonitor.Stage.END));
            Object obj2 = iMessage.getExtraParams().get(MessageMonitor.getLiveMessageStageName(str, MessageMonitor.Stage.START));
            if ((obj2 instanceof Long) && (obj instanceof Long) && ((Number) obj).longValue() >= ((Number) obj2).longValue()) {
                return ((Number) obj).longValue() - ((Number) obj2).longValue();
            }
            return -1L;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1L;
        }
    }

    @Override // X.InterfaceC1300500jwm
    public final void LIZ(long j, String str) {
        if (this.LIZ.LIZJ.contains(str)) {
            Iterator<C2222441Byc> it2 = this.LJFF.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C2222441Byc next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    if (next != null) {
                        return;
                    }
                }
            }
            CopyOnWriteArrayList<C2222441Byc> copyOnWriteArrayList = this.LJFF;
            C2222441Byc c2222441Byc = new C2222441Byc(str);
            c2222441Byc.LIZIZ = j;
            copyOnWriteArrayList.add(c2222441Byc);
        }
    }

    @Override // X.InterfaceC1300500jwm
    public final void LIZJ(long j, String str) {
        if (this.LIZ.LIZJ.contains(str)) {
            CopyOnWriteArrayList<C2222441Byc> copyOnWriteArrayList = this.LJFF;
            ArrayList arrayList = new ArrayList();
            for (C2222441Byc c2222441Byc : copyOnWriteArrayList) {
                if (Intrinsics.LJFF(c2222441Byc.LIZ, str)) {
                    arrayList.add(c2222441Byc);
                }
            }
            List<C2222441Byc> listLLIIII = C13LP.LLIIII(arrayList);
            for (C2222441Byc c2222441Byc2 : listLLIIII) {
                c2222441Byc2.LIZJ = j;
                LJIIL(c2222441Byc2);
            }
            this.LJFF.removeAll(listLLIIII);
        }
    }
}
