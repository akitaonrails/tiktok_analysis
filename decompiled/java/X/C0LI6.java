package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0LI6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.TextToImageEditScene$registerComponents$2$5$1$generateCover$2", f = "TextToImageEditScene.kt", l = {289, 289, 289}, m = "invokeSuspend")
public final class C0LI6 extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ TextToImageEditScene LLILLL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LI6(TextToImageEditScene textToImageEditScene, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, InterfaceC1364105Vn<? super C0LI6> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = textToImageEditScene;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LI6(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TextToImageEditScene@591c.registerComponents$2$5$1$generateCover$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th = (Throwable) this.LL;
                C155000ia.LIZIZ(obj);
                throw th;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            try {
                try {
                    C573960MfC.LIZ(C0CHQ.LIZ().LJIIJ(), this.LLILLL.getEditModel(), this.LLILLL.getEditModel().getCreationId(), 5, null, 24);
                    Function1<InterfaceC1364105Vn<? super Unit>, Object> function1 = this.LLILZ;
                    this.LLILLJJLI = 1;
                    if (function1.invoke(this) == objLJFF) {
                        C1C7U.LIZIZ("TextToImageEditScene@591c.registerComponents$2$5$1$generateCover$2");
                        return objLJFF;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("text2image error ");
                    sbLIZ.append(e);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                    Function1<InterfaceC1364105Vn<? super Unit>, Object> function12 = this.LLILZ;
                    this.LLILLJJLI = 2;
                    if (function12.invoke(this) == objLJFF) {
                        C1C7U.LIZIZ("TextToImageEditScene@591c.registerComponents$2$5$1$generateCover$2");
                        return objLJFF;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                Function1<InterfaceC1364105Vn<? super Unit>, Object> function13 = this.LLILZ;
                this.LL = th2;
                this.LLILLJJLI = 3;
                if (function13.invoke(this) == objLJFF) {
                    C1C7U.LIZIZ("TextToImageEditScene@591c.registerComponents$2$5$1$generateCover$2");
                    return objLJFF;
                }
                throw th2;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageEditScene@591c.registerComponents$2$5$1$generateCover$2");
        return unit;
    }
}
