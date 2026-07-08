package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.DistrictCell;
import com.ss.android.ugc.aweme.pipo.cashier.common.address.Region;
import com.zhiliaoapp.musically.R;
import defpackage.a5;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS5S0510000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0ufD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712450ufD extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final List<String> LLILZ;
    public final List<Region> LLILZIL;
    public final List<C1712460ufE> LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;

    public final C1749280vcc getStatusView() {
        return (C1749280vcc) this.LLILLL.getValue();
    }

    public final C1846060y8i getTabBar() {
        return (C1846060y8i) this.LL.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20631115oD getViewPager() {
        return (ViewOnAttachStateChangeListenerC20631115oD) this.LLILLJJLI.getValue();
    }

    public C1712450ufD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1560));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1561));
        this.LLILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1559));
        this.LLILZ = new ArrayList();
        this.LLILZIL = new ArrayList();
        this.LLILZLL = new ArrayList();
        this.LLIZ = "";
        this.LLIZLLLIL = "";
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dvp, this, true);
        getViewPager().getViewItemOperator().LIZJ(DistrictCell.class);
        getViewPager().setUserInputEnabled(false);
    }

    public final void LIZ(Region region, boolean z, Function1<? super String, Unit> function1, Function1<? super List<Region>, Unit> function12) {
        String str;
        String str2;
        String str3;
        Pair[] pairArr = new Pair[4];
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[0] = new Pair("without_next_level", str);
        if (region == null || (str2 = region.geoNameId) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("father_geoname_id", str2);
        pairArr[2] = new Pair("country_code", this.LLIZ);
        pairArr[3] = new Pair("default_geoname_id", this.LLIZLLLIL);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (region != null && (str3 = region.geoNameId) != null && str3.length() != 0) {
            String str4 = region.geoNameId;
            AwS5S0510000_26 awS5S0510000_26 = new AwS5S0510000_26(this, region, mapLJIIJ, function12, function1, z, 1);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new AnonymousClass0205(CoroutineExceptionHandler.LJJLIL, awS5S0510000_26, 0))), null, null, new C345201Vq(str4, null, awS5S0510000_26), 3);
            getStatusView();
            C786410Ut5.LLLZLZ(getStatusView(), 0);
            getStatusView().LJ();
            return;
        }
        AwS5S0510000_26 awS5S0510000_262 = new AwS5S0510000_26(this, region, mapLJIIJ, function1, function12, z, 0);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new AnonymousClass0205(CoroutineExceptionHandler.LJJLIL, awS5S0510000_262, 1))), null, null, new C345301Vr(awS5S0510000_262, null), 3);
        getStatusView();
        C786410Ut5.LLLZLZ(getStatusView(), 0);
        getStatusView().LJ();
    }

    public final void LIZIZ(Region region, Region region2, boolean z, Function1<? super String, Unit> function1, Function1<? super List<Region>, Unit> function12) {
        String str;
        String str2;
        Region region3 = (Region) C13LP.LJJLIIIJL(this.LLILZIL);
        String str3 = null;
        if (region3 != null) {
            str = region3.level;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, region2.level)) {
            C19719612Di.LJJIJIIJI(this.LLILZIL);
        }
        ((ArrayList) this.LLILZIL).add(region2);
        if (z) {
            function12.invoke(this.LLILZIL);
            return;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Map<String, Double> map = a5.LIZ;
        Map<String, Double> map2 = (Map) settingsManagerLIZLLL.LJIIIIZZ("pipo_cashier_geo_select_level_count", Map.class, map);
        if (map2 != null) {
            map = map2;
        }
        int i = 0;
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            String key = entry.getKey();
            double dDoubleValue = entry.getValue().doubleValue();
            if (region != null) {
                str2 = region.code;
            } else {
                str2 = null;
            }
            if (u.LJIJI(key, str2, true)) {
                i = (int) dDoubleValue;
            }
        }
        if (((ArrayList) this.LLILZIL).size() >= i) {
            function12.invoke(this.LLILZIL);
            return;
        }
        if (region != null) {
            str3 = region.code;
        }
        LIZ(new Region(null, region2.geoNameId, str3, null, null, null, null), z, function1, function12);
    }
}
