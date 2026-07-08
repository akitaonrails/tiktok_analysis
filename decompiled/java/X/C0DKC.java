package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DKC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKC extends AbstractC21673619ry<C0DKD> {
    public final Context LL;
    public final Function1<String, Unit> LLILLJJLI;
    public List<Pair<Integer, Boolean>> LLILLL;
    public final List<String> LLILZ;
    public long LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public C0DKC(Context context, AwS588S0100000_9 awS588S0100000_9) {
        this.LL = context;
        this.LLILLJJLI = awS588S0100000_9;
        Boolean bool = Boolean.FALSE;
        this.LLILLL = C1697810uHb.LJIIJJI(new Pair(2131828531, bool), new Pair(2131828532, bool), new Pair(2131828533, bool), new Pair(2131828534, bool));
        this.LLILZ = C1697810uHb.LJIIJJI("This is harmful/unsafe", "This isn't helpful", "This isn't true", "Other");
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String string;
        final C0DKD c0dkd = (C0DKD) viewHolder;
        Context context = this.LL;
        if (context != null) {
            string = context.getString(((Number) ((Pair) ListProtector.get(this.LLILLL, i)).getFirst()).intValue());
        } else {
            string = null;
        }
        final String str = (String) ListProtector.get(this.LLILZ, i);
        Object second = ((Pair) ListProtector.get(this.LLILLL, i)).getSecond();
        TuxTextView tuxTextView = c0dkd.LLILLL;
        tuxTextView.setText(string);
        tuxTextView.setSelected(Intrinsics.LJFF(second, Boolean.TRUE));
        C786410Ut5.h9(c0dkd.LLILLL, new View.OnClickListener() { // from class: X.0DKE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c0dkd.LLILLJJLI.invoke(Integer.valueOf(i), str);
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0DKD c0dkd = new C0DKD(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f0b, viewGroup, false), new AwS617S0100000_3(this, 0));
        try {
            View view = c0dkd.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dkd.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dkd.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DKD.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dkd.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dkd.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DKD.class.getName();
        return c0dkd;
    }
}
