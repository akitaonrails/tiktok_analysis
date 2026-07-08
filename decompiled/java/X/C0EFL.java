package X;

import Y.ACListenerS109S0200000_5;
import Y.ATListenerS334S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EFL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EFL extends AbstractC21673619ry<C0EFK> {
    public final List<C352950Dsb> LL = new ArrayList();
    public C0EFM LLILLJJLI;
    public NLETrackSlot LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0EFK c0efk = (C0EFK) viewHolder;
        C352950Dsb c352950Dsb = (C352950Dsb) ListProtector.get(this.LL, i);
        c0efk.LLJILJILJ = c352950Dsb;
        c0efk.LLILZIL.setText(c352950Dsb.LIZ);
        c0efk.L5(c352950Dsb);
        c0efk.I5(c352950Dsb);
        c0efk.LLJILJILJ = c352950Dsb;
        c0efk.LLILZ.setText(String.valueOf(c352950Dsb.LIZLLL));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd;
        if (C357780E0y.LIZ()) {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c15, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c14, viewGroup, false);
        }
        C0EFK c0efk = new C0EFK(viewTd, new AwS619S0100000_5(this, 0));
        C786410Ut5.I7(new ACListenerS109S0200000_5(this, c0efk, 0), viewTd);
        c0efk.LLIZLLLIL.setOnTouchListener(new ATListenerS334S0200000_5(this, c0efk, 0));
        try {
            View view = c0efk.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0efk.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0efk.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0EFK.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0efk.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0efk.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0EFK.class.getName();
        return c0efk;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C0EFK c0efk = (C0EFK) viewHolder;
        if (list.isEmpty()) {
            C352950Dsb c352950Dsb = (C352950Dsb) ListProtector.get(this.LL, i);
            c0efk.LLJILJILJ = c352950Dsb;
            c0efk.LLILZIL.setText(c352950Dsb.LIZ);
            c0efk.L5(c352950Dsb);
            c0efk.I5(c352950Dsb);
            c0efk.LLJILJILJ = c352950Dsb;
            c0efk.LLILZ.setText(String.valueOf(c352950Dsb.LIZLLL));
            return;
        }
        C352950Dsb c352950Dsb2 = (C352950Dsb) C13LP.LJJJLZIJ(i, this.LL);
        if (c352950Dsb2 == null) {
            return;
        }
        for (Object obj : list) {
            if (obj instanceof C0EFQ) {
                int i2 = C0EFN.LIZ[((C0EFQ) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c0efk.LLJILJILJ = c352950Dsb2;
                            c0efk.LLILZ.setText(String.valueOf(c352950Dsb2.LIZLLL));
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        c0efk.I5(c352950Dsb2);
                    }
                } else {
                    c0efk.L5(c352950Dsb2);
                }
            }
        }
    }
}
