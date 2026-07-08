package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$updateUIState$3", f = "FriendsEmptyPageMainSectionVM.kt", l = {}, m = "invokeSuspend")
public final class C1387905bx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LL;
    public final /* synthetic */ C1073710e2z LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387905bx(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, C1073710e2z c1073710e2z, InterfaceC1364105Vn<? super C1387905bx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = friendsEmptyPageMainSectionVM;
        this.LLILLJJLI = c1073710e2z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1387905bx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.updateUIState$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILZLL.setValue(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.updateUIState$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
