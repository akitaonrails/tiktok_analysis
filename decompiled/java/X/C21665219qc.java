package X;

import Y.ARunnableS21S0500000_33;
import android.graphics.Matrix;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21665219qc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C21665419qe LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Matrix LLILLL;
    public final /* synthetic */ EnumC375190EnN LLILZ;
    public final /* synthetic */ Float LLILZIL;
    public final /* synthetic */ C21665719qh LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21665219qc(C21665419qe c21665419qe, boolean z, Matrix matrix, EnumC375190EnN enumC375190EnN, Float f, C21665719qh c21665719qh) {
        super(0);
        this.LL = c21665419qe;
        this.LLILLJJLI = z;
        this.LLILLL = matrix;
        this.LLILZ = enumC375190EnN;
        this.LLILZIL = f;
        this.LLILZLL = c21665719qh;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        HandlerHook.viewPost(this.LL.LLLLLLL(), new ARunnableS21S0500000_33(this.LLILLL, this.LL, this.LLILZLL, this.LLILZ, this.LLILZIL, 0));
        if (!this.LLILLJJLI && this.LLILLL != null) {
            this.LL.LLLLLLLLLL().setImageMatrix(new Matrix(this.LLILLL));
        }
        C21665419qe c21665419qe = this.LL;
        c21665419qe.LLLIL = true;
        c21665419qe.LLLLLZ();
        return Unit.LIZ;
    }
}
