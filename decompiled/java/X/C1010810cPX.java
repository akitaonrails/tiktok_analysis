package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0cPX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010810cPX {
    public static C1010790cPV LIZ(InterfaceC1010860cPc interfaceC1010860cPc) {
        LifecycleCoroutineScope lifecycleScope;
        View view;
        final C1010790cPV c1010790cPV = new C1010790cPV(interfaceC1010860cPc);
        ((ArrayList) c1010790cPV.LLILZLL).clear();
        if (c1010790cPV.LLILZ == null && (view = interfaceC1010860cPc.getView()) != null && !view.isAttachedToWindow()) {
            View view2 = interfaceC1010860cPc.getView();
            if (view2 != null) {
                view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0cPY
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view3) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view3) {
                        C19EG c19egLIZIZ;
                        LifecycleCoroutineScope lifecycleScope2;
                        C1010790cPV c1010790cPV2 = c1010790cPV;
                        SAFHelper sAFHelper = SAFHelper.LIZ;
                        Context contextLIZ = c1010790cPV2.LL.LIZ();
                        if (contextLIZ != null) {
                            c19egLIZIZ = C1388190mED.LIZIZ(contextLIZ);
                        } else {
                            c19egLIZIZ = null;
                        }
                        sAFHelper.getClass();
                        c1010790cPV2.LLILZ = SAFHelper.LJIJI(view3, c19egLIZIZ);
                        C1010790cPV c1010790cPV3 = c1010790cPV;
                        LifecycleOwner lifecycleOwner = c1010790cPV3.LLILZ;
                        if (lifecycleOwner != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            C23250099c.LIZLLL(lifecycleScope2, null, null, new C860090Xod(c1010790cPV3, null), 3);
                        }
                        View view4 = c1010790cPV.LL.getView();
                        if (view4 != null) {
                            view4.removeOnAttachStateChangeListener(this);
                        }
                    }
                });
            }
        } else {
            LifecycleOwner lifecycleOwner = c1010790cPV.LLILZ;
            if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                C23250099c.LIZLLL(lifecycleScope, null, null, new C860090Xod(c1010790cPV, null), 3);
                return c1010790cPV;
            }
        }
        return c1010790cPV;
    }
}
