package X;

import com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05W1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.FriendsEmptyPageMainSectionVM$updateUIState$4", f = "FriendsEmptyPageMainSectionVM.kt", l = {}, m = "invokeSuspend")
public final class C05W1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FriendsEmptyPageMainSectionVM LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05W1(FriendsEmptyPageMainSectionVM friendsEmptyPageMainSectionVM, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = friendsEmptyPageMainSectionVM;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05W1(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsEmptyPageMainSectionVM@1270.updateUIState$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLIZLLLIL.setValue(Boolean.valueOf(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsEmptyPageMainSectionVM@1270.updateUIState$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
