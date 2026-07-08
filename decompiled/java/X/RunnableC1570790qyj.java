package X;

import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.MallMainActivityAssem;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class RunnableC1570790qyj implements Runnable {
    public final /* synthetic */ MallMainActivityAssem LL;
    public final /* synthetic */ EnumC1570770qyh LLILLJJLI;

    public RunnableC1570790qyj(MallMainActivityAssem mallMainActivityAssem, EnumC1570770qyh enumC1570770qyh) {
        this.LL = mallMainActivityAssem;
        this.LLILLJJLI = enumC1570770qyh;
    }

    public final void LIZ() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C0CXF.LIZ.getClass();
        String str = "unknown";
        String str2 = C0CXF.LJFF() ? "homepage_top_tab" : C0CXF.LJ() ? "homepage_bottom_tab" : "unknown";
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
        if (c19egLIZ == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
            str = "null";
        } else if (homeTabAbilityLIZ.dR("Shop")) {
            str = "homepage_top_tab";
        } else if (homeTabAbilityLIZ.zd1()) {
            str = "homepage_bottom_tab";
        }
        this.LL.getClass();
        if (Intrinsics.LJFF(str2, "homepage_top_tab") || Intrinsics.LJFF(str2, "homepage_bottom_tab") || Intrinsics.LJFF(str, "homepage_top_tab") || Intrinsics.LJFF(str, "homepage_bottom_tab")) {
            C1767950w6j c1767950w6j = C1767950w6j.LIZ;
            String value = this.LLILLJJLI.getValue();
            c1767950w6j.getClass();
            HashMap map = new HashMap();
            map.put("from_type", value);
            map.put("show_from_mall", str2);
            map.put("show_in_homepage", str);
            C1767950w6j.LJIJ("rd_tiktokec_mall_tab_exist", map);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MallMainActivityAssem@49df.sendMallTabExistEvent$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MallMainActivityAssem@49df.sendMallTabExistEvent$1");
    }
}
