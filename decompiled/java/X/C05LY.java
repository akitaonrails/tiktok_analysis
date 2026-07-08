package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05LY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.util.MessageRequestKvUpdater$updateFollowerNum$3", f = "MessageRequestKvUpdater.kt", l = {123}, m = "invokeSuspend")
public final class C05LY extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LY(List<String> list, InterfaceC1364105Vn<? super C05LY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestKvUpdater@d42f.updateFollowerNum$3");
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
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC1725106pFLIZ.LJII("im_message_request_list", list, this, true, false, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.updateFollowerNum$3");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.updateFollowerNum$3");
        return obj;
    }
}
