package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01lS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.util.MessageRequestKvUpdater$initOrUpdatePriorityScore$2", f = "MessageRequestKvUpdater.kt", l = {172}, m = "invokeSuspend")
public final class C427601lS extends C09AX implements Function1<InterfaceC1364105Vn<? super C878120Ycc>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C427601lS(List<String> list, InterfaceC1364105Vn<? super C427601lS> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C427601lS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C878120Ycc> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestKvUpdater@d42f.initOrUpdatePriorityScore$2");
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
            C880960YhC c880960YhC = C880960YhC.LIZ;
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = c880960YhC.LJFF(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.initOrUpdatePriorityScore$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.initOrUpdatePriorityScore$2");
        return obj;
    }
}
