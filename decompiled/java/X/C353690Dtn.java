package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dtn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.service.NLETemplateModelLoader$load$deferred$1", f = "NLETemplateModelLoader.kt", l = {60}, m = "invokeSuspend")
public final class C353690Dtn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super NLETemplateModel>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C531550Ksz LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C353690Dtn(Context context, String str, C531550Ksz c531550Ksz, String str2, String str3, boolean z, InterfaceC1364105Vn<? super C353690Dtn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = c531550Ksz;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C353690Dtn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NLETemplateModelLoader@5d3a.load$deferred$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C532310KuD c532310KuD = C532310KuD.LIZ;
                Context context = this.LLILLJJLI;
                String str = this.LLILLL;
                C531550Ksz c531550Ksz = this.LLILZ;
                String str2 = this.LLILZIL;
                String str3 = this.LLILZLL;
                boolean z = this.LLIZ;
                this.LL = 1;
                c532310KuD.getClass();
                obj = C532310KuD.LIZ(context, str, c531550Ksz, str2, str3, z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NLETemplateModelLoader@5d3a.load$deferred$1");
                    return objLJFF;
                }
            }
            NLETemplateModel nLETemplateModel = (NLETemplateModel) obj;
            C532310KuD.LIZIZ.remove(this.LLILLL);
            C1C7U.LIZIZ("NLETemplateModelLoader@5d3a.load$deferred$1");
            return nLETemplateModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C532310KuD.LIZIZ.remove(this.LLILLL);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super NLETemplateModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
