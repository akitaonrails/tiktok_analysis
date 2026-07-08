package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19403510vh extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<AnchorPublishStruct> LL;
    public final LifecycleOwner LLILLJJLI;
    public final C19415010xY<List<AnchorPublishStruct>> LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i < this.LL.size()) {
            return this.LLILLL.LIZIZ(i, this.LL);
        }
        return super.getItemViewType(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILLL.LIZJ();
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILLL.LJFF();
    }

    public C19403510vh(final LifecycleOwner lifecycleOwner, List list) {
        this.LL = list;
        this.LLILLJJLI = lifecycleOwner;
        C19415010xY<List<AnchorPublishStruct>> c19415010xY = new C19415010xY<>();
        this.LLILLL = c19415010xY;
        c19415010xY.LIZ(new AbstractC1067910dtd<List<? extends AnchorPublishStruct>>(lifecycleOwner) { // from class: X.10vu
            public final LifecycleOwner LIZ;

            {
                this.LIZ = lifecycleOwner;
            }

            @Override // X.AbstractC1067910dtd
            public final RecyclerView.ViewHolder LIZJ(ViewGroup viewGroup) {
                IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
                if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.isRefactorPublishAddLinkOption()) {
                    return new C19417410xw(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d1t, viewGroup, false), this.LIZ);
                }
                return new C19417510xx(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.d1s, viewGroup, false), this.LIZ);
            }

            @Override // X.AbstractC1067910dtd
            public final /* bridge */ /* synthetic */ void LIZ(Object obj) {
            }

            @Override // X.AbstractC1067910dtd
            public final void LIZIZ(Object obj, int i, RecyclerView.ViewHolder viewHolder) {
                C19417510xx c19417510xx;
                AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) ListProtector.get((List) obj, i);
                boolean z = viewHolder instanceof C19417510xx;
                if (z) {
                    ((C19417510xx) viewHolder).L5(anchorPublishStruct);
                }
                if (i == r4.size() - 1 && z && (c19417510xx = (C19417510xx) viewHolder) != null) {
                    c19417510xx.N5();
                }
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LLILLL.LIZLLL(i, viewHolder, this.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLJ = this.LLILLL.LJ(viewGroup, i);
        try {
            View view = viewHolderLJ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolderLJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLJ.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLJ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLJ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLJ.getClass().getName();
        return viewHolderLJ;
    }
}
