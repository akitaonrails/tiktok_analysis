package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestLifecycleAssem;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Yog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestLifecycleAssem$unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2", f = "MessageRequestLifecycleAssem.kt", l = {}, m = "invokeSuspend")
public final class C885600Yog extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageRequestLifecycleAssem LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C885600Yog(MessageRequestLifecycleAssem messageRequestLifecycleAssem, long j, InterfaceC1364105Vn<? super C885600Yog> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageRequestLifecycleAssem;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C885600Yog(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestLifecycleAssem@8939.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestLifecycleAssem@8939.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
            return unit;
        }
        if (!fragmentLJI.isDetached() && fragmentLJI.getHost() != null) {
            MessageRequestPageVM messageRequestPageVMHo = this.LL.ho();
            EnumC880520YgU enumC880520YgU = EnumC880520YgU.MESSAGE_REQUEST_SPAM;
            int i = (int) this.LLILLJJLI;
            if (enumC880520YgU != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(messageRequestPageVMHo.getState().LLILZ);
                linkedHashMap.put(enumC880520YgU, Integer.valueOf(i));
                messageRequestPageVMHo.setState(new AwS593S0100000_14(linkedHashMap, (Map<String, String>) 194));
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MessageRequestLifecycleAssem@8939.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestLifecycleAssem@8939.unreadCountObserver$1$onMessageRequestAggregationUnreadUpdate$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
