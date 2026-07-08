package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$uploadScreenshots$2$1$1", f = "ReportSession.kt", l = {213}, m = "invokeSuspend")
public final class C506901yF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C1735750vGn LLILLJJLI;
    public final /* synthetic */ File LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506901yF(C1735750vGn c1735750vGn, File file, InterfaceC1364105Vn<? super C506901yF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1735750vGn;
        this.LLILLL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C506901yF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportSession@cd97.uploadScreenshots$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1735740vGm c1735740vGm = C1735740vGm.LIZ;
                C1735750vGn c1735750vGn = this.LLILLJJLI;
                String absolutePath = this.LLILLL.getAbsolutePath();
                this.LL = 1;
                c1735740vGm.getClass();
                obj = C1735740vGm.LIZ(c1735750vGn, absolutePath, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ReportSession@cd97.uploadScreenshots$2$1$1");
                    return objLJFF;
                }
            }
            String str = (String) obj;
            this.LLILLL.delete();
            C1C7U.LIZIZ("ReportSession@cd97.uploadScreenshots$2$1$1");
            return str;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.delete();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
