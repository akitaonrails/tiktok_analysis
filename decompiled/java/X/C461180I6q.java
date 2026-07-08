package X;

import Y.AgS73S0400000_6;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.MessageScrollBounceAbility$onBind$1", f = "MessageScrollBounceAbility.kt", l = {42}, m = "invokeSuspend")
public final class C461180I6q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ScrollToMessageViewModel LLILLJJLI;
    public final /* synthetic */ Function0<Long> LLILLL;
    public final /* synthetic */ C461190I6r LLILZ;
    public final /* synthetic */ List<View> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C461180I6q(ScrollToMessageViewModel scrollToMessageViewModel, Function0<Long> function0, C461190I6r c461190I6r, List<? extends View> list, InterfaceC1364105Vn<? super C461180I6q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = scrollToMessageViewModel;
        this.LLILLL = function0;
        this.LLILZ = c461190I6r;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C461180I6q(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageScrollBounceAbility@f81d.onBind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ScrollToMessageViewModel scrollToMessageViewModel = this.LLILLJJLI;
            C2252321DDq c2252321DDq = scrollToMessageViewModel.LLILLJJLI;
            AgS73S0400000_6 agS73S0400000_6 = new AgS73S0400000_6(this.LLILLL, this.LLILZ, this.LLILZIL, scrollToMessageViewModel, 0);
            this.LL = 1;
            if (c2252321DDq.collect(agS73S0400000_6, this) == objLJFF) {
                C1C7U.LIZIZ("MessageScrollBounceAbility@f81d.onBind$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
