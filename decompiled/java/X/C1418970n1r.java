package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0n1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418970n1r extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public int LL = -1;
    public List<C0FNM> LLILLJJLI = C13BV.INSTANCE;
    public final /* synthetic */ C1415620mwS LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1418970n1r(C1415620mwS c1415620mwS) {
        this.LLILLL = c1415620mwS;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        float f;
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C1418990n1t) {
            ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
            if (layoutParams instanceof C21681819tI) {
                int iLIZ = ((C21681819tI) layoutParams).LIZ();
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                this.LLILLL.getItemColumnMap().put(Integer.valueOf(bindingAdapterPosition), Integer.valueOf(iLIZ));
                int i = 0;
                if (bindingAdapterPosition >= 0) {
                    int i2 = 0;
                    while (true) {
                        Integer num = this.LLILLL.getItemColumnMap().get(Integer.valueOf(i));
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

    public final void LLLFZ(int i, boolean z) {
        int i2;
        int i3 = this.LL;
        if (z) {
            i2 = i;
        } else {
            i2 = -1;
        }
        this.LL = i2;
        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeItemSelectState: oldPosition: ");
        sbLIZ.append(i3);
        sbLIZ.append(" click: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        if (i3 != -1) {
            notifyItemChanged(i3);
        }
        int i4 = this.LL;
        if (i4 != -1) {
            notifyItemChanged(i4);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        boolean z;
        if (viewHolder instanceof C1418990n1t) {
            String str = ((C0FNM) ListProtector.get(this.LLILLJJLI, i)).LIZ;
            int i2 = 0;
            if (i == this.LL) {
                z = true;
            } else {
                z = false;
            }
            C1418990n1t c1418990n1t = (C1418990n1t) viewHolder;
            int i3 = ((C0FNM) ListProtector.get(this.LLILLJJLI, i)).LIZIZ;
            c1418990n1t.LLILLJJLI.setText(str);
            TuxSpinner tuxSpinner = c1418990n1t.LLILLL;
            if (i3 != 1) {
                i2 = 4;
            }
            C786410Ut5.LLZILL(tuxSpinner, i2);
            TuxTextView tuxTextView = c1418990n1t.LLILLJJLI;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C354870Dvh.LIZIZ() * 16.0f);
            if (z) {
                c384050F3z.LIZLLL = Integer.valueOf((int) (C354870Dvh.LIZIZ() * 1.5f));
                c384050F3z.LJFF = Integer.valueOf(R.attr.zi);
            }
            tuxTextView.setBackground(c384050F3z.LIZ(c1418990n1t.LLILZ.LLILLL.getContext()));
            View view = c1418990n1t.LL;
            final C1418970n1r c1418970n1r = c1418990n1t.LLILZ;
            final C1415620mwS c1415620mwS = c1418970n1r.LLILLL;
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0mnO
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view2) {
                    C1418970n1r c1418970n1r2 = this.LLILZ;
                    int i4 = c1418970n1r2.LL;
                    int i5 = i;
                    if (i4 == i5 && ((C0FNM) ListProtector.get(c1418970n1r2.LLILLJJLI, i5)).LIZIZ != 3) {
                        return;
                    }
                    InterfaceC1410010mnP inspirationPanelClickListener = c1415620mwS.getInspirationPanelClickListener();
                    if (inspirationPanelClickListener != null) {
                        int i6 = i;
                        inspirationPanelClickListener.LIZLLL(i6);
                    }
                    this.LLILZ.LLLFZ(i, true);
                }
            }, view);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1418990n1t c1418990n1t = new C1418990n1t(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eod, viewGroup, false));
        try {
            View view = c1418990n1t.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1418990n1t.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1418990n1t.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1418990n1t.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1418990n1t.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1418990n1t.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1418990n1t.class.getName();
        return c1418990n1t;
    }
}
