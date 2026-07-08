package Y;

import X.C09JN;
import X.C0ISQ;
import X.C0IST;
import X.C0JFN;
import X.C0WZX;
import X.C16FS;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C463730IGl;
import X.C471840Ies;
import X.C472010If9;
import X.C477940Ioi;
import X.C478550Iph;
import X.C478570Ipj;
import X.C478920IqI;
import X.C497120JeY;
import X.C501470JlZ;
import X.EnumC471940If2;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchAweme;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchResponse;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchStruct;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.google.gson.n;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.MGModuleInteraction;

/* JADX INFO: loaded from: classes8.dex */
public class AfS43S1100000_7 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        C1C7U.LIZ("LiveGameWholeLinkMonitor@1602.startCountdown$disposable$1");
        ((C463730IGl) afS43S1100000_7.l1).LJII.remove(afS43S1100000_7.s0);
        String str = afS43S1100000_7.s0;
        if (Intrinsics.LJFF(str, "T2")) {
            C463730IGl c463730IGl = (C463730IGl) afS43S1100000_7.l1;
            if (Intrinsics.LJFF(c463730IGl.LIZIZ, "T2")) {
                c463730IGl.LJIILLIIL(System.currentTimeMillis(), "system_exit_confirm_time_end", "", "");
                c463730IGl.LJIILL();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c463730IGl.LIZLLL = jCurrentTimeMillis;
                c463730IGl.LIZIZ = "T3";
                c463730IGl.LJIILLIIL(jCurrentTimeMillis, "system_enter_enforce_time_start", "", "");
                c463730IGl.LJIIZILJ(c463730IGl.LJIIIZ, c463730IGl.LIZIZ);
            }
        } else if (Intrinsics.LJFF(str, "T3")) {
            C463730IGl c463730IGl2 = (C463730IGl) afS43S1100000_7.l1;
            if (Intrinsics.LJFF(c463730IGl2.LIZIZ, "T3")) {
                c463730IGl2.LJIILLIIL(System.currentTimeMillis(), "system_exit_enforce_time_end", "", "");
                c463730IGl2.LJIILL();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                c463730IGl2.LIZLLL = jCurrentTimeMillis2;
                c463730IGl2.LIZIZ = "T4";
                c463730IGl2.LJIILLIIL(jCurrentTimeMillis2, "system_enter_enjoy_time_start", "", "");
            }
        }
        C1C7U.LIZIZ("LiveGameWholeLinkMonitor@1602.startCountdown$disposable$1");
    }

    public static final void accept$1(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        C1C7U.LIZ("LiveSearchPresenter@67c.loadMore$1");
        LiveSearchResponse liveSearchResponse = (LiveSearchResponse) obj;
        C471840Ies c471840Ies = (C471840Ies) afS43S1100000_7.l1;
        c471840Ies.LIZIZ = false;
        c471840Ies.LIZJ = liveSearchResponse.cursor;
        c471840Ies.LIZLLL = liveSearchResponse.LIZ();
        C471840Ies c471840Ies2 = (C471840Ies) afS43S1100000_7.l1;
        c471840Ies2.LJII = liveSearchResponse;
        c471840Ies2.LJI = liveSearchResponse.hasMore;
        List<LiveSearchStruct> list = liveSearchResponse.liveList;
        if (list != null && (!list.isEmpty())) {
            C471840Ies c471840Ies3 = (C471840Ies) afS43S1100000_7.l1;
            String str = afS43S1100000_7.s0;
            for (LiveSearchStruct liveSearchStruct : list) {
                LiveSearchAweme liveSearchAweme = liveSearchStruct.liveAweme;
                if (liveSearchAweme != null) {
                    liveSearchAweme.LIZ = liveSearchResponse.LIZ();
                }
                if (liveSearchStruct.liveAweme != null && liveSearchResponse.logPb == null) {
                    new n();
                }
                LiveSearchAweme liveSearchAweme2 = liveSearchStruct.liveAweme;
                if (liveSearchAweme2 != null) {
                    liveSearchAweme2.LIZIZ = C472010If9.LIZIZ;
                    liveSearchAweme2.LIZJ = c471840Ies3.LJ;
                    liveSearchAweme2.LIZLLL = str;
                    liveSearchAweme2.LJ = c471840Ies3.LJIIJ;
                }
            }
            c471840Ies3.LIZ.Rg(list, true, EnumC471940If2.SEARCH_LOAD_MORE);
        }
        C1C7U.LIZIZ("LiveSearchPresenter@67c.loadMore$1");
    }

    public static final void accept$2(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        C1C7U.LIZ("MultiTopLiveTopModuleTimerManager@625d.startPrefetchTimerIfNeeded$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopModuleTimerManager RxJava timer tick: ");
        sbLIZ.append(obj);
        sbLIZ.append(", source: ");
        sbLIZ.append(afS43S1100000_7.s0);
        C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        for (MGModuleInteraction mGModuleInteraction : (List) afS43S1100000_7.l1) {
            String str = mGModuleInteraction.name;
            long j = mGModuleInteraction.innerFeedMgAggId;
            C478920IqI.LIZ.getClass();
            String strLJII = C478920IqI.LJII(mGModuleInteraction);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TopModuleTimerManager Fetching room data for ");
            sbLIZ2.append(strLJII);
            sbLIZ2.append(" with innerAggId: ");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ2));
            long jCurrentTimeMillis = System.currentTimeMillis();
            C478550Iph.LIZIZ(str, j, new C478570Ipj(strLJII, mGModuleInteraction, jCurrentTimeMillis), new C477940Ioi(strLJII, jCurrentTimeMillis));
        }
        C1C7U.LIZIZ("MultiTopLiveTopModuleTimerManager@625d.startPrefetchTimerIfNeeded$1");
    }

    public static final void accept$3(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        C1C7U.LIZ("FeedExpiredManager@9a0c.scheduleTimer$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("on feed expired: isPaused ");
        sbLIZ.append(((C0ISQ) afS43S1100000_7.l1).LIZJ);
        sbLIZ.append(" source ");
        sbLIZ.append(afS43S1100000_7.s0);
        C20441214yg.LIZIZ("FeedExpiredManager", C2188811AlT.LIZIZ(sbLIZ));
        C0ISQ c0isq = (C0ISQ) afS43S1100000_7.l1;
        if (!c0isq.LIZJ) {
            Iterator it2 = ((CopyOnWriteArrayList) c0isq.LJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((C0IST) it2.next()).LIZ();
            }
        }
        C1C7U.LIZIZ("FeedExpiredManager@9a0c.scheduleTimer$1");
    }

    public static final void accept$4(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        C1C7U.LIZ("LiveCombineReqeust@92d7.tryResolveResponse$3");
        ((C497120JeY) afS43S1100000_7.l1).LIZ(2, afS43S1100000_7.s0);
        C1C7U.LIZIZ("LiveCombineReqeust@92d7.tryResolveResponse$3");
    }

    public static final void accept$5(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        boolean z;
        C16FS c16fsRR;
        C1C7U.LIZ("DrawGuessStartFragment@1c6.onKeyBoardStateChange$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) afS43S1100000_7.l1;
        if (drawGuessStartFragment.mStatusViewValid && Intrinsics.LJFF(afS43S1100000_7.s0, String.valueOf(C2204961BRm.LLLFZ(drawGuessStartFragment.PR(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl4iQ5gQpOwecRDs/gq5lfS27hzRCufHFDtUYeU+muc61pcf9u4X0jRpGUeVoQEsU=", null))))) {
            DrawGuessStartFragment drawGuessStartFragment2 = (DrawGuessStartFragment) afS43S1100000_7.l1;
            if (!drawGuessStartFragment2.LLJILJIL) {
                if (baseResponse.statusCode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawGuessStartFragment2.SR(afS43S1100000_7.s0, null, z);
                if (z) {
                    DrawGuessStartFragment drawGuessStartFragment3 = (DrawGuessStartFragment) afS43S1100000_7.l1;
                    if (drawGuessStartFragment3.LLJJI && drawGuessStartFragment3.mStatusViewValid && (c16fsRR = drawGuessStartFragment3.RR()) != null) {
                        c16fsRR.LJ();
                        C0JFN c0jfn = C0JFN.LIZ;
                        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(drawGuessStartFragment3, 583);
                        c0jfn.getClass();
                        C0JFN.LJJII(drawGuessStartFragment3, awS586S0100000_7);
                    }
                }
            }
        }
        C1C7U.LIZIZ("DrawGuessStartFragment@1c6.onKeyBoardStateChange$2");
    }

    public static final void accept$6(AfS43S1100000_7 afS43S1100000_7, Object obj) {
        C501470JlZ c501470JlZ;
        C1C7U.LIZ("DrawGuessStartFragment@1c6.onKeyBoardStateChange$3");
        Throwable th = (Throwable) obj;
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) afS43S1100000_7.l1;
        String str = afS43S1100000_7.s0;
        String prompt = null;
        if ((th instanceof C501470JlZ) && (c501470JlZ = (C501470JlZ) th) != null) {
            prompt = c501470JlZ.getPrompt();
        }
        drawGuessStartFragment.SR(str, prompt, false);
        C1C7U.LIZIZ("DrawGuessStartFragment@1c6.onKeyBoardStateChange$3");
    }

    public AfS43S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
