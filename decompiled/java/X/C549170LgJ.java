package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.aigc.IMService;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS93S1200000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0LgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549170LgJ {
    public static final C549170LgJ LIZ = new C549170LgJ();
    public static final IMService LIZIZ;

    static {
        C0LPI.LIZ.getClass();
        LIZIZ = C0LPI.LIZ();
    }

    public static boolean LIZIZ(List list) {
        if (list.isEmpty() || list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MentionDataItem mentionDataItem = (MentionDataItem) it2.next();
            Regex regex = C549450Lgl.LIZ;
            if (mentionDataItem.cameoId != null) {
                return false;
            }
        }
        return true;
    }

    public static void LJ(Context context, AIGCSocialModel aIGCSocialModel) {
        IMService iMService;
        String str;
        MentionDataItem mentionDataItem;
        C19EG c19eg = (C19EG) C737910Sx3.LIZIZ(context);
        if (c19eg != null && (iMService = LIZIZ) != null) {
            C549170LgJ c549170LgJ = LIZ;
            List<MentionDataItem> list = aIGCSocialModel.peerCameoInfo;
            if (list != null && (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list)) != null) {
                str = mentionDataItem.name;
            } else {
                str = null;
            }
            c549170LgJ.getClass();
            iMService.LIZJ(c19eg, aIGCSocialModel, LIZ(context, str, "chat"), new AwS552S0100000_8(aIGCSocialModel, 1098), new AwS552S0100000_8(aIGCSocialModel, 1099), new AwS552S0100000_8(aIGCSocialModel, 1100));
        }
    }

    public static C21350518gx LIZ(Context context, String str, String str2) {
        String str3 = str2;
        String string = C0LQY.AI_THEATER.toString();
        String string2 = context.getString(2131826069, str);
        String string3 = context.getString(2131826070, str);
        String strValueOf = String.valueOf(C547930LeJ.LIZ(2131826067, new Object[0]));
        String strValueOf2 = String.valueOf(C547930LeJ.LIZ(2131826068, new Object[0]));
        String strLIZ = C547930LeJ.LIZ(2131826038, new Object[0]);
        String string4 = context.getString(2131826037, str);
        String strLIZ2 = C547930LeJ.LIZ(2131826036, new Object[0]);
        String strLIZ3 = C547930LeJ.LIZ(2131826179, new Object[0]);
        String strLIZ4 = C547930LeJ.LIZ(2131826231, new Object[0]);
        if (str3 == null) {
            str3 = "";
        }
        return new C21350518gx(string, "ic_theater_invite_share", string2, string3, strValueOf, strValueOf2, strLIZ, string4, strLIZ2, strLIZ3, strLIZ4, null, str3, "ic_theater_invite_share", SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
    }

    public static void LIZJ(IAITheaterCreationLauncher.EnterParams enterParams, AIGCCameoDisplayInfo aIGCCameoDisplayInfo, String str) {
        String str2;
        AIGCSocialModel aIGCSocialModel = enterParams.socialParams;
        AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
        InterfaceC548750Lfd interfaceC548750LfdLIZ = null;
        if (aIGCEntranceInfo != null) {
            str2 = aIGCEntranceInfo.enterFrom;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "create_video")) {
            if (aIGCCameoDisplayInfo != null) {
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C1E32 c1e32 = C1E32.LJIIIIZZ;
                InterfaceC548750Lfd interfaceC548750LfdLIZ2 = C548910Lft.LIZ(enterParams);
                if (interfaceC548750LfdLIZ2 != null) {
                    interfaceC548750LfdLIZ = C548790Lfh.LIZ(interfaceC548750LfdLIZ2, aIGCCameoDisplayInfo);
                }
                AwS93S1200000_8 awS93S1200000_8 = new AwS93S1200000_8(enterParams, aIGCSocialModel, str, 8);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c1e32, interfaceC548750LfdLIZ, awS93S1200000_8);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str2, "others_homepage")) {
            return;
        }
        C548880Lfq c548880Lfq2 = C548880Lfq.LIZ;
        C1E32 c1e322 = C1E32.LJIIIIZZ;
        InterfaceC548750Lfd interfaceC548750LfdLIZ3 = C548910Lft.LIZ(enterParams);
        AwS93S1200000_8 awS93S1200000_82 = new AwS93S1200000_8(enterParams, aIGCSocialModel, str, 9);
        c548880Lfq2.getClass();
        C548880Lfq.LIZLLL(c1e322, interfaceC548750LfdLIZ3, awS93S1200000_82);
    }

    public static void LIZLLL(Context context, IAITheaterCreationLauncher.EnterParams enterParams, AIGCCameoDisplayInfo aIGCCameoDisplayInfo, Function0 function0) {
        String str;
        List<MentionDataItem> list;
        MentionDataItem mentionDataItem;
        AIGCSocialModel aIGCSocialModel = enterParams.socialParams;
        IMService iMService = LIZIZ;
        if (iMService != null) {
            String str2 = null;
            if (aIGCSocialModel != null && (list = aIGCSocialModel.peerCameoInfo) != null && (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list)) != null) {
                str = mentionDataItem.name;
            } else {
                str = null;
            }
            AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
            if (aIGCEntranceInfo != null) {
                str2 = aIGCEntranceInfo.enterFrom;
            }
            iMService.LIZIZ(context, aIGCSocialModel, LIZ(context, str, str2), new AwS552S0100000_8(function0, (Function0<Unit>) 1097), new AwS409S0200000_8(enterParams, aIGCCameoDisplayInfo, 145), new AwS409S0200000_8(enterParams, aIGCCameoDisplayInfo, 146));
        }
    }
}
