package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiHangoutLiveCardOptimizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15CE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CE extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<? extends ImageModel> LL = C13BV.INSTANCE;
    public AwS575S0100000_31 LLILLJJLI;
    public AwS575S0100000_31 LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C15CF LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable() ? this.LLILZIL ? this.LLIZ.LLILZLL : this.LL.size() : this.LL.size() + 1;
    }

    public C15CE(C15CF c15cf) {
        this.LLIZ = c15cf;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (MultiHangoutLiveCardOptimizeSetting.INSTANCE.isEnable()) {
            if (!this.LLILZIL || i < this.LL.size() - 1) {
                return 1;
            }
            return 3;
        }
        if (i < this.LL.size()) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C15CC) {
            C15CC c15cc = (C15CC) viewHolder;
            c15cc.LLILLJJLI.setTag(-1);
            c15cc.LLILLJJLI.setImageDrawable(null);
        }
        super.onViewRecycled(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C15CD) {
            TextView textView = (TextView) viewHolder.itemView.findViewById(R.id.zy1);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('+');
            sbLIZ.append(this.LLILZLL - this.LL.size());
            textView.setText(C2188811AlT.LIZIZ(sbLIZ));
            ((C15CC) viewHolder).I5((ImageModel) ListProtector.get(this.LL, i), this.LLILZ);
            C500260Jjc.LJLIIIL(500L, viewHolder.itemView, new AwS610S0100000_31(this, 199));
            return;
        }
        if (viewHolder instanceof C15CC) {
            ((C15CC) viewHolder).I5((ImageModel) ListProtector.get(this.LL, i), this.LLILZ);
            C500260Jjc.LJLIIIL(500L, viewHolder.itemView, new AwS610S0100000_31(this, 200));
        } else {
            if (!(viewHolder instanceof C15CH)) {
                return;
            }
            C500260Jjc.LJLIIIL(500L, viewHolder.itemView, new AwS610S0100000_31(this, 201));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c15cc;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    final C15CF c15cf = this.LLIZ;
                    final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.din, viewGroup, false);
                    c15cc = new C15CC(c15cf, viewTd) { // from class: X.15CD
                    };
                } else {
                    throw new IllegalArgumentException("Unknown view type");
                }
            } else {
                final View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.di4, viewGroup, false);
                c15cc = new RecyclerView.ViewHolder(viewTd2) { // from class: X.15CH
                };
            }
        } else {
            c15cc = new C15CC(this.LLIZ, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.di5, viewGroup, false));
        }
        try {
            View view = c15cc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c15cc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c15cc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c15cc.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c15cc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c15cc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c15cc.getClass().getName();
        return c15cc;
    }
}
