package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.widget.TextView;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.liveinteract.match.business.event.BattleHighScoreNoticeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.livesdk.model.PreviewEffect;
import com.bytedance.android.livesdk.model.message.BattleNoticeExtremeHighScoreNotice;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: renamed from: X.0bZK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978440bZK {
    public static final String LJIIIIZZ() {
        ILiveCompetitionExternalService iLiveCompetitionExternalService = (ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class);
        if (!C975140bU0.LJI()) {
            return (C975140bU0.LJFF() || C975140bU0.LJII()) ? String.valueOf(iLiveCompetitionExternalService.lr()) : "";
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        return String.valueOf(interfaceC973730bRjYf2 != null ? Long.valueOf(interfaceC973730bRjYf2.LJJJJJL()) : null);
    }

    public static final String LIZJ(long j) {
        if (j >= 1000000000) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j / ((long) 1000000000));
            sbLIZ.append('B');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (j >= 1000000) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(j / ((long) 1000000));
            sbLIZ2.append('M');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (j >= 1000) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            sbLIZ3.append('K');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return String.valueOf(j);
    }

    public static final String LIZLLL(long j) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setZeroDigit('0');
        return new DecimalFormat(",###", decimalFormatSymbols).format(j);
    }

    public static final ActivePlaybook LJ(DataChannel dataChannel) {
        C499701x5 c499701x5;
        Set<ActivePlaybook> set;
        if (dataChannel != null && (c499701x5 = (C499701x5) dataChannel.gg0(ActivePlaybookChannel.class)) != null && (set = c499701x5.LIZ) != null) {
            return (ActivePlaybook) C13LP.LJJJLIIL(set);
        }
        return null;
    }

    public static final String LJFF(Playbook playbook) {
        List<PlaybookTagAggregation> list;
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null && (list = playbookContent.tagAggregations) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<PlaybookTagAggregation> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(it2.next().playbookFirstLevelTagType));
            }
            return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        }
        return "";
    }

    public static final PreviewEffect LJI(ActivePlaybook activePlaybook) {
        List list;
        String str;
        String str2;
        Map<String, List<Map<String, Object>>> mapLJIILLIIL = PlaybookUtilKt.LJIILLIIL(activePlaybook);
        if (mapLJIILLIIL != null && (list = (List) ((LinkedHashMap) mapLJIILLIIL).get("victory_lap_funny_effect")) != null) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                Map map = (Map) it2.next();
                PreviewEffect previewEffect = new PreviewEffect("7262038681995710978", "");
                Object obj = map.get("resource_id");
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    str = previewEffect.resourceId;
                }
                Object obj2 = map.get("effectName");
                if (!(obj2 instanceof String) || (str2 = (String) obj2) == null) {
                    str2 = previewEffect.effectName;
                }
                return new PreviewEffect(str, str2);
            }
        }
        return null;
    }

    public static final GiftMode LJII(GiftModeMeta giftModeMeta) {
        if (giftModeMeta == null) {
            return null;
        }
        GiftMode giftMode = new GiftMode();
        giftMode.giftId = giftModeMeta.giftId;
        giftMode.giftIconImage = giftModeMeta.giftIconImage;
        C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
        String str = giftModeMeta.giftNameKey;
        c1124870fNVLIZJ.getClass();
        giftMode.giftName = C1124870fNV.LIZIZ(str);
        return giftMode;
    }

    public static final void LJIIJ(String str, String str2) {
        C0UEA liveEffectController = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectController();
        C1161920gLG.LIZJ(IEffectService.class);
        if (liveEffectController.LJIIIIZZ(str, str2)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1316805Di(liveEffectController, str2, str, null), 3);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("victoryLapEffect, Effect no longer in use, name: ");
        sbLIZ.append(str2);
        sbLIZ.append(", resId: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZ(long j, TextView textView, boolean z) {
        boolean z2;
        String strLIZLLL;
        if (!z && j >= 1000000) {
            z2 = true;
            strLIZLLL = "1M+";
        } else {
            z2 = false;
            strLIZLLL = LIZLLL(j);
        }
        textView.setText(strLIZLLL);
        float f = 0.0f;
        if (z2) {
            float textSize = textView.getTextSize();
            if (textSize > 0.0f) {
                f = (-0.8f) / textSize;
            }
            textView.setLetterSpacing(f);
            return;
        }
        textView.setLetterSpacing(0.0f);
    }

    public static final Bitmap LJIIJJI(int i, int i2, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
    }

    public static final void LJIIIZ(DataChannel dataChannel, boolean z, LinkMicBattleNoticeMessage linkMicBattleNoticeMessage, BattleInfoResponse battleInfoResponse) {
        long jLJJJJJL;
        HighScoreControlCfg highScoreControlCfg;
        Text text;
        BattleNoticeExtremeHighScoreNotice battleNoticeExtremeHighScoreNotice = linkMicBattleNoticeMessage.extremeHighScoreNotice;
        if (battleNoticeExtremeHighScoreNotice == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handleBattleExtremeHighScoreNoticeMessage");
            sbLIZ.append(": extremeHighScoreNotice is null");
            C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            jLJJJJJL = interfaceC973730bRjYf2.LJJJJJL();
        } else {
            jLJJJJJL = 0;
        }
        if (jLJJJJJL != battleNoticeExtremeHighScoreNotice.battleId) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleBattleExtremeHighScoreNoticeMessage");
            sbLIZ2.append(": battleId does not match current battleId");
            C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (!C915980Zwa.LJFF().co0()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handleBattleExtremeHighScoreNoticeMessage");
            sbLIZ3.append(": Not in match");
            C20441214yg.LJ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        C974800bTS c974800bTS = (C974800bTS) dataChannel.gg0(BattleTimeLeftChannel.class);
        if (c974800bTS == null) {
            return;
        }
        if (c974800bTS.LIZ <= 5) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("handleBattleExtremeHighScoreNoticeMessage");
            sbLIZ4.append(": Less than 5 seconds, skipping notice...");
            C20441214yg.LJIIIZ("MultiMatchUtils", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        if (z) {
            text = battleNoticeExtremeHighScoreNotice.displayTextOriginViewers;
        } else {
            InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
            if (interfaceC973730bRjYf22 != null) {
                interfaceC973730bRjYf22.LJJJLL();
            }
            if (battleInfoResponse != null) {
                highScoreControlCfg = battleInfoResponse.fuzzyDisplayConfigV2;
            } else {
                highScoreControlCfg = null;
            }
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            if (highScoreControlCfg != null && highScoreControlCfg.normalControlApplied && !highScoreControlCfg.originDisplayToUserList.contains(Long.valueOf(currentUserId))) {
                text = battleNoticeExtremeHighScoreNotice.displayTextUnrelatedViewers;
            } else {
                text = battleNoticeExtremeHighScoreNotice.displayTextOriginViewers;
            }
        }
        if (text == null) {
            C20441214yg.LIZIZ("MultiMatchUtils", "handleBattleExtremeHighScoreNoticeMessage: Text is null");
        } else {
            dataChannel.LC0(BattleHighScoreNoticeEvent.class, new C978450bZL(text));
        }
    }

    public static final String LIZIZ(C985820blE c985820blE, long j, long j2, boolean z, boolean z2) {
        String strLIZLLL = LIZLLL(j);
        if (!c985820blE.LIZ) {
            return strLIZLLL;
        }
        long j3 = c985820blE.LIZIZ;
        if (j >= j3 || j2 >= j3) {
            long j4 = j - j2;
            if (1 != 0) {
                if (z2 || j4 < 0) {
                    return "";
                }
                if (j4 == 0) {
                    if (z) {
                        return "";
                    }
                    return C497740JfY.LJIJI(2131853330);
                }
                if (j4 < j3) {
                    return C497740JfY.LJIJJ(2131853329, LIZLLL(j4));
                }
                return C497740JfY.LJIJJ(2131853327, LIZJ(j3));
            }
            return strLIZLLL;
        }
        return strLIZLLL;
    }
}
