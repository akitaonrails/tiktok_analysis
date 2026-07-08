package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import java.util.concurrent.atomic.AtomicBoolean;
import jv6.a;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Qaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673070Qaf {
    public static volatile C0QG9 LIZIZ;
    public static boolean LIZJ;
    public static final C01GW LJ;
    public static final C673070Qaf LIZ = new C673070Qaf();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    static {
        LIZIZ = C0QG9.LL;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(569));
        LJ = c01gwLIZIZ;
        C0QG9 c0qg9 = LIZIZ;
        C0QG9 c0qg92 = C0QG9.LLILLL;
        if (c0qg9 != c0qg92) {
            if (!((IPluginService) c01gwLIZIZ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_search_biz")) {
                return;
            } else {
                LIZIZ = c0qg92;
            }
        }
        LIZIZ = c0qg92;
    }

    public static void LIZJ(Context context) {
        Boolean boolValueOf;
        try {
            if (((IPluginService) LJ.getValue()).LIZLLL() != null) {
                boolValueOf = Boolean.valueOf(a.LIZLLL(context));
            } else {
                boolValueOf = null;
            }
            C189200o6.m2constructorimpl(boolValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static boolean LIZ(Fragment fragment, boolean z) {
        if (LIZIZ(fragment, z)) {
            return true;
        }
        C0QG9 c0qg9 = LIZIZ;
        C0QG9 c0qg92 = C0QG9.LLILLJJLI;
        if (c0qg9 == c0qg92) {
            return false;
        }
        LIZIZ = c0qg92;
        C673090Qah.LIZIZ.LIZ();
        C844020X9c c844020X9c = new C844020X9c();
        c844020X9c.LIZ = "com.ss.android.ugc.aweme.df_search_biz";
        c844020X9c.LIZJ = false;
        c844020X9c.LIZIZ = true;
        AnonymousClass1403 anonymousClass1403 = new AnonymousClass1403();
        anonymousClass1403.LJIIIZ = false;
        c844020X9c.LJ = new AnonymousClass1405(anonymousClass1403);
        c844020X9c.LIZLLL = new InterfaceC842850X4p() { // from class: X.0QG0
            @Override // X.InterfaceC842850X4p
            public final void LIZJ(String str, boolean z2) {
                C673070Qaf c673070Qaf = C673070Qaf.LIZ;
                C673070Qaf.LIZIZ = C0QG9.LLILLL;
            }

            @Override // X.InterfaceC842850X4p
            public final void LIZ(int i, String str, boolean z2) {
                if (!C1248104uV.LIZ() || C673070Qaf.LIZIZ != C0QG9.LLILLL) {
                    C673070Qaf c673070Qaf = C673070Qaf.LIZ;
                    C673070Qaf.LIZIZ = C0QG9.LL;
                }
                C0QG1.LIZ.getClass();
                C0QG1.LIZIZ.LIZJ();
                C1255704vj.LIZ().LIZJ();
                Class<ISearchSurvey> cls = C0QF5.LIZ;
                C0QF5.LIZIZ = false;
            }
        };
        ((IPluginService) LJ.getValue()).LJJI(new C202068144s(c844020X9c));
        return false;
    }

    public static boolean LIZIZ(Fragment fragment, boolean z) {
        C0QG9 c0qg9 = LIZIZ;
        C0QG9 c0qg92 = C0QG9.LLILLL;
        if (c0qg9 != c0qg92) {
            if (((IPluginService) LJ.getValue()).checkPluginInstalled("com.ss.android.ugc.aweme.df_search_biz")) {
                LIZIZ = c0qg92;
            } else {
                if (z && fragment != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                    c1389890mGx.LJIIIZ(2131822946);
                    c1389890mGx.LJIIJJI();
                    return false;
                }
                return false;
            }
        }
        LIZIZ = c0qg92;
        return true;
    }
}
