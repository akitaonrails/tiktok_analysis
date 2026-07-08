package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YcO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.SendMessageTemplateServiceImpl$enqueueSendDynamicTask$1", f = "SendMessageTemplateServiceImpl.kt", l = {222}, m = "invokeSuspend")
public final class C877980YcO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SendMessageTemplateDynamicTask LL;
    public C878060YcW LLILLJJLI;
    public Object LLILLL;
    public InterfaceC878050YcV LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public int LLJI;
    public final /* synthetic */ List<String> LLJIJIL;
    public final /* synthetic */ SendMessageTemplateDynamicTask LLJILJIL;
    public final /* synthetic */ C878060YcW LLJILJILJ;
    public final /* synthetic */ List<IMContact> LLJILLL;
    public final /* synthetic */ InterfaceC878050YcV LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ Map<String, String> LLJJIII;
    public final /* synthetic */ Map<String, String> LLJJIJI;
    public final /* synthetic */ Map<String, String> LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C877980YcO(List<String> list, SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask, C878060YcW c878060YcW, List<? extends IMContact> list2, InterfaceC878050YcV interfaceC878050YcV, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, InterfaceC1364105Vn<? super C877980YcO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJIJIL = list;
        this.LLJILJIL = sendMessageTemplateDynamicTask;
        this.LLJILJILJ = c878060YcW;
        this.LLJILLL = list2;
        this.LLJJ = interfaceC878050YcV;
        this.LLJJI = str;
        this.LLJJIII = map;
        this.LLJJIJI = map2;
        this.LLJJIJIIJIL = map3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877980YcO(this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask;
        C878060YcW c878060YcW;
        List<IMContact> list;
        InterfaceC878050YcV interfaceC878050YcV;
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        Map<String, String> map3;
        Iterator<String> it2;
        C1C7U.LIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendDynamicTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLJI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLJ;
                map3 = (Map) this.LLIZLLLIL;
                map2 = (Map) this.LLIZ;
                map = (Map) this.LLILZLL;
                str = (String) this.LLILZIL;
                interfaceC878050YcV = this.LLILZ;
                list = (List) this.LLILLL;
                c878060YcW = this.LLILLJJLI;
                sendMessageTemplateDynamicTask = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<String> list2 = this.LLJIJIL;
            sendMessageTemplateDynamicTask = this.LLJILJIL;
            c878060YcW = this.LLJILJILJ;
            list = this.LLJILLL;
            interfaceC878050YcV = this.LLJJ;
            str = this.LLJJI;
            map = this.LLJJIII;
            map2 = this.LLJJIJI;
            map3 = this.LLJJIJIIJIL;
            it2 = list2.iterator();
        }
        while (it2.hasNext()) {
            String next = it2.next();
            this.LL = sendMessageTemplateDynamicTask;
            this.LLILLJJLI = c878060YcW;
            this.LLILLL = list;
            this.LLILZ = interfaceC878050YcV;
            this.LLILZIL = str;
            this.LLILZLL = map;
            this.LLIZ = map2;
            this.LLIZLLLIL = map3;
            this.LLJ = it2;
            this.LLJI = 1;
            String str2 = str;
            Map<String, String> map4 = map;
            Map<String, String> map5 = map2;
            if (C878060YcW.LJFF(sendMessageTemplateDynamicTask, interfaceC878050YcV, c878060YcW, str2, next, list, map4, map5, map3, this) == objLJFF) {
                C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendDynamicTask$1");
                return objLJFF;
            }
            str = str2;
            map = map4;
            map2 = map5;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendDynamicTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
