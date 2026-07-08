package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0DUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340070DUv extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<C340090DUx> LL = new ArrayList(0);
    public int LLILLJJLI = 5;
    public C340060DUu LLILLL;
    public C0DV0 LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public final void LLLFZ(int i) {
        int i2 = -1;
        if (this.LLILLJJLI == i) {
            Iterator it2 = ((ArrayList) this.LL).iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (((C340090DUx) it2.next()).LIZ == this.LLILLJJLI) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            notifyItemChanged(i2);
            return;
        }
        Iterator it3 = ((ArrayList) this.LL).iterator();
        int i4 = 0;
        while (true) {
            if (it3.hasNext()) {
                if (((C340090DUx) it3.next()).LIZ == this.LLILLJJLI) {
                    break;
                } else {
                    i4++;
                }
            } else {
                i4 = -1;
                break;
            }
        }
        Iterator it4 = ((ArrayList) this.LL).iterator();
        int i5 = 0;
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            if (((C340090DUx) it4.next()).LIZ == i) {
                i2 = i5;
                break;
            }
            i5++;
        }
        this.LLILLJJLI = i;
        notifyItemChanged(i4);
        notifyItemChanged(i2);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C340060DUu c340060DUu = (C340060DUu) viewHolder;
        final C340090DUx c340090DUx = (C340090DUx) ListProtector.get(this.LL, i);
        c340060DUu.getClass();
        Integer num = c340090DUx.LIZIZ;
        if (num != null) {
            c340060DUu.LL.setIconRes(num.intValue());
        }
        Integer num2 = c340090DUx.LIZJ;
        if (num2 != null) {
            c340060DUu.LLILLJJLI.setText(num2.intValue());
        }
        c340060DUu.I5(false);
        if (this.LLILLJJLI == c340090DUx.LIZ) {
            c340060DUu.I5(true);
            this.LLILLL = c340060DUu;
            C0DV0 c0dv0 = this.LLILZ;
            if (c0dv0 != null) {
                c0dv0.M2(i);
            }
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0DUw
            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                C340070DUv c340070DUv = this.LLILZ;
                c340070DUv.LLILLJJLI = c340090DUx.LIZ;
                C340060DUu c340060DUu2 = c340070DUv.LLILLL;
                if (c340060DUu2 != null) {
                    c340060DUu2.I5(false);
                }
                C340070DUv c340070DUv2 = this.LLILZ;
                C340060DUu c340060DUu3 = c340060DUu;
                c340070DUv2.LLILLL = c340060DUu3;
                c340060DUu3.I5(true);
                C0DV0 c0dv02 = this.LLILZ.LLILZ;
                if (c0dv02 != null) {
                    c0dv02.LIZ(c340090DUx, i);
                }
            }
        }, c340060DUu.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C340060DUu c340060DUu = new C340060DUu(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvy, viewGroup, false));
        try {
            View view = c340060DUu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c340060DUu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c340060DUu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C340060DUu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c340060DUu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c340060DUu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C340060DUu.class.getName();
        return c340060DUu;
    }
}
