package X;

import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CoQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment$attachChatFragmentWithLoading$4$4$5$1", f = "TakoChatRootFragment.kt", l = {}, m = "invokeSuspend")
public final class C324880CoQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoChatRootFragment LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324880CoQ(TakoChatRootFragment takoChatRootFragment, long j, C013C c013c, C013C c013c2, InterfaceC1364105Vn<? super C324880CoQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoChatRootFragment;
        this.LLILLJJLI = j;
        this.LLILLL = c013c;
        this.LLILZ = c013c2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324880CoQ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoChatRootFragment@b942.attachChatFragmentWithLoading$4$4$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (SAFExtensionKt.LJIJ(this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TakoChatRootFragment@b942.attachChatFragmentWithLoading$4$4$5$1");
            return unit;
        }
        this.LL.hS(this.LLILLJJLI, this.LLILLL.element);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoChatRootFragment@b942.attachChatFragmentWithLoading$4$4$5$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
