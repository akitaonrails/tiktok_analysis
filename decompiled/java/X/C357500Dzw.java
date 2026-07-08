package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dzw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357500Dzw implements InterfaceC357510Dzx {
    public final Function1<Float, Unit> LIZ;
    public float LIZIZ;
    public boolean LIZJ;
    public AnonymousClass0956 LIZLLL;
    public final /* synthetic */ C357450Dzr LJ;

    @Override // X.InterfaceC357510Dzx
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC357510Dzx
    public final void onStart() {
        C357450Dzr c357450Dzr = this.LJ;
        this.LIZLLL = C23250099c.LIZLLL(c357450Dzr.LJIIJ, null, null, new C357490Dzv(c357450Dzr, this, null), 3);
    }

    @Override // X.InterfaceC357510Dzx
    public final void LIZ(boolean z) {
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Template_Consume: I2VUpdateProgressCallback UpdateProgress lastProgress=");
        sbLIZ.append(this.LIZIZ);
        C201955140j.LIZLLL(c563650M8t, "TemplateMagicApplyTask", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            this.LIZ.invoke(Float.valueOf(1.0f));
        }
        AnonymousClass0956 anonymousClass0956 = this.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZJ = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C357500Dzw(C357450Dzr c357450Dzr, Function1<? super Float, Unit> function1) {
        this.LJ = c357450Dzr;
        this.LIZ = function1;
    }
}
