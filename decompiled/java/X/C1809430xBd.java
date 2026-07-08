package X;

import Y.ACListenerS129S0200000_27;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.0xBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809430xBd extends AbstractC21673619ry<C1809440xBe> implements InterfaceC1809450xBf {
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

    public C1809430xBd(AwS612S0100000_33 awS612S0100000_33) {
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
        ImageView imageView;
        C1809440xBe c1809440xBe = (C1809440xBe) viewHolder;
        C1809480xBi c1809480xBi = (C1809480xBi) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (c1809480xBi != null) {
            c1809440xBe.getClass();
            C494680Jac.LJIILIIL();
            if (!C497740JfY.LJJ()) {
                strLJIJJ = C497740JfY.LJIJJ(2131843528, String.valueOf(c1809480xBi.LIZ));
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131843529, String.valueOf(c1809480xBi.LIZ));
            }
            if (c1809480xBi instanceof C1AHN) {
                ImageView imageView2 = c1809440xBe.LLILLJJLI;
                if (imageView2 != null) {
                    C786410Ut5.LJZI(0, imageView2);
                }
                ImageView imageView3 = c1809440xBe.LL;
                if (imageView3 != null) {
                    C786410Ut5.LJZI(4, imageView3);
                }
                imageView = c1809440xBe.LLILLJJLI;
            } else {
                ImageView imageView4 = c1809440xBe.LLILLJJLI;
                if (imageView4 != null) {
                    C786410Ut5.LJZI(4, imageView4);
                }
                ImageView imageView5 = c1809440xBe.LL;
                if (imageView5 != null) {
                    C786410Ut5.LJZI(0, imageView5);
                }
                imageView = c1809440xBe.LL;
            }
            C1143680frq.LIZLLL(imageView, "tiktok_live_broadcast_demand_2", c1809480xBi.LIZLLL());
            C16F5 c16f5 = c1809440xBe.LLILLL;
            if (c16f5 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1809480xBi.LIZ());
                sbLIZ.append(' ');
                sbLIZ.append(strLJIJJ);
                c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (c1809480xBi.LIZJ() - System.currentTimeMillis() <= TimeUnit.DAYS.toMillis(1L)) {
                C500260Jjc.LLFFF(c1809440xBe.LLILZ);
            } else {
                C500260Jjc.LJIILIIL(c1809440xBe.LLILZ);
            }
            C786410Ut5.I7(new ACListenerS129S0200000_27(this, c1809480xBi, 33), c1809440xBe.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1809440xBe c1809440xBe = new C1809440xBe(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h1l, viewGroup, false));
        try {
            View view = c1809440xBe.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1809440xBe.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1809440xBe.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1809440xBe.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1809440xBe.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1809440xBe.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1809440xBe.class.getName();
        return c1809440xBe;
    }
}
