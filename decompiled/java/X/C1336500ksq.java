package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ksq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336500ksq extends AbstractC21673619ry<C1336510ksr> {
    public List<C1309500kBI> LL;
    public final Function1<C1309500kBI, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1336500ksq(List<C1309500kBI> list, Function1<? super C1309500kBI, Unit> function1) {
        this.LL = list;
        this.LLILLJJLI = function1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Object c098200Yq;
        C1336510ksr c1336510ksr = (C1336510ksr) viewHolder;
        C1309500kBI c1309500kBI = (C1309500kBI) C13LP.LJJJLZIJ(i, this.LL);
        if (c1309500kBI == null) {
            c1336510ksr.getClass();
            return;
        }
        c1336510ksr.LL = c1309500kBI;
        MediaModel mediaModel = (MediaModel) C13LP.LJJJLZIJ(0, c1309500kBI.LIZIZ);
        if (mediaModel != null) {
            try {
                c098200Yq = C2471909mP.LJIILIIL(mediaModel.LJFF());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String string = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Uri uri = (Uri) c098200Yq;
            SmartImageView smartImageView = c1336510ksr.LLILLJJLI;
            if (uri != null) {
                string = uri.toString();
            }
            C1324750kZt.LJIIIZ(smartImageView, string, C0H9H.LIZIZ(72), C0H9H.LIZIZ(72));
        }
        TuxTextView tuxTextView = c1336510ksr.LLILLL;
        tuxTextView.setText(C1336530kst.LIZ(tuxTextView.getContext(), c1309500kBI.LIZ));
        c1336510ksr.LLILZ.setText(String.valueOf(c1309500kBI.LIZIZ.size()));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1336510ksr c1336510ksr = new C1336510ksr(C786410Ut5.Sd(R.layout.bp0, C786410Ut5.ne(viewGroup.getContext()), null), this.LLILLJJLI);
        try {
            View view = c1336510ksr.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1336510ksr.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1336510ksr.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1336510ksr.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1336510ksr.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1336510ksr.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1336510ksr.class.getName();
        return c1336510ksr;
    }
}
