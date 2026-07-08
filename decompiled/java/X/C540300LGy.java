package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LGy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540300LGy implements C0LH5 {
    public final /* synthetic */ C19EG LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ C0LH5 LIZJ;
    public final /* synthetic */ Function0<Unit> LIZLLL;
    public final /* synthetic */ Function0<Unit> LJ;
    public final /* synthetic */ Function2<String[], int[], Unit> LJFF;

    @Override // X.C0LH5
    public final void LIZ(int[] iArr, String[] strArr) {
        C533800Kwc.LIZLLL(strArr, iArr, this.LIZ, this.LIZIZ, null);
        if (C533930Kwp.LIZ(iArr)) {
            this.LIZJ.LIZ(iArr, strArr);
            this.LIZLLL.invoke();
            this.LJ.invoke();
            return;
        }
        this.LJFF.invoke(strArr, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C540300LGy(C19EG c19eg, String str, C0LH5 c0lh5, Function0<Unit> function0, Function0<Unit> function02, Function2<? super String[], ? super int[], Unit> function2) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = c0lh5;
        this.LIZLLL = function0;
        this.LJ = function02;
        this.LJFF = function2;
    }
}
