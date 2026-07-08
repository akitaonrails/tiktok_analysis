package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoModeTemplateChosenResultImpl$startUseTemplate$1$downloadTemplateTask$1", f = "PhotoModeTemplateChosenResultImpl.kt", l = {148}, m = "invokeSuspend")
public final class C2489709pH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends NLETemplateModel, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ C0L1E LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ ShortVideoContext LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2489709pH(C0L1E c0l1e, String str, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C2489709pH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l1e;
        this.LLILLL = str;
        this.LLILZ = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2489709pH(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$downloadTemplateTask$1");
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
            C0L1E c0l1e = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ.shootWay;
            this.LL = 1;
            obj = c0l1e.LIZJ(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$downloadTemplateTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$downloadTemplateTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends NLETemplateModel, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
