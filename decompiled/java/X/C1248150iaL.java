package X;

import Y.ACListenerS55S0101000_19;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0iaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248150iaL extends AbstractC21673619ry<C1248160iaM> {
    public final ArrayList<C1248170iaN> LL;
    public final C19EG LLILLJJLI;
    public int LLILLL = C341940Daq.LIZ(150.0d);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void LLLFZ(C1248160iaM c1248160iaM) {
        int bottom = ((c1248160iaM.LLILZIL.getBottom() - c1248160iaM.LLILZ.getBottom()) - (c1248160iaM.LLILZIL.getBottom() - c1248160iaM.LLILZIL.getTop())) + ((this.LLILLL - c1248160iaM.LLILZIL.getBottom()) - C341940Daq.LIZ(16.0d));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1248160iaM.LLILZIL.getLayoutParams();
        marginLayoutParams.setMargins(0, bottom, 0, C341940Daq.LIZ(16.0d));
        C786410Ut5.J6(c1248160iaM.LLILZIL, marginLayoutParams);
    }

    public C1248150iaL(ArrayList<C1248170iaN> arrayList, C19EG c19eg) {
        this.LL = arrayList;
        this.LLILLJJLI = c19eg;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1248160iaM c1248160iaM = (C1248160iaM) viewHolder;
        C786410Ut5.y3(c1248160iaM.LLILZLL.getViewTreeObserver(), new ViewTreeObserverOnPreDrawListenerC1265970j35(c1248160iaM, this, 1));
        c1248160iaM.LL.setIconRes(((C1248170iaN) ListProtector.get(this.LL, i)).LIZ);
        c1248160iaM.LLILLL.setText(((C1248170iaN) ListProtector.get(this.LL, i)).LIZIZ);
        c1248160iaM.LLILZ.setText(((C1248170iaN) ListProtector.get(this.LL, i)).LIZJ);
        c1248160iaM.LLILZIL.setText(((C1248170iaN) ListProtector.get(this.LL, i)).LIZLLL);
        if (((C1248170iaN) ListProtector.get(this.LL, i)).LJ) {
            c1248160iaM.LLILZIL.setButtonVariant(0);
            C786410Ut5.LLLLLLZZ(c1248160iaM.LLILLJJLI, 8);
        } else {
            c1248160iaM.LLILZIL.setButtonVariant(1);
            C786410Ut5.LLLLLLZZ(c1248160iaM.LLILLJJLI, 0);
        }
        int i2 = ((C1248170iaN) ListProtector.get(this.LL, i)).LIZIZ;
        if (i2 == 2131836166) {
            C786410Ut5.U8(c1248160iaM.LLILZIL, new ACListenerS55S0101000_19(this, i, 1));
            return;
        }
        if (i2 == 2131836162) {
            C786410Ut5.U8(c1248160iaM.LLILZIL, new ACListenerS55S0101000_19(this, i, 2));
            return;
        }
        if (i2 == 2131827390) {
            if (!((C1248170iaN) ListProtector.get(this.LL, i)).LJ) {
                c1248160iaM.LLILZIL.setEnabled(false);
                c1248160iaM.LLILZIL.setButtonVariant(0);
                return;
            } else {
                C786410Ut5.U8(c1248160iaM.LLILZIL, new ACListenerS55S0101000_19(this, i, 3));
                return;
            }
        }
        if (i2 != 2131836158) {
            return;
        }
        C786410Ut5.U8(c1248160iaM.LLILZIL, new ACListenerS55S0101000_19(this, i, 4));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1248160iaM c1248160iaM = new C1248160iaM(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eeh, viewGroup, false));
        try {
            View view = c1248160iaM.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1248160iaM.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1248160iaM.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1248160iaM.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1248160iaM.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1248160iaM.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1248160iaM.class.getName();
        return c1248160iaM;
    }
}
