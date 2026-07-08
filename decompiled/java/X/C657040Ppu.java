package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ppu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder$bindVideoDesc$3$1$1", f = "SearchVideoHolder.kt", l = {2371}, m = "invokeSuspend")
public final class C657040Ppu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchVideoHolder LLILLJJLI;
    public final /* synthetic */ CharSequence LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C657040Ppu(SearchVideoHolder searchVideoHolder, CharSequence charSequence, InterfaceC1364105Vn<? super C657040Ppu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchVideoHolder;
        this.LLILLL = charSequence;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C657040Ppu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchVideoHolder@6f53.bindVideoDesc$3$1$1");
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
            TextView textView = this.LLILLJJLI.LLLIZZ;
            if (textView == null) {
                textView = null;
            }
            this.LL = 1;
            obj = C0R1A.LIZ(textView, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchVideoHolder@6f53.bindVideoDesc$3$1$1");
                return objLJFF;
            }
        }
        SearchVideoHolder searchVideoHolder = this.LLILLJJLI;
        CharSequence charSequence = this.LLILLL;
        int iIntValue = ((Number) obj).intValue();
        IAdjustAbility iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL(searchVideoHolder.LLJIJIL.LLJILLL), IAdjustAbility.class, null);
        if (iAdjustAbility != null) {
            iAdjustAbility.qw1(EnumC657070Ppx.DESC, new C656980Ppo(charSequence.toString(), iIntValue));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoHolder@6f53.bindVideoDesc$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
