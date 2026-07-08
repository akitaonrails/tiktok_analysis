package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.commercialize.promote.replace.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0m3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381360m3C implements InterfaceC1387770mDX {
    public static final C1381320m38 LIZIZ = new C1381320m38(AFwS259S0000000_21.get$arr$(467), AFwS259S0000000_21.get$arr$(468));
    public final C1381370m3D LIZ = new InterfaceC1381380m3E() { // from class: X.0m3D
        @Override // X.InterfaceC1381380m3E
        public final void onEvent() {
            Activity activityLIZIZ;
            Activity activityLIZ;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
                return;
            }
            activityLIZ.finish();
        }
    };

    @Override // X.InterfaceC1387770mDX
    public final void LIZ(String str, Map<String, ? extends Object> map, View view, Activity activity) {
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZLLL(Activity activity) {
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZIZ(Lifecycle lifecycle) {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ(this.LIZ);
        }
    }

    @Override // X.InterfaceC1387770mDX
    public final void LIZJ(Context context) {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZIZ(this.LIZ);
        }
    }
}
