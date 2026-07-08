package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.067p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$1", f = "BaseCommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C15567067p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseCommonChatNoticeViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15567067p(BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, InterfaceC1364105Vn<? super C15567067p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseCommonChatNoticeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15567067p(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EventBus.LIZLLL().LJIJJ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
