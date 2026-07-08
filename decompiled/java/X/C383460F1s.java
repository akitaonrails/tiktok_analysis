package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383460F1s extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final TuxTextView LLILLJJLI;
    public List<? extends C0F26> LLILLL;
    public C383400F1m LLILZ;
    public final C01GW LLILZIL;
    public RecyclerView LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        EnumC383510F1x enumC383510F1xLIZ;
        C0F26 c0f26 = (C0F26) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (c0f26 != null) {
            enumC383510F1xLIZ = c0f26.LIZ();
        } else {
            enumC383510F1xLIZ = null;
        }
        if (enumC383510F1xLIZ == EnumC383510F1x.COLOR) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILZLL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLILZLL = null;
    }

    public C383460F1s(Context context, TuxTextView tuxTextView) {
        ArrayList arrayList = new ArrayList();
        this.LL = context;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = arrayList;
        this.LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 563));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r13, int r14) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C383460F1s.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c383470F1t;
        if (i == 1) {
            c383470F1t = new C383330F1f(new RecyclerView(viewGroup.getContext()));
        } else {
            c383470F1t = new C383470F1t((C1361400lX0) this.LLILZIL.getValue(), this.LLILZLL, C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.bz3, viewGroup, false), this.LLILLJJLI);
        }
        try {
            View view = c383470F1t.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c383470F1t.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c383470F1t.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c383470F1t.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c383470F1t.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c383470F1t.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c383470F1t.getClass().getName();
        return c383470F1t;
    }
}
