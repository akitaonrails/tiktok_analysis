package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207390hWb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1207520hWo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1207390hWb(C1207520hWo c1207520hWo, boolean z, long j, Activity activity) {
        super(0);
        this.LL = c1207520hWo;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        C1207400hWc c1207400hWc = C1207400hWc.LIZ;
        C1207520hWo c1207520hWo = this.LL;
        String str3 = null;
        if (c1207520hWo != null) {
            str = c1207520hWo.LIZLLL;
            str3 = c1207520hWo.LIZ;
        } else {
            str = null;
        }
        if (c1207520hWo == null || (str2 = c1207520hWo.LIZIZ) == null) {
            str2 = "";
        }
        boolean z = this.LLILLJJLI;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLL;
        C1207520hWo c1207520hWo2 = this.LL;
        boolean z2 = c1207520hWo2 != null ? c1207520hWo2.LJFF : false;
        C020W c020w = new C020W(this.LLILZ, c1207520hWo2, 63);
        c1207400hWc.getClass();
        C1207400hWc.LJIIJJI(str, str3, str2, z ? 1 : 0, jCurrentTimeMillis, z2, c020w);
        return Unit.LIZ;
    }
}
