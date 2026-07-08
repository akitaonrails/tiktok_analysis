package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCardBottomAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ppj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchlive.core.ui.SearchLiveCardBottomAssem$bindDescription$1$setText$1$1", f = "SearchLiveCardBottomAssem.kt", l = {150}, m = "invokeSuspend")
public final class C656930Ppj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;
    public final /* synthetic */ SearchLiveCardBottomAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C656930Ppj(TuxTextView tuxTextView, SearchLiveCardBottomAssem searchLiveCardBottomAssem, InterfaceC1364105Vn<? super C656930Ppj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = searchLiveCardBottomAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C656930Ppj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLiveCardBottomAssem@c94f.bindDescription$1$setText$1$1");
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
            TuxTextView tuxTextView = this.LLILLJJLI;
            this.LL = 1;
            obj = C0R1A.LIZ(tuxTextView, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchLiveCardBottomAssem@c94f.bindDescription$1$setText$1$1");
                return objLJFF;
            }
        }
        SearchLiveCardBottomAssem searchLiveCardBottomAssem = this.LLILLL;
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        int iIntValue = ((Number) obj).intValue();
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchLiveCardBottomAssem), IAdjustAbility.class, null);
        if (iAdjustAbility != null) {
            iAdjustAbility.qw1(EnumC657070Ppx.DESC, new C656980Ppo(tuxTextView2.getText().toString(), iIntValue));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchLiveCardBottomAssem@c94f.bindDescription$1$setText$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
