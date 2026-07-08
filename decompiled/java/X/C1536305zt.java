package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS90S0110000_2;
import njp.a;

/* JADX INFO: renamed from: X.05zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.feedback.creator.CreatorPanelViewModel$onSubmitAndNotify$1$1$1", f = "CreatorPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1536305zt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536305zt(View view, InterfaceC1364105Vn<? super C1536305zt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1536305zt(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorPanelViewModel@f33a.onSubmitAndNotify$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C888370Yt9 c888370Yt9 = C888370Yt9.LIZ;
        Context context = this.LL.getContext();
        c888370Yt9.getClass();
        C1503105uX.LIZ(new AwS90S0110000_2(context, true, 4));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorPanelViewModel@f33a.onSubmitAndNotify$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
