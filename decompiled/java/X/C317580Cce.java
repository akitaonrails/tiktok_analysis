package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.repo.CelebrationMaterialRepo$downloadAwemeParallel$2$downloadJobs$1$1", f = "CelebrationMaterialRepo.kt", l = {423, 148}, m = "invokeSuspend")
public final class C317580Cce extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public InterfaceC1337805Lk LL;
    public ForwardMedia LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ InterfaceC1337805Lk LLILZIL;
    public final /* synthetic */ ForwardMedia LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317580Cce(InterfaceC1337805Lk interfaceC1337805Lk, ForwardMedia forwardMedia, int i, InterfaceC1364105Vn<? super C317580Cce> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = interfaceC1337805Lk;
        this.LLILZLL = forwardMedia;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317580Cce(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC1337805Lk interfaceC1337805Lk;
        ForwardMedia forwardMedia;
        int i;
        C1C7U.LIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2$downloadJobs$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LLILZ;
        try {
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            interfaceC1337805Lk = this.LL;
                            C155000ia.LIZIZ(obj);
                            Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
                            interfaceC1337805Lk.release();
                            C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2$downloadJobs$1$1");
                            return boolValueOf;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.LLILLL;
                    forwardMedia = this.LLILLJJLI;
                    interfaceC1337805Lk = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    interfaceC1337805Lk = this.LLILZIL;
                    forwardMedia = this.LLILZLL;
                    i = this.LLIZ;
                    this.LL = interfaceC1337805Lk;
                    this.LLILLJJLI = forwardMedia;
                    this.LLILLL = i;
                    this.LLILZ = 1;
                    if (interfaceC1337805Lk.LIZ(this) == objLJFF) {
                        C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2$downloadJobs$1$1");
                        return objLJFF;
                    }
                }
                C566620MKe c566620MKe = C566620MKe.LIZ;
                this.LL = interfaceC1337805Lk;
                this.LLILLJJLI = null;
                this.LLILZ = 2;
                obj = c566620MKe.LJ(i, forwardMedia, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2$downloadJobs$1$1");
                    return objLJFF;
                }
                Boolean boolValueOf2 = Boolean.valueOf(((Boolean) obj).booleanValue());
                interfaceC1337805Lk.release();
                C1C7U.LIZIZ("CelebrationMaterialRepo@27f7.downloadAwemeParallel$2$downloadJobs$1$1");
                return boolValueOf2;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                interfaceC1337805Lk.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
