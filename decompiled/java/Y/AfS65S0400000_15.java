package Y;

import X.C09JN;
import X.C1324720kZq;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C443530HaJ;
import X.C470590Icr;
import X.C500260Jjc;
import X.C915980Zwa;
import X.C934320aQA;
import X.C934330aQB;
import X.C944860ahA;
import X.C954460awe;
import X.C963610bBP;
import X.C973520bRO;
import X.C973890bRz;
import X.C974490bSx;
import X.C974990bTl;
import X.EnumC308780C8m;
import X.InterfaceC1142670fqD;
import X.InterfaceC975870bVB;
import X.RunnableC514501zT;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AfS65S0400000_15 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS65S0400000_15 afS65S0400000_15, Object obj) {
        DataChannel dataChannelProvideDataChannel;
        long ownerUserId;
        Map<Long, Integer> map;
        boolean z;
        Map<Long, Integer> map2;
        DataChannel dataChannelProvideDataChannel2;
        View view;
        C1C7U.LIZ("CompetitionAnchorLauncher@ecb7.requestMatchPrepareApi$2");
        C470590Icr<MultiMatchPrepareResponse> c470590Icr = (C470590Icr) obj;
        ((C974990bTl) afS65S0400000_15.l0).LJ = false;
        ((C974490bSx) afS65S0400000_15.l1).LJJIIJ(c470590Icr);
        LiveWidget liveWidget = (LiveWidget) afS65S0400000_15.l2;
        Map<Long, BattleABTestList> map3 = null;
        if (liveWidget != null) {
            dataChannelProvideDataChannel = liveWidget.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannelProvideDataChannel);
        if (roomLJJLIIIIJ != null) {
            ownerUserId = roomLJJLIIIIJ.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        LiveWidget liveWidget2 = (LiveWidget) afS65S0400000_15.l2;
        if (liveWidget2 != null && (view = liveWidget2.getView()) != null) {
            HandlerHook.viewPost(view, new RunnableC514501zT((C974990bTl) afS65S0400000_15.l0, c470590Icr, 17));
        }
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF != null) {
            interfaceC975870bVBLJFF.LJIIIIZZ(c470590Icr.data.matchPlaybooks);
        }
        C973890bRz.LJIIIZ(c470590Icr.data);
        C915980Zwa.LJI().LJI().LJIIJ(c470590Icr.data.giftMode);
        ((C974990bTl) afS65S0400000_15.l0).LJI = c470590Icr.data;
        if (EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue()) {
            C973890bRz.LJFF();
        }
        MultiMatchPrepareResponse multiMatchPrepareResponse = c470590Icr.data;
        if (multiMatchPrepareResponse != null) {
            map = multiMatchPrepareResponse.anchorsPermission;
        } else {
            map = null;
        }
        C973520bRO.LIZ = map;
        if (multiMatchPrepareResponse != null) {
            map3 = multiMatchPrepareResponse.abTestSettings;
        }
        C973520bRO.LIZIZ = map3;
        ArrayList arrayList = new ArrayList();
        MultiMatchPrepareResponse multiMatchPrepareResponse2 = c470590Icr.data;
        if (multiMatchPrepareResponse2 != null && (map2 = multiMatchPrepareResponse2.anchorsPermission) != null) {
            LiveWidget liveWidget3 = (LiveWidget) afS65S0400000_15.l2;
            for (Map.Entry<Long, Integer> entry : map2.entrySet()) {
                if (entry.getValue().intValue() == EnumC308780C8m.NoGiftPermission.getState() || entry.getValue().intValue() == EnumC308780C8m.UnknownType.getState()) {
                    arrayList.add(entry.getKey());
                }
                if (entry.getKey().longValue() == ownerUserId && liveWidget3 != null && (dataChannelProvideDataChannel2 = liveWidget3.provideDataChannel()) != null) {
                    dataChannelProvideDataChannel2.SX0(C963610bBP.class, entry.getValue());
                }
            }
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        if (!c470590Icr.data.leagueInfoMap.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update league info ");
            sbLIZ.append(c470590Icr.data.leagueInfoMap);
            C20441214yg.LJIIIZ("CompetitionAnchorLauncher", C2188811AlT.LIZIZ(sbLIZ));
            for (C954460awe c954460awe : listLLILZLL) {
                c954460awe.LJJIII = c470590Icr.data.leagueInfoMap.get(Long.valueOf(c954460awe.LJ));
                if (c954460awe.LJJIIJ == null) {
                    c954460awe.LJJIIJ = new LeagueScoreInfo();
                }
                LeagueScoreInfo leagueScoreInfo = c954460awe.LJJIIJ;
                if (leagueScoreInfo != null) {
                    if (c954460awe.LJJIII == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    leagueScoreInfo.classOptOut = z;
                }
            }
        } else {
            for (C954460awe c954460awe2 : listLLILZLL) {
                if (c954460awe2.LJJIIJ == null) {
                    c954460awe2.LJJIIJ = new LeagueScoreInfo();
                }
                LeagueScoreInfo leagueScoreInfo2 = c954460awe2.LJJIIJ;
                if (leagueScoreInfo2 != null) {
                    leagueScoreInfo2.classOptOut = true;
                }
            }
        }
        ((Function2) afS65S0400000_15.l3).invoke(c470590Icr.data, Boolean.FALSE);
        C1C7U.LIZIZ("CompetitionAnchorLauncher@ecb7.requestMatchPrepareApi$2");
    }

    public static final void accept$1(AfS65S0400000_15 afS65S0400000_15, Object obj) {
        C1C7U.LIZ("ToolbarCoHostBehavior@a5e6.apply$2");
        ((C944860ahA) afS65S0400000_15.l0).LIZLLL((Room) afS65S0400000_15.l1, (HashMap) afS65S0400000_15.l2, (ReserveInfo) afS65S0400000_15.l3);
        C1C7U.LIZIZ("ToolbarCoHostBehavior@a5e6.apply$2");
    }

    public static final void accept$2(AfS65S0400000_15 afS65S0400000_15, Object obj) {
        C1C7U.LIZ("ToolbarCoHostBehavior@a5e6.loadImage$1");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            C443530HaJ c443530HaJ = null;
            if (((C944860ahA) afS65S0400000_15.l0).LLIZ == null) {
                ((InterfaceC1142670fqD) afS65S0400000_15.l1).LIZLLL(((ImageModel) afS65S0400000_15.l2).schema, null);
            }
            Context context = ((C944860ahA) afS65S0400000_15.l0).LLIZ;
            if (context != null) {
                c443530HaJ = new C443530HaJ(context.getResources(), bitmap);
                c443530HaJ.LIZIZ();
            }
            ((C1324720kZq) afS65S0400000_15.l3).setImageDrawable(c443530HaJ);
            ((InterfaceC1142670fqD) afS65S0400000_15.l1).LIZJ(((C1324720kZq) afS65S0400000_15.l3).getWidth(), ((C1324720kZq) afS65S0400000_15.l3).getHeight(), ((ImageModel) afS65S0400000_15.l2).schema);
        }
        C1C7U.LIZIZ("ToolbarCoHostBehavior@a5e6.loadImage$1");
    }

    public static final void accept$3(AfS65S0400000_15 afS65S0400000_15, Object obj) {
        C1C7U.LIZ("VoiceChatToolbarBehavior@be16.loadImage$1");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (((C934330aQB) afS65S0400000_15.l0).LLJ == null) {
                ((InterfaceC1142670fqD) afS65S0400000_15.l1).LIZLLL(((ImageModel) afS65S0400000_15.l2).schema, null);
            }
            C443530HaJ c443530HaJ = new C443530HaJ(((C934330aQB) afS65S0400000_15.l0).LLJ.getResources(), bitmap);
            c443530HaJ.LIZIZ();
            ((C1324720kZq) afS65S0400000_15.l3).setImageDrawable(c443530HaJ);
            ((InterfaceC1142670fqD) afS65S0400000_15.l1).LIZJ(((C1324720kZq) afS65S0400000_15.l3).getWidth(), ((C1324720kZq) afS65S0400000_15.l3).getHeight(), ((ImageModel) afS65S0400000_15.l2).schema);
        }
        C1C7U.LIZIZ("VoiceChatToolbarBehavior@be16.loadImage$1");
    }

    public static final void accept$4(AfS65S0400000_15 afS65S0400000_15, Object obj) {
        Resources resources;
        C1C7U.LIZ("ToolbarMultiGuestBehavior@36f1.loadImage$1");
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (((C934320aQA) afS65S0400000_15.l0).LLJIJIL == null) {
                ((InterfaceC1142670fqD) afS65S0400000_15.l1).LIZLLL(((ImageModel) afS65S0400000_15.l2).schema, null);
            }
            Context context = ((C934320aQA) afS65S0400000_15.l0).LLJIJIL;
            if (context != null && (resources = context.getResources()) != null) {
                C443530HaJ c443530HaJ = new C443530HaJ(resources, bitmap);
                c443530HaJ.LIZIZ();
                ((C1324720kZq) afS65S0400000_15.l3).setImageDrawable(c443530HaJ);
                ((InterfaceC1142670fqD) afS65S0400000_15.l1).LIZJ(((C1324720kZq) afS65S0400000_15.l3).getWidth(), ((C1324720kZq) afS65S0400000_15.l3).getHeight(), ((ImageModel) afS65S0400000_15.l2).schema);
            }
        }
        C1C7U.LIZIZ("ToolbarMultiGuestBehavior@36f1.loadImage$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS65S0400000_15(Object obj, C974990bTl c974990bTl, C974490bSx c974490bSx, LiveWidget liveWidget, Function2<? super MultiMatchPrepareResponse, ? super Boolean, Unit> function2) {
        this.$t = function2;
        this.l0 = obj;
        this.l1 = c974990bTl;
        this.l2 = c974490bSx;
        this.l3 = liveWidget;
    }
}
