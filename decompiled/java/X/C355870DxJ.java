package X;

import Y.AgS286S0100000_5;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftCreativeRestoreHandlerKt$restoreAutoCutRes$2$job$1", f = "DraftCreativeRestoreHandler.kt", l = {560}, m = "invokeSuspend")
public final class C355870DxJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ NLEEditor LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C355870DxJ(NLEEditor nLEEditor, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf, InterfaceC1364105Vn<? super C355870DxJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = nLEEditor;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355870DxJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutRes$2$job$1");
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
            C23157095n c23157095n = C23157095n.LIZ;
            NLEModel model = this.LLILLJJLI.getModel();
            c23157095n.getClass();
            InterfaceC346201Wa interfaceC346201WaLIZJ = C23157095n.LIZJ(model);
            AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLL, 27);
            this.LL = 1;
            if (interfaceC346201WaLIZJ.collect(agS286S0100000_5, this) == objLJFF) {
                C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutRes$2$job$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftCreativeRestoreHandlerKt@2d4.restoreAutoCutRes$2$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
