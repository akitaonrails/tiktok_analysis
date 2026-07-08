package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.SendMessageTemplateServiceImpl$enqueueSendDynamicTask$2$1", f = "SendMessageTemplateServiceImpl.kt", l = {227}, m = "invokeSuspend")
public final class C877990YcP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SendMessageTemplateDynamicTask LLILLL;
    public final /* synthetic */ C878060YcW LLILZ;
    public final /* synthetic */ List<IMContact> LLILZIL;
    public final /* synthetic */ InterfaceC878050YcV LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ Map<String, String> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877990YcP(SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask, InterfaceC878050YcV interfaceC878050YcV, C878060YcW c878060YcW, String str, String str2, List list, Map map, Map map2, Map map3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = sendMessageTemplateDynamicTask;
        this.LLILZ = c878060YcW;
        this.LLILZIL = list;
        this.LLILZLL = interfaceC878050YcV;
        this.LLIZ = str2;
        this.LLIZLLLIL = map;
        this.LLJ = map2;
        this.LLJI = map3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C877990YcP(this.LLILLL, this.LLILZLL, this.LLILZ, str, this.LLIZ, this.LLILZIL, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendDynamicTask$2$1");
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
            SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask = this.LLILLL;
            C878060YcW c878060YcW = this.LLILZ;
            List<IMContact> list = this.LLILZIL;
            InterfaceC878050YcV interfaceC878050YcV = this.LLILZLL;
            String str = this.LLIZ;
            Map<String, String> map = this.LLIZLLLIL;
            Map<String, String> map2 = this.LLJ;
            Map<String, String> map3 = this.LLJI;
            String str2 = this.LLILLJJLI;
            this.LL = 1;
            if (C878060YcW.LJFF(sendMessageTemplateDynamicTask, interfaceC878050YcV, c878060YcW, str, str2, list, map, map2, map3, this) == objLJFF) {
                C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendDynamicTask$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendDynamicTask$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
