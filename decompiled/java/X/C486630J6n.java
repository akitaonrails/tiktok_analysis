package X;

import android.view.Window;
import android.view.WindowManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0J6n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C486630J6n extends C09AY implements Function1<Window, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1262850iy3 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C486630J6n(boolean z, int i, int i2, C1262850iy3 c1262850iy3) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c1262850iy3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Window window) {
        int i;
        int iLIZIZ;
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.LL ? (i = this.LLILLJJLI - this.LLILLL) > (iLIZIZ = this.LLILZ.LLJJI) : (i = this.LLILLJJLI - this.LLILLL) < (iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154)))) {
            i = iLIZIZ;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set window height: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        attributes.height = i;
        return Unit.LIZ;
    }
}
