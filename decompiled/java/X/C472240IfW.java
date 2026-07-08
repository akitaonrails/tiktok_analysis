package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: renamed from: X.0IfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472240IfW extends AbstractC21673619ry<C472250IfX> {
    public final Function2<Gift, View, Unit> LL;
    public final List<Gift> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C472240IfW(AwS631S0100000_17 awS631S0100000_17) {
        this.LL = awS631S0100000_17;
    }

    public final void LLLFZ(List<? extends Gift> list) {
        int size = ((ArrayList) this.LLILLJJLI).size();
        int size2 = list.size();
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        if (size == 0 && size2 > 0) {
            notifyItemRangeInserted(0, size2);
            return;
        }
        if (size2 == 0 && size > 0) {
            notifyItemRangeRemoved(0, size);
            return;
        }
        if (size == size2) {
            notifyItemRangeChanged(0, size2);
        } else if (size > size2) {
            notifyItemRangeChanged(0, size2);
            notifyItemRangeRemoved(size2, size - size2);
        } else {
            notifyItemRangeChanged(0, size);
            notifyItemRangeInserted(size, size2 - size);
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C472250IfX c472250IfX = (C472250IfX) viewHolder;
        Gift gift = (Gift) ListProtector.get(this.LLILLJJLI, i);
        c472250IfX.itemView.setContentDescription(gift.name);
        C786410Ut5.I7(new ACListenerS111S0200000_7(c472250IfX, gift, 29), c472250IfX.itemView);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadGiftIcon for giftId=");
        sbLIZ.append(gift.id);
        sbLIZ.append(",giftname = ");
        sbLIZ.append(gift.name);
        C20441214yg.LJ("MultiFastGiftViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        ImageModel imageModel = gift.image;
        if (imageModel == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadGiftIcon imageModel null for giftId=");
            sbLIZ2.append(gift.id);
            C20441214yg.LJIIL("MultiFastGiftViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJJI(c472250IfX.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C472250IfX c472250IfX = new C472250IfX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqo, viewGroup, false), this.LL);
        try {
            View view = c472250IfX.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c472250IfX.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c472250IfX.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C472250IfX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c472250IfX.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c472250IfX.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C472250IfX.class.getName();
        return c472250IfX;
    }
}
