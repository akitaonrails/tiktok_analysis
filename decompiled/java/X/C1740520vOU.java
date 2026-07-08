package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.EcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vOU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.EcUgBackButtonServiceOfficial$showBackButtonV1$3$1", f = "EcUgBackButtonServiceOfficial.kt", l = {}, m = "invokeSuspend")
public final class C1740520vOU extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ EcUgBackButtonServiceOfficial LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;
    public final /* synthetic */ Fragment LLIZ;
    public final /* synthetic */ DiversionTargetResCfg LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740520vOU(Function0<Unit> function0, ViewGroup viewGroup, View view, EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial, Map<String, Object> map, Fragment fragment, DiversionTargetResCfg diversionTargetResCfg, String str, String str2, InterfaceC1364105Vn<? super C1740520vOU> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = function0;
        this.LLILLL = viewGroup;
        this.LLILZ = view;
        this.LLILZIL = ecUgBackButtonServiceOfficial;
        this.LLILZLL = map;
        this.LLIZ = fragment;
        this.LLIZLLLIL = diversionTargetResCfg;
        this.LLJ = str;
        this.LLJI = str2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1740520vOU c1740520vOU = new C1740520vOU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1740520vOU.LL = view;
        return c1740520vOU.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("EcUgBackButtonServiceOfficial@9a9e.showBackButtonV1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = (View) this.LL;
        this.LLILLJJLI.invoke();
        C786410Ut5.LJJJLZIJ(this.LLILZ, this.LLILLL);
        C786410Ut5.LJLZ(8, this.LLILLL);
        this.LLILZIL.releaseBackButton();
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        Map<String, Object> map = this.LLILZLL;
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("tiktokec_button_click", map);
        Context context = view.getContext();
        EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial = this.LLILZIL;
        PageFinder pageFinderVia = PageFinder.via(this.LLIZ);
        ecUgBackButtonServiceOfficial.getClass();
        C1740600vOc c1740600vOcLJII = EcUgBackButtonServiceOfficial.LJII(pageFinderVia);
        String str = this.LLIZLLLIL.schema;
        if (str != null && !a0.LJJJIL(str)) {
            if (c1740600vOcLJII != null && (strLIZIZ = C1740590vOb.LIZIZ(c1740600vOcLJII, str)) != null) {
                str = strLIZIZ;
            }
            SmartRouter.buildRoute(context, str).open();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcUgBackButtonServiceOfficial@9a9e.showBackButtonV1$3$1");
            return unit;
        }
        EcUgBackButtonServiceOfficial ecUgBackButtonServiceOfficial2 = this.LLILZIL;
        String str2 = this.LLJ;
        String str3 = this.LLJI;
        ecUgBackButtonServiceOfficial2.getClass();
        EcUgBackButtonServiceOfficial.LJIIIZ(context, c1740600vOcLJII, str2, str3);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcUgBackButtonServiceOfficial@9a9e.showBackButtonV1$3$1");
        return unit2;
    }
}
