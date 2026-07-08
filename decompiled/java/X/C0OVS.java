package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OVS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel$storeTextDraft$1", f = "BulletinEditViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0OVS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BulletinEditViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OVS(BulletinEditViewModel bulletinEditViewModel, String str, InterfaceC1364105Vn<? super C0OVS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bulletinEditViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OVS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEditViewModel@4330.storeTextDraft$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BulletinEditViewModel bulletinEditViewModel = this.LL;
        String str = bulletinEditViewModel.LLILLJJLI;
        if (((C0OKS) bulletinEditViewModel.LL.getValue().getOperator()).LLLJIL(str, this.LLILLJJLI) && str.length() > 0) {
            this.LL.setState(AFwS240S0000000_9.get$arr$(341));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinEditViewModel@4330.storeTextDraft$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
