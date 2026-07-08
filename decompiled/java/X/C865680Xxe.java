package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.util.MessageRequestKvUpdater$updateKVByAIOutPut$$inlined$blockingResult$1", f = "MessageRequestKvUpdater.kt", l = {131}, m = "invokeSuspend")
public final class C865680Xxe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ Map LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C865680Xxe(InterfaceC1364105Vn interfaceC1364105Vn, Map map) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C865680Xxe(interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0Y6Q<Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestKvUpdater@d42f.updateKVByAIOutPut$$inlined$blockingResult$1");
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
            Map map = this.LLILLJJLI;
            this.LL = 1;
            c880960YhC.getClass();
            obj = C880960YhC.LIZIZ(map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.updateKVByAIOutPut$$inlined$blockingResult$1");
                return objLJFF;
            }
        }
        if (obj == null) {
            obj = C865670Xxd.LIZJ(false);
        }
        C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.updateKVByAIOutPut$$inlined$blockingResult$1");
        return obj;
    }
}
