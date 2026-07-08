package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS584S0100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0DrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templatedownload.TemplateProducer$resizeMediaData$2", f = "TemplateProducer.kt", l = {144}, m = "invokeSuspend")
public final class C352110DrF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ArrayList<NLETrackSlot>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C352420Drk LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352110DrF(C352420Drk c352420Drk, Context context, String str, boolean z, InterfaceC1364105Vn<? super C352110DrF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c352420Drk;
        this.LLILZIL = context;
        this.LLILZLL = str;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352110DrF(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TemplateProducer@ae93.resizeMediaData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C352420Drk c352420Drk = this.LLILZ;
            Context context = this.LLILZIL;
            String str = this.LLILZLL;
            boolean z = this.LLIZ;
            this.LL = context;
            this.LLILLJJLI = str;
            this.LLILLL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            c352420Drk.LIZJ(0, context, str, new AwS584S0100000_5(c23260099m, 980), z);
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateProducer@ae93.resizeMediaData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TemplateProducer@ae93.resizeMediaData$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ArrayList<NLETrackSlot>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
