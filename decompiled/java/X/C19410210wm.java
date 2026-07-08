package X;

import Y.ACListenerS53S0201000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.10wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19410210wm extends C19409710wh<Option> {
    public final Context LLILZIL;
    public final ArrayList<Option> LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    public C19410210wm(Context context, ArrayList<Option> arrayList) {
        super(context, arrayList);
        this.LLILZIL = context;
        this.LLILZLL = arrayList;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (!(viewHolder instanceof C19410310wn)) {
            return;
        }
        C786410Ut5.I7(new ACListenerS53S0201000_29(this, i, viewHolder, 10), viewHolder.itemView);
        C19410310wn c19410310wn = (C19410310wn) viewHolder;
        c19410310wn.LL.setText(((Option) ListProtector.get(this.LLILZLL, i)).name);
        if (this.LL == i) {
            c19410310wn.LLILLJJLI.setChecked(true);
            c19410310wn.LLILLL.setChecked(true);
            return;
        }
        c19410310wn.LLILLJJLI.setChecked(false);
        c19410310wn.LLILLL.setChecked(false);
        if (this.LLILLJJLI) {
            C786410Ut5.LLLLZ(c19410310wn.LLILLJJLI, 0);
            C786410Ut5.LLLLZ(c19410310wn.LLILLL, 8);
        } else {
            C786410Ut5.LLLLZ(c19410310wn.LLILLJJLI, 8);
            C786410Ut5.LLLLZ(c19410310wn.LLILLL, 0);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = C19410110wl.LIZ[this.LLILLL.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                i2 = R.layout.b8g;
            } else {
                i2 = R.layout.b8f;
            }
        } else {
            i2 = R.layout.b8e;
        }
        C19410310wn c19410310wn = new C19410310wn(C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), i2, viewGroup, false));
        try {
            View view = c19410310wn.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19410310wn.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19410310wn.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19410310wn.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19410310wn.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19410310wn.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19410310wn.class.getName();
        return c19410310wn;
    }
}
