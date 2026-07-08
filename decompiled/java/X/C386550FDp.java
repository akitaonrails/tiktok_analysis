package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386550FDp {
    public final Context LIZ;
    public final RecyclerView LIZIZ;
    public int LJFF;
    public boolean LJII;
    public final C01GW LJIIIIZZ;
    public final C386560FDq LJIIIZ;
    public int LIZJ = 4;
    public int LIZLLL = 3;
    public int LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    public int LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

    public final void LIZ(boolean z) {
        this.LJII = z;
        if (z) {
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
                notifyDataSetChanged();
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.LIZIZ;
        if (recyclerView2 == null) {
            return;
        }
        C786410Ut5.LLIZLLLIL(recyclerView2, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0FDq, X.19ry] */
    public C386550FDp(Context context, RecyclerView recyclerView) {
        this.LIZ = context;
        this.LIZIZ = recyclerView;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1674));
        this.LJIIIIZZ = c01gwLIZIZ;
        ?? r1 = new AbstractC21673619ry<C386620FDw>() { // from class: X.0FDq
            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                C386550FDp c386550FDp = this.LL;
                return c386550FDp.LIZJ * c386550FDp.LIZLLL;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C20627315nb c20627315nb = ((C386620FDw) viewHolder).LLILLJJLI;
                if (c20627315nb != null) {
                    c20627315nb.setLoading(this.LL.LJII);
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View viewFindViewById;
                ViewGroup.LayoutParams layoutParams;
                C386620FDw c386620FDw = new C386620FDw(C786410Ut5.Td(C786410Ut5.ne(this.LL.LIZ), R.layout.fsr, viewGroup, false));
                C386550FDp c386550FDp = this.LL;
                C20627315nb c20627315nb = c386620FDw.LLILLJJLI;
                if (c20627315nb != null && (viewFindViewById = c20627315nb.findViewById(R.id.nmm)) != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                    layoutParams.height = c386550FDp.LJ;
                }
                C20627315nb c20627315nb2 = c386620FDw.LLILLJJLI;
                if (c20627315nb2 != null) {
                    C426750GoL.LJIIIZ(c20627315nb2, Integer.valueOf(c386550FDp.LJFF), 0, Integer.valueOf(c386550FDp.LJFF), Integer.valueOf(c386550FDp.LJI), false, 16);
                }
                try {
                    View view = c386620FDw.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c386620FDw.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c386620FDw.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C386620FDw.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c386620FDw.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c386620FDw.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C386620FDw.class.getName();
                return c386620FDw;
            }
        };
        this.LJIIIZ = r1;
        if (recyclerView != 0) {
            recyclerView.setLayoutManager((RecyclerView.LayoutManager) c01gwLIZIZ.getValue());
            recyclerView.setAdapter(r1);
            r1.notifyDataSetChanged();
        }
    }
}
