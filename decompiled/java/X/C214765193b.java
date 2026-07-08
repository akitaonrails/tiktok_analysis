package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.193b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214765193b extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C193Z LL;
    public final /* synthetic */ C214764193a LLILLJJLI;
    public final /* synthetic */ AbstractC1738640vLS LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C214765193b(C193Z c193z, C214764193a c214764193a, AbstractC1738640vLS abstractC1738640vLS, ViewGroup viewGroup, boolean z, int i) {
        super(0);
        this.LL = c193z;
        this.LLILLJJLI = c214764193a;
        this.LLILLL = abstractC1738640vLS;
        this.LLILZ = viewGroup;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        int i;
        String strValueOf;
        int i2 = this.LL.LIZIZ;
        if (i2 > 0) {
            View viewFindViewById = this.LLILLJJLI.LLJILJILJ.findViewById(i2);
            if (viewFindViewById == null) {
                try {
                    strValueOf = C1664590tQ1.LJIIIZ(this.LLILLJJLI).getResources().getResourceName(this.LL.LIZIZ);
                } catch (Resources.NotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    strValueOf = String.valueOf(this.LL.LIZIZ);
                }
                throw new IllegalArgumentException("targetSlotView(id=" + strValueOf + ") not found in cellContainer(" + this.LLILZ);
            }
            this.LLILLJJLI.Z4(this.LLILLL.itemView, viewFindViewById, this.LLILZ);
        } else if (!this.LLILZIL || (i = this.LLILZLL) < 0) {
            this.LLILZ.addView(this.LLILLL.itemView);
        } else {
            this.LLILZ.addView(this.LLILLL.itemView, i);
        }
        return Unit.LIZ;
    }
}
