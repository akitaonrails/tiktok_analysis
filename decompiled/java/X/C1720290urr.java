package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0urr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720290urr extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ InterfaceC1720550usH LL;
    public final /* synthetic */ StellarFragment LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1720290urr(int i, StellarFragment stellarFragment, InterfaceC1720550usH interfaceC1720550usH, boolean z) {
        super(2);
        this.LL = interfaceC1720550usH;
        this.LLILLJJLI = stellarFragment;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        String str2;
        InterfaceC1720550usH interfaceC1720550usH = this.LL;
        if (interfaceC1720550usH != null) {
            StellarFragment stellarFragment = this.LLILLJJLI;
            boolean z = this.LLILLL;
            int i = this.LLILZ;
            StellarViewModel stellarViewModelSR = stellarFragment.SR();
            Map<String, Object> map = interfaceC1720550usH.LLILZLL().LIZ;
            C1716280ulO c1716280ulO = stellarViewModelSR.LLILLJJLI;
            c1716280ulO.getClass();
            Map mapLIZ = C1716280ulO.LIZ(map);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_type", "show");
            linkedHashMap.put("page_type", "action_sheet");
            linkedHashMap.put("rank", String.valueOf(i));
            if (z) {
                linkedHashMap.put("button_id", str);
                str2 = "pipo_button_show";
            } else {
                linkedHashMap.put("card_id", str);
                str2 = "pipo_card_show";
            }
            c1716280ulO.LIZJ(str2, C2097608Jq.LJIIL(C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap), mapLIZ));
        }
        return Unit.LIZ;
    }
}
