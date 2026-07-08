package X;

import Y.ACListenerS129S0200000_27;
import Y.ACListenerS91S0300000_27;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugEntity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0xB9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809130xB9 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final InterfaceC1809200xBG LL;
    public final List<LiveSearchSugEntity> LLILLJJLI = new ArrayList();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1399));

    public final int LLLFZ() {
        if (((ArrayList) this.LLILLJJLI).size() <= 10) {
            return ((ArrayList) this.LLILLJJLI).size();
        }
        return 10;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size() > 4 ? LLLFZ() + 1 : LLLFZ();
    }

    public C1809130xB9(C1809040xB0 c1809040xB0) {
        this.LL = c1809040xB0;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (((ArrayList) this.LLILLJJLI).size() <= 4 || i != LLLFZ()) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C1809140xBA) {
            C1809140xBA c1809140xBA = (C1809140xBA) viewHolder;
            c1809140xBA.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trending_words_show");
            c474500IjALIZ.LJJIIZI(c1809140xBA.I5());
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof C1809140xBA) {
            viewHolder.getClass();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1809140xBA c1809140xBA;
        C1809210xBH c1809210xBH;
        int itemViewType = getItemViewType(i);
        if (itemViewType != 1) {
            if (itemViewType == 2 && (viewHolder instanceof C1809210xBH) && (c1809210xBH = (C1809210xBH) viewHolder) != null) {
                C1808990xAv c1808990xAv = (C1808990xAv) this.LLILLL.getValue();
                ((TextView) c1809210xBH.itemView.findViewById(R.id.ihi)).setText(2131852022);
                C786410Ut5.I7(new ACListenerS129S0200000_27(c1808990xAv, c1809210xBH, 59), c1809210xBH.itemView);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C1809140xBA) || (c1809140xBA = (C1809140xBA) viewHolder) == null) {
            return;
        }
        LiveSearchSugEntity liveSearchSugEntity = (LiveSearchSugEntity) ListProtector.get(this.LLILLJJLI, i);
        InterfaceC1809230xBJ interfaceC1809230xBJ = new InterfaceC1809230xBJ() { // from class: X.0xBE
            @Override // X.InterfaceC1809230xBJ
            public final int LIZ(LiveSearchSugEntity liveSearchSugEntity2) {
                if (liveSearchSugEntity2 == null) {
                    return -1;
                }
                return ((ArrayList) this.LIZ.LLILLJJLI).indexOf(liveSearchSugEntity2);
            }

            @Override // X.InterfaceC1809230xBJ
            public final void LIZIZ(int i2, String str) {
                if (i2 >= 0 && i2 < ((ArrayList) this.LIZ.LLILLJJLI).size()) {
                    int itemCount = this.LIZ.getItemCount();
                    ListProtector.remove(this.LIZ.LLILLJJLI, i2);
                    C2834017w.LIZIZ(str);
                    if (((ArrayList) this.LIZ.LLILLJJLI).size() == 4) {
                        this.LIZ.notifyItemRemoved(itemCount - 1);
                        this.LIZ.notifyItemRemoved(i2);
                    } else {
                        this.LIZ.notifyItemRemoved(i2);
                    }
                }
            }
        };
        c1809140xBA.LLILLJJLI = liveSearchSugEntity;
        c1809140xBA.LLILLL = interfaceC1809230xBJ;
        ((TextView) c1809140xBA.itemView.findViewById(R.id.zf0)).setText(liveSearchSugEntity.content);
        C786410Ut5.l8((C16F5) c1809140xBA.itemView.findViewById(R.id.zf0), new ACListenerS129S0200000_27(liveSearchSugEntity, c1809140xBA, 60));
        C786410Ut5.g8((LiveIconView) c1809140xBA.itemView.findViewById(R.id.lea), new ACListenerS91S0300000_27(interfaceC1809230xBJ, c1809140xBA, liveSearchSugEntity, 15));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1809140xBA;
        if (i != 1) {
            if (i != 2) {
                int i2 = C1809140xBA.LLILZ;
                c1809140xBA = new C1809140xBA(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gus, viewGroup, false), this.LL);
            } else {
                int i3 = C1809210xBH.LLILLJJLI;
                c1809140xBA = new C1809210xBH(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gut, viewGroup, false));
            }
        } else {
            int i4 = C1809140xBA.LLILZ;
            c1809140xBA = new C1809140xBA(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gus, viewGroup, false), this.LL);
        }
        try {
            View view = c1809140xBA.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1809140xBA.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1809140xBA.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1809140xBA.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1809140xBA.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1809140xBA.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1809140xBA.getClass().getName();
        return c1809140xBA;
    }
}
