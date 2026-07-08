package X;

import com.bytedance.im.core.proto.GetMessagePreviewResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Y85, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.getmessagepreview.GetMessagePreviewUseCase$pullAndSaveMessages$savedMessages$1", f = "GetMessagePreviewUseCase.kt", l = {}, m = "invokeSuspend")
public final class C0Y85 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C869590Y9l>>, Object> {
    public final /* synthetic */ Response LL;
    public final /* synthetic */ C0Y8C LLILLJJLI;
    public final /* synthetic */ GetMessagePreviewResponseBody LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y85(Response response, C0Y8C c0y8c, GetMessagePreviewResponseBody getMessagePreviewResponseBody, InterfaceC1364105Vn<? super C0Y85> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = response;
        this.LLILLJJLI = c0y8c;
        this.LLILLL = getMessagePreviewResponseBody;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y85(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869590Y9l c869590Y9l;
        C1C7U.LIZ("GetMessagePreviewUseCase@412d.pullAndSaveMessages$savedMessages$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Response response = this.LL;
        String str = response.log_id;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = response.region;
        if (str3 != null) {
            str2 = str3;
        }
        Map<String, String> mapLIZJ = C2097908Jt.LIZJ(new Pair("s:get_msg_log_id", str));
        C0Y8C c0y8c = this.LLILLJJLI;
        List<MessageBody> listLIZJ = C0Y81.LIZJ(c0y8c.LIZIZ.LIZLLL(), c0y8c.LIZIZ.LJIIZILJ().LJFF().LIZ(), c0y8c.LIZIZ.LJIIZILJ().LIZ().LIZJ(), this.LLILLL.messages_pb, null, 1, null, str, "GetMessagePreviewUseCase", C0Y82.CONVERSATION_CHAIN);
        C0Y8C c0y8c2 = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList();
        for (MessageBody messageBody : listLIZJ) {
            c0y8c2.getClass();
            Integer num = messageBody.status;
            if (num == null || num.intValue() != 1) {
                C0Y7T c0y7tLIZJ = c0y8c2.LIZJ.LIZJ(messageBody, str2, 1, mapLIZJ, 5);
                if (Intrinsics.LJFF(c0y7tLIZJ.LIZ, C0Y76.LL) && (c869590Y9l = c0y7tLIZJ.LIZIZ) != null) {
                    arrayList.add(c869590Y9l);
                }
            }
        }
        C1C7U.LIZIZ("GetMessagePreviewUseCase@412d.pullAndSaveMessages$savedMessages$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C869590Y9l>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
