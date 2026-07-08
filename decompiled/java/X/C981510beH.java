package X;

import com.bytedance.android.live.liveinteract.competition.core.model.bizextra.TakeTheStageBizExtra;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0beH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C981510beH extends AbstractC981930bex implements InterfaceC983910bi9 {
    public static List LJJJJJL(AbstractC982800bgM abstractC982800bgM) {
        List<TakeTheStageBizExtra.PerformAnchor> list;
        if (abstractC982800bgM == null) {
            return C13BV.INSTANCE;
        }
        TakeTheStageBizExtra takeTheStageBizExtraLIZIZ = C982410bfj.LIZIZ(abstractC982800bgM);
        if (takeTheStageBizExtraLIZIZ != null && (list = takeTheStageBizExtraLIZIZ.LIZ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<TakeTheStageBizExtra.PerformAnchor> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().userId));
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC983910bi9
    public final void LJJJJ(AbstractC982800bgM abstractC982800bgM) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDataMsgByCoordinator");
        sbLIZ.append(", message=");
        sbLIZ.append(abstractC982800bgM);
        C20441214yg.LIZIZ("TakeStageNoneAnchorCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC982800bgM instanceof C982480bfq) {
            List listLJJJJJL = LJJJJJL(abstractC982800bgM);
            if (listLJJJJJL.size() > 1) {
                LJJJJJ().LJJIJIIJI.LJI(new ArrayList(listLJJJJJL));
                return;
            }
            return;
        }
        if (abstractC982800bgM instanceof C982450bfn) {
            C982450bfn c982450bfn = (C982450bfn) abstractC982800bgM;
            boolean zIsRematch = c982450bfn.LJFF.isRematch();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handleAcceptMsg, isRematch:");
            sbLIZ2.append(zIsRematch);
            sbLIZ2.append(", meanwhile scene handle invite lost");
            C20441214yg.LIZIZ("TakeStageNoneAnchorCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
            List listLJJJJJL2 = LJJJJJL(c982450bfn);
            if (listLJJJJJL2.size() <= 1) {
                return;
            }
            LJJJJJ().LJJIJIIJI.LJI(new ArrayList(listLJJJJJL2));
            return;
        }
        if (!(abstractC982800bgM instanceof C982470bfp)) {
            return;
        }
        C982470bfp c982470bfp = (C982470bfp) abstractC982800bgM;
        boolean zIsRematch2 = c982470bfp.LJFF.isRematch();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleStartMsg, isRematch:");
        sbLIZ3.append(zIsRematch2);
        sbLIZ3.append(", maybe cause by invite api failed");
        C20441214yg.LIZIZ("TakeStageNoneAnchorCoordinator", C2188811AlT.LIZIZ(sbLIZ3));
        List listLJJJJJL3 = LJJJJJL(c982470bfp);
        if (listLJJJJJL3.size() <= 1) {
            return;
        }
        LJJJJJ().LJJIJIIJI.LJI(new ArrayList(listLJJJJJL3));
    }

    public C981510beH(MatchBaseWidget matchBaseWidget, InterfaceC981940bey interfaceC981940bey) {
        super(matchBaseWidget, interfaceC981940bey);
    }
}
