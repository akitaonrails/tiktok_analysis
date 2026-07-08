package X;

import Y.ARunnableS61S0300000_28;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.inbox.cache.PreloadManager;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0zel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904370zel {
    public static int LIZIZ;
    public static final List<EnumC1904380zem> LIZLLL;
    public static final List<EnumC1904380zem> LJ;
    public static final boolean LJFF;
    public static final C1904370zel LIZ = new C1904370zel();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    static {
        EnumC1904380zem enumC1904380zem = EnumC1904380zem.SKYLIGHT_SHOW_TIME;
        EnumC1904380zem enumC1904380zem2 = EnumC1904380zem.ENTRANCE_LIST_SHOW_TIME;
        LIZLLL = C1697810uHb.LJIIJJI(enumC1904380zem, enumC1904380zem2, EnumC1904380zem.DM_SHOW_TIME);
        LJ = C1697810uHb.LJIIJJI(enumC1904380zem, enumC1904380zem2);
        LJFF = !DmNoticeProxyImpl.LIZJ().LIZIZ();
    }

    public static void LIZIZ() {
        if (PreloadManager.LIZ.compareAndSet(false, true)) {
            EnumC1904390zen enumC1904390zen = EnumC1904390zen.SWITCH_TAB_TIMESTAMP;
            enumC1904390zen.trackTime();
            EnumC1904380zem.FRAGMENT_CREATE_TIME.intervalStart();
            EnumC1904380zem.FRAGMENT_VIEW_CREATE_TIME.intervalStart();
            EnumC1904380zem.SKYLIGHT_SHOW_TIME.intervalStart();
            EnumC1904380zem.ENTRANCE_DATA_READY_TIME.intervalStart();
            EnumC1904380zem.ENTRANCE_LIST_SHOW_TIME.intervalStart();
            EnumC1904380zem.DM_DATA_READY_TIME.intervalStart();
            EnumC1904380zem.DM_SHOW_TIME.intervalStart();
            EnumC1904390zen enumC1904390zen2 = EnumC1904390zen.LAUNCH_TO_TAB_INTERVAL;
            EnumC1904390zen enumC1904390zen3 = EnumC1904390zen.LAUNCH_TIMESTAMP;
            enumC1904390zen2.setEventValue(enumC1904390zen.minus(enumC1904390zen3));
            EnumC1904390zen.MAIN_ACTIVITY_TO_TAB_INTERVAL.setEventValue(enumC1904390zen.minus(EnumC1904390zen.MAIN_ACTIVITY_TIMESTAMP));
            EnumC1904390zen.FIRST_INBOX_BUBBLE_TO_TAB_INTERVAL.setEventValue(enumC1904390zen.minus(EnumC1904390zen.FIRST_INBOX_BUBBLE_TIMESTAMP));
            EnumC1904390zen enumC1904390zen4 = EnumC1904390zen.NOTICE_COUNT_TO_TAB_INTERVAL;
            EnumC1904390zen enumC1904390zen5 = EnumC1904390zen.NOTICE_COUNT_TIMESTAMP;
            enumC1904390zen4.setEventValue(enumC1904390zen.minus(enumC1904390zen5));
            EnumC1904390zen.LAUNCH_TO_NOTICE_COUNT_INTERVAL.setEventValue(enumC1904390zen5.minus(enumC1904390zen3));
            int iLJIIIIZZ = C1903780zdo.LJIIIIZZ();
            int iLIZ = C1903780zdo.LJII().LIZ();
            int iLJIILL = C1904220zeW.LL.LJIILL();
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("numCount= ");
            sbLIZ.append(iLJIIIIZZ);
            sbLIZ.append(", dotCount = ");
            sbLIZ.append(iLIZ);
            C1720106oR.LJI("PreloadStatics", C2188811AlT.LIZIZ(sbLIZ));
            long j = 0;
            EnumC1904390zen.TOTAL_UNREAD_COUNT.setEventValue(iLJIIIIZZ > 0 ? iLJIIIIZZ : 0L);
            EnumC1904390zen enumC1904390zen6 = EnumC1904390zen.HAS_TAB_DOT;
            if (iLJIIIIZZ == 0 && iLIZ > 0) {
                j = 1;
            }
            enumC1904390zen6.setEventValue(j);
            C2344009Gk c2344009Gk = new C2344009Gk();
            for (EnumC1904390zen enumC1904390zen7 : EnumC1904390zen.values()) {
                c2344009Gk.LIZLLL(enumC1904390zen7.getEventValue(), enumC1904390zen7.getEventKey());
            }
            c2344009Gk.LIZLLL(iLJIILL, "inbox_total_unread_conv_count");
            C20684815ws.LJIILLIIL("inbox_switch_tab_perf", c2344009Gk.LIZ);
        }
    }

    public static void LIZ(RecyclerView.ViewHolder viewHolder) {
        EnumC1904380zem enumC1904380zem;
        if (PreloadManager.LIZ.get() && !LIZJ.get()) {
            if (viewHolder instanceof InterfaceC1598970riB) {
                enumC1904380zem = EnumC1904380zem.SKYLIGHT_SHOW_TIME;
            } else if (viewHolder instanceof C1903510zdN) {
                enumC1904380zem = EnumC1904380zem.ENTRANCE_LIST_SHOW_TIME;
            } else if (!(viewHolder instanceof C0Z32)) {
                return;
            } else {
                enumC1904380zem = EnumC1904380zem.DM_SHOW_TIME;
            }
            if (enumC1904380zem != null && enumC1904380zem.getHasRecord().compareAndSet(false, true)) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(enumC1904380zem.getEventKey());
                sbLIZ.append("  bind start");
                C1720106oR.LJI("PreloadStatics", C2188811AlT.LIZIZ(sbLIZ));
                View view = viewHolder.itemView;
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(view, new ARunnableS61S0300000_28(view, viewHolder, enumC1904380zem, 1));
            }
        }
    }
}
