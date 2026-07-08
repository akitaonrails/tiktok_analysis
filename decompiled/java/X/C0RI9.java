package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RI9, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RI9 extends C09AY implements Function0<Long> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ ReusedUIContentAssem<? extends C03H5> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RI9(BaseCellContentComponent baseCellContentComponent, ReusedUIContentAssem reusedUIContentAssem) {
        super(0);
        this.LL = baseCellContentComponent;
        this.LLILLJJLI = reusedUIContentAssem;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.bytedance.assem.arch.reused.ReusedAssem, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = (C0BX9.LIZ() || (C305550ByL.LIZLLL() && C104100aN.LIZ().LJIILIIL())) ? false : true;
        C723830SaL.LIZJ(this.LL, C13LE.LIZ(this.LLILLJJLI.getClass()), z);
        if (z) {
            return null;
        }
        return Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
    }
}
