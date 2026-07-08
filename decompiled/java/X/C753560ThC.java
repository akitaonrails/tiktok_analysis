package X;

import com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog;
import com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ThC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.ui.SinglePropsSelectorDialog$initData$2", f = "SinglePropsSelectorDialog.kt", l = {126}, m = "invokeSuspend")
public final class C753560ThC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SinglePropsSelectorDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753560ThC(SinglePropsSelectorDialog singlePropsSelectorDialog, InterfaceC1364105Vn<? super C753560ThC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singlePropsSelectorDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753560ThC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SinglePropsSelectorDialog@7b93.initData$2");
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
            SinglePropsSelectorDialog singlePropsSelectorDialog = this.LLILLJJLI;
            SinglePropsViewModel singlePropsViewModel = singlePropsSelectorDialog.LLIZLLLIL;
            if (singlePropsViewModel != null) {
                this.LL = 1;
                if (singlePropsViewModel.vQ2(singlePropsSelectorDialog, this) == objLJFF) {
                    C1C7U.LIZIZ("SinglePropsSelectorDialog@7b93.initData$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SinglePropsSelectorDialog@7b93.initData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
