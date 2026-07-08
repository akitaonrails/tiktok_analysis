package X;

import android.text.SpannableString;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ppi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardBottomBarAssem$bindDescription$1$2", f = "SearchCardBottomBarAssem.kt", l = {498}, m = "invokeSuspend")
public final class C656920Ppi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;
    public final /* synthetic */ SearchCardBottomBarAssem LLILLL;
    public final /* synthetic */ SpannableString LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C656920Ppi(TuxTextView tuxTextView, SearchCardBottomBarAssem searchCardBottomBarAssem, SpannableString spannableString, InterfaceC1364105Vn<? super C656920Ppi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = searchCardBottomBarAssem;
        this.LLILZ = spannableString;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C656920Ppi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCardBottomBarAssem@dea7.bindDescription$1$2");
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
                C1C7U.LIZIZ("SearchCardBottomBarAssem@dea7.bindDescription$1$2");
                return objLJFF;
            }
        }
        SearchCardBottomBarAssem searchCardBottomBarAssem = this.LLILLL;
        SpannableString spannableString = this.LLILZ;
        int iIntValue = ((Number) obj).intValue();
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchCardBottomBarAssem), IAdjustAbility.class, null);
        if (iAdjustAbility != null) {
            iAdjustAbility.qw1(EnumC657070Ppx.DESC, new C656980Ppo(spannableString.toString(), iIntValue));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCardBottomBarAssem@dea7.bindDescription$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
