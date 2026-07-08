package X;

import android.os.SystemClock;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ttkmedia.datacenter.api.featurecenter.VCFeatureCenterManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AD5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AD5 extends C09AY implements Function1<C1306060k5k, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ LivePreviewPlayerWidget LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AD5(C238400w2 c238400w2, LivePreviewPlayerWidget livePreviewPlayerWidget, int i, C238400w2 c238400w22, boolean z, long j) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = livePreviewPlayerWidget;
        this.LLILLL = i;
        this.LLILZ = c238400w22;
        this.LLILZIL = z;
        this.LLILZLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1306060k5k c1306060k5k) {
        int iIntValue;
        Object obj;
        int i;
        int i2;
        Long lValueOf;
        String requestId;
        String requestId2;
        Long lValueOf2;
        String aid;
        String aid2;
        int duration;
        Integer numValueOf;
        long j;
        Aweme aweme;
        Video video;
        Aweme aweme2;
        Aweme aweme3;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme4;
        Aweme aweme5;
        LiveRoomStruct liveRoomStruct2;
        C1306060k5k c1306060k5k2 = c1306060k5k;
        long jUptimeMillis = SystemClock.uptimeMillis();
        final C118300cf c118300cf = new C118300cf();
        Object obj2 = c1306060k5k2.LIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c118300cf.element = iIntValue;
        Map<String, ? extends Object> map = c1306060k5k2.LIZJ;
        if (map != null) {
            obj = map.get("traffic_tag");
        } else {
            obj = null;
        }
        final long j2 = jUptimeMillis - this.LL.element;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("result: ");
        sbLIZ.append(obj);
        sbLIZ.append("   ");
        sbLIZ.append(c118300cf.element);
        sbLIZ.append("  ,duration:");
        sbLIZ.append(j2);
        C827750WdZ.LIZ("previewPullStreamSyncUseNewModel", C2188811AlT.LIZIZ(sbLIZ));
        C1092980eY4 c1092980eY4 = new C1092980eY4();
        c1092980eY4.LIZ = C0J0P.APP;
        C1092970eY3 c1092970eY3LIZIZ = c1092980eY4.LIZIZ();
        LivePreviewPlayerWidget livePreviewPlayerWidget = this.LLILLJJLI;
        int i3 = this.LLILLL;
        int i4 = c118300cf.element;
        long j3 = this.LLILZ.element;
        livePreviewPlayerWidget.getClass();
        HashMap map2 = new HashMap();
        C1ACA c1acaZ1 = livePreviewPlayerWidget.z1();
        int i5 = 0;
        if (c1acaZ1 != null && C1ABT.LJIIJJI(c1acaZ1)) {
            i = 1;
        } else {
            i = 0;
        }
        map2.put("is_rich", Integer.valueOf(i));
        C1ACA c1acaZ12 = livePreviewPlayerWidget.z1();
        if (c1acaZ12 != null && C1ABT.LJIIIZ(c1acaZ12)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        map2.put("is_hot", Integer.valueOf(i2));
        C1ACA c1acaZ13 = livePreviewPlayerWidget.z1();
        if (c1acaZ13 != null && (liveRoomStruct2 = c1acaZ13.LIZJ) != null) {
            lValueOf = Long.valueOf(liveRoomStruct2.id);
        } else {
            lValueOf = null;
        }
        map2.put("room_id", lValueOf);
        C1ACA c1acaZ14 = livePreviewPlayerWidget.z1();
        if (c1acaZ14 != null && (aweme5 = c1acaZ14.LIZIZ) != null) {
            requestId = aweme5.getRequestId();
        } else {
            requestId = null;
        }
        map2.put("request_id", requestId);
        C1ACA c1acaZ15 = livePreviewPlayerWidget.z1();
        if (c1acaZ15 != null && (aweme4 = c1acaZ15.LIZIZ) != null) {
            requestId2 = aweme4.getRequestId();
        } else {
            requestId2 = null;
        }
        C1ACA c1acaZ16 = livePreviewPlayerWidget.z1();
        if (c1acaZ16 != null && (liveRoomStruct = c1acaZ16.LIZJ) != null) {
            lValueOf2 = Long.valueOf(liveRoomStruct.id);
        } else {
            lValueOf2 = null;
        }
        Map mapLIZ = C0ITF.LIZ(lValueOf2, requestId2);
        if (mapLIZ != null) {
            for (Map.Entry entry : mapLIZ.entrySet()) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        map2.put("traffic_tag", obj);
        map2.put("is_p95", Integer.valueOf(i3));
        if (i4 == -1) {
            i5 = -1;
        } else if (Intrinsics.LJFF(obj, "highTraffic")) {
            i5 = 1;
        }
        map2.put("is_high", Integer.valueOf(i5));
        map2.put("cost_type", Integer.valueOf(i4));
        map2.put("distance", 1);
        VCFeatureCenterManager vCFeatureCenterManager = VCFeatureCenterManager.getInstance();
        C1ACA c1acaZ17 = livePreviewPlayerWidget.z1();
        if (c1acaZ17 != null && (aweme3 = c1acaZ17.LIZ) != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        map2.put("pre_duration", vCFeatureCenterManager.getVideoFeatureFromNative(aid, "", 3501));
        VCFeatureCenterManager vCFeatureCenterManager2 = VCFeatureCenterManager.getInstance();
        C1ACA c1acaZ18 = livePreviewPlayerWidget.z1();
        if (c1acaZ18 != null && (aweme2 = c1acaZ18.LIZ) != null) {
            aid2 = aweme2.getAid();
        } else {
            aid2 = null;
        }
        Object videoFeatureFromNative = vCFeatureCenterManager2.getVideoFeatureFromNative(aid2, "", 3503);
        if (videoFeatureFromNative != null) {
            map2.put("weibull", videoFeatureFromNative);
        }
        C1ACA c1acaZ19 = livePreviewPlayerWidget.z1();
        if (c1acaZ19 != null && (aweme = c1acaZ19.LIZ) != null && (video = aweme.getVideo()) != null) {
            duration = video.getDuration();
        } else {
            duration = -1;
        }
        map2.put("video_duration", Integer.valueOf(duration));
        C1ACA c1acaZ110 = livePreviewPlayerWidget.z1();
        if (c1acaZ110 != null) {
            numValueOf = Integer.valueOf(c1acaZ110.LJIIIIZZ);
        } else {
            numValueOf = null;
        }
        map2.put("video_index", numValueOf);
        map2.put("cpu_speed", Double.valueOf(C1BCA.LIZLLL().LIZJ));
        map2.put("cpu_rate", Double.valueOf(C1BCA.LIZLLL().LIZIZ));
        map2.put("thermal_value", Float.valueOf(C1BCA.LJIIL().LIZIZ));
        map2.put("strategy_time", Long.valueOf(SystemClock.uptimeMillis() - j3));
        C1094570ead c1094570ead = new C1094570ead();
        c1094570ead.LIZ = map2;
        map2.put("is_new_device", Boolean.valueOf(this.LLILZIL));
        Map<String, Object> map3 = c1094570ead.LIZ;
        if (map3 != null) {
            C1ACA c1acaZ111 = this.LLILLJJLI.z1();
            if (c1acaZ111 != null) {
                j = c1acaZ111.LJLJJI;
            } else {
                j = -1;
            }
            map3.put("vod_play_time", Long.valueOf(j));
        }
        this.LLILLJJLI.LLJJJJJIL = true;
        ILiveDecisionService iLiveDecisionService = (ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class);
        final LivePreviewPlayerWidget livePreviewPlayerWidget2 = this.LLILLJJLI;
        String str = livePreviewPlayerWidget2.LLJJJJ;
        final C238400w2 c238400w2 = this.LLILZ;
        final long j4 = this.LLILZLL;
        final int i6 = this.LLILLL;
        final Object obj3 = obj;
        iLiveDecisionService.fR1(new InterfaceC1092860eXs() { // from class: X.1ACG
            @Override // X.InterfaceC1092860eXs
            public final void LIZ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZIZ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1092860eXs
            public final void LJ(C1092890eXv c1092890eXv) {
                Object obj4;
                Object obj5;
                long jLongValue;
                String str2;
                Long lLJIILIIL;
                long jLongValue2;
                String str3;
                Long lLJIILIIL2;
                long jLongValue3;
                String str4;
                Long lLJIILIIL3;
                long jLongValue4;
                String str5;
                Long lLJIILIIL4;
                long jLongValue5;
                String str6;
                Long lLJIILIIL5;
                long j5;
                LiveRoomStruct liveRoomStruct3;
                LiveRoomStruct liveRoomStruct4;
                Number number;
                Number number2;
                Number number3;
                Number number4;
                Number number5;
                C1ACA c1acaZ112 = livePreviewPlayerWidget2.z1();
                if (c1acaZ112 != null) {
                    c1acaZ112.LJLLI = 4;
                }
                C1ACA c1acaZ113 = livePreviewPlayerWidget2.z1();
                if (c1acaZ113 != null) {
                    c1acaZ113.LJLLILLLL = SystemClock.uptimeMillis() - c238400w2.element;
                }
                C0J0M c0j0m = c1092890eXv.LIZIZ;
                if (c0j0m != null) {
                    obj4 = c0j0m.LIZ;
                } else {
                    obj4 = null;
                }
                if (obj4 instanceof Map) {
                    LivePreviewPlayerWidget livePreviewPlayerWidget3 = livePreviewPlayerWidget2;
                    long j6 = j4;
                    long j7 = j2;
                    int i7 = i6;
                    int i8 = c118300cf.element;
                    Object obj6 = obj3;
                    livePreviewPlayerWidget3.getClass();
                    C0J0M c0j0m2 = c1092890eXv.LIZIZ;
                    if (c0j0m2 != null) {
                        obj5 = c0j0m2.LIZ;
                    } else {
                        obj5 = null;
                    }
                    Map map4 = (Map) obj5;
                    Object obj7 = map4.get("pull_time");
                    if ((obj7 instanceof Number) && (number5 = (Number) obj7) != null) {
                        jLongValue = number5.longValue();
                    } else {
                        Object obj8 = map4.get("pull_time");
                        if ((obj8 instanceof String) && (str2 = (String) obj8) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                            jLongValue = lLJIILIIL.longValue();
                        } else {
                            jLongValue = -1;
                        }
                    }
                    Object obj9 = map4.get("delay_time");
                    if ((obj9 instanceof Number) && (number4 = (Number) obj9) != null) {
                        jLongValue2 = number4.longValue();
                    } else {
                        Object obj10 = map4.get("delay_time");
                        if ((obj10 instanceof String) && (str3 = (String) obj10) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                            jLongValue2 = lLJIILIIL2.longValue();
                        } else {
                            jLongValue2 = -1;
                        }
                    }
                    Object obj11 = map4.get("pulse_count");
                    if ((obj11 instanceof Number) && (number3 = (Number) obj11) != null) {
                        jLongValue3 = number3.longValue();
                    } else {
                        Object obj12 = map4.get("plus_count");
                        if ((obj12 instanceof String) && (str4 = (String) obj12) != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str4)) != null) {
                            jLongValue3 = lLJIILIIL3.longValue();
                        } else {
                            jLongValue3 = -1;
                        }
                    }
                    Object obj13 = map4.get("pulse_pull_time");
                    if ((obj13 instanceof Number) && (number2 = (Number) obj13) != null) {
                        jLongValue4 = number2.longValue();
                    } else {
                        Object obj14 = map4.get("pulse_pull_time");
                        if ((obj14 instanceof String) && (str5 = (String) obj14) != null && (lLJIILIIL4 = C2095008Iq.LJIILIIL(str5)) != null) {
                            jLongValue4 = lLJIILIIL4.longValue();
                        } else {
                            jLongValue4 = -1;
                        }
                    }
                    Object obj15 = map4.get("pulse_delay_time");
                    if ((obj15 instanceof Number) && (number = (Number) obj15) != null) {
                        jLongValue5 = number.longValue();
                    } else {
                        Object obj16 = map4.get("pulse_delay_time");
                        if ((obj16 instanceof String) && (str6 = (String) obj16) != null && (lLJIILIIL5 = C2095008Iq.LJIILIIL(str6)) != null) {
                            jLongValue5 = lLJIILIIL5.longValue();
                        } else {
                            jLongValue5 = -1;
                        }
                    }
                    C1ACA c1acaZ114 = livePreviewPlayerWidget3.z1();
                    if (c1acaZ114 != null) {
                        c1acaZ114.LJLLJ = jLongValue;
                    }
                    C1ACA c1acaZ115 = livePreviewPlayerWidget3.z1();
                    if (c1acaZ115 != null) {
                        c1acaZ115.LJLLL = jLongValue2;
                    }
                    C1AC7 c1ac7 = C1AC7.LIZ;
                    Pair[] pairArr = new Pair[8];
                    C1ACA c1acaZ116 = livePreviewPlayerWidget3.z1();
                    long j8 = 0;
                    if (c1acaZ116 != null && (liveRoomStruct4 = c1acaZ116.LIZJ) != null) {
                        j5 = liveRoomStruct4.id;
                    } else {
                        j5 = 0;
                    }
                    pairArr[0] = new Pair("roomId", Long.valueOf(j5));
                    pairArr[1] = new Pair("pullTime", Long.valueOf(jLongValue));
                    pairArr[2] = new Pair("delayTime", Long.valueOf(jLongValue2));
                    pairArr[3] = new Pair("pulseCount", Long.valueOf(jLongValue3));
                    pairArr[4] = new Pair("pulsePullTime", Long.valueOf(jLongValue4));
                    pairArr[5] = new Pair("pulseDelayTime", Long.valueOf(jLongValue5));
                    pairArr[6] = new Pair("trafficTag", obj6);
                    pairArr[7] = new Pair("isP95", Integer.valueOf(i7));
                    c1ac7.getClass();
                    C1AC7.LJIILL("preview_pull_strategy_result", pairArr);
                    if (jLongValue > 0 && jLongValue2 >= 0) {
                        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = livePreviewPlayerWidget3.P1();
                        if (feedLiveViewHolderVMP1 != null) {
                            feedLiveViewHolderVMP1.LLLFF = C1ACS.TRAFFIC_CONTROL;
                        }
                        C0CNO.LIZLLL(0L, new C1ACF(livePreviewPlayerWidget3, j6, j7, i7, i8, obj6, jLongValue2, jLongValue, jLongValue3, jLongValue5, jLongValue4));
                    } else {
                        Pair[] pairArr2 = new Pair[4];
                        C1ACA c1acaZ117 = livePreviewPlayerWidget3.z1();
                        if (c1acaZ117 != null && (liveRoomStruct3 = c1acaZ117.LIZJ) != null) {
                            j8 = liveRoomStruct3.id;
                        }
                        pairArr2[0] = new Pair("roomId", Long.valueOf(j8));
                        pairArr2[1] = new Pair("reason", "invalid_strategy_value");
                        pairArr2[2] = new Pair("pullTime", Long.valueOf(jLongValue));
                        pairArr2[3] = new Pair("delayTime", Long.valueOf(jLongValue2));
                        C1AC7.LJIILL("preview_pull_fallback", pairArr2);
                        C1AC7.LJII(livePreviewPlayerWidget3.z1(), EnumC1488280ope.ERR_STARSHIP_STRATEGY, j6, j7, i7, i8, String.valueOf(obj6));
                    }
                }
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(livePreviewPlayerWidget2.LLJJJJ);
            }

            @Override // X.InterfaceC1092860eXs
            public final void LIZLLL(String str2, C477840IoY c477840IoY) {
                long j5;
                LiveRoomStruct liveRoomStruct3;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("previewPullStreamSyncUseNewModel onFailed ");
                sbLIZ2.append(str2);
                sbLIZ2.append(' ');
                sbLIZ2.append(c477840IoY);
                System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
                C1ACA c1acaZ112 = livePreviewPlayerWidget2.z1();
                if (c1acaZ112 != null) {
                    c1acaZ112.LJLLI = 3;
                }
                C1ACA c1acaZ113 = livePreviewPlayerWidget2.z1();
                if (c1acaZ113 != null) {
                    c1acaZ113.LJLLILLLL = SystemClock.uptimeMillis() - c238400w2.element;
                }
                C1AC7 c1ac7 = C1AC7.LIZ;
                Pair[] pairArr = new Pair[5];
                C1ACA c1acaZ114 = livePreviewPlayerWidget2.z1();
                if (c1acaZ114 != null && (liveRoomStruct3 = c1acaZ114.LIZJ) != null) {
                    j5 = liveRoomStruct3.id;
                } else {
                    j5 = 0;
                }
                pairArr[0] = new Pair("roomId", Long.valueOf(j5));
                pairArr[1] = new Pair("reason", "decision_failed");
                pairArr[2] = new Pair("businessName", str2);
                pairArr[3] = new Pair("isP95", Integer.valueOf(i6));
                pairArr[4] = new Pair("trafficTag", obj3);
                c1ac7.getClass();
                C1AC7.LJIILL("preview_pull_fallback", pairArr);
                C1AC7.LJII(livePreviewPlayerWidget2.z1(), EnumC1488280ope.ERR_STREAM_STRATEGY, j4, j2, i6, c118300cf.element, String.valueOf(obj3));
                ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(livePreviewPlayerWidget2.LLJJJJ);
            }
        }, c1092970eY3LIZIZ, c1094570ead, str);
        return Unit.LIZ;
    }
}
