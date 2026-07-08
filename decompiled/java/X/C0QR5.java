package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.lynx.tasm.TemplateData;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.inter.ISearchMiddleForECService;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0QR5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QR5 {
    public static final C0QR5 LIZ = new C0QR5();
    public static WeakReference<C0QCO> LIZIZ;

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static Pair LIZ(C0QR5 c0qr5, Fragment fragment) {
        ?? r3;
        C0QCO c0qco;
        ViewGroup viewGroup;
        Fragment fragment2;
        String str;
        C664000Q2s c664000Q2s;
        c0qr5.getClass();
        Context context = GlobalContext.getContext();
        if (context == null) {
            return null;
        }
        WeakReference<C0QCO> weakReference = LIZIZ;
        if (weakReference != null && weakReference.get() != null) {
            r3 = 1;
        } else {
            r3 = 0;
        }
        ServiceManager.get().getService(ISearchMiddleForECService.class);
        C673320Qb4.LIZ.getClass();
        if (r3 != 1) {
            C673400QbC c673400QbC = C673320Qb4.LIZIZ;
            if (c673400QbC != null) {
                c673400QbC.LIZIZ = r3;
            }
            C673400QbC c673400QbC2 = C673320Qb4.LIZIZ;
            if (c673400QbC2 != null) {
                c673400QbC2.LJJIIJZLJL = 0;
                c673400QbC2.LJIIIIZZ = System.currentTimeMillis();
            }
            if (C293970Bff.LIZ()) {
                fragment2 = null;
            } else {
                fragment2 = fragment;
            }
            c0qco = new C0QCO(fragment2, context, null);
            if (C293970Bff.LIZ()) {
                C650950Pg5.Companion.getClass();
                C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(fragment, null);
                if (c650960Pg6LJII == null || (c664000Q2s = c650960Pg6LJII.searchCommonModel) == null || (str = c664000Q2s.enterFrom) == null) {
                    str = "";
                }
                c0qco.LIZJ = str;
            }
            C673400QbC c673400QbC3 = C673320Qb4.LIZIZ;
            if (c673400QbC3 != null && c673400QbC3.LJIIIIZZ != 0) {
                c673400QbC3.LJIIIZ = System.currentTimeMillis() - c673400QbC3.LJIIIIZZ;
            }
        } else {
            C673400QbC c673400QbC4 = C673320Qb4.LIZIZ;
            if (c673400QbC4 != null) {
                c673400QbC4.LJJIIJZLJL = 1;
            }
            if (((Number) C275090AqJ.LIZ.getValue()).intValue() == 2) {
                TemplateData templateData = new TemplateData();
                templateData.LJIILIIL("guessSearchData", null);
                templateData.LIZJ = "allSearchDataProcess";
                WeakReference<C0QCO> weakReference2 = LIZIZ;
                if (weakReference2 == null || (c0qco = weakReference2.get()) == null) {
                    return null;
                }
                c0qco.LJIIJ(templateData);
            } else {
                WeakReference<C0QCO> weakReference3 = LIZIZ;
                if (weakReference3 == null || (c0qco = weakReference3.get()) == null) {
                    return null;
                }
            }
        }
        ViewParent parent = c0qco.LJIILIIL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        LIZIZ = new WeakReference<>(c0qco);
        return new Pair(c0qco, Boolean.valueOf((boolean) r3));
    }
}
