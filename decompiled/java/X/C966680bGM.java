package X;

import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bGM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966680bGM extends C09AY implements Function0<C966920bGk> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966680bGM(C966020bFI c966020bFI) {
        super(0);
        this.LL = c966020bFI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C966920bGk invoke() {
        C966920bGk c966920bGk = new C966920bGk(new C972570bPr(this.LL), new C966670bGL(this.LL), this.LL.LIZIZ);
        C966690bGN c966690bGN = new C966690bGN(c966920bGk);
        C969310bKb c969310bKb = C969310bKb.LIZLLL;
        if (Intrinsics.LJFF(c969310bKb.LIZIZ, Looper.myLooper())) {
            c966690bGN.invoke();
            return c966920bGk;
        }
        c969310bKb.LIZ(new RunnableC966320bFm(c966690bGN));
        return c966920bGk;
    }
}
