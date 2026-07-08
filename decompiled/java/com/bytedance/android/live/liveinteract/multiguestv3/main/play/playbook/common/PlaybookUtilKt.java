package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common;

import X.C01EI;
import X.C0TZ2;
import X.C0TZ3;
import X.C1161920gLG;
import X.C13LP;
import X.C19EG;
import X.C1AZW;
import X.C20357914lF;
import X.C20359414lU;
import X.C20359714lX;
import X.C20360614lg;
import X.C20361214lm;
import X.C20361314ln;
import X.C20379114of;
import X.C20379214og;
import X.C20424714w1;
import X.C20424814w2;
import X.C20425114w5;
import X.C20425514w9;
import X.C20426114wF;
import X.C20426414wI;
import X.C20441214yg;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C386801es;
import X.C477520Io2;
import X.C494720Jag;
import X.C494730Jah;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501520Jle;
import X.C5182020e;
import X.C520010KaN;
import X.C755620TkW;
import X.C755630TkX;
import X.C766720U5u;
import X.C782110Um9;
import X.C784920Uqg;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C930940aKi;
import X.C948450amx;
import X.EnumC986300bm0;
import X.InterfaceC1294060jmO;
import X.InterfaceC743640TFa;
import X.InterfaceC760910Tt3;
import Y.AcS495S0100000_12;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookAutoRunTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSpecificGiftPlaybookIdSetting;
import com.bytedance.android.livesdk.model.PlaybookBizChannel;
import com.bytedance.android.livesdk.sei.SeiPlaybookExtra;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS146S1200000_31;
import kotlin.jvm.internal.AwS180S1100000_31;
import kotlin.jvm.internal.AwS64S0010000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookEditorInfo;
import webcast.data.multi_guest_play.PlaybookFlowExtra;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PublishPlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookUtilKt {
    public static final MultiGuestDataHolder LJJIFFI() {
        return (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
    }

    public static final Room LJJIII() {
        return (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
    }

    public static final String LIZIZ(Playbook playbook) {
        Long lValueOf;
        Long lValueOf2 = Long.valueOf(playbook.playbookId);
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null) {
            lValueOf = Long.valueOf(playbookContent.originalPlaybookContentId);
        } else {
            lValueOf = null;
        }
        return LJIJ(lValueOf2, lValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static final Context LIZJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return C520010KaN.LJJIJIIJI((Fragment) lifecycleOwner, true);
        }
        if (lifecycleOwner instanceof C19EG) {
            return (Context) lifecycleOwner;
        }
        if (lifecycleOwner instanceof Context) {
            return C520010KaN.LJJIIZI((Context) lifecycleOwner, true);
        }
        if (lifecycleOwner instanceof View) {
            return C520010KaN.LJJIJ((View) lifecycleOwner, true);
        }
        return C520010KaN.LJJIIZI(null, true);
    }

    public static final PublishPlaybookContent LJI(PlaybookContent playbookContent) {
        PublishPlaybookContent publishPlaybookContent = new PublishPlaybookContent();
        publishPlaybookContent.textType = playbookContent.textType;
        publishPlaybookContent.title = playbookContent.title;
        publishPlaybookContent.coverUri = playbookContent.coverUri;
        publishPlaybookContent.description = playbookContent.description;
        publishPlaybookContent.minSymphonyEngineAppVersion = playbookContent.minSymphonyEngineAppVersion;
        publishPlaybookContent.editorInfo = playbookContent.editorInfo;
        publishPlaybookContent.flowStr = playbookContent.flowStr;
        publishPlaybookContent.tagAggregations = playbookContent.tagAggregations;
        publishPlaybookContent.contentExtra = playbookContent.contentExtra;
        publishPlaybookContent.supportAutomation = playbookContent.supportAutomation;
        return publishPlaybookContent;
    }

    public static final void LJII(C20379114of c20379114of) {
        List<C20359414lU> list;
        C20357914lF config;
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator<C20361214lm> it3 = it2.next().LIZJ.iterator();
                while (it3.hasNext()) {
                    PlayRule playRule = it3.next().LIZLLL;
                    if (playRule != null && (config = playRule.getConfig()) != null && config.LJ == 0) {
                        playRule.destroy();
                    }
                }
            }
        }
    }

    public static final int LJIIL(Throwable th) {
        if (th instanceof C477520Io2) {
            return ((C501520Jle) th).getErrorCode();
        }
        return C386801es.DEFAULT;
    }

    public static final void LJIILL(C20379114of c20379114of) {
        List<C20359414lU> list;
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator<C20361214lm> it3 = it2.next().LIZJ.iterator();
                while (it3.hasNext()) {
                    PlayRule playRule = it3.next().LIZLLL;
                    if (playRule != null) {
                        playRule.destroy();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0127 -> B:16:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, java.lang.Object>>> LJIILLIIL(webcast.data.multi_guest_play.ActivePlaybook r10) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJIILLIIL(webcast.data.multi_guest_play.ActivePlaybook):java.util.Map");
    }

    public static final HashMap<Long, PlayRule> LJIIZILJ(C20379114of c20379114of) {
        List<C20359414lU> list;
        HashMap<Long, PlayRule> map = new HashMap<>();
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (it2.hasNext()) {
                Iterator<C20361214lm> it3 = it2.next().LIZJ.iterator();
                while (it3.hasNext()) {
                    PlayRule playRule = it3.next().LIZLLL;
                    if (playRule != null) {
                        map.put(Long.valueOf(playRule.getConfig().LIZLLL), playRule);
                    }
                }
            }
        }
        return map;
    }

    public static final long LJIJI(String str) {
        Long lLJJLIL = C500260Jjc.LJJLIL(a0.LJJLL('_', str, CardStruct.IStatusCode.DEFAULT));
        if (lLJJLIL != null) {
            return lLJJLIL.longValue();
        }
        return 0L;
    }

    public static final boolean LJIL(C20379114of c20379114of) {
        C20360614lg c20360614lg;
        List<C20359414lU> list;
        C20359414lU c20359414lU;
        if (c20379114of == null || (c20360614lg = c20379114of.LIZIZ) == null || (list = c20360614lg.LIZIZ) == null || (c20359414lU = (C20359414lU) C13LP.LJJJLZIJ(0, list)) == null || !c20359414lU.LJI) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(DataChannel dataChannel) {
        Room room;
        if (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) {
            return false;
        }
        long id = room.getId();
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool == null || !bool.booleanValue() || id <= 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJI(Playbook playbook) {
        List<PlaybookTagAggregation> list;
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null && (list = playbookContent.tagAggregations) != null) {
            for (PlaybookTagAggregation playbookTagAggregation : list) {
                if (playbookTagAggregation.playbookFirstLevelTagType == 10) {
                    if (playbookTagAggregation != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final String LJJIIZI(Playbook playbook) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Playbook(playbookId=");
        sbLIZ.append(playbook.playbookId);
        sbLIZ.append(", authorInfo=");
        sbLIZ.append(playbook.authorInfo);
        sbLIZ.append(", content=");
        PlaybookContent playbookContent = playbook.content;
        String strLIZIZ = null;
        if (playbookContent != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PlaybookContent(textType=");
            sbLIZ2.append(playbookContent.textType);
            sbLIZ2.append(", title='");
            sbLIZ2.append(playbookContent.title);
            sbLIZ2.append("', coverUrl='");
            sbLIZ2.append(playbookContent.coverUrl);
            sbLIZ2.append("', description='");
            sbLIZ2.append(playbookContent.description);
            sbLIZ2.append("', playbookContentId=");
            sbLIZ2.append(playbookContent.playbookContentId);
            sbLIZ2.append(", originalPlaybookContentId=");
            sbLIZ2.append(playbookContent.originalPlaybookContentId);
            sbLIZ2.append(", contentStatus=");
            sbLIZ2.append(playbookContent.contentStatus);
            sbLIZ2.append(", minSymphonyEngineAppVersion=");
            sbLIZ2.append(playbookContent.minSymphonyEngineAppVersion);
            sbLIZ2.append(", editorInfo=");
            PlaybookEditorInfo playbookEditorInfo = playbookContent.editorInfo;
            if (playbookEditorInfo != null) {
                strLIZIZ = LJJIJ(playbookEditorInfo);
            }
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", flowStr='");
            sbLIZ2.append(playbookContent.flowStr);
            sbLIZ2.append("')");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(", totalFavorites=");
        sbLIZ.append(playbook.totalFavorites);
        sbLIZ.append(", totalUsage=");
        sbLIZ.append(playbook.totalUsage);
        sbLIZ.append(", createTime=");
        sbLIZ.append(playbook.createTime);
        sbLIZ.append(", updateTime=");
        sbLIZ.append(playbook.updateTime);
        sbLIZ.append(", isUpdatedVersion=");
        sbLIZ.append(playbook.isUpdatedVersion);
        sbLIZ.append(", isMyFavorite=");
        sbLIZ.append(playbook.isMyFavorite);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJJIJ(PlaybookEditorInfo playbookEditorInfo) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorInfo(editorType='");
        sbLIZ.append(playbookEditorInfo.editorType);
        sbLIZ.append("', version=");
        sbLIZ.append(playbookEditorInfo.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJJIJIIJI(PublishPlaybookContent publishPlaybookContent) {
        String strLJJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookContent(textType=");
        sbLIZ.append(publishPlaybookContent.textType);
        sbLIZ.append(", title='");
        sbLIZ.append(publishPlaybookContent.title);
        sbLIZ.append("', coverUri='");
        sbLIZ.append(publishPlaybookContent.coverUri);
        sbLIZ.append("', description='");
        sbLIZ.append(publishPlaybookContent.description);
        sbLIZ.append("', minSymphonyEngineAppVersion=");
        sbLIZ.append(publishPlaybookContent.minSymphonyEngineAppVersion);
        sbLIZ.append(", editorInfo=");
        PlaybookEditorInfo playbookEditorInfo = publishPlaybookContent.editorInfo;
        if (playbookEditorInfo != null) {
            strLJJIJ = LJJIJ(playbookEditorInfo);
        } else {
            strLJJIJ = null;
        }
        sbLIZ.append(strLJJIJ);
        sbLIZ.append(", flowStr='");
        sbLIZ.append(publishPlaybookContent.flowStr);
        sbLIZ.append("')");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LIZ(Playbook playbook, DataChannel dataChannel) {
        ActivePlaybook activePlaybookLIZIZ;
        String strLJJJJL;
        Playbook playbook2;
        PlaybookContent playbookContent;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ2;
        Playbook playbookLJIILJJIL;
        PlaybookContent playbookContent2;
        Boolean boolValueOf;
        String str;
        List<Long> list;
        Long lValueOf;
        C20424814w2 c20424814w2;
        String str2;
        PlaybookContent playbookContent3 = playbook.content;
        if ((playbookContent3 == null || (strLJJJJL = playbookContent3.flowStr) == null || !(!a0.LJJJIL(strLJJJJL))) && ((dataChannel == null || (((playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) == null || (strLJJJJL = playbookAnchorServiceV2LIZIZ.LJJJJL(playbook)) == null || !(!a0.LJJJIL(strLJJJJL))) && ((playbookAnchorServiceV2LIZIZ2 = C784920Uqg.LIZIZ(dataChannel)) == null || (playbookLJIILJJIL = playbookAnchorServiceV2LIZIZ2.LJIILJJIL()) == null || playbookLJIILJJIL.playbookId != playbook.playbookId || (playbookContent2 = playbookLJIILJJIL.content) == null || (strLJJJJL = playbookContent2.flowStr) == null || !(!a0.LJJJIL(strLJJJJL))))) && ((activePlaybookLIZIZ = C915980Zwa.LJI().LIZ().LIZIZ()) == null || (playbook2 = activePlaybookLIZIZ.playbook) == null || playbook2.playbookId != playbook.playbookId || (playbookContent = playbook2.content) == null || (strLJJJJL = playbookContent.flowStr) == null))) {
            strLJJJJL = "";
        }
        if (!a0.LJJJIL(strLJJJJL)) {
            ILinkCoreService iLinkCoreService = (ILinkCoreService) C1161920gLG.LIZJ(ILinkCoreService.class);
            if (iLinkCoreService != null) {
                boolValueOf = Boolean.valueOf(iLinkCoreService.Nq1());
            } else {
                boolValueOf = null;
            }
            C20426114wF c20426114wFLJIIJJI = new C20425514w9(new AwS64S0010000_28(C500260Jjc.LJJJI(boolValueOf), 3)).LJIIJJI(strLJJJJL);
            if (c20426114wFLJIIJJI == null) {
                return false;
            }
            C20426414wI c20426414wILIZ = C20379214og.LIZ(Long.valueOf(c20426114wFLJIIJJI.LIZ), c20426114wFLJIIJJI.LIZJ);
            if (c20426414wILIZ == null) {
                return false;
            }
            Long lValueOf2 = Long.valueOf(c20426414wILIZ.LIZIZ);
            while (lValueOf2 != null) {
                C20425114w5 c20425114w5LIZIZ = C20379214og.LIZIZ(lValueOf2, c20426114wFLJIIJJI.LIZLLL);
                if (c20425114w5LIZIZ != null) {
                    str = c20425114w5LIZIZ.LIZIZ;
                } else {
                    str = null;
                }
                if (!Intrinsics.LJFF(str, "Parallel") || c20425114w5LIZIZ == null) {
                    return false;
                }
                C20424714w1 c20424714w1 = c20425114w5LIZIZ.LIZLLL;
                if (c20424714w1 != null && (list = c20424714w1.LJII) != null) {
                    Iterator<Long> it2 = list.iterator();
                    while (it2.hasNext()) {
                        long jLongValue = it2.next().longValue();
                        List<C20425114w5> list2 = c20426114wFLJIIJJI.LIZLLL;
                        C20426414wI c20426414wILIZ2 = C20379214og.LIZ(Long.valueOf(jLongValue), c20426114wFLJIIJJI.LIZJ);
                        if (c20426414wILIZ2 != null) {
                            lValueOf = Long.valueOf(c20426414wILIZ2.LIZIZ);
                        } else {
                            lValueOf = null;
                        }
                        C20425114w5 c20425114w5LIZIZ2 = C20379214og.LIZIZ(lValueOf, list2);
                        if (c20425114w5LIZIZ2 != null) {
                            c20424814w2 = c20425114w5LIZIZ2.LIZJ;
                            str2 = c20425114w5LIZIZ2.LIZIZ;
                        } else {
                            c20424814w2 = null;
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, "Task") && c20424814w2 != null && Intrinsics.LJFF(c20424814w2.LIZJ, "community_designated_gift")) {
                            return true;
                        }
                    }
                }
                C20424714w1 c20424714w12 = c20425114w5LIZIZ.LIZLLL;
                if (c20424714w12 == null) {
                    return false;
                }
                lValueOf2 = Long.valueOf(c20424714w12.LIZ);
            }
            return false;
        }
        if (!Intrinsics.LJFF("community_designated_gift", "community_designated_gift") || playbook.playbookId != LiveMatchSpecificGiftPlaybookIdSetting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    public static final ActivePlaybook LIZLLL(SeiPlaybookExtra seiPlaybookExtra, long j) {
        long jLongValue;
        int iIntValue;
        long jLongValue2;
        ActivePlaybook activePlaybook = new ActivePlaybook();
        activePlaybook.roomId = j;
        Long l = seiPlaybookExtra.playId;
        long jLongValue3 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        activePlaybook.playId = jLongValue;
        Integer num = seiPlaybookExtra.status;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        activePlaybook.playStatus = iIntValue;
        Long l2 = seiPlaybookExtra.runningStateId;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        activePlaybook.currentStateId = jLongValue2;
        Playbook playbook = new Playbook();
        PlaybookContent playbookContent = new PlaybookContent();
        Long l3 = seiPlaybookExtra.bookId;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        playbook.playbookId = jLongValue3;
        playbook.content = playbookContent;
        String str = seiPlaybookExtra.title;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        playbookContent.title = str;
        String str3 = seiPlaybookExtra.coverUrl;
        if (str3 != null) {
            str2 = str3;
        }
        playbookContent.coverUrl = str2;
        String str4 = seiPlaybookExtra.scene;
        if (str4 != null && (!a0.LJJJIL(str4))) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str4, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) it2.next()).toString());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            playbookContent.tagTypes = new ArrayList(arrayList);
        }
        activePlaybook.playbook = playbook;
        return activePlaybook;
    }

    public static final void LJIIIIZZ(DataChannel dataChannel, Playbook playbook) {
        Function2 function2 = (Function2) dataChannel.gg0(PlaybookBizChannel.class);
        if (function2 != null) {
            function2.invoke(EnumC986300bm0.DID_START_PLAYBOOK_CANCEL, playbook);
        }
    }

    public static final void LJIIIZ(DataChannel dataChannel, Playbook playbook) {
        Function2 function2 = (Function2) dataChannel.gg0(PlaybookBizChannel.class);
        if (function2 != null) {
            function2.invoke(EnumC986300bm0.DID_START_PLAYBOOK_CONFIRM, playbook);
        }
    }

    public static final void LJIIJ(DataChannel dataChannel, Playbook playbook) {
        Function2 function2 = (Function2) dataChannel.gg0(PlaybookBizChannel.class);
        if (function2 != null) {
            function2.invoke(EnumC986300bm0.DID_START_PLAYBOOK_SHOW, playbook);
        }
    }

    public static final C20361214lm LJIILJJIL(C20379114of c20379114of, Long l) {
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null) {
            Iterator<C20359414lU> it2 = c20360614lg.LIZIZ.iterator();
            while (it2.hasNext()) {
                for (C20361214lm c20361214lm : it2.next().LIZJ) {
                    long j = c20361214lm.LIZIZ;
                    if (l != null && j == l.longValue()) {
                        return c20361214lm;
                    }
                }
            }
        }
        return null;
    }

    public static final String LJIJ(Long l, Long l2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(l);
        sbLIZ.append('_');
        sbLIZ.append(l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LJIJJ(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LJIJJLI(boolean z, Integer num) {
        if (num == null || !z) {
            return false;
        }
        if (num.intValue() == 1) {
            return true;
        }
        if (num.intValue() == 2) {
            return false;
        }
        return PlaybookAutoRunTypeSetting.INSTANCE.isEnableWithSwitchOn();
    }

    public static final void LJJII(LifecycleOwner lifecycleOwner, Function0<Unit> function0) {
        Lifecycle lifecycle;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new PlaybookUtilKt$observeLifecycleEnd$1(function0));
        }
    }

    public static final void LJIIJJI(C20379114of c20379114of, C20359714lX c20359714lX, C20426114wF c20426114wF) {
        if (c20426114wF != null) {
            c20379114of.LIZIZ = LJ(c20426114wF, c20359714lX, LJIIZILJ(c20379114of), null, "editor", null, false, 52);
        }
    }

    public static final void LJIILIIL(String str, String str2, final Function2 function2) {
        if (str != null && !a0.LJJJIL(str)) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIIIZ(str2, str, new InterfaceC760910Tt3<LiveEffect>() { // from class: X.14gB
                @Override // X.InterfaceC760910Tt3
                public final void LIZ(String str3) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS180S1100000_31((Function2) function2, (Function2<? super String, ? super LiveEffect, Unit>) str3, (String) 6));
                }

                @Override // X.InterfaceC760910Tt3
                public final void LIZIZ(Object obj, String str3) {
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS146S1200000_31((LiveEffect) obj, str3, function2, 8));
                }
            });
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new C5182020e(function2, (Function2<? super Boolean, ? super String, Unit>) 313));
        }
    }

    public static final void LJJIIJ(View view, Function0 function0, boolean z) {
        Boolean bool;
        boolean zBooleanValue;
        Object tag = view.getTag(R.id.x1a);
        if (tag instanceof Boolean) {
            bool = (Boolean) tag;
        } else {
            bool = null;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (z) {
            if (!zBooleanValue) {
                function0.invoke();
                view.setTag(R.id.x1a, Boolean.TRUE);
            }
            C786410Ut5.LJLLLLLL(0, view);
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
        view.setTag(R.id.x1a, Boolean.FALSE);
    }

    public static final boolean LJJIJIIJIL(C20379114of c20379114of, long j, C20361314ln c20361314ln) {
        List<C20359414lU> list;
        C20360614lg c20360614lg = c20379114of.LIZIZ;
        if (c20360614lg != null && (list = c20360614lg.LIZIZ) != null) {
            Iterator<C20359414lU> it2 = list.iterator();
            while (it2.hasNext()) {
                for (C20361214lm c20361214lm : it2.next().LIZJ) {
                    if (c20361214lm.LIZIZ == j) {
                        c20361214lm.LIZJ = c20361314ln;
                        String strLIZ = C01EI.LIZ(195, "PLAYBOOK_UTIL");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateUIConfigSuccess, Update, newUIConfig=");
                        sbLIZ.append(c20361314ln);
                        sbLIZ.append(", stateId=");
                        sbLIZ.append(j);
                        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                        return true;
                    }
                }
            }
        }
        String strLIZ2 = C01EI.LIZ(200, "PLAYBOOK_UTIL");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateUIConfigFail, Update, newUIConfig=");
        sbLIZ2.append(c20361314ln);
        sbLIZ2.append(", stateId=");
        sbLIZ2.append(j);
        C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        return false;
    }

    public static final void LJJIIJZLJL(Context context, String str, String str2, String str3, Function0 function0) {
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZJ = str;
        c782110Um9.LJIIIZ(str2);
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = str3;
        c755620TkW.LIZJ = new AcS495S0100000_12(function0, 58);
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131843824);
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.14oi
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 1;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static final C20379114of LJFF(Playbook playbook, C20359714lX c20359714lX, C20425514w9 c20425514w9, String str, boolean z, String str2) {
        C20426114wF c20426114wFLJIIJJI;
        PlaybookContent playbookContent;
        C20360614lg c20360614lgLJ = null;
        Map<Long, PlaybookFlowExtra> map = null;
        c20360614lgLJ = null;
        c20360614lgLJ = null;
        c20360614lgLJ = null;
        if (str == null && ((playbookContent = playbook.content) == null || (str = playbookContent.flowStr) == null)) {
            str = "";
        }
        PlaybookContent playbookContent2 = playbook.content;
        if (playbookContent2 != null) {
            playbookContent2.flowStr = str;
            String str3 = playbookContent2.flowStr;
            if (str3 != null && c20425514w9 != null && (c20426114wFLJIIJJI = c20425514w9.LJIIJJI(str3)) != null) {
                PlaybookContent playbookContent3 = playbook.content;
                if (playbookContent3 != null) {
                    map = playbookContent3.functionExtraMap;
                }
                c20360614lgLJ = LJ(c20426114wFLJIIJJI, c20359714lX, null, map, str2, null, z, 18);
            }
        }
        C20379114of c20379114of = new C20379114of(playbook, c20360614lgLJ);
        C20441214yg.LJIIIZ("PLAYBOOK_UTIL", c20379114of.toString());
        return c20379114of;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c A[LOOP:3: B:80:0x0166->B:82:0x016c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1 A[PHI: r18
      0x01b1: PHI (r18v1 java.lang.String) = (r18v0 java.lang.String), (r18v3 java.lang.String) binds: [B:92:0x01ad, B:28:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20360614lg LJ(X.C20426114wF r31, X.C20359714lX r32, java.util.HashMap r33, java.util.Map r34, java.lang.String r35, java.lang.String r36, boolean r37, int r38) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt.LJ(X.14wF, X.14lX, java.util.HashMap, java.util.Map, java.lang.String, java.lang.String, boolean, int):X.14lg");
    }
}
