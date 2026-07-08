package Y;

import X.AbstractC707180Roa;
import X.C01GW;
import X.C0T5M;
import X.C1619720sFe;
import X.C1894320zOY;
import X.C1C7U;
import X.C705790RmL;
import X.C721680SSo;
import X.InterfaceC1897260zTI;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public class ACallableS418S0100000_11 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS418S0100000_11 aCallableS418S0100000_11) {
        C1C7U.LIZ("FeedMultiTagLayout@629c.removeCustomView$1");
        ((C705790RmL) aCallableS418S0100000_11.l0).getClass();
        int childCount = ((C705790RmL) aCallableS418S0100000_11.l0).getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C705790RmL) aCallableS418S0100000_11.l0).getChildAt(i) instanceof AbstractC707180Roa) {
                C705790RmL c705790RmL = (C705790RmL) aCallableS418S0100000_11.l0;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c705790RmL, null);
                c705790RmL.removeViewAt(i);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedMultiTagLayout@629c.removeCustomView$1");
        return unit;
    }

    public static final Object call$1(ACallableS418S0100000_11 aCallableS418S0100000_11) {
        Object objValueOf;
        C1C7U.LIZ("InsertionDataRepository@5e2f.updateRecord$1");
        Aweme aweme = (Aweme) aCallableS418S0100000_11.l0;
        if (aweme != null) {
            aweme.getCardInsertInfo();
        }
        C0T5M.LIZ.getClass();
        if (C0T5M.LIZLLL().isEmpty()) {
            objValueOf = Boolean.valueOf(((CopyOnWriteArrayList) C0T5M.LJII.getValue()).add((Aweme) aCallableS418S0100000_11.l0));
        } else {
            C01GW c01gw = C0T5M.LJII;
            if (!((CopyOnWriteArrayList) c01gw.getValue()).isEmpty()) {
                Iterator it2 = ((CopyOnWriteArrayList) c01gw.getValue()).iterator();
                while (it2.hasNext()) {
                    C0T5M.LIZ((Aweme) it2.next());
                }
                ((CopyOnWriteArrayList) C0T5M.LJII.getValue()).clear();
            }
            C0T5M c0t5m = C0T5M.LIZ;
            Aweme aweme2 = (Aweme) aCallableS418S0100000_11.l0;
            c0t5m.getClass();
            C0T5M.LIZ(aweme2);
            objValueOf = Unit.LIZ;
        }
        C1C7U.LIZIZ("InsertionDataRepository@5e2f.updateRecord$1");
        return objValueOf;
    }

    public static final Object call$2(ACallableS418S0100000_11 aCallableS418S0100000_11) {
        C1C7U.LIZ("CellAdaptionComponent@341f.bindInner$1");
        Boolean boolValueOf = Boolean.valueOf(((CellAdaptionComponent) aCallableS418S0100000_11.l0).kp(false));
        C1C7U.LIZIZ("CellAdaptionComponent@341f.bindInner$1");
        return boolValueOf;
    }

    public static final Object call$3(ACallableS418S0100000_11 aCallableS418S0100000_11) {
        C1C7U.LIZ("IncentiveShareCardManager@7a4a.onReferralFeedSelected$1$1");
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c1894320zOY.getClass();
        C1894320zOY.LJIJJ(37, linkedHashMap, null, null, null, "");
        Map<String, String> mapLIZIZ = C1894320zOY.LIZIZ(((C721680SSo) aCallableS418S0100000_11.l0).LJIJ, "feed_card", "feed_card", "homepage");
        mapLIZIZ.put("module_form", "share_button");
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("invite_card_show", mapLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IncentiveShareCardManager@7a4a.onReferralFeedSelected$1$1");
        return unit;
    }

    public ACallableS418S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
