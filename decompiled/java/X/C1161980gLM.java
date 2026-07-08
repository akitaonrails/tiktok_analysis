package X;

import Y.AsS45S0100000_18;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gLM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161980gLM {
    public final String LIZ;
    public final Function0<String> LIZIZ;
    public final Function0<Integer> LIZJ;
    public final Function0<Integer> LIZLLL;
    public int LJ;
    public C1156740gCu LJFF;
    public RecyclerView LJI;
    public final AsS45S0100000_18 LJII = new AsS45S0100000_18(this, 9);

    public final void LIZJ() {
        this.LJ++;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C1156740gCu c1156740gCu = new C1156740gCu(this.LJ, jElapsedRealtime);
        if (LIZ(this.LJI)) {
            c1156740gCu.LIZJ = Long.valueOf(jElapsedRealtime);
        }
        this.LJFF = c1156740gCu;
    }

    public static boolean LIZ(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter;
        int itemCount;
        if (recyclerView == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (adapter = recyclerView.getAdapter()) == null || (itemCount = adapter.getItemCount()) <= 0 || linearLayoutManager.findLastVisibleItemPosition() < itemCount - 1) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(boolean z) {
        int i;
        String str;
        String string;
        C1156740gCu c1156740gCu = this.LJFF;
        if (c1156740gCu == null) {
            return;
        }
        this.LJFF = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - c1156740gCu.LIZIZ;
        Long l = c1156740gCu.LIZJ;
        long j2 = 0;
        if (l != null) {
            long jLongValue = jElapsedRealtime - l.longValue();
            if (jLongValue >= 0) {
                j2 = jLongValue;
            }
        }
        if (l != null) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            Pair[] pairArr = new Pair[9];
            pairArr[0] = new Pair("enter_from", this.LIZ);
            String strInvoke = this.LIZIZ.invoke();
            String str2 = "";
            if (strInvoke == null) {
                strInvoke = "";
            }
            pairArr[1] = new Pair("poi_id", strInvoke);
            Integer numInvoke = this.LIZJ.invoke();
            if (numInvoke != null && (string = numInvoke.toString()) != null) {
                str2 = string;
            }
            pairArr[2] = new Pair("tab_id", str2);
            pairArr[3] = new Pair("preload_count", String.valueOf(this.LIZLLL.invoke().intValue()));
            pairArr[4] = new Pair("load_more_index", String.valueOf(c1156740gCu.LIZ));
            if (z) {
                str = "success";
            } else {
                str = "fail";
            }
            pairArr[5] = new Pair("result", str);
            pairArr[6] = new Pair("request_duration_ms", String.valueOf(j));
            pairArr[7] = new Pair("perceived_duration_ms", String.valueOf(j2));
            pairArr[8] = new Pair("is_user_perceived", String.valueOf(i));
            C20684815ws.LJIILLIIL("poi_review_load_more_perf", C2097608Jq.LJIIIIZZ(pairArr));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public C1161980gLM(String str, Function0<String> function0, Function0<Integer> function02, Function0<Integer> function03) {
        this.LIZ = str;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = function03;
    }
}
