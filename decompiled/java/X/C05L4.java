package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05L4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.updater.user.ChatListIMUserUpdater$batchQueryIMUserList$2", f = "ChatListIMUserUpdater.kt", l = {516}, m = "invokeSuspend")
public final class C05L4 extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super List<? extends IMUser>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C05L4(InterfaceC1364105Vn<? super C05L4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05L4 c05l4 = new C05L4(interfaceC1364105Vn);
        c05l4.LLILLJJLI = obj;
        return c05l4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListIMUserUpdater@737c.batchQueryIMUserList$2");
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
            List list = (List) this.LLILLJJLI;
            IMContactApi.LIZ.getClass();
            InterfaceC1725106pF interfaceC1725106pFLIZ = C069P.LIZ().LIZ();
            this.LL = 1;
            obj = interfaceC1725106pFLIZ.LJII("im_chat", list, this, true, false, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatListIMUserUpdater@737c.batchQueryIMUserList$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ChatListIMUserUpdater@737c.batchQueryIMUserList$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super List<? extends IMUser>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
