package X;

import Y.ACListenerS49S0201000_22;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0n5M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421140n5M extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public int LL = -1;
    public List<C1421170n5P> LLILLJJLI = C13BV.INSTANCE;
    public boolean LLILLL;
    public final /* synthetic */ C1421110n5J LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size() + (this.LLILLL ? 1 : 0);
    }

    public C1421140n5M(C1421110n5J c1421110n5J) {
        this.LLILZ = c1421110n5J;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < this.LLILLJJLI.size()) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        float f;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C1421150n5N) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof C21681819tI) {
                int iLIZ = ((C21681819tI) layoutParams).LIZ();
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                this.LLILZ.getItemColumnMap().put(Integer.valueOf(bindingAdapterPosition), Integer.valueOf(iLIZ));
                int i = 0;
                if (bindingAdapterPosition >= 0) {
                    int i2 = 0;
                    while (true) {
                        Integer num = this.LLILZ.getItemColumnMap().get(Integer.valueOf(i));
                        if (num != null && num.intValue() == iLIZ) {
                            i2++;
                        }
                        if (i == bindingAdapterPosition) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    i = i2;
                }
                int i3 = i - 1;
                if (iLIZ == 0) {
                    int i4 = i3 % 6;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3 || i4 != 4) {
                                }
                            }
                            f = -1.0f;
                        }
                        f = 0.0f;
                    }
                    f = 1.0f;
                } else {
                    int i5 = i3 % 5;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2 && i5 == 3) {
                                f = 1.0f;
                            }
                        }
                        f = -1.0f;
                    }
                    f = 0.0f;
                }
                C786410Ut5.Ab(viewHolder.itemView, -f);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1421570n63 c1421570n63 = C1421570n63.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder, position:");
        sbLIZ.append(i);
        C201955140j.LIZJ(c1421570n63, C2188811AlT.LIZIZ(sbLIZ));
        boolean z = true;
        if (viewHolder instanceof C1421150n5N) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("POV : ");
            sbLIZ2.append(((C1421170n5P) ListProtector.get(this.LLILLJJLI, i)).LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            int i2 = 0;
            if (i != this.LL) {
                z = false;
            }
            InterfaceC1421120n5K povPanelClickListener = this.LLILZ.getPovPanelClickListener();
            if (povPanelClickListener != null) {
                povPanelClickListener.LJ(((C1421170n5P) ListProtector.get(this.LLILLJJLI, i)).LIZ, z);
            }
            C1421150n5N c1421150n5N = (C1421150n5N) viewHolder;
            boolean z2 = ((C1421170n5P) ListProtector.get(this.LLILLJJLI, i)).LIZIZ;
            c1421150n5N.LLILLJJLI.setText(strLIZIZ);
            View view = c1421150n5N.LLILLL;
            if (!z2) {
                i2 = 4;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            TuxTextView tuxTextView = c1421150n5N.LLILLJJLI;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
            c384050F3z.LIZJ = Float.valueOf(C354870Dvh.LIZIZ() * 16.0f);
            if (z) {
                c384050F3z.LIZLLL = Integer.valueOf((int) (C354870Dvh.LIZIZ() * 1.5f));
                c384050F3z.LJFF = Integer.valueOf(R.attr.zi);
            }
            tuxTextView.setBackground(c384050F3z.LIZ(c1421150n5N.LLILZ.LLILZ.getContext()));
            View view2 = c1421150n5N.LL;
            C1421140n5M c1421140n5M = c1421150n5N.LLILZ;
            C786410Ut5.I7(new ACListenerS49S0201000_22(c1421140n5M, i, c1421140n5M.LLILZ, 0), view2);
            return;
        }
        if (!(viewHolder instanceof C1421160n5O)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (!(layoutParams instanceof C21681819tI)) {
            return;
        }
        ((C21681819tI) layoutParams).LLILLJJLI = true;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1421150n5N;
        if (i == 0) {
            c1421150n5N = new C1421150n5N(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eon, viewGroup, false));
        } else {
            final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eok, viewGroup, false);
            c1421150n5N = new RecyclerView.ViewHolder(viewTd) { // from class: X.0n5O
                public final View LL;

                {
                    super(viewTd);
                    this.LL = viewTd;
                }
            };
        }
        try {
            View view = c1421150n5N.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1421150n5N.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1421150n5N.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1421150n5N.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1421150n5N.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1421150n5N.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1421150n5N.getClass().getName();
        return c1421150n5N;
    }
}
