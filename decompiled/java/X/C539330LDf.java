package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEVEEditorMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.composition.SummaryCompositionTask$run$2", f = "SummaryCompositionTask.kt", l = {}, m = "invokeSuspend")
public final class C539330LDf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C539320LDe LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539330LDf(C539320LDe c539320LDe, InterfaceC1364105Vn<? super C539330LDf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c539320LDe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539330LDf(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SummaryCompositionTask@31ac.run$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LDT c0ldt = this.LL.LJIIIZ;
        Unit unit = null;
        if (c0ldt != null) {
            synchronized (c0ldt) {
                if (c0ldt.LIZLLL) {
                    C201955140j.LIZLLL(C539300LDc.LIZIZ, "SummaryComposer", "Already initialized, skipping");
                } else {
                    C539300LDc c539300LDc = C539300LDc.LIZIZ;
                    C201955140j.LIZLLL(c539300LDc, "SummaryComposer", "Initializing NLE libraries");
                    C0FGC.LIZ(2);
                    C1419820n3E.LIZ.LIZ();
                    NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                    nLEEditorLIZ.setModel(new NLEModel());
                    c0ldt.LIZIZ = nLEEditorLIZ;
                    NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
                    nLEMediaConfig.setWorkSpace(c0ldt.LIZ.LIZ);
                    C1463860oCG c1463860oCGLIZ = C0F9X.LIZ(nLEMediaConfig, null, c0ldt.LIZIZ, 8);
                    ((C389960FQs) c1463860oCGLIZ.getPlayerApi()).setEditorMode(NLEVEEditorMode.COMPILE_ONLY);
                    c0ldt.LIZJ = c1463860oCGLIZ;
                    c0ldt.LIZLLL = true;
                    C201955140j.LIZLLL(c539300LDc, "SummaryComposer", "Initialization complete");
                }
            }
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("SummaryCompositionTask@31ac.run$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
