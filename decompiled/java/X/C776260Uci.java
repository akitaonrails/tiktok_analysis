package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEnableScopeMonitorAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveLogFilterSwitchAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxEnterBackgroundTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePushSdkParamsCacheSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateAdaptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamBitrateSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamEnableSdkParamsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamHwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamProfileSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStreamSwRoiSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseEffectAlgorithmAbSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUseNewAudioCodecSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.PushStreamSupportDnsSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamDefinitionLevelSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.StreamHardwareEncodeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVoiceChatFixContextAssignment;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3ChangeFpsAnchorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3FpsSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableLiveCoreSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Uci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776260Uci {
    public static final C776260Uci LIZ = new C776260Uci();
    public static final int[][] LIZIZ = {new int[]{200, 500, 800, 1}, new int[]{200, 800, 1200, 3}};
    public static volatile C1273890jFr LIZJ;
    public static Context LIZLLL;
    public static Room LJ;

    public static C1273890jFr LIZIZ(Context context) {
        boolean z;
        int[] iArr;
        boolean z2;
        String str;
        String strLIZIZ;
        int i;
        int i2;
        String modelFilePath;
        Object resourceFinder;
        String str2;
        IPullStreamService iPullStreamServiceLJIJJ;
        InterfaceC784360Upm interfaceC784360UpmFY1;
        DnsOptimizer dnsOptimizerLIZJ;
        AbstractC1273900jFs abstractC1273900jFs;
        JSONObject jSONObjectLIZJ;
        String strLIZ;
        List<String> list;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PushData pushData;
        String str3;
        StreamUrl streamUrl;
        if (TestEnableLiveCoreSetting.INSTANCE.disable()) {
            C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", "TestEnableLiveCoreSetting is disable just return null liveStream");
            return null;
        }
        if (LIZJ != null) {
            return LIZJ;
        }
        Context context2 = LIZLLL;
        if (context2 == null) {
            C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", "preLoadContext is null");
            if (!LinkMicVoiceChatFixContextAssignment.INSTANCE.isEnable()) {
                return null;
            }
            context2 = context;
            if (context == null) {
                C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", "currentContext is null, just return null liveStream");
                return null;
            }
        }
        Object objGg0 = LJ;
        if (objGg0 == null) {
            C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", "preloadRoom is null");
            if (!LinkMicVoiceChatFixContextAssignment.INSTANCE.isEnable()) {
                return null;
            }
            objGg0 = DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        }
        Room room = (Room) objGg0;
        if (room == null) {
            C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", "currentRoom is null, just return null liveStream");
            return null;
        }
        StreamUrlExtra streamUrlExtraSafely = room.getStreamUrlExtraSafely();
        int value = StreamDefinitionLevelSetting.INSTANCE.getValue();
        if (1 <= value && value <= LIZIZ.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr = LIZIZ[value - 1];
        } else {
            iArr = new int[4];
            if (streamUrlExtraSafely.minBitrate == 0) {
                streamUrlExtraSafely.minBitrate = 200;
            }
            iArr[0] = streamUrlExtraSafely.minBitrate;
            if (streamUrlExtraSafely.defaultBitrate == 0) {
                streamUrlExtraSafely.defaultBitrate = 500;
            }
            iArr[1] = streamUrlExtraSafely.defaultBitrate;
            iArr[2] = streamUrlExtraSafely.LIZIZ();
            iArr[3] = streamUrlExtraSafely.profile;
        }
        int value2 = StreamHardwareEncodeSetting.INSTANCE.getValue();
        if (value2 > 0) {
            if (value2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = streamUrlExtraSafely.hardwareEncode;
        }
        int iLIZJ = streamUrlExtraSafely.LIZJ();
        int iLIZ = streamUrlExtraSafely.LIZ();
        int[] value3 = LiveStreamSizeSetting.INSTANCE.getValue();
        if (value3.length == 2) {
            iLIZJ = value3[0];
            iLIZ = value3[1];
        }
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int iIntValue = iArr[3];
        Integer numValueOf = Integer.valueOf(LiveStreamProfileSetting.INSTANCE.getValue());
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        }
        int[] value4 = LiveStreamBitrateSetting.INSTANCE.getValue();
        if (value4.length == 3) {
            i4 = value4[0];
            i3 = value4[1];
            i5 = value4[2];
        }
        LiveStreamBitrateAdaptSetting.INSTANCE.getValue();
        boolean z3 = streamUrlExtraSafely.isRoi;
        if (LiveStreamHwRoiSetting.INSTANCE.enable()) {
            z3 = true;
        }
        boolean z4 = streamUrlExtraSafely.isSwRoi;
        if (LiveStreamSwRoiSetting.INSTANCE.enable()) {
            z4 = true;
        }
        Pair[] pairArr = new Pair[2];
        String str4 = "1";
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("hardware", str);
        if (streamUrlExtraSafely.enableByteVC1) {
            str4 = "2";
        }
        pairArr[1] = new Pair("video_codec", str4);
        C465520INi.LIZ.t10("stream", C2097608Jq.LJI(pairArr));
        String str5 = "";
        if (!LiveStreamEnableSdkParamsSetting.INSTANCE.enable() || (streamUrl = room.getStreamUrl()) == null || (strLIZIZ = streamUrl.LIZIZ()) == null) {
            strLIZIZ = "";
        }
        C776280Uck c776280Uck = new C776280Uck(context2);
        c776280Uck.LIZJ = 0;
        c776280Uck.LJIIJ = iLIZJ;
        c776280Uck.LJIIJJI = iLIZ;
        c776280Uck.LJFF = i3;
        c776280Uck.LJ = i4;
        c776280Uck.LJI = i5;
        c776280Uck.LJIILL = iIntValue;
        if (streamUrlExtraSafely.fps == 0) {
            streamUrlExtraSafely.fps = 15;
        }
        c776280Uck.LJII = streamUrlExtraSafely.fps;
        c776280Uck.LJIIL = z2;
        c776280Uck.LJJIFFI = C781270Ukn.LJIJJ().IG0();
        c776280Uck.LJJIL = new C1276880jKg();
        c776280Uck.LJJI = new C0UNM();
        c776280Uck.LJJIZ = new C0UH8();
        if (streamUrlExtraSafely.enableByteVC1) {
            i = 2;
        } else {
            i = 1;
        }
        c776280Uck.LJJIII = i;
        c776280Uck.LJJII = streamUrlExtraSafely.gopSec;
        c776280Uck.LJJIIJ = z3;
        EnumC1309510kBJ enumC1309510kBJ = EnumC1309510kBJ.INST;
        String rOIResPath = enumC1309510kBJ.getROIResPath();
        c776280Uck.LJJIIJZLJL = z4;
        c776280Uck.LJJIIZ = rOIResPath;
        c776280Uck.LJJIIZI = true;
        if (LiveUseNewAudioCodecSetting.INSTANCE.enable()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        c776280Uck.LJIJI = i2;
        String str6 = room.authenticationValue;
        if (str6 == null) {
            str6 = "";
        }
        c776280Uck.LJJJJJ = str6;
        c776280Uck.LJIIZILJ = LiveMaxEnterBackgroundTimeSetting.INSTANCE.getValue();
        c776280Uck.LJIJJLI = 5;
        c776280Uck.LJIL = 5;
        TestEnableEffectSetting testEnableEffectSetting = TestEnableEffectSetting.INSTANCE;
        if (testEnableEffectSetting.disable()) {
            modelFilePath = null;
        } else {
            modelFilePath = enumC1309510kBJ.getModelFilePath();
        }
        c776280Uck.LJJJ = modelFilePath;
        if (testEnableEffectSetting.disable()) {
            resourceFinder = null;
        } else {
            resourceFinder = enumC1309510kBJ.getResourceFinder(context2);
        }
        c776280Uck.LJJJI = resourceFinder;
        int i6 = streamUrlExtraSafely.LIZ;
        if (i6 == 0) {
            i6 = 720;
        }
        int i7 = streamUrlExtraSafely.LIZIZ;
        if (i7 == 0) {
            i7 = 1280;
        }
        c776280Uck.LJJJJ = i6;
        c776280Uck.LJJJJI = i7;
        c776280Uck.LJJJIL = LiveUseEffectAlgorithmAbSetting.INSTANCE.enable();
        if (MultiGuestV3FpsSetting.INSTANCE.isEnable()) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        c776280Uck.LJJJJJL = false;
        c776280Uck.LJJJJL = LiveEnableScopeMonitorAbSetting.INSTANCE.enable();
        c776280Uck.LJJJJLI = LiveLogFilterSwitchAbSetting.INSTANCE.enablePrintLog();
        if (MultiGuestV3ChangeFpsAnchorSetting.INSTANCE.isEnable()) {
            c776280Uck.LJIIIZ = 1;
        }
        c776280Uck.LJJIJ = strLIZIZ;
        StreamUrl streamUrl2 = room.getStreamUrl();
        if (streamUrl2 != null && (liveCoreSDKData = streamUrl2.liveCoreSDKData) != null && (pushData = liveCoreSDKData.pushData) != null && (str3 = pushData.streamData) != null) {
            c776280Uck.LJJIJLIJ = str3;
        }
        StreamUrl streamUrl3 = room.getStreamUrl();
        if (streamUrl3 == null || (list = streamUrl3.pushUrlList) == null || list.size() <= 0 || (str2 = (String) ListProtector.get(list, 0)) == null) {
            str2 = "";
        }
        if (((int) room.netMode) == 1 && !TextUtils.isEmpty(str2)) {
            StreamUrl streamUrl4 = room.getStreamUrl();
            if (streamUrl4 != null) {
                jSONObjectLIZJ = streamUrl4.LIZJ();
            } else {
                jSONObjectLIZJ = null;
            }
            if (LivePushSdkParamsCacheSetting.INSTANCE.enable() && jSONObjectLIZJ != null) {
                strLIZ = C743960TGg.LIZIZ(str2, room.rtcAppId, jSONObjectLIZJ);
            } else {
                strLIZ = C743960TGg.LIZ(str2, room.rtcAppId, strLIZIZ);
            }
            if (!TextUtils.equals(strLIZ, str2)) {
                room.netMode = 0L;
                room.rtcAppId = "";
                StreamUrl streamUrl5 = room.getStreamUrl();
                if (streamUrl5 != null) {
                    streamUrl5.pushUrlList = C1697810uHb.LJ(strLIZ);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("confirmAnchorNetUrl ok-->");
                sbLIZ.append(strLIZ);
                C20441214yg.LJ("VoiceChatLiveCoreAsyncUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int i8 = (int) room.netMode;
        String str7 = room.rtcAppId;
        if (str7 == null) {
            str7 = "";
        }
        c776280Uck.LJJIJIIJI = i8;
        c776280Uck.LJJIJIIJIL = str7;
        String idStr = room.getIdStr();
        if (idStr != null) {
            str5 = idStr;
        }
        c776280Uck.LJJIJIL = str5;
        C776310Ucn c776310UcnLIZ = c776280Uck.LIZ();
        boolean z5 = streamUrlExtraSafely.enableByteVC1;
        C772780UTc.LJI = i5;
        C772780UTc.LJII = i3;
        C772780UTc.LJIIIIZZ = i4;
        C772780UTc.LJIIIZ = z5;
        C772780UTc.LJIIJ = z2;
        C772780UTc.LJIIL = iLIZJ;
        C772780UTc.LJIIJJI = null;
        C1273890jFr c1273890jFr = new C1273890jFr(c776310UcnLIZ);
        if (PushStreamSupportDnsSetting.INSTANCE.isEnable() && (iPullStreamServiceLJIJJ = C781270Ukn.LJIJJ()) != null && (interfaceC784360UpmFY1 = iPullStreamServiceLJIJJ.fY1()) != null && (dnsOptimizerLIZJ = interfaceC784360UpmFY1.LIZJ()) != null && (abstractC1273900jFs = c1273890jFr.LJI) != null) {
            abstractC1273900jFs.LJJJJIZL(dnsOptimizerLIZJ);
        }
        LIZJ = c1273890jFr;
        C20441214yg.LIZIZ("VoiceChatLiveCoreAsyncUtil", "return not null liveStream");
        return LIZJ;
    }

    public final synchronized C1273890jFr LIZ(Context context) {
        return LIZIZ(context);
    }
}
