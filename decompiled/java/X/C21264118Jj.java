package X;

import com.bytedance.nita.Nita$beginDynamicInflate$1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21264118Jj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, C19EG c19eg, DetailAwemeListFragment detailAwemeListFragment) {
        int i;
        int i2;
        C21265018Js c21265018Js = C20673215v0.LIZ;
        if (c21265018Js != null && c21265018Js.LJI) {
            try {
                if (((Number) C294100Bfs.LIZ.getValue()).intValue() != 1 && ((i2 = C294100Bfs.LIZIZ) >= 4 || i2 == 0)) {
                    i = C21265718Jz.LIZLLL;
                } else {
                    i = C21265718Jz.LIZJ;
                }
                Nita$beginDynamicInflate$1 nita$beginDynamicInflate$1 = new Nita$beginDynamicInflate$1(str, C21264318Jl.LIZ, EnumC21153717qJ.AT_ONCE);
                nita$beginDynamicInflate$1.LLILLJJLI = c19eg;
                nita$beginDynamicInflate$1.LLILZ = detailAwemeListFragment;
                detailAwemeListFragment.getLifecycle().addObserver(nita$beginDynamicInflate$1);
                nita$beginDynamicInflate$1.LL.add(Integer.valueOf(R.layout.bk3));
                nita$beginDynamicInflate$1.LLILLL = i;
                nita$beginDynamicInflate$1.LIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preload view failed: ");
                sbLIZ.append(C13SZ.LIZIZ(e));
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("DetailPreloadVH", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }
}
