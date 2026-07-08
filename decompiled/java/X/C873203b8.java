package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.usexpress.summary.USHalfPageOrderSummaryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import kotlin.Unit;
import kotlin.jvm.internal.AwS130S0400000_1;

/* JADX INFO: renamed from: X.03b8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C873203b8 {
    public static void LIZ(boolean z, FragmentManager fragmentManager, View view, Summary summary, C755502xF c755502xF) {
        Object objValueOf;
        try {
            if (z) {
                USHalfPageOrderSummaryFragment uSHalfPageOrderSummaryFragment = new USHalfPageOrderSummaryFragment();
                uSHalfPageOrderSummaryFragment.LLLFF = new C815503Gn(summary, c755502xF);
                uSHalfPageOrderSummaryFragment.LLILLJJLI = new AwS130S0400000_1(fragmentManager, view, summary, c755502xF, 9);
                C03DZ.LIZJ(view);
                C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
                c19ehLJIIJ.LIZJ(view.getId(), uSHalfPageOrderSummaryFragment, "direct_checkout_summary_tag");
                objValueOf = Integer.valueOf(c19ehLJIIJ.LJIIJ());
            } else {
                Fragment fragmentLJJJJZI = fragmentManager.LJJJJZI("direct_checkout_summary_tag");
                if (fragmentLJJJJZI != null) {
                    C19EH c19ehLJIIJ2 = fragmentManager.LJIIJ();
                    c19ehLJIIJ2.LJIIZILJ(fragmentLJJJJZI);
                    c19ehLJIIJ2.LJIIJ();
                }
                C03DZ.LIZ(view);
                objValueOf = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objValueOf);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
