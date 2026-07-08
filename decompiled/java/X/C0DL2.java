package X;

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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DL2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DL2 extends AbstractC21673619ry<C0DL3> {
    public final Context LL;
    public final List<C0DL5> LLILLJJLI;
    public final Function1<String, Unit> LLILLL;
    public List<Pair<Integer, Boolean>> LLILZ;
    public final List<String> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        String string;
        final C0DL3 c0dl3 = (C0DL3) viewHolder;
        Context context = this.LL;
        if (context != null) {
            string = context.getString(((Number) ((Pair) ListProtector.get(this.LLILZ, i)).getFirst()).intValue());
        } else {
            string = null;
        }
        final String str = (String) ListProtector.get(this.LLILZIL, i);
        Object second = ((Pair) ListProtector.get(this.LLILZ, i)).getSecond();
        TuxTextView tuxTextView = c0dl3.LLILLL;
        Drawable drawableLIZ = C14MI.LIZ(c0dl3.LL.getContext(), R.drawable.ded);
        if (drawableLIZ != null) {
            tuxTextView.setBackground(drawableLIZ);
        }
        tuxTextView.setText(string);
        tuxTextView.setSelected(Intrinsics.LJFF(second, Boolean.TRUE));
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0DL4
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view) {
                if (view != null) {
                    c0dl3.LLILLJJLI.invoke(Integer.valueOf(i), str);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1000L);
            }
        }, c0dl3.LLILLL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0DL3 c0dl3 = new C0DL3(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.foo, viewGroup, false), new AwS617S0100000_3(this, 27));
        try {
            View view = c0dl3.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0dl3.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0dl3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0DL3.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0dl3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0dl3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0DL3.class.getName();
        return c0dl3;
    }

    public C0DL2(Context context, List list, AwS591S0100000_12 awS591S0100000_12) {
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = awS591S0100000_12;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new Pair(Integer.valueOf(((C0DL5) it2.next()).choiceTitle), Boolean.FALSE));
        }
        this.LLILZ = arrayList;
        List<C0DL5> list2 = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<C0DL5> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().choiceMob);
        }
        this.LLILZIL = arrayList2;
    }
}
