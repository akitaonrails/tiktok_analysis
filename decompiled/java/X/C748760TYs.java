package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import wh6.AbS503S0200000_12;

/* JADX INFO: renamed from: X.0TYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748760TYs extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function1<BlockWord, Unit> LL;
    public List<BlockWord> LLILLJJLI = new ArrayList();
    public final List<BlockWord> LLILLL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C748760TYs(AwS591S0100000_12 awS591S0100000_12) {
        this.LL = awS591S0100000_12;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C748770TYt c748770TYt;
        int i2 = 0;
        if (i >= 0 && i < ((ArrayList) this.LLILLJJLI).size()) {
            BlockWord blockWord = (BlockWord) ListProtector.get(this.LLILLJJLI, i);
            if ((viewHolder instanceof C748770TYt) && (c748770TYt = (C748770TYt) viewHolder) != null) {
                C786410Ut5.I7(new AbS503S0200000_12(c748770TYt, blockWord, 4), c748770TYt.LLILZ);
                c748770TYt.LLILLL.setText(blockWord.content);
                LiveIconView liveIconView = c748770TYt.LLILZIL;
                if (blockWord.blockSimilarVersions != 1) {
                    i2 = 8;
                }
                C786410Ut5.LLJJIJIL(liveIconView, i2);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C748770TYt c748770TYt = new C748770TYt(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gpp, viewGroup, false), this.LL);
        try {
            View view = c748770TYt.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c748770TYt.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c748770TYt.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C748770TYt.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c748770TYt.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c748770TYt.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C748770TYt.class.getName();
        return c748770TYt;
    }
}
