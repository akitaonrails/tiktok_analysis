package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.search.model.RichSugInfo;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0QMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669090QMh {
    public static final C669090QMh LIZ = new C669090QMh();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    public static final int LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public static final int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public static final int LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static int LJIIIZ = -1;

    public static int LJI(Context context) {
        if (C294590Bgf.LIZ()) {
            return C475630Ikz.LIZIZ(R.attr.a1j, context);
        }
        return C475630Ikz.LIZIZ(R.attr.a04, context);
    }

    public static void LJII(LinearLayout linearLayout) {
        View viewFindViewWithTag;
        if (linearLayout != null && (viewFindViewWithTag = linearLayout.findViewWithTag("ec_info_view")) != null) {
            C786410Ut5.LJJL(viewFindViewWithTag, linearLayout);
        }
    }

    public static int LJFF(SearchSugEntity searchSugEntity, Context context) {
        String userAvatarUri;
        if (LJIIIZ < 0) {
            LJIIIZ = ((C12ES.LJIIJ(context) - LIZIZ) - LJ) - LJII;
        }
        int i = LJIIIZ;
        SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
        if (sugExtraInfo != null && (userAvatarUri = sugExtraInfo.getUserAvatarUri()) != null && C123100dR.LIZ(userAvatarUri)) {
            i -= LIZJ;
        }
        if (searchSugEntity.LIZJ()) {
            C0QEE c0qee = C0QEE.LIZ;
            String str = searchSugEntity.content;
            c0qee.getClass();
            if (C0QEE.LJ(str) != null) {
                return (i - LIZLLL) - LJIIIIZZ;
            }
            return i;
        }
        return i;
    }

    public static void LJIIIIZZ(Layout layout, View view) {
        if (layout.getLineCount() > 1) {
            view.getLayoutParams().height = LJI;
            view.requestLayout();
        } else {
            view.getLayoutParams().height = LJFF;
            view.requestLayout();
        }
    }

    public static Layout LJ(SearchSugEntity searchSugEntity, Context context, int i) {
        RichSugInfo richSugInfo = searchSugEntity.richSugInfo;
        String str = null;
        if (richSugInfo != null) {
            String str2 = richSugInfo.sugReason;
            int i2 = 0;
            if (str2 != null && str2.length() != 0) {
                if (i == -1) {
                    i = LJFF(searchSugEntity, context);
                }
                C444830HcP c444830HcP = new C444830HcP();
                if (i >= 0) {
                    i2 = i;
                }
                c444830HcP.LIZIZ.LJ = i2;
                c444830HcP.LIZLLL = true;
                RichSugInfo richSugInfo2 = searchSugEntity.richSugInfo;
                if (richSugInfo2 != null) {
                    str = richSugInfo2.sugReason;
                }
                c444830HcP.LJIILIIL(str);
                c444830HcP.LIZIZ.LJIIIZ = TextDirectionHeuristics.LOCALE;
                c444830HcP.LJIIIZ(1);
                c444830HcP.LIZIZ.LJII = TextUtils.TruncateAt.END;
                c444830HcP.LJIILJJIL(C475630Ikz.LIZIZ(R.attr.a1k, context));
                c444830HcP.LJII(61);
                return c444830HcP.LIZIZ();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout LIZJ(com.ss.android.ugc.aweme.search.model.SearchSugEntity r11, java.lang.CharSequence r12, android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C669090QMh.LIZJ(com.ss.android.ugc.aweme.search.model.SearchSugEntity, java.lang.CharSequence, android.content.Context, int, boolean):android.text.Layout");
    }

    public static void LIZ(int i, Drawable drawable, View view, LinearLayout linearLayout, C21415018rM c21415018rM, C21415018rM c21415018rM2, SearchSugEntity searchSugEntity) {
        C01V1.LIZ(new C669150QMn(i, drawable, view, linearLayout, c21415018rM, c21415018rM2, searchSugEntity));
    }

    public static void LIZIZ(C669090QMh c669090QMh, SearchSugEntity searchSugEntity, C21415018rM c21415018rM, float f, Context context, LinearLayout linearLayout, int i) {
        Context context2 = context;
        LinearLayout linearLayout2 = null;
        if ((i & 16) != 0) {
            context2 = null;
        }
        if ((i & 32) == 0) {
            linearLayout2 = linearLayout;
        }
        c669090QMh.getClass();
        if (context2 == null) {
            context2 = c21415018rM.getContext();
        }
        C01V1.LIZ(new C669140QMm(searchSugEntity, context2, f, linearLayout2, c21415018rM));
    }
}
