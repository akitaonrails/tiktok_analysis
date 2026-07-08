package X;

import Y.ACListenerS48S0101000_4;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DK4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DK4 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<String> LL;
    public Function1<? super Integer, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C0DK4(List<String> list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int iIntValue;
        C786410Ut5.I7(new ACListenerS48S0101000_4(this, i, 0), viewHolder.itemView);
        SmartImageView smartImageView = (SmartImageView) viewHolder.itemView.findViewById(R.id.jjh);
        View viewFindViewById = viewHolder.itemView.findViewById(R.id.jiy);
        String str = (String) C13LP.LJJJLZIJ(i, this.LL);
        if (str == null) {
            str = "";
        }
        if (i == getItemCount() - 1) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, viewHolder.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -3355444;
        }
        smartImageView.setBackgroundColor(iIntValue);
        C786410Ut5.LLFF(0, smartImageView);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LJIIJ(null);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.akd, viewGroup, false);
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(viewTd) { // from class: X.0DK5
        };
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DK5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DK5.class.getName();
        return viewHolder;
    }
}
