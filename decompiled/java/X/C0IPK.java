package X;

import Y.ACListenerS111S0200000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0IPK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IPK extends AbstractC21673619ry<C0IPL> {
    public final Context LL;
    public final boolean LLILLJJLI;
    public List<TranslatedRegion> LLILLL;

    public final List<TranslatedRegion> LLLFZ() {
        return C13LP.LLIIII(this.LLILLL);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        String strLIZIZ;
        C0IPL c0ipl = (C0IPL) viewHolder;
        TranslatedRegion translatedRegion = (TranslatedRegion) ListProtector.get(this.LLILLL, i);
        TextView textView = c0ipl.LL;
        if (a0.LJJJIL(translatedRegion.code)) {
            strLIZIZ = translatedRegion.translation;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(translatedRegion.translation);
            sbLIZ.append((char) 65288);
            sbLIZ.append(translatedRegion.code);
            sbLIZ.append((char) 65289);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        textView.setText(strLIZIZ);
        if (this.LLILLJJLI) {
            C786410Ut5.LJZI(8, c0ipl.LLILLJJLI);
        } else {
            C786410Ut5.Q7(c0ipl.LLILLJJLI, new ACListenerS111S0200000_7(this, translatedRegion, 34));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0IPL c0ipl = new C0IPL(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwa, viewGroup, false));
        try {
            View view = c0ipl.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ipl.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ipl.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0IPL.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ipl.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ipl.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0IPL.class.getName();
        return c0ipl;
    }

    public C0IPK(Context context, List list, boolean z) {
        this.LL = context;
        this.LLILLJJLI = z;
        this.LLILLL = new ArrayList(list);
    }
}
