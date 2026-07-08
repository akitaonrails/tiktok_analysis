package X;

import Y.ACListenerS53S0201000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.10wd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19409310wd extends C19409710wh<Option> {
    public final Context LLILZIL;
    public final ArrayList<Option> LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZLL.size();
    }

    public C19409310wd(Context context, ArrayList<Option> arrayList) {
        super(context, arrayList);
        this.LLILZIL = context;
        this.LLILZLL = arrayList;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        if (!(viewHolder instanceof C19409410we)) {
            return;
        }
        if (this.LLILLJJLI) {
            C786410Ut5.I7(new ACListenerS53S0201000_29(this, i, viewHolder, 8), viewHolder.itemView);
        }
        C19409410we c19409410we = (C19409410we) viewHolder;
        c19409410we.LL.setText(((Option) ListProtector.get(this.LLILZLL, i)).name);
        TuxTextView tuxTextView = c19409410we.LL;
        if (this.LL == i) {
            z = true;
        } else {
            z = false;
        }
        tuxTextView.setSelected(z);
        C20285114Yv c20285114Yv = C20285114Yv.LIZ;
        EnumC19410610wq enumC19410610wq = this.LLILLL;
        c20285114Yv.getClass();
        if (C20285114Yv.LIZLLL(enumC19410610wq)) {
            if (c19409410we.LL.isSelected()) {
                c19409410we.LL.setTextColorRes(R.attr.ee);
            } else {
                c19409410we.LL.setTextColorRes(R.attr.eg);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = C19410010wk.LIZ[this.LLILLL.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                i2 = R.layout.b8a;
            } else {
                i2 = R.layout.b89;
            }
        } else {
            i2 = R.layout.b8_;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZIL), i2, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.zzf);
        if (C0HCN.LIZ() && this.LLILLL == EnumC19410610wq.BACKGROUND) {
            viewFindViewById.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
        }
        C0HCN.LIZ();
        C19409410we c19409410we = new C19409410we(viewTd);
        try {
            View view = c19409410we.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19409410we.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19409410we.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19409410we.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19409410we.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19409410we.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19409410we.class.getName();
        return c19409410we;
    }
}
