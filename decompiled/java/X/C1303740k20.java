package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS258S0000000_20;

/* JADX INFO: renamed from: X.0k20, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303740k20 {
    public final long LIZ;
    public final Function0<Unit> LIZIZ;
    public AnonymousClass0956 LIZJ;
    public long LIZLLL;
    public boolean LJ;

    public final void LIZ(Context context) {
        InterfaceC1670800ta2 interfaceC1670800ta2LIZIZ;
        InterfaceC214902198i interfaceC214902198iLIZ;
        Object objLIZ;
        Fragment fragment;
        LifecycleCoroutineScope lifecycleScope;
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (context != null && (interfaceC1670800ta2LIZIZ = C1388190mED.LIZIZ(context)) != null && (interfaceC1670800ta2LIZIZ instanceof C199Y) && (interfaceC214902198iLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2LIZIZ)) != null && (interfaceC214902198iLIZ instanceof C0J5E)) {
            InterfaceC1670800ta2 interfaceC1670800ta2LIZIZ2 = C1388190mED.LIZIZ(context);
            if (interfaceC1670800ta2LIZIZ2 != null && (interfaceC1670800ta2LIZIZ2 instanceof C199Y) && (objLIZ = C20629915o1.LIZ((InterfaceC20622815ms) interfaceC1670800ta2LIZIZ2)) != null && (objLIZ instanceof C0J5E) && (fragment = (Fragment) objLIZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
                anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZ, null, new C1303700k1w(this, null), 2);
            }
        } else {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1303720k1y(this, null), 3);
        }
        this.LIZJ = anonymousClass0956LIZLLL;
        if (anonymousClass0956LIZLLL != null) {
            anonymousClass0956LIZLLL.LJII(AFwS258S0000000_20.get$arr$(10));
        }
    }

    public C1303740k20(long j, Function0<Unit> function0) {
        this.LIZ = j;
        this.LIZIZ = function0;
        this.LIZLLL = (j * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - System.currentTimeMillis();
    }
}
