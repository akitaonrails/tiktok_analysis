package X;

import Y.ARunnableS79S0200000_10;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MultiSparkItemAssem;
import com.ss.android.ugc.aweme.search.SearchSkinAbility;

/* JADX INFO: renamed from: X.0Qjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678700Qjk implements InterfaceC678480QjO {
    public final /* synthetic */ MultiSparkItemAssem LIZ;

    public C678700Qjk(MultiSparkItemAssem multiSparkItemAssem) {
        this.LIZ = multiSparkItemAssem;
    }

    @Override // X.InterfaceC678480QjO
    public final void LIZ(C678240Qj0 c678240Qj0) throws Throwable {
        if (!MultiSparkItemAssem.LLLII.contains(Integer.valueOf(c678240Qj0.LIZIZ))) {
            C23250099c.LJ(C23271099x.INSTANCE, new C678670Qjh(this.LIZ, c678240Qj0, null));
        }
    }

    public final void LIZIZ(C678240Qj0 c678240Qj0) {
        SearchSkinAbility searchSkinAbility = (SearchSkinAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), SearchSkinAbility.class, null);
        if (searchSkinAbility != null) {
            searchSkinAbility.J81(true);
        }
        MultiSparkItemAssem multiSparkItemAssem = this.LIZ;
        View view = multiSparkItemAssem.LLJLL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS79S0200000_10(multiSparkItemAssem, c678240Qj0, 8));
        }
    }
}
