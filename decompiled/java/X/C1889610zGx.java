package X;

import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2ViewModel;
import com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.v2.container.InboxPageWidgetContainer$updateMultiSelectMode$2", f = "InboxPageWidgetContainer.kt", l = {}, m = "invokeSuspend")
public final class C1889610zGx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InboxPageWidgetContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1889610zGx(InboxPageWidgetContainer inboxPageWidgetContainer, InterfaceC1364105Vn<? super C1889610zGx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inboxPageWidgetContainer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1889610zGx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InboxFragmentV2ViewModel inboxFragmentV2ViewModelCp;
        C1C7U.LIZ("InboxPageWidgetContainer@c98.updateMultiSelectMode$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InboxPageWidgetContainer inboxPageWidgetContainer = this.LL;
        AbstractC1889640zH0 abstractC1889640zH0Bp = inboxPageWidgetContainer.bp(inboxPageWidgetContainer.ko());
        if (abstractC1889640zH0Bp != null && (inboxFragmentV2ViewModelCp = this.LL.cp()) != null) {
            inboxFragmentV2ViewModelCp.vQ2(abstractC1889640zH0Bp);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxPageWidgetContainer@c98.updateMultiSelectMode$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
