package X;

import Y.AComparatorS508S0100000_9;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OGa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage$onViewCreated$1$1$1", f = "DoNotTranslateSettingPage.kt", l = {}, m = "invokeSuspend")
public final class C616500OGa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DoNotTranslateSettingPage LL;
    public final /* synthetic */ C05P0<List<ContentLanguage>> LLILLJJLI;
    public final /* synthetic */ C05P0<List<String>> LLILLL;
    public final /* synthetic */ C05P0<List<String>> LLILZ;
    public final /* synthetic */ C05P0<List<String>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C616500OGa(DoNotTranslateSettingPage doNotTranslateSettingPage, C05P0<List<ContentLanguage>> c05p0, C05P0<List<String>> c05p02, C05P0<List<String>> c05p03, C05P0<List<String>> c05p04, InterfaceC1364105Vn<? super C616500OGa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = doNotTranslateSettingPage;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
        this.LLILZ = c05p03;
        this.LLILZIL = c05p04;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C616500OGa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DoNotTranslateSettingPage@3d93.onViewCreated$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final DoNotTranslateSettingPage doNotTranslateSettingPage = this.LL;
        final C05P0<List<ContentLanguage>> c05p0 = this.LLILLJJLI;
        final C05P0<List<String>> c05p02 = this.LLILLL;
        final C05P0<List<String>> c05p03 = this.LLILZ;
        final C05P0<List<String>> c05p04 = this.LLILZIL;
        C10F8 c10f8 = new C10F8() { // from class: X.0OGb
            @Override // X.C10F8
            public final void onFailed(Exception exc) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
            @Override // X.C10F8
            public final void Hl(PushSettings pushSettings) {
                ?? arrayList;
                DoNotTranslateSettingPage doNotTranslateSettingPage2 = doNotTranslateSettingPage;
                C05P0<List<ContentLanguage>> c05p05 = c05p0;
                C05P0<List<String>> c05p06 = c05p02;
                C05P0<List<String>> c05p07 = c05p03;
                C05P0<List<String>> c05p08 = c05p04;
                List list = pushSettings.allDoNotTranslate;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                List<ContentLanguage> list2 = pushSettings.selectedDoNotTranslate;
                if (list2 != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<ContentLanguage> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getLanguageCode());
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                C616500OGa.LIZ(doNotTranslateSettingPage2, c05p05, c05p06, c05p07, c05p08, list, arrayList);
            }
        };
        if (doNotTranslateSettingPage.LLJILJIL.getValue() != null && this.LL.LLJILJILJ.getValue() != null) {
            Object[] objArr = (Object[]) this.LL.LLJILJIL.getValue();
            if (objArr != null) {
                DoNotTranslateSettingPage doNotTranslateSettingPage2 = this.LL;
                C05P0<List<ContentLanguage>> c05p05 = this.LLILLJJLI;
                C05P0<List<String>> c05p06 = this.LLILLL;
                C05P0<List<String>> c05p07 = this.LLILZ;
                C05P0<List<String>> c05p08 = this.LLILZIL;
                Object[] objArr2 = (Object[]) doNotTranslateSettingPage2.LLJILJILJ.getValue();
                if (objArr2 != null) {
                    LIZ(doNotTranslateSettingPage2, c05p05, c05p06, c05p07, c05p08, C13LQ.LJJLL(objArr), C13LQ.LJJLL(objArr2));
                }
            }
        } else {
            ((C1260870iur) this.LL.LLJI.getValue()).LLILLJJLI = c10f8;
            Boolean.valueOf(((C1260870iur) this.LL.LLJI.getValue()).LIZJ(new Object[0]));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DoNotTranslateSettingPage@3d93.onViewCreated$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(DoNotTranslateSettingPage doNotTranslateSettingPage, C05P0<List<ContentLanguage>> c05p0, C05P0<List<String>> c05p02, C05P0<List<String>> c05p03, C05P0<List<String>> c05p04, List<? extends ContentLanguage> list, List<String> list2) {
        Integer numValueOf;
        c05p0.setValue(C13LP.LJLLLL(new AComparatorS508S0100000_9(list2, 2), list));
        c05p02.setValue(list2);
        c05p03.setValue(list2);
        c05p04.setValue(list2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
        c2344009Gk.LJIIIIZZ("enter_from", (String) doNotTranslateSettingPage.LLJIJIL.getValue());
        c2344009Gk.LJIIIIZZ("not_translate_langs", C13LP.LJJLIIIJ(c05p02.getValue(), ",", null, null, 0, null, null, 62));
        Bundle arguments = doNotTranslateSettingPage.getArguments();
        if (arguments != null && arguments.containsKey("aweme_type")) {
            Bundle arguments2 = doNotTranslateSettingPage.getArguments();
            if (arguments2 != null) {
                numValueOf = Integer.valueOf(arguments2.getInt("aweme_type"));
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "aweme_type");
        }
        C20684815ws.LJIILLIIL("enter_not_translate_langs", c2344009Gk.LIZ);
    }
}
