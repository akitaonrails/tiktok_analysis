package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097690eff extends C1537070q6L {
    public final /* synthetic */ Function1<String, Unit> LIZ;
    public final /* synthetic */ Function1<String, Unit> LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1097690eff(Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }

    @Override // X.C1537070q6L
    public final void LIZJ(String str, String str2, C1537080q6M c1537080q6M) {
        this.LIZIZ.invoke(c1537080q6M.LIZ);
    }

    @Override // X.C1537070q6L
    public final void LIZLLL(String str, String str2, InterfaceC1105930esx interfaceC1105930esx) {
        this.LIZ.invoke(str);
    }
}
