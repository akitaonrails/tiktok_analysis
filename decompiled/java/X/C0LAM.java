package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LAM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.helper.DraftAIGCRestoreHelper$updateAIGCShootingEffectsWithLegacyFramework$4", f = "DraftAIGCRestoreHelper.kt", l = {}, m = "invokeSuspend")
public final class C0LAM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AwemeDraft LL;
    public final /* synthetic */ List<C0LSZ> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LAM(AwemeDraft awemeDraft, List<C0LSZ> list, InterfaceC1364105Vn<? super C0LAM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = awemeDraft;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LAM(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffectsWithLegacyFramework$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        nLEEditorLIZ.restore(this.LL.LJIIJJI);
        for (C0LSZ c0lsz : this.LLILLJJLI) {
            C545750Lan c545750Lan = C545750Lan.LIZ;
            AwemeDraft awemeDraft = this.LL;
            c545750Lan.getClass();
            C545750Lan.LIZ(nLEEditorLIZ, awemeDraft, c0lsz);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftAIGCRestoreHelper@c321.updateAIGCShootingEffectsWithLegacyFramework$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
