package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS376S0200000_10;

/* JADX INFO: renamed from: X.0P7M, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P7M {
    public C0P7N LIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJFF;
    public boolean LJI;
    public long LJII;
    public C0P7Q LJIIIIZZ;
    public boolean LIZIZ = true;
    public final boolean LJ = C07DT.LIZ();

    public C0P7M(C0P56 c0p56) {
        this.LIZ = c0p56;
        new LinkedHashMap();
    }

    public final void LIZ(C0PPU c0ppu) {
        if (c0ppu != null) {
            C1591860rWi.LIZ(c0ppu, new AwS376S0200000_10(this, c0ppu, 123));
        }
    }

    public final boolean LIZIZ(RecyclerView recyclerView) {
        int iFindLastVisibleItemPosition;
        GridLayoutManager gridLayoutManager;
        try {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
            } else {
                iFindLastVisibleItemPosition = 0;
            }
            if (iFindLastVisibleItemPosition <= this.LJFF) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public final void LIZLLL(String str) {
        if (this.LIZIZ) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.LIZJ;
        long j2 = jCurrentTimeMillis - this.LIZLLL;
        if (j <= 0 || j2 <= 0) {
            return;
        }
        C0P7Q c0p7q = this.LJIIIIZZ;
        if (c0p7q != null) {
            c0p7q.LJIIZILJ("left_type", str);
            c0p7q.LJIIZILJ("duration", String.valueOf(j));
            c0p7q.LJIIZILJ("show_duration", String.valueOf(j2));
            c0p7q.LJIILJJIL();
        }
        this.LIZIZ = true;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.0P7Q, X.0Q2Q] */
    public final void LIZJ(int i, long j, Long l) {
        long jLongValue;
        C0PRC c0prc;
        String str;
        String strLIZ;
        String str2;
        String enterFrom;
        ISearchContextAbility iSearchContextAbilityBb;
        C0PCY<C0PRC> c0pcyPh1;
        if (this.LJ && this.LJI) {
            return;
        }
        int i2 = 0;
        this.LIZIZ = false;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        String str3 = null;
        this.LJIIIIZZ = null;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = this.LJII;
        }
        this.LIZJ = jLongValue;
        this.LIZLLL = j;
        C0P7N c0p7n = this.LIZ;
        if (c0p7n != null && (iSearchContextAbilityBb = c0p7n.bb()) != null && (c0pcyPh1 = iSearchContextAbilityBb.Ph1()) != null) {
            c0prc = (C0PRC) c0pcyPh1.LIZJ();
        } else {
            c0prc = null;
        }
        ?? r5 = new C650460PfI<C0P7Q>() { // from class: X.0P7Q
        };
        if (c0prc != null) {
            str = c0prc.LLILLL;
        } else {
            str = null;
        }
        r5.LJIIZILJ("search_id", str);
        C0P7N c0p7n2 = this.LIZ;
        if (c0p7n2 != null) {
            strLIZ = c0p7n2.LIZ();
        } else {
            strLIZ = null;
        }
        r5.LJIIZILJ("entity_id", strLIZ);
        if (c0prc != null) {
            str2 = c0prc.LLIZLLLIL;
        } else {
            str2 = null;
        }
        r5.LJIIZILJ("search_keyword", str2);
        C0Q2M.LIZ.getClass();
        r5.LJIIZILJ("group_id", C0Q2M.LJIIL());
        if (c0prc != null) {
            i2 = c0prc.LL;
        }
        r5.LJIIZILJ("search_type", C0PSI.LIZ(i2));
        C0P7N c0p7n3 = this.LIZ;
        if (c0p7n3 != null) {
            enterFrom = c0p7n3.getEnterFrom();
        } else {
            enterFrom = null;
        }
        r5.LJIJJ(enterFrom);
        if (c0prc != null) {
            str3 = c0prc.LLJLL;
        }
        r5.LJIIZILJ("enter_method", str3);
        this.LJIIIIZZ = r5;
        this.LJFF = i;
        this.LJI = true;
        this.LJII = 0L;
    }
}
