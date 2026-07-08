package X;

import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887800zE2 {
    public FrameLayout LIZ;
    public Function2<? super Map<String, String>, ? super String, Unit> LIZIZ;
    public Function0<Unit> LIZJ;
    public Function0<Unit> LIZLLL;
    public Function0<? extends PageFinder> LJ;

    public final C1887790zE1 LIZ() {
        C1887790zE1 c1887790zE1 = new C1887790zE1();
        FrameLayout frameLayout = this.LIZ;
        if (frameLayout == null) {
            return null;
        }
        c1887790zE1.LL = frameLayout;
        c1887790zE1.LLILLL = this.LIZIZ;
        c1887790zE1.LLILZ = this.LIZJ;
        c1887790zE1.LLILZIL = this.LIZLLL;
        c1887790zE1.LLILZLL = this.LJ;
        return c1887790zE1;
    }
}
