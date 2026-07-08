package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.df.api.survey.SearchSurveyServiceDefaultImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QF4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QF4 {
    public static final C0QF4 LIZ = new C0QF4();
    public static volatile ISearchSurvey LIZIZ = LIZ(true);
    public static Function2<? super Integer, ? super Throwable, Unit> LIZJ;

    public static ISearchSurvey LIZ(boolean z) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            try {
                c098200Yq = (ISearchSurvey) PluggableExtentionKt.pluggableSpi$default(ISearchSurvey.class, false, false, false, 14, null);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            ISearchSurvey iSearchSurvey = (ISearchSurvey) c098200Yq;
            if (iSearchSurvey != null) {
                try {
                    c098200Yq2 = Boolean.valueOf(iSearchSurvey.LIZ());
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                Boolean bool = Boolean.FALSE;
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = bool;
                }
                if (((Boolean) c098200Yq2).booleanValue()) {
                    return iSearchSurvey;
                }
            }
            if (z) {
                try {
                    C673090Qah.LIZIZ.LIZ();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
            Function2<? super Integer, ? super Throwable, Unit> function2 = LIZJ;
            if (function2 != null) {
                function2.invoke(1101001, null);
            }
            return new SearchSurveyServiceDefaultImpl();
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            Function2<? super Integer, ? super Throwable, Unit> function22 = LIZJ;
            if (function22 != null) {
                function22.invoke(1101002, th4);
            }
            return new SearchSurveyServiceDefaultImpl();
        }
    }
}
