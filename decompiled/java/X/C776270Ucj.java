package X;

import android.content.Context;
import android.graphics.Point;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.broadcast.RestartLiveChannel;
import com.bytedance.android.livesdk.broadcast.setting.TTLHVideoResolutionPortraitSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.GameRtcAbLabel;
import com.bytedance.android.livesdk.livesetting.broadcast.GameRtcAbParams;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoreRoomCheckSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.M2LEnableInitTimeCostOpt;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHLiveABSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerSettings;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLSAnchorNetMockSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcAbParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.livestreamv2.videoquality.probe.model.select.BwProbeStageGearSelectConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0Ucj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776270Ucj implements InterfaceC770130UIx {
    public static volatile C1273890jFr LIZIZ;
    public static Context LIZJ;
    public static Room LIZLLL;
    public static boolean LJ;
    public static String LJII;
    public static PreScheduleStream LJIIIIZZ;
    public static long LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static final C776270Ucj LIZ = new C776270Ucj();
    public static final AtomicInteger LJFF = new AtomicInteger(1);
    public static final AtomicInteger LJI = new AtomicInteger(0);
    public static final List<C0UVD> LJIIIZ = new CopyOnWriteArrayList();
    public static final int[][] LJIILIIL = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};

    public static String LJII() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapLJIIIZ = LJIIIZ(RtcAbLabelSetting.INSTANCE.getValue());
            Map mapLJIIIZ2 = LJIIIZ(LinkMicRtcAbParamsSetting.INSTANCE.getValue());
            linkedHashMap.putAll(mapLJIIIZ);
            linkedHashMap.putAll(mapLJIIIZ2);
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static String LJIIIIZZ() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(LJIIIZ(GameRtcAbLabel.INSTANCE.value()));
            linkedHashMap.putAll(LJIIIZ(GameRtcAbParams.INSTANCE.value()));
            return C786410Ut5.J3(new JSONObject(linkedHashMap));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return "";
        }
    }

    public static Room LJIILIIL() {
        if (!LiveCoreRoomCheckSetting.INSTANCE.enable()) {
            return (Room) DataChannelGlobal.LLILZ.gg0(LJ ? C930930aKh.class : C930940aKi.class);
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(LJ ? C930930aKh.class : C930940aKi.class);
        if (room == null) {
            room = LIZLLL;
        }
        if (Room.isValid(room) && room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
            return room;
        }
        return null;
    }

    public static Pair LJIILJJIL() {
        C769220UFk.LIZ.getClass();
        C769220UFk.LIZ(0, 0);
        BwProbeStageGearSelectConfig bwProbeStageGearSelectConfig = TTLHVideoQualityStrategyManagerSettings.INSTANCE.getGearSelectConfig().get("can_golive_1080p");
        Integer numValueOf = bwProbeStageGearSelectConfig != null ? Integer.valueOf(bwProbeStageGearSelectConfig.bwProbeAimLevel) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == 1) {
                return new Pair(480, 856);
            }
            if (numValueOf.intValue() == 2) {
                return new Pair(576, 1024);
            }
            if (numValueOf.intValue() == 3) {
                return new Pair(720, 1280);
            }
            if (numValueOf.intValue() == 4) {
                return new Pair(1080, 1920);
            }
        }
        return new Pair(480, 856);
    }

    @Override // X.InterfaceC770130UIx
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCoreAsyncUtil.syncRelease  state=");
        AtomicInteger atomicInteger = LJFF;
        sbLIZ.append(atomicInteger.get());
        sbLIZ.append("  lastCreateTime=");
        sbLIZ.append(LJIIJ);
        C20441214yg.LIZIZ("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class), Boolean.TRUE) && atomicInteger.get() < 7) {
            LJIJJLI(7);
            C1273890jFr c1273890jFr = LIZIZ;
            if (c1273890jFr != null) {
                c1273890jFr.release(C0UPU.LIZIZ());
            }
            LIZIZ = null;
            LJIJJLI(8);
            LIZJ = null;
            LIZLLL = null;
            LJ = false;
            LJII = null;
            LJIIIIZZ = null;
        }
    }

    public static String LJFF(String str) {
        boolean z;
        String strSubstring;
        List listLJJLIIIJILLIZJL;
        Object[] array;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        int iLJJIZ = a0.LJJIZ(str, '?', 0, false, 6);
        if (iLJJIZ != -1 && iLJJIZ < str.length() - 1) {
            strSubstring = str.substring(iLJJIZ + 1);
        } else {
            strSubstring = "";
        }
        if (!TextUtils.isEmpty(strSubstring) && strSubstring != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strSubstring, new String[]{"&"}, 0, 6)) != null && (array = listLJJLIIIJILLIZJL.toArray(new String[0])) != null) {
            C089E c089e = new C089E(array);
            while (c089e.hasNext()) {
                String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) c089e.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                if (strArr.length == 2) {
                    String str2 = strArr[0];
                    String str3 = strArr[1];
                    if (Intrinsics.LJFF(str2, "l_region")) {
                        return str3;
                    }
                }
            }
        }
        return null;
    }

    public static String LJI(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        int iLJJJ = a0.LJJJ(str, "stream-", 0, false, 6);
        int iLJJJ2 = a0.LJJJ(str, "?", 0, false, 6);
        if (iLJJJ == -1 || iLJJJ2 == -1 || iLJJJ2 <= iLJJJ) {
            return null;
        }
        return str.substring(iLJJJ, iLJJJ2);
    }

    public static Map LJIIIZ(String str) {
        Map mapLJ = C2097608Jq.LJ();
        if (C1533950q1J.LJ(str)) {
            try {
                if (str == null) {
                    str = "";
                }
                mapLJ = C2348509Id.LIZIZ(new JSONObject(str));
                return mapLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return mapLJ;
    }

    public static int[] LJIIJ(StreamUrlExtra streamUrlExtra) {
        int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
        if (1 <= value && value <= LJIILIIL.length) {
            return LJIILIIL[value - 1];
        }
        int[] iArr = new int[4];
        if (streamUrlExtra.minBitrate == 0) {
            streamUrlExtra.minBitrate = 200;
        }
        iArr[0] = streamUrlExtra.minBitrate;
        if (streamUrlExtra.defaultBitrate == 0) {
            streamUrlExtra.defaultBitrate = 500;
        }
        iArr[1] = streamUrlExtra.defaultBitrate;
        iArr[2] = streamUrlExtra.LIZIZ();
        iArr[3] = streamUrlExtra.profile;
        return iArr;
    }

    public static void LJIIZILJ(int i) {
        if (i == 0) {
            LJIIJ = System.currentTimeMillis();
        }
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null) {
            c0utq.LJIIL = System.currentTimeMillis();
            c0utq.LJIILIIL = i;
            if (i != 0) {
                c0utq.LJI = 4;
            }
        }
    }

    public static void LJIJJLI(int i) {
        String strValueOf;
        String idStr;
        String string;
        long jCurrentTimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLiveCoreState = ");
        sbLIZ.append(i);
        sbLIZ.append(" , ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C20441214yg.LIZIZ("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ));
        AtomicInteger atomicInteger = LJFF;
        if (i == atomicInteger.get()) {
            return;
        }
        if (i <= atomicInteger.get() && atomicInteger.get() != 8 && LJI.get() != 3) {
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("updateLiveCoreState = ");
                sbLIZ2.append(i);
                sbLIZ2.append(", IllegalStateException");
                C20441214yg.LJFF("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ2), new Exception());
            }
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("current_state", String.valueOf(atomicInteger.get()));
                linkedHashMap.put("next_state", String.valueOf(i));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                if (dataChannelGlobal.gg0(C931280aLG.class) != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C0UTQ c0utq = (C0UTQ) dataChannelGlobal.gg0(C931280aLG.class);
                    if (c0utq != null) {
                        jCurrentTimeMillis = c0utq.LIZ;
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    strValueOf = String.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis);
                } else {
                    long jCurrentTimeMillis3 = 0;
                    if (C772780UTc.LJFF > 0) {
                        jCurrentTimeMillis3 = System.currentTimeMillis() - C772780UTc.LJFF;
                    }
                    strValueOf = String.valueOf(jCurrentTimeMillis3);
                }
                linkedHashMap2.put("duration", strValueOf);
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Room room = LIZLLL;
                String str = "";
                if (room == null || (idStr = room.getIdStr()) == null) {
                    idStr = "";
                }
                linkedHashMap3.put("room_id", idStr);
                Room room2 = LIZLLL;
                if (room2 != null && (string = Long.valueOf(room2.getOwnerUserId()).toString()) != null) {
                    str = string;
                }
                linkedHashMap3.put("anchor_id", str);
                linkedHashMap3.put("trace", C13LP.LJJLIIIJ(C13LQ.LJJLIIIJJIZ(5, new Exception().getStackTrace()), "\n", null, null, 0, null, AFwS245S0000000_12.get$arr$(204), 30));
                C1CC2.LJIILLIIL("foundation_broadcast", "livecore_state_exception", C2348509Id.LIZLLL(linkedHashMap), C2348509Id.LIZLLL(linkedHashMap2), C2348509Id.LIZLLL(linkedHashMap3));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        atomicInteger.set(i);
        Iterator it2 = ((CopyOnWriteArrayList) LJIIIZ).iterator();
        while (it2.hasNext()) {
            ((C0UVD) it2.next()).LIZ(LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0274 A[Catch: Exception -> 0x0341, TryCatch #2 {Exception -> 0x0341, blocks: (B:153:0x025c, B:155:0x0264, B:157:0x0268, B:158:0x026b, B:160:0x026f, B:197:0x02fb, B:199:0x0308, B:200:0x030e, B:202:0x032a, B:203:0x0330, B:175:0x02a8, B:177:0x02b4, B:162:0x0274, B:164:0x0281, B:166:0x0285, B:168:0x028b, B:169:0x028f, B:171:0x029d, B:173:0x02a1, B:180:0x02bd, B:182:0x02c1, B:184:0x02c5, B:185:0x02c7, B:187:0x02cd, B:189:0x02e4, B:191:0x02e8), top: B:218:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIL(com.bytedance.android.livesdkapi.depend.model.live.Room r11) {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776270Ucj.LJIL(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    @Override // X.InterfaceC770130UIx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super webcast.api.creator.PreScheduleStream> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C776450Ud1
            if (r0 == 0) goto L67
            r7 = r10
            X.0Ud1 r7 = (X.C776450Ud1) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r8 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L6d
            X.C155000ia.LIZIZ(r8)
        L23:
            X.0CtW r8 = (X.C328040CtW) r8
            if (r8 == 0) goto L29
            webcast.api.creator.PreScheduleStream r5 = r8.LIZ
        L29:
            return r5
        L2a:
            X.C155000ia.LIZIZ(r8)
            X.0CtN r3 = X.C771670UOv.LJFF()
            if (r3 == 0) goto L29
            r7.LLILLL = r4
            X.0CtW r8 = X.C327950CtN.LIZJ()
            r2 = 0
            if (r8 == 0) goto L47
            webcast.api.creator.PreScheduleStream r0 = r8.LIZ
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.sdkParams
            if (r0 == 0) goto L47
        L44:
            if (r8 != r6) goto L23
            return r6
        L47:
            webcast.api.creator.PreScheduleStream r1 = X.C327950CtN.LIZIZ()
            if (r1 == 0) goto L5d
            X.0CtW r8 = new X.0CtW
            java.lang.String r0 = ""
            r8.<init>(r1, r0, r2)
            webcast.api.creator.PreScheduleStream r0 = r8.LIZ
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.sdkParams
            if (r0 == 0) goto L5d
            goto L44
        L5d:
            X.0CsZ r0 = new X.0CsZ
            r0.<init>(r3, r5, r4, r4)
            java.lang.Object r8 = X.C2296808zG.LJ(r0, r7)
            goto L44
        L67:
            X.0Ud1 r7 = new X.0Ud1
            r7.<init>(r9, r10)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776270Ucj.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC770130UIx
    public final void LJ(Room room) {
        if (LIZLLL == null) {
            LIZLLL = room;
        }
    }

    public static void LJIJ(Context context, Room room) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preloadLiveStream222 ... state=");
        AtomicInteger atomicInteger = LJFF;
        sbLIZ.append(atomicInteger.get());
        sbLIZ.append(", ");
        sbLIZ.append(Long.valueOf(room.getId()));
        C20441214yg.LIZIZ("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (atomicInteger.get() == 8) {
            atomicInteger.set(1);
        }
        if (atomicInteger.get() > 1) {
            return;
        }
        C0UTQ c0utq = (C0UTQ) DataChannelGlobal.LLILZ.gg0(C931280aLG.class);
        if (c0utq != null && c0utq.LJIIJJI <= 0) {
            c0utq.LJIIJJI = System.currentTimeMillis();
        }
        LJ = false;
        LIZJ = context;
        LIZLLL = room;
        if (atomicInteger.get() >= 2 && LJI.get() != 1) {
            return;
        }
        LJIJJLI(2);
        HandlerThread handlerThread = C777390UeX.LIZ;
        C777390UeX.LIZ(new Runnable() { // from class: X.0UTn
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveCoreAsyncUtil@ff8a.preloadLiveStream$4");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveCoreAsyncUtil@ff8a.preloadLiveStream$4");
            }

            public static void LIZ() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("before init, state=");
                AtomicInteger atomicInteger2 = C776270Ucj.LJFF;
                sbLIZ2.append(atomicInteger2.get());
                C20441214yg.LIZIZ("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ2));
                if (atomicInteger2.get() < 3 || C776270Ucj.LJI.get() == 1) {
                    C776270Ucj.LIZ.LJIILL(2, false);
                }
            }
        });
    }

    public static void LJIJI(String str, boolean z) throws JSONException {
        if (C500260Jjc.LJJJJI() && !z) {
            if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, str);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("trace", Log.getStackTraceString(new Exception()));
                C1CC2.LJI("ttlive_live_host_common_exception_collector", jSONObject, jSONObject2, jSONObject3);
                return;
            }
            throw new RuntimeException(str);
        }
    }

    @Override // X.InterfaceC770130UIx
    public final void LIZLLL(String str, boolean z) {
        IHostBridge iHostBridge;
        if (Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(RestartLiveChannel.class), Boolean.TRUE)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveCoreAsyncUtil.release  state=");
        AtomicInteger atomicInteger = LJFF;
        sbLIZ.append(atomicInteger.get());
        sbLIZ.append("  lastCreateTime=");
        sbLIZ.append(LJIIJ);
        C20441214yg.LIZIZ("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (atomicInteger.get() < 7 && atomicInteger.get() >= 4) {
            if (z && LJIIJ > 0 && System.currentTimeMillis() - LJIIJ < 3000) {
                return;
            }
            if (z && Intrinsics.LJFF(str, "live_end_page") && LJIIL && (iHostBridge = (IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)) != null && iHostBridge.enableGotoPreviewOpt()) {
                C20441214yg.LIZIZ("LiveCoreAsyncUtil", "LiveCoreAsyncUtil do not release, need reuse!!!!");
                return;
            }
            atomicInteger.set(6);
            HandlerThread handlerThread = C777390UeX.LIZ;
            C777390UeX.LIZ(new Runnable() { // from class: X.0UTk
                public static void LIZ() {
                    synchronized (C776270Ucj.class) {
                        try {
                            if (C776270Ucj.LIZIZ != null) {
                                AtomicInteger atomicInteger2 = C776270Ucj.LJFF;
                                if (atomicInteger2.get() < 7 && atomicInteger2.get() >= 5) {
                                    C776270Ucj.LIZ.getClass();
                                    C776270Ucj.LJIJJLI(7);
                                    C1273890jFr c1273890jFr = C776270Ucj.LIZIZ;
                                    if (c1273890jFr != null) {
                                        c1273890jFr.release(C0UPU.LIZIZ());
                                    }
                                    C776270Ucj.LIZIZ = null;
                                    C776270Ucj.LJIIIIZZ = null;
                                    C776270Ucj.LJIIJ = 0L;
                                    C20441214yg.LIZIZ("LiveCoreAsyncUtil", "LiveCoreAsyncUtil.release done!!!!");
                                    C776270Ucj.LJIJJLI(8);
                                    C776270Ucj.LJI.set(0);
                                    C777390UeX.LIZJ(true);
                                    ((CopyOnWriteArrayList) C776270Ucj.LJIIIZ).clear();
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveCoreAsyncUtil@ff8a.release$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveCoreAsyncUtil@ff8a.release$1");
                }
            });
            LIZJ = null;
            LIZLLL = null;
            LJ = false;
            LJII = null;
            LJIIIIZZ = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0347 A[PHI: r11
      0x0347: PHI (r11v11 int) = (r11v2 int), (r11v12 int) binds: [B:185:0x0324, B:190:0x0345] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03d5 A[PHI: r1 r11
      0x03d5: PHI (r1v11 java.lang.String) = 
      (r1v10 java.lang.String)
      (r1v10 java.lang.String)
      (r1v34 java.lang.String)
      (r1v34 java.lang.String)
      (r1v34 java.lang.String)
     binds: [B:196:0x0362, B:198:0x036a, B:208:0x03aa, B:218:0x03d2, B:222:0x03e1] A[DONT_GENERATE, DONT_INLINE]
      0x03d5: PHI (r11v4 int) = (r11v3 int), (r11v3 int), (r11v8 int), (r11v8 int), (r11v8 int) binds: [B:196:0x0362, B:198:0x036a, B:208:0x03aa, B:218:0x03d2, B:222:0x03e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x048d A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04b8 A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x053e A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x054d A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0578 A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0597 A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05e4 A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x065a A[Catch: all -> 0x0665, TryCatch #1 {all -> 0x0665, blocks: (B:24:0x0064, B:26:0x0068, B:28:0x0070, B:39:0x0087, B:41:0x008e, B:43:0x0096, B:46:0x00a3, B:52:0x00af, B:54:0x00bc, B:57:0x00c4, B:61:0x00ce, B:64:0x00e4, B:66:0x0128, B:69:0x012f, B:75:0x0143, B:77:0x0154, B:78:0x0158, B:80:0x0170, B:81:0x0174, B:83:0x017d, B:84:0x0184, B:87:0x0197, B:90:0x01a5, B:93:0x01ae, B:96:0x01bd, B:98:0x01dd, B:105:0x01ef, B:116:0x020c, B:117:0x020e, B:119:0x0216, B:127:0x0249, B:130:0x0251, B:133:0x025b, B:135:0x0263, B:137:0x0269, B:139:0x026d, B:141:0x0273, B:145:0x0280, B:147:0x0286, B:154:0x0295, B:156:0x029b, B:157:0x029f, B:166:0x02b6, B:167:0x02bc, B:171:0x02d3, B:172:0x02d5, B:174:0x02e5, B:178:0x02fd, B:179:0x02ff, B:186:0x0326, B:188:0x0334, B:189:0x0340, B:192:0x0349, B:195:0x0358, B:197:0x0364, B:199:0x036c, B:201:0x0374, B:203:0x0378, B:204:0x037b, B:207:0x0389, B:221:0x03d7, B:223:0x03e3, B:251:0x0446, B:255:0x046b, B:256:0x046d, B:258:0x048d, B:259:0x0491, B:261:0x04b8, B:262:0x04bc, B:266:0x04ee, B:270:0x0514, B:272:0x0519, B:275:0x051f, B:279:0x0542, B:283:0x0555, B:286:0x055e, B:289:0x0564, B:291:0x0578, B:292:0x057a, B:294:0x0597, B:295:0x059a, B:297:0x05bb, B:300:0x05c3, B:304:0x05d1, B:306:0x05d5, B:307:0x05db, B:309:0x05e4, B:311:0x05ea, B:313:0x05ee, B:315:0x05f2, B:317:0x05f6, B:318:0x05f9, B:320:0x05fd, B:324:0x0605, B:326:0x062a, B:328:0x0634, B:330:0x063a, B:332:0x063e, B:333:0x0641, B:337:0x065e, B:336:0x065a, B:282:0x054d, B:278:0x053e, B:249:0x0438, B:210:0x03ad, B:212:0x03b9, B:213:0x03be, B:215:0x03ca, B:182:0x030c, B:164:0x02af, B:165:0x02b1, B:126:0x023f, B:111:0x01fd, B:113:0x0203, B:74:0x0141, B:60:0x00cc, B:31:0x0074, B:34:0x007a, B:35:0x0082), top: B:346:0x0064 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1273890jFr LJIILL(int r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776270Ucj.LJIILL(int, boolean):X.0jFr");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJ(int r10, boolean r11) {
        /*
            r9 = this;
            r8 = 0
            r4 = 3
            if (r10 != r4) goto L1a
            com.bytedance.bpea.basics.Cert r0 = X.C0UPU.LIZIZ()
            X.C0UHK.LIZIZ(r0)
            X.0jFr r1 = X.C776270Ucj.LIZIZ
            if (r1 == 0) goto L16
            com.bytedance.bpea.basics.Cert r0 = X.C0UPU.LIZIZ()
            r1.release(r0)
        L16:
            X.C776270Ucj.LIZIZ = r8
            X.C776270Ucj.LJIIIIZZ = r8
        L1a:
            X.0jFr r0 = X.C776270Ucj.LIZIZ
            r3 = 0
            if (r0 == 0) goto Lc5
            if (r10 == r4) goto Lc5
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = LJIILIIL()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C776270Ucj.LIZLLL
            r2 = 1
            if (r0 != 0) goto Lc2
            if (r7 != 0) goto Lc2
            r6 = 1
        L2d:
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "liveCoreCreateFromState.get() == LIVE_SDK_PARAM: "
            r5.append(r0)
            java.util.concurrent.atomic.AtomicInteger r1 = X.C776270Ucj.LJI
            int r0 = r1.get()
            if (r0 != r2) goto Lbf
            r0 = 1
        L3f:
            r5.append(r0)
            X.C2188811AlT.LIZIZ(r5)
            int r0 = r1.get()
            if (r0 != r2) goto Lb4
            r0 = 2
            if (r10 != r0) goto Lb4
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ
            java.lang.Class<X.0aKa> r0 = X.C930860aKa.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto Lb4
            if (r6 != 0) goto Lb4
            java.lang.Class<X.0fzW> r0 = X.C1148440fzW.class
            java.lang.Object r1 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r0 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            if (r1 == r0) goto L6e
            r9.LJIILL(r4, r3)
        L6d:
            return r2
        L6e:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = X.C776270Ucj.LIZLLL
            if (r0 != 0) goto L74
            X.C776270Ucj.LIZLLL = r7
        L74:
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = X.C776270Ucj.LIZLLL
            if (r1 == 0) goto Lb2
            X.0Ucj r0 = X.C776270Ucj.LIZ
            r0.getClass()
            boolean r0 = LJIL(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L85:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L6d
            com.bytedance.android.livesdk.livesetting.broadcast.AnchorFixUpdateLiveStreamErrorABSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.AnchorFixUpdateLiveStreamErrorABSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto Lae
            X.0Lt1 r0 = X.C0UHK.LIZJ
            r0.LIZJ(r2)
            com.bytedance.bpea.basics.Cert r0 = X.C0UPU.LIZIZ()
            X.C0UHK.LIZIZ(r0)
            X.0jFr r1 = X.C776270Ucj.LIZIZ
            if (r1 == 0) goto Lac
            com.bytedance.bpea.basics.Cert r0 = X.C0UPU.LIZIZ()
            r1.release(r0)
        Lac:
            X.C776270Ucj.LIZIZ = r8
        Lae:
            r9.LJIILL(r4, r3)
            return r2
        Lb2:
            r1 = r8
            goto L85
        Lb4:
            boolean r0 = X.C776270Ucj.LJIIL
            X.C776270Ucj.LJIIJJI = r0
            if (r11 == 0) goto L6d
            r0 = 5
            LJIJJLI(r0)
            return r2
        Lbf:
            r0 = 0
            goto L3f
        Lc2:
            r6 = 0
            goto L2d
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C776270Ucj.LJJ(int, boolean):boolean");
    }

    @Override // X.InterfaceC770130UIx
    public final C1273890jFr LIZ(String str, PreScheduleStream preScheduleStream, Boolean bool) {
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            C1271250jBb c1271250jBb = C1271270jBd.LIZ;
            C1271260jBc c1271260jBc = c1271250jBb.LIZ;
            c1271260jBc.LJI = true;
            c1271260jBc.LJI(true);
            Point pointLIZIZ = C14KS.LIZIZ(C497740JfY.LJII());
            c1271250jBb.LJIIIIZZ(pointLIZIZ.x, pointLIZIZ.y, TTLHLiveABSettings.INSTANCE.value(), M2LEnableInitTimeCostOpt.INSTANCE.enabled(), TTLHVideoResolutionPortraitSettings.anchorEverLinked());
        }
        LJII = str;
        LJIIIIZZ = preScheduleStream;
        LJIILL(1, false);
        return LIZIZ;
    }

    public final C1273890jFr LJIIJJI(boolean z, C0UVD c0uvd, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLiveStream ");
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append(c0uvd);
        sbLIZ.append(' ');
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("LiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (c0uvd != null) {
            ((CopyOnWriteArrayList) LJIIIZ).add(c0uvd);
        }
        if (!z) {
            return LIZIZ;
        }
        if (LJFF.get() == 1) {
            LJIJJLI(2);
        }
        return LJIILL(2, z2);
    }

    public static void LJIJJ(C1269340j8W c1269340j8W, int i, String str, boolean z) {
        String strLJII;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("rtc.aid", String.valueOf(C781270Ukn.LJIIJJI().appId()));
            jSONObject.put("rtc.device_id", C781270Ukn.LJIIJJI().getServerDeviceId());
            if (C781520UlC.LJII(LIZLLL)) {
                strLJII = LJIIIIZZ();
            } else {
                strLJII = LJII();
            }
            jSONObject.put("rtc.ab_label", strLJII);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init rtc.ab_label = -->");
            sbLIZ.append(strLJII);
            C20441214yg.LIZIZ("LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_version", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getVersionName());
            jSONObject2.put("app_min_version", "");
            jSONObject2.put("app_channel", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getChannel());
            jSONObject.put("rtc.common_extra_info", C786410Ut5.J3(jSONObject2));
            boolean z2 = true;
            if (i != 1) {
                z2 = false;
            }
            c1269340j8W.LJLJI.LJJIL.LIZ = z2;
            if (z2) {
                c1269340j8W.LIZ.mVPassInteractCfg.getClass();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("builder.isEnableAnchorNet -->");
            sbLIZ2.append(c1269340j8W.LJJJ());
            C20441214yg.LIZIZ("LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ2));
            if (!z) {
                c1269340j8W.LJLJI.LJJIL.LJIIIIZZ = TTLSAnchorNetMockSetting.INSTANCE.anchorNetMockFallbackTime();
            }
            c1269340j8W.LJLJI.LJJIL.LJ = C786410Ut5.J3(jSONObject);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("init rtcAppId = -->");
            sbLIZ3.append(str);
            C20441214yg.LIZIZ("LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ3));
            c1269340j8W.LJLJI.LJJIL.LIZJ = str;
            if (C1274040jG6.LIZ && !c1269340j8W.LIZ.ttlhABSettingsConfigs.LJIILLIIL().isEmpty()) {
                c1269340j8W.LJLJI.LJJIL.LIZJ = c1269340j8W.LIZ.ttlhABSettingsConfigs.LJIILLIIL();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
