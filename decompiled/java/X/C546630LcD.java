package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.draft.DraftAIGCRestoreHandler$restore$2", f = "DraftAIGCRestoreHandler.kt", l = {82}, m = "invokeSuspend")
public final class C546630LcD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C546620LcC LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ AIGCCreationModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546630LcD(C546620LcC c546620LcC, AwemeDraft awemeDraft, AIGCCreationModel aIGCCreationModel, InterfaceC1364105Vn<? super C546630LcD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c546620LcC;
        this.LLILLL = awemeDraft;
        this.LLILZ = aIGCCreationModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546630LcD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("DraftAIGCRestoreHandler@cf1d.restore$2");
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
            try {
                C546620LcC c546620LcC = this.LLILLJJLI;
                AwemeDraft awemeDraft = this.LLILLL;
                c546620LcC.getClass();
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                c546620LcC.LJIIIIZZ = nLEEditorLIZ;
                nLEEditorLIZ.restore(awemeDraft.LJIIJJI);
                Function2<Boolean, String, Unit> function2 = this.LLILLJJLI.LJ;
                if (function2 != null) {
                    function2.invoke(true, "");
                }
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C546820LcW.LIZIZ.LIZIZ("DraftAIGCRestoreHandler", "initNLEEditor failed", th);
                Function2<Boolean, String, Unit> function22 = this.LLILLJJLI.LJ;
                z = false;
                if (function22 != null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "nle init exception";
                    }
                    function22.invoke(false, message);
                }
            }
            if (!z) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DraftAIGCRestoreHandler@cf1d.restore$2");
                return unit;
            }
            C546620LcC c546620LcC2 = this.LLILLJJLI;
            AwemeDraft awemeDraft2 = this.LLILLL;
            AIGCCreationModel aIGCCreationModel = this.LLILZ;
            this.LL = 1;
            if (c546620LcC2.LIZIZ(awemeDraft2, aIGCCreationModel, this) == objLJFF) {
                C1C7U.LIZIZ("DraftAIGCRestoreHandler@cf1d.restore$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftAIGCRestoreHandler@cf1d.restore$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
