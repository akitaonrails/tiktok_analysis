package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.template.search.TemplateSearchHistoryItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425870nCz extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public boolean LL;
    public final List<TemplateSearchHistoryItem> LLILLJJLI = new ArrayList();
    public AwS636S0100000_22 LLILLL;
    public AwS636S0100000_22 LLILZ;
    public AwS566S0100000_22 LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return (this.LL ? ((ArrayList) this.LLILLJJLI).size() : Math.min(((ArrayList) this.LLILLJJLI).size(), 5)) + (((ArrayList) this.LLILLJJLI).size() > 5 ? 1 : 0);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        int iMin;
        if (this.LL) {
            iMin = ((ArrayList) this.LLILLJJLI).size();
        } else {
            iMin = Math.min(((ArrayList) this.LLILLJJLI).size(), 5);
        }
        if (i < iMin) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        if (viewHolder instanceof C1425880nD0) {
            final TemplateSearchHistoryItem templateSearchHistoryItem = (TemplateSearchHistoryItem) ListProtector.get(this.LLILLJJLI, i);
            C1425880nD0 c1425880nD0 = (C1425880nD0) viewHolder;
            c1425880nD0.LL.setText(templateSearchHistoryItem.keyword);
            View view = c1425880nD0.LLILLL;
            final C1425870nCz c1425870nCz = c1425880nD0.LLILZ;
            C786410Ut5.I7(new C19IN() { // from class: X.0nCx
                @Override // X.C19IN
                public final void LIZ(View view2) {
                    AwS636S0100000_22 awS636S0100000_22 = this.LLILZLL.LLILLL;
                    if (awS636S0100000_22 != null) {
                        awS636S0100000_22.invoke(templateSearchHistoryItem, Integer.valueOf(i));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                }
            }, view);
            TuxIconView tuxIconView = c1425880nD0.LLILLJJLI;
            final C1425870nCz c1425870nCz2 = c1425880nD0.LLILZ;
            C786410Ut5.I7(new C19IN() { // from class: X.0nCy
                @Override // X.C19IN
                public final void LIZ(View view2) {
                    AwS636S0100000_22 awS636S0100000_22 = this.LLILZLL.LLILZ;
                    if (awS636S0100000_22 != null) {
                        awS636S0100000_22.invoke(templateSearchHistoryItem, Integer.valueOf(i));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
                }
            }, tuxIconView);
            return;
        }
        if (!(viewHolder instanceof C1425890nD1)) {
            return;
        }
        C1425890nD1 c1425890nD1 = (C1425890nD1) viewHolder;
        if (this.LL) {
            c1425890nD1.LLILLJJLI.setText(c1425890nD1.itemView.getContext().getString(2131850061));
            C786410Ut5.LLLLLLZZ(c1425890nD1.LLILLL, 8);
            C786410Ut5.I7(new C1466580oGe(c1425890nD1.LLILZ, c1425890nD1, 0), c1425890nD1.LL);
            return;
        }
        c1425890nD1.LLILLJJLI.setText(c1425890nD1.itemView.getContext().getString(2131850062));
        C786410Ut5.LLLLLLZZ(c1425890nD1.LLILLL, 0);
        C786410Ut5.I7(new C1466570oGd(c1425890nD1.LLILZ, 24, 42, 42), c1425890nD1.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1425880nD0;
        if (i == 1) {
            c1425880nD0 = new C1425890nD1(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fs8, viewGroup, false));
        } else {
            c1425880nD0 = new C1425880nD0(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fs6, viewGroup, false));
        }
        try {
            View view = c1425880nD0.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1425880nD0.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1425880nD0.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1425880nD0.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1425880nD0.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1425880nD0.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1425880nD0.getClass().getName();
        return c1425880nD0;
    }
}
