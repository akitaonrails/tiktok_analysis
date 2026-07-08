package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YRZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YRZ implements InterfaceC874250YRj<Object> {
    public final /* synthetic */ C874160YRa LIZ;
    public final /* synthetic */ AbstractC874240YRi<Object> LIZIZ;
    public final /* synthetic */ InterfaceC874250YRj<Object> LIZJ;
    public final /* synthetic */ Object LIZLLL;

    @Override // X.InterfaceC874250YRj
    public final void LIZ(int i) {
        this.LIZJ.LIZ(i);
    }

    @Override // X.InterfaceC874250YRj
    public final void onSuccess(Object obj) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success: ");
        sbLIZ.append(obj);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMMediaUploadScheduler", C2188811AlT.LIZIZ(sbLIZ), 4);
        Function1<String, Unit> function1 = this.LIZIZ.LIZ().LIZJ;
        if (function1 != null) {
            function1.invoke(this.LIZIZ.LIZIZ());
        }
        this.LIZJ.onSuccess(obj);
        this.LIZ.LIZJ.remove(this.LIZLLL);
        this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC874250YRj
    public final void LIZIZ(int i, Exception exc) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fail code: ");
        sbLIZ.append(i);
        sbLIZ.append(", e: ");
        sbLIZ.append(exc);
        c868780Y6iLIZLLL.LJIIIIZZ("IMMediaUploadScheduler", C2188811AlT.LIZIZ(sbLIZ), null);
        InterfaceC1631620sYq<String, Integer, Exception, Unit> interfaceC1631620sYq = this.LIZIZ.LIZ().LIZLLL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(this.LIZIZ.LIZIZ(), Integer.valueOf(i), exc);
        }
        this.LIZJ.LIZIZ(i, exc);
        this.LIZ.LIZJ.remove(this.LIZLLL);
        this.LIZ.LIZJ();
    }

    public C0YRZ(C874160YRa c874160YRa, C0YRY c0yry, C0YQZ c0yqz, AbstractRunnableC874200YRe abstractRunnableC874200YRe) {
        this.LIZ = c874160YRa;
        this.LIZIZ = c0yry;
        this.LIZJ = c0yqz;
        this.LIZLLL = abstractRunnableC874200YRe;
    }
}
