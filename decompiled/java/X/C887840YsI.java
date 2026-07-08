package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0YsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.MessageRequestFragment$unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2", f = "MessageRequestFragment.kt", l = {}, m = "invokeSuspend")
public final class C887840YsI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageRequestFragment LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C887840YsI(MessageRequestFragment messageRequestFragment, long j, InterfaceC1364105Vn<? super C887840YsI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageRequestFragment;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C887840YsI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestFragment@89f5.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isDetached() && this.LL.getHost() != null) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LL.LLIZLLLIL.getValue();
            EnumC880520YgU enumC880520YgU = EnumC880520YgU.MESSAGE_REQUEST_SPAM;
            int i = (int) this.LLILLJJLI;
            if (enumC880520YgU == null) {
                assemViewModel.getClass();
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(((C887820YsG) assemViewModel.getState()).LLIZLLLIL);
                linkedHashMap.put(enumC880520YgU, Integer.valueOf(i));
                assemViewModel.setState(new AwS593S0100000_14(linkedHashMap, (Map<String, String>) 196));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestFragment@89f5.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestFragment@89f5.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
