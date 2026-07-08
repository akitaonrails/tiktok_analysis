package X;

import Y.ACListenerS129S0200000_27;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0xBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809460xBg extends AbstractC21673619ry<C1809470xBh> implements InterfaceC1809450xBf {
    public final Function1<C1809480xBi, Unit> LL;
    public final List<C1809480xBi> LLILLJJLI = new ArrayList();

    @Override // X.InterfaceC1809450xBf
    public final AbstractC21673619ry<? extends RecyclerView.ViewHolder> LJJLIIIJL() {
        return this;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C1809460xBg(AwS612S0100000_33 awS612S0100000_33) {
        this.LL = awS612S0100000_33;
    }

    @Override // X.InterfaceC1809450xBf
    public final void LJJJZ(List<? extends C1809480xBi> list) {
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLJIJJ;
        C16FV c16fv;
        C1809470xBh c1809470xBh = (C1809470xBh) viewHolder;
        C1809480xBi c1809480xBi = (C1809480xBi) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (c1809480xBi != null) {
            c1809470xBh.getClass();
            boolean zLJIILIIL = C494680Jac.LJIILIIL();
            boolean zLJJ = C497740JfY.LJJ();
            if (zLJIILIIL) {
                C16F5 c16f5 = c1809470xBh.LLILZIL;
                if (c16f5 != null) {
                    C786410Ut5.LLJJJJ(c16f5, 4);
                }
                C16F5 c16f52 = c1809470xBh.LLILZLL;
                if (c16f52 != null) {
                    C786410Ut5.LLJJJJ(c16f52, 0);
                }
            } else {
                if (c1809480xBi.LIZIZ) {
                    C16F5 c16f53 = c1809470xBh.LLILZIL;
                    if (c16f53 != null) {
                        C786410Ut5.LLJJJJ(c16f53, 0);
                    }
                } else {
                    C16F5 c16f54 = c1809470xBh.LLILZIL;
                    if (c16f54 != null) {
                        C786410Ut5.LLJJJJ(c16f54, 4);
                    }
                }
                C16F5 c16f55 = c1809470xBh.LLILZLL;
                if (c16f55 != null) {
                    C786410Ut5.LLJJJJ(c16f55, 8);
                }
            }
            if (!zLJJ) {
                strLJIJJ = C497740JfY.LJIJJ(2131843528, String.valueOf(c1809480xBi.LIZ));
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131843529, String.valueOf(c1809480xBi.LIZ));
            }
            C16F5 c16f56 = c1809470xBh.LLILZ;
            if (c16f56 != null) {
                c16f56.setText(strLJIJJ);
            }
            if (c1809480xBi instanceof C1AHN) {
                C16FV c16fv2 = c1809470xBh.LLILLJJLI;
                if (c16fv2 != null) {
                    C786410Ut5.LLJJJJJIL(c16fv2, 0);
                }
                C16FV c16fv3 = c1809470xBh.LL;
                if (c16fv3 != null) {
                    C786410Ut5.LLJJJJJIL(c16fv3, 4);
                }
                c16fv = c1809470xBh.LLILLJJLI;
            } else {
                C16FV c16fv4 = c1809470xBh.LLILLJJLI;
                if (c16fv4 != null) {
                    C786410Ut5.LLJJJJJIL(c16fv4, 4);
                }
                C16FV c16fv5 = c1809470xBh.LL;
                if (c16fv5 != null) {
                    C786410Ut5.LLJJJJJIL(c16fv5, 0);
                }
                c16fv = c1809470xBh.LL;
            }
            C1143680frq.LIZLLL(c16fv, "tiktok_live_broadcast_demand_2", c1809480xBi.LIZLLL());
            C16F5 c16f57 = c1809470xBh.LLILLL;
            if (c16f57 != null) {
                c16f57.setText(c1809480xBi.LIZ());
            }
            C16F5 c16f58 = c1809470xBh.LLIZ;
            if (c16f58 != null) {
                c16f58.setText(u.LJJIFFI(C497740JfY.LJIJI(2131855998), "{date}", c1809480xBi.LIZIZ(), false));
            }
            C786410Ut5.I7(new ACListenerS129S0200000_27(this, c1809480xBi, 34), c1809470xBh.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1809470xBh c1809470xBh = new C1809470xBh(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h1j, viewGroup, false));
        try {
            View view = c1809470xBh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1809470xBh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1809470xBh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1809470xBh.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1809470xBh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1809470xBh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1809470xBh.class.getName();
        return c1809470xBh;
    }
}
