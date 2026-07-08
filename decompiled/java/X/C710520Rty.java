package X;

import Y.ACallableS3S0002000_11;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.specact.touchpoints.popup.DynamicPopupTask$handlePopupShow$1$1", f = "DynamicPopupTask.kt", l = {}, m = "invokeSuspend")
public final class C710520Rty extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DynamicPopupTask LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710520Rty(DynamicPopupTask dynamicPopupTask, InterfaceC1364105Vn<? super C710520Rty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dynamicPopupTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710520Rty(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("DynamicPopupTask@9896.handlePopupShow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DynamicDialog dynamicDialog = this.LL.LLILZIL;
        int iIntValue = 0;
        if (dynamicDialog != null) {
            i = dynamicDialog.LIZ;
            Integer num = dynamicDialog.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            }
        } else {
            i = 0;
        }
        C15O7.LIZJ(new ACallableS3S0002000_11(i, iIntValue, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicPopupTask@9896.handlePopupShow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
