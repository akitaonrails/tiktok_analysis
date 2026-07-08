package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.SearchLemon8CardBottomAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ppp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem.SearchLemon8CardBottomAssem$bindDescription$1", f = "SearchLemon8CardBottomAssem.kt", l = {52}, m = "invokeSuspend")
public final class C656990Ppp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchLemon8CardBottomAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C656990Ppp(SearchLemon8CardBottomAssem searchLemon8CardBottomAssem, String str, InterfaceC1364105Vn<? super C656990Ppp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchLemon8CardBottomAssem;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C656990Ppp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLemon8CardBottomAssem@638b.bindDescription$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TuxTextView tuxTextView = this.LLILLJJLI.LLJLILLLLZIIL;
            if (tuxTextView != null) {
                this.LL = 1;
                obj = C0R1A.LIZ(tuxTextView, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchLemon8CardBottomAssem@638b.bindDescription$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchLemon8CardBottomAssem@638b.bindDescription$1");
            return unit;
        }
        int iIntValue = ((Number) obj).intValue();
        SearchLemon8CardBottomAssem searchLemon8CardBottomAssem = this.LLILLJJLI;
        String str = this.LLILLL;
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchLemon8CardBottomAssem), IAdjustAbility.class, null);
        if (iAdjustAbility != null) {
            iAdjustAbility.qw1(EnumC657070Ppx.DESC, new C656980Ppo(str, iIntValue));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchLemon8CardBottomAssem@638b.bindDescription$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
