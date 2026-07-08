package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$setUploadingStatus$1", f = "ReplaceMusicServiceImpl.kt", l = {509}, m = "invokeSuspend")
public final class C05DT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReplaceMusicServiceImpl LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DT(ReplaceMusicServiceImpl replaceMusicServiceImpl, InterfaceC1364105Vn<? super C05DT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = replaceMusicServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ReplaceMusicServiceImpl replaceMusicServiceImpl;
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.setUploadingStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    this.LL = 1;
                    if (AnonymousClass0958.LIZIZ(120000L, this) == objLJFF) {
                        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.setUploadingStatus$1");
                        return objLJFF;
                    }
                }
                C05DU c05du = this.LLILLJJLI.LJIILJJIL;
                if (c05du != null) {
                    c05du.run();
                }
                replaceMusicServiceImpl = this.LLILLJJLI;
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                replaceMusicServiceImpl = this.LLILLJJLI;
                replaceMusicServiceImpl.LJIILL = null;
            }
            replaceMusicServiceImpl.LJIILL = null;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.setUploadingStatus$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJIILL = null;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
