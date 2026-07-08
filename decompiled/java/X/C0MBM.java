package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MBM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MBM implements InterfaceC574560MgA {
    public final /* synthetic */ Function2<Boolean, String, Unit> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C571560MbK LIZJ;
    public final /* synthetic */ long LIZLLL;
    public final /* synthetic */ C259800zU<String> LJ;
    public final /* synthetic */ Function1<Float, Unit> LJFF;

    @Override // X.InterfaceC574560MgA
    public final void onCompileDone() {
        ((HashMap) C0MBN.LIZ).put(this.LIZJ.LIZ.getCreationId(), Long.valueOf(System.currentTimeMillis() - this.LIZLLL));
        C571560MbK.LJFF.put(this.LJ.element, this.LIZIZ);
        this.LIZ.invoke(Boolean.TRUE, this.LIZIZ);
    }

    @Override // X.InterfaceC574560MgA
    public final void onCompileProgress(float f) {
        Function1<Float, Unit> function1 = this.LJFF;
        if (function1 != null) {
            function1.invoke(Float.valueOf(f));
        }
    }

    @Override // X.InterfaceC574560MgA
    public final void onCompileError(int i, int i2, float f, String str) {
        this.LIZ.invoke(Boolean.FALSE, this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0MBM(Function2<? super Boolean, ? super String, Unit> function2, String str, C571560MbK c571560MbK, long j, C259800zU<String> c259800zU, Function1<? super Float, Unit> function1) {
        this.LIZ = function2;
        this.LIZIZ = str;
        this.LIZJ = c571560MbK;
        this.LIZLLL = j;
        this.LJ = c259800zU;
        this.LJFF = function1;
    }
}
