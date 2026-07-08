package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS246S0300000_2;
import njp.a;

/* JADX INFO: renamed from: X.05LW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.logicunit.updater.MessageRequestIMUserUpdater$batchFetchIMUserListToUpdate$1", f = "MessageRequestIMUserUpdater.kt", l = {356}, m = "invokeSuspend")
public final class C05LW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1718506oB LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;
    public final /* synthetic */ List<String> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LW(C1718506oB c1718506oB, InterfaceC879010Ye3 interfaceC879010Ye3, List<String> list, InterfaceC1364105Vn<? super C05LW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1718506oB;
        this.LLILLL = interfaceC879010Ye3;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestIMUserUpdater@3d52.batchFetchIMUserListToUpdate$1");
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
            List<String> list = this.LLILZ;
            this.LL = 1;
            obj = interfaceC1725106pFLIZ.LJII("im_message_request_list", list, this, true, false, false);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MessageRequestIMUserUpdater@3d52.batchFetchIMUserListToUpdate$1");
                return objLJFF;
            }
        }
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        C1729806q0.LIZJ(interfaceC879010Ye3, new AwS246S0300000_2((List) obj, (List<? extends IMUser>) this.LLILLJJLI, (C1718506oB) interfaceC879010Ye3, (InterfaceC879010Ye3) 20));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageRequestIMUserUpdater@3d52.batchFetchIMUserListToUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
