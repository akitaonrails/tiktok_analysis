package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zsj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C913590Zsj extends C09AY implements Function1<C913600Zsk, Unit> {
    public C913590Zsj() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C913600Zsk c913600Zsk) {
        View view;
        View view2;
        C913600Zsk c913600Zsk2 = c913600Zsk;
        C913540Zse.LIZ.getClass();
        if (c913600Zsk2.LIZJ != null && c913600Zsk2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShareUndoEvent toast show. toast.decorView:");
            WeakReference<View> weakReference = C913540Zse.LIZLLL;
            Context context = null;
            if (weakReference != null) {
                view = weakReference.get();
            } else {
                view = null;
            }
            sbLIZ.append(view);
            sbLIZ.append(", context: ");
            WeakReference<View> weakReference2 = C913540Zse.LIZLLL;
            if (weakReference2 != null && (view2 = weakReference2.get()) != null) {
                context = view2.getContext();
            }
            sbLIZ.append(context);
            C2188811AlT.LIZIZ(sbLIZ);
            long j = c913600Zsk2.LIZIZ;
            Handler handlerLIZJ = C799570VYd.LIZJ();
            RunnableC913480ZsY runnableC913480ZsY = C913540Zse.LIZIZ;
            handlerLIZJ.removeCallbacks(runnableC913480ZsY);
            C786410Ut5.LJLIIL(j, C799570VYd.LIZJ(), runnableC913480ZsY);
        }
        return Unit.LIZ;
    }
}
