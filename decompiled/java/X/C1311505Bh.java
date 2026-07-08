package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.IMGroupChatApi$Companion$onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$1", f = "IMGroupChatApi.kt", l = {150}, m = "invokeSuspend")
public final class C1311505Bh extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1311505Bh(String str, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1311505Bh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            C1311405Bg c1311405Bg = new C1311405Bg(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c1311405Bg);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMGroupChatApi$Companion@c57e.onDFDownloaded$$inlined$onDFDownloaded$im_group_chat_api_release$1");
        return obj;
    }
}
