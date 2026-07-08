package X;

import Y.AComparatorS502S0100000_3;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.trill.setting.DoNotTranslateSettingPageV2$onViewCreated$1$1$1", f = "DoNotTranslateSettingPageV2.kt", l = {}, m = "invokeSuspend")
public final class C2493409ps extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DoNotTranslateSettingPageV2 LL;
    public final /* synthetic */ C05P0<List<ContentLanguage>> LLILLJJLI;
    public final /* synthetic */ C05P0<List<String>> LLILLL;
    public final /* synthetic */ C05P0<List<String>> LLILZ;
    public final /* synthetic */ C05P0<List<String>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2493409ps(DoNotTranslateSettingPageV2 doNotTranslateSettingPageV2, C05P0<List<ContentLanguage>> c05p0, C05P0<List<String>> c05p02, C05P0<List<String>> c05p03, C05P0<List<String>> c05p04, InterfaceC1364105Vn<? super C2493409ps> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = doNotTranslateSettingPageV2;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
        this.LLILZIL = c05p04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2493409ps(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("DoNotTranslateSettingPageV2@e57d.onViewCreated$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DoNotTranslateSettingPageV2 doNotTranslateSettingPageV2 = this.LL;
        List<ContentLanguage> list = doNotTranslateSettingPageV2.LLJJ;
        C05P0<List<ContentLanguage>> c05p0 = this.LLILLJJLI;
        C05P0<List<String>> c05p02 = this.LLILLL;
        C05P0<List<String>> c05p03 = this.LLILZ;
        C05P0<List<String>> c05p04 = this.LLILZIL;
        List<String> list2 = doNotTranslateSettingPageV2.LLJJI;
        List listLLIIII = C13LP.LLIIII(list);
        List<String> listLLIIII2 = C13LP.LLIIII(list2);
        c05p0.setValue(C13LP.LJLLLL(new AComparatorS502S0100000_3(listLLIIII2, 1), listLLIIII));
        c05p02.setValue(listLLIIII2);
        c05p03.setValue(listLLIIII2);
        c05p04.setValue(listLLIIII2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
        c2344009Gk.LJIIIIZZ("enter_from", (String) doNotTranslateSettingPageV2.LLJI.getValue());
        c2344009Gk.LJIIIIZZ("enter_method", doNotTranslateSettingPageV2.getEnterMethod());
        c2344009Gk.LJIIIIZZ("not_translate_langs", C13LP.LJJLIIIJ(c05p02.getValue(), ",", null, null, 0, null, null, 62));
        Bundle arguments = doNotTranslateSettingPageV2.getArguments();
        if (arguments != null && arguments.containsKey("aweme_type")) {
            Bundle arguments2 = doNotTranslateSettingPageV2.getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("aweme_type"));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
        }
        C20684815ws.LJIILLIIL("enter_not_translate_langs", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DoNotTranslateSettingPageV2@e57d.onViewCreated$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
