package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424810GlD {
    public static final /* synthetic */ int LJII = 0;
    public final RecyclerView LIZ;
    public final List<String> LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public List<String> LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;

    static {
        new C816470W1d();
    }

    public final void LIZ(List<String> list) {
        ArrayList arrayList;
        synchronized (this) {
            if (list == null) {
                arrayList = null;
            } else {
                try {
                    arrayList = new ArrayList(list);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LIZLLL = arrayList;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.LIZ.getVisibility() != 0) {
                    this.LIZ.scrollToPosition(0);
                    C786410Ut5.LLIZLLLIL(this.LIZ, 0);
                }
                if (this.LJ) {
                    this.LIZLLL.add(0, this.LIZ.getContext().getString(2131829339));
                }
                if (this.LIZ.getAdapter() == null) {
                    this.LIZ.setAdapter(new C03G5(this));
                } else {
                    this.LIZ.getAdapter().notifyDataSetChanged();
                }
            } else if (this.LIZ.getVisibility() != 8) {
                C786410Ut5.LLIZLLLIL(this.LIZ, 8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C424810GlD(RecyclerView recyclerView, List<String> list, Function1<? super String, Unit> function1) {
        this.LIZ = recyclerView;
        this.LIZIZ = list;
        this.LIZJ = function1;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            this.LIZLLL = arrayList;
        }
        this.LJFF = -1;
        this.LJI = -1;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        if (this.LIZLLL != null && (!r0.isEmpty())) {
            if (this.LJ) {
                ListProtector.add(this.LIZLLL, 0, recyclerView.getContext().getString(2131829339));
            }
            if (recyclerView.getAdapter() == null) {
                recyclerView.setAdapter(new C03G5(this));
                return;
            } else {
                recyclerView.getAdapter().notifyDataSetChanged();
                return;
            }
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 8);
    }
}
