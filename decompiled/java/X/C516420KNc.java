package X;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516420KNc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C516200KMg LL;
    public final /* synthetic */ Throwable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516420KNc(C516200KMg c516200KMg, Throwable th) {
        super(0);
        this.LL = c516200KMg;
        this.LLILLJJLI = th;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        WeakReference<Activity> weakReference;
        C0KJK c0kjk = this.LL.LIZLLL;
        C501540Jlg.LIZJ((c0kjk == null || (weakReference = c0kjk.LIZJ) == null) ? null : weakReference.get(), this.LLILLJJLI);
        return Unit.LIZ;
    }
}
