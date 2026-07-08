package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;

/* JADX INFO: renamed from: X.0sDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618300sDM {
    public static final C1618300sDM LIZ = new C1618300sDM();

    public static void LIZ(Context context, TextView textView, ViewPager viewPager, int i) {
        if (((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZLLL(context)) {
            i = (i >> 1) - 42;
        }
        C786410Ut5.LLIL(textView, 8);
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        int iLLIIIILZ = c19252910Tv.LIZLLL().LJII().LLIIIILZ((int) (i * 0.48104957f));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewPager.getLayoutParams();
        marginLayoutParams.height = iLLIIIILZ;
        if (!c19252910Tv.LIZLLL().LJII().LLLILZ(i, viewPager)) {
            viewPager.setPadding(0, 0, 0, 0);
            viewPager.setPageMargin(C341940Daq.LIZ(0.0d));
            viewPager.setClipToPadding(true);
        }
        C786410Ut5.q6(viewPager, marginLayoutParams);
    }
}
