package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0e0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM$updateUIState$1", f = "FriendsEmptyPageRootVM.kt", l = {340}, m = "invokeSuspend")
public final class C1072260e0e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FriendsEmptyPageRootVM LLILLJJLI;
    public final /* synthetic */ Function1<C1072280e0g, C1072280e0g> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1072260e0e(FriendsEmptyPageRootVM friendsEmptyPageRootVM, Function1<? super C1072280e0g, C1072280e0g> function1, InterfaceC1364105Vn<? super C1072260e0e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = friendsEmptyPageRootVM;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072260e0e(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageRootVM@299e.updateUIState$1");
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
            Object value = this.LLILLJJLI.LLILZLL.getValue();
            if (value == null) {
                value = new C1072280e0g(0);
            }
            C1072280e0g c1072280e0gInvoke = this.LLILLL.invoke((C1072280e0g) value);
            if (c1072280e0gInvoke != null && !Intrinsics.LJFF(c1072280e0gInvoke, value)) {
                C2238608ps c2238608ps = C2108208Ns.LIZ;
                C1072250e0d c1072250e0d = new C1072250e0d(this.LLILLJJLI, c1072280e0gInvoke, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c2238608ps, c1072250e0d) == objLJFF) {
                    C1C7U.LIZIZ("FriendsEmptyPageRootVM@299e.updateUIState$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageRootVM@299e.updateUIState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
