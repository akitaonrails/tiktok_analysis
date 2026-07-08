package X;

import Y.AgS199S0200000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoProcessHandler$observeResultDownload$2", f = "AILivePhotoRestoreTaskHandler.kt", l = {200}, m = "invokeSuspend")
public final class C557140LtA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0LSZ LLILLJJLI;
    public final /* synthetic */ C557210LtH LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557140LtA(C0LSZ c0lsz, C557210LtH c557210LtH, InterfaceC1364105Vn<? super C557140LtA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lsz;
        this.LLILLL = c557210LtH;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557140LtA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL;
        C1C7U.LIZ("AILivePhotoProcessHandler@a1bc.observeResultDownload$2");
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
            String str = this.LLILLJJLI.LJIIIIZZ;
            ICreationAsyncTaskManager iCreationAsyncTaskManager = (ICreationAsyncTaskManager) this.LLILLL.LIZJ.getValue();
            if (iCreationAsyncTaskManager != null && (interfaceC346201WaLJJJJL = iCreationAsyncTaskManager.LJJJJL(str)) != null) {
                AgS199S0200000_8 agS199S0200000_8 = new AgS199S0200000_8(this.LLILLL, this.LLILLJJLI, 0);
                this.LL = 1;
                if (interfaceC346201WaLJJJJL.collect(agS199S0200000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("AILivePhotoProcessHandler@a1bc.observeResultDownload$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AILivePhotoProcessHandler@a1bc.observeResultDownload$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
