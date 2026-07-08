package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0DKG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKG {
    public static final /* synthetic */ int LJFF = 0;
    public final RecyclerView LIZ;
    public final List<String> LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;

    public C0DKG(RecyclerView recyclerView, List list, AwS584S0100000_5 awS584S0100000_5) {
        this.LIZ = recyclerView;
        this.LIZIZ = list;
        this.LIZJ = awS584S0100000_5;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        if (list != null && (!list.isEmpty())) {
            recyclerView.setAdapter(new AbstractC21673619ry<C0DKH>() { // from class: X.0DKF
                @Override // X.AbstractC21673619ry
                public final int getItemCount() {
                    List<String> list2 = this.LL.LIZIZ;
                    if (list2 != null) {
                        return list2.size();
                    }
                    return 0;
                }

                @Override // X.AbstractC21673619ry
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    String str;
                    boolean z;
                    C0DKH c0dkh = (C0DKH) viewHolder;
                    List<String> list2 = this.LL.LIZIZ;
                    if (list2 != null && (str = (String) C13LP.LJJJLZIJ(i, list2)) != null) {
                        if (this.LL.LJ == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c0dkh.LL.setText(str);
                        c0dkh.LL.setSelected(z);
                    }
                }

                @Override // X.AbstractC21673619ry
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    C0DKH c0dkh = new C0DKH(this.LL, (TextView) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.amk, viewGroup, false));
                    try {
                        View view = c0dkh.itemView;
                        if (view != null) {
                            view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    c0dkh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                    try {
                        if (c0dkh.itemView.getParent() != null) {
                            try {
                                SettingsManager.LIZLLL().getClass();
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                                StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                stringBuffer.append(C0DKH.class.getName());
                                stringBuffer.append(" parent ");
                                stringBuffer.append(viewGroup.getClass().getName());
                                stringBuffer.append(" viewType ");
                                stringBuffer.append(i);
                                C1AF0.LIZJ(stringBuffer.toString());
                                ViewGroup viewGroup2 = (ViewGroup) c0dkh.itemView.getParent();
                                if (viewGroup2 != null) {
                                    C786410Ut5.LJJJLZIJ(c0dkh.itemView, viewGroup2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2081408Dk.LIZ(e2);
                        C2344809Gs.LIZ(e2);
                    }
                    C20612085q.LIZ = C0DKH.class.getName();
                    return c0dkh;
                }
            });
        } else {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
    }
}
