package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jv6.a;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C319400Cfa {
    public static final C319400Cfa LIZ = new C319400Cfa();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5362));
    public static final C054G LIZJ;
    public static final AtomicReference<EnumC319440Cfe> LIZLLL;

    static {
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
        LIZJ = c054gLIZ;
        LIZLLL = new AtomicReference<>(EnumC319440Cfe.UNKNOWN);
        if (new AtomicBoolean(false).compareAndSet(false, true)) {
            C23250099c.LIZLLL(c054gLIZ, null, null, new C314770CVn(null), 3);
        }
    }

    public static boolean LIZJ() {
        Object c098200Yq;
        try {
            IPluginService iPluginService = (IPluginService) LIZIZ.getValue();
            c098200Yq = Boolean.valueOf(iPluginService != null ? iPluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_social_fi") : false);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static void LIZIZ(Context context) {
        if (context == null) {
            try {
                C844470XAv.LIZ.getClass();
                context = C844470XAv.LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        a.install(context);
        for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
            if ((activityLIZIZ instanceof Activity) && activityLIZIZ != null) {
                a.LIZLLL(activityLIZIZ);
            }
        }
        LIZLLL.set(EnumC319440Cfe.INSTALLED);
    }

    public static void LIZ(C319400Cfa c319400Cfa, Context context, EnumC313670CRh enumC313670CRh) {
        c319400Cfa.getClass();
        C23250099c.LIZLLL(LIZJ, null, null, new C319420Cfc(enumC313670CRh, null, context, null), 3);
    }
}
