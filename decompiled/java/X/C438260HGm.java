package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.ui.container.ReferenceSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS142S0101000_2;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0HGm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438260HGm {
    public static long LIZIZ;
    public static final C438260HGm LIZ = new C438260HGm();
    public static final boolean LIZJ = C288510BSn.LIZ();

    public static void LIZJ(View view, boolean z) {
        if (LIZJ) {
            C0Q3E.LJI().Ph1().LIZ(new C641690PEx(z));
        }
        Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(view);
        C19EG c19egLIZIZ = C640260P9k.LIZIZ(view);
        if (c19egLIZIZ != null) {
            ((SearchStateViewModel) C679340Qkm.LIZIZ(fragmentLIZLLL, c19egLIZIZ).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(z);
        }
    }

    public static void LIZ(final View view, final C434640H2o c434640H2o, boolean z, final Function0 function0) {
        C19EG c19eg;
        if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - LIZIZ < 1000) {
            return;
        }
        LIZIZ = jUptimeMillis;
        Context context = view.getContext();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (c434640H2o != null && (!c434640H2o.LIZ.isEmpty())) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                C437900HFc c437900HFc = ReferenceSheetFragment.LLJIJIL;
                AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6(c434640H2o, 151);
                AFwS289S0000000_6 aFwS289S0000000_6 = AFwS289S0000000_6.get$arr$(55);
                c437900HFc.getClass();
                C1390920mIc c1390920mIcLIZ = C437900HFc.LIZ(view, c434640H2o, awS620S0100000_6, aFwS289S0000000_6, null, null);
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0HGk
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C438260HGm c438260HGm = C438260HGm.LIZ;
                        View view2 = view;
                        C434640H2o c434640H2o2 = c434640H2o;
                        long j = jCurrentTimeMillis;
                        c438260HGm.getClass();
                        C438260HGm.LIZJ(view2, false);
                        C438260HGm.LIZIZ = 0L;
                        C661350Pwr.LJFF(new C438250HGl(c434640H2o2.LIZIZ, System.currentTimeMillis() - j));
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                };
                TuxSheet tuxSheet = c1390920mIcLIZ.LIZ;
                tuxSheet.LLILLJJLI = onDismissListener;
                SAFHelper.LIZ.getClass();
                tuxSheet.show(SAFHelper.LJJIIJ(view, c19eg), "searchCommonSheet");
                LIZ.getClass();
                LIZJ(view, true);
                if (!z) {
                    C661350Pwr.LJFF(new AwS142S0101000_2(c434640H2o.LIZ.size(), c434640H2o.LIZIZ, 17));
                }
            }
        }
    }
}
