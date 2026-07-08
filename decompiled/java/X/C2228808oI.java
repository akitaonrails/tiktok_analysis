package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inspector.WindowInspector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08oI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2228808oI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2228808oI(Context context, String str) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List globalWindowViews;
        Object objPrevious;
        View view;
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ != null) {
            String str = this.LLILLJJLI;
            try {
                Window window = activityLIZ.getWindow();
                View decorView = window != null ? window.getDecorView() : null;
                try {
                    globalWindowViews = Build.VERSION.SDK_INT >= 29 ? WindowInspector.getGlobalWindowViews() : C13BV.INSTANCE;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    globalWindowViews = C13BV.INSTANCE;
                }
                ListIterator listIterator = globalWindowViews.listIterator(globalWindowViews.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    View view2 = (View) objPrevious;
                    if (view2 != decorView && view2.isAttachedToWindow() && view2.getWindowVisibility() == 0 && C1388190mED.LIZ(view2.getContext()) == activityLIZ) {
                        break;
                    }
                }
                view = (View) objPrevious;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            C1389890mGx c1389890mGx = view != null ? new C1389890mGx(view) : new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
