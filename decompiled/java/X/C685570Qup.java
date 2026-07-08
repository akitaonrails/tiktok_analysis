package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.fixedcell.SearchNimbleTakoButtonCell;
import com.ss.android.ugc.aweme.search.pages.result.pov.ISearchPovCardAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.tako.ITakoService;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C685570Qup extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ SearchNimbleTakoButtonCell LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685570Qup(SearchNimbleTakoButtonCell searchNimbleTakoButtonCell, String str, Map<String, String> map) {
        super(2);
        this.LL = searchNimbleTakoButtonCell;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ITakoMob iTakoMobLJJJLL;
        String str2;
        String str3;
        String aid;
        String str4;
        String strCp0;
        ISearchContextAbility iSearchContextAbility;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        if (this.LL.LLILLJJLI.getValue() == view && Intrinsics.LJFF(this.LLILLJJLI, str)) {
            Aweme awemeLJII = C1255704vj.LIZ().LJII(C1196320hEk.LIZ(this.LL));
            ITakoService iTakoService = (ITakoService) ServiceManager.get().getService(ITakoService.class);
            if (iTakoService != null && (iTakoMobLJJJLL = iTakoService.LJJJLL()) != null) {
                InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this.LL);
                Integer numValueOf = null;
                if (interfaceC665370Q7zLIZ != null && (iSearchContextAbility = (ISearchContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ISearchContextAbility.class, null)) != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
                    str2 = c0prc.LLILLL;
                } else {
                    str2 = null;
                }
                Map<String, String> map = this.LLILLL;
                if (map != null) {
                    str3 = map.get("universal_rank");
                } else {
                    str3 = null;
                }
                if (awemeLJII != null) {
                    aid = awemeLJII.getAid();
                } else {
                    aid = null;
                }
                Pair[] pairArr = new Pair[3];
                Map<String, String> map2 = this.LLILLL;
                String str5 = "";
                if (map2 == null || (str4 = map2.get("abase_id")) == null) {
                    str4 = "";
                }
                pairArr[0] = new Pair("abase_id", str4);
                ISearchPovCardAbility iSearchPovCardAbility = (ISearchPovCardAbility) this.LL.LL.getValue();
                if (iSearchPovCardAbility != null && (strCp0 = iSearchPovCardAbility.cp0()) != null) {
                    str5 = strCp0;
                }
                pairArr[1] = new Pair("info_content", str5);
                if (awemeLJII != null) {
                    numValueOf = Integer.valueOf(awemeLJII.getAwemeType());
                }
                pairArr[2] = new Pair("aweme_type", String.valueOf(numValueOf));
                iTakoMobLJJJLL.mobTikbotEntranceShow("visual_search_tikbot", "ask_button", aid, str2, false, null, "text", null, null, null, null, null, null, null, null, null, null, null, null, null, str3, C2097608Jq.LJIIIIZZ(pairArr), false);
            }
        }
        return Unit.LIZ;
    }
}
