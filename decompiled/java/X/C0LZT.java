package X;

import com.ss.android.ugc.aweme.aigc.adaptation.creation.wrapper.AIGCWorkflowCreationService;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LZT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.workflow.wrapper.I2VEffectWorkflowManagerAdapter$cancelTaskByTaskId$1", f = "I2VEffectWorkflowManagerAdapter.kt", l = {229, 231}, m = "invokeSuspend")
public final class C0LZT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LZT(String str, InterfaceC1364105Vn<? super C0LZT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LZT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I2VEffectWorkflowManagerAdapter@87e2.cancelTaskByTaskId$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("I2VEffectWorkflowManagerAdapter@87e2.cancelTaskByTaskId$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C545090LZj c545090LZj = C545090LZj.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = c545090LZj.LJ(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("I2VEffectWorkflowManagerAdapter@87e2.cancelTaskByTaskId$1");
                return objLJFF;
            }
        }
        int i2 = C0LZS.LIZ[((C0LZU) obj).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new C1954807lC();
                }
            } else {
                AIGCWorkflowCreationService aIGCWorkflowCreationService = C545090LZj.LIZJ;
                if (aIGCWorkflowCreationService != null) {
                    String str2 = this.LLILLJJLI;
                    this.LL = 2;
                    if (aIGCWorkflowCreationService.LJIJJLI(str2, this) == objLJFF) {
                        C1C7U.LIZIZ("I2VEffectWorkflowManagerAdapter@87e2.cancelTaskByTaskId$1");
                        return objLJFF;
                    }
                }
            }
        } else {
            ICreationAsyncTaskManager iCreationAsyncTaskManager = C545090LZj.LIZIZ;
            if (iCreationAsyncTaskManager != null) {
                iCreationAsyncTaskManager.LJJIII(this.LLILLJJLI);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("I2VEffectWorkflowManagerAdapter@87e2.cancelTaskByTaskId$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
