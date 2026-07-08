package X;

import com.ss.android.ugc.aweme.im.message.template.service.BatchDynamicRequest;
import com.ss.android.ugc.aweme.im.message.template.service.BatchDynamicResponse;
import com.ss.android.ugc.aweme.internalshare.impl.service.ShareDynamicTemplateServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.057w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.service.ShareDynamicTemplateServiceImpl$generateDynamicTemplateTask$1", f = "ShareDynamicTemplateServiceImpl.kt", l = {39}, m = "invokeSuspend")
public final class C13026057w extends C09AX implements Function2<List<? extends BatchDynamicRequest>, InterfaceC1364105Vn<? super List<? extends BatchDynamicResponse>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ShareDynamicTemplateServiceImpl LLILLL;
    public final /* synthetic */ JSONObject LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13026057w(ShareDynamicTemplateServiceImpl shareDynamicTemplateServiceImpl, JSONObject jSONObject, String str, String str2, InterfaceC1364105Vn<? super C13026057w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = shareDynamicTemplateServiceImpl;
        this.LLILZ = jSONObject;
        this.LLILZIL = str;
        this.LLILZLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13026057w c13026057w = new C13026057w(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c13026057w.LLILLJJLI = obj;
        return c13026057w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareDynamicTemplateServiceImpl@3288.generateDynamicTemplateTask$1");
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
            ShareDynamicTemplateServiceImpl shareDynamicTemplateServiceImpl = this.LLILLL;
            JSONObject jSONObject = this.LLILZ;
            String str = this.LLILZLL;
            this.LL = 1;
            shareDynamicTemplateServiceImpl.getClass();
            if (Intrinsics.LJFF(str, "ec_invite")) {
                obj = shareDynamicTemplateServiceImpl.LIZIZ(list, this, jSONObject);
            } else {
                obj = C13BV.INSTANCE;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareDynamicTemplateServiceImpl@3288.generateDynamicTemplateTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShareDynamicTemplateServiceImpl@3288.generateDynamicTemplateTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends BatchDynamicRequest> list, InterfaceC1364105Vn<? super List<? extends BatchDynamicResponse>> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
