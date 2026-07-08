package X;

import Y.AfS178S0100000_9;
import Y.AfS2S1100100_12;
import android.os.Looper;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.AllEffectFetchSuccessChannel;
import com.bytedance.android.live.effect.api.NewInsertStickerEvent;
import com.bytedance.android.live.effect.api.NoNewInsertStickerInPreviewEvent;
import com.bytedance.android.live.effect.api.RemoveCoHostSameInsertStickerEvent;
import com.bytedance.android.live.effect.api.StopCurrentInsertStickerEvent;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2;
import com.bytedance.android.livesdk.livesetting.effect.LiveCohostSameEffectDisplayMaxCountSetting;
import com.bytedance.android.livesdk.model.message.AnchorToolModification;
import com.bytedance.android.livesdk.model.message.AnchorToolModificationMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767630U9h implements InterfaceC769090UEx {
    public static DataChannel LLILLJJLI;
    public static C767640U9i LLILZLL;
    public static BPEAHandler LLIZ;
    public static final C767630U9h LL = new C767630U9h();
    public static final HashMap<String, ArrayList<ImageModel>> LLILLL = new HashMap<>();
    public static final Queue<C767640U9i> LLILZ = new PriorityBlockingQueue(4, C767640U9i.LJII);
    public static final Set<LiveEffect> LLILZIL = new LinkedHashSet();
    public static final ConcurrentHashMap<Long, C766520U5a> LLIZLLLIL = new ConcurrentHashMap<>();
    public static final C0UDQ LLJ = new C0UDQ();

    @Override // X.InterfaceC769090UEx
    public final void QI2() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = LLILLJJLI;
        if (dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) == null) {
            return;
        }
        iMessageManager.addMessageListener(C001A.ANCHOR_TOOL_MODIFICATION_MESSAGE.getIntType(), this);
    }

    @Override // X.InterfaceC769090UEx
    public final boolean rL2() {
        C767640U9i c767640U9i = LLILZLL;
        return (c767640U9i != null ? c767640U9i.LJ : null) == EnumC767650U9j.CO_HOST_SAME;
    }

    @Override // X.InterfaceC769090UEx
    public final void release() {
        IMessageManager iMessageManager;
        LLILLL.clear();
        ((PriorityBlockingQueue) LLILZ).clear();
        LLILZLL = null;
        BPEAHandler bPEAHandler = LLIZ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        DataChannel dataChannel = LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.FQ2(StopCurrentInsertStickerEvent.class);
        }
        LLIZ = null;
        LLIZLLLIL.clear();
        LLILZIL.clear();
        DataChannel dataChannel2 = LLILLJJLI;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        LLILLJJLI = null;
    }

    @Override // X.InterfaceC769090UEx
    public final String xA1() {
        C766520U5a c766520U5a;
        String str;
        C767640U9i c767640U9i = LLILZLL;
        return (c767640U9i == null || (c766520U5a = LLIZLLLIL.get(Long.valueOf(c767640U9i.LIZIZ))) == null || (str = c766520U5a.LIZ) == null) ? "" : str;
    }

    public static boolean LJFF(String str) {
        long j;
        int i;
        String str2 = InterfaceC766480U4w.LJJJJI.LIZIZ().get(str);
        if (str2 != null) {
            j = CastLongProtector.parseLong(str2);
        } else {
            j = 0;
        }
        Integer numLIZIZ = InterfaceC1106030et7.A7.LIZIZ();
        if ((Intrinsics.LJFF(str, EnumC768840UDy.PREVIEW.getValue()) || Intrinsics.LJFF(str, "background")) && numLIZIZ.intValue() < 4) {
            i = 1;
        } else {
            i = 3;
        }
        if (System.currentTimeMillis() - j >= ((long) (i * 24 * 60 * 60)) * 1000) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> LJI(java.lang.String r12) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Queue<X.0U9i> r0 = X.C767630U9h.LLILZ     // Catch: java.lang.NullPointerException -> L69
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.NullPointerException -> L69
            r6.<init>()     // Catch: java.lang.NullPointerException -> L69
            java.util.concurrent.PriorityBlockingQueue r0 = (java.util.concurrent.PriorityBlockingQueue) r0     // Catch: java.lang.NullPointerException -> L69
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.NullPointerException -> L69
        L12:
            boolean r0 = r7.hasNext()     // Catch: java.lang.NullPointerException -> L69
            if (r0 == 0) goto L50
            java.lang.Object r5 = r7.next()     // Catch: java.lang.NullPointerException -> L69
            r4 = r5
            X.0U9i r4 = (X.C767640U9i) r4     // Catch: java.lang.NullPointerException -> L69
            X.0U9h r0 = X.C767630U9h.LL     // Catch: java.lang.NullPointerException -> L69
            r0.getClass()     // Catch: java.lang.NullPointerException -> L69
            boolean r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2.enable()     // Catch: java.lang.NullPointerException -> L69
            r2 = 0
            if (r0 == 0) goto L3c
            java.lang.String r0 = "livebackground"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r12, r0)     // Catch: java.lang.NullPointerException -> L69
            if (r0 == 0) goto L36
            boolean r0 = r4.LJFF     // Catch: java.lang.NullPointerException -> L69
            goto L3d
        L36:
            boolean r0 = r4.LJFF     // Catch: java.lang.NullPointerException -> L69
            if (r0 == 0) goto L3c
            r0 = 0
            goto L3d
        L3c:
            r0 = 1
        L3d:
            if (r0 == 0) goto L4a
            X.0U9j r1 = r4.LJ     // Catch: java.lang.NullPointerException -> L69
            X.0U9j r0 = X.EnumC767650U9j.CO_HOST_SAME     // Catch: java.lang.NullPointerException -> L69
            if (r1 != r0) goto L4a
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r4.LIZ     // Catch: java.lang.NullPointerException -> L69
            if (r0 == 0) goto L4a
            r2 = 1
        L4a:
            if (r2 == 0) goto L12
            r6.add(r5)     // Catch: java.lang.NullPointerException -> L69
            goto L12
        L50:
            java.util.Iterator r1 = r6.iterator()     // Catch: java.lang.NullPointerException -> L69
        L54:
            boolean r0 = r1.hasNext()     // Catch: java.lang.NullPointerException -> L69
            if (r0 == 0) goto L68
            java.lang.Object r0 = r1.next()     // Catch: java.lang.NullPointerException -> L69
            X.0U9i r0 = (X.C767640U9i) r0     // Catch: java.lang.NullPointerException -> L69
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = r0.LIZ     // Catch: java.lang.NullPointerException -> L69
            if (r0 == 0) goto L54
            r3.add(r0)     // Catch: java.lang.NullPointerException -> L69
            goto L54
        L68:
            return r3
        L69:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "elements: "
            r1.append(r0)
            java.util.Queue<X.0U9i> r5 = X.C767630U9h.LLILZ
            java.lang.String r6 = ","
            r7 = 0
            r9 = 0
            r12 = 62
            r8 = r7
            r10 = r7
            r11 = r7
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "InsertStickerManager"
            X.C20441214yg.LJ(r0, r1)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = "error_type"
            java.lang.String r0 = "getInsertStickers_NullPointerException"
            r3.put(r1, r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r6 = ","
            r12 = 62
            r8 = r7
            r10 = r7
            r11 = r7
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "elements"
            r2.put(r0, r1)
            java.lang.String r1 = "error_stack"
            java.lang.String r0 = android.util.Log.getStackTraceString(r4)
            r2.put(r1, r0)
            java.lang.String r0 = "ttlive_quality_stability_error"
            X.C1CC2.LIZLLL(r0, r3, r7, r2)
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767630U9h.LJI(java.lang.String):java.util.List");
    }

    public static boolean LJII(LiveEffect liveEffect) {
        if (LiveBroadcastBackgroundPhase2.enable() && Intrinsics.LJFF("livebackground", liveEffect.getPanel())) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(LiveEffect liveEffect) {
        long jLIZ = C158B.LIZ();
        long jLJJIIZ = liveEffect.LJJIIZ();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        if (jLJJIIZ * j < jLIZ && liveEffect.LLIIL() * j > jLIZ) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(String str) {
        String resourceId;
        if (str == null) {
            return false;
        }
        Queue<C767640U9i> queue = LLILZ;
        if (!(queue instanceof Collection) || !queue.isEmpty()) {
            for (C767640U9i c767640U9i : (PriorityBlockingQueue) queue) {
                LiveEffect liveEffect = c767640U9i.LIZ;
                if (liveEffect != null) {
                    resourceId = liveEffect.getResourceId();
                } else {
                    resourceId = null;
                }
                if (Intrinsics.LJFF(resourceId, str) && c767640U9i.LJ == EnumC767650U9j.CO_HOST_SAME) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LJIIJ(LiveEffect liveEffect) {
        if (System.currentTimeMillis() - liveEffect.LJLLLLLL() < 7776000000L) {
            return true;
        }
        return false;
    }

    public static void LJIIL(EnumC767650U9j enumC767650U9j) {
        EnumC767650U9j enumC767650U9j2;
        C19719612Di.LJJIII(LLILZ, new AwS591S0100000_12(enumC767650U9j, 47), true);
        C767640U9i c767640U9i = LLILZLL;
        if (c767640U9i != null) {
            enumC767650U9j2 = c767640U9i.LJ;
        } else {
            enumC767650U9j2 = null;
        }
        if (enumC767650U9j2 == enumC767650U9j) {
            LLILZLL = null;
            DataChannel dataChannel = LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.FQ2(StopCurrentInsertStickerEvent.class);
            }
        }
        if (enumC767650U9j == EnumC767650U9j.CO_HOST_SAME) {
            LLILLL.clear();
            BPEAHandler bPEAHandler = LLIZ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            DataChannel dataChannel2 = LLILLJJLI;
            if (dataChannel2 != null) {
                dataChannel2.FQ2(RemoveCoHostSameInsertStickerEvent.class);
            }
        }
    }

    public static void LJIILIIL(C767640U9i c767640U9i) {
        int iHashCode;
        String value;
        Long lValueOf = null;
        if (c767640U9i.LJ == EnumC767650U9j.CO_HOST_SAME) {
            long jLIZ = C158B.LIZ();
            long j = c767640U9i.LIZJ + 10000;
            if (jLIZ >= j) {
                c767640U9i.LJI = true;
                LLILZLL = c767640U9i;
                DataChannel dataChannel = LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.LC0(NewInsertStickerEvent.class, c767640U9i);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sendNewInsertEvent, cohost effectId: ");
                LiveEffect liveEffect = c767640U9i.LIZ;
                if (liveEffect != null) {
                    lValueOf = Long.valueOf(liveEffect.getEffectId());
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(", dataChannel: ${dataChannel.hashCode()");
                C20441214yg.LIZIZ("InsertStickerManager", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            long j2 = j - jLIZ;
            BPEAHandler bPEAHandler = LLIZ;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            BPEAHandler bPEAHandler2 = LLIZ;
            if (bPEAHandler2 != null) {
                C786410Ut5.LJLIIL(j2, bPEAHandler2, new Runnable() { // from class: X.0U8A
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("InsertStickerManager@1b5f.sendNewInsertEvent$1");
                        try {
                            C767630U9h.LL.VH(false);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("InsertStickerManager@1b5f.sendNewInsertEvent$1");
                    }
                });
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sendNewInsertEvent, cohost effectId: ");
            LiveEffect liveEffect2 = c767640U9i.LIZ;
            if (liveEffect2 != null) {
                lValueOf = Long.valueOf(liveEffect2.getEffectId());
            }
            sbLIZ2.append(lValueOf);
            sbLIZ2.append(" delay: ");
            sbLIZ2.append(j2);
            sbLIZ2.append(", dataChannel: ${dataChannel.hashCode()");
            C20441214yg.LIZIZ("InsertStickerManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        LiveEffect liveEffect3 = c767640U9i.LIZ;
        if (liveEffect3 != null) {
            C20337914i1<Set<String>> c20337914i1 = InterfaceC766480U4w.LJJIIZI;
            c20337914i1.LIZIZ().add(liveEffect3.getResourceId());
            c20337914i1.LIZJ();
            if (c767640U9i.LJ == EnumC767650U9j.BACKGROUND_INSERT) {
                value = "background";
            } else {
                EnumC768840UDy enumC768840UDy = (EnumC768840UDy) DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class);
                if (enumC768840UDy != null && (value = enumC768840UDy.getValue()) != null) {
                }
            }
            C20337914i1<Map<String, String>> c20337914i12 = InterfaceC766480U4w.LJJJJI;
            c20337914i12.LIZIZ().put(value, String.valueOf(System.currentTimeMillis()));
            c20337914i12.LIZJ();
        }
        c767640U9i.LJI = true;
        LLILZLL = c767640U9i;
        DataChannel dataChannel2 = LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.LC0(NewInsertStickerEvent.class, c767640U9i);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("sendNewInsertEvent, other effectId: ");
        LiveEffect liveEffect4 = c767640U9i.LIZ;
        if (liveEffect4 != null) {
            lValueOf = Long.valueOf(liveEffect4.getEffectId());
        }
        sbLIZ3.append(lValueOf);
        sbLIZ3.append(", dataChannel: ");
        DataChannel dataChannel3 = LLILLJJLI;
        if (dataChannel3 != null) {
            iHashCode = dataChannel3.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ3.append(iHashCode);
        C20441214yg.LIZIZ("InsertStickerManager", C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // X.InterfaceC769090UEx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EN2(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Queue<X.0U9i> r1 = X.C767630U9h.LLILZ
            r0 = 11
            kotlin.jvm.internal.AFwS245S0000000_12 r0 = kotlin.jvm.internal.AFwS245S0000000_12.get$arr$(r0)
            X.C500260Jjc.LJJJLZIJ(r1, r0)
            boolean r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastBackgroundPhase2.enable()
            r2 = 0
            if (r0 == 0) goto L4f
            java.lang.String r0 = "all"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L48
            java.lang.String r1 = "livebackground"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r1)
            if (r0 == 0) goto L32
            X.0U9i r0 = X.C767630U9h.LLILZLL
            if (r0 == 0) goto L4d
            boolean r0 = r0.LJFF
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L2c:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 != 0) goto L48
        L32:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r1)
            if (r0 != 0) goto L4a
            X.0U9i r0 = X.C767630U9h.LLILZLL
            if (r0 == 0) goto L4b
            boolean r0 = r0.LJFF
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L42:
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto L4a
        L48:
            X.C767630U9h.LLILZLL = r2
        L4a:
            return
        L4b:
            r0 = r2
            goto L42
        L4d:
            r0 = r2
            goto L2c
        L4f:
            X.C767630U9h.LLILZLL = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767630U9h.EN2(java.lang.String):void");
    }

    public final synchronized void LIZJ(C767640U9i c767640U9i) {
        DataChannel dataChannel;
        C767780U9w c767780U9w = C767780U9w.LIZ;
        if (C500260Jjc.LJJJI(Boolean.valueOf(C767780U9w.LIZIZ(c767640U9i.LIZ)))) {
            if (C500260Jjc.LJJIJLIJ() && (dataChannel = LLILLJJLI) != null) {
                dataChannel.FQ2(NoNewInsertStickerInPreviewEvent.class);
            }
        } else {
            if (LiveBroadcastBackgroundPhase2.enable()) {
                LIZLLL(c767640U9i);
            } else {
                LJ(c767640U9i);
            }
        }
    }

    public final void LIZLLL(C767640U9i c767640U9i) {
        Effect effect;
        int i;
        Effect effect2;
        C766720U5u c766720U5u = C766720U5u.LIZ;
        LiveEffect liveEffect = c767640U9i.LIZ;
        Object obj = null;
        if (liveEffect != null) {
            effect = liveEffect.LIZJ;
        } else {
            effect = null;
        }
        c766720U5u.getClass();
        if (!C766720U5u.LJIIZILJ(effect)) {
            LiveEffect liveEffect2 = c767640U9i.LIZ;
            if (liveEffect2 != null) {
                effect2 = liveEffect2.LIZJ;
            } else {
                effect2 = null;
            }
            c766720U5u.getClass();
            C766720U5u.LJFF(effect2, null);
        }
        boolean z = false;
        if (c767640U9i.LJ == EnumC767650U9j.CO_HOST_SAME) {
            Queue<C767640U9i> queue = LLILZ;
            if ((queue instanceof Collection) && queue.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = ((PriorityBlockingQueue) queue).iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((C767640U9i) it2.next()).LJ == EnumC767650U9j.CO_HOST_SAME && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (i > LiveCohostSameEffectDisplayMaxCountSetting.INSTANCE.getValue()) {
                for (Object obj2 : (PriorityBlockingQueue) LLILZ) {
                    if (((C767640U9i) obj2).LJ == EnumC767650U9j.CO_HOST_SAME) {
                        obj = obj2;
                    }
                }
                ((PriorityBlockingQueue) LLILZ).remove(obj);
            }
            C500260Jjc.LJJJLZIJ(LLILZ, new AwS591S0100000_12(c767640U9i, 45));
        }
        ((PriorityBlockingQueue) LLILZ).offer(c767640U9i);
        EnumC767650U9j enumC767650U9j = c767640U9i.LJ;
        if (enumC767650U9j == EnumC767650U9j.CO_HOST_SAME || enumC767650U9j == EnumC767650U9j.MULTI_GUEST_INSERT || enumC767650U9j == EnumC767650U9j.CO_HOST_INSERT) {
            z = true;
        }
        VH(z);
    }

    public final void LJ(C767640U9i c767640U9i) {
        Effect effect;
        int i;
        DataChannel dataChannel;
        EnumC767650U9j enumC767650U9j = c767640U9i.LJ;
        Object obj = null;
        if (enumC767650U9j != EnumC767650U9j.CO_HOST_SAME && enumC767650U9j.isSticker()) {
            Queue<C767640U9i> queue = LLILZ;
            if (!(queue instanceof Collection) || !queue.isEmpty()) {
                int i2 = 0;
                for (C767640U9i c767640U9i2 : (PriorityBlockingQueue) queue) {
                    if (c767640U9i2.LJ == EnumC767650U9j.CO_HOST_SAME && C500260Jjc.LJJIFFI(Boolean.valueOf(c767640U9i2.LJI)) && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
                if (i2 > 0) {
                    if (C500260Jjc.LJJIJLIJ() && (dataChannel = LLILLJJLI) != null) {
                        dataChannel.FQ2(NoNewInsertStickerInPreviewEvent.class);
                        return;
                    }
                    return;
                }
            }
        }
        C766720U5u c766720U5u = C766720U5u.LIZ;
        LiveEffect liveEffect = c767640U9i.LIZ;
        if (liveEffect != null) {
            effect = liveEffect.LIZJ;
        } else {
            effect = null;
        }
        c766720U5u.getClass();
        if (!C766720U5u.LJIIZILJ(effect)) {
            C766720U5u.LJ(c767640U9i.LIZ, null);
        }
        EnumC767650U9j enumC767650U9j2 = c767640U9i.LJ;
        if (enumC767650U9j2 == EnumC767650U9j.CO_HOST_SAME) {
            Queue<C767640U9i> queue2 = LLILZ;
            if ((queue2 instanceof Collection) && queue2.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = ((PriorityBlockingQueue) queue2).iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((C767640U9i) it2.next()).LJ == EnumC767650U9j.CO_HOST_SAME && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            if (i > LiveCohostSameEffectDisplayMaxCountSetting.INSTANCE.getValue()) {
                for (Object obj2 : (PriorityBlockingQueue) LLILZ) {
                    if (((C767640U9i) obj2).LJ == EnumC767650U9j.CO_HOST_SAME) {
                        obj = obj2;
                    }
                }
                ((PriorityBlockingQueue) LLILZ).remove(obj);
            }
            C500260Jjc.LJJJLZIJ(LLILZ, new AwS591S0100000_12(c767640U9i, 46));
        } else if (enumC767650U9j2.isSticker()) {
            C500260Jjc.LJJJLZIJ(LLILZ, AFwS245S0000000_12.get$arr$(10));
        }
        ((PriorityBlockingQueue) LLILZ).offer(c767640U9i);
        VH(false);
    }

    @Override // X.InterfaceC769090UEx
    public final void VH(boolean z) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        EnumC767650U9j enumC767650U9j;
        DataChannel dataChannel3;
        DataChannel dataChannel4;
        Object obj = null;
        if (LiveBroadcastBackgroundPhase2.enable()) {
            Queue<C767640U9i> queue = LLILZ;
            AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(14);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (PriorityBlockingQueue) queue) {
                if (((Boolean) aFwS245S0000000_12.invoke(obj2)).booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            arrayList.addAll(arrayList2);
            C08XD.LJJ(arrayList, C767640U9i.LJII);
            C767640U9i c767640U9i = (C767640U9i) C13LP.LJJJLL(arrayList);
            if (c767640U9i == null) {
                LLILZLL = null;
                if (C500260Jjc.LJJIJLIJ() && (dataChannel4 = LLILLJJLI) != null) {
                    dataChannel4.FQ2(NoNewInsertStickerInPreviewEvent.class);
                    return;
                }
                return;
            }
            if (LLILZLL != null && (enumC767650U9j = c767640U9i.LJ) != EnumC767650U9j.CO_HOST_SAME && enumC767650U9j != EnumC767650U9j.MULTI_GUEST_INSERT && enumC767650U9j != EnumC767650U9j.CO_HOST_INSERT && !z) {
                if (!C500260Jjc.LJJIJLIJ() || (dataChannel3 = LLILLJJLI) == null) {
                    return;
                }
                dataChannel3.FQ2(NoNewInsertStickerInPreviewEvent.class);
                return;
            }
            LLILZLL = null;
            Object objLJJJLL = C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
            Object objLJJJLL2 = C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground"));
            if (!Intrinsics.LJFF(objLJJJLL, c767640U9i.LIZ) && !Intrinsics.LJFF(objLJJJLL2, c767640U9i.LIZ)) {
                LJIILIIL(c767640U9i);
                return;
            } else {
                c767640U9i.LJI = true;
                VH(LiveBroadcastBackgroundPhase2.enable());
                return;
            }
        }
        Iterator it2 = ((PriorityBlockingQueue) LLILZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!((C767640U9i) next).LJI) {
                obj = next;
                break;
            }
        }
        C767640U9i c767640U9i2 = (C767640U9i) obj;
        if (c767640U9i2 == null) {
            if (C500260Jjc.LJJIJLIJ() && (dataChannel2 = LLILLJJLI) != null) {
                dataChannel2.FQ2(NoNewInsertStickerInPreviewEvent.class);
                return;
            }
            return;
        }
        C767640U9i c767640U9i3 = LLILZLL;
        if (c767640U9i3 != null && c767640U9i2.LJ.getPriority() < c767640U9i3.LJ.getPriority()) {
            if (C500260Jjc.LJJIJLIJ() && (dataChannel = LLILLJJLI) != null) {
                dataChannel.FQ2(NoNewInsertStickerInPreviewEvent.class);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ)), c767640U9i2.LIZ)) {
            c767640U9i2.LJI = true;
            VH(false);
        } else {
            LJIILIIL(c767640U9i2);
        }
    }

    @Override // X.InterfaceC769090UEx
    public final void kY0(DataChannel dataChannel) {
        int iHashCode;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init， dataChannel: ");
        if (dataChannel != null) {
            iHashCode = dataChannel.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LIZIZ("InsertStickerManager", C2188811AlT.LIZIZ(sbLIZ));
        LLILLJJLI = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(LinkCrossRoomStateChangeEvent.class, this, AFwS245S0000000_12.get$arr$(12));
            dataChannel.CQ2(AllEffectFetchSuccessChannel.class, this, AFwS245S0000000_12.get$arr$(13));
        }
        LLIZ = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        LiveEffect liveEffectNQ2;
        LifecycleOwner lifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        String resourceId;
        if (iMessage instanceof AnchorToolModificationMessage) {
            AnchorToolModificationMessage anchorToolModificationMessage = (AnchorToolModificationMessage) iMessage;
            AnchorToolModification anchorToolModification = anchorToolModificationMessage.modification;
            if (anchorToolModification.modificationType == 1 || (LiveBroadcastBackgroundPhase2.enable() && anchorToolModification.modificationType == 8 && anchorToolModification.status == 1)) {
                AnchorToolModification anchorToolModification2 = anchorToolModificationMessage.modification;
                long j = anchorToolModification2.userId;
                String str = anchorToolModification2.resourceId;
                long j2 = anchorToolModification2.startTime * 1000;
                long j3 = anchorToolModification2.endTime * 1000;
                Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(LLILLJJLI);
                if ((roomLJJLIIIIJ != null && j == roomLJJLIIIIJ.getOwnerUserId()) || DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class) == EnumC768840UDy.MULTI_GUEST) {
                    return;
                }
                if (j3 != 0) {
                    if (j3 - j2 < 10000) {
                        for (Object obj : (PriorityBlockingQueue) LLILZ) {
                            C767640U9i c767640U9i = (C767640U9i) obj;
                            if (c767640U9i.LIZIZ == j) {
                                LiveEffect liveEffect = c767640U9i.LIZ;
                                if (liveEffect != null) {
                                    resourceId = liveEffect.getResourceId();
                                } else {
                                    resourceId = null;
                                }
                                if (Intrinsics.LJFF(resourceId, str) && c767640U9i.LIZJ == j2) {
                                    if (obj != null) {
                                        ((PriorityBlockingQueue) LLILZ).remove(obj);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                if (j2 == 0) {
                    return;
                }
                int i = anchorToolModificationMessage.modification.modificationType;
                if (i != 1) {
                    if (i != 8) {
                        return;
                    } else {
                        liveEffectNQ2 = C0U60.LIZIZ().NQ2(str);
                    }
                } else {
                    liveEffectNQ2 = C0U60.LIZ().NQ2(str);
                    if (liveEffectNQ2 == null) {
                        C0UDQ c0udq = LLJ;
                        if (c0udq == null) {
                            return;
                        }
                        String str2 = C0UD4.LIZIZ;
                        DataChannel dataChannel = LLILLJJLI;
                        if (dataChannel != null) {
                            lifecycleOwner = dataChannel.LLILZ;
                        } else {
                            lifecycleOwner = null;
                        }
                        C767690U9n c767690U9n = new C767690U9n(this, str, j, j2);
                        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                            return;
                        }
                        C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C760490TsN(c0udq, str2, str, c767690U9n, null), 2);
                        return;
                    }
                }
                if (liveEffectNQ2 == null) {
                    return;
                }
                LL.getClass();
                LIZIZ(liveEffectNQ2, str, j, j2);
            }
        }
    }

    @Override // X.InterfaceC769090UEx
    public final C767640U9i p71(String str) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        if (Intrinsics.LJFF(str, "all")) {
            return LLILZLL;
        }
        if (Intrinsics.LJFF(str, "livebackground")) {
            C767640U9i c767640U9i = LLILZLL;
            if (c767640U9i != null) {
                boolValueOf2 = Boolean.valueOf(c767640U9i.LJFF);
            } else {
                boolValueOf2 = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf2)) {
                return null;
            }
            return LLILZLL;
        }
        C767640U9i c767640U9i2 = LLILZLL;
        if (c767640U9i2 != null) {
            boolValueOf = Boolean.valueOf(c767640U9i2.LJFF);
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJIFFI(boolValueOf)) {
            return null;
        }
        return LLILZLL;
    }

    @Override // X.InterfaceC769090UEx
    public final ImageModel t91(long j) {
        C766520U5a c766520U5a = LLIZLLLIL.get(Long.valueOf(j));
        if (c766520U5a != null) {
            return c766520U5a.LIZIZ;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if (r10 != null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C767640U9i LJIIJJI(java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r18, X.EnumC768840UDy r19) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767630U9h.LJIIJJI(java.util.List, X.0UDy):X.0U9i");
    }

    public final void LIZ(LiveEffect liveEffect, long j, long j2) {
        Boolean boolValueOf;
        ArrayList<ImageModel> arrayList;
        HashMap<String, ArrayList<ImageModel>> map = LLILLL;
        if (!map.containsKey(liveEffect.getResourceId())) {
            map.put(liveEffect.getResourceId(), new ArrayList<>());
        }
        ImageModel imageModelT91 = t91(j);
        if (imageModelT91 != null) {
            ArrayList<ImageModel> arrayList2 = map.get(liveEffect.getResourceId());
            if (arrayList2 != null) {
                boolValueOf = Boolean.valueOf(arrayList2.contains(imageModelT91));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf) && (arrayList = map.get(liveEffect.getResourceId())) != null) {
                arrayList.add(imageModelT91);
            }
        }
        liveEffect.LLILLL(true);
        LIZJ(new C767640U9i(liveEffect, j, j2, EnumC767650U9j.CO_HOST_SAME, LJII(liveEffect)));
    }

    public static void LIZIZ(LiveEffect liveEffect, String str, long j, long j2) {
        if (liveEffect != null) {
            ConcurrentHashMap<Long, C766520U5a> concurrentHashMap = LLIZLLLIL;
            if (concurrentHashMap.containsKey(Long.valueOf(j))) {
                LL.LIZ(liveEffect, j, j2);
                return;
            }
            C767630U9h c767630U9h = LL;
            C767680U9m c767680U9m = new C767680U9m(liveEffect, j, j2);
            c767630U9h.getClass();
            if (concurrentHashMap.containsKey(Long.valueOf(j))) {
                return;
            }
            UserService.getInstance().user().LJ(j, "InsertStickerManager_getUserInfoById", "insertSticker_fromMessag").LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS2S1100100_12(j, str, c767680U9m, 0), new AfS178S0100000_9(c767680U9m, 5));
        }
    }
}
