package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;

/* JADX INFO: renamed from: X.0LEH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LEH implements C0LH5 {
    public final /* synthetic */ C19EG LIZ;
    public final /* synthetic */ C0LH5 LIZIZ;
    public final /* synthetic */ Function0<Unit> LIZJ;
    public final /* synthetic */ Function2<String[], int[], Unit> LIZLLL;

    @Override // X.C0LH5
    public final void LIZ(int[] iArr, String[] strArr) {
        C533800Kwc.LIZLLL(strArr, iArr, this.LIZ, "shoot_page", null);
        if (C533930Kwp.LIZ(iArr)) {
            this.LIZIZ.LIZ(iArr, strArr);
            this.LIZJ.invoke();
        } else {
            this.LIZLLL.invoke(strArr, iArr);
        }
    }

    public C0LEH(C19EG c19eg, C0LH5 c0lh5, Function0 function0, AFwS291S0000000_8 aFwS291S0000000_8) {
        this.LIZ = c19eg;
        this.LIZIZ = c0lh5;
        this.LIZJ = function0;
        this.LIZLLL = aFwS291S0000000_8;
    }
}
