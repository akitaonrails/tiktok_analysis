package X;

import com.ss.android.ugc.aweme.IMGroupChatApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMGroupChatApi$Companion$onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$2$1", f = "IMGroupChatApi.kt", l = {151, 153}, m = "invokeSuspend")
public final class C1310905Bb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310905Bb(String str, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1310905Bb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$2$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1311205Be c1311205Be = C1311205Be.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c1311205Be.getClass();
            obj = C1311205Be.LIZLLL(IMGroupChatApi.class, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$2$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1310805Ba c1310805Ba = new C1310805Ba(obj, this.LLILLL, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, abstractC2238408pq, c1310805Ba);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$2$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$2$1");
        return obj;
    }
}
