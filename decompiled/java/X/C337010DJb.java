package X;

import Y.ACListenerS108S0200000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C337010DJb extends AbstractC21673619ry<C337020DJc> {
    public final Context LL;
    public final List<String> LLILLJJLI;
    public int LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<String> list = this.LLILLJJLI;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C337010DJb(Context context, List<String> list) {
        this.LL = context;
        this.LLILLJJLI = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Drawable background;
        TuxTextView tuxTextView;
        C337020DJc c337020DJc = (C337020DJc) viewHolder;
        List<String> list = this.LLILLJJLI;
        if (list != null && i >= 0 && i < list.size() && (tuxTextView = c337020DJc.LL) != null) {
            tuxTextView.setText((CharSequence) ListProtector.get(list, i));
        }
        if (i == this.LLILLL) {
            TuxTextView tuxTextView2 = c337020DJc.LL;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColorRes(R.attr.a1h);
            }
            TuxTextView tuxTextView3 = c337020DJc.LL;
            if (tuxTextView3 != null) {
                tuxTextView3.setBackgroundResource(R.drawable.d74);
            }
            TuxTextView tuxTextView4 = c337020DJc.LL;
            if (tuxTextView4 != null && (background = tuxTextView4.getBackground()) != null) {
                background.setAlpha(20);
            }
        } else {
            TuxTextView tuxTextView5 = c337020DJc.LL;
            if (tuxTextView5 != null) {
                tuxTextView5.setTextColorRes(R.attr.a1k);
            }
            TuxTextView tuxTextView6 = c337020DJc.LL;
            if (tuxTextView6 != null) {
                tuxTextView6.setBackgroundResource(R.drawable.d73);
            }
        }
        TuxTextView tuxTextView7 = c337020DJc.LL;
        if (tuxTextView7 != null) {
            C786410Ut5.h9(tuxTextView7, new ACListenerS108S0200000_4(c337020DJc, this, 11));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C337020DJc c337020DJc = new C337020DJc(C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.i9n, viewGroup, false));
        try {
            View view = c337020DJc.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c337020DJc.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c337020DJc.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C337020DJc.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c337020DJc.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c337020DJc.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C337020DJc.class.getName();
        return c337020DJc;
    }
}
