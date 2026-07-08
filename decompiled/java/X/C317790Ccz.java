package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ccz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.util.PhotoModeEditHelper$downloadAndEditPhoto$1", f = "PhotoModeEditHelper.kt", l = {51}, m = "invokeSuspend")
public final class C317790Ccz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Function0<Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317790Ccz(int i, List<String> list, Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, Function0<Unit> function0, InterfaceC1364105Vn<? super C317790Ccz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = list;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317790Ccz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        Object objLJI = obj;
        C1C7U.LIZ("PhotoModeEditHelper@d3ad.downloadAndEditPhoto$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C317470CcT c317470CcT = new C317470CcT(this.LLILLL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c317470CcT);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("PhotoModeEditHelper@d3ad.downloadAndEditPhoto$1");
                return objLJFF;
            }
        }
        List<String> list = (List) objLJI;
        if (list != null) {
            if (this.LLILLJJLI >= this.LLILLL.size()) {
                i = 0;
            } else {
                i = this.LLILLJJLI;
            }
            C317480CcU c317480CcU = C317480CcU.LIZ;
            Context context = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            String str4 = this.LLIZLLLIL;
            String str5 = this.LLJ;
            String str6 = this.LLJI;
            String str7 = this.LLJIJIL;
            final Function0<Unit> function0 = this.LLJILJIL;
            c317480CcU.getClass();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("shoot_way", str5, bundle);
            C786410Ut5.LJJJI("enter_method", str3, bundle);
            C786410Ut5.LJJJI("enter_from", str4, bundle);
            bundle.putInt("photomode_cover", i);
            C786410Ut5.LJJJI("photomode_title", str, bundle);
            C786410Ut5.LJJJI("photomode_desc", str2, bundle);
            C786410Ut5.LJJJI("open_platform_share_id", str6, bundle);
            C786410Ut5.LJJJI("open_platform_key", str7, bundle);
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openGotoNextService().gotoNextPage(c19egLIZIZ, false, bundle, list, new IPageToFinish() { // from class: X.0Cd0
                    @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
                    public final void onFinish(boolean z) {
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                });
            } else if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function02 = this.LLJILJIL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoModeEditHelper@d3ad.downloadAndEditPhoto$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
