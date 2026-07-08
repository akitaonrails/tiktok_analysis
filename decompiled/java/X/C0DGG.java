package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DGG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGG extends AbstractC21673619ry<C336320DGk> {
    public List<String> LL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int iIntValue;
        C336320DGk c336320DGk = (C336320DGk) viewHolder;
        String str = (String) ListProtector.get(this.LL, i);
        c336320DGk.getClass();
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            Object tag = c336320DGk.LL.getTag(R.id.ucp_image_model_url);
            if (tag instanceof String) {
                obj = tag;
            }
            if (!Intrinsics.LJFF(obj, str)) {
                c336320DGk.LL.setBackgroundColor(0);
                c336320DGk.LL.setTag(R.id.ucp_image_model_url, str);
                C0D8X.LIZ().LIZ(str, c336320DGk.LL, 0.0f, null);
                return;
            }
            return;
        }
        c336320DGk.LL.setTag(R.id.ucp_image_model_url, null);
        c336320DGk.LL.setImageDrawable(null);
        ImageView imageView = c336320DGk.LL;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, c336320DGk.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -855310;
        }
        imageView.setBackgroundColor(iIntValue);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C336320DGk c336320DGk = new C336320DGk(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i44, viewGroup, false));
        try {
            View view = c336320DGk.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c336320DGk.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c336320DGk.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C336320DGk.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c336320DGk.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c336320DGk.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C336320DGk.class.getName();
        return c336320DGk;
    }
}
