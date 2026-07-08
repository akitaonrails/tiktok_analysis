package X;

import Y.ACListenerS109S0200000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Eow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376160Eow extends AbstractC21673619ry<C376170Eox> {
    public final Context LL;
    public final ArrayList<C376180Eoy> LLILLJJLI = new ArrayList<>();
    public InterfaceC376240Ep4 LLILLL;
    public EnumC375190EnN LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C376160Eow(Context context) {
        this.LL = context;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C376170Eox c376170Eox = (C376170Eox) viewHolder;
        C376180Eoy c376180Eoy = (C376180Eoy) ListProtector.get(this.LLILLJJLI, i);
        TuxTextView tuxTextView = c376170Eox.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(c376180Eoy.LIZ);
        }
        C375110EnF c375110EnF = new C375110EnF();
        EnumC375190EnN enumC375190EnN = c376180Eoy.LIZIZ;
        c375110EnF.LIZJ = enumC375190EnN;
        if (this.LLILZ == enumC375190EnN) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, this.LL);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (numValueOf != null) {
                    numValueOf.intValue();
                    c375110EnF.LIZ.setColor(numValueOf.intValue());
                }
                TuxTextView tuxTextView2 = c376170Eox.LL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColor(iIntValue);
                }
            }
        } else {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.LL);
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                if (numValueOf2 != null) {
                    numValueOf2.intValue();
                    c375110EnF.LIZ.setColor(numValueOf2.intValue());
                }
                TuxTextView tuxTextView3 = c376170Eox.LL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setTextColor(iIntValue2);
                }
            }
        }
        AppCompatImageView appCompatImageView = c376170Eox.LLILLJJLI;
        if (appCompatImageView != null) {
            appCompatImageView.setImageDrawable(c375110EnF);
        }
        C786410Ut5.I7(new ACListenerS109S0200000_5(this, c376180Eoy, 22), c376170Eox.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c0i, viewGroup, false);
        C786410Ut5.W5(viewTd, new RecyclerView.LayoutParams((C497820Jfg.LIZIZ(viewGroup.getContext()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32))) / 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(51))));
        C376170Eox c376170Eox = new C376170Eox(viewTd);
        try {
            View view = c376170Eox.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c376170Eox.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c376170Eox.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C376170Eox.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c376170Eox.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c376170Eox.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C376170Eox.class.getName();
        return c376170Eox;
    }
}
