package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0vWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745610vWh extends AbstractC21673619ry<AbstractViewOnClickListenerC1745630vWj> {
    public List<CandInputData> LL;
    public String LLILLJJLI;
    public InterfaceC1743730vTf LLILLL;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<CandInputData> list = this.LL;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        CandInputData candInputData;
        AbstractViewOnClickListenerC1745630vWj abstractViewOnClickListenerC1745630vWj = (AbstractViewOnClickListenerC1745630vWj) viewHolder;
        List<CandInputData> list = this.LL;
        if (list != null) {
            candInputData = (CandInputData) ListProtector.get(list, i);
        } else {
            candInputData = null;
        }
        abstractViewOnClickListenerC1745630vWj.I5(candInputData, getItemCount(), null, this.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ai3, viewGroup, false);
        AbstractViewOnClickListenerC1745630vWj abstractViewOnClickListenerC1745630vWj = new AbstractViewOnClickListenerC1745630vWj(viewTd) { // from class: X.0vWg
            @Override // X.AbstractViewOnClickListenerC1745630vWj
            public final void I5(CandInputData candInputData, int i2, ViewStyle viewStyle, String str) {
                int size;
                String str2;
                String str3;
                List<ViewItem> list;
                ViewItem viewItem;
                List<ViewItem> list2;
                ViewItem viewItem2;
                List<ViewItem> list3;
                TextView textView = (TextView) this.itemView.findViewById(R.id.zc0);
                TextView textView2 = (TextView) this.itemView.findViewById(R.id.zc1);
                this.LLILLJJLI.getClass();
                boolean z = false;
                if (candInputData != null && (list3 = candInputData.viewItems) != null) {
                    size = list3.size();
                } else {
                    size = 0;
                }
                if (size > 1) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, viewGroup.getContext());
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1j, viewGroup.getContext());
                    if (candInputData == null || (list2 = candInputData.viewItems) == null || (viewItem2 = (ViewItem) ListProtector.get(list2, 0)) == null || (str2 = viewItem2.text) == null) {
                        str2 = "";
                    }
                    textView.setText(C240600wO.LIZ(str, numLIZJ, numLIZJ2, str2, this.itemView.getContext()));
                    if (candInputData != null && (list = candInputData.viewItems) != null && (viewItem = (ViewItem) ListProtector.get(list, 1)) != null) {
                        str3 = viewItem.text;
                    } else {
                        str3 = null;
                    }
                    textView2.setText(str3);
                }
                View view = this.itemView;
                if (getLayoutPosition() != i2 - 1) {
                    z = true;
                }
                C03J8.LIZ(view, z);
            }
        };
        abstractViewOnClickListenerC1745630vWj.LL = this.LLILLL;
        try {
            View view = abstractViewOnClickListenerC1745630vWj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        abstractViewOnClickListenerC1745630vWj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (abstractViewOnClickListenerC1745630vWj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1745600vWg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) abstractViewOnClickListenerC1745630vWj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(abstractViewOnClickListenerC1745630vWj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1745600vWg.class.getName();
        return abstractViewOnClickListenerC1745630vWj;
    }
}
