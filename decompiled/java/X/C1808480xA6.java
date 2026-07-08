package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0xA6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808480xA6 extends AbstractC21673619ry<C1835840xsE> {
    public final List<C1808830xAf> LL = new ArrayList();

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    public final C1808830xAf LLLFZ(int i) {
        if (i >= 0 && i < ((ArrayList) this.LL).size()) {
            return (C1808830xAf) ListProtector.get(this.LL, i);
        }
        return null;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        float fFloatValue;
        C1835840xsE c1835840xsE = (C1835840xsE) viewHolder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder, position: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("AutoPostLivingUI", C2188811AlT.LIZIZ(sbLIZ));
        C1808830xAf c1808830xAf = (C1808830xAf) ListProtector.get(this.LL, i);
        C1819620xS4.LIZ().setUrl(c1808830xAf.LIZJ).LJJI(c1835840xsE.LL);
        c1835840xsE.LLILZ.setText(c1808830xAf.LIZ);
        TuxTextView tuxTextView = c1835840xsE.LLILZIL;
        Float f = c1808830xAf.LJFF;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        tuxTextView.setText(C1246020iWu.LIZIZ((long) fFloatValue));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C20441214yg.LIZIZ("AutoPostLivingUI", "onCreateViewHolder");
        C1835840xsE c1835840xsE = new C1835840xsE(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.de9, viewGroup, false));
        try {
            View view = c1835840xsE.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1835840xsE.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1835840xsE.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1835840xsE.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1835840xsE.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1835840xsE.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1835840xsE.class.getName();
        return c1835840xsE;
    }
}
