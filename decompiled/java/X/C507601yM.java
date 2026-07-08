package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$doUpload$2$imageAuthKey$1", f = "ReportSession.kt", l = {130}, m = "invokeSuspend")
public final class C507601yM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1735750vGn>, Object> {
    public int LL;
    public final /* synthetic */ C508401yU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507601yM(C508401yU c508401yU, InterfaceC1364105Vn<? super C507601yM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c508401yU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C507601yM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportSession@cd97.doUpload$2$imageAuthKey$1");
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
            C508401yU c508401yU = this.LLILLJJLI;
            this.LL = 1;
            obj = c508401yU.LJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReportSession@cd97.doUpload$2$imageAuthKey$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ReportSession@cd97.doUpload$2$imageAuthKey$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1735750vGn> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
