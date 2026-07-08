package X;

import android.content.Context;
import android.os.CancellationSignal;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20443814z6 implements InterfaceC20433014xM {
    public final Context LIZIZ;

    public C20443814z6(Context context) {
        this.LIZIZ = context;
    }

    public final Object LIZ(Context context, C13XD c13xd, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c2252611DEt.LJJII(new AwS609S0100000_30(cancellationSignal, 27));
        LIZIZ(context, c13xd, cancellationSignal, new ExecutorC20444814zG(), new C20443914z7(c2252611DEt));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Object LIZJ(Context context, C20444114z9 c20444114z9, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        CancellationSignal cancellationSignal = new CancellationSignal();
        c2252611DEt.LJJII(new AwS609S0100000_30(cancellationSignal, 28));
        LIZLLL(context, c20444114z9, cancellationSignal, new ExecutorC20444814zG(), new C20444014z8(c2252611DEt));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final void LIZIZ(Context context, C13XD c13xd, CancellationSignal cancellationSignal, ExecutorC20444814zG executorC20444814zG, C20443914z7 c20443914z7) {
        InterfaceC20443714z5 interfaceC20443714z5LIZ = C809880Vpq.LIZ(this.LIZIZ);
        if (interfaceC20443714z5LIZ == null) {
            c20443914z7.LIZ(new C20444614zE("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC20443714z5LIZ.onCreateCredential(context, c13xd, cancellationSignal, executorC20444814zG, c20443914z7);
        }
    }

    public final void LIZLLL(Context context, C20444114z9 c20444114z9, CancellationSignal cancellationSignal, ExecutorC20444814zG executorC20444814zG, C20444014z8 c20444014z8) {
        InterfaceC20443714z5 interfaceC20443714z5LIZ = C809880Vpq.LIZ(this.LIZIZ);
        if (interfaceC20443714z5LIZ == null) {
            c20444014z8.LIZ(new C20442914yx("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            interfaceC20443714z5LIZ.onGetCredential(context, c20444114z9, cancellationSignal, executorC20444814zG, c20444014z8);
        }
    }
}
