package X;

import android.os.Looper;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPopulateParams;
import com.bytedance.android.livesdkapi.depend.model.live.match.RecommendedPlaybookInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.0bZA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978340bZA {
    public static RecommendedPlaybookInfo LIZ;
    public static RecommendedPlaybookInfo LIZIZ;
    public static String LIZJ;
    public static C914520ZuE LIZLLL;

    public static Playbook LIZIZ() {
        List<Playbook> listLJ;
        Long lLIZJ = LIZJ(true);
        Playbook playbook = null;
        if (lLIZJ == null) {
            return null;
        }
        long jLongValue = lLIZJ.longValue();
        InterfaceC975870bVB interfaceC975870bVBLJFF = C915980Zwa.LJI().LJFF();
        if (interfaceC975870bVBLJFF == null || (listLJ = interfaceC975870bVBLJFF.LJ()) == null) {
            return null;
        }
        Iterator<Playbook> it2 = listLJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Playbook next = it2.next();
            if (next.playbookId == jLongValue) {
                playbook = next;
                break;
            }
        }
        return playbook;
    }

    public static void LIZLLL() {
        C914520ZuE c914520ZuE = LIZLLL;
        if (c914520ZuE == null) {
            return;
        }
        LIZLLL = null;
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new RunnableC514801zW(new AwS559S0100000_15(c914520ZuE, 996), 150));
    }

    public static void LIZ(Function1 function1) {
        Map<String, String> linkedHashMap;
        Map<Long, RecommendedPlaybookInfo.PlaybookBizExtra> map;
        RecommendedPlaybookInfo.PlaybookBizExtra playbookBizExtra;
        Long lLIZJ = LIZJ(true);
        if (lLIZJ != null) {
            long jLongValue = lLIZJ.longValue();
            RecommendedPlaybookInfo recommendedPlaybookInfo = LIZ;
            if (recommendedPlaybookInfo == null || (map = recommendedPlaybookInfo.playbookBizExtras) == null || (playbookBizExtra = map.get(Long.valueOf(jLongValue))) == null || (linkedHashMap = playbookBizExtra.customAtomicCapabilities) == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            PlaybookPopulateParams playbookPopulateParams = new PlaybookPopulateParams();
            playbookPopulateParams.playbookId = jLongValue;
            playbookPopulateParams.baseOnOnlineTemplateContent = true;
            playbookPopulateParams.functionNameToParamsMap = linkedHashMap;
            C480460Ism.LIZ().getClass();
            C01NB.LIZ(C01NB.LIZIZ(((IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class)).populate(playbookPopulateParams), "MatchRecommendedPlaybookRepo", "populate").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL)).LJJIIJZLJL(new C516201zk(function1, 284)).isDisposed();
        }
    }

    public static Long LIZJ(boolean z) {
        RecommendedPlaybookInfo recommendedPlaybookInfo;
        List<Long> list;
        if (z) {
            recommendedPlaybookInfo = LIZIZ;
        } else {
            recommendedPlaybookInfo = LIZ;
        }
        if (recommendedPlaybookInfo != null && (list = recommendedPlaybookInfo.playbookIds) != null) {
            return (Long) C13LP.LJJJLL(list);
        }
        return null;
    }

    public static void LJ(Playbook playbook, String str) {
        C0UTJ c0utjPl1;
        long j;
        DataChannel dataChannel = C915980Zwa.LJII().getDataChannel();
        if (dataChannel == null || (c0utjPl1 = C915980Zwa.LIZLLL().Pl1(dataChannel)) == null) {
            return;
        }
        PlaybookContent playbookContent = playbook.content;
        if (playbookContent != null) {
            j = playbookContent.playbookContentId;
        } else {
            j = 0;
        }
        c0utjPl1.LJJIII(new C20386714pt(null, new C20389714qN(playbook.playbookId, j, j), "rematch_guide", C20392214qm.LIZ(), null, false, false, "rematch_guide", str, null, 625));
        C978360bZC.LJIIL = "rematch_guide";
        C978360bZC.LJIIJJI = "rematch_guide";
    }
}
