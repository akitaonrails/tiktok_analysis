package X;

import Y.ACListenerS41S0201000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS466S0200000_31;

/* JADX INFO: renamed from: X.0H37, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H37 extends AbstractC21673619ry<C0H38> {
    public final List<Bitmap> LL;
    public final Function2<Bitmap, Integer, Unit> LLILLJJLI;
    public final LayoutInflater LLILLL;
    public int LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C0H38 c0h38 = (C0H38) viewHolder;
        c0h38.LL.setImageBitmap((Bitmap) ListProtector.get(this.LL, i));
        View view = c0h38.LLILLJJLI;
        if (i == this.LLILZ) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, view);
        C786410Ut5.Q7(c0h38.LL, new ACListenerS41S0201000_6(this, c0h38, i, 8));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0H38 c0h38 = new C0H38(C786410Ut5.Td(this.LLILLL, R.layout.djs, viewGroup, false));
        try {
            View view = c0h38.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0h38.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0h38.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0H38.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0h38.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0h38.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0H38.class.getName();
        return c0h38;
    }

    public C0H37(Context context, List list, AwS466S0200000_31 awS466S0200000_31) {
        this.LL = list;
        this.LLILLJJLI = awS466S0200000_31;
        this.LLILLL = C786410Ut5.ne(context);
    }
}
