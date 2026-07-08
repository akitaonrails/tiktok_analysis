package X;

import android.os.Looper;
import com.bytedance.android.livesdk.dataChannel.GlobalInflowMessage;
import com.bytedance.android.livesdk.livesetting.watchlive.RoomScreenStatusObserveNewSetting;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.bytedance.android.livesdk.model.message.SeqDetectResult;
import com.bytedance.android.livesdk.signaling.model.BaseDownlinkData;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusData;
import com.bytedance.android.livesdk.signaling.model.downlink.DownlinkLiveStatusItem;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS125S0110000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Iun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481710Iun implements InterfaceC486470J5x, C0CW2<DownlinkLiveStatusData> {
    public static boolean LLILLL;
    public static boolean LLILZ;
    public static final C481710Iun LL = new C481710Iun();
    public static final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(349));
    public static final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public static final ConcurrentHashMap<Long, C481730Iup> LLILZLL = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<Long> LLIZ = new CopyOnWriteArraySet<>();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZJ() {
        LL.getClass();
        if (!((Boolean) LLILLJJLI.getValue()).booleanValue() || LLILZ) {
            return;
        }
        C481670Iuj c481670Iuj = C481670Iuj.LIZ;
        Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
        Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
        if (obj == null) {
            synchronized (c481670Iuj) {
                try {
                    Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486370J5n.class));
                    obj = obj2;
                    if (obj2 == null) {
                        C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486370J5n.class);
                        C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                        map.put(C13LE.LIZ(C486370J5n.class), c486370J5n);
                        obj = c486370J5n;
                        if (c486370J5n != null) {
                            C0J65.LL.LJI(c486370J5n);
                            obj = c486370J5n;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0J66 c0j66 = (C0J66) (obj instanceof C486370J5n ? obj : null);
        if (c0j66 != null) {
            c0j66.LIZ(LL, Collections.singletonList("live_inner_feed"));
        }
        LLILZ = true;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0Iuo, java.lang.Runnable] */
    public static void LIZ(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        SeqDetectResult seqDetectResult;
        Runnable runnable;
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        long jCurrentTimeMillis3;
        SeqDetectResult seqDetectResult2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomMsg room id = ");
        Long lValueOf3 = null;
        if (feedUserRoomMonitorMessage != null) {
            lValueOf = Long.valueOf(feedUserRoomMonitorMessage.roomId);
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" detectedStatus = ");
        if (feedUserRoomMonitorMessage != null && (seqDetectResult2 = feedUserRoomMonitorMessage.seqDetectResult) != null) {
            lValueOf2 = Long.valueOf(seqDetectResult2.detectedStatus);
        } else {
            lValueOf2 = null;
        }
        sbLIZ.append(lValueOf2);
        sbLIZ.append(" isInflow = ");
        sbLIZ.append(LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (RoomScreenStatusObserveNewSetting.enableLog() && feedUserRoomMonitorMessage != null && (seqDetectResult = feedUserRoomMonitorMessage.seqDetectResult) != null) {
            long j = 0;
            if (seqDetectResult.detectedStatus >= 0 && feedUserRoomMonitorMessage != null) {
                final long j2 = feedUserRoomMonitorMessage.roomId;
                SeqDetectResult seqDetectResult3 = feedUserRoomMonitorMessage.seqDetectResult;
                if (seqDetectResult3 != null) {
                    long j3 = seqDetectResult3.detectedStatus;
                    if (j3 == 0) {
                        C481730Iup c481730IupRemove = LLILZLL.remove(Long.valueOf(j2));
                        if (c481730IupRemove != null) {
                            Runnable runnable2 = c481730IupRemove.LIZJ;
                            if (runnable2 != null) {
                                LLILZIL.removeCallbacks(runnable2);
                            }
                            SeqDetectResult seqDetectResult4 = feedUserRoomMonitorMessage.seqDetectResult;
                            if (seqDetectResult4 != null) {
                                jCurrentTimeMillis3 = seqDetectResult4.detectTimestamp;
                            } else {
                                jCurrentTimeMillis3 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                            }
                            long j4 = c481730IupRemove.LIZ;
                            long j5 = jCurrentTimeMillis3 - j4;
                            if (0 < j5) {
                                j = j5;
                            }
                            C481710Iun c481710Iun = LL;
                            C481740Iuq c481740Iuq = new C481740Iuq(1, j2, j4, c481730IupRemove.LIZIZ, j);
                            c481710Iun.getClass();
                            LIZLLL(c481740Iuq);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Black screen recovered for room ");
                            sbLIZ2.append(j2);
                            sbLIZ2.append(", timestamp = ");
                            SeqDetectResult seqDetectResult5 = feedUserRoomMonitorMessage.seqDetectResult;
                            if (seqDetectResult5 != null) {
                                lValueOf3 = Long.valueOf(seqDetectResult5.detectTimestamp);
                            }
                            sbLIZ2.append(lValueOf3);
                            sbLIZ2.append("  duration: ");
                            sbLIZ2.append(j);
                            sbLIZ2.append('s');
                            C2188811AlT.LIZIZ(sbLIZ2);
                            return;
                        }
                        return;
                    }
                    if (j3 != 1) {
                        return;
                    }
                    ConcurrentHashMap<Long, C481730Iup> concurrentHashMap = LLILZLL;
                    if (!concurrentHashMap.containsKey(Long.valueOf(j2)) && !LLIZ.contains(Long.valueOf(j2))) {
                        SeqDetectResult seqDetectResult6 = feedUserRoomMonitorMessage.seqDetectResult;
                        if (seqDetectResult6 != null) {
                            jCurrentTimeMillis2 = seqDetectResult6.detectTimestamp;
                        } else {
                            jCurrentTimeMillis2 = System.currentTimeMillis();
                        }
                        ?? r11 = new Runnable() { // from class: X.0Iuo
                            public final void LIZ() throws JSONException {
                                C481710Iun c481710Iun2 = C481710Iun.LL;
                                long j6 = j2;
                                c481710Iun2.getClass();
                                C481730Iup c481730IupRemove2 = C481710Iun.LLILZLL.remove(Long.valueOf(j6));
                                if (c481730IupRemove2 != null) {
                                    long jCurrentTimeMillis4 = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                    long j7 = c481730IupRemove2.LIZ;
                                    long j8 = jCurrentTimeMillis4 - j7;
                                    if (j8 < 0) {
                                        j8 = 0;
                                    }
                                    C481710Iun.LIZLLL(new C481740Iuq(0, j6, j7, 0L, j8));
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("Black screen timeout recovered for room ");
                                    sbLIZ3.append(j6);
                                    sbLIZ3.append(", startTime: ");
                                    sbLIZ3.append(c481730IupRemove2.LIZ);
                                    sbLIZ3.append(", duration: ");
                                    sbLIZ3.append(j8);
                                    sbLIZ3.append('s');
                                    C2188811AlT.LIZIZ(sbLIZ3);
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LiveHostNoStreamListener@b659.logBlackStreamInfo$timeoutTask$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LiveHostNoStreamListener@b659.logBlackStreamInfo$timeoutTask$1");
                            }
                        };
                        concurrentHashMap.put(Long.valueOf(j2), new C481730Iup(jCurrentTimeMillis2, r11, System.currentTimeMillis()));
                        C786410Ut5.LJLIIL(RoomScreenStatusObserveNewSetting.getTimeoutMs(), LLILZIL, r11);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Black screen started for room ");
                        sbLIZ3.append(j2);
                        sbLIZ3.append("} timestamp = ");
                        SeqDetectResult seqDetectResult7 = feedUserRoomMonitorMessage.seqDetectResult;
                        if (seqDetectResult7 != null) {
                            lValueOf3 = Long.valueOf(seqDetectResult7.detectTimestamp);
                        }
                        sbLIZ3.append(lValueOf3);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                    C481730Iup c481730Iup = concurrentHashMap.get(Long.valueOf(j2));
                    if (c481730Iup == null || (runnable = c481730Iup.LIZJ) == null) {
                        return;
                    }
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    C481730Iup c481730Iup2 = concurrentHashMap.get(Long.valueOf(j2));
                    if (c481730Iup2 != null) {
                        jCurrentTimeMillis = c481730Iup2.LIZIZ;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    if (jCurrentTimeMillis4 - jCurrentTimeMillis > RoomScreenStatusObserveNewSetting.getMaxMonitorTimeMs()) {
                        return;
                    }
                    BPEAHandler bPEAHandler = LLILZIL;
                    bPEAHandler.removeCallbacks(runnable);
                    C786410Ut5.LJLIIL(RoomScreenStatusObserveNewSetting.getTimeoutMs(), bPEAHandler, runnable);
                }
            }
        }
    }

    public static void LIZLLL(C481740Iuq c481740Iuq) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("room_id", c481740Iuq.LIZ);
        jSONObject.put("startTime", c481740Iuq.LIZIZ);
        jSONObject.put("revTime", c481740Iuq.LIZJ);
        jSONObject.put("duration", c481740Iuq.LIZLLL);
        jSONObject.put("recovery_from", c481740Iuq.LJ);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("black_screen_report");
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LJJIJLIJ();
        c474500IjALIZ.LJIIIIZZ();
        c474500IjALIZ.LJJIJL();
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) throws JSONException {
        boolean zBooleanValue;
        List<ProtoMessageFetchResult.BaseProtoMessage> list;
        long j;
        long j2;
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(GlobalInflowMessage.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LLILLL = zBooleanValue;
        if (wsChannelMsg.service == 134217784) {
            long jLIZJ = C963140bAe.LIZJ();
            C1515210pX5.LIZLLL().getClass();
            C0IMD c0imdLJI = C1515210pX5.LJI(ProtoMessageFetchResult.class);
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(new C1506330pIl(wsChannelMsg.LIZ()));
            Long lValueOf = null;
            if (c0imdLJI != null) {
                try {
                    ProtoMessageFetchResult protoMessageFetchResult = (ProtoMessageFetchResult) c0imdLJI.LIZJ(c1516680pZS);
                    if (protoMessageFetchResult != null && (list = protoMessageFetchResult.messages) != null && (!list.isEmpty())) {
                        C1515210pX5.LIZLLL().getClass();
                        C0IMD c0imdLJI2 = C1515210pX5.LJI(FeedUserRoomMonitorMessage.class);
                        byte[] bArr = ((ProtoMessageFetchResult.BaseProtoMessage) ListProtector.get(protoMessageFetchResult.messages, 0)).payload;
                        C1516680pZS c1516680pZS2 = new C1516680pZS();
                        c1516680pZS2.LJIIL(new C1506330pIl(bArr));
                        if (c0imdLJI2 != null) {
                            try {
                                FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = (FeedUserRoomMonitorMessage) c0imdLJI2.LIZJ(c1516680pZS2);
                                if (feedUserRoomMonitorMessage != null) {
                                    long j3 = feedUserRoomMonitorMessage.roomTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                    CommonMessageData commonMessageData = feedUserRoomMonitorMessage.baseMessage;
                                    if (commonMessageData != null) {
                                        j = commonMessageData.createTime;
                                    } else {
                                        j = 0;
                                    }
                                    if (protoMessageFetchResult != null) {
                                        j2 = protoMessageFetchResult.now;
                                    } else {
                                        j2 = 0;
                                    }
                                    C481760Ius.LL.getClass();
                                    C481760Ius.LIZ("live_inner_feed", feedUserRoomMonitorMessage, CardStruct.IStatusCode.DEFAULT, 2, j, j3, j2, jLIZJ, 0L);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("RoomMsg room id = ");
                                    sbLIZ.append(feedUserRoomMonitorMessage.roomId);
                                    sbLIZ.append(" room status ");
                                    sbLIZ.append(feedUserRoomMonitorMessage.roomStatus);
                                    sbLIZ.append(" stream status ");
                                    sbLIZ.append(feedUserRoomMonitorMessage.streamStatus);
                                    sbLIZ.append(" detectedStatus = ");
                                    SeqDetectResult seqDetectResult = feedUserRoomMonitorMessage.seqDetectResult;
                                    if (seqDetectResult != null) {
                                        lValueOf = Long.valueOf(seqDetectResult.detectedStatus);
                                    }
                                    sbLIZ.append(lValueOf);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    SeqDetectResult seqDetectResult2 = feedUserRoomMonitorMessage.seqDetectResult;
                                    if (seqDetectResult2 != null && seqDetectResult2.detectedStatus >= 0 && LLILLL) {
                                        LL.getClass();
                                        LIZ(feedUserRoomMonitorMessage);
                                    }
                                    C01TT.LIZLLL(new AwS551S0100000_7(feedUserRoomMonitorMessage, 796));
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    @Override // X.C0CW2
    public final void LJII(BaseDownlinkData baseDownlinkData, UplinkMessageResponse uplinkMessageResponse, AwS125S0110000_7 awS125S0110000_7) throws JSONException {
        boolean zBooleanValue;
        DownlinkLiveStatusData downlinkLiveStatusData = (DownlinkLiveStatusData) baseDownlinkData;
        Boolean bool = (Boolean) DataChannelGlobal.LLILZ.gg0(GlobalInflowMessage.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LLILLL = zBooleanValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveHostNoStreamListener.onDownlinkMessageReceived: isInflow=");
        sbLIZ.append(LLILLL);
        sbLIZ.append("  message=");
        sbLIZ.append(downlinkLiveStatusData.getLiveStatusChangeList());
        C20441214yg.LIZIZ("SignalingRoomState", C2188811AlT.LIZIZ(sbLIZ));
        List<DownlinkLiveStatusItem> liveStatusChangeList = downlinkLiveStatusData.getLiveStatusChangeList();
        if (liveStatusChangeList != null) {
            for (DownlinkLiveStatusItem downlinkLiveStatusItem : liveStatusChangeList) {
                FeedUserRoomMonitorMessage feedUserRoomMonitorMessage = new FeedUserRoomMonitorMessage();
                feedUserRoomMonitorMessage.anchorId = downlinkLiveStatusItem.anchorId;
                feedUserRoomMonitorMessage.roomId = downlinkLiveStatusItem.roomId;
                feedUserRoomMonitorMessage.roomStatus = downlinkLiveStatusItem.roomStatus;
                feedUserRoomMonitorMessage.roomTime = downlinkLiveStatusItem.roomTime;
                feedUserRoomMonitorMessage.streamStatus = downlinkLiveStatusItem.streamStatus;
                feedUserRoomMonitorMessage.LL = uplinkMessageResponse.subType;
                SeqDetectResult seqDetectResult = downlinkLiveStatusItem.seqDetectResult;
                feedUserRoomMonitorMessage.seqDetectResult = seqDetectResult;
                if (seqDetectResult != null && seqDetectResult.detectedStatus >= 0 && LLILLL) {
                    LL.getClass();
                    LIZ(feedUserRoomMonitorMessage);
                }
                C01TT.LIZLLL(new AwS408S0200000_7(feedUserRoomMonitorMessage, awS125S0110000_7, 72));
            }
        }
    }
}
