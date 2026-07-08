package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;

/* JADX INFO: renamed from: X.0Rtf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710330Rtf {
    public static final String LIZIZ() {
        return C281260B0q.LIZ() ? "detail_feed_story_detail_page_new" : "detail_feed_story_detail_page";
    }

    public static final boolean LIZ(Fragment fragment) {
        if (!C281260B0q.LIZ()) {
            return true;
        }
        return !C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL(fragment);
    }

    public static final void LIZJ(boolean z, boolean z2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05CX(z, z2, null), 3);
    }

    public static final void LIZLLL(SmartRoute smartRoute, C19EG c19eg, String str) {
        Integer num;
        if (!(c19eg instanceof InterfaceC1603190roz) || !C707060RoO.LIZJ(str)) {
            return;
        }
        if (C707060RoO.LIZIZ().withShellActivity) {
            num = 1;
        } else if (!(!C707060RoO.LIZIZ().withShellActivity)) {
            return;
        } else {
            num = 2;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            smartRoute.withParam("use_saf", iIntValue);
            if (iIntValue > 0) {
                smartRoute.withParam("is_story_detail_for_saf", true);
            }
        }
    }
}
