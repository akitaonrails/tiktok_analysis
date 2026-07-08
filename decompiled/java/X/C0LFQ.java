package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LFQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.ugctemplate.v2t.nle.CameraNLEPlayerForTemplateComponent$confirm$2$1$videoPath$1", f = "CameraNLEPlayerForTemplateComponent.kt", l = {336}, m = "invokeSuspend")
public final class C0LFQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C0LFO LLILLJJLI;
    public final /* synthetic */ NLEModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LFQ(C0LFO c0lfo, NLEModel nLEModel, InterfaceC1364105Vn<? super C0LFQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lfo;
        this.LLILLL = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LFQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1$videoPath$1");
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
            C0LFT c0lft = this.LLILLJJLI.LLJJJIL;
            if (c0lft != null) {
                NLEModel nLEModel = this.LLILLL;
                this.LL = 1;
                obj = c0lft.lH0(nLEModel, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1$videoPath$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("CameraNLEPlayerForTemplateComponent@69d2.confirm$2$1$videoPath$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
