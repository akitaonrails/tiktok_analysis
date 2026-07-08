package X;

import com.ss.android.ugc.aweme.main.assems.MainActivityBusinessAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1589940rTc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainActivityBusinessAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589940rTc(MainActivityBusinessAssem mainActivityBusinessAssem) {
        super(0);
        this.LL = mainActivityBusinessAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MainActivityBusinessAssem mainActivityBusinessAssem = this.LL;
        mainActivityBusinessAssem.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(mainActivityBusinessAssem);
        if (c19egLIZ != null && !c19egLIZ.isDestroyed() && mainActivityBusinessAssem.LLILZ && !C1074300e3w.LIZ(c19egLIZ).wQ2()) {
            C1591880rWk.LIZIZ.LJIIZILJ().LIZIZ(c19egLIZ);
            mainActivityBusinessAssem.LLILZ = false;
        }
        return Unit.LIZ;
    }
}
