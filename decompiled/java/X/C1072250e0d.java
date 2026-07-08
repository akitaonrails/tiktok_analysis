package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageRootVM$updateUIState$1$1", f = "FriendsEmptyPageRootVM.kt", l = {}, m = "invokeSuspend")
public final class C1072250e0d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FriendsEmptyPageRootVM LL;
    public final /* synthetic */ C1072280e0g LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072250e0d(FriendsEmptyPageRootVM friendsEmptyPageRootVM, C1072280e0g c1072280e0g, InterfaceC1364105Vn<? super C1072250e0d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = friendsEmptyPageRootVM;
        this.LLILLJJLI = c1072280e0g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1072250e0d(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageRootVM@299e.updateUIState$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILZIL.setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageRootVM@299e.updateUIState$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
